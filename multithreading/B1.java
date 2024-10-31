class B1 {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println(t.isAlive());
        // isAlive() method is check the given thread is alive or not
    }    
}
