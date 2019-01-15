package servises;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import models.ConnectedFyghtDates;
import models.DatesModel;
import models.FlyInfoDirect;
import models.FlyInfoWithConnection;
import models.PriceModel;
import models.TaxModel;
import models.DTO.ExtractInfoDTO;

public class ExtractData {
	// Default parameters

//	public static void main(String[] args) {
//		String airoportA = "ARN";
//		String airoportB = "LHR";
//		String airoportConnect = "OSL";
//		String travelClass = "ECONBG";
//		extract("tuscias", airoportA, airoportB, airoportConnect,travelClass);
//	}

	public static ExtractInfoDTO extract(String response, String from, String to, String connect,String travelClass) {
		try {
			File f = new File("OutFile.txt");
			// Can`t get response so extracted data from FILE
			String location = f.getAbsolutePath().replaceAll("OutFile.txt", "sorseData.txt");
			String sourceCode = new String(Files.readAllBytes(Paths.get(location)), StandardCharsets.UTF_8);
			String el = "(?m)^[ \t]*\r?\n";
			String nl = "\\r\\n";
			String spaces = " +";
			String clean = sourceCode.replaceAll(el, "").replaceAll(spaces, " ").replaceAll(nl, " ");

			String dateSegment = "(var\\ssegment)(.+?(push))";
			Pattern datesPatern = Pattern.compile(dateSegment);
			Matcher mDate = datesPatern.matcher(clean);
			ArrayList<DatesModel> allDates = new ArrayList<DatesModel>();
			while (mDate.find()) {
				DatesModel dates = new DatesModel();
				String fulldatesEl = mDate.group().replaceAll("var segment = new Object\\(\\)\\;", " ")
						.replaceAll("recommendation.segments.push", "").replaceAll("segment.", "").replaceAll("	", "")
						.replaceAll("\"", "");
				String[] fulldatesElSplited = fulldatesEl.split(";");
				dates.bookingClass = fulldatesElSplited[0].replaceAll("  bookingClass = ", "");
				dates.flightId = fulldatesElSplited[1].replaceAll(" flightId = ", "");
				dates.airlineCode = fulldatesElSplited[2].replaceAll(" airlineCode = ", "");
				dates.bLocation = fulldatesElSplited[3].replaceAll(" bLocation = ", "");
				dates.eLocation = fulldatesElSplited[4].replaceAll(" eLocation = ", "");
				dates.bDate = fulldatesElSplited[5].replaceAll(" bDate = ", "");
				dates.eDate = fulldatesElSplited[6].replaceAll(" eDate =", "");
				allDates.add(dates);
			}
			ArrayList<DatesModel> directF = new ArrayList<DatesModel>();
			ArrayList<DatesModel> directB = new ArrayList<DatesModel>();
			ArrayList<DatesModel> connectedF = new ArrayList<DatesModel>();
			ArrayList<DatesModel> connectedB = new ArrayList<DatesModel>();
			for (int i = 0; i < allDates.size(); i++) {
				if (allDates.get(i).eLocation.equals(from) && allDates.get(i).bLocation.equals(to)) {
					directF.add(allDates.get(i));
				}
				if (allDates.get(i).eLocation.equals(to) && allDates.get(i).bLocation.equals(from)) {
					directB.add(allDates.get(i));
				}
				if (allDates.get(i).bLocation.equals(from) && allDates.get(i).eLocation.equals(connect)
						|| allDates.get(i).bLocation.equals(connect) && allDates.get(i).eLocation.equals(to)) {
					connectedF.add(allDates.get(i));
				}
				if (allDates.get(i).bLocation.equals(to) && allDates.get(i).eLocation.equals(connect)
						|| allDates.get(i).bLocation.equals(connect) && allDates.get(i).eLocation.equals(from)) {
					connectedB.add(allDates.get(i));
				}
			}
			ArrayList<ConnectedFyghtDates> connectedFDates = new ArrayList<ConnectedFyghtDates>();
			for (int i = 0; i < connectedF.size(); i++) {
				for (int j = 0; j < connectedF.size(); j++) {

					if (connectedF.get(i).bookingClass.equals(connectedF.get(j).bookingClass)
							&& connectedF.get(i).flightId.equals(connectedF.get(j).flightId)
							&& connectedF.get(i).eLocation.equals(connect)
							&& connectedF.get(j).bLocation.equals(connect)) {
						ConnectedFyghtDates cfd = new ConnectedFyghtDates();
						cfd.el1 = connectedF.get(i);
						cfd.el2 = connectedF.get(j);
						connectedFDates.add(cfd);
					}
				}
			}
			ArrayList<ConnectedFyghtDates> connectedBDates = new ArrayList<ConnectedFyghtDates>();
			for (int i = 0; i < connectedB.size(); i++) {
				for (int j = 0; j < connectedB.size(); j++) {

					if (connectedB.get(i).bookingClass.equals(connectedB.get(j).bookingClass)
							&& connectedB.get(i).flightId.equals(connectedB.get(j).flightId)
							&& connectedB.get(i).eLocation.equals(connect)
							&& connectedB.get(j).bLocation.equals(connect)) {
						ConnectedFyghtDates cfd = new ConnectedFyghtDates();
						cfd.el1 = connectedB.get(i);
						cfd.el2 = connectedB.get(j);
						connectedBDates.add(cfd);
					}
				}
			}
			String priceSegment = "(\\$\\('#price_)(.+?(recoHidden))(.+?(\\);))";
			Pattern pricePatern = Pattern.compile(priceSegment);
			ArrayList<PriceModel> allPrices = new ArrayList<PriceModel>();
			Matcher mPrice = pricePatern.matcher(clean);
			while (mPrice.find()) {
				PriceModel price = new PriceModel();
				price.price = mPrice.group(2).split(";")[0].split("','")[1].replaceAll("'\\)", "");
				price.code = mPrice.group(4).replaceAll("\\);", "");
				String[] codeSplited = price.code.split("_");
				price.direction = codeSplited[1];
				price.flightId = codeSplited[2];
				price.flightClass = codeSplited[3].split("'")[0];
				allPrices.add(price);
			}

			String taxSegment = "(recommendation\\.fareFamily)(.+?(tax))(.+?(recommendation))(.+?(;))";
			Pattern taxPatern = Pattern.compile(taxSegment);
			ArrayList<TaxModel> allTax = new ArrayList<TaxModel>();
			Matcher mTax = taxPatern.matcher(clean);
			while (mTax.find()) {
				TaxModel tax = new TaxModel();
				tax.map = mTax.group(6).replaceAll("\\);", "").replaceAll(", ", "").replaceAll("\"\"", " ")
						.replaceAll("\"", "");
				String[] fullTaxEl = mTax.group(4).split("\\}")[0].replaceAll("':'", "").split(",");
				tax.tax = fullTaxEl[0].replaceAll("'", "");
				tax.priceWithoutTax = fullTaxEl[1].replaceAll(" 'priceWithoutTax", "").replaceAll("'", "");
				tax.flightClass = mTax.group(2).split("'")[1];
				tax.price = mTax.group(2).split("'")[7];
				allTax.add(tax);
			}

			ArrayList<FlyInfoWithConnection> flyWithConnectionF = new ArrayList<FlyInfoWithConnection>();
			ArrayList<FlyInfoWithConnection> flyWithConnectionB = new ArrayList<FlyInfoWithConnection>();
			ArrayList<FlyInfoDirect> flydirectF = new ArrayList<FlyInfoDirect>();
			ArrayList<FlyInfoDirect> flydirectB = new ArrayList<FlyInfoDirect>();
			
			for (int p = 0; p < allPrices.size(); p++) {			
				for (int i = 0; i < connectedFDates.size(); i++) {
					if (allPrices.get(p).direction.equals("0")
							&& connectedFDates.get(i).el1.flightId.equals(allPrices.get(p).flightId)&&allPrices.get(p).flightClass.equals(travelClass)) {
						FlyInfoWithConnection fwc = new FlyInfoWithConnection();
						fwc.airlineCode1 = connectedFDates.get(i).el1.airlineCode;
						fwc.aLocation1 = connectedFDates.get(i).el1.bLocation;
						fwc.aLocation2 = connectedFDates.get(i).el1.eLocation;
						fwc.date1 = connectedFDates.get(i).el1.bDate;
						fwc.date2 = connectedFDates.get(i).el1.eDate;
						fwc.airlineCode2 = connectedFDates.get(i).el2.airlineCode;
						fwc.bLocation1 = connectedFDates.get(i).el2.bLocation;
						fwc.bLocation2 = connectedFDates.get(i).el2.eLocation;
						fwc.date3 = connectedFDates.get(i).el2.bDate;
						fwc.date4 = connectedFDates.get(i).el2.eDate;
						fwc.price = allPrices.get(p).price;				
						for(int t=0;t<allTax.size();t++) {
							if(fwc.price.equals(allTax.get(t).price)){
								fwc.tax=allTax.get(t).tax;
							}
						}
						flyWithConnectionF.add(fwc);
					}
					for (int b = 0; b < connectedBDates.size(); b++) {
						if (allPrices.get(p).direction.equals("1")
								&& connectedBDates.get(b).el1.flightId.equals(allPrices.get(p).flightId)&&allPrices.get(p).flightClass.equals(travelClass)) {
							FlyInfoWithConnection fwc = new FlyInfoWithConnection();
							fwc.airlineCode1 = connectedBDates.get(b).el1.airlineCode;
							fwc.aLocation1 = connectedBDates.get(b).el1.bLocation;
							fwc.aLocation2 = connectedBDates.get(b).el1.eLocation;
							fwc.date1 = connectedBDates.get(b).el1.bDate;
							fwc.date2 = connectedBDates.get(b).el1.eDate;
							fwc.airlineCode2 = connectedBDates.get(b).el2.airlineCode;
							fwc.bLocation1 = connectedBDates.get(b).el2.bLocation;
							fwc.bLocation2 = connectedBDates.get(b).el2.eLocation;
							fwc.date3 = connectedBDates.get(b).el2.bDate;
							fwc.date4 = connectedBDates.get(b).el2.eDate;
							fwc.price = allPrices.get(p).price;
							for(int t=0;t<allTax.size();t++) {
								if(fwc.price.equals(allTax.get(t).price)){
									fwc.tax=allTax.get(t).tax;
								}
							}
							flyWithConnectionB.add(fwc);
						}
						
					}
					for (int j = 0; j < directF.size(); j++) {
						if (allPrices.get(p).direction.equals("0")
								&& directF.get(j).flightId.equals(allPrices.get(p).flightId)&&allPrices.get(p).flightClass.equals(travelClass)) {
							FlyInfoDirect df = new FlyInfoDirect();
							df.airlineCode = directF.get(j).airlineCode;
							df.aLocation = directF.get(j).bLocation;
							df.bLocation = directF.get(j).eLocation;
							df.date1 = directF.get(j).bDate;
							df.date2 = directF.get(j).eDate;
							df.price = allPrices.get(p).price;
							for(int t=0;t<allTax.size();t++) {
								if(df.price.equals(allTax.get(t).price)){
									df.tax=allTax.get(t).tax;
								}
							}
							flydirectF.add(df);
						}
					}
					for (int z = 0; z < directB.size(); z++) {
						if (allPrices.get(p).direction.equals("1")
								&& directB.get(z).flightId.equals(allPrices.get(p).flightId)&&allPrices.get(p).flightClass.equals(travelClass)) {
							FlyInfoDirect df = new FlyInfoDirect();
							df.airlineCode = directB.get(z).airlineCode;
							df.aLocation = directB.get(z).bLocation;
							df.bLocation = directB.get(z).eLocation;
							df.date1 = directB.get(z).bDate;
							df.date2 = directB.get(z).eDate;
							df.price = allPrices.get(p).price;
							for(int t=0;t<allTax.size();t++) {
								if(df.price.equals(allTax.get(t).price)){
									df.tax=allTax.get(t).tax;
								}
							}
							flydirectB.add(df);
						}
					}
				}
				
			}
			ExtractInfoDTO dto=new ExtractInfoDTO();
			dto.isSuccess=true;
			dto.directAList=flydirectF;
			dto.directBList=flydirectB;
			dto.withConectionAList=flyWithConnectionF;
			dto.withConectionBList=flyWithConnectionB;
			return dto;

		}
		catch (IOException e) {
			e.printStackTrace();
		}
		ExtractInfoDTO dto=new ExtractInfoDTO();
		dto.isSuccess=false;
		return dto;

	}
}