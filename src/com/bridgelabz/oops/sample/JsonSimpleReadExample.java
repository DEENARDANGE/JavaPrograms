package com.bridgelabz.oops.sample;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonSimpleReadExample {

    public static void main(String[] args) throws org.json.simple.parser.ParseException {

        JSONParser parser = new JSONParser();

        try {

            Object obj = parser.parse(new FileReader("C:\\\\Users\\\\lenovo\\\\eclipse-workspace\\\\FuctionalPgm\\\\src\\\\com\\\\bridgelabz\\\\oops\\\\sample\\\\ex1.json"));

            JSONObject jsonObject = (JSONObject) obj;
            System.out.println(jsonObject);

            String name = (String) jsonObject.get("name");
            System.out.println(name);

            String age = (String) jsonObject.get("Age");
            System.out.println(age);

            // loop array
            JSONArray info = (JSONArray) jsonObject.get("info");
            Iterator<Object> iterator = info.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

