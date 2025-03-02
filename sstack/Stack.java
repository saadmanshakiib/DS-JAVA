/*package sstack;

import java.util.Stack;

public class Stack<E> implements Stack1<E> {
    public static final int capacity = 1000;
    private E[] array;
    private int top = -1;
    public Stack(){
        this(capacity);
    }
    public Stack(int capacity){
        array = (E[]) new Object[capacity];
    }
    public int size(){
        return top+1;
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public void push(E e) throws IllegalStateException{
        if(size()==array.length) throw new IllegalStateException("Stack overflow");
        array[++top] = e;
        System.out.println("Pushed");
    }
    public E top(){
        if(isEmpty()) return null;
        return array[top];
    }
    public E pop(){
        if(isEmpty()) return null;
        E answer = array[top];
        array[top] = null;
        top--;
        return answer;
    }
}*/