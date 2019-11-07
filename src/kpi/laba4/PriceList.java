package kpi.laba4;
import java.util.regex.*;

public class PriceList {
    String regex;
    String s = "Цены 30.06 USD 50.30 RUS 60.12 CHF 11,23 23.78 USD" ;
    Pattern p1 = Pattern.compile(regex);
    Matcher m1 = p1.matcher(s);
        while (m1.find()) {
        System.out.println("Список цен: " + m1.group());}

    public PriceList() {
        regex = "(\\d+\\.)(\\w+{2,3})*";
    }


}

