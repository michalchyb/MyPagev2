package pl.mchyb.mypage.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Run extends Sport {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	public long getId() {
		return id;
	}

	public Run(String nameRun, double distance, Date date, String myTime, String city, long id) {
		super(nameRun, distance, date, myTime, city);
		this.id = id;
	}

	public Run() {
	}
}
