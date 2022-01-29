/** Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays. 
*/


public class Main2 {
    public static void main(String[] args) {
        int firstSortedArray[] = {1, 2, 3};
        int secondSortedArray[] = {3, 4};
        int firstArrayLength = firstSortedArray.length;
        int secondArrayLength = secondSortedArray.length;
        int mergedArrayLength = firstArrayLength + secondArrayLength;
        int mergedArray[] = new int[mergedArrayLength];
        int mergeIndex = 0;
        if (firstArrayLength > secondArrayLength) {             // if first array is larger than the second one
            for (int i = 0; i < firstArrayLength; ++i) {
                if (i >= secondArrayLength){
                    mergedArray[mergeIndex] = firstSortedArray[i];
                    ++mergeIndex;
                } else {
                    if (firstSortedArray[i] > secondSortedArray[i]) {
                        mergedArray[mergeIndex] = secondSortedArray[i];
                        ++mergeIndex;
                        mergedArray[mergeIndex] = firstSortedArray[i];
                        ++mergeIndex;
                    } else {
                        mergedArray[mergeIndex] = firstSortedArray[i];
                        ++mergeIndex;
                        mergedArray[mergeIndex] = secondSortedArray[i];
                        ++mergeIndex;
                    }
                }
            }
        } else {
            for (int i = 0; i < secondArrayLength; ++i) {       // if second array is larger than the first one
                if (i >= firstArrayLength){
                    mergedArray[mergeIndex] = secondSortedArray[i];
                    ++mergeIndex;
                } else {
                    if (firstSortedArray[i] > secondSortedArray[i]) {
                        mergedArray[mergeIndex] = secondSortedArray[i];
                        ++mergeIndex;
                        mergedArray[mergeIndex] = firstSortedArray[i];
                        ++mergeIndex;
                    } else {
                        mergedArray[mergeIndex] = firstSortedArray[i];
                        ++mergeIndex;
                        mergedArray[mergeIndex] = secondSortedArray[i];
                        ++mergeIndex;
                    }
                }
            }
        }
        if (mergedArrayLength % 2 != 0) {                      // calculating median for merged array
            int median = mergedArrayLength / 2;
            System.out.println("The median is: " + mergedArray[median]);
        } else {
            int medianIndex = mergedArrayLength / 2;
            int median = (mergedArray[medianIndex] + mergedArray[medianIndex - 1]) / 2;
            System.out.println("The median is: " + median);
        }
    }
}
