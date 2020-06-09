package Responses;

import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Array;

public class EstacionesResponse {

    @SerializedName("id")
    public int id;

    @SerializedName("no_estacion")
    public int no_estacion;

    @SerializedName("nombre")
    public String nombre;

    @SerializedName("direccion")
    public String direccion;

    @SerializedName("telefono")
    public String telefono;

    @SerializedName("long")
    public String long1;

    @SerializedName("lat")
    public String lat1;

    public int getId() {
        return id;
    }

    public int getNo_estacion(){
        return no_estacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion(){
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getLong1() {
        return long1;
    }

    public String getLat1() {
        return lat1;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNo_estacion(int no_estacion) {
        this.no_estacion = no_estacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setLong1(String long1) {
        this.long1 = long1;
    }

    public void setLat1(String lat1) {
        this.lat1 = lat1;
    }
}
