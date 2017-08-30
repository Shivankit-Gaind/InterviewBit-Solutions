public class Solution {
	public void merge(ArrayList<Integer> A, ArrayList<Integer> B) {
	    int i=0,j=0,z=0;
	    while(j<B.size()){
	        if(i>=A.size()){
	            i++;
	            A.add(B.get(j++));
	            continue;
	        }
	        if(A.get(i)==B.get(j)){
                A.add(i,B.get(j));
                i+=2;j++;
            }
            else if(A.get(i)<B.get(j)){
                i++;
            }
            else{
                A.add(i,B.get(j));
                j++; i++;
            }
                
	    }
	    
	}
}



