/*Given an integer x, return true if x is a palindrome, and false otherwise.
* */

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) //nagative num
            return false;
        int temp = 0;
        while (x > temp) { //positive num
            temp = temp * 10 + x % 10;
            x = x / 10;
        }

        return (x == temp || x == temp / 10);
    }

}
