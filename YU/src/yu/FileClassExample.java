package yu;

import java.io.File;

public class FileClassExample {
	
	public static void dir(File fd) {
		String[] strFilenames = fd.list();
		for(String s : strFilenames) {
			File f = new File(fd, s);
			long t = f.lastModified();
			System.out.print(s);
			System.out.print("\t파일크기: " + f.length());
			System.out.printf("\t수정한 시간: %tb %td %tT\n",t,t,t,t);
		}
	}
	
	public static void main(String[] args) {
//		File f1 = new File("/Users/seongryeol/Desktop/system.ini");
		File f2 = new File("/Users/seongryeol/Desktop/tmp/java_sample");
		File f3 = new File("/Users/seongryeol/Desktop/tmp");
		
		String strRes;
//		if(f1.isFile())
//			strRes = "파일";
//		else
//			strRes = "디렉터리";
//		System.out.println(f1.getPath() + "은 " + strRes + "입니다.");
		if(!f2.exists()) {
			if(!f2.mkdir())
				System.out.println("디렉터리 생성 실패");
			if(f2.isFile())
				strRes = "파일";
			else
				strRes = "디렉터리";
			System.out.println(f2.getPath() + "은 " + strRes + "입니다.");
			dir(f3);
			
			f2.renameTo(new File("/Users/seongryeol/Desktop/tmp/javasample"));
			dir(f3);
		}
	}

}
