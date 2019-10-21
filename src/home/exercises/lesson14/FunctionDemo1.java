package home.exercises.lesson14;
import java.util.function.Function;
public class FunctionDemo1 {
    public static void main(String[] args) {
        Function<Double, Long> function = l -> Math.round(l);
        System.out.println(function.apply(5.7));
    }
}
