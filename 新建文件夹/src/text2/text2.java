package text2;

import java.util.Scanner;
import text2.Guess;
import text1.Triangles;

public class text2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int a;//����Ҫ�µ���
		int b; //�û��²����
		int  Round;
		Round=50;
		Guess a1=new Guess();
		a=a1.come();
		//System.out.println(a);
		b=0;
		//System.out.println("���²�ʧ��");
		while(b!=a) {
			//System.out.println("���²�ʧ��");
			if(Round==0) {
				System.out.println("���²�����Ը�����ʮ�������");	
				System.out.println("һ��ͬ����û�ʸ������Ϸ");
				break;
			}
			System.out.println("���������²����");
			b=input.nextInt();
			if(b>a) {
				System.out.println("����");
			}else if (b<a) {
				System.out.println("С��");
			}else {
				System.out.println("��ϲ���¶���");
				System.out.println("���ĵ÷���"+Round);
			}
			Round--;
		}
	}
}
