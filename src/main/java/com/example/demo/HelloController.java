package com.example.demo;

import com.example.demo.dto.Response;
import com.example.demo.service.ManiaDBClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
    public List<Response> getArtist(@RequestParam String name) {
        return maniaDBClientService.getArtistData(name);
    }
}
