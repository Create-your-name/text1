package keshe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
public class liuhai extends JFrame implements ActionListener,MouseListener{
	int x;
	int color=1;
	int y;
	JFrame qi;
	JButton button;
	private JLabel jl1;
	static int game_start=0;//0.1
//	final private int ROWS =14*50;
	int [][]chess=new int[14*50][14*50];
	public Graphics g;
	public static void main(String arg[]) {
		int[][]chess= {{0}};
	liuhai a=new liuhai();
	a.liuhai();
	a.getTime();
}
	public void liuhai() {
	//	int[][] chess=new int[ROWS][ROWS];
		JFrame qi=new JFrame();
		this.setVisible(true);
	//	Container content=qi.getContentPane();
	//	JPanel kuangA=new JPanel();//��A
	//	JButton button= new JButton("��ʼ��Ϸ");
		JButton button1= new JButton("������Ϸ");
		JButton button2= new JButton("��Ҫ����");
		JButton button3= new JButton("��ͣ�����");
		JButton button4= new JButton("�ʰ��·�");
		JButton button5= new JButton("�˳���Ϸ");
		jl1=new JLabel();
	//	kuangA.add(button);
	//	JPanel kuangB= new JPanel();//��B ��ͼ����ť��ͼ���ֿ���
	//	kuangA.setBackground(Color.CYAN);
	//	qi.getContentPane().add(BorderLayout.EAST,kuangA);
	//	kuangA.setSize(100, 750);//��ť����Ĵ�С����
	//	kuangA.setVisible(true);
	//	button.setSize(100, 750);
	//	JLabel blank= new JLabel();
	//	blank.setPreferredSize(new Dimension(500,500));//setpre���ݽ������ҵ���õĳߴ��С
	//  this.add(blank);
		this.add(jl1);
	//	this.add(button);
		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.add(button4);
		this.add(button5);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int n = JOptionPane.showConfirmDialog(null, "�Ƿ����?", "��ʾ",JOptionPane.YES_NO_OPTION);
				if(n==0){		//������ˡ��ǡ���ť
				int i=	JOptionPane.showConfirmDialog(null, ("ƽ��"), "ƽ��",JOptionPane.YES_NO_OPTION);
					dispose();	
				}
			}});
		button4.addActionListener(new ActionListener() {//���������

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				int n = JOptionPane.showConfirmDialog(null, "ȷ��������?", "��ʾ",JOptionPane.YES_NO_OPTION);
				if(n==0){		//������ˡ��ǡ���ť
				int i=	JOptionPane.showConfirmDialog(null, (color==1?"�׷�":"�ڷ�"+"Ӯ"), "����ʤ������",JOptionPane.YES_NO_OPTION);
					dispose();	
				}
			}
			
		});
		button5.addActionListener(new ActionListener() {//�˳���Ϸ������

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				jl1.setText("��Ϸ�˳���");//����
				int n = JOptionPane.showConfirmDialog(null, "ȷ���˳���?", "��ʾ",JOptionPane.YES_NO_OPTION);
				if(n==0){		//������ˡ��ǡ���ť
				int i=	JOptionPane.showConfirmDialog(null, (color==1?"�׷�":"�ڷ�"+"Ӯ"), "����ʤ������",JOptionPane.YES_NO_OPTION);
					dispose();	
				}
		}
	});
		this.setSize(900, 750);//�����������ô�С
		jl1.setBounds(750, 80, 100, 50);
		button1.setBounds(750, 200, 100, 50);
		button2.setBounds(750, 300, 100, 50);
		button3.setBounds(750, 400, 100, 50);
		button4.setBounds(750, 500, 100, 50);
		button5.setBounds(750, 600, 100, 50);
		jl1.setForeground(Color.RED);
		jl1.setFont(new Font("г��",Font.BOLD,13));
		this.setTitle("�л�����֮�������ս");//������������
		this.setResizable(false);//����������С���ɵ�
		this.setLocationRelativeTo(null);//������������
		this.getContentPane().setBackground(new Color(240,233,217));//������ɫ
		this.setLayout(null);
		this.addMouseListener(this);
	}
	public void paint(Graphics g) {
		super.paint(g);//��дpaint
		drawChessTable(g);//��д�������´���
	}
	public void drawChessTable(Graphics g) {//����ͼ���
	//	int size=50;
		for(int i=0; i<14;i++) {//����
			g.drawLine(50, 50+i*50, 50+(14-1)*50, 50+i*50);
		for(int j=0; j<14;j++) {//����
			g.drawLine(50+j*50, 50, 50+j*50, 50+(14-1)*50);
		}
		}
	}
	private void getTime() {//����ʱ
		long time =60;  //һ�����ʱ��
		while(time>=0) {
			jl1.setText("ʣ��ʱ��"+time+"��");
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		time--;
		}
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("��ʼ��Ϸ")) {
		}
	}
	public void actionPerformed1(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		int color=0;
		System.out.println("X:"+e.getX());
		System.out.println("Y:"+e.getY());//�ж������λ�ô���
		x = e.getX();//��ȡ���x��λ��
		y = e.getY();//��ȡ���y��λ��
		if (x<50 ) {
			x=50;
		}
		if(x>700) {
			x=700;
		}
		if(y<50) {
			y=50;
		}
		if(y>700) {
			y=700;
		}
		if((x/25)%2==0) {//25Ϊ������ӣ��ұ����������������������
			x=x/25*25;
		}
		if((x/25)%2==1) {//25Ϊ������ӣ��ұ����������������������
			x=((x/25)+1)*25;
		}
		if((y/25)%2==0) {//25Ϊ������ӣ��ϱ������������±���������
			y=y/25*25;
		}
		if((y/25)%2==1) {//25Ϊ������ӣ��ϱ������������±���������
			y=((y/25)+1)*25;
		}
		if(chess[x][y]==1||chess[x][y]==2) {
			JOptionPane.showMessageDialog(this,"��λ���Ѿ��������ˣ���������һ��û���ӵ�λ��");
		//	this.repaint();
		}else {
			if(chess[x][y]==0) {
				if (color==1) {
					chess[x][y]=1;
				}else {
					chess[x][y]=2;
				}
			}
			set_qizi(x,y);
		}
	//	set_qizi(x,y);
	}
	private void set_qizi(int x, int y) {
		// TODO Auto-generated method stub
		int size=50;
		Graphics g=getGraphics();
		if(color==1) {
			g.setColor(Color.black);
			g.fillOval(x-size/2,y-size/2, size, size);
			color++;
		}else {
			g.setColor(Color.white);
			g.fillOval(x-size/2,y-size/2, size, size);
			color--;
		}
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
