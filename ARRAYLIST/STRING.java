import java.util.*;

public class STRING {
    public static void main(String[] args) {
        ArrayList<String>al = new ArrayList<>();
        al.add("Sakib");
        al.add("Sadman");
        al.add("Nissan");
        al.add("Avi");
        al.add("Shaj");
        System.out.println(al);
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the index no you want to remove  : ");
        int to_remove = s.nextInt();
        al.remove(to_remove);
        System.out.println("After removing : "+al);
    }
}
