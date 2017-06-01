

public class ConstructorOverloading {

	    public ConstructorOverloading(){
	        System.out.println("Inside default constructor");
	    }
	    public ConstructorOverloading(int i){
	        System.out.println("Inside single parameter constructor with int value");
	    }
	    public ConstructorOverloading(String str){
	        System.out.println("Inside single parameter constructor with String object");
	    }
	    public ConstructorOverloading(int i, int j){
	    	int sum=i+j;
	        System.out.println("Inside double parameter constrctor sum:"+sum);
	    }

	    public static void main(String a[]){
	        ConstructorOverloading mco = new ConstructorOverloading();
	        ConstructorOverloading spmco = new ConstructorOverloading(10);
	        ConstructorOverloading dpmco = new ConstructorOverloading(10,20);
	    ConstructorOverloading cpmco = new ConstructorOverloading("java2novice");
	    }
	}

