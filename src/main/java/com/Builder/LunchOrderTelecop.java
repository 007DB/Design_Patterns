package com.Builder;

public class LunchOrderTelecop {
    private String Bread;



    private String Condiments;
    private  String meat;
    private String drink;

    public LunchOrderTelecop (String Bread, String Condiments){
        this.Bread =Bread;
        this.Condiments =Condiments;
        }

        public LunchOrderTelecop (String Bread, String Condiments,String drink){
        this.Bread=Bread;
        this.Condiments=Condiments;
        this.drink = drink;
        }

        public LunchOrderTelecop( String Bread, String Condiments, String drink, String meat) {
            this.Bread = Bread;
            this.Condiments = Condiments;
            this.drink=drink;
            this.meat=meat;
        }
    public String getBread() {
        return Bread;
    }

    public String getCondiments() {
        return Condiments;
    }

    public String getMeat() {
        return meat;
    }

    public String getDrink() {
        return drink;
    }
}

