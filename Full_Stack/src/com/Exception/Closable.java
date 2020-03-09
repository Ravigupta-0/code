package com.Exception;


interface AutoClosable{
	public void close() throws Exception;
}
public class MyAutocloseable implements AutoClosable{
	@Override
	public void close() throws Exception {
	System.out.println("MyAutoClosable closed!");
	}
}
public  class Closable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
