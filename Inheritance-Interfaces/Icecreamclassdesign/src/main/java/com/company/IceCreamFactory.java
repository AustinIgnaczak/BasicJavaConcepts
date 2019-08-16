package com.company;

public class IceCreamFactory {
    private String flavors;
    private int stock;
    private int dailyOutput;
    private int boxesAvail;

    public void makeIceCream(){
    }
    public void shipStock(){

    }

    public String getFlavors() {
        return flavors;
    }

    public void setFlavors(String flavors) {
        this.flavors = flavors;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getDailyOutput() {
        return dailyOutput;
    }

    public void setDailyOutput(int dailyOutput) {
        this.dailyOutput = dailyOutput;
    }

    public int getBoxesAvail() {
        return boxesAvail;
    }

    public void setBoxesAvail(int boxesAvail) {
        this.boxesAvail = boxesAvail;
    }
}
