

public class ArrayExamples {

  // Changes the input array to be in reversed order
  static void reverseInPlace(int[] arr) {
    // we only need swap half the array
    for(int i = 0; i < arr.length / 2; i += 1) {
      // needs a temp value to swap
      int temp = arr[i];
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length - i - 1] = temp;
    }
  }

  // Returns a *new* array with all the elements of the input array in reversed
  // order
  static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      newArray[i] = arr[arr.length - i - 1];
    }
    return newArray;
  }

  // Averages the numbers in the array (takes the mean), but leaves out the
  // lowest number when calculating. Returns 0 if there are no elements or just
  // 1 element in the array
  static double averageWithoutLowest(double[] arr) {

    // return 0 if 0 or 1 element in the array
    if(arr.length < 2) { return 0.0; }
    double lowest = arr[0];
    int lowestIndex = 0;

    // find the lowest number
    for(int i = 0; i < arr.length; i++) {
      if(arr[i] < lowest) { lowest = arr[i]; lowestIndex = i;}
    }

    // find the sum without lowest
    double sum = 0;
    for(int i = 0; i < arr.length; i++) {
      if(i != lowestIndex) { sum += arr[i]; }
    }
    return sum / (arr.length - 1);
  }


}

