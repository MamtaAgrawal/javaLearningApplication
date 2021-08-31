import java.util.ArrayList;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> myList= new ArrayList<String>();
		myList.add("Mamta");
		myList.add("Bunty");
		myList.add("Mohan");
		
		myList.add(3,"Bittu");
		myList.add(1,"Khushbu");
		
		  System.out.println("Print All the Objects:");
	        for(String s:myList){
	            System.out.println(s);
	        }
	        
	        System.out.println("3rd element in the list is: " + myList.get(2));
	        System.out.println("Is abc is in list: " + myList.contains("abc"));
	        System.out.println("Size of ArrayList: " + myList.size());
	        
	        myList.remove("Khushbu");
	        
	        System.out.println("New Size of ArrayList: " + myList.size());
		

	}

}
