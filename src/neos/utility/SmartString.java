package neos.utility;

import neos.model.News;

import java.util.ArrayList;
import java.util.Arrays;

public class SmartString {
    private String text;

    public SmartString(String text) {
        this.text = text;
    }

    public ArrayList<News> filter() {
        String title = "";
        String linkDetail = "";
        String imgLink = "";
        String date = "";

        ArrayList<News> newsList = new ArrayList<>();

        // cắt chuỗi
        String[] items = text.split("<item>\n");

        for (int i = 0; i < items.length; i++) {
            String item = items[i];

            try {
                title = item.substring( item.indexOf("<title><![CDATA[") + 16, item.indexOf("]]></title>") );

                linkDetail = item.substring( item.indexOf("<link><![CDATA[") + 15, item.indexOf("]]></link>") );

                imgLink = item.substring( item.indexOf("<img src=\"") + 10, item.indexOf("\"/></a>") );

                date = item.substring(item.indexOf("<pubDate><![CDATA[") + 18, item.indexOf("]]></pubDate>"));

                newsList.add( new News(title, linkDetail, imgLink, date) );

            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Lỗi: " + e.getMessage());
            }
        }

        return newsList;
    }
}
