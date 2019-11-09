package com.uits.task16;

import java.util.List;
import java.util.Arrays;

      interface FunctionPrint {
    void call();
}

class PredicateDemo1 {
    public static void main( String[] args ) {
        String firstWord = "I love";
        FunctionPrint function = () -> System.out.println(firstWord + " Java!"); //лямбда выражение как метод интерфеса FunctionPrint
        function.call(); //вызов лямбды

        System.out.println();
        System.out.println("****** Примеры оптимизации кода с помощью лямбда выражений ******");
        System.out.println("Классический цикл");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println("Тот же цикл через лямбда");
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        numbers.forEach(( Integer value) -> System.out.println(value));


        System.out.println("Все тот же цикл через лямбда и оператор ::");
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        numbers.forEach(System.out::println);
//        list.stream().map((x) -> x*x).forEach(System.out::println);
    }
}

