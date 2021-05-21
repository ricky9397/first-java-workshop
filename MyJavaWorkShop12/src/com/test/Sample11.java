package com.test;

import java.util.ArrayList;
import java.util.Collections;

class MyElement implements Comparable {
	private int i;
	MyElement(int i){
		this.i = i;
	}
	public int getI() {
		return this.i;
	}
	@Override
	public int compareTo(Object o) {
		MyElement m = (MyElement)o;
		if(this.i < m.getI()) {
			return -1;
		} else if(this.i > m.getI()) {
			return 1;
		}
		return 0;
	}
}

public class Sample11 {
	static void BublleSortArrayList(ArrayList al) {
		MyElement temp;
		boolean sorted = false;
		while(!sorted) {
			sorted = true;
			for(int inx = 0; inx < al.size()-1; inx++) {
				MyElement m3 = (MyElement)al.get(inx);
				MyElement m4 = (MyElement)al.get(inx+1);
				if(m3.compareTo(m4) < 0) {
					temp = m3;
					al.set(inx, m4);
					al.set(inx+1, temp);
					sorted = false;
				}
			}
			
		}
		for(Object m : al) {
			System.out.println(((MyElement)m).getI());
		}
	}
	public static void main(String[] args) {
		MyElement m1 = new MyElement(10);
		MyElement m2 = new MyElement(20);
//		System.out.println(m1.compareTo(m2));
//		System.out.println(m2.compareTo(m1));
//		System.out.println(m2.compareTo(m2));
		ArrayList al = new ArrayList();
		al.add(new MyElement(2));
		al.add(new MyElement(1));
		al.add(new MyElement(3));
		al.add(new MyElement(4));
		for(Object m : al) {
			System.out.print(((MyElement)m).getI());
		}
		System.out.println();
//		BublleSortArrayList(al);
		Collections.sort(al);
		for(Object m : al) {
			System.out.print(((MyElement)m).getI());
		}
	}
}
