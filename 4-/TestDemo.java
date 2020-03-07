import java.util.Scanner;
public class TestDemo{
	 public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		//int n=scan.nextInt();
		int n=10;
		switch(n){
		    case 8:
			System.out.println("3");
			break;
			case 7:
			System.out.println("2");
			break;
			default:
			System.out.println("输入有误");
			break;
		}
	}
	
	public static void main7(String[] args){
		int x=10;
		int y=10;
		if(x==20)
			if(y==10)
				System.out.println("aaa");
		else//悬垂else
			System.out.println("bbb");//不输出
	}
	
	public static void main6(String[] args){
		Scanner scan=new Scanner(System.in);
	    int year=scan.nextInt();
		if(year%4==0  &&  year%100!=0  ||  year%400==0){
			System.out.println("当前"+year+"是闰年！");
		}
	}
	
	public static void main5(String[] args){
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int n=scan.nextInt();
			if(n>0){
				System.out.println("当前数字是正数！");
			}else if(n<0){
				System.out.println("当前数字是负数！");
			}else{
				System.out.println("当前数字是0！");
			}
		}
	}
	
	public static void main4(String[] args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		if(n%2==0){
			System.out.println("当前数字是偶数！");
		}else{
			System.out.println("当前数字是奇数！");
		}
	}
	
	public static void main3(String[] args){
		int a=10;
		if(a==20){
			System.out.println("a == 10");//1
			System.out.println("a == 10!");//2
		}else{
			System.out.println("else");//3    4
		}
	}
	
	public static void main2(String[] args){
		int a=10;
		if(a==20){
			System.out.println("a==20");
		}else if(a==8){
			System.out.println("a==8");
		}else{
			System.out.println("a!=8 && a!=20");
		}
	}
	
	public static void main1(String[] args){
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
	}
}

    