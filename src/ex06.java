import java.util.Arrays;

public class ex06 {

	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4};
		int[][] arr2D = {{11,12,13}, {21,22,23}};
		
		System.out.println("arr="+Arrays.toString(arr));
		System.out.println("arr2D="+Arrays.deepToString(arr2D));
		//다차원 배열의 배열 deep.
		
		int[] arr2 = Arrays.copyOf(arr, arr.length);
		int[] arr3 = Arrays.copyOf(arr, 3);
		int[] arr4 = Arrays.copyOf(arr, 7);
		//copyOf : 배열 전체를 복사해 새로운 배열을 만들어 반환
		int[] arr5 = Arrays.copyOfRange(arr, 2, 4); 
		int[] arr6 = Arrays.copyOfRange(arr, 0, 7);
		//copyOfRange : 배열 일부를 복사해 새로운 배열을 만들어 반환, 지정된 범위의 끝은 포함되지 않는다.
		
		System.out.println("arr2="+Arrays.toString(arr2));
		System.out.println("arr3="+Arrays.toString(arr3));
		System.out.println("arr4="+Arrays.toString(arr4));
		System.out.println("arr5="+Arrays.toString(arr5));
		System.out.println("arr6="+Arrays.toString(arr6));
		
		int[] arr7 = new int[5];
		Arrays.fill(arr7, 9); //arr = [9,9,9,9,9] , fill : 배열의 모든요소를 지정한 값으로 채움
		System.out.println("arr7="+Arrays.toString(arr7));
		
		Arrays.setAll(arr7, i -> (int)(Math.random()*6)+1);
		System.out.println("arr7="+Arrays.toString(arr7));
		
		for(int i : arr7) { //향상된 for문
			char[] graph = new char[i];
			Arrays.fill(graph, '*');
			System.out.println(new String(graph)+i);
		}
		
		String[][] str2D = new String[][] {{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D2 = new String[][] {{"aaa","bbb"},{"AAA","BBB"}};
		
		System.out.println(Arrays.equals(str2D, str2D2));
		System.out.println(Arrays.deepEquals(str2D, str2D2));
		
		char[] chArr = {'A', 'B', 'C', 'D', 'E'};
		
		System.out.println("chArr="+Arrays.toString(chArr));
		System.out.println("index of B ="+Arrays.binarySearch(chArr, 'B'));//정렬하지 않아 잘못된결과출력
		//binarySearch : 배열에서 지정된 값이 저장된 위치를 찾아서 반환
		System.out.println("== After Sorting ==");
		Arrays.sort(chArr);
		System.out.println("chArr="+Arrays.toString(chArr));
		System.out.println("index of B ="+Arrays.binarySearch(chArr, 'B'));//정렬 후 올바른결과출력
	}

}
