package pl.mchyb.mypage.geoip;

import static org.junit.Assert.*;

import org.junit.Test;

import pl.mchyb.mypage.helpers.Helpers;

public class GeoIpv4Test {

	@Test
	public void test_001() {

		assertEquals(GeoIPv4.getLocation(Helpers.getMyIp()).getCity(), "Poznan");
	}

	@Test
	public void test_002() {

		assertEquals(GeoIPv4.getLocation("72.229.28.185").getCity(), "New York");
	}
}
