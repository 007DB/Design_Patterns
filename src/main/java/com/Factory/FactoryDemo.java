package com.Factory;

public class FactoryDemo {
    public static  void main(String[] arg){
        Website site = Factory.getWebsite("blog");
        System.out.println(site.getPages());

    }
}
