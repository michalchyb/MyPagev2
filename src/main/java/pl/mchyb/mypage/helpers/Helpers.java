package pl.mchyb.mypage.helpers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import pl.mchyb.mypage.geoip.JsonWeatherApiSingletone;

public class Helpers {

	public static String getMyIp() {

		String ipAddress = "";
		try {
			URL url = new URL("http://bot.whatismyipaddress.com");

			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));

			ipAddress = bufferedReader.readLine().trim();
		} catch (Exception e) {
			ipAddress = "Cannot Execute Properly";
		}
		return ipAddress;
	}

	public static void saveToFile(JSONObject jsonObject) throws IOException {
		BufferedWriter writer = new BufferedWriter(
				new FileWriter("/home/michalch/eclipse-workspace/MyPagev2/src/main/resources/json/weather.json"));
		writer.write(jsonObject.toJSONString());
		writer.close();
	}

	public static JSONObject convertApiStringToJsonObject() throws ParseException {
		String dataFromApi = JsonWeatherApiSingletone.getInstance().getDataFromApi();

		JSONParser parser = new JSONParser();
		JSONObject json = (JSONObject) parser.parse(dataFromApi);
		return json;
	}

	public static Date parseDate(String stringDate) throws ParseException, Exception {
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		if (stringDate != null && !stringDate.trim().isEmpty()) {
			date = formatter.parse(stringDate);
		}
		return date;
	}
}