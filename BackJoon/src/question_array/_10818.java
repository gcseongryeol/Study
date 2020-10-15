//package question_array;
//
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//
//
//public class _10818 {
//	
//	public static void main(String[] args) throws IOException {
//		
//	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//	
//	int N = Integer.parseInt(br.readLine());
//	String[] numbers = br.readLine().split(" ");
//	int min = 1000001;
//	int max = -1000001;
//	for(int i = 0; i < N; i++) {
//		if(min > Integer.parseInt(numbers[i])) {
//			min = Integer.parseInt(numbers[i]);
//		}
//		
//		if(max < Integer.parseInt(numbers[i])) {
//			max = Integer.parseInt(numbers[i]);
//		}
//	}
//	
//	bw.write(Integer.toString(min) + " " + Integer.toString(max));
//	bw.flush();
//	bw.close();
//	
//
//	}
//
//}
