/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dateutilities;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author schereja
 */
public class Utilities {
    private static String format = "MM/dd/YYYY hh:mm:ss a";
    public String convertDateToString(Date date){
        if(date == null){
            throw new IllegalArgumentException();
        }
     
      SimpleDateFormat sdf = new SimpleDateFormat(format);
      return sdf.format(date);
    }
 public Date toDate(String date) throws ParseException{
     DateFormat df = new SimpleDateFormat(format);
     Date result = df.parse(format);
     return result;
 }
	
}
