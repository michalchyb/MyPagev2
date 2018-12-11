package pl.mchyb.mypage.helpers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class Helper {

    public static String getMyIp() {

        String ipAddress = "";
        try {
            URL url = new URL("http://bot.whatismyipaddress.com");

            BufferedReader bufferedReader =
                    new BufferedReader(new InputStreamReader(url.openStream()));

            ipAddress = bufferedReader.readLine().trim();
        } catch (Exception e) {
            ipAddress = "Cannot Execute Properly";
        }
        return ipAddress;
    }
}
