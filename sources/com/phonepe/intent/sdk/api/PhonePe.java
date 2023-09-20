package com.phonepe.intent.sdk.api;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Handler;
import com.google.firebase.messaging.C4311b;
import com.onedelhi.secure.a15;
import com.onedelhi.secure.a23;
import com.onedelhi.secure.a25;
import com.onedelhi.secure.b05;
import com.onedelhi.secure.b23;
import com.onedelhi.secure.g15;
import com.onedelhi.secure.h15;
import com.onedelhi.secure.id2;
import com.onedelhi.secure.jt1;
import com.onedelhi.secure.k15;
import com.onedelhi.secure.l05;
import com.onedelhi.secure.l95;
import com.onedelhi.secure.m05;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.n95;
import com.onedelhi.secure.r25;
import com.onedelhi.secure.t15;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.u25;
import com.onedelhi.secure.v13;
import com.onedelhi.secure.w13;
import com.onedelhi.secure.w15;
import com.onedelhi.secure.w25;
import com.onedelhi.secure.x13;
import com.onedelhi.secure.y13;
import com.onedelhi.secure.y15;
import com.onedelhi.secure.yi4;
import com.onedelhi.secure.z13;
import com.onedelhi.secure.zz4;
import com.phonepe.intent.sdk.contracts.DeviceIdListener;
import com.phonepe.intent.sdk.p004ui.B2BPGActivity;
import com.phonepe.intent.sdk.p004ui.OpenIntentTransactionActivity;
import com.phonepe.intent.sdk.p004ui.PreCacheService;
import com.phonepe.intent.sdk.p004ui.TransactionActivity;
import com.phonepe.intent.sdk.p004ui.UpiAppsSelectionDialogActivity;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import jmjou.C7601c;
import org.json.JSONException;
import org.json.JSONObject;

public class PhonePe {
    public static final String TAG = "PhonePe";
    public static C7601c cqqlq;
    public zz4 irjuc;

    public class irjuc implements CheckPhonePeAvailabilityInternalCallback {
        public final /* synthetic */ CheckPhonePeAvailabilityCallback cqqlq;
        public final /* synthetic */ AtomicBoolean irjuc;

        public irjuc(AtomicBoolean atomicBoolean, CheckPhonePeAvailabilityCallback checkPhonePeAvailabilityCallback) {
            this.irjuc = atomicBoolean;
            this.cqqlq = checkPhonePeAvailabilityCallback;
        }

        public void onFailure(boolean z, @mr2 String str) {
            PhonePe.irjuc(true, "SUCCESS", this.irjuc, this.cqqlq);
        }

        public void onSuccess(boolean z, @mr2 String str) {
            PhonePe.irjuc(z, str, this.irjuc, this.cqqlq);
        }
    }

    public PhonePe(Context context) {
        irjuc(context);
        try {
            if (l05.m55205i((Boolean) getObjectFactory().mo48872h("com.phonepe.android.sdk.PreCacheEnabled")) && l05.m55203g()) {
                Intent intent = new Intent(context, PreCacheService.class);
                intent.putExtra("data_factory", getObjectFactory());
                context.startService(intent);
            }
        } catch (PhonePeInitException e) {
            m05.m56773d(TAG, e.getMessage(), e);
        }
    }

    @MerchantAPI
    public static void checkAvailability(AvailabilityCheckRequest availabilityCheckRequest, CheckPhonePeAvailabilityCallback checkPhonePeAvailabilityCallback) throws PhonePeInitException {
        jt1.m53777p("CHECK_AVAILABILITY_SDK_CALL_STARTED", "eventName");
        zz4 zz4 = (zz4) getObjectFactory().mo48873i(zz4.class);
        zz4.mo48477a(zz4.mo48478b("CHECK_AVAILABILITY_SDK_CALL_STARTED"));
        irjuc((CheckPhonePeAvailabilityCallback) new v13(availabilityCheckRequest, checkPhonePeAvailabilityCallback));
    }

    public static PhonePe cqqlq(Context context) {
        m05.f31968a = new m05.C6078d();
        m05.m56774e(TAG, "PhonePe SDK initializing ...");
        cqqlq = new C7601c(context);
        PhonePe phonePe = new PhonePe(context);
        try {
            phonePe.irjuc = (zz4) getObjectFactory().mo48873i(zz4.class);
            getObjectFactory().mo48875k(PhonePe.class.getCanonicalName(), phonePe);
            t15.m65155a();
            a25.m36002a();
            try {
                getObjectFactory().mo48875k("SDK_INIT_SUCCESS", Boolean.TRUE);
            } catch (PhonePeInitException e) {
                m05.m56773d("Utils", e.getMessage(), e);
            }
        } catch (PhonePeInitException e2) {
            m05.m56773d(TAG, e2.getMessage(), e2);
        }
        m05.m56774e(TAG, "PhonePe SDK initialized");
        return phonePe;
    }

    @MerchantAPI
    public static void getDeviceId(Context context, DeviceIdListener deviceIdListener) throws PhonePeInitException {
        ((w25) getObjectFactory().mo48873i(w25.class)).mo46505b(true, deviceIdListener);
    }

    @MerchantAPI
    @ts2
    public static Intent getImplicitIntent(Context context, @mr2 B2BPGRequest b2BPGRequest, String str) throws PhonePeInitException {
        C7601c objectFactory = getObjectFactory();
        int i = B2BPGActivity.f38586o;
        jt1.m53777p(objectFactory, "objectFactory");
        Bundle f = objectFactory.mo48871f();
        f.putParcelable("request", b2BPGRequest);
        f.putParcelable("sdk_context", (w15) objectFactory.mo48873i(w15.class));
        f.putString("openIntentWithApp", str);
        Map W = id2.m52120W(yi4.m71797a("targetPackageName", str), yi4.m71797a("merchantId", (String) objectFactory.mo48872h("com.phonepe.android.sdk.MerchantId")), yi4.m71797a("merchantTransactionId", (String) objectFactory.mo48872h("transactionId")), yi4.m71797a("merchantUserId", (String) objectFactory.mo48872h("merchantUserId")));
        jt1.m53777p("B2B_PG_TRANSACTION_REQUEST", "eventName");
        zz4 zz4 = (zz4) getObjectFactory().mo48873i(zz4.class);
        u25 b = zz4.mo48478b("B2B_PG_TRANSACTION_REQUEST");
        if (W != null) {
            for (Map.Entry entry : W.entrySet()) {
                b.mo45379a((String) entry.getKey(), entry.getValue());
            }
        }
        zz4.mo48477a(b);
        return objectFactory.mo48870e(context, B2BPGActivity.class, f);
    }

    @MerchantAPI
    @ts2
    public static Intent getImplicitIntent(Context context, @mr2 TransactionRequest transactionRequest) throws PhonePeInitException {
        C7601c objectFactory = getObjectFactory();
        int i = TransactionActivity.f38601o;
        Bundle f = objectFactory.mo48871f();
        f.putParcelable("request", transactionRequest);
        f.putParcelable("sdk_context", (w15) objectFactory.mo48873i(w15.class));
        zz4 zz4 = (zz4) objectFactory.mo48873i(zz4.class);
        zz4.mo48477a(zz4.mo48478b("SDK_LAUNCHED"));
        return objectFactory.mo48870e(context, UpiAppsSelectionDialogActivity.class, f);
    }

    @MerchantAPI
    @ts2
    public static Intent getImplicitIntent(Context context, @mr2 TransactionRequest transactionRequest, String str) throws PhonePeInitException {
        if (l05.m55204h(context, str)) {
            C7601c objectFactory = getObjectFactory();
            String str2 = OpenIntentTransactionActivity.f38590c;
            Bundle f = objectFactory.mo48871f();
            f.putParcelable("request", transactionRequest);
            f.putParcelable("sdk_context", (w15) objectFactory.mo48873i(w15.class));
            f.putString("openIntentWithApp", str);
            return objectFactory.mo48870e(context, OpenIntentTransactionActivity.class, f);
        }
        throw new PhonePeInitException("App is not installed on user's device");
    }

    public static C7601c getObjectFactory() throws PhonePeInitException {
        C7601c cVar = cqqlq;
        if (cVar != null) {
            return cVar;
        }
        throw new PhonePeInitException();
    }

    @MerchantAPI
    public static String getPackageSignature() {
        try {
            return getObjectFactory().mo48867c();
        } catch (PhonePeInitException unused) {
            return "";
        }
    }

    public static long getPhonePeAppVersionCode() throws PhonePeInitException {
        C7601c objectFactory = getObjectFactory();
        return (long) l05.m55198b(l05.m55199c(objectFactory), objectFactory);
    }

    @MerchantAPI
    public static String getSDKVersion() {
        return "1.6.7";
    }

    @MerchantAPI
    @ts2
    public static Intent getTransactionIntent(@mr2 TransactionRequest transactionRequest) throws PhonePeInitException {
        m05.m56774e(TAG, String.format("transactionRequest {%s} is submitted", new Object[]{transactionRequest.toString()}));
        getObjectFactory().getClass();
        Context context = C7601c.f38776a;
        C7601c objectFactory = getObjectFactory();
        int i = TransactionActivity.f38601o;
        Bundle f = objectFactory.mo48871f();
        f.putParcelable("request", transactionRequest);
        f.putParcelable("sdk_context", (w15) objectFactory.mo48873i(w15.class));
        zz4 zz4 = (zz4) objectFactory.mo48873i(zz4.class);
        zz4.mo48477a(zz4.mo48478b("SDK_LAUNCHED"));
        return objectFactory.mo48870e(context, TransactionActivity.class, f);
    }

    public static List<UPIApplicationInfo> getUpiApps() throws PhonePeInitException {
        Intent intent = new Intent();
        intent.setData(k15.C5869a.f31078a);
        List<ResolveInfo> f = l05.m55202f(getObjectFactory(), intent);
        ArrayList arrayList = new ArrayList();
        if (getObjectFactory() != null) {
            getObjectFactory().getClass();
            if (!(C7601c.f38776a == null || f == null)) {
                getObjectFactory().getClass();
                PackageManager packageManager = C7601c.f38776a.getPackageManager();
                for (ResolveInfo resolveInfo : f) {
                    ActivityInfo activityInfo = resolveInfo.activityInfo;
                    String str = activityInfo.packageName;
                    arrayList.add(new UPIApplicationInfo(str, packageManager.getApplicationLabel(activityInfo.applicationInfo).toString(), (long) l05.m55198b(str, getObjectFactory())));
                }
            }
        }
        return arrayList;
    }

    @MerchantAPI
    public static void init(Context context) {
        cqqlq(context);
    }

    public static void irjuc(AvailabilityCheckRequest availabilityCheckRequest, CheckPhonePeAvailabilityCallback checkPhonePeAvailabilityCallback, boolean z, String str) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        y15 y15 = (y15) cqqlq.mo48873i(y15.class);
        boolean z2 = y15.f37762a.mo48862b().getBoolean("availability_check_enabled", true);
        long longValue = Long.valueOf(y15.f37762a.mo48862b().getLong("availability_check_timeout_ms", 5000)).longValue();
        if (!z || !z2) {
            irjuc(z, str, atomicBoolean, checkPhonePeAvailabilityCallback);
        } else {
            irjuc(atomicBoolean, longValue, availabilityCheckRequest, checkPhonePeAvailabilityCallback);
        }
    }

    public static void irjuc(CheckPhonePeAvailabilityCallback checkPhonePeAvailabilityCallback) throws PhonePeInitException {
        if (!isAppInstalled()) {
            checkPhonePeAvailabilityCallback.onResponse(false, "PHONEPE_APP_NOT_INSTALLED");
        } else if (((r25) getObjectFactory().mo48873i(r25.class)).f34479a.mo48862b().getBoolean("showPhonePeEnabled", true)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("loggedIn", true);
                jSONObject.put("singlePaymentInstrumentAvailable", true);
                jSONObject.put("merchantAppId", getObjectFactory().mo48872h("com.phonepe.android.sdk.AppId"));
            } catch (Exception e) {
                m05.m56773d(TAG, e.getMessage(), e);
            }
            request("shouldShowPhonePe", jSONObject.toString(), new w13(checkPhonePeAvailabilityCallback));
        } else {
            checkPhonePeAvailabilityCallback.onResponse(true, "SUCCESS");
        }
    }

    public static /* synthetic */ void irjuc(CheckPhonePeAvailabilityCallback checkPhonePeAvailabilityCallback, String str) {
        if (checkPhonePeAvailabilityCallback != null) {
            if (str != null && !str.isEmpty()) {
                try {
                    boolean optBoolean = new JSONObject(str).optBoolean("result", true);
                    checkPhonePeAvailabilityCallback.onResponse(optBoolean, optBoolean ? "SUCCESS" : "UPI_NOT_REGISTERED");
                    return;
                } catch (Exception unused) {
                }
            }
            checkPhonePeAvailabilityCallback.onResponse(true, "SUCCESS");
        }
    }

    public static /* synthetic */ void irjuc(ShowPhonePeCallback showPhonePeCallback, String str) {
        if (showPhonePeCallback != null) {
            if (str != null && !str.isEmpty()) {
                try {
                    showPhonePeCallback.onResponse(new JSONObject(str).optBoolean("result", true));
                    return;
                } catch (Exception unused) {
                }
            }
            showPhonePeCallback.onResponse(true);
        }
    }

    public static /* synthetic */ void irjuc(UserValidityCallback userValidityCallback, boolean z, String str) {
        if (str != null && !str.isEmpty()) {
            try {
                userValidityCallback.onResponse(UserValidityStatus.Companion.getValidityStatus(new JSONObject(str).optBoolean("isPhoneNumberValid") && z));
            } catch (JSONException unused) {
                userValidityCallback.onResponse(UserValidityStatus.Companion.getValidityStatus(false));
            }
        }
    }

    public static void irjuc(String str, UserValidityCallback userValidityCallback, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            byte[] digest = MessageDigest.getInstance("SHA-256").digest(str.getBytes(StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
            jSONObject.put("hashedPhoneNumber", sb.toString());
            request("checkPhoneNumberValidity", jSONObject.toString(), new y13(userValidityCallback, z));
        } catch (Exception unused) {
            userValidityCallback.onResponse(UserValidityStatus.Companion.getValidityStatus(false));
        }
    }

    @MerchantAPI
    public static void irjuc(AtomicBoolean atomicBoolean, long j, AvailabilityCheckRequest availabilityCheckRequest, CheckPhonePeAvailabilityCallback checkPhonePeAvailabilityCallback) {
        w15 w15;
        new Handler().postDelayed(new b23(atomicBoolean, j, Long.valueOf(System.currentTimeMillis()), checkPhonePeAvailabilityCallback), j);
        irjuc irjuc2 = new irjuc(atomicBoolean, checkPhonePeAvailabilityCallback);
        jt1.m53777p(availabilityCheckRequest, "availabilityCheckRequest");
        jt1.m53777p(irjuc2, "callback");
        g15 g15 = (g15) getObjectFactory().mo48873i(g15.class);
        n95 n95 = null;
        try {
            w15 = (w15) getObjectFactory().mo48873i(w15.class);
        } catch (PhonePeInitException unused) {
            w15 = null;
        }
        try {
            n95 = (n95) getObjectFactory().mo48873i(n95.class);
        } catch (PhonePeInitException unused2) {
        }
        g15.mo36529i(availabilityCheckRequest, w15, n95, new l95(irjuc2));
    }

    public static void irjuc(AtomicBoolean atomicBoolean, long j, Long l, CheckPhonePeAvailabilityCallback checkPhonePeAvailabilityCallback) {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        if (!atomicBoolean.get()) {
            Map W = id2.m52120W(yi4.m71797a("checkAvailabilityTimeoutMs", Long.valueOf(j)), yi4.m71797a("timeTakenMs", Long.valueOf(valueOf.longValue() - l.longValue())));
            jt1.m53777p("CHECK_AVAILABILITY_API_CALL_TIMED_OUT", "eventName");
            zz4 zz4 = (zz4) getObjectFactory().mo48873i(zz4.class);
            u25 b = zz4.mo48478b("CHECK_AVAILABILITY_API_CALL_TIMED_OUT");
            if (W != null) {
                for (Map.Entry entry : W.entrySet()) {
                    b.mo45379a((String) entry.getKey(), entry.getValue());
                }
            }
            zz4.mo48477a(b);
        }
        irjuc(true, "SUCCESS", atomicBoolean, checkPhonePeAvailabilityCallback);
    }

    public static void irjuc(C7601c cVar, ShowPhonePeCallback showPhonePeCallback, boolean z) {
        try {
            Intent intent = new Intent();
            intent.setData(k15.C5869a.f31078a);
            List<ResolveInfo> f = l05.m55202f(cVar, intent);
            String c = l05.m55199c(cVar);
            boolean z2 = true;
            boolean z3 = false;
            for (ResolveInfo resolveInfo : f) {
                String str = resolveInfo.activityInfo.packageName;
                if (str != null && !str.isEmpty() && c.matches(str)) {
                    z3 = true;
                }
            }
            if (!z3 || !z) {
                z2 = false;
            }
            showPhonePeCallback.onResponse(z2);
        } catch (Exception unused) {
            showPhonePeCallback.onResponse(false);
        }
    }

    public static void irjuc(boolean z, String str, AtomicBoolean atomicBoolean, CheckPhonePeAvailabilityCallback checkPhonePeAvailabilityCallback) {
        if (!atomicBoolean.get()) {
            checkPhonePeAvailabilityCallback.onResponse(z, str);
            jt1.m53777p(str, "responseCode");
            Map W = id2.m52120W(yi4.m71797a("checkAvailabilityFinalResponse", Boolean.valueOf(z)), yi4.m71797a("checkAvailabilityFinalResponseCode", str));
            jt1.m53777p("CHECK_AVAILABILITY_SDK_FINAL_RESPONSE_SENT", "eventName");
            zz4 zz4 = (zz4) getObjectFactory().mo48873i(zz4.class);
            u25 b = zz4.mo48478b("CHECK_AVAILABILITY_SDK_FINAL_RESPONSE_SENT");
            if (W != null) {
                for (Map.Entry entry : W.entrySet()) {
                    b.mo45379a((String) entry.getKey(), entry.getValue());
                }
            }
            zz4.mo48477a(b);
            atomicBoolean.set(true);
        }
    }

    @MerchantAPI
    public static boolean isAppInstalled() throws PhonePeInitException {
        C7601c objectFactory = getObjectFactory();
        objectFactory.getClass();
        return l05.m55204h(C7601c.f38776a, l05.m55199c(objectFactory));
    }

    @MerchantAPI
    public static void isUPIAccountRegistered(ShowPhonePeCallback showPhonePeCallback) throws PhonePeInitException {
        if (isAppInstalled()) {
            shouldShow(new a23(getObjectFactory(), showPhonePeCallback));
        } else {
            showPhonePeCallback.onResponse(false);
        }
    }

    @MerchantAPI
    public static void logout() throws PhonePeInitException {
        ((b05) getObjectFactory().mo48873i(b05.class)).mo48863c();
        getObjectFactory().getClass();
        C7601c.f38777a.f38779a.clear();
        getObjectFactory().getClass();
        cqqlq(C7601c.f38776a);
    }

    public static void request(String str, String str2, RequestCallback requestCallback) {
        C7601c.C7602a aVar = (C7601c.C7602a) cqqlq.mo48873i(C7601c.C7602a.class);
        aVar.put("request", str);
        aVar.put("constraints", str2);
        aVar.put("callback", requestCallback);
        cqqlq.mo48874j(a15.class, aVar);
    }

    @MerchantAPI
    public static void shouldShow(ShowPhonePeCallback showPhonePeCallback) throws PhonePeInitException {
        if (!isAppInstalled()) {
            showPhonePeCallback.onResponse(false);
        } else if (((r25) getObjectFactory().mo48873i(r25.class)).f34479a.mo48862b().getBoolean("showPhonePeEnabled", true)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("loggedIn", true);
                jSONObject.put("singlePaymentInstrumentAvailable", true);
                jSONObject.put("merchantAppId", getObjectFactory().mo48872h("com.phonepe.android.sdk.AppId"));
            } catch (Exception e) {
                m05.m56773d(TAG, e.getMessage(), e);
            }
            request("shouldShowPhonePe", jSONObject.toString(), new x13(showPhonePeCallback));
        } else {
            showPhonePeCallback.onResponse(true);
        }
    }

    public static void validateUser(String str, UserValidityCallback userValidityCallback) throws PhonePeInitException {
        shouldShow(new z13(str, userValidityCallback));
    }

    public final void irjuc(Context context) {
        try {
            m05.m56774e(TAG, "trying to get app metadata ...");
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo == null || applicationInfo.metaData == null) {
                m05.C6076b bVar = m05.f31968a;
                if (bVar != null) {
                    bVar.mo40407f(TAG, "failed to get application applicationInfo or applicationMetaData");
                }
                irjuc("SDK_INITIALIZATION_FAILED", "failed to get application applicationInfo or applicationMetaData");
                throw new IllegalArgumentException("failed to get application applicationInfo or applicationMetaData");
            }
            irjuc(applicationInfo);
        } catch (PackageManager.NameNotFoundException e) {
            m05.m56771b(TAG, String.format("failed to cache merchant meta with exception message = {%s}. failed to initialized SDK", new Object[]{e.getMessage()}));
            irjuc("SDK_INITIALIZATION_FAILED", e.getMessage());
            throw new IllegalArgumentException("Failed to retrieve merchant metaData from manifest");
        }
    }

    public final void irjuc(ApplicationInfo applicationInfo) {
        try {
            getObjectFactory().mo48875k("com.phonepe.android.sdk.MerchantId", applicationInfo.metaData.getString("com.phonepe.android.sdk.MerchantId"));
            getObjectFactory().mo48875k("com.phonepe.android.sdk.AppId", applicationInfo.metaData.getString("com.phonepe.android.sdk.AppId"));
            getObjectFactory().mo48875k("com.phonepe.android.sdk.Debuggable", Boolean.valueOf(applicationInfo.metaData.getBoolean("com.phonepe.android.sdk.Debuggable")));
            getObjectFactory().mo48875k("com.phonepe.android.sdk.isUAT", Boolean.valueOf(applicationInfo.metaData.getBoolean("com.phonepe.android.sdk.isUAT")));
            getObjectFactory().mo48875k("com.phonepe.android.sdk.PreCacheEnabled", Boolean.valueOf(applicationInfo.metaData.getBoolean("com.phonepe.android.sdk.PreCacheEnabled")));
            getObjectFactory().mo48875k("com.phonepe.android.sdk.useJusPay", Boolean.valueOf(applicationInfo.metaData.getBoolean("com.phonepe.android.sdk.useJusPay")));
        } catch (PhonePeInitException e) {
            m05.m56773d(TAG, e.getMessage(), e);
        }
    }

    public final void irjuc(String str, String str2) {
        u25 b = this.irjuc.mo48478b(str);
        h15.put((JSONObject) b.get(C4311b.C4317f.C4318a.f25149a), b.getObjectFactory(), "errorMessage", str2);
        this.irjuc.mo48477a(b);
    }

    @MerchantAPI
    public boolean isDebuggable() {
        try {
            return l05.m55205i((Boolean) getObjectFactory().mo48872h("com.phonepe.android.sdk.Debuggable"));
        } catch (PhonePeInitException e) {
            m05.m56773d(TAG, e.getMessage(), e);
            return false;
        }
    }

    @MerchantAPI
    public boolean isInUATMode() {
        try {
            return l05.m55205i((Boolean) getObjectFactory().mo48872h("com.phonepe.android.sdk.isUAT"));
        } catch (PhonePeInitException e) {
            m05.m56773d(TAG, e.getMessage(), e);
            return false;
        }
    }
}
