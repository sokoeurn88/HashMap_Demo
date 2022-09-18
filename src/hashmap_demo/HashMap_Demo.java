package hashmap_demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap_Demo {

	public static void main(String[] args) {
		
		HashMap hm=new HashMap();
		hm.put(101, "Sarom");
		hm.put(101, "Pich");
		hm.put(102, "Nath");
		hm.put(103, "Sothy");
		hm.put(104, "Sokoy");
		hm.put(105, "Sodavy");
		hm.put(106, "Sokoeurn");
		hm.put(107, "Solida");
		hm.put(108, "Sothita");
		hm.put(109, "Ksatra");
		System.out.println(hm);
		
		System.out.println(hm.get(106));

		System.out.println(hm.remove(104));
		System.out.println(hm);
		
		System.out.println(hm.containsKey(110));
		System.out.println(hm.containsKey(104));
	
		System.out.println(hm.containsValue("Sodavy"));
		System.out.println(hm.containsValue("Sokoeurn"));
		
		System.out.println(hm.isEmpty());
		
		System.out.println( hm.keySet());
		System.out.println(hm.values());
		
		System.out.println(hm.entrySet());
		
		for(Object i: hm.keySet()) {
			System.out.println(i);
		}
		
		for(Object value: hm.values()) {
			System.out.println(value);
		}
		
		
		for(Object i: hm.keySet()) {
			System.out.println(i+" "+hm.get(i));
		}
		
		for(Object ent:hm.entrySet()) {
			System.out.println(ent);
		}
		
		System.out.println(">>>>>>>>>>>>>>>>");
		
		Set s=hm.entrySet();
		Iterator it=s.iterator();
		while(it.hasNext()) {

			System.out.println(it.next());
		}

		
	}

}
