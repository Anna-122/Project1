package home.exercises.lesson14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("d*b");
        Matcher matcher = pattern.matcher("ddb");
        boolean b = matcher.matches();
        System.out.println(b);
    }
}


