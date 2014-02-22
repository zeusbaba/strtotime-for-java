/***
 *   Copyleft 2014 - WareNinja.com / Rumble In The Jungle!
 * 
 *  @author: yg@wareninja.com
 *  @see https://github.com/WareNinja
 *  disclaimer: I code for fun, dunno what I'm coding about :-)
 */


import com.wareninja.opensource.strtotime.MyUtils;
import com.wareninja.opensource.strtotime.Str2Time;

public class ExampleUsage {

	final static String TAG = ExampleUsage.class.getSimpleName();
	
	/*
	 * example usage:
	 * Date now = Str2Time.convert("now");
	 * Date tomorrow = Str2Time.convert("tomorrow");
	 * Date bla1 = Str2Time.convert("3 days");
	 * Date bla2 = Str2Time.convert("-3 days");
	 * 
	 */
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*if (args.length==0) {
			System.out.println(TAG+" " + "missing parameters... Read the source Luke! ");
			System.out.println(TAG+" example parameters: " + "input_to_convert");
			return;
		}*/
		
		System.out.println("now -> " + MyUtils.getFormattedDate( Str2Time.convert("now") ));
		System.out.println("tomorrow -> " + MyUtils.getFormattedDate( Str2Time.convert("tomorrow") ));
		System.out.println("yesterday -> " + MyUtils.getFormattedDate( Str2Time.convert("yesterday") ));
		System.out.println("+80 minutes -> " + MyUtils.getFormattedDate( Str2Time.convert("80 minutes") ));
		System.out.println("-160 minutes -> " + MyUtils.getFormattedDate( Str2Time.convert("-160 minutes") ));
		System.out.println("+8 days -> " + MyUtils.getFormattedDate( Str2Time.convert("8 days") ));
		System.out.println("-16 days -> " + MyUtils.getFormattedDate( Str2Time.convert("-16 days") ));
		System.out.println("+2 weeks -> " + MyUtils.getFormattedDate( Str2Time.convert("2 weeks") ));
		System.out.println("-4 weeks -> " + MyUtils.getFormattedDate( Str2Time.convert("-4 weeks") ));
		System.out.println("Mon Sep 24 03:35:21 +0000 2012 -> " + MyUtils.getFormattedDate( Str2Time.convert("Mon Sep 24 03:35:21 +0000 2012") ));
		
		
	}

}
