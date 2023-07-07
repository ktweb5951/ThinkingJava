package com.kh.day10.collection.list;

public class ObjectList {
	Object [] objects;
	int size;
	
	public ObjectList() {
		objects = new Object[3];
		size = 0;
	}

	public void add(Object input) {
		// TODO Auto-generated method stub
		objects[size] = input;
		size++;
				
	}

	public Object get(int index) {
		// TODO Auto-generated method stub
		return objects[index];
	}
	
	public int size() {
		return size;
	}
	
	public void clear() {
		objects = new Object[3];
		size = 0;
	}
}
