import java.io.*;
class Displ{
 public static void main(String[] args){
  try{
    FileWriter myWriter = new FileWriter("D:\\Diploma Sem 4\\Subjects\\java\\PRACTICALS\\31-32\\f4.txt");
    myWriter.write(args[0]);
    myWriter.close();
  }
  catch(Exception e)
  {}
 }
}