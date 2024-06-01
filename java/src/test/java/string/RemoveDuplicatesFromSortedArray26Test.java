package string;

import com.liuqhahah.string.RemoveDuplicatesFromSortedArray26;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesFromSortedArray26Test {

  @Test
  public void test1(){
    RemoveDuplicatesFromSortedArray26 removeDuplicatesFromSortedArray26 =new  RemoveDuplicatesFromSortedArray26();

    int[] nums  = new int[]{1,1,2};
    System.out.println(removeDuplicatesFromSortedArray26.removeDuplicates(nums));

  }
}
