import java.awt.*;
import java.applet.*;
public class control extends Applet
{
 public void paint(Graphics g)
 {
   for(int i=0; i<=4; i++)
 {
  if((i%2)==0)
   g.drawOval(200, i*(60+10), 50, 50);
  else
   g.fillOval(200, i*(60+10), 50, 50);
  }
 }
}
