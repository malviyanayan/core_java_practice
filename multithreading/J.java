class J {
    public static void main(String[] args) {
        String name = "Nayan Malviya";
        printText(name, 65);

        String text  = "Hello my name is Nayan Malviya.\nCurrently I am persuing my Btech from Baderia Global Institute of Engineering and Management.";

        System.out.println();
        printText(text, 120);
    }   
    
    static void printText(String text , int time){
        

        for(int i=0;i<text.length();i++){
            System.out.print(text.charAt(i) );
            try{Thread.sleep(time);}catch(InterruptedException e){e.printStackTrace();}
        }
    }
}
