package Basic100;

import java.util.Scanner;

public class Basic100 {
	public static void main(String[] args) {
//	[����1001] Hello�� ����ϼ���.
//	����:
//	public class Main {
//		public static void main(String[] args) {
//			System.out.println("Hello"); 
//	* class �̸��� �ݵ�� 'Main'���� �Է��ؾ� ���������� ���
	
//	[����1002] Hello World�� ����ϼ���.
//	����: 
//	public class Main {
//	    public static void main(String[] args) {
//	        System.out.print("Hello World");
//	    }
//	}
//	
//	[����1003] �Ʒ� ������ ����ϼ���.
		//Hello
		//World
//	����:
//	public class Main {
//		public static void main(String[] args) {
//		    System.out.print("Hello\nWorld");
//	    }
//	}
//
//	[����1004] �Ʒ� ������ ����ϼ���.
		//'Hello'
//	����:
//	public class Main {
//		public static void main(String[] args) {
//		    System.out.print("\'Hello\'");
//	    }
//	}
//	[����1005] �Ʒ� ������ ����ϼ���.
		//"Hello World"
//	����:
//	public class Main {
//	    public static void main(String[] args) {
//	        System.out.print("\"Hello World\"");
//	        }
//	    }	
//		
//	[����1006] �Ʒ� ������ ����ϼ���.
		//"!@#$%^&*()"
//	����:
//	public class Main {
//		public static void main(String[] args) {
//			System.out.println("!@#$%^&*()");
//			}
//		}
//	[����1007] �Ʒ� ������ ����ϼ���.
//	"C:\Download\hello.cpp"
//	����:
//	public class Main {
//		public static void main(String[] args) {
//		    System.out.print("\"C:\\Download\\hello.cpp\"");
//	  	  }
//		}
//	[����1008] �Ʒ� ������ ����ϼ���.
//	������
//	������
//	������

//	����:
//	public class Main {
//		public static void main(String[] args) {
//		    System.out.println("\u250C\u252C\u2510");
//			System.out.println("\u251C\u253C\u2524");
//			System.out.print("\u2514\u2534\u2518");

//	[����1010] ������(int)���� ������ �����ϰ�, ������ �������� ������ �� ������ ����Ǿ� �ִ� ���� �״�� ����غ���.
//	[����]
//	import java.util.Scanner;
//	public class Main {
//		public static void main(String[] args) {
//		    Scanner sc=new Scanner(System.in);
//			int data=sc.nextInt(); 
//		    System.out.println(data);
//			}
//		}
		
//	[����1011] ������(char)���� ������ �ϳ� �����ϰ�, ������ ���ڸ� ������ �� ������ ����Ǿ� �ִ� ���ڸ� �״�� ����غ���.
//	[����]
//	import java.util.Scanner;
//	public class Main {
//	    public static void main(String[] args) {
//	        Scanner sc = new Scanner(System.in);
//			String x = sc.next();
//			System.out.println(x);
//		}
//	}
		
//	[����1012] �Ǽ���(float)�� ������ �����ϰ� �� ������ �Ǽ����� ������ �� ����Ǿ� �ִ� �Ǽ����� ����غ���.
//	[����]	
//	import java.util.Scanner;
//	public class Main {
//		public static void main(String[] args) {
//			Scanner sc = new Scanner(System.in);
//			float x = sc.nextFloat();
//			System.out.printf("%f",x);
//	}
//}
		
//	[����1013] ����(int) 2���� �Է¹޾� �״�� ����غ���.
//	[����]
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
				
//	[����1014] 2���� ����(ASCII CODE)�� �Է¹޾Ƽ� ������ �ٲ� ����غ���.
//	[����]
//	import java.util.Scanner;
//	public class Main {
//		public static void main(String[] args) {
//		    Scanner sc = new Scanner(System.in);
//			String data1 = sc.next(); 
//			String data2 = sc.next();
//			System.out.print(data2+" "+data1);
//		}
//	}
		
//	[����1015] �Ǽ�(float) 1���� �Է¹޾� ������ ��, ����Ǿ� �ִ� ���� �Ҽ��� �� ° �ڸ����� �ݿø��Ͽ� �Ҽ��� ���� �� ° �ڸ����� ����Ͻÿ�.
//	[����]
//	import java.util.Scanner;
//	public class Main {
//		public static void main(String[] args) {
//		    Scanner sc = new Scanner(System.in);
//			float x = sc.nextFloat();
//			System.out.printf("%.2f",x);
//		}
//	}
		
//	[����1017] int�� ���� 1���� �Է¹޾� ������ ���̿� �ΰ� 3�� ����غ���.
//	[����]
//	import java.util.Scanner;
//	public class Main {
//		public static void main(String[] args) {
//		    Scanner sc = new Scanner(System.in);
//			int data = sc.nextInt();
//			System.out.print(data+" "+data+" "+data);
//		}
//	}
//	[����1018] � ���Ŀ� ���߾� �ð��� �Էµ� ��, �״�� ����ϴ� ������ �غ���.
//	[�ذ����� ���� ����]
//	import java.util.Scanner;
//	public class Main {
//		public static void main(String[] args) {
//		    Scanner sc = new Scanner(System.in);
//			int hour = sc.nextInt();
//			int min = sc.nextInt();
//			System.out.printf("%02d:%02d",hour,min);
		
//	[����1019] ��, ��, ���� �Է¹޾� ������ �������� ����ϴ� ������ �غ���.
//	[]
//	import java.util.Scanner;
//	public class Main {
//		public static void main(String[] args) {
//		    Scanner sc = new Scanner(System.in);
//			System.out.println("��,�� �Է��ϼ���: ");
//			int year = sc.nextInt();
//			System.out.println("��,�� �Է��ϼ���: ");
//			int month = sc.nextInt();
//			System.out.println("��,�� �Է��ϼ���: ");	
//			int day = sc.nextInt();
//			System.out.printf("%4d.%02d.%02d", year,month,day);
