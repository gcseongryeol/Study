package MovieDay;

import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

public class MovieDay {
	
	public class MovieDay {
		private static HttpClient httpClient;
		
	
	
	
	public static void main(String[] args) {
		
		HttpClient = new DefaultHttpClient();
		HttpGet httpGet = new HttpGet(
				"http://www.kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json?key=c65a7afec7f262457ce97331f8edcec2&targetDt=20200827");
		try {
			HttpResponse response = httpClient.execute(httpGet);
//          System.out.println(response.getStatusLine().getStatusCode()); 

			InputStream jsonInput = response.getEntity().getContent();
			JsonParser parser = new JsonParser();
			JsonElement element = parser.parse(new InputStreamReader(jsonInput, "UTF-8"));
			Gson gson = new Gson();

			JsonElement jsonEle = element.getAsJsonObject().get("boxOfficeResult").getAsJsonObject()
					.get("dailyBoxOfficeList").getAsJsonArray();

	        DailyBoxOfficeList[] dailyBoxOfficeLists = gson.fromJson(jsonEle, DailyBoxOfficeList[].class);
	        List<DailyBoxOfficeList> dailyList = Arrays.asList(dailyBoxOfficeLists);
	        for(DailyBoxOfficeList movieItem : dailyList) {
	          	System.out.println(movieItem.rank());
	         }
	        
			Type jsonList = new TypeToken<ArrayList<DailyBoxOfficeList>>() {}.getType();
			ArrayList<DailyBoxOfficeList> dailyArrayList = gson.fromJson(jsonEle,jsonList);
			for(DailyBoxOfficeList movieItem : dailyBoxOfficeLists) {
            	System.out.println(movieItem);
			}
          
          
    

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

		
		
	}
	
	
	
	
	
	
	
}


	


