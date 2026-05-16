class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start <= end) {
            char leftChar = s.charAt(start);
            char rightChar = s.charAt(end);
            while (start < end && (leftChar == ' ' || !Character.isLetterOrDigit(leftChar))) {
                start++;
                leftChar = s.charAt(start);
            }
            // System.out.println(Character.isLetterOrDigit(rightChar));
            while (end > start && (rightChar == ' ' || !Character.isLetterOrDigit(rightChar))) {
                end--;
                rightChar = s.charAt(end);
            }
            if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                // System.out.println(leftChar);
                // System.out.println(rightChar);
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
