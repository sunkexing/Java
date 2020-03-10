import java.util.Scanner;
public class  HomeWork{
	//输出n*n的乘法口诀表，n由用户输入。
	 public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+i*j+"  ");
			}
		}
	 }
	
	//输出一个整数的每一位，如：123的每一位是1 ， 2 ， 3
    public static void main3(String[] args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		while(n!=0){
			int tmp=n%10;
			n=n/10;
			System.out.println(tmp);
		}
	}


	
	public static void main2(String[] args){
		System.out.println("请输入密码，你有三次机会");
		
		int count =3;
		while(count !=0){
			Scanner scan=new Scanner(System.in);
			String password=scan.next();
			if(password.equals("123456")){
				System.out.println("恭喜你密码正确");
				break;
			}else{
				count--;
				System.out.println("密码错误，你还有"+count+"次机会");
			}
		}
		
	}
	
	
	//获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列
	public static void main1(String[] args){
		Scanner scan=new Scanner(System.in);
	    int n=scan.nextInt();
		for(int i=31;i>=1;i-=2){
			System.out.print(((n>>>i)&1));
		}
		System.out.println();
		for(int j=30;j>=0;j-=2){
			System.out.print(((n>>>j)&1));
		}
	}
}