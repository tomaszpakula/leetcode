class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int child = g.length - 1;
        int cookie = s.length - 1;
        int content = 0;


            while( cookie >= 0  && child >= 0 ){
                if(s[cookie] >= g[child]) {
                    cookie--;
                    content++;

                }
                child--;
            }
        return content;
    }
}