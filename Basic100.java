package Basic100;

import java.util.Scanner;

public class Basic100 {
	public static void main(String[] args) {
//	[문제1001] Hello을 출력하세요.
//	정답:
//	public class Main {
//		public static void main(String[] args) {
//			System.out.println("Hello"); 
//	* class 이름을 반드시 'Main'으로 입력해야 정상적으로 출력
	
//	[문제1002] Hello World을 출력하세요.
//	정답: 
//	public class Main {
//	    public static void main(String[] args) {
//	        System.out.print("Hello World");
//	    }
//	}
//	
//	[문제1003] 아래 문장을 출력하세요.
		//Hello
		//World
//	정답:
//	public class Main {
//		public static void main(String[] args) {
//		    System.out.print("Hello\nWorld");
//	    }
//	}
//
//	[문제1004] 아래 문장을 출력하세요.
		//'Hello'
//	정답:
//	public class Main {
//		public static void main(String[] args) {
//		    System.out.print("\'Hello\'");
//	    }
//	}
//	[문제1005] 아래 문장을 출력하세요.
		//"Hello World"
//	정답:
//	public class Main {
//	    public static void main(String[] args) {
//	        System.out.print("\"Hello World\"");
//	        }
//	    }	
//		
//	[문제1006] 아래 문장을 출력하세요.
		//"!@#$%^&*()"
//	정답:
//	public class Main {
//		public static void main(String[] args) {
//			System.out.println("!@#$%^&*()");
//			}
//		}
//	[문제1007] 아래 문장을 출력하세요.
//	"C:\Download\hello.cpp"
//	정답:
//	public class Main {
//		public static void main(String[] args) {
//		    System.out.print("\"C:\\Download\\hello.cpp\"");
//	  	  }
//		}
//	[문제1008] 아래 문장을 출력하세요.
//	┌┬┐
//	├┼┤
//	└┴┘

//	정답:
//	public class Main {
//		public static void main(String[] args) {
//		    System.out.println("\u250C\u252C\u2510");
//			System.out.println("\u251C\u253C\u2524");
//			System.out.print("\u2514\u2534\u2518");

//	[문제1010] 정수형(int)으로 변수를 선언하고, 변수에 정수값을 저장한 후 변수에 저장되어 있는 값을 그대로 출력해보자.
//	[정답]
//	import java.util.Scanner;
//	public class Main {
//		public static void main(String[] args) {
//		    Scanner sc=new Scanner(System.in);
//			int data=sc.nextInt(); 
//		    System.out.println(data);
//			}
//		}
		
//	[문제1011] 문자형(char)으로 변수를 하나 선언하고, 변수에 문자를 저장한 후 변수에 저장되어 있는 문자를 그대로 출력해보자.
//	[정답]
//	import java.util.Scanner;
//	public class Main {
//	    public static void main(String[] args) {
//	        Scanner sc = new Scanner(System.in);
//			String x = sc.next();
//			System.out.println(x);
//		}
//	}
		
//	[문제1012] 실수형(float)로 변수를 선언하고 그 변수에 실수값을 저장한 후 저장되어 있는 실수값을 출력해보자.
//	[정답]	
//	import java.util.Scanner;
//	public class Main {
//		public static void main(String[] args) {
//			Scanner sc = new Scanner(System.in);
//			float x = sc.nextFloat();
//			System.out.printf("%f",x);
//	}
//}
		
//	[문제1013] 정수(int) 2개를 입력받아 그대로 출력해보자.
//	[정답]
//	import java.util.Scanner;
//	public class Main {
//		public static void main(String[] args) {
//	        Scanner sc = new Scanner(System.in);
//			int x = sc.nextInt();
//			int y = sc.nextInt();
//			System.out.println(x);
//			System.out.println(y);
//		}
//	}
				
//	[문제1014] 2개의 문자(ASCII CODE)를 입력받아서 순서를 바꿔 출력해보자.
//	[정답]
//	import java.util.Scanner;
//	public class Main {
//		public static void main(String[] args) {
//		    Scanner sc = new Scanner(System.in);
//			String data1 = sc.next(); 
//			String data2 = sc.next();
//			System.out.print(data2+" "+data1);
//		}
//	}
		
//	[문제1015] 실수(float) 1개를 입력받아 저장한 후, 저장되어 있는 값을 소수점 셋 째 자리에서 반올림하여 소수점 이하 둘 째 자리까지 출력하시오.
//	[정답]
//	import java.util.Scanner;
//	public class Main {
//		public static void main(String[] args) {
//		    Scanner sc = new Scanner(System.in);
//			float x = sc.nextFloat();
//			System.out.printf("%.2f",x);
//		}
//	}
		
//	[문제1017] int형 정수 1개를 입력받아 공백을 사이에 두고 3번 출력해보자.
//	[정답]
//	import java.util.Scanner;
//	public class Main {
//		public static void main(String[] args) {
//		    Scanner sc = new Scanner(System.in);
//			int data = sc.nextInt();
//			System.out.print(data+" "+data+" "+data);
//		}
//	}
//	[문제1018] 어떤 형식에 맞추어 시간이 입력될 때, 그대로 출력하는 연습을 해보자.
//	[해결하지 못한 문제]
//	import java.util.Scanner;
//	public class Main {
//		public static void main(String[] args) {
//		    Scanner sc = new Scanner(System.in);
//			int hour = sc.nextInt();
//			int min = sc.nextInt();
//			System.out.printf("%02d:%02d",hour,min);
		
//	[문제1019] 년, 월, 일을 입력받아 지정된 형식으로 출력하는 연습을 해보자.
//	[]
//	import java.util.Scanner;
//	public class Main {
//		public static void main(String[] args) {
//		    Scanner sc = new Scanner(System.in);
//			System.out.println("년,을 입력하세요: ");
//			int year = sc.nextInt();
//			System.out.println("월,을 입력하세요: ");
//			int month = sc.nextInt();
//			System.out.println("일,을 입력하세요: ");	
//			int day = sc.nextInt();
//			System.out.printf("%4d.%02d.%02d", year,month,day);
