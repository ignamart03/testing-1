package ddbb;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Csv {

	public static void main(String[] args) throws IOException {
		
		String nombres[]; nombres = new String[201]; 
		BufferedReader fichero = new BufferedReader(new FileReader("C:\\Users\\danie\\Desktop\\pollo.txt"));
		String linea=fichero.readLine();
		int j=1;
		while (linea != null) {
			 // procesar la linea
			 nombres[j]=linea;
			 linea = fichero.readLine();
			 j++;
			 }

		try {
			PrintWriter pw = new PrintWriter(new File("C:\\Users\\danie\\Downloads\\ddbb\\ddbb8.csv"));
			StringBuilder sb = new StringBuilder();

			for (int i = 1; i <=200; i++) {
				sb.append(i);
				sb.append(",");
				sb.append(nombres[i]);
				sb.append(",");
				sb.append("category 1");
				sb.append("\r\n");
			}

			pw.write(sb.toString());
			pw.close();
			System.out.println("finished");

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
