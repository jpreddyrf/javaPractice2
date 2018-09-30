package JavaPract;

public class Car {

	int mod;
	int milage;
	
	public static void main(String[] args) {
	
		Car a= new Car();
		Car b= new Car();
		Car c= new Car();
		
		a.mod=2018;
		a.milage=1000;
		b.mod=1017;
		b.milage=2000;
		c.mod=2016;
		c.milage=3000;
		System.out.println("a model:"+a.mod);
		System.out.println("a milage:"+a.milage);
		System.out.println("b model:"+b.mod);
		System.out.println("b milage:"+b.milage);
		System.out.println("c model:"+c.mod);
		System.out.println("c milage"+c.milage);
		a=b;
		b=c;
		c=a;
		System.out.println("b=c, a=b b=c---------------------");
		System.out.println("a model:"+a.mod);
		System.out.println("a milage:"+a.milage);
		System.out.println("b model:"+b.mod);
		System.out.println("b milage:"+b.milage);
		System.out.println("c model:"+c.mod);
		System.out.println("c milage"+c.milage);

		System.out.println("b=c, a=b ---------------------");
		System.out.println("a model:"+a.mod);
		System.out.println("a milage:"+a.milage);
		System.out.println("b model:"+b.mod);
		System.out.println("b milage:"+b.milage);
		System.out.println("c model:"+c.mod);
		System.out.println("c milage"+c.milage);
		b=c;
		System.out.println("b=c, a=b ---------------------");
		System.out.println("a model:"+a.mod);
		System.out.println("a milage:"+a.milage);
		System.out.println("b model:"+b.mod);
		System.out.println("b milage:"+b.milage);
		System.out.println("c model:"+c.mod);
		System.out.println("c milage"+c.milage);
		c=a;
		System.out.println("b=c, a=b & c=a ---------------------");
		System.out.println("a model:"+a.mod);
		System.out.println("a milage:"+a.milage);
		System.out.println("b model:"+b.mod);
		System.out.println("b milage:"+b.milage);
		System.out.println("c model:"+c.mod);
		System.out.println("c milage"+c.milage);
		
		/* a=b,b=c,c=a --> values moves a,c value is b, b value is c*/


	}

}
