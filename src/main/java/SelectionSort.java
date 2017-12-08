public class SelectionSort<T extends Comparable<T>> implements Sorting<T>{
    public T[] Sort(T[] arr){
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j].compareTo(arr[min])<0){
                    min=j;
                }
            }
            swap(arr,i,min);

        }
        return arr;
    }
    public void swap(T[] arr,int i,int j){
        T tmp = arr[j];
        arr[j]=arr[i];
        arr[i]=tmp;
    }
}
