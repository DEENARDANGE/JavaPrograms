package com.bridgelabz.oops.sample;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJSONExample
{
    @SuppressWarnings("unchecked")
    public static void main(String[] args)
    {
        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();
         
        try (FileReader reader = new FileReader("C:\\Users\\lenovo\\eclipse-workspace\\FuctionalPgm\\src\\com\\bridgelabz\\oops\\invetaryjson\\Inventory.json"))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);
 
            JSONArray invenList = (JSONArray) obj;
            System.out.println(invenList);
             
            //Iterate over employee array
            invenList.forEach( inv -> parseInvenObject( (JSONObject) inv ) );
 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
 
    private static void parseInvenObject(JSONObject inventory)
    {
        //Get employee object within list
        JSONObject invenObject = (JSONObject) inventory.get("inventory");
         
        //Get employee first name
        String Name = (String) invenObject.get("name");   
        System.out.println(Name);
         
      //Get employee last name
        double price = (double) invenObject.get("price"); 
        System.out.println(price);
         
        //Get employee website name
        double weight = (double) invenObject.get("weight");   
        System.out.println(weight);
    }
}