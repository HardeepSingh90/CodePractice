package other;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class abc {

	
	public static void main(String[] args) {
		
		
		Set<Long>  s =new HashSet<Long>();
		s.add(10l);
		s.add(20l);
		Map<Long, Set<Long>> m=new HashMap<Long, Set<Long>>();
		m.put(1l, s);
		m.put(2l, s);
		
		Set<Long> new1=m.keySet();
		System.out.println(m.keySet());
		// TODO Auto-generated method stub

	}

}
