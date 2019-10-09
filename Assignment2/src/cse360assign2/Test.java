package cse360assign2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddingMachine calc=new AddingMachine();
		
		calc.add(10);
		calc.subtract(2);
		calc.subtract(2);
		System.out.println(calc.toString());
		
		System.out.println(calc.getTotal());
		
		calc.clear();
		System.out.println(calc.getTotal());
		System.out.println(calc.toString());
		
		calc.add(10);
		System.out.println(calc.getTotal());
		System.out.println(calc.toString());
	}

}
