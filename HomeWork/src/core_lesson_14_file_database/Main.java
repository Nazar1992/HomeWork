package core_lesson_14_file_database;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = null;

		try {

			br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter one of number : 0 - for Exit; 1 - show data; 2 - find by id number; "
					+ "3 - remove by id number; 4 - add new File; 5 - Update information;");

			while (true) {

				String input = br.readLine();

				if ("0".equals(input)) {
					System.exit(0);
					break;
				} else if ("1".equals(input)) {

					String data = FileSaver.showData();
					if (data != null) {

						System.out.println("data: " + data);

					} else {
						System.out.println("Database is empty");
						System.out.println("Add new file into database");
					}

				} else if ("2".equals(input)) {

					while (true) {
						System.out.println("Enter file id");
						String id = br.readLine();
						if (!id.isEmpty()) {

							File file = FileSaver.findById(id);

							if (file != null) {
								System.out.println("File was found");
								break;
							} else {
								System.out.println("File was not found");
								break;
							}

						}
					}

				} else if ("3".equals(input)) {

					while (true) {
						System.out.println("Enter file id");
						String id = br.readLine();
						if (!id.isEmpty()) {

							boolean isRemoved = FileSaver.removeById(id);

							if (isRemoved) {
								System.out.println("File was succefully removed");
								break;
							} else {
								System.out.println("File wasn't removed");
							}
						}
					}

				} else if ("4".equals(input)) {
					System.out.println("Type some text");

					while (true) {
						input = br.readLine();
						if (!input.isEmpty()) {

							int id = FileSaver.getLastId() + 1;

							FileSaver fileSaver = new FileSaver(id, input);

							fileSaver.addNewFile();
							break;
						} else
							System.out.println("Type some text");
					}

				} else if ("5".equals(input)) {

					while (true) {
						System.out.println("Enter filename please");
						String fileName = br.readLine();
						if (!input.isEmpty()) {

							if (FileSaver.isFileExists(fileName)) {
								while (true) {
									System.out.println("Edit file please");
									String content = br.readLine();
									if (!content.isEmpty()) {
										FileSaver.updateFile(fileName, content);
										break;
									}
									break;
								}

							} else {
								System.out.println("File doesn't exist");
								break;
							}
						}
						break;
					}
				} else {
					System.out.println("Invalid number");

				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
