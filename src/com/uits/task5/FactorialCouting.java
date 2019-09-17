package com.uits.task5;

    public class FactorialCouting {
        private static double n;
        private static double d;
        public static void main( String[] args ) {
            int n = getRandom(10);
            double d = factorial(n);
            System.out.println("Факториал числа " +n+ " = " +d);
        }
        public static int getRandom( int i ) {
            double r = Math.random()*i;
            int rand = (int)r;
//            int rand = (int)Math.random()*i;
          return rand;
        }

        private static long factorial( double p ) {
            long result = 1;
            int i;
            for (i = 1; i <= p; i++) {
//                System.out.print(result+"*"+i+"=");
                result = result * i;
//                System.out.println(result);
            } return result;
        }
    }






    /*public static int factorial(int n)
        {
            if (n == 0) return 1;
            return n * factorial(n-1);
        }*/