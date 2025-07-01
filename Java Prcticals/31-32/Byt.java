import java.io.File;
import java.io.FileOutputStream;

public class Byt {
    public static void main(String args[]){
        File file = new File("D:\\Diploma Sem 4\\Subjects\\java\\PRACTICALS\\31-32\\f3.txt");
        try {
            try (FileOutputStream fout = new FileOutputStream(file)) {
                String s = "Example of Java program to write Bytes using ByteStream.";
                byte b[] = s.getBytes();
                fout.write(b);
                System.out.println("Done !!");
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}