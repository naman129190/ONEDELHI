package com.onedelhi.secure;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import java.util.List;

public interface e72 extends LocationListener {
    void onFlushComplete(int i);

    void onLocationChanged(@mr2 List<Location> list);

    void onProviderDisabled(@mr2 String str);

    void onProviderEnabled(@mr2 String str);

    void onStatusChanged(@mr2 String str, int i, @ts2 Bundle bundle);
}
