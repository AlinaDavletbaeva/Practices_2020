package ru.ivbo_11_19.all_practices.practice19_20;

import java.io.*;
import java.nio.file.Paths;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("").toAbsolutePath().getParent();
        String basePath = "C:\\";
        for (int i = 0; i < path.getNameCount(); i++)
        {
            basePath += path.getName(i);
            if (i < path.getNameCount() - 1)
            {
                basePath += "\\";
            }
        }
        System.out.println(basePath);
        File file = new File(basePath);
        String pianoInTheBushes = basePath + "\\copy.txt";
        System.out.println(pianoInTheBushes);
        String lastPart = "";
        File[] list = file.listFiles();
        for (File currentFile : list)
        {
            if (currentFile.isDirectory() == true && currentFile.isHidden() == false)
            {
                String newPath = currentFile.getAbsolutePath() + "\\src";
                //System.out.println(newPath);
                File viewedFiles = new File(newPath);
                File[] viewedList = viewedFiles.listFiles();
                for (File thisFile : viewedList)
                {
                    System.out.println(thisFile.getAbsolutePath());
                    if (thisFile.isFile())
                    {
                        lastPart += thisFile.getAbsolutePath() + "\n\n";
                        try
                        {
                            try (BufferedReader reader = new BufferedReader(new FileReader(thisFile.getAbsolutePath()));
                                 PrintWriter writer = new PrintWriter(pianoInTheBushes)) {
                                String line = reader.readLine();
                                writer.println(lastPart);
                                while (line != null)
                                {
                                    System.out.println(line);
                                    lastPart += line + "\n";
                                    writer.println(lastPart);
                                    line = reader.readLine();
                                }
                                lastPart += "============================\n";
                            }
                        }
                        catch (FileNotFoundException e)
                        {
                            System.out.println("file not found");
                            e.printStackTrace();
                        }
                        catch (IOException e)
                        {
                            System.out.println("fail with close");
                            e.printStackTrace();
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}
