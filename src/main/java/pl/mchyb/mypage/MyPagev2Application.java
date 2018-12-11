package pl.mchyb.mypage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyPagev2Application {

	public static void main(String[] args) {
		SpringApplication.run(MyPagev2Application.class, args);

		// try {
		// Client client = Client.create();
		//
		// WebResource webResource = client.resource(
		// "api.openweathermap.org/data/2.5/weather?q=Toruń&units-metric&APPID=f071f2aeda64cdae04b49c962b676f9a");
		//
		// ClientResponse response =
		// webResource.accept("application/json").get(ClientResponse.class);
		//
		// if (response.getStatus() != 200) {
		// throw new RuntimeException("Failed : HTTP error code : " +
		// response.getStatus());
		// }
		//
		// String output = response.getEntity(String.class);
		//
		// System.out.println("Output from Server .... \n");
		// System.out.println(output);
		//
		// } catch (Exception e)
		//
		// {
		// e.printStackTrace();
		// }

	}
}
