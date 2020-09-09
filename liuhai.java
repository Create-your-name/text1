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
	//	JPanel kuangA=new JPanel();//框A
	//	JButton button= new JButton("开始游戏");
		JButton button1= new JButton("重置游戏");
		JButton button2= new JButton("我要悔棋");
		JButton button3= new JButton("求和！！！");
		JButton button4= new JButton("甘拜下风");
		JButton button5= new JButton("退出游戏");
		jl1=new JLabel();
	//	kuangA.add(button);
	//	JPanel kuangB= new JPanel();//框B 试图将按钮和图像框分开来
	//	kuangA.setBackground(Color.CYAN);
	//	qi.getContentPane().add(BorderLayout.EAST,kuangA);
	//	kuangA.setSize(100, 750);//按钮界面的大小设置
	//	kuangA.setVisible(true);
	//	button.setSize(100, 750);
	//	JLabel blank= new JLabel();
	//	blank.setPreferredSize(new Dimension(500,500));//setpre根据界面来找到最好的尺寸大小
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
				int n = JOptionPane.showConfirmDialog(null, "是否求和?", "提示",JOptionPane.YES_NO_OPTION);
				if(n==0){		//如果按了”是”按钮
				int i=	JOptionPane.showConfirmDialog(null, ("平局"), "平局",JOptionPane.YES_NO_OPTION);
					dispose();	
				}
			}});
		button4.addActionListener(new ActionListener() {//认输监听器

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				int n = JOptionPane.showConfirmDialog(null, "确认认输吗?", "提示",JOptionPane.YES_NO_OPTION);
				if(n==0){		//如果按了”是”按钮
				int i=	JOptionPane.showConfirmDialog(null, (color==1?"白方":"黑方"+"赢"), "最终胜利者是",JOptionPane.YES_NO_OPTION);
					dispose();	
				}
			}
			
		});
		button5.addActionListener(new ActionListener() {//退出游戏监听器

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				jl1.setText("游戏退出中");//测试
				int n = JOptionPane.showConfirmDialog(null, "确认退出吗?", "提示",JOptionPane.YES_NO_OPTION);
				if(n==0){		//如果按了”是”按钮
				int i=	JOptionPane.showConfirmDialog(null, (color==1?"白方":"黑方"+"赢"), "最终胜利者是",JOptionPane.YES_NO_OPTION);
					dispose();	
				}
		}
	});
		this.setSize(900, 750);//顶级容器设置大小
		jl1.setBounds(750, 80, 100, 50);
		button1.setBounds(750, 200, 100, 50);
		button2.setBounds(750, 300, 100, 50);
		button3.setBounds(750, 400, 100, 50);
		button4.setBounds(750, 500, 100, 50);
		button5.setBounds(750, 600, 100, 50);
		jl1.setForeground(Color.RED);
		jl1.setFont(new Font("谐体",Font.BOLD,13));
		this.setTitle("中华国粹之五子棋大战");//顶级容器命名
		this.setResizable(false);//顶级容器大小不可调
		this.setLocationRelativeTo(null);//顶级容器居中
		this.getContentPane().setBackground(new Color(240,233,217));//背景颜色
		this.setLayout(null);
		this.addMouseListener(this);
	}
	public void paint(Graphics g) {
		super.paint(g);//重写paint
		drawChessTable(g);//重写方法如下代码
	}
	public void drawChessTable(Graphics g) {//设置图像框
	//	int size=50;
		for(int i=0; i<14;i++) {//横轴
			g.drawLine(50, 50+i*50, 50+(14-1)*50, 50+i*50);
		for(int j=0; j<14;j++) {//纵轴
			g.drawLine(50+j*50, 50, 50+j*50, 50+(14-1)*50);
		}
		}
	}
	private void getTime() {//倒计时
		long time =60;  //一步棋的时间
		while(time>=0) {
			jl1.setText("剩余时间"+time+"秒");
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		time--;
		}
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("开始游戏")) {
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
		System.out.println("Y:"+e.getY());//判读鼠标点击位置代码
		x = e.getX();//获取点击x的位置
		y = e.getY();//获取点击y的位置
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
		if((x/25)%2==0) {//25为半个格子，右边向左缩进，左边向右缩进
			x=x/25*25;
		}
		if((x/25)%2==1) {//25为半个格子，右边向左缩进，左边向右缩进
			x=((x/25)+1)*25;
		}
		if((y/25)%2==0) {//25为半个格子，上边向上缩进，下边向下缩进
			y=y/25*25;
		}
		if((y/25)%2==1) {//25为半个格子，上边向上缩进，下边向下缩进
			y=((y/25)+1)*25;
		}
		if(chess[x][y]==1||chess[x][y]==2) {
			JOptionPane.showMessageDialog(this,"此位置已经有棋子了，请重新下一个没棋子的位置");
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
