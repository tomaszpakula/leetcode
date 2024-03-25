class Solution {
    public int strStr(String haystack, String needle) {
        int left = 0;
        int right = needle.length() - 1;
        int j;

        while (right < haystack.length()) {
            j = 0;
            for (int i = left; i <= right; i++) {
                if (haystack.charAt(i) != needle.charAt(j)) {
                    left++;
                    right++;
                    break;
                } else if (i == right) {
                    return left;
                }
                j++;
            }

        }
        return -1;
    }

}
