import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    // this is the original test
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);

    // more tests
    int[] input2 = { 1, 2, 3};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{ 3, 2, 1}, input2);

    int[] input3 = { 1, 2, 3, 4};
    ArrayExamples.reverseInPlace(input3);
    assertArrayEquals(new int[]{4, 3, 2, 1}, input3);

    int[] input4 = {0, 1, 2, 3, 4, 5, 6, 7, 8};
    ArrayExamples.reverseInPlace(input4);
    assertArrayEquals(new int[]{8, 7, 6, 5, 4, 3, 2, 1, 0}, input4);
	}


  @Test
  public void testReversed() {
    int[] input1 = {0, 1, 2, 3};
    assertArrayEquals(new int[]{3, 2, 1, 0}, ArrayExamples.reversed(input1));

    int[] input2 = {0, 1, 2, 3, 4, 5, 6, 7, 8};
    assertArrayEquals(new int[]{8, 7, 6, 5, 4, 3, 2, 1, 0}, ArrayExamples.reversed(input2));
  }
}
