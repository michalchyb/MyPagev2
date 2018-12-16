package pl.mchyb.mypage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.mchyb.mypage.geoip.GeoIPv4;
import pl.mchyb.mypage.helpers.Helpers;


@Controller
public class HomeController {
    @RequestMapping("/index")
    public String home() {
        System.out.println(GeoIPv4.getLocation(Helpers.getMyIp()));
        return "index";
    }
}
