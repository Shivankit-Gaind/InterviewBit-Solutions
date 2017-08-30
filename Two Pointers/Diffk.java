public class Solution {
    public int diffPossible(int[] A, int B) {
        int i = 0,j=1;
        while(j<A.length){
            if(A[j]-A[i]==B)
                return 1;
            else if(A[j]-A[i]<B)
                j++;
            else{
                i++;
                if(i==j)
                    j++;
            }
        }
        
        return 0;
    }
    
}

