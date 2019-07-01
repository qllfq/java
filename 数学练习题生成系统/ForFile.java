import java.io .BufferedReader;
import java.io .BufferedWriter;
import java.io .File;
import java.io .FileInputStream;
import java.io .FileNotFoundException;
import java.io .FileOutputStream;
import java.io .FileReader;
import java.io .IOException;
import java.io .InputStreamReader;
import java.io .PrintWriter;

public class ForFile {
	
	// �ļ�·��+����
	private static String path = "D:\\java\\";
	private static String filenameTemp;

	/**
	 * �����ļ�
	 * 
	 * @param fileName
	 *            �ļ�����
	 * @param filecontent
	 *            �ļ�����
	 * @return �Ƿ񴴽��ɹ����ɹ��򷵻�true
	 */
	public static boolean createFile(String fileName, String filecontent) {
		Boolean bool = false;
		filenameTemp = path + fileName + ".txt";// �ļ�·��+����+�ļ�����
		File file = new File(filenameTemp);
		try {
			// ����ļ������ڣ��򴴽��µ��ļ�
			if (!file.exists()) {
				file.createNewFile();
				bool = true;
				System.out.println("�ش���󣬴�����Ȿ");
				// �����ļ��ɹ���д�����ݵ��ļ���
				writeFileContent(filenameTemp, filecontent);

			}else{
				writeFileContent(filenameTemp, filecontent);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return bool;
	}

	/**
	 * ���ļ���д������
	 * 
	 * @param filepath
	 *            �ļ�·��������
	 * @param newstr
	 *            д�������
	 * @return
	 * @throws IOException
	 */
	public static boolean writeFileContent(String filepath, String newstr)
			throws IOException {
		Boolean bool = false;
		String filein = newstr + "\r\n";// ��д����У�����
		String temp = "";
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		FileOutputStream fos = null;
		PrintWriter pw = null;
		try {
			File file = new File(filepath);// �ļ�·��(�����ļ�����)
			// ���ļ�����������
			fis = new FileInputStream(file);
			isr = new InputStreamReader(fis);
			br = new BufferedReader(isr);
			StringBuffer buffer = new StringBuffer();
			// �ļ�ԭ������
			for (int i = 0; (temp = br.readLine()) != null; i++) {
				buffer.append(temp);
				// ������֮��ķָ��� �൱�ڡ�\n��
				buffer = buffer.append(System.getProperty("line.separator"));
			}
			buffer.append(filein);
			fos = new FileOutputStream(file);
			pw = new PrintWriter(fos);
			pw.write(buffer.toString().toCharArray());
			pw.flush();
			bool = true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			// ��Ҫ���ǹر�
			if (pw != null) {
				pw.close();
			}
			if (fos != null) {
				fos.close();
			}
			if (br != null) {
				br.close();
			}
			if (isr != null) {
				isr.close();
			}
			if (fis != null) {
				fis.close();
			}
		}
		return bool;
	}

	/**
	 * ɾ���ļ�
	 * 
	 * @param fileName
	 *            �ļ�����
	 * @return
	 */
	public static Boolean delFile(String fileName) {
		 Boolean bool = false;
		filenameTemp = path + fileName + ".txt";
		File file = new File(filenameTemp);
		try {
			if (file.exists()) {
				file.delete();
				 bool = true;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		 return bool;
	}

	
	
	public static void viewFile(String fileName){
		filenameTemp = path + fileName + ".txt";
		File file1 = new File(filenameTemp);
		BufferedReader br = null;
		FileReader fr = null;
		
		try {
			fr = new FileReader(file1);
			br = new BufferedReader(fr);
			String str = null;			//�ڶ��ַ���
			for(;(str=br.readLine())!=null;){
				System.out.println(str);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(br!=null){
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fr!=null){
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
