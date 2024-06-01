package com.liuqhahah.string;

public class MergeSortedArray88 {

  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int[] output = new int[m+n];

    int k = 0;
    int j = 0;
    if(m == 0){
      output = nums1;
    }else if(n == 0){
      output = nums2;
    }else{
      for(int i = 0;i<m+n;i++){
        if (nums1[k]<nums2[j]){
          if (k<m){
            int value = nums1[k++];
            output[i] = value;
            System.out.println(value + " nums1[k]<nums2[j]");

          }
        }else{
          if (j<n){
            int value = nums2[j++];
            output[i] = value;
            System.out.println(value + " nums1[k]>=nums2[j]");

          }
        }
      }
    }




    for(int g = 0;g<m+n;g++){
      System.out.println(output[g]);
    }
  }
}