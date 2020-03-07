import java.util.Random;
import java.util.Scanner;
import java.io.IOException;
public class TestDemo2{
	
	
	public static void main(String[] args){
		//每次产生随机数都是按照这个long类型数字产生的
		Random random = new Random();
		int rand = random.nextInt(100);
		System.out.println("rand ：" + rand);
	}

	
	//循环输入
	public static void main4(String[] args){
		Scanner scan=new Scanner(System.in);
		//如果还有下一个就输出   
		while(scan.hasNext()){
			int n=scan.nextInt();
			System.out.println("整型： "+n);
		}
		System.out.println("hha");
	}
	

	
	//有关Scanner的注意事项
	//使用前需要导入包
	//输入内容要和当前内容匹配
	//nextLine不能和nextInt放在一起使用
	public static void main3(String[] args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println("整数" + n);
		String name =scan.nextLine();//遇到空格结束了
		System.out.println("姓名: " + name);
		scan.close();
	}
	
	
	//不建议使用，1.局限性  2.太麻烦。
	public static void main2(String[] args){
		System.out.println("请输入一个字符:");
		try {
			char ch=(char)System.in.read();
			System.out.println(ch);
		}catch(IOException e){
			System.out.println("程序发生异常了！");
		}
		
	}

	public static void main1(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println("输出且换行");
		System.out.print("输出但是不换行");
		System.out.printf("%s\n","格式化输出！");
		System.out.printf("%d\n",n);
	}
}
