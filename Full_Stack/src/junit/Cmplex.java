package junit;

class Cmplex
{
	int real,img;

	public Cmplex(int i, int j) {
		this.real=i;
		this.img=j;
	}
		
	public Cmplex add(Cmplex n){
		Cmplex temp=new Cmplex(img, img);
		temp.real = this.real + n.real;
		temp.img = this.img + n.img;
		return temp;
		
	}
	public static void main(String args[])
	{
		Cmplex c1 = new Cmplex(4,5);
		Cmplex c2 = new Cmplex(5,4);
		Cmplex c3=new Cmplex(t);
	
		c3=c1.add(c2);
		System.out.println(c3.real+"+i"+c3.img);
	}
}