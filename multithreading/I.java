// sleep() method of Thread class...

class I {
    public static void main(String[] args) {
        Thread t = new ZThread();
        t.setName("Golu");
        t.start();

        try{
            Thread.sleep(3000); // this method throws intrupted exception (Checked Exception)
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        for(int i=0;i<30;i++){
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }

    }

}

class ZThread extends Thread {
    @Override
    public void run() {
        Thread thread = Thread.currentThread();

        for(int i=0;i<30;i++){
            System.out.println(thread.getName() + " - " + i);
        }
    }
}
