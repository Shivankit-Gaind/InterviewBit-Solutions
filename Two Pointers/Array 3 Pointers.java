public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int minimize(final int[] A, final int[] B, final int[] C) {
        int i = 0,j = 0,k = 0;
        int max,min,diff=Integer.MAX_VALUE;
        int M = A.length,N=B.length,P=C.length;
        while(i<M && j<N && k<P){
    max = Math.max( Math.abs(A[i] - B[j]) , Math.max(Math.abs(B[j] - C[k]), Math.abs(C[k] - A[i])));
           
            if(max<diff)
                diff = max;
                
            
            if(A[i]<=B[j]&&A[i]<=C[k])
                i++;
            else if(A[i]>=B[j]&&B[j]<=C[k])
                j++;
            else k++;
        }
        return diff;
    }
}

