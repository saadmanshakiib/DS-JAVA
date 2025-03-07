package QUEUE;

public class ArrayQueue<E> implements Queue<E>{
    private E[] array;
    private int size = 0;
    private int first=0;
    public ArrayQueue(int capacity){
        array = (E[]) new Object[capacity];
    }
    public int Size(){return size;}
    public boolean isEmpty(){return size==0;}

    public void enqueue(E e) throws IllegalStateException{
            if(size==array.length) throw new IllegalStateException("Queue is Full");
            int data = (first+size)%array.length;
            array[data] = e;
            size++;
    }
    public E dequeue() {
        if (isEmpty()) return null;
        E ans = array[first];
        array[first] = null;
        first = (first + 1) % array.length;
        size--;
        return ans;
    }
    public E First(){
        return array[first];
    }
}
