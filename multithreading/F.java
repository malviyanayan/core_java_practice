class F {
    public static void main(String[] args) {
        Thread a = new Thread(new MyRunnable(),"bholu");
        a.start();

        for(int i=0;i<30;i++){
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }    
}

class MyRunnable implements Runnable{
    public void run(){

        for(int i=0;i<30;i++){
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }
}
