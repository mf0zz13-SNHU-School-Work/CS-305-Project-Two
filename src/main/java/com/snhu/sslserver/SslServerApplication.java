package com.snhu.sslserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@SpringBootApplication
public class SslServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SslServerApplication.class, args);
    }
}

@RestController
class ServerController {
    private static String getHash(String data) {
        String hash = null;

        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] byteHash = md.digest(data.getBytes());
            hash = byteToString(byteHash);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return hash;
    }

    private static String byteToString(byte[] bytes) {
        StringBuilder sb = new StringBuilder();

        for (byte b: bytes)
            sb.append(String.format("%02x",b));

        return sb.toString();
    }


//FIXME: Add route to enable check sum return of static data example:  String data = "Hello World Check Sum!";

    @RequestMapping("/hash")
    public String myHash() {
        String data = "Hello Michael Foster this is a Check Sum!";
        String hash = getHash(data);

        return "<p>data: " + data + "</p><p>SHA-256 CheckSum Value: " + hash + "</p>";
    }

}