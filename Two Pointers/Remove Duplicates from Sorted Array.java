public class Solution {
	public int removeDuplicates(ArrayList<Integer> A) {
	    int i=0,count=0;
	    if(A.size()==1||A.size()==0)
	        return A.size();

	    for(i=0;i<A.size()-1;i++){
	        if((int)A.get(i)==(int)A.get(i+1)){
	            count++;
	        }
	        else{
	            A.set(i-count,A.get(i));
	        }
	    }
	    A.set(i-count,A.get(i));
	    //Removing last elements
	    for(i=0;i<count;i++){
	        A.remove(A.size()-1);
	    }
	    
	    return A.size();
	}
}

