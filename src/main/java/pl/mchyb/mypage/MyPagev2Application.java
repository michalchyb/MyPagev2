package pl.mchyb.mypage;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pl.mchyb.mypage.geoip.JsonWeatherApiSingletone;
import pl.mchyb.mypage.geoip.weatherdata.Coord;
import pl.mchyb.mypage.geoip.weatherdata.Weather;

@SpringBootApplication
public class MyPagev2Application {

	public static void main(String[] args) {
		SpringApplication.run(MyPagev2Application.class, args);
		
		System.out.println(JsonWeatherApiSingletone.getInstance().getDataFromApi());
		
		ObjectMapper mapper = new ObjectMapper();
	    Weather weather = null;
		try {
			weather = mapper.readValue(JsonWeatherApiSingletone.getInstance().getDataFromApi(), Weather.class);
			System.out.println(weather);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	//
	// @Bean
	// CommandLineRunner runner(UserService userService) {
	// return args -> {
	// ObjectMapper mapper = new ObjectMapper();
	// TypeReference<List<User>> typeReference = new TypeReference<List<User>>() {
	// };
	// InputStream inputStream =
	// TypeReference.class.getResourceAsStream("/json/users.json");
	// try {
	// List<User> users = mapper.readValue(inputStream, typeReference);
	// userService.save(users);
	// System.out.println("Users Saved!");
	// } catch (IOException e) {
	// System.out.println("Unable to save users: " + e.getMessage());
	// }
	// };
	// }
}
