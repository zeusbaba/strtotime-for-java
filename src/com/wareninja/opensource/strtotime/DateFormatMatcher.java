/***
 *   Copyleft 2014 - WareNinja.com / Rumble In The Jungle!
 * 
 *  @author: yg@wareninja.com
 *  @see https://github.com/WareNinja
 *  disclaimer: I code for fun, dunno what I'm coding about :-)
 */

package com.wareninja.opensource.strtotime;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

class DateFormatMatcher implements Matcher {

    private final DateFormat dateFormat;

    public DateFormatMatcher(DateFormat dateFormat) {
        this.dateFormat = dateFormat;
    }

    public Date tryConvert(String input, String refDateStr) {
        try {
            return dateFormat.parse(input);
        } catch (ParseException ex) {
            return null;
        }
    }
}
