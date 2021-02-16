package com.rudra.cryptoapp.models;

public class Trade {

    //Models
    String name;
    String time;
    String entryPoint;

    public Trade() {
    }

    public Trade(String name, String time, String entryPoint) {
        this.name = name;
        this.time = time;
        this.entryPoint = entryPoint;
    }

    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getEntryPoint() {
        return entryPoint;
    }

    public void setEntryPoint(String entryPoint) {
        this.entryPoint = entryPoint;
    }
}
