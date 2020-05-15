package com.study.JSON_EX;


import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.util.stream.Stream;


public class RailwayMain {
    public static void main(String[] args) throws Exception{
        
        String url = "https://ptx.transportdata.tw/MOTC/v2/Rail/TRA/Station?$orderby=StationID&$top=10&$skip=100&$format=JSON";
        Reader reader = new  BufferedReader(new InputStreamReader(new URL(url).openStream(), "UTF-8"));
        JsonElement je = JsonParser.parseReader(reader);
        String json = je.toString();
        System.out.println(json);
        //24.990166, 121.312027
    }
}
