package com.Prototype;


import java.util.HashMap;
import java.util.Map;


public class Resigtry {

    private Map<String,WebsiteItem> items = new HashMap<String, WebsiteItem>();

    public Resigtry(){
        /*creating items in the load method put it in a registry whch gives us a movie */

        loadItems();
    }

    public WebsiteItem createItem(String type){
        WebsiteItem websiteItem= null;

        try {
            websiteItem = (WebsiteItem) (items.get(type)).clone();

        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return websiteItem;
    }



    private void loadItems() {
        Movies movie = new Movies();
        movie.setName("Titanic");
        movie.setRuntime("2 hrs");
        movie.setPrice("$24.00");
        items.put("Movie", movie);

    Book book = new Book();
    book.setNumberofPages(400);
    book.setName("Goosbumps");
    book.setPrice("$3.00");
        items.put("Book", book);

        }




}
