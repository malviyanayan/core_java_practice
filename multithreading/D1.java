class D1 {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println("Default Thread by Defoult properties ~~~~ ");
        System.out.println("Thread Id: " + thread.getId());
        System.out.println("Thread Name: " + thread.getName());
        System.out.println("Thread Priority: " + thread.getPriority());
    }    
}
