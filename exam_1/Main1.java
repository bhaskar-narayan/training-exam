/*  You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position.

Return the max sliding window. 
*/


public class Main1 {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int slidingWindowSize = 3;
        int slidingWindowCount = 0;
        for (int i = 0; i < array.length; ++i) {        // Sliding window calculation loop
            if (array.length - i < slidingWindowSize)
                break;
            int tempCount = i;
            for (int j = 0; j < slidingWindowSize; ++j) {
                System.out.print(array[tempCount]);
                ++tempCount;
            }
            System.out.print(", ");
            ++slidingWindowCount;
        }
        System.out.println("");
        System.out.println("Max sliding window: " + slidingWindowCount);
    }
}