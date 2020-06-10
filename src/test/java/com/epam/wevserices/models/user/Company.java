package com.epam.wevserices.models.user;

public class Company {
    private String name;
    private String catchPhrase;
    private String bs;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void  setCatchPhrase(String catchPhrase){
        this.catchPhrase = catchPhrase;
    }
    public String getCatchPhrase(){
        return catchPhrase;
    }

    public void setBs(String bs){
        this.bs = bs;
    }
    public String getBs(){
        return bs;
    }
}
