package com.phonepe.intent.sdk.api;

import com.onedelhi.secure.ii2;
import com.onedelhi.secure.jt1;
import com.onedelhi.secure.vh3;
import com.onedelhi.secure.vr2;

@MerchantAPI
@ii2(mo38103bv = {1, 0, 3}, mo38104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\u0010\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, mo38105d2 = {"Lcom/phonepe/intent/sdk/api/UPIApplicationInfo;", "", "", "irjuc", "Ljava/lang/String;", "getPackageName", "()Ljava/lang/String;", "packageName", "cqqlq", "getApplicationName", "applicationName", "", "chmha", "J", "getVersion", "()J", "version", "<init>", "(Ljava/lang/String;Ljava/lang/String;J)V", "IntentSDK_release"}, mo38106k = 1, mo38107mv = {1, 5, 1})
public final class UPIApplicationInfo {
    public final long chmha;
    @vr2
    public final String cqqlq;
    @vr2
    public final String irjuc;

    public UPIApplicationInfo(@vr2 String str, @vr2 String str2, long j) {
        jt1.m53777p(str, vh3.C7051b.f36563S);
        jt1.m53777p(str2, "applicationName");
        this.irjuc = str;
        this.cqqlq = str2;
        this.chmha = j;
    }

    @vr2
    public final String getApplicationName() {
        return this.cqqlq;
    }

    @vr2
    public final String getPackageName() {
        return this.irjuc;
    }

    public final long getVersion() {
        return this.chmha;
    }
}
