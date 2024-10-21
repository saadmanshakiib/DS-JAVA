import java.util.*;

public class ARRAYSEARCH{
public static void main(String[] args) {
    int array[] = new int[]{12,89,34,32,45,6,11};
    System.out.println("Size of the array : "+array.length);
    int key = 34;
    int c=0;
    for(int i=0;i<array.length;i++){
        if(array[i] == key) {
            c++;
            break;
        }
    }
    if(c==0) System.out.println("Key Not Found");
    else System.out.println("Key Found");
}
}