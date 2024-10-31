class G {

    public static void main(String[] args) {
        Thread t = new AThread();
        t.start();
        t.start();
    }
}

class AThread extends Thread{
    public void run(){
        System.out.println("\nRunning start...");
    }
}

// Ham ek thread ko keval ek hi baar start kar sakte hai
// Doosri baar start karne par illegal thread state exception ata hai
