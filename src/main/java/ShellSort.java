public class ShellSort<T extends Comparable<T>> implements Sorting<T>{
    public T[] Sort(T[]arr){//FROM INTERNET
        int j;
        for( int gap = arr.length / 2; gap > 0; gap /= 2 ){
            for(int i=gap;i<arr.length;i++){
                T temp = arr[i];
                for (j = i; j >= gap && arr[j - gap].compareTo(temp)>0; j -= gap)
                {
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
            }
        }
        return arr;
    }

}
