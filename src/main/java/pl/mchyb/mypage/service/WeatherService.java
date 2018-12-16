//package pl.mchyb.mypage.service;
//
//import java.util.List;
//
//import pl.mchyb.mypage.geoip.weatherdata.Weather;
//import pl.mchyb.mypage.repository.WeatherRepository;
//
//public class WeatherService {
//	
//	private WeatherRepository weatherRepository;
//
//	public WeatherService(WeatherRepository weatherRepository) {
//		super();
//		this.weatherRepository = weatherRepository;
//	}
//	
//	public Iterable<Weather> list(){
//		return weatherRepository.findAll();
//	}
//	
//	public Iterable<Weather> save(List<Weather> weathers){
//		return weatherRepository.saveAll(weathers);
//	}
//	
//}
