class C{
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();

        // This code is Running in my Current(main Thread)
        for(int i=0;i<30;i++){
            System.out.println(Thread.currentThread().getName() + "-" + i);
        }
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        // This code is running on my custom thread
        System.out.println("MyThread started....");
        Thread.currentThread().setName("mythread");
        for(int i=0;i<30;i++){
            System.out.println(Thread.currentThread().getName() + "-" + i);
        }
    }
}