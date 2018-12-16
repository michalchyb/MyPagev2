//package pl.mchyb.mypage.geoip.weatherdata;
//
//import java.util.ArrayList;
//
//import javax.persistence.Embedded;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//
//@Data
//@AllArgsConstructor
//@Entity(name = "Weather")
//public class Weather {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private Long id_number;
//	
//	Coord CoordObject;
//	Sys SysObject;
//	ArrayList<Object> weather = new ArrayList<Object>();
//	Main MainObject;
//	Wind WindObject;
//	Rain RainObject;
//	Clouds CloudsObject;
//	private float dt;
//	private float id;
//	private String name;
//	private float cod;
//
//	@Embedded
//	private Coord coord;
//	@Embedded
//	private Main main;
//	@Embedded
//	private Wind wind;
//	@Embedded
//	private Rain rain;
//	@Embedded
//	private Clouds clouds;
//	
//	public Weather() {
//		
//	}
//	
//	public Coord getCoordObject() {
//		return CoordObject;
//	}
//
//	public void setCoordObject(Coord coordObject) {
//		CoordObject = coordObject;
//	}
//
//	public Sys getSysObject() {
//		return SysObject;
//	}
//
//	public void setSysObject(Sys sysObject) {
//		SysObject = sysObject;
//	}
//
//	public ArrayList<Object> getWeather() {
//		return weather;
//	}
//
//	public void setWeather(ArrayList<Object> weather) {
//		this.weather = weather;
//	}
//
//	public Main getMainObject() {
//		return MainObject;
//	}
//
//	public void setMainObject(Main mainObject) {
//		MainObject = mainObject;
//	}
//
//	public Wind getWindObject() {
//		return WindObject;
//	}
//
//	public void setWindObject(Wind windObject) {
//		WindObject = windObject;
//	}
//
//	public Rain getRainObject() {
//		return RainObject;
//	}
//
//	public void setRainObject(Rain rainObject) {
//		RainObject = rainObject;
//	}
//
//	public Clouds getCloudsObject() {
//		return CloudsObject;
//	}
//
//	public void setCloudsObject(Clouds cloudsObject) {
//		CloudsObject = cloudsObject;
//	}
//
//	public float getDt() {
//		return dt;
//	}
//
//	public void setDt(float dt) {
//		this.dt = dt;
//	}
//
//	public float getId() {
//		return id;
//	}
//
//	public void setId(float id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public float getCod() {
//		return cod;
//	}
//
//	public void setCod(float cod) {
//		this.cod = cod;
//	}
//
//	@Override
//	public String toString() {
//		return "Weather [CoordObject=" + CoordObject + ", SysObject=" + SysObject + ", weather=" + weather
//				+ ", MainObject=" + MainObject + ", WindObject=" + WindObject + ", RainObject=" + RainObject
//				+ ", CloudsObject=" + CloudsObject + ", dt=" + dt + ", id=" + id + ", name=" + name + ", cod=" + cod
//				+ "]";
//	}
//
//	
//}
