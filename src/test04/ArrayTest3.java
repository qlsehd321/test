package test04;

public class ArrayTest3 {
	
	public static void main(String[] args) {
		int[] nums = new int[3];
		// nums의 각방에
		// nums[0] = 3;
		// nums[1] = 6;
		// nums[2] = 9;
		for(int i=0;i<nums.length;i++) {
			nums[i] = (i+1)*3;
		}
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
	}
}
/*
 * 1바이트 = 8비트
 * 1비트가 표현할수있는 수는 1과 0뿐이 없다.
 * 
 * 10진수 => 9
 * 16진수 => 0 1 2 3 4 5 6 7 8 9 a b c d e f
 */
