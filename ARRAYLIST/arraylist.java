import java.util.*;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer>al = new ArrayList<>();
        al.add(2);
        al.add(8);
        al.add(6);
        System.out.println("al : "+al);
        System.out.println("al contains 34 or not : "+al.contains(34));
        ArrayList<Integer>al2 = new ArrayList<>();
        al2.add(23);
        al2.add(13);al2.add(45);al2.add(98);
        System.out.println("New al2 : "+al2);
        al2.remove(2);
        System.out.println("After removing index 2 : "+al2);
    }
}


