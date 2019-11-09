package com.uits.task13;

import java.util.Scanner;
import java.util.regex.Pattern;

    class Authentification {

        /*   public static void main( String[] args ) {
               public static boolean check (String u ){
                   Pattern pattern = Pattern.compile("^[a-zA-Z_]{6,15}$");


                   InputString("login");
                   if (Authentification.check(password)) ;


                   System.out.print("Input password: ");
                   String password = in.nextString();
                   if (Authentification.check(password)) ;
                   System.out.printf("Username: %s  Password: %s   \n", username, password);
                   System.out.println("password валиден");

                   in.close();


           public static InputString(String message) {
                       Scanner in = new Scanner(System.in);
                       System.out.print(message + ": ");
                       String str = in.nextString();
                       return str;
                   }
               }


           private static void InputString( String login ) {
           }
       }*/
        public static void auth() {
            Pattern pattern = Pattern.compile("^[a-zA-Z_]{6,15}$");
            String login = InputString("login");
            if (login.equals("") ){
                System.out.print ( "Аутентифецировался покупатель" );
            } else {
                    if (login.equals("^[a-zA-Z_]{6,15}$")) {
                        System.out.print("login менеджера валиден");
                        String password = InputString("password");
                    }

            }
        }

        public static String InputString( String message ) {
            String str = null;
            Scanner in = new Scanner(System.in);
            System.out.print(message + ": ");
            while (in.hasNext()) {
                str = in.nextLine();
            }
            in.close();
            return str;

        }
    }