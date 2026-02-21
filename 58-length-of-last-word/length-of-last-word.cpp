class Solution {
public:
    int lengthOfLastWord(string zdanie) {
        int j = 0;
        int last = 1;

        for(int i=0;i<zdanie.length();i++){
        if(zdanie[i]!=' '){
            j++;
        }
        else{
            if (j!=0){
                last=j;
            }
            j=0;
        }
    }
    if(j==0){
        return last;
    }
   
    return j;
         

      
    }
};