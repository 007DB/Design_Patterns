package com.Factory;


public class Factory {


    public  static Website getWebsite(WebsiteChoice siteType) {
        if ( WebsiteChoice.BLOG.equals(siteType)) {
            return new Blog();
        } else if (WebsiteChoice.SHOP.equals(siteType)) {
            return new Shop();
        } else {
            return null;
        }
    }



}



