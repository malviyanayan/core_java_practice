class A1Thread extends Thread {
    public void run() {
        Thread t = Thread.currentThread();

        for(int i=0; i < 30; i++)
            System.out.println(t.getName() + " - " + i);
    }
}

class A2Thread extends Thread {
    public void run() {
        A3Thread x = new A3Thread();
        x.setName("Kaliya");
        x.start();
        
        try {  x.join(); } catch(InterruptedException e) { e.printStackTrace(); }
        
        Thread t = Thread.currentThread();

        for(int i=0; i < 30; i++)
            System.out.println(t.getName() + " - " + i);
    }
}

class A3Thread extends Thread {
    public void run() {
        A1Thread x = new A1Thread();
        x.setName("ChotaBheem");
        x.start();
        
        try {  x.join(); } catch(InterruptedException e) { e.printStackTrace(); }
        
        Thread t = Thread.currentThread();

        for(int i=0; i < 30; i++)
            System.out.println(t.getName() + " - " + i);
    }
}

class O {
    public static void main(String[] args) {
        A2Thread x = new A2Thread();
        x.setName("Raju");
        x.start();

        try {  x.join(); } catch(InterruptedException e) { e.printStackTrace(); }

        Thread t = Thread.currentThread();

        for(int i=0; i < 30; i++)
            System.out.println(t.getName() + " - " + i);
    }
}
