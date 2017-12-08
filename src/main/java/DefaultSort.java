import java.util.Arrays;

public class DefaultSort<T extends Comparable<T>> implements Sorting<T>{
    public T[] Sort(T[] arr){
        Arrays.sort(arr);
        return arr;
    }
}
