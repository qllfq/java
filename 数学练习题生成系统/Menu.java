import java.util.Scanner;

public class Menu {
	//int i,i1,i2,i3,i4,i5;//i�����û��������˵����˵�1���˵�2��ѡ��,i2���ղ˵�11��ѡ�i3���ղ˵�3��ѡ��
	int[] a=new int[2];
	public int[] mainMenu() {
	int i;
		System.out.println("***************************************************************************");
		System.out.println("\t\t\t\tСѧ����ѧ���Զ�����ϵͳ\n\n");
		System.out.println("\t\t\t\t1.��ʼ��ϰ\n");
		System.out.println("\t\t\t\t0.�˳�\n");
		System.out.println("***************************************************************************");
		i=input();
		if(i==1){
			a=this.menu1();
		}
		else if(i==0){
			System.exit(0);
		}
		else{
			System.out.println("������������������");
			this.mainMenu();
		}
		return a;
	}
	public int[] menu1() {
		int i,j;
		System.out.println("***************************************************************************");
		System.out.println("\t\t\t\t���㷽ʽ\n");
		System.out.println("\t\t\t\t1.�ӷ�����\n");
		System.out.println("\t\t\t\t2.��������\n");
		System.out.println("\t\t\t\t3.�˷�����\n");
		System.out.println("\t\t\t\t4.��������\n");
		System.out.println("***************************************************************************");
		i=input();
		if(i>=1&&i<=4){
			j=this.menu11();
			a[0]=i;
			a[1]=j;
		}
		else{
			System.out.println("������������������");
			this.menu1();
		}
		return a;
	}
	public int menu11() {
		int i;
		System.out.println("***************************************************************************");
		System.out.println("\t\t\t\t���㷶Χ\n");
		System.out.println("\t\t\t\t5.10��������\n");
		System.out.println("\t\t\t\t6.100��������\n");
		System.out.println("***************************************************************************");
		i=input();
		if(i!=5&&i!=6){
			System.out.println("������������������");
			this.menu11();
		}
		return i;
	}
	
	public int menu2() {
		int i;
		System.out.println("***************************************************************************");
		System.out.println("\t\t\t\t1.��һ��\n");
		System.out.println("\t\t\t\t2.���\n");
		System.out.println("\t\t\t\t3.�˳�\n");
		System.out.println("***************************************************************************");
		i=input();
		if(i!=1&&i!=3&&i!=2){
			System.out.println("������������������");
			this.menu2();
		}
		return i;
	}
	public int menu3() {
		int i;
		System.out.println("***************************************************************************");
		System.out.println("\t\t\t\t1�鿴���Ȿ\n");
		System.out.println("\t\t\t\t2.��������\n");
		System.out.println("\t\t\t\t3.�˳�\n");
		System.out.println("***************************************************************************");
		i=input();
		if(i!=1&&i!=3&&i!=2){
			System.out.println("������������������");
			this.menu3();
		}
		return i;
	}
	public int menu5(){
		int i;
	System.out.println("***************************************************************************");
	System.out.println("\t\t\t\t1.��������\n");
	System.out.println("\t\t\t\t2.�˳�\n");
	System.out.println("***************************************************************************");
	i=input();
	if(i!=1&&i!=2){
		System.out.println("������������������");
		this.menu5();
	}
	return i;
	
	}
	public int menu4() {
		int i;
		System.out.println("***************************************************************************");
		System.out.println("\t\t\t\t1.��һ����\n");
		System.out.println("\t\t\t\t2.�鿴���Ȿ\n");
		System.out.println("\t\t\t\t3.�˳�\n");
		System.out.println("***************************************************************************");
		i=input();
		if(i!=1&&i!=2){
			System.out.println("������������������");
			this.menu4();
		}
		return i;
	}
	public int menu6() {
		int i;
		System.out.println("***************************************************************************");
		System.out.println("\t\t\t\t1.��һ����\n");
		System.out.println("\t\t\t\t4.�˳�\n");
		System.out.println("***************************************************************************");
		i=input();
		if(i!=1&&i!=4){
			System.out.println("������������������");
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
			System.out.println("��������,����������");
			num=Menu.input();
		}
		return num;
	}
}
