package com.Prototype;

public abstract class WebsiteItem implements Cloneable {
    private String name ;
    private  String url;
    private String price;


    @Override
    protected  Object clone() throws CloneNotSupportedException{
        return super.clone();
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }


}
