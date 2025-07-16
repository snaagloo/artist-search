package com.example.demo.service;

import com.example.demo.dto.Item;
import com.example.demo.dto.Member;
import com.example.demo.dto.Response;
import com.example.demo.dto.Rss;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.lang.reflect.Array;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

@Service
public class ManiaDBClientService {
    private final WebClient webClient;

    public ManiaDBClientService(WebClient webClient) {
        this.webClient = webClient;
    }

    public List<Response> getArtistData(String artistName) {
        String baseUrl = "http://www.maniadb.com/api/search/";
        String suffix = "/?sr=artist&display=10&key=example&v=0.5";
        String encodedArtist = URLEncoder.encode(artistName, StandardCharsets.UTF_8);
        String uri = baseUrl + encodedArtist + suffix;

        String xml = webClient.get()
                .uri(uri)
                .retrieve()
                .bodyToMono(String.class)
                .block();

        List<Response> responseList = new ArrayList<>();

        try {
            XmlMapper mapper = new XmlMapper();
            Rss rss = mapper.readValue(xml, Rss.class);


            for (Item item : rss.channel.item) {
                Response response = new Response();
                System.out.println("🎤 아티스트 이름: " + item.title);
                response.artist_name = item.title;

                System.out.println("👥 구성: " + item.demographic);
                response.demographic = item.demographic;

                System.out.println("🎧 대표곡 리스트: " + item.maniadb_majorsonglist);
                response.majorsongs = item.maniadb_majorsonglist;

                System.out.println("👥 관련 아티스트들:");
                System.out.println(item.maniadb_relatedartistlist);
                response.related_artists = item.maniadb_relatedartistlist;

//                System.out.println(item.maniadb_majormembers);
//                if (item.maniadb_majormembers != null) {
//                    for (Member m : item.maniadb_majormembers) {
//                        System.out.println("- " + m.name);
//                    }
//                }
                System.out.println("---------------");

                responseList.add(response);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println(xml);
//        return xml;
        return responseList;
    }
}
