import java.util.Scanner;

//주민번호 : 뒷번호 첫자리 : 1,3 남자 , 2,4 여자 라고 출력 ... 하는 문제
//main 함수 Scanner  사용 주민번호 입력받고
//앞:6자리     뒷:7자리

//입력값 : 123456-1234567 

//static 
//1. 자리수 체크 (기능)함수 (14 ok)  return true , false 
//2. 뒷번호 첫번째 자리값 1~4까지의 값만 허용 기능함수  return true, false
//3. 뒷번호 첫번째 자리값을 가지고 1,3 남자 , 2,4 여자 출력 기능함수  void  출력

public class Ex02_String_Class {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
	
		System.out.println("주민번호를 입력하세요. 입력 예시->123456-1234567");
		
		String str = in.nextLine();
		String[] cdn = str.split("");
//		for(int i=0;i<cdn.length;i++) {
//			System.out.println(cdn[i]);
//		}
		
		//앞자리 6자리, 뒷자리 7자리
		//cdn[0]~cdn[5]
		//cdn[6]="-"
		//cdn[7]~cdn[13]
		
		switch(cdn[7]) {
		case "1":
		case "3":
			System.out.println("남자");
			break;
		case "2":
		case "4":
			System.out.println("여자");
			break;
		default:
			System.out.println("성별이 올바르지 않음");
		}
		
		
	}


	
	
}
