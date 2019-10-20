 package com.uits.task16;
import java.util.concurrent.Callable;
import java.util.function.Predicate;
public class PredicateDemo1 {
    public static void main( String[] args ) {
       () -> {
            return System.out.println("I love Java!");
        }
//(параметры) -> {тело метода}
       // Callable<Integer> c = () -> 42;


    }
}

