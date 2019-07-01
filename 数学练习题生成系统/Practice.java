import java.io .File;
import java.io .IOException;

public class Practice {
	public static int m, n, j = 0, j1 = 0;//m,n产生的随机数，j1判断答案正误后的返回值0或1，j正确答案的个数
	public static String str,str1;//str生成的题目，str1题目和正确答案
	public int answer, myanswer;//answer正确答案，myanswer用户答案
	

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

	public void creatQuestion1()// 新建题目,10以内加法
	{		
		this.m = (int) (Math.random() * 11);// 随机运算数
		this.n = (int) (Math.random() * 11);
		answer = m + n;// 加法结果
		str = m + "+" + n + "=?";
		str1=str+answer;
		System.out.println(str);
		myanswer =Menu. input();
		System.out.println("正确答案是：" + answer);
		j1 = test(myanswer, answer);
		save(j1);
	}

	public void creatQuestion2() // 新建题目,10以内减法
	{
		this.m = (int) (Math.random() * 11);// 随机运算数
		this.n = (int) (Math.random() * 11);
		answer = m - n;
		str = m + "-" + n + "=?";// 减法结果
		str1=str+answer;
		System.out.println(str);
		myanswer = Menu.input();
		System.out.println("正确答案是：" + answer);
		j1 = test(myanswer, answer);
		save(j1);
	}

	public void creatQuestion3()// 新建题目,10以内乘法
	{
		this.m = (int) (Math.random() * 11);// 随机运算数
		this.n = (int) (Math.random() * 11);
		answer = m * n;// 乘法结果
		str = m + "*" + n + "=?";
		System.out.println(str);
		myanswer = Menu.input();
		System.out.println("正确答案是：" + answer);
		j1 = test(myanswer, answer);
		save(j1);
	}

	public void creatQuestion4() {// 新建题目,10以内除法
		this.m = (int) (Math.random() * 11);// 随机运算数
		this.n = (int) (Math.random() * 11);
		answer = (int) (m / n);// 除法结果
		str = m + "/" + n + "=?";
		str1=str+answer;
		System.out.println(str);
		myanswer = Menu.input();
		System.out.println("正确答案是：" + answer);
		j1 = test(myanswer, answer);
		save(j1);
	}

	public void creatQuestion5() {// 新建题目,100以内加法
		this.m = (int) (Math.random() * 101);// 随机运算数
		this.n = (int) (Math.random() * 101);
		answer = m + n;// 加法结果
		str = m + "+" + n + "=?";
		str1=str+answer;
		System.out.println(str);
		myanswer = Menu.input();
		System.out.println("正确答案是：" + answer);
		j1 = test(myanswer, answer);
		save(j1);
	}

	public void creatQuestion6() {// 新建题目,100以内加减法
		this.m = (int) (Math.random() * 101);// 随机运算数
		this.n = (int) (Math.random() * 101);
		answer = m - n;// 减法结果
		str = m + "-" + n + "=?";
		str1=str+answer;
		System.out.println(str);
		myanswer =Menu. input();
		System.out.println("正确答案是：" + answer);
		j1 = test(myanswer, answer);
		this.save(j1);

	}

	public void creatQuestion7() {// 新建题目,100以内乘法
		this.m = (int) (Math.random() * 101);// 随机运算数
		this.n = (int) (Math.random() * 101);
		answer = m * n;// 乘法结果
		str = m + "*" + n + "=?";
		str1=str+answer;
		System.out.println(str);
		myanswer = Menu.input();
		System.out.println("正确答案是：" + answer);
		j1 = test(myanswer, answer);
		this.save(j1);
	}

	public void creatQuestion8() {// 新建题目,100以内除法
		this.m = (int) (Math.random() * 101);// 随机运算数
		this.n = (int) (Math.random() * 101);
		answer = (int) (m / n);// 除法结果
		str = m + "/" + n + "=?";
		str1=str+answer;
		System.out.println(str);
		myanswer = Menu.input();
		System.out.println("正确答案是：" + answer);
		j1 = test(myanswer, answer);
		this.save(j1);
	}

	public  void save(int i) {
		if (i == 0) {
			ForFile.createFile("myfile", str1);
		}
	}

	public void finish(int i) {
		System.out.println("\t\t\t\t完成了" + i + "道题\n");
		System.out.println("\t\t\t\t正确数：" + j);
		System.out.println("\t\t\t\t得分：" + j * 10);
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
		int t, k,i4, i5, i6 = 1;//t答题个数，k接收用户输入的menu2()的选项，i4接收用户输入的menu3()方法的选项，i5接收用户输入的menu5()方法的选项，i6判断是否要继续做下一套题
		int[] a=new int[2];
		Practice y = new Practice();
		while (i6 == 1) {
			Menu menu=new Menu();
			a=menu.mainMenu();
				System.out.println("第1题：");
				y.question(a[0], a[1]);
				for (t = 1; t < 10; ++t) {
					k=menu.menu2();
					if (k == 1) {
						System.out.println("第" + (t + 1) + "题：");
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

	
