package com.myCompany;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * Created by arpit on 9/2/16.
 */
public class UnicodeError {

    public static void main(String[] args){
        File file = new File("/home/arpit/IdeaProjects/data2.txt");
        /*Scanner scanner = new Scanner(System.in);
        try{
            OutputStreamWriter writer = new OutputStreamWriter(
                    new FileOutputStream(file)
            );
            String data = scanner.nextLine();
            writer.write(data);
            writer.close();
            System.out.println("Data Written : " + data);
        }catch(Exception e){
            System.out.println("Error Writing the file");
        }*/

        try{
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(new FileInputStream(file))
            );
            String line = "",  response = "";
            while((line = reader.readLine()) != null) response += line;
            System.out.println("Data read : " + response);
        }catch(Exception e){
            System.out.println("Error Reading the file");
        }
    }

}
