package com.Singleton;

public class DBsingletonDemo {
    public static void main( String[] args){
        DbSingleton instance = DbSingleton.getInstance();
     //DbSingleton TestConstructor = new DbSingleton();// will not allow you to do this

        System.out.println(instance);

        //if i make another instance which is the same should give you the same instance
        DbSingleton anotherInstance = DbSingleton.getInstance();
                System.out.println(anotherInstance);
    }

}
