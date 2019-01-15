package servises;

import java.util.ArrayList;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import models.DTO.CheapestFlysDTO;
import models.DTO.ExtractInfoDTO;
import models.DTO.FirstPostDTO;
import models.DTO.HomePageDTO;
import models.DTO.ScraperDTO;

public class Main {

	public static void main(String[] args) {
		String airoportA = "ARN";
		String airoportB = "LHR";
		String airoportConnect = "OSL";
		String travelClass = "ECONBG";
		
		Scraper scraper = new Scraper();
		ScraperDTO scraperDTO = scraper.getInfo();
		ExtractData extract = new ExtractData();
		ExtractInfoDTO extractDTO = extract.extract(scraperDTO.info, airoportA, airoportB, airoportConnect,
				travelClass);
		FindCheapest cheapest = new FindCheapest();
		cheapest.cheapestFlights(extractDTO);
	}
}