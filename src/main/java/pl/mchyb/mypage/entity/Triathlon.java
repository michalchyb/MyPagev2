package pl.mchyb.mypage.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.json.simple.parser.ParseException;

@Entity
public class Triathlon extends Sport {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	public long getId() {
		return id;
	}

	public Triathlon(String nameRun, double distance, String date, String myTime, String city)
			throws ParseException, Exception {
		super(nameRun, distance, date, myTime, city);
	}

}
