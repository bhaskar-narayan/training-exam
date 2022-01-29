/* Find all interleavings of given strings that can be formed from all the characters of the first and second string where the order of characters is preserved.
*/


public class Main3 {
    public static void main(String[] args) {
        String firstString = "AB";
        String secondString = "C";
        char finalArray[] = (firstString + secondString).toCharArray();
        for (int i = 0; i < finalArray.length; ++i) {       // Combination generating loop
            for (int j = 0; j < finalArray.length; ++j) {
                for (int k = 0; k < finalArray.length; ++k) {
                    if (i != j && j != k && i != k)
                        System.out.println(finalArray[i] + "" + finalArray[j] + "" + finalArray[k]);
                }
            }
        }
    }
}
