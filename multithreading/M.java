// join() method from thread class

class M {
    public static void main(String[] args) {
        Thread t = new NThread();
        t.setName("Monu");

        t.start();

        try{
            t.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        for(int i=0;i<30;i++){
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }
}

class MThread extends Thread{
    @Override
    public void run() {
        for(int i=0;i<30;i++){
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }
}
