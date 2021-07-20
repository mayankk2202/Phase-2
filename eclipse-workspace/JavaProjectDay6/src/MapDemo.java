import java.util.*;
import java.util.Map.Entry;


public class MapDemo {
	
	public static void main(String[] args) {
		
		Map<Integer, String> map =new HashMap<>();
		
		map.put(123, "Mayank");
		map.put(456, "Mayank");
		map.put(345, "Rekha");
		map.put(113, "Mayank");
		
		System.out.println(map.size()+" : "+map);
		
		Set<Integer> keys = map.keySet();
		for (Integer key : keys) {
			
			String val = map.get(key);
			System.out.print(val+", ");
		}
		System.out.println("");
		Collection<String> vals = map.values();
		for (String string : vals) {
			System.out.println(string);
		}
		
		map.remove(113);
		System.out.println(map.size()+" : "+map);
		
		map.put(113, "Mayank");		
		if(map.remove(113, "Utkarsha")) {
			System.out.println("Removed");
		}else
			System.out.println("failed to remove");
		System.out.println(map.size()+" : "+map);
		
		Set<Map.Entry<Integer, String>> entry = map.entrySet();
		Iterator<Entry<Integer, String>> itr = entry.iterator();
		
	}

}
