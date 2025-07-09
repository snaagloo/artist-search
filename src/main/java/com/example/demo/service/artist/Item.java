package com.example.demo.service.artist;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

public class Item {
    @JacksonXmlProperty(localName = "title")
    private String title;

    @JacksonXmlProperty(localName = "demographic")
    private String demographic;

    public String getTitle() {return title; }
    public void setTitle(String title) {this.title = title; }

    public String getDemographic() {return demographic; }
    public void setDemographic(String demographic) {this.demographic = demographic; }
}
