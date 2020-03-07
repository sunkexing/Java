public class  TestDemo2{
	 public static void main(String[] args){
		System.out.println(10 > 20 && 10 / 0==0);
        System.out.println(10 < 20 || 10 / 0==0);
		//System.out.println(10 > 20 & 10 / 0 ==0);
		//System.out.println(10 < 20 | 10 / 0==0);//不建议使用
		byte a=-1;
		byte c=(byte)(a>>>1);
		System.out.println(c);
	} 
	
    public static void main8(String[] args){
		int a=10;
		int b=20;
		//System.out.println(!a < b);
		boolean flg =true;
		System.out.println(!flg);
		System.out.println(!(a < b));
	}
	
	public static void main7(String[] args){
		int a=1;
		int b=2;
		int c=3;
		boolean flg1=true;
		boolean flg2=false;
		System.out.println(flg1 && flg2);
		System.out.println(a<b && b<c);
		System.out.println(a<b || b<c);
	}
	
	public static void main6(String[] args){
		//关系运算符
		int a=10;
		int b=20;
		System.out.println(a==b);//false
		System.out.println(a!=b);//true
		System.out.println(a<b);//true
		System.out.println(a>b);//false
		System.out.println(a<=b);//true
		System.out.println(a>=b);//false
	}
	
	public static void main5(String[] args){
		int i=10;
		i=i++;
		System.out.println(i);//10
	}
	
	public static void main4(String[] args){
		int i=10;
		int a=++i;//i=i+1;a=i;
		System.out.println(a);//11
		System.out.println(i);//11
	}
	
	public static void main3(String[] args){
		int i=10;
		int a=i++;//a=i;i=i+1;
		System.out.println(a);//10
		System.out.println(i);//11
	}
	
	public static void main2(String[] args){
		//System.out.println(5/0);
		System.out.println(11.5%2.0);//1.5
	}
	
	public static void main1(String[] args){
		System.out.println(5/2);//2
		System.out.println(5.0/2);//2.5
		System.out.println(5/2.0);//2.5
		System.out.println(5.0/2.0);//2.5
		System.out.println(10%3);//1
		System.out.println(10%-3);//1
		System.out.println(-10%3);//-1
		System.out.println(-10%-3);//-1
	}
}