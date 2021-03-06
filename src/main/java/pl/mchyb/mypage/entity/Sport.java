package pl.mchyb.mypage.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

@MappedSuperclass
public abstract class Sport {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	@NotEmpty
	@NotNull
	@Size(min = 5)
	private String nameRun;
	@Column(name = "distance")
	@NotEmpty
	@NotNull
	@Positive
	private double distance = 0.0;
	@NotEmpty
	@NotNull
	private Date date;
	private String myTime;
	@NotEmpty
	@NotNull
	@Size(min = 3)
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

	public Sport(String nameRun, double distance, Date date, String myTime, String city) {
		this.nameRun = nameRun;
		this.distance = distance;
		this.date = date;
		this.myTime = myTime;
		this.city = city;
	}

	public Sport() {
	}
}
