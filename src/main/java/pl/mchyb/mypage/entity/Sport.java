package pl.mchyb.mypage.entity;


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

}
