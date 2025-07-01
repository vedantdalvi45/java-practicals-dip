import java.applet.*;
import java.awt.*;

public class Meth extends Applet{

    String str;
    public void init()
    {
      str=getParameter("pname");  
      if (str == null)
      str = "Welcome to the World of Applet";
      str = "Hello " + str; 
    }   
      public void paint(Graphics g)
      {
        g.drawString(str, 200, 200);
      }
   
}
