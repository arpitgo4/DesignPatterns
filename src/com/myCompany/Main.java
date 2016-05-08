package com.myCompany;

import org.json.JSONArray;
import org.json.JSONObject;

public class Main {

    public static void main(String[] args) {
        JSONObject obj = new JSONObject();
        try {
            obj.put("Name", "Arpit");
            obj.put("Chomu", "Ujjwal");
        }catch(Exception e){}
        JSONParsing parser = new JSONParsing();
        System.out.println(obj);
        parser.parseJSON(obj);

        System.out.println();
        System.out.println();

        JSONObject obj1 = new JSONObject();
        try{
            String[] names = {
                "Arpit", "Devank"
            };
            obj1.put("Names", names);
        }catch(Exception e){}
        System.out.println(obj1);
        parser.parseJSONArray(obj1);

        System.out.println();
        System.out.println();

        JSONObject obj2 = new JSONObject();
        try{
            JSONArray arr = new JSONArray();
            arr.put("Arpit");
            arr.put("Devank");
            obj2.put("Names", arr);
        }catch(Exception e){}
        System.out.println(obj2);
        parser.parseJSONArray2(obj2);

    }
}
