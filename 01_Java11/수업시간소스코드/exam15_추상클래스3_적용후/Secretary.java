package exam15_추상클래스3_적용후;

//비서 클래스
public class Secretary extends Employee{
	
	public Secretary(String name, int salary) {
		this.name = name;
		this.salary =salary;
	}
	//getter, setter 작성
	// 2가지 변수를 한번에 리턴해주는 메서드 작성
	@Override
	public String getEmployee() {
		return name+"\t"+salary;
	}
}
