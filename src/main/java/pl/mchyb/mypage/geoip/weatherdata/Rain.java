package pl.mchyb.mypage.geoip.weatherdata;

public class Rain {

	private String h;

	public String geth() {
		return h;
	}

	public void seth(String h) {
		this.h = h;
	}

	@Override
	public String toString() {
		return "ClassPojo [h = " + h + "]";
	}
}
