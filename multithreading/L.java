class NThread extends Thread {
    @Override
    public void run() {
        try{
            Thread.sleep(20);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        for(int i=0;i<30;i++){
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }
}


class L {
    public static void main(String[] args) {
        Thread t = new NThread();
        t.setName("Monu");

        t.start();

        for(int i=0;i<30;i++){
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }
}