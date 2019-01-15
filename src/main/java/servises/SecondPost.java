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
import models.DTO.FirstPostDTO;
import models.DTO.SecondPostDTO;
import java.io.*;
import java.util.*;

public class SecondPost {
	public String response;

	public SecondPostDTO postData(String secondPostParamst, String cookies) {
		try {
			URL url = new URL(
					"https://book.flysas.com/pl/SASC/wds/Override.action?SO_SITE_EXT_PSPURL=https://classic.sas.dk/SASCredits/SASCreditsPaymentMaster.aspx&SO_SITE_TP_TPC_POST_EOT_WT=50000&SO_SITE_USE_ACK_URL_SERVICE=TRUE&WDS_URL_JSON_POINTS=ebwsprod.flysas.com%2FEAJI%2FEAJIService.aspx&SO_SITE_EBMS_API_SERVERURL=%20https%3A%2F%2F1aebwsprod.flysas.com%2FEBMSPointsInternal%2FEBMSPoints.asmx&WDS_SERVICING_FLOW_TE_SEATMAP=TRUE&WDS_SERVICING_FLOW_TE_XBAG=TRUE&WDS_SERVICING_FLOW_TE_MEAL=TRUE&WDS_MIN_REQ_MIL=500");

			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Host", "book.flysas.com");
			conn.setRequestProperty("Connection", "keep-alive");
			conn.setRequestProperty("Cache-Control", "max-age=0");
			conn.setRequestProperty("Origin", "https://classic.flysas.com");
			conn.setRequestProperty("Upgrade-Insecure-Requests", "1");
			conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
			conn.setRequestProperty("User-Agent",
					"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/69.0.3497.100 Safari/537.36");
			conn.setRequestProperty("Accept",
					"text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8");
			conn.setRequestProperty("Referer", "http://classic.flysas.com/en/de/");
			conn.setRequestProperty("Accept-Encoding", "UTF-8");
			conn.setRequestProperty("Accept-Language", "en-US,en;q=0.9,lt;q=0.8");
			conn.setDoOutput(true);
			conn.getOutputStream().write(secondPostParamst.getBytes("UTF-8"));

			BufferedReader input = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
			StringBuilder secondPostResponce = new StringBuilder();
			for (int c; (c = input.read()) >= 0;) {
				secondPostResponce.append((char) c);
			}
			response = secondPostResponce.toString();
			input.close();
			SecondPostDTO secondPost = new SecondPostDTO();
			secondPost.response = response;
			secondPost.isSuccess = true;
			return secondPost;
		} catch (IOException e) {
			e.printStackTrace();
		}
		SecondPostDTO secondPost = new SecondPostDTO();
		secondPost.isSuccess = false;
		return secondPost;

	}

}
