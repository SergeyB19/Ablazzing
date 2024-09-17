package com.example.interfaces.dependency_inversion.interface_inheritance;

public interface Eatable {
   default void eat(){
       System.out.println("Объект ест");
   };
}
