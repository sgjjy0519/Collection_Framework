import java.util.ArrayList;
import java.util.Collections;

//ArrayList

public class ex01 {

	public static void main(String[] args) {
		//기본길이(용량, capacity)가 10인 ArrayList 생성
		ArrayList list1 = new ArrayList(10); 
		//ArrayList에는 객체만 저장가능
		// autoboxing에 의해 기본형이 참조형으로 자동 변환
//		list1.add(5); 가능		
		list1.add(new Integer(5)); //객체를 전달
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		// ArrayList (Collection c)
		ArrayList list2 = new ArrayList(list1.subList(1, 4)); // 읽기전용 , 인덱스 1부터 인덱스 3(4-1)까지 
		print(list1, list2);
		
		//list1과 list2를 정렬
		Collections.sort(list1); 
		Collections.sort(list2); //Collections.sort(List l)
		print(list1,list2);
		
		System.out.println("list1.containsAll(list2):"+list1.containsAll(list2));
		//list1이 list2의 모든 요소를 포함하고 있을때만 true
		
		list2.add("B");
		list2.add("C");
		list2.add(3,"A"); // 인덱스가 3인 곳에 "A"를 추가
		print(list1,list2);
		
		
		list2.set(3, "AA");
		print(list1,list2);
		
		//list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제
		System.out.println("list1.retainAll(list2):"+list1.retainAll(list2));
		print(list1,list2);
		
		//list2에서 list1에 포함된 객체들을 삭제한다
		for(int i=list2.size()-1;i>=0;i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i); //인덱스가 i인 곳에 저장된 요소를 삭제
		}
		print(list1,list2);
		
	}

	 static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1 : "+list1);
		System.out.println("list2 : "+list2);
		System.out.println();
	}

}
