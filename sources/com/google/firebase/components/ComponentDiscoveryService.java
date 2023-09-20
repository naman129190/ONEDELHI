package com.google.firebase.components;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.onedelhi.secure.ts2;

public class ComponentDiscoveryService extends Service {
    @ts2
    public IBinder onBind(Intent intent) {
        return null;
    }
}
