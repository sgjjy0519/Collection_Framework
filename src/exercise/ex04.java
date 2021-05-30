package exercise;

import java.util.*;

public class ex04 {

	public static void main(String[] args) {
		Set set = new HashSet();
		//중복허용X, 순서유지 X. 아무리 임의의 순서로 저장을 해도, 해싱(hashing)알고리즘의 특성상 한 숫자가 
		//고정된 위치에 저장되기 때문
		int[][] board = new int[5][5];
		
		for(int i=0;set.size() < 25;i++) {
			set.add((int)(Math.random() * 30)+1+"");
		}
		
		ArrayList list = new ArrayList(set);
		//저장 순서를 유지하는 List인터페이스 구현한 컬렉션 클래스 사용하도록 변경
		Iterator it = list.iterator();
		Collections.shuffle(list);
		
		
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[i].length;j++){
				board[i][j] = Integer.parseInt((String)it.next());
				System.out.println((board[i][j]<10 ? " " : " ")+board[i][j]);
			}
			System.out.println();
		}
	}

}
