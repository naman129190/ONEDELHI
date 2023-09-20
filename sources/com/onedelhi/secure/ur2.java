package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/onedelhi/secure/ur2;", "Ljava/lang/Error;", "Lkotlin/Error;", "", "message", "<init>", "(Ljava/lang/String;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class ur2 extends Error {
    public ur2() {
        this((String) null, 1, (wg0) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ur2(@vr2 String str) {
        super(str);
        jt1.m53777p(str, "message");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ur2(String str, int i, wg0 wg0) {
        this((i & 1) != 0 ? "An operation is not implemented." : str);
    }
}
