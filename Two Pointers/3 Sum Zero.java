public class Solution {
	public ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> a) {
	    Collections.sort(a);
	    ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
	    HashSet<Triplet> set = new HashSet<Triplet>();
	    int j,k,sum=0,z=0;
	    for(int i=0;i<a.size()-2;i++){
            j=i+1;k=a.size()-1;
            while(j<k){
                if(a.get(i)+a.get(j)+a.get(k)==0){
                    
                    ArrayList<Integer> l = new ArrayList<Integer>();
                    l.add(a.get(i)); l.add(a.get(j)); l.add(a.get(k));
                    
                    //Check whether the triplet already exists or not
                    Triplet t = new Triplet(a.get(i),a.get(j),a.get(k));
                    if(!set.contains(t)){
                        list.add(l);
                        set.add(t);
                    }
                    j++;
                }
                
                else if(a.get(i)+a.get(j)+a.get(k)<0)
                    j++;
                else
                    k--;
            }
        }
        return list;
	}
}

class Triplet{
    int x,y,z;
    public Triplet(int x,int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public boolean equals(Object obj){
        if(obj==null)
            return false;
        if(this==obj)
            return true;
        if(obj.getClass()!=this.getClass())
            return false;
        Triplet t = (Triplet)obj;
        return (this.x==t.x && this.y==t.y && this.z==t.z);
    }
    
    public int hashCode(){
        return x+y+z+ x*y*z;
    }
}


