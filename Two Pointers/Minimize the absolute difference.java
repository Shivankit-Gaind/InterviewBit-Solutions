public class Solution {
    public int solve(int[] A, int[] B, int[] C) {
        int i = 0,j = 0,k = 0;
        int max,min,diff=Integer.MAX_VALUE;
        int M = A.length,N=B.length,P=C.length;
        while(i<M && j<N && k<P){
            max = Math.max(A[i],Math.max(B[j],C[k]));
            min = Math.min(A[i],Math.min(B[j],C[k]));
            
            diff = Math.min(diff,Math.abs(max-min));
            if(diff==0) break;
            
            if(A[i]==min)
                i++;
            else if(B[j]==min)
                j++;
            else k++;
        }
        return diff;
    }
}

