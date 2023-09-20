package com.phonepe.intent.sdk.api;

import com.onedelhi.secure.ii2;
import com.onedelhi.secure.jt1;
import com.onedelhi.secure.vr2;
import com.onedelhi.secure.wg0;

@ii2(mo38103bv = {1, 0, 3}, mo38104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo38105d2 = {"Lcom/phonepe/intent/sdk/api/PhonePeInitException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "exceptionMessage", "<init>", "(Ljava/lang/String;)V", "IntentSDK_release"}, mo38106k = 1, mo38107mv = {1, 5, 1})
public final class PhonePeInitException extends Exception {
    public PhonePeInitException() {
        this((String) null, 1, (wg0) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhonePeInitException(@vr2 String str) {
        super(str);
        jt1.m53777p(str, "exceptionMessage");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PhonePeInitException(String str, int i, wg0 wg0) {
        this((i & 1) != 0 ? ExceptionsKt.defaultInitExceptionMessage : str);
    }
}
