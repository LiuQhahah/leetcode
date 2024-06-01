package string;

import com.liuqhahah.string.MergeSortedArray88;
import com.liuqhahah.string.RemoveElement27;
import org.junit.jupiter.api.Test;

public class RemoveElement27Test {
  @Test
  public void test1() {
    RemoveElement27 removeElement27 = new RemoveElement27();
    int[] nums= new int[]{1, 3, 5};
    int val = 3;
    removeElement27.removeElement(nums,val);

  }

  @Test

  public void test2(){


    RemoveElement27 removeElement27 = new RemoveElement27();
    int[] nums= new int[]{3,2,2,3};
    int val = 3;
    removeElement27.removeElement(nums,val);
  }
}
