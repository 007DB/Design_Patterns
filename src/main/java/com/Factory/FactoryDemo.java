package com.Factory;

public class FactoryDemo {
    public static  void main(String[] arg){
    /*    Website site = Factory.getWebsite("blog");
        System.out.println(site.getPages());
*/


    Website site = Factory.getWebsite(WebsiteChoice.BLOG);
    System.out.println(site.getPages());

        site = Factory.getWebsite(WebsiteChoice.SHOP);

        System.out.println(site.getPages());

    }
}
