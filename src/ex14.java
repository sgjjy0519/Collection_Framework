import java.util.TreeSet;

public class ex14 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		int[] score = {80,95,50,35,45,65,10,100};
		
		for(int i=0;i<score.length;i++) {
			set.add(new Integer(score[i])); //set.add(score[i]); 도 가능
		}
		System.out.println("50보다 작은 값 :"+set.headSet(50));  // 오토박싱
		System.out.println("50보다 큰 값 :"+set.tailSet(50));
		System.out.println("40과 80 사이의 값 :"+set.subSet(40, 80));
	}

}
