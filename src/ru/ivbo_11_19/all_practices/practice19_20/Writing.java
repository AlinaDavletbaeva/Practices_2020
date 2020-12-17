package ru.ivbo_11_19.all_practices.practice19_20;
import java.io.*;
import java.nio.file.Paths;
public class Writing {
    public void exec() {
        File tmp = new File("C://Users//Alina//Desktop//JAVAPR//src//ru//ivbo_11_19//all_practices//practice19_20//result.md");
        tmp.delete();
        File file = new File("src");
        search(file);
    }

    public void search(File file) {
        if (file.isDirectory()) {
            String[] list = file.list();
            for (String str : list) {
                search(new File(String.valueOf(Paths.get(file.getAbsolutePath(), str).toAbsolutePath())));
            }
        } else if (file.getAbsolutePath().endsWith(".java")) {
            writeToFile(file);
        }
    }

    public void writeToFile(File file) {
        try {
            try (
                    BufferedReader reader = new BufferedReader(new FileReader(file.getAbsolutePath()));
                    FileWriter writer = new FileWriter("C://Users//Alina//Desktop//JAVAPR//src//ru//ivbo_11_19//all_practices//practice19_20//result.md", true)
            ) {
                writer.write("####" + file.getName() + "\n");
                writer.write("```java\n");
                String line = reader.readLine();
                while (line != null) {
                    writer.write(line);
                    writer.write('\n');
                    line = reader.readLine();
                }
                writer.write("```\n");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Something wrong with path");
        } catch (IOException e) {
            System.out.println("Something wrong I can feel it");
        }
    }

}
