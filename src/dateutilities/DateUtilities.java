/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dateutilities;

import java.util.Calendar;

/**
 *
 * @author schereja
 */
public class DateUtilities {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Utilities testDateFormat = new Utilities();
        Calendar calendar = Calendar.getInstance();
        System.out.println(testDateFormat.convertDateToString(calendar.getTime()));
    }
}
