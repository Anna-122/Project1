/*
Есть текст со списками цен. Извлечь из него цены в USD, RUR, EU.
– пример правильных выражений: 23.78 USD.
– пример неправильных выражений: 22 UDD, 0.002 USD.
*/
package kpi.laba4;
import java.util.regex.*;

public class PriceList {

    public static void main( String args[] ) {
        int count = 0;
        // Строка для сканирования
        String s = "Цены 30.06 USD 50.30 RUS 60.12 CHF 11,23 23.78 USD";
        String pattern = "\\d+(.\\d{1,2}) [USDRUSCHF]{2,3}";
        // Создание Pattern объекта
        Pattern p = Pattern.compile(pattern);

        // Создание matcher объекта
        Matcher m = p.matcher(s);
        while (m.find()) {
            count ++;
            System.out.println("Список цен: " + m.group());
        }
        if (count==0) {
            System.out.println("СОВПАДЕНИЙ НЕ НАЙДЕНО");
        }
    }
}
