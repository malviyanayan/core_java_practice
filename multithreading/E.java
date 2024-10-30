class E {
    public static void main(String[] args) {
        Thread thread = new MyThread();
        thread.setName("Golu");

        thread.start();
    }    
}

class MyThread extends Thread {
    public void run(){
        System.out.println("My Thread is : " + currentThread());
        // toString method is override in thread class 
        // it is return [threadName,priority,ThreadGroup]
    }
}
