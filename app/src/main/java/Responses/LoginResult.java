package Responses;

import com.google.gson.annotations.SerializedName;

public class LoginResult {
    @SerializedName("token")
    private String token;

    @SerializedName("user")
    private Object user;


    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Object getUser() {
        return user;
    }

    public void setUser(Object user) {
        this.user = user;
    }
}
