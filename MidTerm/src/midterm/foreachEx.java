package midterm;

public class foreachEx {
	
	enum Week { 월, 화, 수, 목, 금, 토, 일 }
	
	public static void main(String[] args) {
		
		int[] iNum = {1,2,3,4,5};
		String strNames[] = {"사과", "배", "바나나", "체리", "딸기", "포도"};
		int iSum = 0;
		
		// 아래 for-each 에서는 k는 iNum[0], iNum[1] -> iNum[4]로 반복됨
		
		for (int k : iNum)
			iSum += k;
		System.out.println("합은 " + iSum);
		
		for (String s : strNames)
			System.out.print(s + " ");
		System.out.println();
		
		for (Week day : Week.values())
			System.out.print(day + "요일 ");
		System.out.println();
	}

}
