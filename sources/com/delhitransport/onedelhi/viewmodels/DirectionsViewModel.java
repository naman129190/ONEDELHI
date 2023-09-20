package com.delhitransport.onedelhi.viewmodels;

import androidx.lifecycle.LiveData;
import com.delhitransport.onedelhi.models.directions.AllStopsResponse;
import com.delhitransport.onedelhi.models.directions.DirectionResponse;
import com.delhitransport.onedelhi.networking.C1352f;
import com.onedelhi.secure.au4;

public class DirectionsViewModel extends au4 {
    private final C1352f directionsRepository = C1352f.m8575h();

    public LiveData<DirectionResponse> getDirectionLiveDataDimts(String str, String str2) {
        return this.directionsRepository.mo8665c(str, str2);
    }

    public LiveData<DirectionResponse> getDirectionLiveDataMultiModal(String str, String str2, String str3) {
        return this.directionsRepository.mo8668f(str, str2, str3);
    }

    public LiveData<DirectionResponse> getDirectionsBus(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        return this.directionsRepository.mo8666d(str, str2, str3, str4, str5, str6, str7, str8);
    }

    public LiveData<DirectionResponse> getDirectionsMetro(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        return this.directionsRepository.mo8667e(str, str2, str3, str4, str5, str6, str7, str8);
    }

    public LiveData<DirectionResponse> getDirectionsMultiModal(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        return this.directionsRepository.mo8669g(str, str2, str3, str4, str5, str6, str7, str8);
    }

    public LiveData<AllStopsResponse> getStopsBus() {
        return this.directionsRepository.mo8663a();
    }

    public LiveData<AllStopsResponse> getStopsMetro() {
        return this.directionsRepository.mo8664b();
    }
}
