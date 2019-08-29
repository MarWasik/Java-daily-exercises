package mains;

import arrays.ArraysTasks;

import java.util.Arrays;

public class MainArrays {

    public static void main(String[] args) {

        ArraysTasks arraysTasks = new ArraysTasks();
//        arraysTasks.print(new int[]{1, 2, 3, 4, 5, 6, 10});
//        arraysTasks.getLarger(new int[]{1,1,1,1},new int[]{2,2,2,2});
//        System.out.println(Arrays.toString(arraysTasks.genMaxMinAndSum(new int[]{10, -1, 1, 2, 4,})));
//        System.out.println(Arrays.toString(arraysTasks.merge(new int[]{1, 2, 3, 4, 5}, new int[]{6, 7, 8, 9, 8, 7, 6, 5, 4, 3, 2, 1})));
        System.out.println(arraysTasks.getSum(new int[]{1, 1, 2, 1}));
    }


}
