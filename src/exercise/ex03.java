package exercise;

import java.util.*;

class SutdaCard{
	int num;
	boolean isKwang;
	
	SutdaCard(){
		this(1,true);
	}
	
	SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof SutdaCard) {
			SutdaCard c = (SutdaCard)obj;
			return num == c.num && isKwang == c.isKwang;
		}else
			return false;
	}
	
	public String toString(){
		return num + (isKwang ? "K" : "");  // num + (isKwang이 참이면 num+"K" 거짓이면 num+"")
	}
	
	//대부분의 경우 서로 다른 객체라도 클래스의 인스턴스변수 값이 같으면, 예를들어 SutdaCard의 경우 num과 isKwang의 값이
	//같으면 같은 객체로 인식해야한다.
	//equals()만 오버라이딩해줘도 되지만, 해시알고리즘을 사용하는 HashSet에 담을 때는 반드시 hashCode()도 오버라이딩해줘야한다.
	public int hashCode() {
		return toString().hashCode();
	}
}

public class ex03 {

	public static void main(String[] args) {
		SutdaCard c1 = new SutdaCard(3,true);
		SutdaCard c2 = new SutdaCard(3,true);
		SutdaCard c3 = new SutdaCard(1,true);

		
		HashSet set = new HashSet();
		set.add(c1);
		set.add(c2);
		set.add(c3);
		
		System.out.println(set);
	}

}
