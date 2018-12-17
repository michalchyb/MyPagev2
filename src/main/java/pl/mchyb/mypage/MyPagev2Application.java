package pl.mchyb.mypage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pl.mchyb.mypage.geoip.JsonWeatherApiSingletone;

@SpringBootApplication
public class MyPagev2Application {

	public static void main(String[] args) {
		SpringApplication.run(MyPagev2Application.class, args);

		 System.out.println(JsonWeatherApiSingletone.getInstance().getDataFromApi());
	}
}
