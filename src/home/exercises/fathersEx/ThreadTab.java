package home.exercises.fathersEx;

public class ThreadTab extends Thread {
    public static void main( String[] args ) {
        ThreadTab myThread = new ThreadTab();
        myThread.start();

        System.out.println("Двумерная таблица умножения");

        int k = 1;
        while (k <= 10) {
            int i = 1;
            while (i < 10) {
                System.out.print(i * k + " ");
                i++;
            }
            System.out.println(i * k);
            k++;
        }
        System.out.println("Одномерная таблица умножения 3 на 10 ");

        int l = 1;
        while (l <= 3) {
            System.out.println(l * 10 + " ");
            l++;
        }
    }

    public void run() {
        System.out.println("Важная работа выполняется в потоке " + getName());
    }
}

