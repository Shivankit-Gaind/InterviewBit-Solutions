public class Solution {
	public void sortColors(ArrayList<Integer> a) {
	    int left = 0;
	    int right = a.size()-1;
	    int mid = 0;
	    int pivot =1;
	    
	    while(mid<=right){
	        if(a.get(mid)<pivot){
	            swap(a,left,mid);
	            mid++;
	            left++;
	        }
	        else if(a.get(mid)==pivot)
	            mid++;
	       else{
	           swap(a,mid,right);
	           right--;
	       }
	            
	    }
	}
	
	public void swap(ArrayList<Integer> a, int i, int j){
	    int temp = a.get(i);
	    a.set(i,a.get(j));
	    a.set(j,temp);
	    
	}
}

