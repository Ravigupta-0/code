package com.annotation;

public class BP {
	private int bp;
public BP(int bp){
	this.bp=bp;
}
public int getBp(){
	return this.bp;
}
class Measure{
	public int getMeasure(){
		if(getBp()>140){
			System.out.println("Alert! This is too high bp ");
		}else{
			System.out.println("Keep it like this.");
		}
		return getBp();
	}
}
}

class ListenerTest{
	public static void main(String args[]){
		Bloodpressure b=new Bloodpressure(156);
		Bloodpressure.Measure m= b.new Measure();
		System.out.println(m.getMeasure());

	}
}


