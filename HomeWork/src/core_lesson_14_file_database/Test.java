package core_lesson_14_file_database;

import java.io.File;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\Nazar\\git\\HomeWork\\HomeWork\\file-db");
		
		System.out.println(file.mkdirs());
//		int id = Integer.parseInt(file.getName().split("\\.")[0]);
//		System.out.println(id);

	}

}
