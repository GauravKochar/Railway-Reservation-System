/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Resources;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JComboBox;


/**
 *
 * @author Gaurav
 */
public class clock extends Thread
{
    
    public void run ()
    {
        try
        {
            while(true)
            {
                Calendar c=new GregorianCalendar();
                 int hour=c.get(Calendar.HOUR);
               
                int min=c.get(Calendar.MINUTE);
                String fixed_min;
                if(min<10)
                {
                    fixed_min="0"+min;
                }
                else
                {
                    fixed_min= ""+min;
                }
                int sec=c.get(Calendar.SECOND);
                String fixed_sec;
                if(sec<10)
                {
                    fixed_sec="0"+sec;
                }
                else
                {
                    fixed_sec= ""+sec;
                }
                
                int am_pm=c.get(Calendar.AM_PM);
                String fixedam_pm;
                if(am_pm==0)
                {
                    fixedam_pm="AM";
                }
                else
                {
                    fixedam_pm="PM";
                }
                    
                String time=hour+":"+fixed_min+":"+fixed_sec+" "+fixedam_pm;
                if(Login.logas.equals("                           Administrator"))
                {
               Adminmenu.jLabel16.setText(time);
                }
                else
                {
               passangermenu.jLabel17.setText(time);
                }
              //  booking.jLabel36.setText(time);
                Thread.sleep(1000);
            }
       }
         catch(Exception e)
         {
             System.out.println(e);
            
        }
        
    }
}
