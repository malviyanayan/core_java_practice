class IThread extends Thread {
    public void run() {
        Thread t = Thread.currentThread();

        for(int i=0; i<30; i++) {
            System.out.println(t.getName() + " - " + i);
        }
    }
}

class N {
    public static void main(String[] args) {
        IThread x = new IThread();
        x.setName("abc");
        x.start();

        try {   x.join();  } catch(InterruptedException e) { e.printStackTrace(); }

        Thread t = Thread.currentThread();

        for(int i=0; i<30; i++) {
            System.out.println(t.getName() + " - " + i);
        }
    }
}
