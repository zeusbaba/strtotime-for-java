/***
 *   Copyleft 2014 - WareNinja.com / Rumble In The Jungle!
 * 
 *  @author: yg@wareninja.com
 *  @see https://github.com/WareNinja
 *  disclaimer: I code for fun, dunno what I'm coding about :-)
 */

package com.wareninja.opensource.strtotime;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * source adapted & extended from: http://stackoverflow.com/questions/1268174/phps-strtotime-in-java
 * 
 * example usage:
 * Date now = Str2Time.convert("now");
 * Date tomorrow = Str2Time.convert("tomorrow");
 * Date bla1 = Str2Time.convert("3 days");
 * Date bla2 = Str2Time.convert("-3 days");
 */
public final class Str2Time {
	
    private static final List<Matcher> matchers;

    static {
        matchers = new LinkedList<Matcher>();
        matchers.add(new NowMatcher());
        matchers.add(new TomorrowMatcher());
        matchers.add(new YesterdayMatcher());
        matchers.add(new DaysMatcher());
        matchers.add(new WeeksMatcher());
        
        matchers.add(new MinutesMatcher());
        
        matchers.add(new DateFormatMatcher(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")));// format used by FACEBOOK
        matchers.add(new DateFormatMatcher(new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z")));
        matchers.add(new DateFormatMatcher(new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z")));
        matchers.add(new DateFormatMatcher(new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss")));// e.g. Mon, 03 Dec 2012 20:00:00
        matchers.add(new DateFormatMatcher(new SimpleDateFormat("yyyy MM dd")));
        matchers.add(new DateFormatMatcher(new SimpleDateFormat("EEE MMM d HH:mm:ss Z yyyy"))); // format used by TWITTER! e.g. "Mon Sep 24 03:35:21 +0000 2012"
        
        // NOTE: you can add more custom matchers as you like!!!
    }

    public static void registerMatcher(Matcher matcher) {
        matchers.add(0, matcher);
    }
    
    public static Date convert(String input) {
    	return convert(input, "");
    }
    public static Date convert(String input, String refDateStr) {
        for (Matcher matcher : matchers) {
            Date date = matcher.tryConvert(input, refDateStr);

            if (date != null) {
                return date;
            }
        }

        return null;
    }

    private Str2Time() {
        throw new UnsupportedOperationException("cannot instantiate");
    }
}
