package pack1;

import java.util.ArrayList;
import java.util.Collections;

public class MyListUtil {
	
	public static ArrayList<Integer> sort(ArrayList<Integer> list, int order){
		if(order == 0) {
			list.sort(null);
			return list;
		}
		else if(order == 1)
			list.sort(Collections.reverseOrder());
			return list;
	}

}
