package com.phonepe.intent.sdk.api;

import com.onedelhi.secure.mr2;
import com.phonepe.intent.sdk.api.TransactionRequest;
import java.util.HashMap;

public class TransactionRequestBuilder {
    public TransactionRequest.TransactionRequestBuilder irjuc = new TransactionRequest.TransactionRequestBuilder();

    public TransactionRequest build() {
        return this.irjuc.build();
    }

    public TransactionRequestBuilder setChecksum(@mr2 String str) {
        this.irjuc.setChecksum(str);
        return this;
    }

    public TransactionRequestBuilder setData(@mr2 String str) {
        this.irjuc.setData(str);
        return this;
    }

    public TransactionRequestBuilder setHeaders(@mr2 HashMap<String, String> hashMap) {
        this.irjuc.setHeaders(hashMap);
        return this;
    }

    public TransactionRequestBuilder setRedirectUrl(@mr2 String str) {
        this.irjuc.setRedirectUrl(str);
        return this;
    }

    public TransactionRequestBuilder setUrl(@mr2 String str) {
        this.irjuc.setUrl(str);
        return this;
    }
}
