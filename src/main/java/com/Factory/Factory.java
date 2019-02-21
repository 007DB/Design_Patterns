package com.Factory;


public class Factory {
    public  static Website getWebsite(String siteType) {
        if ("blog".equals(siteType)) {
            return new Blog();
        } else if ("shop".equals(siteType)) {
            return new Shop();
        } else {
            return null;
        }
    }



}



