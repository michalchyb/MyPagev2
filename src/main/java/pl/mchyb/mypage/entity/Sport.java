package pl.mchyb.mypage.entity;

import java.util.Date;

import org.json.simple.parser.ParseException;

import pl.mchyb.mypage.helpers.Helpers;

public abstract class Sport {

	private String nameRun;
	private double distance;
	private Date date;
	private String myTime;
	private String city;
	public String getNameRun() {
		return nameRun;
	}
	public void setNameRun(String nameRun) {
		this.nameRun = nameRun;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getMyTime() {
		return myTime;
	}
	public void setMyTime(String myTime) {
		this.myTime = myTime;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Sport [nameRun=" + nameRun + ", distance=" + distance + ", date=" + date + ", myTime=" + myTime
				+ ", city=" + city + "]";
	}
	public Sport(String nameRun, double distance, String date, String myTime, String city) throws ParseException, Exception {
		super();
		this.nameRun = nameRun;
		this.distance = distance;
		this.date = Helpers.parseDate(date);
		this.myTime = myTime;
		this.city = city;
	}



}