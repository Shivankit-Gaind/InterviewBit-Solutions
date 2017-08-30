public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] intersect(final int[] A, final int[] B) {
        int i=0,j=0,z=0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while(i<A.length&&j<B.length){
            if(A[i]==B[j]){
                arr.add(A[i]);
                i++;j++;
            }
            else if(A[i]<B[j])
                i++;
            else j++;
                
        }
        int array[] = new int[arr.size()];
        for(i = 0;i<arr.size();i++){
            array[i] = arr.get(i);
        }
        return array;
    }
}

