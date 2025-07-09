package com.example.demo;

import com.example.demo.service.ManiaDBClientService;
import com.example.demo.service.artist.Item;
import com.example.demo.service.artist.Rss;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final ManiaDBClientService maniaDBClientService;

    public HelloController(ManiaDBClientService maniaDBClientService) {
        this.maniaDBClientService = maniaDBClientService;
    }


    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }

    @GetMapping("/artist")
    public String getArtist(@RequestParam String name) {
        return maniaDBClientService.getArtistData(name);
    }
}
