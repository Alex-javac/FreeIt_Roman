package lesson9;

import java.io.File;

//Вывести список файлов и каталогов выбранного каталога на диске. Файлы и каталоги
//должны быть распечатаны отдельно.
public class Task36 {

    public static void main(String[] args) {
        File dir = new File("/home/alexander/IdeaProjects/FreeIt_Roman/src");
        decFiles(dir);
        decFolders(dir);
    }

    public static void decFiles(File file) {
        if (file.isDirectory())
            for (File item : file.listFiles()) {
                if (item.isDirectory()) {
                    File file1 = new File(item.getAbsolutePath());
                    decFiles(file1);
                } else {
                    System.out.println(item.getName() + "\t file");
                }
            }
    }

    public static void decFolders(File file) {
        if (file.isDirectory())
            for (File item : file.listFiles()) {
                if (item.isDirectory()) {
                    System.out.println(item.getName() + "  \t folder");
                    File file1 = new File(item.getAbsolutePath());
                    decFolders(file1);
                }
            }
    }


}
