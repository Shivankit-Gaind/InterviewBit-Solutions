public class Solution {
	public int removeElement(ArrayList<Integer> a, int b) {
	    int temp = 0;
	    int temp2 = 0;
	    
	    while(temp<a.size()){
	        if(a.get(temp)!=b){
	            int x = a.get(temp);
	            a.set(temp,a.get(temp2));
	            a.set(temp2,x);
	            temp2++;
	        }
	        temp++;
	    }
	    return temp2;
	}
}

