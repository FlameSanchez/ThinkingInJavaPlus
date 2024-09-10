package io.myTest;

import net.mindview.util.Directory;
import net.mindview.util.PPrint;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileTest {

    public static void main(String[] args) throws IOException {

            File file = new File("F:\\games02\\a");
        File file1 = new File(".");
        File file2 = new File("F:\\games01\\b");
//        System.out.println(Arrays.toString(file.list()));
//        System.out.println(file);
//        System.out.println(Arrays.toString(file1.list()));
//        System.out.println(Arrays.toString(file.listFiles()));


//        System.out.println(Directory.walk("F:\\games02"));
//        System.out.println(Directory.walk(file).dirs);
//        PPrint.pprint(Directory.walk(file).dirs);

//        System.out.println(file.getAbsolutePath());
//        System.out.println(file.getCanonicalPath());
//        System.out.println(file.getCanonicalFile());
//        System.out.println(file.getAbsoluteFile());
//        System.out.println(file.getParent());
//        System.out.println(file.getName());
//        System.out.println(file.getPath());
//        System.out.println(file.canRead() + "\t" + file.canWrite() + "\t" + file.length()+ "\t" + file.lastModified());
//        file.renameTo(file2);
//        System.out.println(file.getName());

//        file.mkdirs();
        file.renameTo(file2);
        System.out.println(file.exists());
    }
}
