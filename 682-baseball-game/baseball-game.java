import java.util.ArrayList;
class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> points = new ArrayList<Integer>();
        int sum = 0;
        int temp = 0;

        for(String operation: operations){
            
            try{
                temp = Integer.valueOf(operation);
                points.add(temp);
                sum += temp;
            }
            catch (Exception e){
                if(operation.equals("+")){
                    temp = points.get(points.size() - 1) + points.get(points.size() - 2);
                    points.add(temp);
                    sum += temp;
                }
                else if(operation.equals("D")){
                    temp = points.get(points.size() - 1);
                    points.add(2*temp);
                    sum += 2*temp;
                }
                else{
                    temp = points.size() - 1;
                    sum -= points.get(temp);
                    points.remove(temp);
                }
            }
        }
        return sum;
    }
}