import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();
        l.add("Sadman");
        l.add("Sakib");
        l.add("Saad");
        for(String s: l) System.out.println(s);
        l.remove(1);
        System.out.println();
        for(String s: l) System.out.println(s);
    //update values
        System.out.println("After updating");
        l.set(1,"saadman al ");
        for(String s: l) System.out.println(s);

    }
}
