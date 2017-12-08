public class QuickSort<T extends Comparable<T>> implements Sorting<T>{
    public T[] Sort(T[] arr){
        directQuickSort(arr,0,arr.length-1);
        return arr;
    }
    private void directQuickSort(T[] arr,int low,int high){
        if(low>=high){
            return;
        }
        int separator=partition(arr,low,high);
        directQuickSort(arr,low,separator);
        directQuickSort(arr,separator+1,high);

    }
    private int partition(T[] arr,int low,int high){
        int i=low;
        int j=high;
        int separator=(high+low)/2;
        while(i<j){
            while(i<separator && (arr[i].compareTo(arr[separator])<0 || arr[i].equals(arr[separator]))){
                i++;
            }
            while (j>separator && (arr[j].compareTo(arr[separator])>0 || arr[j].equals(arr[separator]))){
                j--;
            }
            if(i<j) {
                swap(arr, i, j);
                if (i == separator)
                    separator = j;
                else if (j == separator)
                    separator = i;
            }
        }
        return separator;
    }
    public void swap(T[] arr,int i,int j){
        T tmp = arr[j];
        arr[j]=arr[i];
        arr[i]=tmp;
    }
}
