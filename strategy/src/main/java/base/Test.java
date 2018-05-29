package base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;

public class Test {
    private static Logger logger = LoggerFactory.getLogger(Test.class);
    public static void main(String[] args) {
        //对整型数组排序
        int[] intArray = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        BubbleSorter<int[]> intBubbleSorter = new BubbleSorter<>(new IntSortHandler());
        int operations = intBubbleSorter.sort(intArray);
        logger.info("[Template Method] operations:{}, array:{}",operations,intArray);

        //对double数组排序
        double[] doubleArray = {9.9, 8.8, 7.7, 6.6, 5.5, 4.4, 3.3, 2.2, 1.1, 0.0};
        BubbleSorter<double[]> doubleBubbleSorter = new BubbleSorter<>(new DoubleSortHandler());
        operations = doubleBubbleSorter.sort(doubleArray);
        logger.info("[Template Method] operations:{}, array:{}",operations,doubleArray);

        //对List集合排序
        List<Integer> list = Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1, 0);
        BubbleSorter<List<Integer>> integerListBubbleSorter = new BubbleSorter<>(new IntegerListSortHandler());
        operations = integerListBubbleSorter.sort(list);
        logger.info("[Template Method] operations:{}, list:{}",operations,list);
    }
}
