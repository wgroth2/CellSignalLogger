package com.example.cellsignallogger;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/**
 * @author broth
 *
 */
public class MyCellSignalService extends Service {
	public MyCellSignalService() {
	}

	@Override
	public IBinder onBind(Intent intent) {
		// TODO: Return the communication channel to the service.
		throw new UnsupportedOperationException("Not yet implemented");
	}
}
