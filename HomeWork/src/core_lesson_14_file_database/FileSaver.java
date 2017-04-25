package core_lesson_14_file_database;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileSaver {

	private int id;
	private String content;

	public FileSaver() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FileSaver(int id, String content) {
		super();
		this.id = id;
		this.content = content;
	}

	public static String showData() throws IOException {

		String data = "";

		File[] files = new File("C:\\Users\\Nazar\\git\\HomeWork\\HomeWork\\file-db").listFiles();

		File file;
		FileInputStream fileInputStream = null;

		if (files.length == 0) {
			return null;
		} else {
			for (int i = 0; i < files.length; i++) {
				file = files[i];
				fileInputStream = new FileInputStream(file);

				int tmp;

				data += "File with name " + file.getName() + " ";

				while ((tmp = fileInputStream.read()) != -1) {

					data += (char) tmp;
				}
				data += " ";
			}
			fileInputStream.close();
		}

		return data;
	}

	public void addNewFile() {
		File file = new File("C:\\Users\\Nazar\\git\\HomeWork\\HomeWork\\file-db\\" + id + ".txt");
		try {
			file.createNewFile();

			FileOutputStream fileOutputStream = new FileOutputStream(file, true);

			fileOutputStream.write(content.getBytes());

			fileOutputStream.close();
			System.out.println("File was successfully created.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error while saving file");

		}
	}

	public static boolean removeById(String id) {

		File file = new File("C:\\Users\\Nazar\\git\\HomeWork\\HomeWork\\file-db\\" + id + ".txt");

		if (file.exists()) {
			file.delete();
			return true;
		} else {
			return false;
		}
	}

	public static int getLastId() {
		int lastId = 1;

		File[] files = new File("C:\\Users\\Nazar\\git\\HomeWork\\HomeWork\\file-db").listFiles();

		if (files.length == 0) {
			return lastId;
		} else {

			File file = files[files.length - 1];
			lastId = Integer.parseInt(file.getName().split("\\.")[0]);
			return lastId;
		}
	}

	public static File findById(String fileId) {

		File file = new File("C:\\Users\\Nazar\\git\\HomeWork\\HomeWork\\file-db\\" + fileId + ".txt");

		if (file.exists()) {
			return file;
		} else {
			return null;
		}
	}

	public static boolean isFileExists(String fileName) {

		File file = new File("C:\\Users\\Nazar\\git\\HomeWork\\HomeWork\\file-db\\" + fileName + ".txt");

		if (file.exists()) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean updateFile(String fileName, String content) {

		File file = new File("C:\\Users\\Nazar\\git\\HomeWork\\HomeWork\\file-db\\" + fileName + ".txt");

		if (file.exists()) {

			try {
				file.createNewFile();

				FileOutputStream fileOutputStream = new FileOutputStream(file, true);

				fileOutputStream.write(content.getBytes());

				fileOutputStream.close();
				System.out.println("File was successfully updated.");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Error while updating file");

			}
			return true;
		} else {
			return false;
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
