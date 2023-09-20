package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.ComponentRegistrar;
import com.onedelhi.secure.C4623b5;
import com.onedelhi.secure.a30;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.n64;
import com.onedelhi.secure.rj0;
import com.onedelhi.secure.u22;
import com.onedelhi.secure.ul5;
import com.onedelhi.secure.w31;
import java.util.Arrays;
import java.util.List;

@KeepForSdk
@Keep
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    @mr2
    @SuppressLint({"MissingPermission"})
    @Keep
    @KeepForSdk
    public List<a30<?>> getComponents() {
        return Arrays.asList(new a30[]{a30.m36014h(C4623b5.class).mo30433b(rj0.m63679m(w31.class)).mo30433b(rj0.m63679m(Context.class)).mo30433b(rj0.m63679m(n64.class)).mo30437f(ul5.f36182a).mo30436e().mo30435d(), u22.m66409b("fire-analytics", "21.2.1")});
    }
}
