package servises;

import java.util.ArrayList;

import models.FlyInfoDirect;
import models.FlyInfoWithConnection;
import models.DTO.CheapestFlysDTO;
import models.DTO.ExtractInfoDTO;

public class FindCheapest {
	public void cheapestFlights(ExtractInfoDTO info) {
		ArrayList<String> cheapestA=new ArrayList<String> ();
		ArrayList<String> cheapestB=new ArrayList<String> ();
		
		if (info.isSuccess) {
			ArrayList<FlyInfoDirect> directAList = info.directAList;
			ArrayList<FlyInfoDirect> directBList = info.directBList;
			ArrayList<FlyInfoWithConnection> withConectionAList = info.withConectionAList;
			ArrayList<FlyInfoWithConnection> withConectionBList = info.withConectionBList;

			double forward = 1000000;
			double back = 1000000;
			for (int i = 0; i < directAList.size(); i++) {
				double value = Double.parseDouble(directAList.get(i).price);
				if (forward > value) {
					forward = value;
					}
			}
			for (int i = 0; i < withConectionAList.size(); i++) {
				double value = Double.parseDouble(withConectionAList.get(i).price);
				if (forward > value) {
					forward = value;
				}
			}		
			for (int i = 0; i < directAList.size(); i++) {
				double value = Double.parseDouble(directAList.get(i).price);
				StringBuilder direct1 = new StringBuilder();
				if (forward == value) {
					direct1.append("departure airport: ").append(directAList.get(i).aLocation)
					.append(" arrival airport: ").append(directAList.get(i).bLocation)
					.append( " departure time: ").append(directAList.get(i).date1)
					.append(" arrival time: ").append(directAList.get(i).date2)
					.append(" cheapest price: ").append(directAList.get(i).price)
					.append(" taxes: " ).append(directAList.get(i).tax);
					cheapestA.add(direct1.toString());
				}
			}
			for (int i = 0; i < withConectionAList.size(); i++) {
				double value = Double.parseDouble(withConectionAList.get(i).price);
				StringBuilder withConection1 = new StringBuilder();
				if (forward == value) {
					withConection1.append("departure airport: ").append(withConectionAList.get(i).aLocation1)
					.append(" arrival airport: ").append(withConectionAList.get(i).bLocation1)
					.append( " departure time: ").append(withConectionAList.get(i).date1)
					.append(" arrival time: ").append(withConectionAList.get(i).date2)
					.append("departure airport: ").append(withConectionAList.get(i).aLocation2)
					.append(" arrival airport: ").append(withConectionAList.get(i).bLocation2)
					.append( " departure time: ").append(withConectionAList.get(i).date3)
					.append(" arrival time: ").append(withConectionAList.get(i).date4)		
					.append(" cheapest price: ").append(withConectionAList.get(i).price)
					.append(" taxes: " ).append(withConectionAList.get(i).tax);
					cheapestA.add(withConection1.toString());
				}
			}
			for (int i = 0; i < directBList.size(); i++) {
				double value = Double.parseDouble(directBList.get(i).price);
				if (back > value) {
					back = value;
				}
			}
			for (int i = 0; i < withConectionBList.size(); i++) {
				double value = Double.parseDouble(withConectionBList.get(i).price);
				if (back > value) {
					back = value;
				}
			}
			for (int i = 0; i < directBList.size(); i++) {
				double value = Double.parseDouble(directBList.get(i).price);
				StringBuilder direct2 = new StringBuilder();
				if (back == value) {
					direct2.append("departure airport: ").append(directBList.get(i).aLocation)
					.append(" arrival airport: ").append(directBList.get(i).bLocation)
					.append( " departure time: ").append(directBList.get(i).date1)
					.append(" arrival time: ").append(directBList.get(i).date2)
					.append(" cheapest price: ").append(directBList.get(i).price)
					.append(" taxes: " ).append(directBList.get(i).tax);
					cheapestB.add(direct2.toString());
				}
			}
			for (int i = 0; i < withConectionBList.size(); i++) {
				double value = Double.parseDouble(withConectionBList.get(i).price);
				StringBuilder withConection2 = new StringBuilder();
				if (back == value) {
					withConection2.append("departure airport: ").append(withConectionBList.get(i).aLocation1)
					.append(" arrival airport: ").append(withConectionBList.get(i).bLocation1)
					.append( " departure time: ").append(withConectionBList.get(i).date1)
					.append(" arrival time: ").append(withConectionBList.get(i).date2)
					.append("departure airport: ").append(withConectionBList.get(i).aLocation2)
					.append(" arrival airport: ").append(withConectionBList.get(i).bLocation2)
					.append( " departure time: ").append(withConectionBList.get(i).date3)
					.append(" arrival time: ").append(withConectionBList.get(i).date4)		
					.append(" cheapest price: ").append(withConectionBList.get(i).price)
					.append(" taxes: " ).append(withConectionBList.get(i).tax);
					cheapestB.add(withConection2.toString());
				}
			}
			
			cheapestA=removeDuplicates(cheapestA);
			cheapestB=removeDuplicates(cheapestB);
			for(int i=0;i<cheapestA.size();i++) {
				System.out.println(cheapestA.get(i));
			}
			for(int i=0;i<cheapestB.size();i++) {
				System.out.println(cheapestB.get(i));
			}
			

		}

	}
	public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) {
		ArrayList<T> newList = new ArrayList<T>();
		for (T element : list) {
			if (!newList.contains(element)) {
				newList.add(element);
			}
		}
		return newList;
	}

}
