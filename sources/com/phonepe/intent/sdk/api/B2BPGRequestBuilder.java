package com.phonepe.intent.sdk.api;

import com.google.firebase.messaging.C4311b;
import com.onedelhi.secure.ii2;
import com.onedelhi.secure.jt1;
import com.onedelhi.secure.vr2;
import com.phonepe.intent.sdk.api.B2BPGRequest;
import java.util.HashMap;

@ii2(mo38103bv = {1, 0, 3}, mo38104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0002J*\u0010\r\u001a\u00020\u00002\"\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\nj\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002`\u000bJ\u0006\u0010\u000f\u001a\u00020\u000e¨\u0006\u0012"}, mo38105d2 = {"Lcom/phonepe/intent/sdk/api/B2BPGRequestBuilder;", "", "", "checksum", "setChecksum", "data", "setData", "apiUrl", "setUrl", "callbackUrl", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "headers", "setHeaders", "Lcom/phonepe/intent/sdk/api/B2BPGRequest;", "build", "<init>", "()V", "IntentSDK_release"}, mo38106k = 1, mo38107mv = {1, 5, 1})
public final class B2BPGRequestBuilder {
    @vr2
    public final B2BPGRequest.Builder irjuc = new B2BPGRequest.Builder();

    @vr2
    public final B2BPGRequest build() {
        return this.irjuc.build();
    }

    @vr2
    public final B2BPGRequestBuilder callbackUrl(@vr2 String str) {
        jt1.m53777p(str, "callbackUrl");
        this.irjuc.callbackUrl(str);
        return this;
    }

    @vr2
    public final B2BPGRequestBuilder setChecksum(@vr2 String str) {
        jt1.m53777p(str, "checksum");
        this.irjuc.checksum(str);
        return this;
    }

    @vr2
    public final B2BPGRequestBuilder setData(@vr2 String str) {
        jt1.m53777p(str, C4311b.C4317f.C4318a.f25149a);
        this.irjuc.data(str);
        return this;
    }

    @vr2
    public final B2BPGRequestBuilder setHeaders(@vr2 HashMap<String, String> hashMap) {
        jt1.m53777p(hashMap, "headers");
        this.irjuc.headers(hashMap);
        return this;
    }

    @vr2
    public final B2BPGRequestBuilder setUrl(@vr2 String str) {
        jt1.m53777p(str, "apiUrl");
        this.irjuc.apiUrl(str);
        return this;
    }
}
