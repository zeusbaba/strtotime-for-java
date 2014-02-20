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
import java.util.Locale;
import java.util.TimeZone;

import org.apache.commons.lang.StringUtils;

public class MyUtils {

	/**
	 * getShortFormattedDate 
	 * 
	 * return in string format: yyyy-MM-dd
	 */
	public static String getShortFormattedDate() {
		return getShortFormattedDate(System.currentTimeMillis());
	}
	public static String getShortFormattedDate(long millis) {
		String resp = "";
		try {
			resp = getShortFormattedDate(new Date(millis));
		} catch (Exception ex){}
		return resp;
	}
	public static String getShortFormattedDate(Date date) {
		
		String resp = "";
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
			resp = sdf.format(date);
		} catch (Exception ex){}
		return resp;
	}
	 
	/**
	 * getFormattedDate 
	 * 
	 * return in string format: yyyy-MM-dd'T'HH:mm:ssZ
	 */
	public static String getFormattedDate() {
		return getFormattedDate(System.currentTimeMillis());
	}
	public static String getFormattedDate(long millis) {
		String resp = "";
		try {
			resp = getFormattedDate(new Date(millis));
		} catch (Exception ex){}
		return resp;
	}
	public static String getFormattedDate(Date date) {
		
		String resp = "";
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US);
			resp = sdf.format(date);
		} catch (Exception ex){}
		return resp;
	}
	public static String getFormattedDate(Long millis, String timeZone) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US);
		if (!StringUtils.isEmpty(timeZone)) sdf.setTimeZone(TimeZone.getTimeZone(timeZone));
		
		return millis!=null?sdf.format( new Date(millis) ):"";
	}
	
}
