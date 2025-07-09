package com.example.demo.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@Service
public class ManiaDBClientService {
    private final WebClient webClient;

    public ManiaDBClientService(WebClient webClient) {
        this.webClient = webClient;
    }

    public String getArtistData(String artistName) {
        String baseUrl = "http://www.maniadb.com/api/search/";
        String suffix = "/?sr=artist&display=10&key=example&v=0.5";
        String encodedArtist = URLEncoder.encode(artistName, StandardCharsets.UTF_8);
        String uri = baseUrl + encodedArtist + suffix;

        String xml = webClient.get()
                .uri(uri)
                .retrieve()
                .bodyToMono(String.class)
                .block();

        System.out.println(xml);
        return xml;

    }
}
