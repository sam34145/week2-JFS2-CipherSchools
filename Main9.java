import java.util.Iterator;
import java.util.LinkedList;

public class Main9 {
    public static void main(String[] args) {
        LinkedList myll = new LinkedList();

        myll.add("Ironman");
        myll.add("Thor");
        myll.add("Hulk");
        myll.add("Loki");
        myll.add("Gamora");

        Iterator it = myll.iterator();

        while (it.hasNext()){

            System.out.println(it.next());
        }

        System.out.println("------------------");
        System.out.println("Who's at top "+ myll.peek());
        System.out.println("Hey first one get out "+myll.poll());

        System.out.println("Who's there standing at the last ! "+myll.pop());
        System.out.println("------------------");

//        System.out.println(myll.get(1));

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

}
