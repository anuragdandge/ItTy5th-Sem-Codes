import java.applet.*;
import java.awt.*;
public class Appletlife extends Applet
{

  String msg="go";

  public void init()
  {
   msg="Applet Initilazation";                                                                                        
  }
  
  public void start()
  {
   msg="Applet Start";
  }
  
  public void stop() 
  {
   msg="Applet Stop";
  }
  
  public void destroy()
  {
   msg="Applet Destroy";
  }

  public void paint(Graphics g)
     {
      g.drawString(msg,100,100);
   }
} 