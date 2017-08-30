public class Solution {
    public int nTriang(ArrayList<Integer> A) {
        Collections.sort(A);
        int n = A.size();
        int result = 0,prime = ((int)Math.pow(10,9)+7);
        for(int i = 2;i<n;i++){
            int j = 0,k = i-1;
            while(j<k){
                if(A.get(j)+A.get(k)>A.get(i)){
                    result = result + (k-j);
                    result%=prime;
                    k--;
                }
                else{
                    j++;
                }
            }
        }
        return result;
    }
}


