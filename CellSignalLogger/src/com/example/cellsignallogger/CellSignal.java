/**
 * 
 */

package com.example.cellsignallogger;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.util.Log;

/**
 * @author broth
 * Some code from: Meier, Reto (2012-04-05). Professional Android 4 Application Development (Kindle Locations 18510-18511). Wiley. Kindle Edition. 
 */
public class CellSignal {

	private TelephonyManager  tm;
	private Context appContext;
	private int phoneType;
	private String tag;
	
	public CellSignal(Context ac) {
		super();
		appContext = ac;
		TelephonyManager  tm=(TelephonyManager) appContext.getSystemService(Context.TELEPHONY_SERVICE);
		 int phoneType=tm.getPhoneType();

         switch (phoneType) 
         {
                 case (TelephonyManager.PHONE_TYPE_CDMA):
                            phoneType = TelephonyManager.PHONE_TYPE_CDMA;
                                break;
                 case (TelephonyManager.PHONE_TYPE_GSM):
                            phoneType = TelephonyManager.PHONE_TYPE_GSM;                
                                break;
                 case (TelephonyManager.PHONE_TYPE_NONE):
                	    phoneType = TelephonyManager.PHONE_TYPE_NONE;
                           Log.d(tag," is not a phone");
                                 break;
          }
	}
	

}
