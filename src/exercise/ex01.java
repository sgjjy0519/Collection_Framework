package exercise;

import java.util.*;

class Student implements Comparable{
	String name;
	int ban;
	int no;
	int kor, eng, math;
	
	Student(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal() {  //총점
		return kor+eng+math;
	}
	
	float getAverage() {
		return (int)((getTotal()/3f)*10+0.5)/10f;
	}
	
	public String toString() {
		return name+","+ban+","+no+","+kor+","+eng+","+math+","+getTotal()+","+getAverage();
	}

	@Override
	public int compareTo(Object o) {
		if(o instanceof Student) {
			Student tmp = (Student)o;
			return name.compareTo(tmp.name);
		}else {
			return -1;
			
		}
	}
}

public class ex01 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Student("홍길동", 1, 1, 100, 100, 100));
		list.add(new Student("남궁민수", 1, 1, 100, 100, 100));
		list.add(new Student("김자바", 1, 1, 100, 100, 100));
		list.add(new Student("홍어묵", 1, 1, 100, 100, 100));
		list.add(new Student("김양갱", 1, 1, 100, 100, 100));

		Collections.sort(list); 
		// Collections.osrt(List list)를 이용하면 ArrayList에 저장된 요소들을 쉽게 정렬할 수 있다.
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	
	}

}
