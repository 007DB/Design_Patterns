package com.Prototype;

public class PrototypeDemo {
    public static void main(String args []) {
        Resigtry reg = new Resigtry();
        Movies movie = (Movies) reg.createItem("Movie");

        movie.setName("Destiny movie");

        System.out.println("");
        System.out.println(movie.getName());
        System.out.println(movie.getRuntime());


      Movies anotherMovie = ( Movies) reg.createItem("Movie");
      anotherMovie.setName("Kasper the friendly Ghost ");
      System.out.println(anotherMovie.getName());

      Book book = (Book) reg.createItem("Book");

      book.setName("Destiny Book");
      book.setNumberofPages(400000);
System.out.println(book.getName());
      System.out.println(book.getNumberofPages());





    }
}


