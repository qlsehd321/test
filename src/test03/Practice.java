package test03;

public class Practice {
	
	public static void main(String[] args) {
		int[] hi = new int[5];
		for(int i=0;i<5;i++) {
			hi[i] = i+1;
		}
		
		for(int i = 0;i<hi.length;i++) {
			System.out.println(hi[i]);
		}
	}
}
