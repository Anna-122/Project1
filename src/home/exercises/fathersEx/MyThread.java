package home.exercises.fathersEx;

/**
 * @author anna
 */



public class MyThread  {
   public static void main( String[] args )throws Exception {
        MyThread myThread = new MyThread();
        myThread.start();
       System.out.print(Thread.currentThread().getName());
    }

    public class Method extends Thread{
        @Override

        public void run() {
            System.out.print("This is my Thread");
            someMethod();
        }
        private void someMethod(){
             throw  new  RuntimeException();
        }
    }
}
