package com.hzc.base;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int[] nums1 = {99,88,2};
        int[] nums2 = reverse(nums1);
//        System.out.println(Arrays.toString(nums2));
        int[] nums3 = sort(nums1);
        System.out.println(Arrays.toString(nums3));

        int[][] num4 = {{1,2}, {2,4}, {3,6}}; //变量前面是修饰 不需要指定长度  后面赋值才是实例化  写成int[2][3] a = {{1,2}, {2,4}, {3,6}};很蠢
    }


    private static int[] reverse(int[] nums1) {
        /*
         反转数组
         */
        for (int x: nums1) {
            // 这种写法无法获取下标
            System.out.println((char)x + '\t');
        }
        int[] nums2 = new int[nums1.length];
        for (int i = 0, j = nums1.length-1; i < nums1.length; i++,j--) {
            nums2[i] = nums1[j];
        }
        return nums2;
    }

    public static int[] sort(int[] array){
        int tmpVarial = 0;
        //外层循环
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i]>array[j]){
                    tmpVarial = array[i];
                    array[i] = array[j];
                    array[j] = tmpVarial;
                }
            }
        }
        return array;
    }
}
