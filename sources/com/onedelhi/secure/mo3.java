package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0005\u001a\u00060\u0003j\u0002`\u00042\u000e\b\u0004\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\b*\n\u0010\u0006\"\u00020\u00032\u00020\u0003¨\u0006\u0007"}, d2 = {"Lkotlin/Function0;", "Lcom/onedelhi/secure/un4;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "a", "Runnable", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class mo3 {

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/onedelhi/secure/un4;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.mo3$a */
    public static final class C6131a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ cc1<un4> f32205a;

        public C6131a(cc1<un4> cc1) {
            this.f32205a = cc1;
        }

        public final void run() {
            this.f32205a.invoke();
        }
    }

    @vr2
    /* renamed from: a */
    public static final Runnable m57474a(@vr2 cc1<un4> cc1) {
        return new C6131a(cc1);
    }
}
