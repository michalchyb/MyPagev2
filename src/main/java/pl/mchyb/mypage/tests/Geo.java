package pl.mchyb.mypage.tests;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Embeddable
public class Geo {

	private String lat;
	private String lng;

	public Geo() {
	}

}
