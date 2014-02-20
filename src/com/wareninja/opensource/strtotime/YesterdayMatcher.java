/***
 *   Copyleft 2014 - WareNinja.com / Rumble In The Jungle!
 * 
 *  @author: yg@wareninja.com
 *  @see https://github.com/WareNinja
 *  disclaimer: I code for fun, dunno what I'm coding about :-)
 */

package com.wareninja.opensource.strtotime;

import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;

public class YesterdayMatcher implements Matcher {

    private final Pattern yesterday = Pattern.compile("yesterday");

    public Date tryConvert(String input, String refDateStr) {
        if (yesterday.matcher(input).matches()) {
            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.DAY_OF_YEAR, -1);
            return calendar.getTime();
        } else {
            return null;
        }
    }
}
