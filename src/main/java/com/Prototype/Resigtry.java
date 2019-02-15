package com.Prototype;


import java.util.HashMap;
import java.util.Map;


public class Resigtry {

    private Map<String,WebsiteItem> items = new HashMap<String, WebsiteItem>();

    public Resigtry(){
        loadItems();
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
