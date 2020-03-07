/*
public class Helloworld{
	public static void main(String[] args){
		int a=10;
		int b=20;
		int tmp=0;
		tmp=a;
		a=b;
		b=tmp;
		System.out.println(a);
		System.out.println(b);
	}
}
*/
public class Helloworld{
	public static void main(String[] args){
		int a=10;
		int b=11;
		int c=12;
		int max=0;
		int min=0;
		if(a>b){
			max=a;
			min=b;
		}	
		else{
			max=b;
			min=a;
		}
		if(c>max)
			max=c;	
        if(c<min)
        min=c;			
		System.out.println("max"+max);
		System.out.println("min"+min);
	}
}