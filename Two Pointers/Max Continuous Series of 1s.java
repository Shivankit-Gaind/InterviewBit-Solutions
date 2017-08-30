public class Solution {
	public ArrayList<Integer> maxone(ArrayList<Integer> a, int b) {
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    int i = 0;
	    int N = a.size();
	    int length = 0,flips = 0,final_length=0;
	    int start_final = Integer.MAX_VALUE,end_final = Integer.MAX_VALUE;
	    int start = Integer.MAX_VALUE,end = Integer.MAX_VALUE;
	    while(i<N){
	        if(a.get(i)==1){
	            if(length==0){
	                start = i;
	            }
	            length++;
	            end = i;
	        }
	        
	        else if(a.get(i)==0){
	            flips++;
	            if(length==0){
	                start = i;
	            }
	            length++;
	            end = i;
	            
	            while(flips>b){
	                if(a.get(start)==0){
	                    flips--;
	                }
	                length--;
	                start++;
	            }
	        }
	        
	        if(start>end)
	             end = start;
	             
	       if(final_length<end-start+1){
	           final_length = length;
	           start_final = start;
	           end_final = end;
	       }
	       i++;
	    }
	    

	    for(int k = start_final; k<N && k<=end_final;k++){
	        list.add(k);
	    }
	    return list;
	}
}

