package com.Singleton;

public class DbSingleton {

    private  static volatile DbSingleton instance = null;


    //protectected so that it cant be instantion through reflection
    private  DbSingleton (){
        if ( instance != null){
            throw new RuntimeException("use get Instance Method to create instance");
        }
    }

    public static DbSingleton getInstance() {

        if ( instance ==null) {

            //if take turns using thread
            synchronized (DbSingleton.class){
                if (instance == null){
                    instance = new DbSingleton();
                }
            }


        }

        return instance;


        // lazy loaded example  above



    }
}
