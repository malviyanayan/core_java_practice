class A {
    public static void main(String[] args) {

        Thread thread = Thread.currentThread();

        System.out.println(thread.getName() + " ###### " + thread.getId());
        // hamara code byDefoult is thread me run hota hai
    }
}