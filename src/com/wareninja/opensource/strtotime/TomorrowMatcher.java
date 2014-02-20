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

class TomorrowMatcher implements Matcher {

    private final Pattern tomorrow = Pattern.compile("\\W*tomorrow\\W*");

    public Date tryConvert(String input, String refDateStr) {
        if (tomorrow.matcher(input).matches()) {
            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.DAY_OF_YEAR, +1);
            return calendar.getTime();
        } else {
            return null;
        }
    }
}
