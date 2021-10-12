/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int ans, min = 1, max = n;
        if (guess(min) == 0) return min;
        if (guess(max) == 0) return max;
        while (true) {
            int num = (max - min) / 2 + min;
            if (guess(num) == 0) {
                ans = num;
                break;
            }
            if (guess(num) < 0)
                max = num;
            else
                min = num;
        }
        return ans;
    }
}