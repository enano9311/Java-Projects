package Algorithms.Hard;

import java.util.ArrayList;

public class FindMedianSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
        // merge two sorted arrays together, then calculate median
        // if odd, middle element as double. If even, valt @ n/2 -1 + val @ n/2 +1 /2

        ArrayList<Integer> merged = mergeSortedArrays(nums1, nums2);

        return calculateMedian(merged);
    }

    public static ArrayList<Integer> mergeSortedArrays(int[] nums1, int[] nums2)
    {
        ArrayList<Integer> finalArr = new ArrayList<>();
        int arr1Index = 0;
        int arr2Index = 0;

        while(finalArr.size() < nums1.length + nums2.length)
        {
            if(arr1Index != nums1.length && (arr2Index >= nums2.length || nums1[arr1Index] <= nums2[arr2Index])) {
                finalArr.add(nums1[arr1Index]);
                arr1Index++;
            }
            else if(arr2Index != nums2.length && (arr1Index >= nums1.length || nums2[arr2Index] < nums1[arr1Index])) {
                finalArr.add(nums2[arr2Index]);
                arr2Index++;
            }
        }
        return finalArr;
    }

    public static double calculateMedian(ArrayList<Integer> arr){
        if(arr.size() == 0){return arr.get(0);}
        if(arr.size() % 2 != 0){
            return Double.valueOf(arr.get(arr.size()/2 - 1));
        } else{
            System.out.println("index : " + arr.size()/2 + " val: " + arr.get((arr.size() / 2)));
            System.out.println("index : " + ((arr.size()/2) - 1) + " val: " + arr.get((arr.size()/2 - 1) ));
            double med = (double)(arr.get((arr.size()/2)) + arr.get((arr.size()/2 - 1)))/2;
            return med;
        }
    }

}
