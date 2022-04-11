package Java;

import java.util.ArrayList;
import java.util.List;

public class Lambda_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
	    list.add(23);
	    list.add(87);
	    list.add(54);
	    list.add(18);
	   
//	    //without lambda
//	    for(int n = 0; n<list.size();n++)
//	    {
//	    	System.out.println(list.get(n));
//	    }
	    
	    //with lambda
	    list.forEach( (n) -> System.out.println(n));
	    
	}

}
