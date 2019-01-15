package servises;

import models.DTO.FirstPostDTO;
import models.DTO.HomePageDTO;
import models.DTO.ScraperDTO;
import models.DTO.SecondPostDTO;

public class Scraper {

	public static ScraperDTO getInfo() {
		HomePage homePage = new HomePage();
		HomePageDTO homeDTO = new HomePageDTO();
		homeDTO = homePage.getHomeSource();
		if (homeDTO.isSuccess) {
			WebKitFormBoundarConstruction webKit = new WebKitFormBoundarConstruction();
			FirstPost firstPost = new FirstPost();
			FirstPostDTO firstPostDTO = new FirstPostDTO();
			firstPostDTO = firstPost.postData(webKit.constructwebKit(homeDTO.elementsList), homeDTO.cookies);
			if (firstPostDTO.isSuccess) {
//				System.out.println(firstPostDTO.response);
				SecondPost secondtPost = new SecondPost();
				SecondPostParams secondPostParamst = new SecondPostParams();
				SecondPostDTO secondPostDTO=new SecondPostDTO();
				secondPostDTO=secondtPost.postData(secondPostParamst.getElements(firstPostDTO.elementsList), homeDTO.cookies);
				if(secondPostDTO.isSuccess) {
					ScraperDTO scraperDTO=new ScraperDTO();
					scraperDTO.isSuccess=true;
					scraperDTO.info=secondPostDTO.response;
					return scraperDTO;				
				}
			}
		}
		ScraperDTO scraperDTO=new ScraperDTO();
		scraperDTO.isSuccess=false;
		return scraperDTO;

	}

}
