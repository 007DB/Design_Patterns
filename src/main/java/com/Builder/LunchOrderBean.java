package com.Builder;

public class LunchOrderBean {

    private String Bread;
    private String Condiments;
    private  String meat;
    private String drink;

    public LunchOrderBean(){

    }

    public String getBread() {
        return Bread;
    }

    public void setBread(String bread) {
        Bread = bread;
    }

    public String getCondiments() {
        return Condiments;
    }

    public void setCondiments(String condiments) {
        Condiments = condiments;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }


}
