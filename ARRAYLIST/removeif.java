import java.util.*;

public class removeif {
    public static void main(String[] args) {
        ArrayList<String>al = new ArrayList<>();
        al.add("Sadman");
        al.add("Sakib");
        al.add("Nissan");
        al.add("Shahriar");
        al.add("Shaj");
        al.add("Avi");
        System.out.println(al);
        al.removeIf(n-> (n.charAt(0)=='S'));
        System.out.println("After Removing all the names starting with S : "+al);

        ArrayList<Integer>a = new ArrayList<>();
        for(int i=1;i<=100;i=i+2){
            a.add(i);
        }
       System.out.println(a);
       System.out.println("Index of 34 : "+a.indexOf(45));
       a.remove(49);
       System.out.println("After Removing 99 : "+a);
       a.removeIf(e-> (e%3==0));
        System.out.println("After Removing the elements divisable by 3 : "+a);
    }
}
