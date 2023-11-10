
public class Ex01_String {

	public static void main(String[] args) {

		String str = "AAA"; //AAA는 heap에 만들어짐.
		String str2 = "AAA";//str과 str2는 동일한 주소값 참조
		//heap에 객체 1개 생성
		System.out.println(str);//AAA
		System.out.println(str2.toString());//AAA
		System.out.println(str==str2);//주소값 비교 연산자, true
		
		//문자열 비교
		System.out.println(str.equals(str2));//String 값 비교, true
		
		
		String str3 = new String("BBB");
		String str4 = new String("BBB");
		//new는 무조건 하나씩 더 만듦 -> 주소값이 다르게 됨
		
		System.out.println(str3);//BBB
		System.out.println(str4.toString());//BBB
		System.out.println(str3==str4);//false
		
		String s = "A";
		s += "B";
		s += "C";
		s = "A";
		//stack -> s
		//heap -> A
		//메모리 재할당, heap에서 원래 있던 A 주소 참조x, AB 생성
		//s="A" -> ABC 끊고 원래 있던 A 다시 참조
		
		
	}

}
//stack -> str
//heap -> AAA
//주소값이 떨어지지만 toString()을 재정의함 -> AAA라는 값이 출력됨
