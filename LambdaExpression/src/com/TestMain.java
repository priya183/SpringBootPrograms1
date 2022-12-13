package com;

public class TestMain {
	
	public static void main(String[] args) {
		//sum
		InterfaceSum c=(a)->System.out.println("sum="+(a+a));
		c.sum(10);	
		
		//sub
		/*InterfaceSubstract s=(a,b)->{
			return a-b;
			};
			System.out.println("Sub="+s.sub(20, 20));
	        }
	        */
	
	//sub- with exception
	InterfaceSubstract s1=(a,b)->{
		if(a<b){
			throw new RuntimeException("a is greater than b");
		}else
		{
		return a-b;
		}
		};
		System.out.println("Sub="+s1.sub(10, 20));
        }

}
