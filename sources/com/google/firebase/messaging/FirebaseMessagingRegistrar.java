package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.ComponentRegistrar;
import com.onedelhi.secure.C4689bp;
import com.onedelhi.secure.a30;
import com.onedelhi.secure.bl1;
import com.onedelhi.secure.f51;
import com.onedelhi.secure.g30;
import com.onedelhi.secure.n64;
import com.onedelhi.secure.o41;
import com.onedelhi.secure.r41;
import com.onedelhi.secure.rj0;
import com.onedelhi.secure.u22;
import com.onedelhi.secure.w31;
import com.onedelhi.secure.wp4;
import com.onedelhi.secure.yh4;
import java.util.Arrays;
import java.util.List;

@KeepForSdk
@Keep
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(g30 g30) {
        return new FirebaseMessaging((w31) g30.mo36546b(w31.class), (r41) g30.mo36546b(r41.class), g30.mo36549f(wp4.class), g30.mo36549f(bl1.class), (o41) g30.mo36546b(o41.class), (yh4) g30.mo36546b(yh4.class), (n64) g30.mo36546b(n64.class));
    }

    @Keep
    public List<a30<?>> getComponents() {
        return Arrays.asList(new a30[]{a30.m36014h(FirebaseMessaging.class).mo30439h(LIBRARY_NAME).mo30433b(rj0.m63679m(w31.class)).mo30433b(rj0.m63675i(r41.class)).mo30433b(rj0.m63677k(wp4.class)).mo30433b(rj0.m63677k(bl1.class)).mo30433b(rj0.m63675i(yh4.class)).mo30433b(rj0.m63679m(o41.class)).mo30433b(rj0.m63679m(n64.class)).mo30437f(f51.f28179a).mo30434c().mo30435d(), u22.m66409b(LIBRARY_NAME, C4689bp.f26474c)});
    }
}
