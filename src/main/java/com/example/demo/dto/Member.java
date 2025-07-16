package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Member {
    @JacksonXmlProperty(isAttribute = true, localName = "id")
    public String attrId; // 속성 id 저장

    public String id;     // 태그 <id> 값 저장 (있다면)

    public String name;
}