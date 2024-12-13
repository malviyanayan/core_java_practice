class A{
    public static void main(String[] args) {
        String str = "3[a]2[bc]";
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb);
        sb.delete(0, 4);
        System.out.println(sb);
        sb.insert(0,"aaa");
        System.out.println(sb);
        sb.delete(3, 8);
        System.out.println(sb); 
        sb.insert(3,"sbsb");
        System.out.println(sb);
    }
}