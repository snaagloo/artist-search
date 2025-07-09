package com.example.demo.service;

import com.example.demo.service.artist.Item;
import com.example.demo.service.artist.Rss;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class ManiaDBClientService {
    private final WebClient webClient;

    public ManiaDBClientService(WebClient webClient) {
        this.webClient = webClient;
    }

    public String getArtistData(String artistName) {
        String baseUrl = "http://www.maniadb.com/api/search/";
        String suffix = "/?sr=artist&display=10&key=example&v=0.5";

        String xmlResponse = webClient.get()
                .uri(baseUrl + artistName + suffix)
                .retrieve()
                .bodyToMono(String.class)
                .block();

//        Rss rss = webClient.get()
//                .uri(baseUrl + artistName + suffix)
//                .retrieve()
//                .bodyToMono(Rss.class)
//                .block();

        return xmlResponse;
//        System.out.println(rss);
//        return webClient.get()
//                .uri(baseUrl + artistName + suffix)
//                .retrieve()
//                .bodyToMono(Rss.class)
//                .block();
    }
}
