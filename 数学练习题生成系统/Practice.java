import java.io .File;
import java.io .IOException;

public class Practice {
	public static int m, n, j = 0, j1 = 0;//m,n�������������j1�жϴ������ķ���ֵ0��1��j��ȷ�𰸵ĸ���
	public static String str,str1;//str���ɵ���Ŀ��str1��Ŀ����ȷ��
	public int answer, myanswer;//answer��ȷ�𰸣�myanswer�û���
	

	public void question(int x, int y) {
		if (x == 1 && y == 5) {
			creatQuestion1();
		} else if (x == 2 && y == 5) {
			creatQuestion2();
		} else if (x == 3 && y == 5) {
			creatQuestion3();
		} else if (x == 4 && y == 5) {
			creatQuestion4();
		} else if (x == 1 && y == 6) {
			creatQuestion5();
		} else if (x == 2 && y == 6) {
			creatQuestion6();
		} else if (x == 3 && y == 6) {
			creatQuestion7();
		} else if (x == 4 && y == 6) {
			creatQuestion8();
		}
	}

	public void creatQuestion1()// �½���Ŀ,10���ڼӷ�
	{		
		this.m = (int) (Math.random() * 11);// ���������
		this.n = (int) (Math.random() * 11);
		answer = m + n;// �ӷ����
		str = m + "+" + n + "=?";
		str1=str+answer;
		System.out.println(str);
		myanswer =Menu. input();
		System.out.println("��ȷ���ǣ�" + answer);
		j1 = test(myanswer, answer);
		save(j1);
	}

	public void creatQuestion2() // �½���Ŀ,10���ڼ���
	{
		this.m = (int) (Math.random() * 11);// ���������
		this.n = (int) (Math.random() * 11);
		answer = m - n;
		str = m + "-" + n + "=?";// �������
		str1=str+answer;
		System.out.println(str);
		myanswer = Menu.input();
		System.out.println("��ȷ���ǣ�" + answer);
		j1 = test(myanswer, answer);
		save(j1);
	}

	public void creatQuestion3()// �½���Ŀ,10���ڳ˷�
	{
		this.m = (int) (Math.random() * 11);// ���������
		this.n = (int) (Math.random() * 11);
		answer = m * n;// �˷����
		str = m + "*" + n + "=?";
		System.out.println(str);
		myanswer = Menu.input();
		System.out.println("��ȷ���ǣ�" + answer);
		j1 = test(myanswer, answer);
		save(j1);
	}

	public void creatQuestion4() {// �½���Ŀ,10���ڳ���
		this.m = (int) (Math.random() * 11);// ���������
		this.n = (int) (Math.random() * 11);
		answer = (int) (m / n);// �������
		str = m + "/" + n + "=?";
		str1=str+answer;
		System.out.println(str);
		myanswer = Menu.input();
		System.out.println("��ȷ���ǣ�" + answer);
		j1 = test(myanswer, answer);
		save(j1);
	}

	public void creatQuestion5() {// �½���Ŀ,100���ڼӷ�
		this.m = (int) (Math.random() * 101);// ���������
		this.n = (int) (Math.random() * 101);
		answer = m + n;// �ӷ����
		str = m + "+" + n + "=?";
		str1=str+answer;
		System.out.println(str);
		myanswer = Menu.input();
		System.out.println("��ȷ���ǣ�" + answer);
		j1 = test(myanswer, answer);
		save(j1);
	}

	public void creatQuestion6() {// �½���Ŀ,100���ڼӼ���
		this.m = (int) (Math.random() * 101);// ���������
		this.n = (int) (Math.random() * 101);
		answer = m - n;// �������
		str = m + "-" + n + "=?";
		str1=str+answer;
		System.out.println(str);
		myanswer =Menu. input();
		System.out.println("��ȷ���ǣ�" + answer);
		j1 = test(myanswer, answer);
		this.save(j1);

	}

	public void creatQuestion7() {// �½���Ŀ,100���ڳ˷�
		this.m = (int) (Math.random() * 101);// ���������
		this.n = (int) (Math.random() * 101);
		answer = m * n;// �˷����
		str = m + "*" + n + "=?";
		str1=str+answer;
		System.out.println(str);
		myanswer = Menu.input();
		System.out.println("��ȷ���ǣ�" + answer);
		j1 = test(myanswer, answer);
		this.save(j1);
	}

	public void creatQuestion8() {// �½���Ŀ,100���ڳ���
		this.m = (int) (Math.random() * 101);// ���������
		this.n = (int) (Math.random() * 101);
		answer = (int) (m / n);// �������
		str = m + "/" + n + "=?";
		str1=str+answer;
		System.out.println(str);
		myanswer = Menu.input();
		System.out.println("��ȷ���ǣ�" + answer);
		j1 = test(myanswer, answer);
		this.save(j1);
	}

	public  void save(int i) {
		if (i == 0) {
			ForFile.createFile("myfile", str1);
		}
	}

	public void finish(int i) {
		System.out.println("\t\t\t\t�����" + i + "����\n");
		System.out.println("\t\t\t\t��ȷ����" + j);
		System.out.println("\t\t\t\t�÷֣�" + j * 10);
	}

	public static int test(int x, int y) {	
		if (x == y) {
			j++;
			return 1;
		} else {
			return 0;
		}
	}
public static void main(String[] args) throws IOException {
		int t, k,i4, i5, i6 = 1;//t���������k�����û������menu2()��ѡ�i4�����û������menu3()������ѡ�i5�����û������menu5()������ѡ�i6�ж��Ƿ�Ҫ��������һ����
		int[] a=new int[2];
		Practice y = new Practice();
		while (i6 == 1) {
			Menu menu=new Menu();
			a=menu.mainMenu();
				System.out.println("��1�⣺");
				y.question(a[0], a[1]);
				for (t = 1; t < 10; ++t) {
					k=menu.menu2();
					if (k == 1) {
						System.out.println("��" + (t + 1) + "�⣺");
						y.question(a[0],a[1]);
					} else if (k == 2) {
						y.finish(t);
						i4=menu.menu3();
						if (i4 == 1) {
							ForFile.viewFile( "myfile");
							i5=menu.menu5();
							if (i5 == 1) {
								k = 1;
								t--;
								continue;
							} else if (i5 == 2) {
								ForFile.delFile( "myfile");
								System.exit(0);
							}
						} else if (i4 == 2) {
							k = 1;
							t--;
							continue;
						} else if (i4 == 3) {
							ForFile.delFile( "myfile");
							System.exit(0);
						}
					} else if (k == 3) {
						ForFile.delFile( "myfile");
						System.exit(0);
					}
				}
				if (t == 10) {
					y.finish(t);
					i6=menu.menu4();
				}
	if(i6==2){
			ForFile.viewFile( "myfile");
			i6=menu.menu6();
		}

			} 
		if (i6 == 3||i6==4) {
			ForFile.delFile("myfile");
			System.exit(0);
		}
	}
}

	
