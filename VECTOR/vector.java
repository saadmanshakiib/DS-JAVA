//package VECTOR;
import java.util.*;
public class vector {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.addElement(23);
        v.addElement(12);v.addElement(45);v.addElement(44);
       // v.insertElementAt(1,11);
        for(int i:v)System.out.print(i+" ");
        System.out.println("\nAfter removing : ");
        v.remove(2);
        for(int i:v)System.out.print(i+" ");
        Collections.sort(v);
        System.out.println();
        for(int i:v)System.out.print(i+" ");
    }
}
