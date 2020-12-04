package test04;

public class ArrayTest4 {
	
	public static void main(String[] args) {
		String[] strs = new String[3];
		strs[0] = "거북이";
		strs[1] = "토끼";
		strs[2] = "고래";
		for(int i=0;i<strs.length;i++) {
			//langth를 조건에 추가하여 문자열길이가 짝수인 단어를 출력하게 한다.
			if(strs[i].length()==2) {
			System.out.println(strs[i]);}
		}
			
	}

}
