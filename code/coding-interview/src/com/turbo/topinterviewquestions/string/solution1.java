package com.turbo.topinterviewquestions.string;

/**
 * 验证回文串
 */
public class solution1 {
// ".,"
    public static boolean isPalindrome(String s) {
        if(s.length() == 0){
            return true;
        }
        int left =0,right = s.length()-1;
        while (left<right){
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left ++;
            }
            while (left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right --;
            }
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }


    public static void main(String[] args) {
        isPalindrome(".,");
    }
}
