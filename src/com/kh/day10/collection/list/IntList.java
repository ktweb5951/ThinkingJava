package com.kh.day10.collection.list;

public class IntList {
	int [] nums;
	int size;
	
	//생성자
	public IntList() {
		nums = new int[3];
		size = 0;
	}

	public void add(int num) {
		// TODO Auto-generated method stub
		nums[size] = num;
		size++;
	}

	public int get(int index) {
		// TODO Auto-generated method stub
		return nums[index];
	}

	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	public void clear() {
		// TODO Auto-generated method stub
		nums = new int[3];
		size = 0;
	}
}
