public class Solution {
    public int maxArea(int[] A) {
        int i = 0,x;
        int j = A.length-1;
        int area = Integer.MIN_VALUE;
        if(j==0||j==-1)
            return 0;
        
        while(i<j){
            x = (j-i)*Math.min(A[i],A[j]);
            
            if(x>area)
                area = x;
                
            if(A[i]<A[j])
                i++;
            else
                j--;
        }
        return area;
    }
}

