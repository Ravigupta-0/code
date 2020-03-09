package com.threading.generics;
class WrapTest<T>{
		private T t;
	
	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}
public class Wrap {
	
	public static void main(String[] args) {
		WrapTest<Integer> w=new WrapTest();
		w.setT(5);
		int x =w.getT();
		System.out.println(x);

	}

}
