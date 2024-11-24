import java.util.PriorityQueue;

class B{
    public static void main(String[] args,int x) {

        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> {
            int diffA = Math.abs(a - x);
            int diffB = Math.abs(b - x);
            if (diffA == diffB) return Integer.compare(a, b);
            return Integer.compare(diffA, diffB);
        });
    }


    
}