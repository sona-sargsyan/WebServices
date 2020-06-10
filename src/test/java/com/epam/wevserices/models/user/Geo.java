package com.epam.wevserices.models.user;

public class Geo {
    private String lat;
    private String lng;

    public void  setLat(String lat){
        this.lat=lat;
    }
    public String getLat(){
        return lat;
    }

    public void  setLng(String lng){
        this.lng=lng;
    }
    public String getLng(){
        return lng;
    }
}
