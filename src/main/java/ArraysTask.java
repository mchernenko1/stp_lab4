

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ArraysTask {
    //Ex1
    //reading input data
    private int[] readArray(){

        int dimension = readInt();
        int[] data = new int[dimension];
        for(int i =0;i<dimension;i++){
            data[i]=readInt();
        }
        return data;
    }
    //number of paired items in array
    public  int numOfPaired(int[] array){
        int number=0;
        List<Integer> numbers = new ArrayList<Integer>();
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]==array[j] && numbers.indexOf(array[i])<0)
                    numbers.add(array[i]);
            }
        }
        return numbers.size();
    }
    //sum of element that multiplied by 3
    public  int sumOfElMyltByThree(int[] array){
        int sum=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%3==0)
                sum+=array[i];
        }
        return sum;
    }
    //difference between min and max element in array
    public  int diffMinMax(int[] array){
        return maxElement(array)-minElement(array);
    }
    //mean of array's elements
//    public float mean(int[] array){
//        int sum=0;
//        for(int i=0;i<array.length;i++){
//            sum+=array[i];
//        }
//        return sum/array.length;
//    }
    //sum of the largest and the smallest elements in array
    public  int sumLargAndSmall(int[] array){
        int max = maxElement(array);
        int min = minElement(array);
        int sum = 0;
        for(int i=0;i<array.length;i++){
            if(array[i]==max || array[i]==min)
                sum+=array[i];
        }
        return sum;
    }
    //max element by absolute value
    public  int maxAbs(int[] array){
        int zero=0;
        for(int i=0;i<array.length;i++){
            if(Math.abs(array[i])>zero){
                zero=array[i];
            }
        }
        return zero;
    }
    public  int minElement(int[]array){
        int min = array[0];
        for(int i = 0;i<array.length;i++){
            if(array[i]<min)
                min = array[i];
        }
        return min;
    }
    public  int maxElement(int[] array){
        int max = array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]>max)
                max=array[i];
        }
        return max;
    }

    //Ex2
    //read matrix dimension
    public int readInt(){
        try{
            System.out.println("Enter integer num ");
            return new Scanner(System.in).nextInt();
        }catch (Exception ex){
            System.out.println("Invalid symbol entered ");
            return readInt();
        }
    }
    //generating of matrix
    private int[][] genereteMatrix(){
        try{
            System.out.println("Enter matrix size");
            int dimension = readInt();
            Random rand = new Random();
            int[][] result = new int[dimension][dimension];
        for(int i=0;i<dimension;i++){
            for(int j = 0;j<dimension;j++){
                result[i][j]= rand.nextInt(100000)-50000;
            }
        }
        return result;
        }catch(Exception ex){
            return genereteMatrix();
        }
    }

    //sum of the elements located behind the first negative element
    public int[] excersiceA(int[][] matrix){
        int[] sequence=new int[matrix.length];
        for(int i=0;i<matrix.length;i++){

            for(int j = 0;j<matrix[i].length;j++){
                if(matrix[i][j]<0){
                    sequence[i]=0;
                    for(int k=j+1;k<matrix[i].length;k++){
                        sequence[i]+=matrix[i][k];
                    }
                    break;
                }
                else if(j==matrix[i].length-1){
                    sequence[i]=100;
                }
            }
        }
        return sequence;
    }
    //sum of the elements preceding the last negative element
    public int[] excersiceB(int[][] matrix){
        int[] sequence=new int[matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j = matrix[i].length-1;j>=0;j--){
                if(matrix[i][j]<0){
                    sequence[i]=0;
                    for(int k=0;k<j;k++){
                        sequence[i]+=matrix[i][k];
                    }
                    break;
                }
                else if(j==matrix[i].length-1){
                    sequence[i]=100;
                }
            }
        }
        return sequence;
    }
    //number of lines all elements of which are zeros
//    public int excersiceC(int[][] matrix){
//        int result=0;
//        for(int i = 0;i<matrix.length;i++){
//            int counter=0;
//            for (int j = 0;j<matrix[i].length;j++){
//                if(matrix[i][j]==0)
//                    counter++;
//            }
//            if(counter==matrix.length)
//                result++;
//        }
//        return result;
//    }
//    //number of lines the elements in each of them are the same.
//    public int excersiceD(int[][] matrix){
//        int result=0;
//        for(int i = 0;i<matrix.length;i++){
//            int counter=0;
//            for (int j = 0;j<matrix[i].length;j++){
//                if(matrix[i][j]==matrix[i][0])
//                    counter++;
//            }
//            if(counter==matrix.length)
//                result++;
//        }
//        return result;
//    }


//    public static void main(String[] args) {
//
//        //Ex 1
//        System.out.println("Enter array's size and elements");
//        int[] dataArray=readArray();
//        System.out.println("number of paired items in array "+numOfPaired(dataArray));
//        System.out.println("max value by abs "+maxAbs(dataArray));
//        System.out.println("mean of array's elements "+mean(dataArray));
//        System.out.println("sum of element that multiplied by 3 "+sumOfElMyltByThree(dataArray));
//        System.out.println("difference between min and max element in array "+diffMinMax(dataArray));
//        System.out.println("sum of the largest and the smallest elements in array "+sumLargAndSmall(dataArray));
//        //Ex2
//
//        int[][] matrix = genereteMatrix();
//        showMatrix(matrix);
//
//        System.out.println("\n sum of the elements located behind the first negative element ");
//        showArray(excersiceA(matrix));
//        System.out.println("sum of the elements preceding the last negative element ");
//        showArray(excersiceB(matrix));
//        System.out.println("number of lines all elements of which are zeros "+excersiceC(matrix));
//        System.out.println("number of lines the elements in each of them are the same. "+excersiceD(matrix));
//    }
}
