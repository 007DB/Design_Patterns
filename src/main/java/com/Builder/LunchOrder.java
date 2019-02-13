package com.Builder;

public class LunchOrder {


    /* builder class builder class  its own container until we tell it to make what we want  after adding a basic contracter */
    public static class Builder {
        private String Bread;
        private String Condiments;
        private String meat;
        private String drink;
/*basic constructor*/
        public Builder() {

        }
/*retuning an instance of its self*/
        public LunchOrder build() {
            return new LunchOrder(this);
        }

/*return the istances of the builder which is this*/
        public Builder typeofBread(String Bread) {
            this.Bread = Bread;
            return this;
        }

        public Builder typeofCondiments(String condiments) {
            this.Condiments = condiments;
            return this;
        }

        public Builder typeofmeat(String meat) {
            this.meat = meat;
            return this;
        }

        public Builder typeofdrink(String drink) {
            this.drink = drink;
            return this;
        }


    }


    private final String Bread;
    private final String Condiments;
    private final String meat;
    private final String drink;

    private LunchOrder(Builder builder) {
        this.Bread = builder.Bread;
        this.Condiments =builder.Condiments;
        this.drink = builder.drink;
        this.meat = builder.meat;
    }

    public String getCondiments() {
        return Condiments;
    }

    public String getDrink() {
        return drink;
    }

    public String getBread() {
        return Bread;
    }

    public String getMeat() {
        return meat;
    }
}

