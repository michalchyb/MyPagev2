package pl.mchyb.mypage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import pl.mchyb.mypage.geoip.JsonWeatherApiSingletone;

@SpringBootApplication
public class MyPagev2Application {

	public static void main(String[] args)
			throws JsonParseException, JsonMappingException, IOException, ParseException {
		SpringApplication.run(MyPagev2Application.class, args);

		String dataFromApi = JsonWeatherApiSingletone.getInstance().getDataFromApi();

		JSONParser parser = new JSONParser();
		JSONObject json = (JSONObject) parser.parse(dataFromApi);

		String s = json.toJSONString();
		BufferedWriter writer = new BufferedWriter(
				new FileWriter("/home/michalch/eclipse-workspace/MyPagev2/src/main/resources/json/weather.json"));
		writer.write(s);
		writer.close();
	}
}