/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dateutilities;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author schereja
 */
public class Utilities {
   
    public String convertDateToString(Date date){
        if(date == null){
            throw new IllegalArgumentException();
        }
      String format = "MM/dd/YYYY hh:mm:ss a";
      SimpleDateFormat sdf = new SimpleDateFormat(format);
      return sdf.format(date);
    }
   //Need the convert formatted date to calendar or date
}
