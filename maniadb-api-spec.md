- API Specification for Maniadb
```sh
http://www.maniadb.com/api/search/[keyword]/?sr=[artist|album|song]&display=[1~100]&key=[apikey]&v=[version]
```

- API Specification for ManiaDB example
```sh
# 1. metallica 의 artist 정보
http://www.maniadb.com/api/search/metallica/?sr=artist&display=10&key=example&v=0.5

# 2. metallica 의 album 정보
http://www.maniadb.com/api/search/metallica/?sr=album&display=10&key=example&v=0.5

# 3. metallica 의 song 정보
http://www.maniadb.com/api/search/metallica/?sr=song&display=10&key=example&v=0.5
```

- API Specification for ManiaDB example response (1. metallica 의 artist 정보)
```xml
<?xml version="1.0" encoding="utf-8" ?>
<rss version="2.0" xmlns:maniadb="http://www.maniadb.com/api" >
    <channel>
        <title>
            <![CDATA[Maniadb Open API v0.5 : Search artist for "metallica"]]>
        </title>
        <link>www.maniadb.com</link>
        <description>
            <![CDATA[Maniadb Open API v0.5 : Search artist for "metallica"]]>
        </description>
        <lastBuildDate>Thu, 10 Jul 2025 02:22:51 +0900</lastBuildDate>
        <total>1</total>
        <start>1</start>
        <display>10</display>
        <maniadb:urlbase>
            <![CDATA[http://www.maniadb.com/artist/]]>
        </maniadb:urlbase>
        <item id="126929">
            <title>
                <![CDATA[Metallica]]>
            </title>
            <reference status="DEPRECATED">
                <![CDATA[]]>
            </reference>
            <demographic>
                <![CDATA[남성그룹]]>
            </demographic>
            <period>
                <![CDATA[1980s - ]]>
            </period>
            <link>
                <![CDATA[http://www.maniadb.com/artist/126929]]>
            </link>
            <image>
                <![CDATA[http://i.maniadb.com/images/artist/126/126929.jpg]]>
            </image>
            <maniadb:linkgallery>
                <![CDATA[http://www.maniadb.com/artist/126929/?o=g]]>
            </maniadb:linkgallery>
            <maniadb:linkdiscography>
                <![CDATA[http://www.maniadb.com/artist/126929/?o=l]]>
            </maniadb:linkdiscography>
            <pubDate>
                <![CDATA[Thu, 10 Jul 2025 02:22:51 +0900]]>
            </pubDate>
            <author>
                <![CDATA[maniadb]]>
            </author>
            <description>
                <![CDATA[]]>
            </description>
            <guid>
                <![CDATA[http://www.maniadb.com/artist/126929]]>
            </guid>
            <comments>
                <![CDATA[http://www.maniadb.com/artist/126929#TALK]]>
            </comments>
            <maniadb:majorsongs status="DEPRECATED">
                <song id="1143627">
                    <id>
                        <![CDATA[1143627]]>
                    </id>
                    <name>
                        <![CDATA[...And Justice For All]]>
                    </name>
                    <merchants>
                        <shop name="youtube"></shop>
                    </merchants>
                </song>
                <song id="1143584">
                    <id>
                        <![CDATA[1143584]]>
                    </id>
                    <name>
                        <![CDATA[Master Of Puppets]]>
                    </name>
                    <merchants>
                        <shop name="youtube"></shop>
                    </merchants>
                </song>
                <song id="1198237">
                    <id>
                        <![CDATA[1198237]]>
                    </id>
                    <name>
                        <![CDATA[Frantic]]>
                    </name>
                    <merchants>
                        <shop name="youtube"></shop>
                    </merchants>
                </song>
                <song id="1143653">
                    <id>
                        <![CDATA[1143653]]>
                    </id>
                    <name>
                        <![CDATA[My Friend Of Misery]]>
                    </name>
                    <merchants>
                        <shop name="youtube"></shop>
                    </merchants>
                </song>
                <song id="1143586">
                    <id>
                        <![CDATA[1143586]]>
                    </id>
                    <name>
                        <![CDATA[Welcome Home [Sanitarium]]]>
                    </name>
                    <merchants>
                        <shop name="youtube"></shop>
                    </merchants>
                </song>
            </maniadb:majorsongs>
            <maniadb:majorsonglist>
                <![CDATA[...And Justice For All / Master Of Puppets / Frantic / My Friend Of Misery / Welcome Home [Sanitarium]]]>
            </maniadb:majorsonglist>
            <maniadb:majoractivity status="DEPRECATED"></maniadb:majoractivity>
            <maniadb:majormembers status="DEPRECATED">
                <maniadb:artist id="123221">
                    <id>
                        <![CDATA[123221]]>
                    </id>
                    <name>
                        <![CDATA[James Hetfield]]>
                    </name>
                </maniadb:artist>
                <maniadb:artist id="125344">
                    <id>
                        <![CDATA[125344]]>
                    </id>
                    <name>
                        <![CDATA[Lars Ulrich]]>
                    </name>
                </maniadb:artist>
                <maniadb:artist id="119912">
                    <id>
                        <![CDATA[119912]]>
                    </id>
                    <name>
                        <![CDATA[Dave Mustaine]]>
                    </name>
                </maniadb:artist>
                <maniadb:artist id="123383">
                    <id>
                        <![CDATA[123383]]>
                    </id>
                    <name>
                        <![CDATA[Jason Newsted]]>
                    </name>
                </maniadb:artist>
                <maniadb:artist id="125100">
                    <id>
                        <![CDATA[125100]]>
                    </id>
                    <name>
                        <![CDATA[Kirk Hammett]]>
                    </name>
                </maniadb:artist>
            </maniadb:majormembers>
            <maniadb:relatedartistlist>
                <![CDATA[James Hetfield (기타, 보컬), Lars Ulrich (드럼), Dave Mustaine (기타), Jason Newsted (베이스 기타), Kirk Hammett (기타)]]>
            </maniadb:relatedartistlist>
        </item>
    </channel>
</rss>
```