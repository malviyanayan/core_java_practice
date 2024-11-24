import java.util.Comparator;
import java.util.PriorityQueue;

class A{
    static Comparator<Temp> comp = new Compare();
    static PriorityQueue<Temp> queue = new PriorityQueue<>(comp);

    public static void main(String[] args) {
        queue.add(new Temp(12,45));
        queue.add(new Temp(67,899));
        queue.add(new Temp(99,234));
        queue.add(new Temp(98,2));

        System.out.println(queue);
    }
}

class Temp {
    int x ;
    int y;

    Temp(int x,int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return x + "-" + y; 
    }
}

class Compare implements Comparator<Temp>{
    @Override
    public int compare(Temp o1, Temp o2) {
        return o1.x - o2.x;
    }
    
}