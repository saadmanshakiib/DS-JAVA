public class delete {
    public static void main(String[] args) {
        int array[] = new int[]{12,89,34,32,45,66};
        System.out.println("Size of the array : "+array.length+"\n");
        int index=3;
        int n = array.length;
        for(int i=index-1;i<n-1;i++){
            array[i] = array[i+1];
        }
        for(int i=0;i<n-1;i++){
            System.out.print(" "+array[i])  ;
        }
    }
}
