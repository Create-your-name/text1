package text1;

public class Triangles {
	int a,b,c;
	int mix;
	public double Judgment(int a,int b, int c)
	{
		if(a>0&&b>0&&c>0) {
			if(		a+b>c &&
					a+c>b &&  //����֮�ʹ��ڵ�����
					b+c>a &&
					a-b<c &&
					a-c<b &&  //����֮��С�ڵ�����
					b-c<a) {
				return getArea(a,b,c);
			}else {
				mix= size(a,b,c);
				return getArea(mix,mix,mix);
			}
		}else {
			return 0.0;   //��������ʵ��
		}
	}
	public double getArea(int a ,int b ,int c) {
		double q=(a+b+c)/2;
		return (double)Math.sqrt(q*(q-a)*(q-b)*(q-c));
	}
	public int size(int a, int b ,int c ) {
		int mix=a;
		if(b<mix) {
			mix=b;
		}
		if(c<mix) {
			mix=c;
		}
		return mix;
	}
}
