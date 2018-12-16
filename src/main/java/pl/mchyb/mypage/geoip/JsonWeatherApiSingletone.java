package pl.mchyb.mypage.geoip;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import pl.mchyb.mypage.helpers.Helpers;

public class JsonWeatherApiSingletone {

	private static JsonWeatherApiSingletone instance;

	private JsonWeatherApiSingletone() {
		getDataFromApi();
	}

	public static synchronized JsonWeatherApiSingletone getInstance() {
		if (instance == null) {
			instance = new JsonWeatherApiSingletone();
		}
		return instance;
	}

	public String getDataFromApi() {
		String output = "";
		try {

			Client client = Client.create();

			WebResource webResource = client.resource("http://api.openweathermap.org/data/2.5/weather?q="
					+ GeoIPv4.getLocation(Helpers.getMyIp()).getCity() + "&units=metric"
					+ "&APPID=f071f2aeda64cdae04b49c962b676f9a");

			ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);

			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
			}

			output = response.getEntity(String.class);
			// System.out.println("Output from Server .... \n");
			// System.out.println(output);

		} catch (Exception e) {

			e.printStackTrace();
		}
		return output;
	}
}
