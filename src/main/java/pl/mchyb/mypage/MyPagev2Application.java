package pl.mchyb.mypage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

@SpringBootApplication
public class MyPagev2Application {

	public static void main(String[] args) {
		SpringApplication.run(MyPagev2Application.class, args);

		try {

			Client client = Client.create();

			WebResource webResource = client.resource("http://api.openweathermap.org/data/2.5/weather?q=Toruń&units-metric&APPID=f071f2aeda64cdae04b49c962b676f9a");

			ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);

			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
			}

			String output = response.getEntity(String.class);

			System.out.println("Output from Server .... \n");
			System.out.println(output);

		} catch (Exception e) {

			e.printStackTrace();
		}

	}
}
