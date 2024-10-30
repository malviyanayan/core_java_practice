class D {
    public static void main(String[] args) {
        Thread thread = new MyThread();

        thread.start();
    }   

}

class MyThread extends Thread {
    public void run(){
        System.out.println("custom Thread by Defoult properties ~~~~ ");
        System.out.println("Thread Id: " + getId());
        System.out.println("Thread Name: " + getName());
        System.out.println("Thread Priority: " + getPriority());
    }
}
