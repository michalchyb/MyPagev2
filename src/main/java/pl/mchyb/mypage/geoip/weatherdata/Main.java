package pl.mchyb.mypage.geoip.weatherdata;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Data
@AllArgsConstructor
@Embeddable
public class Main {

	private float temp;
	private float humidity;
	private float pressure;
	private float temp_min;
	private float temp_max;
	
	public Main() {
		
	}
}
