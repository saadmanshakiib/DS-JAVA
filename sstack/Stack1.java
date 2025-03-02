package sstack;

import java.util.*;
public class Stack1{
    public static void main(String[] args) {
        Stack<Integer>s = new Stack<>();
        s.push(55);
        s.push(78);
        s.push(12);
        s.push(78);
        s.push(11);
        for(int i : s) System.out.print(i+" ");
        Collections.sort(s);
        System.out.println("\nAfter sorting : ");
        for(int i : s) System.out.print(i+" ");

    }
}