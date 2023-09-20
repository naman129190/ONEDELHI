package com.onedelhi.secure;

import com.phonepe.intent.sdk.api.PhonePe;
import com.phonepe.intent.sdk.api.PhonePeInitException;
import jmjou.C7601c;

public final class t15 {
    @zw1
    /* renamed from: a */
    public static final void m65155a() {
        w15 w15;
        C7601c objectFactory = PhonePe.getObjectFactory();
        Boolean bool = (Boolean) objectFactory.mo48872h("configSynced");
        if (bool == null || jt1.m53768g(bool, Boolean.FALSE)) {
            m05.m56772c("checkAvailability", "Starting syncSDKConfig call");
            g15 g15 = (g15) objectFactory.mo48873i(g15.class);
            n95 n95 = null;
            try {
                w15 = (w15) PhonePe.getObjectFactory().mo48873i(w15.class);
            } catch (PhonePeInitException unused) {
                w15 = null;
            }
            try {
                n95 = (n95) PhonePe.getObjectFactory().mo48873i(n95.class);
            } catch (PhonePeInitException unused2) {
            }
            g15.mo36528h(w15, n95, new x15(objectFactory));
            return;
        }
        m05.m56772c(PhonePe.TAG, "SDK Config present");
    }
}
