package pl.mchyb.mypage;

import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import pl.mchyb.mypage.helpers.Helpers;

@SpringBootApplication
public class MyPagev2Application {

	public static void main(String[] args)
			throws JsonParseException, JsonMappingException, IOException, ParseException {
		SpringApplication.run(MyPagev2Application.class, args);

		JSONObject jsonObject = Helpers.convertApiStringToJsonObject();
		Helpers.saveToFile(jsonObject);
	}

}