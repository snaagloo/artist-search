package com.example.demo.service.artist;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "rss")
public class Rss {
    @JacksonXmlProperty(localName = "channel")
    private Channel channel;

    public Channel getChannel() { return channel; }
    public void setChannel(Channel channel) { this.channel = channel; }
}
