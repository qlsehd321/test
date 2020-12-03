package test01;

public class Condition2 {
	
	public static void main(String[] args) {
		int a = 10;
		int b = 101;
		if(a<100 && b<100) {
			System.out.println("a와b는 모두 100보다 작군요?");
		}else {
			System.out.println("a와b 모두 혹은 둘중 하나가 100보다 같거나 크군요?");
		}
	}

}
