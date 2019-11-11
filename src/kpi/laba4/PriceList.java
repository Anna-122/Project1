/*Есть текст со списками цен. Извлечь из него цены в USD, RUR, EU.
– пример правильных выражений: 23.78 USD.
– пример неправильных выражений: 22 UDD, 0.002 USD.*/
package kpi.laba4;
import java.util.regex.*;

public class PriceList {
    public static void main( String[] args ) {
        int count = 0;
// Строка для сканирования
        String s = "Цены 6.267 RUR 30.06 USD 50.30 RUR 50f32 RUR 60.12 CHF 11,23 23.78 UDD 23.98 USD 15.23 EU";
// Регулярное выражение
        String regex = "\\d+[.]\\d{2}\\s(USD|EU|RUR)";
// Создание Pattern объекта
        Pattern p1 = Pattern.compile(regex);
// Создание matcher объекта
        Matcher m1 = p1.matcher(s);
        while (m1.find()) {
            count ++;
            System.out.println("Список цен: " + m1.group());
        }
        if (count==0) {
            System.out.println("СОВПАДЕНИЙ НЕ НАЙДЕНО");
        }
    }
}


