package QUEUE;

public interface Queue<E> {
    int Size();

    boolean isEmpty();

    void enqueue(E e);

    E First();

    E dequeue();
}