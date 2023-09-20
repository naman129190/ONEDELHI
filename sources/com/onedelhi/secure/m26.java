package com.onedelhi.secure;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;

public final /* synthetic */ class m26 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ BroadcastReceiver.PendingResult f15878a;

    /* renamed from: a */
    public final /* synthetic */ Context f15879a;

    /* renamed from: a */
    public final /* synthetic */ Intent f15880a;

    /* renamed from: a */
    public final /* synthetic */ CloudMessagingReceiver f15881a;

    /* renamed from: b */
    public final /* synthetic */ boolean f15882b;

    public /* synthetic */ m26(CloudMessagingReceiver cloudMessagingReceiver, Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        this.f15881a = cloudMessagingReceiver;
        this.f15880a = intent;
        this.f15879a = context;
        this.f15882b = z;
        this.f15878a = pendingResult;
    }

    public final void run() {
        this.f15881a.mo9259d(this.f15880a, this.f15879a, this.f15882b, this.f15878a);
    }
}
