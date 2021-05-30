import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ex12 {

	public static void main(String[] args) {
		Set set = new TreeSet();  //범위 검색, 정렬
//		Set set = new HashSet();  //정렬 필요
		
		
		for(int i=0;set.size()<6;i++) {
			int num = (int)(Math.random()*45)+1;
			set.add(num);
		}
		// TreeSet은 저장할 때 이미 정렬하기 때문에 따로 정렬할 필요가 없다.
		System.out.println(set);

	}

}