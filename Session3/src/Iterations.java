
public class Iterations {

	public static void main(String[] args) {
		
		int num = 9;
		int i = 111;

		/*
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));*/
		
		while(i<=10){
			System.out.println(num+" "+i+"'s are "+(num*i));
			i++;
		}
		
		System.out.println();
		
		num = 7;
		i = 111;
		do{
			System.out.println(num+" "+i+"'s are "+(num*i));
			i++;
		}while(i<=10);
		
		System.out.println();
//		num = 3;
//		i = 1;
		
		/*for(num=3,i=1;i<=10;i++){
			System.out.println(num+" "+i+"'s are "+(num*i));
		}*/
		
		for(int n=5,j=1;j<=10;j++){
			System.out.println(n+" "+j+"'s are "+(n*j));
		}
	}

}
