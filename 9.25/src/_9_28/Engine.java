package _9_28;

public class Engine implements Hello{
	public static void main(String[] args) {
//		Student st = new Student("짱구", 'A');
////		st.Talking();
////		st.Study();
//		
//		//super class 대입
//		Person st_Person;
//		
//		st_Person = st; // Person <- Student
//		st_Person.Talking();
//		
//		st.getGrade();
//		
//		if(st_Person instanceof Student) {
//			System.out.println("True");
//		} else {
//			System.out.println("False");
//		}
//		
//		//Talking call시 -> 자기 이름을 출력하면서 말하기
//		//자기 이름을 적을 수 있는 공간이 필요하다
//		//이름을 객체 생성시 넣어 줘야한다.
//		
//		
//		
//		
//		
//		
//		StudentWorker stw = new StudentWorker("맹구");
//		stw.Eatting();
//		stw.Worker();
//		
//		Person person = new Person("홍길동");
//		person.Talking();
//		
//		Researcher res = new Researcher("철수");
//		res.Talking();
//		res.Search();
//		
//		Professor pro = new Professor("유리");
//		pro.Talking();
//		pro.Teaching();
		
		new Rect().show();
		
		new Circle().show();
		
		new Engine().Print("name");
		
		
	}

	@Override
	public void Print(String name) {
		// TODO Auto-generated method stub
		System.out.println(name);
	}

}
