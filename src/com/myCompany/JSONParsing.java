package com.myCompany;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Created by arpit on 6/2/16.
 */
public class JSONParsing {

    public void parseJSON(JSONObject json){
        try {
            System.out.println(json.getString("Name"));
            System.out.println(json.getString("Chomu"));
        }catch(Exception e){}
    }

    public void parseJSONArray(JSONObject json){
        try{
            String[] arr = (String[]) json.get("Names");
            for(int i = 0; i < arr.length; i++)
                System.out.println(arr[i]);
        }catch(Exception e){System.out.println(e);}
    }

    public void parseJSONArray2(JSONObject json){
        try{
            JSONArray arr = json.getJSONArray("Names");
            for(int i = 0; i < arr.length(); i++)
                System.out.println(arr.get(i));
        }catch(Exception e){System.out.println(e);}
    }

}
