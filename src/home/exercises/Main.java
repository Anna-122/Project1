package home.exercises;

public class Main {
    public static void main(String[] args) {
        Nails nail1 = new Nails(200,"red","bright");
        Nails nail2 = new Nails(350,"gold","picture");
        Nails nail3 = new Nails ();
        Nails nail4 = new Nails(300,"green");

        nail3.ShowNails();
        System.out.println();
        nail4.ShowNails();
        System.out.println();

        int res;
        res = nail1.PriceInDollars(32);
        System.out.println(res);
        System.out.println(nail2.PriceInDollars(40));
        res = nail3.PriceInDollars(34);
        res = nail4.PriceInDollars(27);


    }

}
