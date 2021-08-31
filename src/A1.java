import java.util.HashSet;

public class A1 {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("A");
		hs.add("B");
		hs.add("C");
		hs.add("D");
		hs.add("F");
		hs.add("A");
		
		//Print HashSet
        System.out.println("Original HashSet: " + hs);        
        //Print size of HashSet
        System.out.println("Size of HashSet: " + hs.size());
        
      //Print HashSet
        System.out.println("Removing A from HashSet: " + hs.remove("A"));
        
   
        
		

	}

}
