package test03;

public class SortTest {

	public static void main(String[] args) {
		int[] ages = new int[3];
		ages[0] = 10;
		ages[1] = 5;
		ages[2] = 22; //0 > 2로
		              //1 > 2로
		              //2 > 0으로
		
		int tmp = ages[2];
		ages[2] = ages[1];
		ages[1] = ages[0];
		ages[0] = tmp;
		
		for(int i = 0;i<ages.length;i++) {
			System.out.println(ages[i]);
		}
	}
}
