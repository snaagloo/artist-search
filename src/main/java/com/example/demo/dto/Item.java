package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Item {
    @JacksonXmlProperty(isAttribute = true)
    public String id;

    public String title;
    public String demographic;
    public String image;
    public String description;

    @JacksonXmlProperty(localName = "majorsonglist")
    public String maniadb_majorsonglist;

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "song")
    public List<Song> maniadb_majorsongs;


//    1 --- 왜 안나오지???
    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "artist")
    public List<Member> maniadb_majormembers;

//  2 --- 일단 이거라도
    @JacksonXmlProperty(localName = "relatedartistlist")
    public String maniadb_relatedartistlist;
}

