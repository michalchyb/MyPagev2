//package pl.mchyb.mypage.controller;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import pl.mchyb.mypage.geoip.weatherdata.Weather;
//import pl.mchyb.mypage.service.WeatherService;
//
//@RestController
//@RequestMapping("/weather")
//public class WeatherController {
//	
//	private WeatherService weatherService;
//
//	public WeatherController(WeatherService weatherService) {
//		this.weatherService = weatherService;
//	}
//	
//	@GetMapping("/list")
//	public Iterable<Weather> list(){
//		return weatherService.list();
//	}
//}
