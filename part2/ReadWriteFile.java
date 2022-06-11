package JPL0Lab11.part2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Objects;
import java.util.Scanner;

public class ReadWriteFile { //NOT DONE

    public void test() {
        String line = "";
        try {
            File f = new File("C:\\Users\\Administrator\\IdeaProjects\\Sem2\\src\\java\\JPL0Lab11\\part2\\test2.txt");
            BufferedReader br = Files.newBufferedReader(f.toPath(), StandardCharsets.UTF_8);
            while (true){
                line = br.readLine();
                if (line == null){
                    break;
                }else {
                    if (line == "")
                    System.out.println(line);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

//    Của  Thầy
//    public void readData() {
//        File f = new File("C:\Users\Administrator\IdeaProjects\Sem2\test.txt");
//        try {
//            File f = new File("test.txt");
//            FileInputStream fis = new FileInputStream(f);
//            BufferedInputStream bis = new BufferedInputStream(fis);
//            int i;
//            while ((i = bis.read()) != -1) {
//                System.out.print((char) i);
//            }            System.out.println("");
//            fis.close();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//    }

//    Của  Thầy
    public void writeData(String str) {
        //chuyen chuoi thanh byte
        byte[] b = str.getBytes();
        try {
            FileOutputStream fos = new FileOutputStream("test2.txt");
            fos.write(b);
            fos.flush();
            fos.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    static void listPath(File path) {
        // get all files (or directories) in File path
        File[] files = path.listFiles();
        for (int i = 0; i < Objects.requireNonNull(files).length; i++) {
            System.out.println(files[i].toString());
        }
    }
    public void menu(){
        System.out.println("--------------------\n1. Add a list of Students and save to File");
        System.out.println("2. Loading list of Students from a File\n3. Exit\nYour choice : ");
    }
    public static void main(String[] args) {
//        listPath(new File(" C:\\Users\\Administrator\\IdeaProjects\\Sem2\\src\\java\\JPL0Lab11\\part2"));
        Scanner sc = new Scanner(System.in);
        ReadWriteFile d = new ReadWriteFile();
        int chon =0;
        d.menu();
        while (true) {
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    System.out.println("writing something :");
                    String c = sc.nextLine();
                    d.writeData(c);
                    d.menu();
                    break;
                case 2:
                    d.test();
                    d.menu();
                break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("run again.");
                    d.menu();
                    break;
            }
        }

    }
}

