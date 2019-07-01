import java.util.Scanner;

public class Menu {
	//int i,i1,i2,i3,i4,i5;//i接收用户输入主菜单，菜单1，菜单2的选项,i2接收菜单11的选项，i3接收菜单3的选项
	int[] a=new int[2];
	public int[] mainMenu() {
	int i;
		System.out.println("***************************************************************************");
		System.out.println("\t\t\t\t小学生数学题自动生成系统\n\n");
		System.out.println("\t\t\t\t1.开始练习\n");
		System.out.println("\t\t\t\t0.退出\n");
		System.out.println("***************************************************************************");
		i=input();
		if(i==1){
			a=this.menu1();
		}
		else if(i==0){
			System.exit(0);
		}
		else{
			System.out.println("输入有误，请重新输入");
			this.mainMenu();
		}
		return a;
	}
	public int[] menu1() {
		int i,j;
		System.out.println("***************************************************************************");
		System.out.println("\t\t\t\t运算方式\n");
		System.out.println("\t\t\t\t1.加法运算\n");
		System.out.println("\t\t\t\t2.减法运算\n");
		System.out.println("\t\t\t\t3.乘法运算\n");
		System.out.println("\t\t\t\t4.除法运算\n");
		System.out.println("***************************************************************************");
		i=input();
		if(i>=1&&i<=4){
			j=this.menu11();
			a[0]=i;
			a[1]=j;
		}
		else{
			System.out.println("输入有误，请重新输入");
			this.menu1();
		}
		return a;
	}
	public int menu11() {
		int i;
		System.out.println("***************************************************************************");
		System.out.println("\t\t\t\t运算范围\n");
		System.out.println("\t\t\t\t5.10以内运算\n");
		System.out.println("\t\t\t\t6.100以内运算\n");
		System.out.println("***************************************************************************");
		i=input();
		if(i!=5&&i!=6){
			System.out.println("输入有误，请重新输入");
			this.menu11();
		}
		return i;
	}
	
	public int menu2() {
		int i;
		System.out.println("***************************************************************************");
		System.out.println("\t\t\t\t1.下一题\n");
		System.out.println("\t\t\t\t2.完成\n");
		System.out.println("\t\t\t\t3.退出\n");
		System.out.println("***************************************************************************");
		i=input();
		if(i!=1&&i!=3&&i!=2){
			System.out.println("输入有误，请重新输入");
			this.menu2();
		}
		return i;
	}
	public int menu3() {
		int i;
		System.out.println("***************************************************************************");
		System.out.println("\t\t\t\t1查看错题本\n");
		System.out.println("\t\t\t\t2.继续做题\n");
		System.out.println("\t\t\t\t3.退出\n");
		System.out.println("***************************************************************************");
		i=input();
		if(i!=1&&i!=3&&i!=2){
			System.out.println("输入有误，请重新输入");
			this.menu3();
		}
		return i;
	}
	public int menu5(){
		int i;
	System.out.println("***************************************************************************");
	System.out.println("\t\t\t\t1.继续做题\n");
	System.out.println("\t\t\t\t2.退出\n");
	System.out.println("***************************************************************************");
	i=input();
	if(i!=1&&i!=2){
		System.out.println("输入有误，请重新输入");
		this.menu5();
	}
	return i;
	
	}
	public int menu4() {
		int i;
		System.out.println("***************************************************************************");
		System.out.println("\t\t\t\t1.下一套题\n");
		System.out.println("\t\t\t\t2.查看错题本\n");
		System.out.println("\t\t\t\t3.退出\n");
		System.out.println("***************************************************************************");
		i=input();
		if(i!=1&&i!=2){
			System.out.println("输入有误，请重新输入");
			this.menu4();
		}
		return i;
	}
	public int menu6() {
		int i;
		System.out.println("***************************************************************************");
		System.out.println("\t\t\t\t1.下一套题\n");
		System.out.println("\t\t\t\t4.退出\n");
		System.out.println("***************************************************************************");
		i=input();
		if(i!=1&&i!=4){
			System.out.println("输入有误，请重新输入");
			this.menu6();
		}
		return i;
	}
	public static int input() {
		int num = 0;
		try {
			Scanner s = new Scanner(System.in );
			String line = s.nextLine();
			num = Integer.parseInt(line);
		} catch (Exception e) {
			System.out.println("输入有误,请重新输入");
			num=Menu.input();
		}
		return num;
	}
}
