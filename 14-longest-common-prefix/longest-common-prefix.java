class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        String temporary;
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < prefix.length()) {
                temporary = prefix;
                prefix = strs[i];
            } else {
                temporary = strs[i];
            }

            int j = 0;

            while (j < prefix.length() && temporary.charAt(j) == prefix.charAt(j)) {
                j++;
            }

            prefix = prefix.substring(0, j);

        }

        return prefix;
    }
}