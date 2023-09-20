package com.delhitransport.onedelhi.viewmodels;

import androidx.lifecycle.LiveData;
import com.delhitransport.onedelhi.networking.C1360g;
import com.delhitransport.onedelhi.p002ev.EVConnector;
import com.delhitransport.onedelhi.p002ev.EVRequest;
import com.delhitransport.onedelhi.p002ev.EVSearch;
import com.delhitransport.onedelhi.p002ev.EVStations;
import com.onedelhi.secure.au4;
import java.util.List;

public class EVModel extends au4 {
    public LiveData<List<EVConnector>> getConnectors() {
        return C1360g.m8597f().mo8670a();
    }

    public LiveData<EVStations> getEVStationDetails() {
        return C1360g.m8597f().mo8672c();
    }

    public LiveData<EVStations> getEvDetailsById(String str) {
        return C1360g.m8597f().mo8673d(str);
    }

    public LiveData<EVSearch> getEvSearch() {
        return C1360g.m8597f().mo8671b();
    }

    public LiveData<List<String>> getEvVendorsList() {
        return C1360g.m8597f().mo8674e();
    }

    public LiveData<EVStations> getNearByEvStationDetails(EVRequest eVRequest) {
        return C1360g.m8597f().mo8675g(eVRequest);
    }
}
