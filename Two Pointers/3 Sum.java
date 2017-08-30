public class Solution {
    public int threeSumClosest(int[] A, int B) {
        Arrays.sort(A);
        int j,k,sum=0,diff=Integer.MAX_VALUE;
        for(int i=0;i<A.length-2;i++){
            j=i+1;k=A.length-1;
            while(j<k){
                if(Math.abs(A[i]+A[j]+A[k]-B)<diff){
                    diff = Math.abs(A[i]+A[j]+A[k]-B);
                    sum = A[i]+A[j]+A[k];
                }
                if(A[i]+A[j]+A[k]<B)
                    j++;
                else
                    k--;
            }
        }
        return sum;
    }
}

