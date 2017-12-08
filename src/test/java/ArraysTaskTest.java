import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class ArraysTaskTest {
    ArraysTask task;
    int[] array1,array2;
    int[][] matrix1,matrix2;

    @Before
    public void init() {
        task = new ArraysTask();
        array1 = new int[]{10,15,20,25,30,35,40};
        array2 = new int[]{15,15,25,1,2,3,4,5,5,5};
        matrix1 = new int[][]{
                {1,2,-3},
                {2,-1,2},
                {3,5,0}
        };
        matrix2 = new int[][]{
                {1,2,-3},
                {2,2,2},
                {0,0,0}
        };
    }

    @After
    public void tearDown(){
        task=null;
    }

    @Test
    public void numOfPairedTest(){
        int res = task.numOfPaired(array1);
        Assert.assertTrue(0==res);
        res = task.numOfPaired(array2);
        Assert.assertTrue(2==res);
    }

    @Test
    public void sumOfMultThreeTest(){
        int res = task.sumOfElMyltByThree(array1);
        Assert.assertTrue(45==res);
        res = task.sumOfElMyltByThree(array2);
        Assert.assertTrue(33==res);
    }

    @Test
    public void diffMinMaxTest(){
        int res = task.diffMinMax(array1);
        Assert.assertTrue(30==res);
        res = task.diffMinMax(array2);
        Assert.assertTrue(24==res);
    }
    @Test
    public void sumLargeAndSMallTest(){
        int res = task.sumLargAndSmall(array1);
        Assert.assertTrue(50==res);
        res = task.sumLargAndSmall(array2);
        Assert.assertTrue(26==res);
    }
    @Test
    public void maxAbsTest(){
        int res = task.maxAbs(array1);
        Assert.assertTrue(40==res);
        res = task.maxAbs(array2);
        Assert.assertTrue(25==res);
    }

    @Test
    public void ex1Test(){
        int[] res = task.excersiceA(matrix1);
        Assert.assertArrayEquals(new int[]{0,2,100},res);
        res = task.excersiceA(matrix2);
        Assert.assertArrayEquals(new int[]{0,100,100},res);
    }

    @Test
    public void ex2Test(){
        int[] res = task.excersiceB(matrix1);
        Assert.assertArrayEquals(new int[]{3,2,100},res);
        res = task.excersiceB(matrix2);
        Assert.assertArrayEquals(new int[]{3,100,100},res);
    }
}
