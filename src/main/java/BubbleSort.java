public class BubbleSort<T extends Comparable<T>> implements Sorting<T>{
    public T[] Sort(T[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j = 0;j<arr.length-1-i;j++){
                if(arr[j].compareTo(arr[j+1])>0){
                    swap(arr,j,j+1);
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
