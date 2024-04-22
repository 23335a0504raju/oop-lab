public class GenericBubble<T extends Comparable<T>>{
    public
    void BubbleSort(T a[]){
       
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                if (a[j].compareTo(a[j-1]) < 0){
                   
                    T temp=a[j-1];
                    a[j-1]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public static void main(String args[]){
        Integer[] a={43,5,6,1,9};
        String[] s={"z","h","w","s","r"};
        Double[] d={0.35,0.02,0.36,0.82,0.27};
        GenericBubble<Integer> obj=new GenericBubble<>();
        GenericBubble<String> obj1=new GenericBubble<>();
        GenericBubble<Double> obj2=new GenericBubble<>();
        obj.BubbleSort(a);
        obj1.BubbleSort(s);
        obj2.BubbleSort(d);
    }
}
