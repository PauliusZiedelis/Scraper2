package servises;

import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WebKitFormBoundarConstruction {

	public String constructwebKit(ArrayList<Element> elementsFromHomePage) {

		String c1 = "ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$Searchbtn$ButtonLink";
		String c11 = "SE,GB";
		String wk = "------WebKitFormBoundaryQbG4INA9SYRbahBP";
		String cd = "Content-Disposition: form-data; name=\"";
		String empty = "";
		String nl = "\n";
		String qm="\"";
		String t = "true";
		String f = "False";
		String calendar = "2019-01-01";
		String calendar2 = "2019-01-01";
		String flexDateSelector = "Show selected dates";
		// in mine case all are constants, but this is selection of home page
		// destinations, dates of flying, adults number ....
		String adults = "1";
		String child = "0";
		String infant = "0";
		String fareType = "A";
		String airport1 = "ARN";
		String airportFull1 = "Stockholm, Sweden - Arlanda (ARN)";
		String airport2 = "LHR";
		String airportFull2 = "London, United Kingdom - Heathrow (LHR)";
		String date1 = "2019-02-04";
		String date2 = "2019-02-10";
		String tripTipe = "roundtrip";
		String calDate = "Sun Jan 13 2019 00:00:00 GMT+0200 (Rytų Europos žiemos laikas),Sun Jan 13 2019 00:00:00 GMT+0200 (Rytų Europos žiemos laikas),Tue Jan 07 2020 00:00:00 GMT+0200 (Rytų Europos žiemos laikas)";

		Element el1 = new Element("__EVENTTARGET");
		Element el2 = new Element("__EVENTARGUMENT");
		Element el3 = new Element("ctl00$FullRegion$TopRegion$_siteHeader$hdnProfilingConsent");
		Element el4 = new Element("ctl00$FullRegion$TopRegion$_siteHeader$hdnTermsConsent");
		Element el5 = new Element("ctl00$FullRegion$TopRegion$_siteHeader$_ssoLogin$MainFormBorderPanel$uid");
		Element el6 = new Element("ctl00$FullRegion$TopRegion$_siteHeader$_ssoLogin$MainFormBorderPanel$pwd");
		Element el7 = new Element("ctl00$FullRegion$TopRegion$_siteHeader$_ssoLogin$MainFormBorderPanel$hdnShowModal");
		Element el8 = new Element("ctl00$FullRegion$TopRegion$_siteHeader$_ssoLogin$MainFormBorderPanel$hdnIsEb0");
		Element el9 = new Element(
				"ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$ceptravelTypeSelector$TripTypeSelector");
		Element el10 = new Element(
				"ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$predictiveSearch$hiddenIntercont");
		Element el11 = new Element(
				"ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$predictiveSearch$hiddenDomestic");
		Element el12 = new Element(
				"ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$predictiveSearch$hiddenFareType");
		Element el13 = new Element(
				"ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$predictiveSearch$txtFrom");
		Element el14 = new Element(
				"ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$predictiveSearch$hiddenFrom");
		Element el15 = new Element(
				"ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$predictiveSearch$txtTo");
		Element el16 = new Element(
				"ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$predictiveSearch$hiddenTo");
		Element el17 = new Element(
				"ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$predictiveSearch$txtFromTOJ");
		Element el18 = new Element(
				"ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$predictiveSearch$hiddenFromTOJ");
		Element el19 = new Element(
				"ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$cepCalendar$hiddenOutbound");
		Element el20 = new Element(
				"ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$cepCalendar$hiddenReturn");
		Element el21 = new Element(
				"ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$cepCalendar$hdnSelectedOutboundMonth");
		Element el22 = new Element(
				"ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$cepCalendar$hdnSelectedReturnMonth");
		Element el23 = new Element(
				"ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$cepCalendar$hiddenReturnCalVisible");
		Element el24 = new Element(
				"ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$cepCalendar$hiddenStoreCalDates");
		Element el25 = new Element(
				"ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$cepCalendar$selectOutbound");
		Element el26 = new Element(
				"ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$cepCalendar$selectReturn");
		Element el27 = new Element(
				"ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$FlexDateSelector");
		Element el28 = new Element(
				"ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$cepPassengerTypes$passengerTypeAdult");
		Element el29 = new Element(
				"ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$cepPassengerTypes$passengerTypeChild211");
		Element el30 = new Element(
				"ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$cepPassengerTypes$passengerTypeInfant");
		Element el31 = new Element(
				"ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$cepNdpFareTypeSelector$ddlFareTypeSelector");
		Element el32 = new Element(
				"ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$hdnsetDefaultValue");
		Element el33 = new Element(
				"ctl00$FullRegion$MainRegion$ContentRegion$ContentFullRegion$ContentLeftRegion$CEPGroup1$CEPActive$cepNDPRevBookingArea$hdncalendarDropdown");
		Element el34 = new Element("__PREVIOUSPAGE");
		Element el35 = new Element("__VIEWSTATE");
		Element el36 = new Element("__VIEWSTATEGENERATOR");

		el1.val(c1);
		el2.val(empty);
		el3.val(empty);
		el4.val(empty);
		el5.val(empty);
		el6.val(empty);
		el7.val(empty);
		el8.val(empty);
		el9.val(tripTipe);
		el10.val(f);
		//e11 set/
		el11.val(c11);
		el12.val(fareType);
		el13.val(airportFull1);
		el14.val(airport1);
		el15.val(airportFull2);
		el16.val(airport2);
		el17.val(empty);
		el18.val(empty);
		el19.val(date1);
		el20.val(date2);
		el21.val(empty);
		el22.val(empty);
		el23.val(empty);
		el24.val(calDate);
		el25.val(calendar);
		el26.val(calendar2);
		el27.val(flexDateSelector);
		el28.val(adults);
		el29.val(child);
		el30.val(infant);
		el31.val(fareType);
		el32.val(t);
		el33.val(t);
		if (!elementsFromHomePage.isEmpty()) {
			for (Element el : elementsFromHomePage) {
				if (el.attr("name").equals(el34.nodeName())) {
					el34.val(el.attr("value"));
				}
				if (el.attr("name").equals(el35.nodeName())) {
					el35.val(el.attr("value"));
				}
				if (el.attr("name").equals(el36.nodeName())) {
					el36.val(el.attr("value"));
				}
			}
		}	
		StringBuilder builder = new StringBuilder();
		builder
		.append(wk).append(nl).append(cd).append(el1.nodeName()).append(qm).append(nl).append(nl).append(el1.val()).append(nl)
		.append(wk).append(nl).append(cd).append(el2.nodeName()).append(qm).append(nl).append(nl).append(el2.val()).append(nl)
		.append(wk).append(nl).append(cd).append(el3.nodeName()).append(qm).append(nl).append(nl).append(el3.val()).append(nl)
		.append(wk).append(nl).append(cd).append(el4.nodeName()).append(qm).append(nl).append(nl).append(el4.val()).append(nl)
		.append(wk).append(nl).append(cd).append(el5.nodeName()).append(qm).append(nl).append(nl).append(el5.val()).append(nl)
		.append(wk).append(nl).append(cd).append(el6.nodeName()).append(qm).append(nl).append(nl).append(el6.val()).append(nl)
		.append(wk).append(nl).append(cd).append(el7.nodeName()).append(qm).append(nl).append(nl).append(el7.val()).append(nl)
		.append(wk).append(nl).append(cd).append(el8.nodeName()).append(qm).append(nl).append(nl).append(el8.val()).append(nl)
		.append(wk).append(nl).append(cd).append(el9.nodeName()).append(qm).append(nl).append(nl).append(el9.val()).append(nl)
		.append(wk).append(nl).append(cd).append(el10.nodeName()).append(qm).append(nl).append(nl).append(el10.val()).append(nl)
		.append(wk).append(nl).append(cd).append(el11.nodeName()).append(qm).append(nl).append(nl).append(el11.val()).append(nl)
		.append(wk).append(nl).append(cd).append(el12.nodeName()).append(qm).append(nl).append(nl).append(el12.val()).append(nl)
		.append(wk).append(nl).append(cd).append(el13.nodeName()).append(qm).append(nl).append(nl).append(el13.val()).append(nl)
		.append(wk).append(nl).append(cd).append(el14.nodeName()).append(qm).append(nl).append(nl).append(el14.val()).append(nl)
		.append(wk).append(nl).append(cd).append(el15.nodeName()).append(qm).append(nl).append(nl).append(el15.val()).append(nl)
		.append(wk).append(nl).append(cd).append(el16.nodeName()).append(qm).append(nl).append(nl).append(el16.val()).append(nl)
		.append(wk).append(nl).append(cd).append(el17.nodeName()).append(qm).append(nl).append(nl).append(el17.val()).append(nl)
		.append(wk).append(nl).append(cd).append(el18.nodeName()).append(qm).append(nl).append(nl).append(el18.val()).append(nl)
		.append(wk).append(nl).append(cd).append(el19.nodeName()).append(qm).append(nl).append(nl).append(el19.val()).append(nl)
		.append(wk).append(nl).append(cd).append(el20.nodeName()).append(qm).append(nl).append(nl).append(el20.val()).append(nl)
		.append(wk).append(nl).append(cd).append(el21.nodeName()).append(qm).append(nl).append(nl).append(el21.val()).append(nl)
		.append(wk).append(nl).append(cd).append(el22.nodeName()).append(qm).append(nl).append(nl).append(el22.val()).append(nl)
		.append(wk).append(nl).append(cd).append(el23.nodeName()).append(qm).append(nl).append(nl).append(el23.val()).append(nl)
		.append(wk).append(nl).append(cd).append(el24.nodeName()).append(qm).append(nl).append(nl).append(el24.val()).append(nl)
		.append(wk).append(nl).append(cd).append(el25.nodeName()).append(qm).append(nl).append(nl).append(el25.val()).append(nl)
		.append(wk).append(nl).append(cd).append(el26.nodeName()).append(qm).append(nl).append(nl).append(el26.val()).append(nl)
		.append(wk).append(nl).append(cd).append(el27.nodeName()).append(qm).append(nl).append(nl).append(el27.val()).append(nl)
		.append(wk).append(nl).append(cd).append(el28.nodeName()).append(qm).append(nl).append(nl).append(el28.val()).append(nl)
		.append(wk).append(nl).append(cd).append(el29.nodeName()).append(qm).append(nl).append(nl).append(el29.val()).append(nl)
		.append(wk).append(nl).append(cd).append(el30.nodeName()).append(qm).append(nl).append(nl).append(el30.val()).append(nl)
		.append(wk).append(nl).append(cd).append(el31.nodeName()).append(qm).append(nl).append(nl).append(el31.val()).append(nl)
		.append(wk).append(nl).append(cd).append(el32.nodeName()).append(qm).append(nl).append(nl).append(el32.val()).append(nl)
		.append(wk).append(nl).append(cd).append(el33.nodeName()).append(qm).append(nl).append(nl).append(el33.val()).append(nl)
		.append(wk).append(nl).append(cd).append(el34.nodeName()).append(qm).append(nl).append(nl).append(el34.val()).append(nl)
		.append(wk).append(nl).append(cd).append(el35.nodeName()).append(qm).append(nl).append(nl).append(el35.val()).append(nl)
		.append(wk).append(nl).append(cd).append(el36.nodeName()).append(qm).append(nl).append(nl).append(el36.val()).append(nl)
		.append(wk).append("--");
		String webkit=builder.toString();
		return webkit;

	}

}
