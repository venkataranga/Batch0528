package com.training.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.training.classes.Car;

public class Collections {

	public static void main(String[] args) {
		//Lists, Set, Map
		
		List<String> list = new ArrayList<String>(2);
		list.add("first element");
		list.add("second");
		list.add("third");
		System.out.println(list);
		System.out.println(list.get(2));
		System.out.println(list.size());
		list.add(2, "new element");
		System.out.println(list.get(3));
		for(String s : list){
			System.out.println(s);
		}
		
		Set<String> set = new HashSet<String>();
		set.add("set1");
		set.add("set2");
		
		for(String s : set){
			System.out.println(s);
		}
		
		
		Map<String, Car> map = new HashMap<String, Car>();
		//Map map1 = new HashMap();
		map.put("audi", new Car());
		map.put("bmw", new Car("BMW","X5"));
		map.put("kia",new Car());
		//map.put(new Car(), new Object());
		
		System.out.println(map.get("bmw"));
		
		for(String s: map.keySet()){
			System.out.println("Key: "+s+", Value: "+map.get(s));
		}
		
		
	}
	
}
