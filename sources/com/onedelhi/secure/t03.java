package com.onedelhi.secure;

import android.text.TextUtils;
import java.util.HashMap;

public class t03 {

    /* renamed from: a */
    public HashMap<String, String> f35317a;

    public t03(String str, String str2, String str3, String str4, String str5) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Invalid orderId");
        } else if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("Invalid mid");
        } else if (TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Invalid txnToken");
        } else if (!TextUtils.isEmpty(str5)) {
            HashMap<String, String> hashMap = new HashMap<>();
            this.f35317a = hashMap;
            hashMap.put(h60.f29506a, str);
            this.f35317a.put(h60.f29508c, str4);
            this.f35317a.put("MID", str2);
            this.f35317a.put(h60.f29515j, str3);
            this.f35317a.put(h60.f29513h, str5);
        } else {
            throw new IllegalArgumentException("Invalid callbackurl");
        }
    }

    public t03(HashMap<String, String> hashMap) throws IllegalArgumentException {
        if (hashMap == null || hashMap.size() <= 0) {
            throw new IllegalArgumentException("Invalid request params");
        } else if (!hashMap.containsKey(h60.f29513h)) {
            throw new IllegalArgumentException("CALLBACK_URL not present");
        } else if (!hashMap.containsKey(h60.f29514i)) {
            throw new IllegalArgumentException("CHECKSUMHASH not present");
        } else if (!hashMap.containsKey(h60.f29509d)) {
            throw new IllegalArgumentException("CUST_ID not present");
        } else if (!hashMap.containsKey(h60.f29510e)) {
            throw new IllegalArgumentException("INDUSTRY_TYPE_ID not present");
        } else if (!hashMap.containsKey("MID")) {
            throw new IllegalArgumentException("MID not present");
        } else if (!hashMap.containsKey(h60.f29506a)) {
            throw new IllegalArgumentException("ORDER_ID not present");
        } else if (!hashMap.containsKey(h60.f29512g)) {
            throw new IllegalArgumentException("WEBSITE not present");
        } else if (!hashMap.containsKey(h60.f29511f)) {
            throw new IllegalArgumentException("CHANNEL_ID not present");
        } else if (hashMap.containsKey(h60.f29508c)) {
            this.f35317a = hashMap;
        } else {
            throw new IllegalArgumentException("TXN_AMOUNT not present");
        }
    }

    /* renamed from: a */
    public HashMap<String, String> mo44723a() {
        return this.f35317a;
    }
}
