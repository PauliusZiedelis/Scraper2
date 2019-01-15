package servises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.KeyStore;
import java.util.ArrayList;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.HTTP;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

import models.DTO.HomePageDTO;

public class HomePage {
	public String url = "https://classic.flysas.com/en/de/";
	public String source;
	public String cookies;

	public HomePageDTO getHomeSource() {
		try {
			HttpClient client = HttpClientBuilder.create().build();
			HttpGet getRequest = new HttpGet(url);
			getRequest.addHeader("Host", "classic.flysas.com");
			getRequest.addHeader("Connection", "keep-alive");
			getRequest.addHeader("Upgrade-Insecure-Requests", "1");
			getRequest.addHeader("User-Agent",
					"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/71.0.3578.98 Safari/537.36");
			getRequest.addHeader("Accept",
					"text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8");
			getRequest.addHeader("Accept-Encoding", "gzip, deflate, br, UTF-8");
			getRequest.addHeader("Accept-Language", "en-US,en;q=0.9,lt;q=0.8");

			HttpResponse response = client.execute(getRequest);
			BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
			StringBuffer result = new StringBuffer();
			String line = "";
			while ((line = rd.readLine()) != null) {
				result.append(line);
			}
			source = result.toString();
			Document doc = Jsoup.parse(source);
			Element form = doc.getElementById("aspnetForm");
			Elements inputs = form.getElementsByTag("input");

			Element el34 = new Element("__PREVIOUSPAGE");
			Element el35 = new Element("__VIEWSTATE");
			Element el36 = new Element("__VIEWSTATEGENERATOR");

			ArrayList<Element> elementsList = new ArrayList<>();
			for (Element el : inputs) {
				if (el.attr("name").equals(el34.nodeName())) {
					elementsList.add(el);
				}
				if (el.attr("name").equals(el35.nodeName())) {
					elementsList.add(el);
				}
				if (el.attr("name").equals(el36.nodeName())) {
					elementsList.add(el);
				}
			}

			Header[] headers = response.getHeaders("Set-Cookie");
			StringBuilder builder = new StringBuilder();
			for (int i = 0; i < headers.length; i++) {
				builder.append(headers[i].getValue());
			}
			String cookiesRaw = builder.toString();
			cookies = builder.toString().replaceAll("path=/; ", "").replace("secure; HttpOnly", "")
					.replaceAll("secure", "").trim();
			HomePageDTO homePageDTO = new HomePageDTO();
			homePageDTO.cookies = cookies;
			homePageDTO.elementsList = elementsList;
			homePageDTO.isSuccess = true;
			return homePageDTO;
		}

		catch (Exception e) {
			e.printStackTrace();
		}
		HomePageDTO homePageDTO = new HomePageDTO();
		homePageDTO.isSuccess = false;
		return homePageDTO;
	}
}
