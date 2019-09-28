package home.exercises;

public class Nails {
    int price;
    String color;
    String disign;

    Nails( int pr, String col, String dis ) {
        price=pr;
        color=col;
        disign=dis;
    }
    Nails( int pr, String col){
        price=pr;
        color=col;
        disign="default";
    }
    Nails(){
        price= 0;
        color="default";
        disign="default";
    }
     public void ShowNails(){
         System.out.println("Color "+color+" Price "+price+" Disign "+disign);
     }
    public int PriceInDollars(int i){
        System.out.println("перевод из гривны в доллары "+ price*i);
        return price*i;
    }

}