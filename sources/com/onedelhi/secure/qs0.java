package com.onedelhi.secure;

import androidx.emoji2.text.C0552c;
import androidx.emoji2.text.EmojiCompatInitializer;
import java.util.concurrent.ThreadPoolExecutor;

public final /* synthetic */ class qs0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ EmojiCompatInitializer.C0543b f34344a;

    /* renamed from: a */
    public final /* synthetic */ C0552c.C0563j f34345a;

    /* renamed from: a */
    public final /* synthetic */ ThreadPoolExecutor f34346a;

    public /* synthetic */ qs0(EmojiCompatInitializer.C0543b bVar, C0552c.C0563j jVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f34344a = bVar;
        this.f34345a = jVar;
        this.f34346a = threadPoolExecutor;
    }

    public final void run() {
        this.f34344a.m4080d(this.f34345a, this.f34346a);
    }
}
