package com.onedelhi.secure;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;

public final class d45 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Context f10630a;

    /* renamed from: a */
    public final /* synthetic */ Intent f10631a;

    public d45(Context context, Intent intent) {
        this.f10630a = context;
        this.f10631a = intent;
    }

    public final void onClick(View view) {
        try {
            this.f10630a.startActivity(this.f10631a);
        } catch (ActivityNotFoundException e) {
            Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e);
        }
    }
}
