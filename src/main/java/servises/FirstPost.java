package servises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import models.DTO.FirstPostDTO;
import java.io.*;
import java.util.*;


public class FirstPost {
public String response;
	public FirstPostDTO postData(String webKit, String cookies) {
		try {
		URL url = new URL("https://classic.flysas.com/en/de/");
		byte[] postDataBytes = webKit.getBytes("UTF-8");
        String postDataLength = String.valueOf(postDataBytes.length);
        //other cookies is default
        String cookiesMod=cookies+" SASLastSearch=%7B%22origin%22:%22ARN%22,%22destination%22:%22LHR%22,%22outward%22:%2220190204%22,%22inward%22:%2220190210%22,%22adults%22:%221%22,%22children%22:%220%22,%22infants%22:%220%22,%22youths%22:%22NaN%22,%22lpc%22:%22false%22,%22oneway%22:%22false%22,%22rtf%22:%22false%22,%22rcity%22:%22false%22%7D";
        
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("POST");
		conn.setRequestProperty("Host", "classic.flysas.com");
		conn.setRequestProperty("Connection", "keep-alive");
		conn.setRequestProperty("Content-Length", postDataLength);
		conn.setRequestProperty("Cache-Control", "max-age=0");
		conn.setRequestProperty("Origin", "https://classic.flysas.com");
		conn.setRequestProperty("Upgrade-Insecure-Requests", "1");
		conn.setRequestProperty("Content-Type", "multipart/form-data; boundary==----WebKitFormBoundaryQbG4INA9SYRbahBP");
		conn.setRequestProperty("User-Agent",
				"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/69.0.3497.100 Safari/537.36");
		conn.setRequestProperty("Accept",
				"text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8");
		conn.setRequestProperty("Referer", "http://classic.flysas.com/en/de/");
		conn.setRequestProperty("Accept-Language", "en-US,en;q=0.9");
		conn.setRequestProperty("Cookie", cookies);
		conn.setRequestProperty("Accept-Encoding", "UTF-8");
		conn.setDoOutput(true);
		conn.getOutputStream().write(postDataBytes);

			BufferedReader input = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
			StringBuilder firstPostResponce = new StringBuilder();
			for (int c; (c = input.read()) >= 0;) {
				firstPostResponce.append((char)c);
			}
			response=firstPostResponce.toString();
			input.close();
			
			Document doc = Jsoup.parse(response);
			Element form = doc.getElementById("aspnetForm");
			Elements inputs = form.getElementsByTag("input");

			ArrayList<Element> elementsList = new ArrayList<>();
			for (Element el : inputs) {
			elementsList.add(el);
			}
			FirstPostDTO firstPost=new FirstPostDTO();
			firstPost.elementsList=elementsList;
			firstPost.response=response;
			firstPost.isSuccess=true;
			return firstPost;
		} catch (IOException e) {
			e.printStackTrace();
		}
		FirstPostDTO firstPost=new FirstPostDTO();
		firstPost.isSuccess=false;
		return firstPost;

	
	}

}
