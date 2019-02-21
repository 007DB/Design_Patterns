package com.Factory;

import sun.jvm.hotspot.debugger.Page;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {

    protected List<com.Factory.Page> pages = new ArrayList<com.Factory.Page>();

    public List<com.Factory.Page> getPages(){
    return  pages;
    }

    public Website(){
        this.createWebsite();
    }
public  abstract void createWebsite();
}




