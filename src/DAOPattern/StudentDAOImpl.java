package DAOPattern;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * Created by arpit on 2/2/16.
 */
public class StudentDAOImpl implements StudentDAO {

    @Override
    public String getName() {
        try{
            BufferedReader reader = getReaderForFile("/home/arpit/IdeaProjects/data.txt");
            String line , response = "";
            while ((line = reader.readLine()) != null) response += line;
            return response;
        }catch(Exception e){
            return "Error Reading File e : " + e;
        }
    }


    private BufferedReader getReaderForFile(String filePath){
        try{
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(new FileInputStream(
                            new File(filePath)
                    ))
            );
            return reader;
        }catch(Exception e){
            return null;
        }
    }
}
