package com.phonepe.intent.sdk.api;

import com.onedelhi.secure.gr2;
import com.onedelhi.secure.ii2;
import com.onedelhi.secure.vr2;
import com.onedelhi.secure.wg0;

@MerchantAPI
@ii2(mo38103bv = {1, 0, 3}, mo38104d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, mo38105d2 = {"Lcom/phonepe/intent/sdk/api/UserValidityStatus;", "", "", "irjuc", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "VALID", "INVALID", "UNKNOWN", "IntentSDK_release"}, mo38106k = 1, mo38107mv = {1, 5, 1})
public enum UserValidityStatus {
    VALID("VALID"),
    INVALID("INVALID"),
    UNKNOWN("UNKNOWN");
    
    @vr2
    public static final Companion Companion = null;
    @vr2
    public final String irjuc;

    @ii2(mo38103bv = {1, 0, 3}, mo38104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, mo38105d2 = {"Lcom/phonepe/intent/sdk/api/UserValidityStatus$Companion;", "", "", "status", "", "getValidityStatus", "<init>", "()V", "IntentSDK_release"}, mo38106k = 1, mo38107mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(wg0 wg0) {
            this();
        }

        @vr2
        public final String getValidityStatus(boolean z) {
            UserValidityStatus userValidityStatus;
            if (z) {
                userValidityStatus = UserValidityStatus.VALID;
            } else if (!z) {
                userValidityStatus = UserValidityStatus.INVALID;
            } else {
                throw new gr2();
            }
            return userValidityStatus.getValue();
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new Companion((wg0) null);
    }

    /* access modifiers changed from: public */
    UserValidityStatus(String str) {
        this.irjuc = str;
    }

    @vr2
    public final String getValue() {
        return this.irjuc;
    }
}
