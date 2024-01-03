class Solution {
    public int lengthOfLastWord(String s) {
        String[] result = s.split(" ");
        List<String> newResult = Arrays.stream(result).filter(r -> !r.equals("")).toList();
        return newResult.get(newResult.size() - 1).length();
    }
}