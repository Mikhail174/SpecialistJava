import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class WorkFile {
    public static void main(String[] args)  {

        //сначала просто создаём файл
        File file = new File("test.txt");
        try {
            file.createNewFile();
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
            return;
        }

        /*
        //отображаем содержимое папки
        File dir = new File(".");
        File [] files = dir.listFiles();
        for (File f:files
             ) {
            System.out.println(f.getName());//отображаем список всех файлов
        }
         */

        //отображаем только файлы
        File dir = new File(".");
        //реализуем фильтр по файлам
        File [] files = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File currentFile) {

                return currentFile.isFile();
            }
        });
        for (File f:files
        ) {
            System.out.println(f.getName());
        }






    }
}
