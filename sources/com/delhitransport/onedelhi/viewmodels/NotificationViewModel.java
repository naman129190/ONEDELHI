package com.delhitransport.onedelhi.viewmodels;

import androidx.lifecycle.LiveData;
import com.delhitransport.onedelhi.networking.C1379k;
import com.delhitransport.onedelhi.others.NotificationResponse;
import com.onedelhi.secure.au4;

public class NotificationViewModel extends au4 {
    private C1379k notificationRepository;

    public LiveData<NotificationResponse> getAllNotifications() {
        C1379k b = C1379k.m8649b();
        this.notificationRepository = b;
        return b.mo8685a();
    }
}
