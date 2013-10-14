/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dateutilities;

import java.text.ParseException;
import java.util.Calendar;

/**
 *
 * @author schereja
 */
public class DateUtilities {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
       Utilities testDateFormat = new Utilities();
        Calendar calendar = Calendar.getInstance();
        System.out.println(testDateFormat.convertDateToString(calendar.getTime()));
        String test = "12/13/13";
       testDateFormat.toDate("12/13/14 12:30:12 AM");
        
    }
}
