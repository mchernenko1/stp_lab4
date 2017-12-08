import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;

public class QuickSortTest {
    private Sorting<Integer> sorter;
    private Integer[] testArrayOne,testArrayTwo,testArrayThree;
    private Integer[] testArrayOneSorted,testArrayTwoSorted,testArrayThreeSorted;
    @Before
    public void init(){sorter = new QuickSort<>();
        testArrayOne=new Integer[]{-100,10,150,-18,-6};
        testArrayTwo = new Integer[]{-100,800,1000,-6,-52,-15,48,65,-5,9,8,5,4,6,3,0,10,150,-18,-6};
        testArrayThree = new Integer[]{-1,-2,-3,-4,5,6,7,8,9,-10,11,-12,-13};
        testArrayOneSorted=testArrayOne.clone();
        Arrays.sort(testArrayOneSorted);
        testArrayTwoSorted=testArrayTwo.clone();
        Arrays.sort(testArrayTwoSorted);
        testArrayThreeSorted=testArrayThree.clone();
        Arrays.sort(testArrayThreeSorted);
    }
    @After
    public void tearDown(){sorter=null;}

    @Test
    public void testSort() {
        Assert.assertArrayEquals(testArrayOneSorted, sorter.Sort(testArrayOne.clone()));
        Assert.assertArrayEquals(testArrayTwoSorted, sorter.Sort(testArrayTwo.clone()));
        Assert.assertArrayEquals(testArrayThreeSorted, sorter.Sort(testArrayThree.clone()));
    }
}