package com.rohini;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Customer {

	private List<?> list;
	private Set<?> set;
	private Map<?, ?> map;

	public List<?> getList() {
		return list;
	}

	public void setList(List<?> list) {
		this.list = list;
		System.out.println("values: "+list);
	}

	public Set<?> getSet() {
		return set;
	}

	public void setSet(Set<?> set) {
		this.set = set;
		System.out.println("Set: "+set);
	}

	public Map<?, ?> getMap() {
		return map;
	}

	public void setMap(Map<?, ?> map) {
		this.map = map;
		System.out.println("map: "+map);
	}
	
	
	
}
