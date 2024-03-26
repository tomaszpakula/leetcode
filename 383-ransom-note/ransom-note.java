class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int value;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            value = map.getOrDefault(magazine.charAt(i), 0);
            if (value == 0) {
                map.put(magazine.charAt(i), 1);
            } else {
                map.replace(magazine.charAt(i), value + 1);
            }
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            value = map.getOrDefault(ransomNote.charAt(i), 0);
            if (value == 0) return false;
            else {
                map.replace(ransomNote.charAt(i), value - 1);
            }

        }
        return true;
    }
}