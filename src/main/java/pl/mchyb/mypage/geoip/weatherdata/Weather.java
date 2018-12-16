package pl.mchyb.mypage.geoip.weatherdata;

import java.util.ArrayList;

public class Weather {
	Coord CoordObject;
	Sys SysObject;
	ArrayList<Object> weather = new ArrayList<Object>();
	Main MainObject;
	Wind WindObject;
	Rain RainObject;
	Clouds CloudsObject;
	private float dt;
	private float id;
	private String name;
	private float cod;

	public Coord getCoordObject() {
		return CoordObject;
	}

	public void setCoordObject(Coord coordObject) {
		CoordObject = coordObject;
	}

	public Sys getSysObject() {
		return SysObject;
	}

	public void setSysObject(Sys sysObject) {
		SysObject = sysObject;
	}

	public ArrayList<Object> getWeather() {
		return weather;
	}

	public void setWeather(ArrayList<Object> weather) {
		this.weather = weather;
	}

	public Main getMainObject() {
		return MainObject;
	}

	public void setMainObject(Main mainObject) {
		MainObject = mainObject;
	}

	public Wind getWindObject() {
		return WindObject;
	}

	public void setWindObject(Wind windObject) {
		WindObject = windObject;
	}

	public Rain getRainObject() {
		return RainObject;
	}

	public void setRainObject(Rain rainObject) {
		RainObject = rainObject;
	}

	public Clouds getCloudsObject() {
		return CloudsObject;
	}

	public void setCloudsObject(Clouds cloudsObject) {
		CloudsObject = cloudsObject;
	}

	public float getDt() {
		return dt;
	}

	public void setDt(float dt) {
		this.dt = dt;
	}

	public float getId() {
		return id;
	}

	public void setId(float id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getCod() {
		return cod;
	}

	public void setCod(float cod) {
		this.cod = cod;
	}

}
