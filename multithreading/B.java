class B {
    public static void main(String[] args) {
        B b = new B();
        b.pro();

        // here all codes are run in main thread and 
        // this is provided by java virtual machine.
    }   
    
    

    void pro(){
        System.out.println("pro  ~~~ " + Thread.currentThread().getName());
        info();
    }

    void info(){
        System.out.println("info ~~~ " + Thread.currentThread().getName());
        hero();
    }

    void hero(){
        System.out.println("Hero ~~~ " + Thread.currentThread().getName());
    }
}
