package exam09_클래스2_생성자4;

public class TestCat {

	public static void main(String[] args) {

	   //1 번 고양이 정보: 야옹이 2 암컷
	   Cat c1 = new Cat("야옹이", 2, "암컷");
		
	   //2 번 고양이 정보: 망치 1 ?
	   Cat c2 = new Cat("망치", 1);
	   
	   //3 번 고양이 정보: 나비
	   Cat c3 = new Cat("나비");
	}
}
