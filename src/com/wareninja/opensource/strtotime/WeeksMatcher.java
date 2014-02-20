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

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DateUtils;

class WeeksMatcher implements Matcher {

    private final Pattern weeks = Pattern.compile("[\\-\\+]?\\d+ weeks");

    public Date tryConvert(String input, String refDateStr) {

    	Calendar calendar = Calendar.getInstance();
    	if (!StringUtils.isEmpty(refDateStr)) {
    		try {
    			calendar.setTime( DateUtils.parseDate(refDateStr, new String[] {"yyyy-MM-dd"}) );
    		}
    		catch (Exception ex) {
    		}
    	}
    	
        if (weeks.matcher(input).matches()) {
            int w = Integer.parseInt(input.split(" ")[0]);
            //Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.DAY_OF_YEAR, w * 7);
            return calendar.getTime();
        }

        return null;
    }
}
