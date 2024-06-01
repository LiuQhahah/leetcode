package com.liuqhahah.string;

public class RemoveElement27 {

  public int removeElement(int[] nums, int val) {
    int g = 0;
    int[] output = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {

      if (val != nums[i]) {

        nums[g++] = nums[i];
      }
    }

    for (int i = 0;i<g;i++){
      System.out.println(nums[i]);
    }

    return g;
  }
}
