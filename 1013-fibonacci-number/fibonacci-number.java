class Solution {
    public int fib(int n) {
        if(n==0) return 0;
        if(n == 1 || n == 2) return 1;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(2, 1);

        for(int i = 3; i <= n; i++){
            map.put(i,map.get(i-1) + map.get(i-2));
        }

        return map.get(n);
    }
}