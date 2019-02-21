package com.Factory;

public class Shop extends Website {

    @Override
    public void  createWebsite (){
        pages.add(new ShopingCart());
        pages.add(new ItemPage() );
        pages.add(new Contact());
    }
}
