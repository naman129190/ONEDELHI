package com.phonepe.intent.sdk.api;

import com.onedelhi.secure.ii2;
import com.onedelhi.secure.jt1;
import com.onedelhi.secure.vr2;

@ii2(mo38103bv = {1, 0, 3}, mo38104d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo38105d2 = {"Lcom/phonepe/intent/sdk/api/InvalidMandatoryRequestParamException;", "Ljava/lang/IllegalArgumentException;", "", "missingParameter", "<init>", "(Ljava/lang/String;)V", "IntentSDK_release"}, mo38106k = 1, mo38107mv = {1, 5, 1})
public final class InvalidMandatoryRequestParamException extends IllegalArgumentException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InvalidMandatoryRequestParamException(@vr2 String str) {
        super("Setting " + str + " is mandatory");
        jt1.m53777p(str, "missingParameter");
    }
}
