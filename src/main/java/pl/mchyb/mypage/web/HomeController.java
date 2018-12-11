package pl.mchyb.mypage.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.mchyb.mypage.geoip.GeoIPv4;
import pl.mchyb.mypage.helpers.Helper;


@Controller
public class HomeController {
    @RequestMapping("/index")
    public String home() {
//        long ipAddress = new BigInteger(InetAddress.getByName("72.229.28.185").getAddress()).longValue();
        System.out.println(GeoIPv4.getLocation(Helper.getMyIp()));
        return "index";
    }
}
