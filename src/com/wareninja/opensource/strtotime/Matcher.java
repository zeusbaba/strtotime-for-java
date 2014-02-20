/***
 *   Copyleft 2014 - WareNinja.com / Rumble In The Jungle!
 * 
 *  @author: yg@wareninja.com
 *  @see https://github.com/WareNinja
 *  disclaimer: I code for fun, dunno what I'm coding about :-)
 */

package com.wareninja.opensource.strtotime;

import java.util.Date;


public interface Matcher {

	/**
	 * @param input
	 * @param refDateStr
	 * 
	 * @return the converted Date
	 */
	public abstract Date tryConvert(String input, String refDateStr);

}