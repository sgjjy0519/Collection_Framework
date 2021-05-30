import java.util.ArrayList;
import java.util.Iterator;

public class ex05 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		//ArrayList에 저장
		
		Iterator it = list.iterator();
		//Iterator는 1회용, 다쓰고 나면 다시 얻어와야 한다.
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
//		it = list.iterator();
//		//새로운 Iterator객체를 가져옴
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		for(int i=0;i<list.size();i++) {
			Object obj = list.get(i);
			System.out.println(obj);
		}
	}

}
