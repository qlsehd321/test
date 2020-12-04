package test04;

public class StringTest2 {
	
	public static void main(String[] args) {
		String str = "진석,상혁,은선,예린";
		String[] names = str.split(",");          //split ","를 배열로 쓸수있다.
		for(int i = 0;i<names.length;i++) {
			System.out.println(names[i]);
		}
	}

}
