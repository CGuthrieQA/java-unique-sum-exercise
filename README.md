# Unique Sum

1. Given 3 integer values, return their sum. If one value is the same as another value, they do not count towards the sum. In other words, only return the sum of unique numbers given.

	```
	Input(1, 2, 3) -> 6
 	Input(3, 3, 3) -> 0
 	Input(1, 1, 2) -> 2
	```

 
```java
public class Runner {
	
	public static int sum(int num1, int num2, int num3) {
		
		int result = 0;
		
		if (num1 != num2 && num1 != num3 && num2 != num3) {
			result = num1 + num2 + num3;
		} else if (num1 == num2 && num2 == num3){
			result = 0;
		}	
		else if (num1 == num2) {
			result = num3;
		} else if (num1 == num3) {
			result = num2;
		} else if (num2 == num3 ) {
			result = num1;
		}
		
		return result;
		
	}

	public static void main(String[] args) {

		System.out.println(sum(1,2,3));
		System.out.println(sum(3,3,3));
		System.out.println(sum(1,1,2));
		
	}

}
```