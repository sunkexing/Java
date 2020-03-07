import java.util.Scanner;
public class  TestDemo2{
	//do while 循环   先使用，再循环
	public static void main(String[] args) {
		int i=0;
		do{
			System.out.println("aaa");
			
		//}while(true);//进入死循环
	    }while(i<0);
	}
	
	//for 循环 求 1！+2！+3！
	public static void main8(String[] args) {
		int sum=0;
		for(int i=1;i<=3;i++){
			int tmp=1;
			for(int j=1;j<=i;j++){
				tmp*=j;	
			}
			sum+=tmp;
		}
	    System.out.println("sum=" + sum);
	}
	
	
	//找到100-200中所有3的倍数
	public static void main7(String[] args) {
		int i=100;
		while(i<=200){
			if(i%3!=0){
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
	}
	
	//找到100-200中第一个3的倍数
	public static void main6(String[] args) {
		int i=100;
		while(i<=200){
			if(i%3==0){
				System.out.println(i);
				break;
			}
			i++;
		}
	}
	
	
	// break结束所有循环,让循环结束
	//continue结束本躺循环,进行下次循环
	public static void main5(String[] args) {
		int a=10;
		int i=1;
		while(i<=a){
			if(i==2){
				//break;
				continue;
			}
			System.out.println(i);
			i++;
		}
	}
		
		//while循环求1！+2！+...+n!
	public static void main4(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int j=1;
		int sum=0;
		while(j<=n){//外层负责加和
			int a=1;
			int b=1;
			while(b<=j){//内层负责求阶乘
				a=a*b;
				b++;
			}
			sum=sum+a;
			j++;
		}
		System.out.println("sum=" + sum);
	}
	
	public static void main3(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int i=1;
		int ret=1;
		while(i<=n){
			ret=ret*i;
			i++;
		}
		System.out.println("阶乘=" + ret);
	}
	
	public static void main2(String[] args) {
		int i = 1;
		int sum = 0;
		while (i <= 100) {
			sum += i;//sum = sum+i;
			i++;
		}
		System.out.println("1-100的和="+sum);
		//计算1-100偶数的和
        i=2;
		int SumEve=0;
		while(i<=100){
			SumEve+=i;
			i+=2;
		}
		System.out.println("偶数的和="+SumEve);
		
	    //计算1-100奇数的和
         i =1;
		 int SumOdd=0;
         while(i<=100){
			 SumOdd+=i;
			 i+=2;
		 } 
		System.out.println("奇数的和="+SumEve);
	}
	
	//while循环
	public static void main1(String[] args) {
		int num=5;
		int i=1;
		while(i<=num){
			System.out.println(i+" ");
			i++;
		}
		
	}
}
