import java.io.*;

public class Copy {
    public static void main(String[] args) {
        try{
        File source = new File( "D:\\Diploma Sem 4\\Subjects\\java\\PRACTICALS\\31-32\\f1.txt");
        File destination = new File("D:\\Diploma Sem 4\\Subjects\\java\\PRACTICALS\\31-32\\f2.txt");
        FileInputStream inputStream = new FileInputStream(source);
        FileOutputStream outputStream = new FileOutputStream(destination);
        int length = (int) source.length();
        byte[] buffer = new byte[length];
        while ((length = inputStream.read(buffer)) > 0) {
            outputStream.write(buffer, 0, length);
        }
        inputStream.close();
        outputStream.close();
        System.out.println("File copied successfully.......");
    }catch(Exception e){
        System.out.println("Exeption Occured");
    }
    }
}