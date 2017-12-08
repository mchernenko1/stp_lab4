public class OddEvenSort<T extends Comparable<T>> implements Sorting<T>{
    public T[] Sort(T[] arr){
        boolean sorted = false;
        while (!sorted){
            sorted=true;
            for(int i=1;i<=arr.length-2;i+=2){
                if(arr[i].compareTo(arr[i+1])>0){
                    swap(arr,i,i+1);
                    sorted=false;
                }
            }
            for(int i=0;i<=arr.length-2;i+=2){
                if(arr[i].compareTo(arr[i+1])>0){
                    swap(arr,i,i+1);
                    sorted=false;
                }
            }
        }
        return arr;
    }
    public void swap(T[] arr,int i,int j){
        T tmp = arr[j];
        arr[j]=arr[i];
        arr[i]=tmp;
    }
}
