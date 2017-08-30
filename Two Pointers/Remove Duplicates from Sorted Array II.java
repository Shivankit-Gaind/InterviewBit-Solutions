public class Solution {
	public int removeDuplicates(ArrayList<Integer> a) {
	    int temp=0,temp2=0;
	    int ele=Integer.MIN_VALUE;
	    int count = 0;
	    while(temp<a.size()){
	        int x = a.get(temp);
	        if(x!=ele){
	            ele = x;
	            count = 1;
	        }
	        else{
	            count++;
	        }
	        
	        if(count<3){
	            int y = a.get(temp);
	            a.set(temp,a.get(temp2));
	            a.set(temp2,y);
	            temp2++;
	        }
	        temp++;
	    }
	    return temp2;
	}
}

