class Solution {
    public int hIndex(int[] citations) {
        int index = citations.length;
        Arrays.sort(citations);

        int i = 0;
        while (i< index && citations[i] < index - i) {
            i++;
        }

        return index - i;
    }
}