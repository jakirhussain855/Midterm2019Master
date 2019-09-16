
package datastructure;

        import java.util.Iterator;
        import java.util.LinkedList;
        import java.util.Queue;

public class UseQueue {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         */
        Queue<String>WaitingQueue = new LinkedList<>();

        WaitingQueue.add("Jakir");
        WaitingQueue.add("Jamil");
        WaitingQueue.add("Khayer");
        WaitingQueue.add("Mike");

        System.out.println("WaitingQueue : "+ WaitingQueue);

        String name = WaitingQueue.remove();
        System.out.println("Removed from WaitingQueue:" +name+ "| New waitingQueue :" + WaitingQueue);



        Iterator iterator = WaitingQueue.iterator();
// System.out.println(WaitingQueue.peek());
        System.out.println(WaitingQueue.poll());

        System.out.println("*******using for each loop***********");

        WaitingQueue.add("Lisa");
        WaitingQueue.remove();
        WaitingQueue.peek();
        WaitingQueue.poll();

        Queue<String> g = WaitingQueue;
        for ( String i : g){
            System.out.println(i);

        }

        System.out.println("**********using While Loop*********");

        WaitingQueue.add("Liton");
        int k = 0;
        while (k< 1) {
            System.out.print(WaitingQueue);
            k++;
        }

    }

}
