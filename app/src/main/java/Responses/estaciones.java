package Responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class estaciones {

    @SerializedName("code")
    public int code;

    @SerializedName("status")
    public String status;

    @SerializedName("estaciones")
    public Object response = null;


    public int getCode() {
        return code;
    }

    public String getStatus() {
        return status;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}
