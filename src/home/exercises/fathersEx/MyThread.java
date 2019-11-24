package home.exercises.fathersEx;


/**
 * @author anna
 */



public class MyThread extends Thread {
   public static void main( String[] args )throws Exception {
        MyThread myThread = new MyThread();
        myThread.start();
       System.out.print(Thread.currentThread().getName());
    }

    public class Method {
               public void run() {
            System.out.print("This is my Thread");
            someMethod();
        }
        private void someMethod(){
             throw  new  RuntimeException();
        }
    }
}
