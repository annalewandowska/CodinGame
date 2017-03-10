//Anna Lewandowska
package pl.codeme.homeworks;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilesHomework {

	public static void main(String[] args) {
		
		FilesHomework filesHomework = new FilesHomework();
		
		File source = new File("C:/Users/rodzice/workspace/source.txt");
		File dest = new File("C:/Users/rodzice/workspace/dest.txt");
		filesHomework.copyFile(source, dest);
		
		File file = new File(".");
		
		filesHomework.listDirectory(file);
		System.out.println("");
		filesHomework.listAllFiles(file);
		

	}
	
	//listuje zawartoœæ katalogu
	public void listDirectory(File file){
		for(int i = 0; i < file.listFiles().length; i++){
			System.out.print(file.listFiles()[i].getName());
			if(file.listFiles()[i].isDirectory()){ 
				System.out.println(File.separator);
			}else System.out.println("");
		}	
	}
	

	//listuje wszystkie pliki i podkatalogi
	public void listAllFiles(File file){
		System.out.println(file.getPath() + File.separator);
		for(int j = 0; j < file.listFiles().length ;j++){	
			File subfld = file.listFiles()[j];
			if(subfld.isFile()){
				System.out.println(file.listFiles()[j].getPath() + " ");	
			} else {
				listAllFiles(subfld);
			}
		}
	}
	
	
	public void copyFile(File source, File dest){
		
		String readed;
		BufferedWriter out;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(source));
			try {
				FileWriter outFile = new FileWriter(dest);
				out = new BufferedWriter(outFile);
	
				while(br.ready()){
					readed = br.readLine();
					out.write(readed);
					out.newLine();
				}
				br.close();
				out.close();
			} 
			catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {System.out.println("Skopiowane");}
	}
	
	

}
//public static File[] listDirectory(File file){
//return file.listFiles();
//}

//public static String[] listDirectory(File file){
//return file.list();
//}