package com.onedelhi.secure;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B\u001b\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\u000bJ\n\u0010\u0004\u001a\u0004\u0018\u00010\u0000H\u0016¨\u0006\f"}, d2 = {"Lcom/onedelhi/secure/ne4;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Lcom/onedelhi/secure/x80;", "b", "", "message", "Lcom/onedelhi/secure/ru1;", "coroutine", "<init>", "(Ljava/lang/String;Lcom/onedelhi/secure/ru1;)V", "(Ljava/lang/String;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class ne4 extends CancellationException implements x80<ne4> {
    @rw1
    @ss2

    /* renamed from: a */
    public final ru1 f32493a;

    public ne4(@vr2 String str) {
        this(str, (ru1) null);
    }

    public ne4(@vr2 String str, @ss2 ru1 ru1) {
        super(str);
        this.f32493a = ru1;
    }

    @ss2
    /* renamed from: b */
    public ne4 mo41021a() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        ne4 ne4 = new ne4(message, this.f32493a);
        ne4.initCause(this);
        return ne4;
    }
}
