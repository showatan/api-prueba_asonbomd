package model;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class Authuser {


public String json;

    public void params(Object data){
        //json = "json=" + data.toString();
        Gson gson = new Gson();
        String jsonString = gson.toJson(data);
        json =  jsonString;
    }

}
