package shildt.ioshildt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        int i;
        if(args.length != 2) {
            System.out.println("Использование файла CopyFile.java");
        }

        try (FileInputStream fin = new FileInputStream(args[0]);
        FileOutputStream fout = new FileOutputStream((args[1]))){
            do {
                i = fin.read();
                if(i != -1) fout.write(i);
            } while (i != -1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода" + e);;
        }
    }
}
