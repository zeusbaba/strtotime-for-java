/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wareninja.opensource.strtotime;

import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;

class MinutesMatcher implements Matcher {

    private final Pattern minutes = Pattern.compile("[\\-\\+]?\\d+ minutes");

    public Date tryConvert(String input, String refDateStr) {

    	Calendar calendar = Calendar.getInstance();
    	if (!StringUtils.isEmpty(refDateStr)) {
    		try {
    			calendar.setTime( DateUtils.parseDate(refDateStr, new String[] {"yyyy-MM-dd'T'HH:mm"}) );
    		}
    		catch (Exception ex) {
    		}
    	}
    	
        if (minutes.matcher(input).matches()) {
            int m = Integer.parseInt(input.split(" ")[0]);
            //Calendar calendar = Calendar.getInstance();
            
            calendar.setTimeInMillis(System.currentTimeMillis()
            		+ (m * 60 * 1000) );
            //calendar.add(Calendar.DAY_OF_YEAR, m * 60 * 1000);
            return calendar.getTime();
        }

        return null;
    }
}
