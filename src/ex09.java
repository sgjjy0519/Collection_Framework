import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ex09 {

	public static void main(String[] args) {
		Set set = new HashSet();
		
		//set의 크기가 6보다 작은 동안 1~45 사이의 난수를저장
		for(int i=0;set.size() < 6; i++) {
			int num = (int)(Math.random()*45)+1;
//			set.add(new Integer(num));
			set.add(num);
		}
		
		List list = new LinkedList(set); //set의 모든 요소를 list에 저장
		Collections.sort(list);			 //list를 정렬
		System.out.println(list);
	}

}
