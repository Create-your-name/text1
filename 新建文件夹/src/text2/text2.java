package text2;

import java.util.Scanner;
import text2.Guess;
import text1.Triangles;

public class text2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int a;//接受要猜的数
		int b; //用户猜测的数
		int  Round;
		Round=50;
		Guess a1=new Guess();
		a=a1.come();
		//System.out.println(a);
		b=0;
		//System.out.println("您猜测失败");
		while(b!=a) {
			//System.out.println("您猜测失败");
			if(Round==0) {
				System.out.println("您猜测次数以高于五十，您真菜");	
				System.out.println("一致同意您没资格继续游戏");
				break;
			}
			System.out.println("请输入您猜测的数");
			b=input.nextInt();
			if(b>a) {
				System.out.println("大了");
			}else if (b<a) {
				System.out.println("小了");
			}else {
				System.out.println("恭喜您猜对了");
				System.out.println("您的得分是"+Round);
			}
			Round--;
		}
	}
}
