package servises;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.nodes.Element;

public class SecondPostParams {
	public String getElements(ArrayList<Element> elements) {
		// They should be setted from first post, but I don`t get full response
		String t = "TRUE";
		String f = "FALSE";
		String nl = "\r\n";
		List<Element> postEl = new ArrayList<>();

		Element el1 = new Element("__EVENTTARGET");
		Element el2 = new Element("__EVENTARGUMENT");
		Element el3 = new Element("LANGUAGE");
		Element el4 = new Element("SITE");
		Element el5 = new Element("EMBEDDED_TRANSACTION");
		Element el6 = new Element("SIP_INTERNAL");
		Element el7 = new Element("WDS_FLOW");
		Element el8 = new Element("WDS_FACADE_CALLBACK");
		Element el9 = new Element("SO_SITE_ATC_ALLOW_LSA_INDIC");
		Element el10 = new Element("SO_SITE_ADVANCED_CATEGORIES");
		Element el11 = new Element("SO_SITE_TK_OFFICE_ID");
		Element el12 = new Element("SO_SITE_QUEUE_OFFICE_ID");
		Element el13 = new Element("SO_SITE_CSSR_TAXES");
		Element el14 = new Element("SO_SITE_OFFICE_ID");
		Element el15 = new Element("SO_SITE_ETKT_Q_AND_CAT");
		Element el16 = new Element("SO_SITE_FP_CAL_DISP_NA_DATE");
		Element el17 = new Element("SO_SITE_ETKT_Q_OFFICE_ID");
		Element el18 = new Element("SO_GL");
		Element el19 = new Element("SO_SITE_FD_SOLDOUT_FLIGHT");
		Element el20 = new Element("SO_SITE_QUEUE_CATEGORY");
		Element el21 = new Element("SO_SITE_ALLOW_LSA_INDICATOR");
		Element el22 = new Element("WDS_SERVICING_FLOW_TE_MEAL");
		Element el23 = new Element("WDS_AVD_SEL_FLIGHTS");
		Element el24 = new Element("WDS_CAL_RANGE");
		Element el25 = new Element("WDS_SERVICING_FLOW_TE_FBAG");
		Element el26 = new Element("WDS_SHOW_INVINFO");
		Element el27 = new Element("WDS_BOOKING_FLOW_TE_MEAL");
		Element el28 = new Element("WDS_ACTIVATE_APP_FOR_CC_MOP");
		Element el29 = new Element("PRICING_TYPE");
		Element el30 = new Element("WDS_SHOW_TAXES");
		Element el31 = new Element("B_LOCATION_1");
		Element el32 = new Element("WDS_FO_IATA");
		Element el33 = new Element("WDS_SHOW_ADDCAL");
		Element el34 = new Element("WDS_INST_LIST");
		Element el35 = new Element("WDS_USE_FQN");
		Element el36 = new Element("WDS_ACTIVATE_APP_FOR_ALL_MOP");
		Element el37 = new Element("COMMERCIAL_FARE_FAMILY_1");
		Element el38 = new Element("WDS_CHECKIN_NOTIF");
		Element el39 = new Element("TRIP_TYPE");
		Element el40 = new Element("WDS_HELPCONTACTURL");
		Element el41 = new Element("WDS_SAS_CREDITS");
		Element el42 = new Element("WDS_ANCILLARIES");
		Element el43 = new Element("WDS_BOOKING_FLOW_TE_FBAG");
		Element el44 = new Element("WDS_CC_LIST");
		Element el45 = new Element("WDS_SASCPCTRANGE");
		Element el46 = new Element("WDS_SHOW_AB");
		Element el47 = new Element("WDS_FOID_EXCL_LIST");
		Element el48 = new Element("DATE_RANGE_VALUE_1");
		Element el49 = new Element("WDS_SERVICING_FLOW_TE_SEATMAP");
		Element el50 = new Element("DATE_RANGE_VALUE_2");
		Element el51 = new Element("WDS_BOOKING_FLOW_TE_XBAG");
		Element el52 = new Element("WDS_POINTS_EARNED");
		Element el53 = new Element("WDS_ORIGIN_SITE");
		Element el54 = new Element("WDS_SHOW_CMP_CODE");
		Element el55 = new Element("TRAVELLER_TYPE_1");
		Element el56 = new Element("WDS_NEWSLETTER_FCO");
		Element el57 = new Element("B_LOCATION_2");
		Element el58 = new Element("WDS_BOOKING_FLOW_TE_SEATMAP");
		Element el59 = new Element("WDS_TIME_OPTION");
		Element el60 = new Element("WDS_FRAS");
		Element el61 = new Element("DISPLAY_TYPE");
		Element el62 = new Element("WDS_MOBILE_NEW_DESIGN");
		Element el63 = new Element("WDS_SERVICING_FLOW_TE_XBAG");
		Element el64 = new Element("WDS_SHOW_MINISEARCH");
		Element el65 = new Element("B_DATE_1");
		Element el66 = new Element("B_DATE_2");
		Element el67 = new Element("E_LOCATION_2");
		Element el68 = new Element("E_LOCATION_1");
		Element el69 = new Element("WDS_EBMS_CAMPAIGN");
		Element el70 = new Element("DATE_RANGE_QUALIFIER_2");
		Element el71 = new Element("DATE_RANGE_QUALIFIER_1");
		Element el72 = new Element("WDS_INSTPAY");
		Element el73 = new Element("ENCT");
		Element el74 = new Element("ENC");
		Element el75 = new Element("__PREVIOUSPAGE");
		Element el76 = new Element("__VIEWSTATE");
		Element el77 = new Element("__VIEWSTATEGENERATOR");

		el1.val("btnSubmitAmadeus");
		el2.val("");
		el3.val("GB");
		el4.val("SKBKSKBK");
		el5.val("FlexPricerAvailability");
		// el6.val("44454641554C545F4E44505F4345505F49443D32313230383826504152414D455445525F434845434B53554D3D3633264345505F49443D3231353436312652454449524543545F55524C3D25326664656661756C742E617370782533666964253364383531372532366570736C616E6775616765253364656E265354415254504147455F49443D38353137264D41524B45543D4445265245565F5744535F4F42464545533D253363253366786D6C2B76657273696F6E25336427312E30272B656E636F64696E672533642769736F2D383835392D3127253366253365253363534F5F474C253365253363474C4F42414C5F4C4953542533652533634E414D45253365534954455F4C4953545F4F425F4645455F434F44455F544F5F4558454D50542533632532664E414D452533652533634C4953545F454C454D454E54253365253363434F4445253365543031253363253266434F44452533652533634C4953545F56414C55452533655430312533632532664C4953545F56414C55452533652533632532664C4953545F454C454D454E542533652533634C4953545F454C454D454E54253365253363434F4445253365543032253363253266434F44452533652533634C4953545F56414C55452533655430322533632532664C4953545F56414C55452533652533632532664C4953545F454C454D454E54253365253363253266474C4F42414C5F4C495354253365253363253266534F5F474C253365265245565F494E535552414E43453D253363253366786D6C2B76657273696F6E253364253232312E302532322B656E636F64696E6725336425323269736F2D383835392D31253232253366253365253363534F5F474C253365253363474C4F42414C5F4C4953542533652533634E414D45253365534954455F494E535552414E43455F50524F44554354532533632532664E414D452533652533634C4953545F454C454D454E54253365253363434F4445253365454154253363253266434F44452533652533634C4953545F56414C5545253365253363494E535552414E43455F434F44452533652533634555524F50455F4F57253365434F57452533632532664555524F50455F4F572533652533634555524F50455F5254253365435254452533632532664555524F50455F5254253365253363494E544552434F4E545F4F57253365434F5757253363253266494E544552434F4E545F4F57253365253363494E544552434F4E545F525425336543525457253363253266494E544552434F4E545F5254253365253363253266494E535552414E43455F434F44452533652533632532664C4953545F56414C55452533652533634C4953545F56414C55452533652533632532664C4953545F56414C55452533652533634C4953545F56414C55452533654E2533632532664C4953545F56414C55452533652533634C4953545F56414C55452533654E2533632532664C4953545F56414C55452533652533634C4953545F56414C55452533654E2533632532664C4953545F56414C55452533652533634C4953545F56414C55452533654E2533632532664C4953545F56414C55452533652533634C4953545F56414C5545253365312533632532664C4953545F56414C55452533652533632532664C4953545F454C454D454E54253365253363253266474C4F42414C5F4C495354253365253363253266534F5F474C253365");
		el7.val("REVENUE");
		el8.val("https%3A%2F%2Fclassic.flysas.com%2FAmadeusFacade%2Fdefault.aspx%3Fepslanguage%3Den");
		el9.val(t);
		el10.val(t);
		el11.val("FRASK08RV");
		el12.val("FRASK08RV");
		el13.val(f);
		el14.val("FRASK08RV");
		el15.val("32C0");
		el16.val(t);
		el17.val("FRASK08RV");
		el18.val(
				"%3CSO_GL%3E%3CGLOBAL_LIST%3E%3CNAME%3ESITE_INSURANCE_PRODUCTS%3C%2FNAME%3E%3CLIST_ELEMENT%3E%3CCODE%3EEAT%3C%2FCODE%3E%3CLIST_VALUE%3ECRTE%3C%2FLIST_VALUE%3E%3CLIST_VALUE%3E%3C%2FLIST_VALUE%3E%3CLIST_VALUE%3EN%3C%2FLIST_VALUE%3E%3CLIST_VALUE%3EN%3C%2FLIST_VALUE%3E%3CLIST_VALUE%3EN%3C%2FLIST_VALUE%3E%3CLIST_VALUE%3EN%3C%2FLIST_VALUE%3E%3CLIST_VALUE%3E1%3C%2FLIST_VALUE%3E%3C%2FLIST_ELEMENT%3E%3C%2FGLOBAL_LIST%3E%3CGLOBAL_LIST%3E%3CNAME%3ESITE_QUEUE_DEFINITION_LIST%3C%2FNAME%3E%3CLIST_ELEMENT%3E%3CCODE%3E0%3C%2FCODE%3E%3CLIST_VALUE%3ESRV%3C%2FLIST_VALUE%3E%3CLIST_VALUE%3EFRASK08RV%3C%2FLIST_VALUE%3E%3CLIST_VALUE%3E34%3C%2FLIST_VALUE%3E%3CLIST_VALUE%3E0%3C%2FLIST_VALUE%3E%3C%2FLIST_ELEMENT%3E%3CLIST_ELEMENT%3E%3CCODE%3E1%3C%2FCODE%3E%3CLIST_VALUE%3ECAN%3C%2FLIST_VALUE%3E%3CLIST_VALUE%3EFRASK08RV%3C%2FLIST_VALUE%3E%3CLIST_VALUE%3E31%3C%2FLIST_VALUE%3E%3CLIST_VALUE%3E0%3C%2FLIST_VALUE%3E%3C%2FLIST_ELEMENT%3E%3CLIST_ELEMENT%3E%3CCODE%3E2%3C%2FCODE%3E%3CLIST_VALUE%3ERIR%3C%2FLIST_VALUE%3E%3CLIST_VALUE%3EFRASK08RV%3C%2FLIST_VALUE%3E%3CLIST_VALUE%3E30%3C%2FLIST_VALUE%3E%3CLIST_VALUE%3E0%3C%2FLIST_VALUE%3E%3C%2FLIST_ELEMENT%3E%3CLIST_ELEMENT%3E%3CCODE%3E3%3C%2FCODE%3E%3CLIST_VALUE%3EREI%3C%2FLIST_VALUE%3E%3CLIST_VALUE%3EFRASK08RV%3C%2FLIST_VALUE%3E%3CLIST_VALUE%3E30%3C%2FLIST_VALUE%3E%3CLIST_VALUE%3E0%3C%2FLIST_VALUE%3E%3C%2FLIST_ELEMENT%3E%3CLIST_ELEMENT%3E%3CCODE%3E4%3C%2FCODE%3E%3CLIST_VALUE%3EAWA%3C%2FLIST_VALUE%3E%3CLIST_VALUE%3EFRASK08RV%3C%2FLIST_VALUE%3E%3CLIST_VALUE%3E8%3C%2FLIST_VALUE%3E%3CLIST_VALUE%3E1%3C%2FLIST_VALUE%3E%3C%2FLIST_ELEMENT%3E%3CLIST_ELEMENT%3E%3CCODE%3E6%3C%2FCODE%3E%3CLIST_VALUE%3ERIP%3C%2FLIST_VALUE%3E%3CLIST_VALUE%3EFRASK08RV%3C%2FLIST_VALUE%3E%3CLIST_VALUE%3E30%3C%2FLIST_VALUE%3E%3CLIST_VALUE%3E0%3C%2FLIST_VALUE%3E%3C%2FLIST_ELEMENT%3E%3C%2FGLOBAL_LIST%3E%3CGLOBAL_LIST%3E%3CNAME%3ESITE_LIST_OB_FEE_CODE_TO_EXEMPT%3C%2FNAME%3E%3CLIST_ELEMENT%3E%3CCODE%3ET01%3C%2FCODE%3E%3CLIST_VALUE%3ET01%3C%2FLIST_VALUE%3E%3C%2FLIST_ELEMENT%3E%3CLIST_ELEMENT%3E%3CCODE%3ET02%3C%2FCODE%3E%3CLIST_VALUE%3ET02%3C%2FLIST_VALUE%3E%3C%2FLIST_ELEMENT%3E%3C%2FGLOBAL_LIST%3E%3C%2FSO_GL%3E");
		el19.val(t);
		el20.val("8C50");
		el21.val(t);
		el22.val(t);
		el23.val(t);
		el24.val("15");
		el25.val(t);
		el26.val(f);
		el27.val(t);
		el28.val(t);
		el29.val("C");
		el30.val(t);
		el31.val("ARN");
		el32.val("23494925");
		el33.val(t);
		el34.val("SAScDE%3Bklarna-SAScDE%3Bklarna_nt");
		el35.val(t);
		el36.val(f);
		el37.val("SKSTDA");
		el38.val(f);
		el39.val("R");
		el40.val("http%3A%2F%2Fclassic.sas.se%2Fen%2Fmisc%2FArkiv%2Fcontact-sia-%2F");
		el41.val(t);
		el42.val(f);
		el43.val(t);
		el44.val(
				"AX-SAS%2FERETAIL_DE-true%3ACA-SAS%2FERETAIL_DE-true%3AVI-SAS%2FERETAIL_DE-true%3ADC-SAS%2FERETAIL_DE-false%3ADS-SAS%2FERETAIL_DE-true%3ATP-SAS%2FERETAIL_DE-false");
		el45.val("2-6");
		el46.val(t);
		el47.val("DK");
		el48.val("1");
		el49.val(t);
		el50.val("1");
		el51.val(t);
		el52.val(f);
		el53.val("DE");
		el54.val(t);
		el55.val("ADT");
		el56.val(f);
		el57.val("LHR");
		el58.val(t);
		el59.val("True");
		el60.val(t);
		el61.val("2");
		el62.val(t);
		el63.val(t);
		el64.val("LINK");
		el65.val("201902040000");
		el66.val("201902100000");
		el67.val("ARN");
		el68.val("LHR");
		el69.val(t);
		el70.val("C");
		el71.val("C");
		el72.val(t);
		el73.val("1");
		
		
		//Don`t get correct ones <_____>
		
		if (!elements.isEmpty()) {
			for (Element el : elements) {
				if (el.attr("name").equals(el6.nodeName())) {
					el6.val(el.attr("value"));
				}
				if (el.attr("name").equals(el74.nodeName())) {
					el74.val(el.attr("value"));
				}
				if (el.attr("name").equals(el75.nodeName())) {
					el75.val(el.attr("value"));
				}
				if (el.attr("name").equals(el76.nodeName())) {
					el76.val(el.attr("value"));
				}
				if (el.attr("name").equals(el77.nodeName())) {
					el77.val(el.attr("value"));
				}
			}
		}
		// el6.val("44454641554C545F4E44505F4345505F49443D32313230383826504152414D455445525F434845434B53554D3D3633264345505F49443D3231353436312652454449524543545F55524C3D25326664656661756C742E617370782533666964253364383531372532366570736C616E6775616765253364656E265354415254504147455F49443D38353137264D41524B45543D4445265245565F5744535F4F42464545533D253363253366786D6C2B76657273696F6E25336427312E30272B656E636F64696E672533642769736F2D383835392D3127253366253365253363534F5F474C253365253363474C4F42414C5F4C4953542533652533634E414D45253365534954455F4C4953545F4F425F4645455F434F44455F544F5F4558454D50542533632532664E414D452533652533634C4953545F454C454D454E54253365253363434F4445253365543031253363253266434F44452533652533634C4953545F56414C55452533655430312533632532664C4953545F56414C55452533652533632532664C4953545F454C454D454E542533652533634C4953545F454C454D454E54253365253363434F4445253365543032253363253266434F44452533652533634C4953545F56414C55452533655430322533632532664C4953545F56414C55452533652533632532664C4953545F454C454D454E54253365253363253266474C4F42414C5F4C495354253365253363253266534F5F474C253365265245565F494E535552414E43453D253363253366786D6C2B76657273696F6E253364253232312E302532322B656E636F64696E6725336425323269736F2D383835392D31253232253366253365253363534F5F474C253365253363474C4F42414C5F4C4953542533652533634E414D45253365534954455F494E535552414E43455F50524F44554354532533632532664E414D452533652533634C4953545F454C454D454E54253365253363434F4445253365454154253363253266434F44452533652533634C4953545F56414C5545253365253363494E535552414E43455F434F44452533652533634555524F50455F4F57253365434F57452533632532664555524F50455F4F572533652533634555524F50455F5254253365435254452533632532664555524F50455F5254253365253363494E544552434F4E545F4F57253365434F5757253363253266494E544552434F4E545F4F57253365253363494E544552434F4E545F525425336543525457253363253266494E544552434F4E545F5254253365253363253266494E535552414E43455F434F44452533652533632532664C4953545F56414C55452533652533634C4953545F56414C55452533652533632532664C4953545F56414C55452533652533634C4953545F56414C55452533654E2533632532664C4953545F56414C55452533652533634C4953545F56414C55452533654E2533632532664C4953545F56414C55452533652533634C4953545F56414C55452533654E2533632532664C4953545F56414C55452533652533634C4953545F56414C55452533654E2533632532664C4953545F56414C55452533652533634C4953545F56414C5545253365312533632532664C4953545F56414C55452533652533632532664C4953545F454C454D454E54253365253363253266474C4F42414C5F4C495354253365253363253266534F5F474C253365");
		// el74.val("880C47E886641DC0A85DB6DF8E758AC9315E224F2A199FA5041070C90A682321347E1B9DDE09436FAA12FE02EE1BB2B6723CDBF97A27DEDCB97EB08BDF6A478B2A0111FCE71421C05DBC9606E9548566821D54662375D7AC81DDA437353974A479F97CE986BFD45AD828EE94111443CD79F97CE986BFD45AD828EE94111443CD");
		// el75.val("EOuVgEVGcPaooWlcQzY7uwfysikykaVpb-H5wZ3xp_fcVkbM_4Y3Yh3_OEwpzEWi5gOj_s80sjeP-1yYWe-Fp-6rsY8xAKiOA8--sL0aS3jICz0W0");
		// el76.val("BAA3076B");

		// el75.val("EOuVgEVGcPaooWlcQzY7uwfysikykaVpb-H5wZ3xp_fcVkbM_4Y3Yh3_OEwpzEWi5gOj_s80sjeP-1yYWe-Fp-6rsY8xAKiOA8--sL0aS3jICz0W0");
		// el76.val("%2FwEPDwUKMTE1MTc0MDk0N2RkuN2qfxyKJHLW%2BuU0D7%2BB8ZTdGMU%3D");
		// el77.val("BAA3076B");

		StringBuilder builder = new StringBuilder();
		builder.append(el1.nodeName()).append("=").append(el1.val()).append("&").append(el2.nodeName()).append("=")
				.append(el2.val()).append("&").append(el3.nodeName()).append("=").append(el3.val()).append("&")
				.append(el4.nodeName()).append("=").append(el4.val()).append("&").append(el5.nodeName()).append("=")
				.append(el5.val()).append("&").append(el6.nodeName()).append("=").append(el6.val()).append("&")
				.append(el7.nodeName()).append("=").append(el7.val()).append("&").append(el8.nodeName()).append("=")
				.append(el8.val()).append("&").append(el9.nodeName()).append("=").append(el9.val()).append("&")
				.append(el10.nodeName()).append("=").append(el10.val()).append("&").append(el11.nodeName()).append("=")
				.append(el11.val()).append("&").append(el12.nodeName()).append("=").append(el12.val()).append("&")
				.append(el13.nodeName()).append("=").append(el13.val()).append("&").append(el14.nodeName()).append("=")
				.append(el14.val()).append("&").append(el15.nodeName()).append("=").append(el15.val()).append("&")
				.append(el16.nodeName()).append("=").append(el16.val()).append("&").append(el17.nodeName()).append("=")
				.append(el17.val()).append("&").append(el18.nodeName()).append("=").append(el18.val()).append("&")
				.append(el19.nodeName()).append("=").append(el19.val()).append("&").append(el20.nodeName()).append("=")
				.append(el20.val()).append("&").append(el21.nodeName()).append("=").append(el21.val()).append("&")
				.append(el22.nodeName()).append("=").append(el22.val()).append("&").append(el23.nodeName()).append("=")
				.append(el23.val()).append("&").append(el24.nodeName()).append("=").append(el24.val()).append("&")
				.append(el25.nodeName()).append("=").append(el25.val()).append("&").append(el26.nodeName()).append("=")
				.append(el26.val()).append("&").append(el27.nodeName()).append("=").append(el27.val()).append("&")
				.append(el28.nodeName()).append("=").append(el28.val()).append("&").append(el29.nodeName()).append("=")
				.append(el29.val()).append("&").append(el30.nodeName()).append("=").append(el30.val()).append("&")
				.append(el31.nodeName()).append("=").append(el31.val()).append("&").append(el32.nodeName()).append("=")
				.append(el32.val()).append("&").append(el33.nodeName()).append("=").append(el33.val()).append("&")
				.append(el34.nodeName()).append("=").append(el34.val()).append("&").append(el35.nodeName()).append("=")
				.append(el35.val()).append("&").append(el36.nodeName()).append("=").append(el36.val()).append("&")
				.append(el37.nodeName()).append("=").append(el37.val()).append("&").append(el38.nodeName()).append("=")
				.append(el38.val()).append("&").append(el39.nodeName()).append("=").append(el39.val()).append("&")
				.append(el40.nodeName()).append("=").append(el40.val()).append("&").append(el41.nodeName()).append("=")
				.append(el41.val()).append("&").append(el42.nodeName()).append("=").append(el42.val()).append("&")
				.append(el43.nodeName()).append("=").append(el43.val()).append("&").append(el44.nodeName()).append("=")
				.append(el44.val()).append("&").append(el45.nodeName()).append("=").append(el45.val()).append("&")
				.append(el46.nodeName()).append("=").append(el46.val()).append("&").append(el47.nodeName()).append("=")
				.append(el47.val()).append("&").append(el48.nodeName()).append("=").append(el48.val()).append("&")
				.append(el49.nodeName()).append("=").append(el49.val()).append("&").append(el50.nodeName()).append("=")
				.append(el50.val()).append("&").append(el51.nodeName()).append("=").append(el51.val()).append("&")
				.append(el52.nodeName()).append("=").append(el52.val()).append("&").append(el53.nodeName()).append("=")
				.append(el53.val()).append("&").append(el54.nodeName()).append("=").append(el54.val()).append("&")
				.append(el55.nodeName()).append("=").append(el55.val()).append("&").append(el56.nodeName()).append("=")
				.append(el56.val()).append("&").append(el57.nodeName()).append("=").append(el57.val()).append("&")
				.append(el58.nodeName()).append("=").append(el58.val()).append("&").append(el59.nodeName()).append("=")
				.append(el59.val()).append("&").append(el60.nodeName()).append("=").append(el60.val()).append("&")
				.append(el61.nodeName()).append("=").append(el61.val()).append("&").append(el62.nodeName()).append("=")
				.append(el62.val()).append("&").append(el63.nodeName()).append("=").append(el63.val()).append("&")
				.append(el64.nodeName()).append("=").append(el64.val()).append("&").append(el65.nodeName()).append("=")
				.append(el65.val()).append("&").append(el66.nodeName()).append("=").append(el66.val()).append("&")
				.append(el67.nodeName()).append("=").append(el67.val()).append("&").append(el68.nodeName()).append("=")
				.append(el68.val()).append("&").append(el69.nodeName()).append("=").append(el69.val()).append("&")
				.append(el70.nodeName()).append("=").append(el70.val()).append("&").append(el71.nodeName()).append("=")
				.append(el71.val()).append("&").append(el72.nodeName()).append("=").append(el72.val()).append("&")
				.append(el73.nodeName()).append("=").append(el73.val()).append("&").append(el74.nodeName()).append("=")
				.append(el74.val()).append("&").append(el75.nodeName()).append("=").append(el75.val()).append("&")
				.append(el76.nodeName()).append("=").append(el76.val()).append("&").append(el77.nodeName()).append("=")
				.append(el77.val());

		String params = builder.toString();
		return params;
	}

}
