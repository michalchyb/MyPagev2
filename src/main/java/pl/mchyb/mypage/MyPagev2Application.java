package pl.mchyb.mypage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import pl.mchyb.mypage.geoip.JsonWeatherApiSingletone;

@SpringBootApplication
public class MyPagev2Application {

	public static void main(String[] args) {
		SpringApplication.run(MyPagev2Application.class, args);
		
		JsonWeatherApiSingletone.getInstance();
	}
}
