import java.util.ArrayList;
import java.util.List;

public class Main6 {
    public static void main(String[] args) {
//        ArrayList cart0 = new ArrayList();
//        List cart1 = new ArrayList();
//
//        cart0.add("Apple");
//        cart0.add(100);
//        cart0.add('c');

        ArrayList<String> states = new ArrayList<String>();

//        cart2.add(100);
//        cart2.add(800);
////        cart2.add("hi");

        states.add("California");
        states.add("Alabama");
        states.add("Alaska");
        states.add("Arkansas");

        System.out.println("ArrayList" + states);

        String s = states.get(2);
        System.out.println("I got " + s);

        // write loop for thus

        System.out.println("ArrayList Size " + states.size());
        for (int i = 0; i< states.size(); i++){
            System.out.println(states.get(i));
        }

        //updates Elements using .set() Method

        states.set(2,"Texas");
        System.out.println("After Updation" + states);


    }
}
