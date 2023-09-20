package com.onedelhi.secure;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.os.Parcelable;
import jmjou.C7601c;
import org.json.JSONObject;

public class w15 extends z25 {
    public static final Parcelable.Creator<w15> CREATOR = new C7118a();

    /* renamed from: com.onedelhi.secure.w15$a */
    public class C7118a implements Parcelable.Creator<w15> {
        public Object createFromParcel(Parcel parcel) {
            return new w15(parcel);
        }

        public Object[] newArray(int i) {
            return new w15[i];
        }
    }

    public w15() {
    }

    public w15(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: a */
    public void mo46494a() {
        String str;
        getObjectFactory().getClass();
        Context context = C7601c.f38776a;
        String c = l05.m55199c(getObjectFactory());
        boolean h = l05.m55204h(context, c);
        long j = -1;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(c, 1);
            j = (long) packageInfo.versionCode;
            str = packageInfo.versionName;
        } catch (Exception e) {
            m05.m56771b("SDKContext", String.format("failed to get package info for package name = {%s}, exception message = {%s}", new Object[]{c, e.getMessage()}));
            str = "-1";
        }
        put("isPPAppPresent", Boolean.valueOf(h));
        put("ppVersionCode", Long.valueOf(j));
        put("ppVersionName", str);
        String str2 = (String) getObjectFactory().mo48872h("shouldShowPhonePe");
        if (str2 != null) {
            try {
                if (!str2.isEmpty()) {
                    JSONObject jSONObject = new JSONObject(str2);
                    if (jSONObject.has("loggedIn")) {
                        put("loggedInOnPP", Boolean.valueOf(jSONObject.getBoolean("loggedIn")));
                    }
                    if (jSONObject.has("singlePaymentInstrumentAvailable")) {
                        put("minSinglePaymentInstrument", Boolean.valueOf(jSONObject.getBoolean("singlePaymentInstrumentAvailable")));
                    }
                    if (jSONObject.has("supportedUriSchemas")) {
                        put("supportedUriSchemas", jSONObject.getJSONArray("supportedUriSchemas"));
                    }
                }
            } catch (Exception e2) {
                m05.m56773d("SDKContext", e2.getMessage(), e2);
            }
        }
    }

    public int describeContents() {
        return super.describeContents();
    }

    /* JADX WARNING: Removed duplicated region for block: B:74:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0311 A[LOOP:3: B:85:0x030b->B:87:0x0311, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void init(jmjou.C7601c r17, jmjou.C7601c.C7602a r18) {
        /*
            r16 = this;
            r1 = r16
            java.lang.String r0 = "mcc"
            java.lang.String r2 = "PERMISSION_DENIED"
            java.lang.String r3 = "phone"
            java.lang.Class<com.onedelhi.secure.b05> r4 = com.onedelhi.secure.b05.class
            super.init(r17, r18)
            jmjou.c r5 = r16.getObjectFactory()
            java.lang.Class<com.onedelhi.secure.q05> r6 = com.onedelhi.secure.q05.class
            jmjou.e r5 = r5.mo48873i(r6)
            com.onedelhi.secure.q05 r5 = (com.onedelhi.secure.q05) r5
            r5.getClass()
            r6 = 1
            r7 = 0
            r8 = 0
            android.content.Context r9 = r5.mo36562a()     // Catch:{ Exception -> 0x0082 }
            if (r9 == 0) goto L_0x0094
            java.lang.String r9 = "android.permission.READ_PHONE_STATE"
            android.content.Context r10 = r5.mo36562a()     // Catch:{ Exception -> 0x0082 }
            int r9 = com.onedelhi.secure.r70.m26348a(r10, r9)     // Catch:{ Exception -> 0x0082 }
            if (r9 != 0) goto L_0x0033
            r9 = 1
            goto L_0x0034
        L_0x0033:
            r9 = 0
        L_0x0034:
            if (r9 == 0) goto L_0x0093
            int r9 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0082 }
            r10 = 22
            if (r9 < r10) goto L_0x0084
            android.content.Context r9 = r5.mo36562a()     // Catch:{ Exception -> 0x0082 }
            android.telephony.SubscriptionManager r9 = android.telephony.SubscriptionManager.from(r9)     // Catch:{ Exception -> 0x0082 }
            java.util.List r9 = r9.getActiveSubscriptionInfoList()     // Catch:{ Exception -> 0x0082 }
            if (r9 == 0) goto L_0x0094
            int r10 = r9.size()     // Catch:{ Exception -> 0x0082 }
            if (r10 <= 0) goto L_0x0094
            java.util.Iterator r9 = r9.iterator()     // Catch:{ Exception -> 0x0082 }
            r10 = 1
        L_0x0055:
            boolean r11 = r9.hasNext()     // Catch:{ Exception -> 0x0082 }
            if (r11 == 0) goto L_0x0094
            java.lang.Object r11 = r9.next()     // Catch:{ Exception -> 0x0082 }
            android.telephony.SubscriptionInfo r11 = (android.telephony.SubscriptionInfo) r11     // Catch:{ Exception -> 0x0082 }
            if (r10 == 0) goto L_0x0069
            java.lang.String r8 = r11.getIccId()     // Catch:{ Exception -> 0x0082 }
            r10 = 0
            goto L_0x0055
        L_0x0069:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0082 }
            r12.<init>()     // Catch:{ Exception -> 0x0082 }
            r12.append(r8)     // Catch:{ Exception -> 0x0082 }
            java.lang.String r13 = ","
            r12.append(r13)     // Catch:{ Exception -> 0x0082 }
            java.lang.String r11 = r11.getIccId()     // Catch:{ Exception -> 0x0082 }
            r12.append(r11)     // Catch:{ Exception -> 0x0082 }
            java.lang.String r8 = r12.toString()     // Catch:{ Exception -> 0x0082 }
            goto L_0x0055
        L_0x0082:
            goto L_0x0094
        L_0x0084:
            android.content.Context r9 = r5.mo36562a()     // Catch:{ Exception -> 0x0082 }
            java.lang.Object r9 = r9.getSystemService(r3)     // Catch:{ Exception -> 0x0082 }
            android.telephony.TelephonyManager r9 = (android.telephony.TelephonyManager) r9     // Catch:{ Exception -> 0x0082 }
            java.lang.String r8 = r9.getSimSerialNumber()     // Catch:{ Exception -> 0x0082 }
            goto L_0x0094
        L_0x0093:
            r8 = r2
        L_0x0094:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "TEST FRAUD DETECTION ICCID "
            r9.append(r10)
            r9.append(r8)
            java.lang.String r9 = r9.toString()
            java.lang.String r10 = "PhonePe"
            com.onedelhi.secure.m05.m56772c(r10, r9)
            java.lang.String r9 = "deviceIccid"
            r1.put(r9, r8)
            android.content.Context r8 = r5.mo36562a()
            java.lang.String r9 = "connectivity"
            java.lang.Object r8 = r8.getSystemService(r9)
            android.net.ConnectivityManager r8 = (android.net.ConnectivityManager) r8
            android.net.NetworkInfo r8 = r8.getActiveNetworkInfo()
            if (r8 == 0) goto L_0x00e5
            int r9 = r8.getType()
            int r10 = r8.getSubtype()
            if (r9 != r6) goto L_0x00ce
            java.lang.String r8 = "WIFI"
            goto L_0x00e7
        L_0x00ce:
            if (r9 != 0) goto L_0x00e0
            switch(r10) {
                case 1: goto L_0x00da;
                case 2: goto L_0x00da;
                case 3: goto L_0x00d7;
                case 4: goto L_0x00da;
                case 5: goto L_0x00d7;
                case 6: goto L_0x00d7;
                case 7: goto L_0x00da;
                case 8: goto L_0x00d7;
                case 9: goto L_0x00d7;
                case 10: goto L_0x00d7;
                case 11: goto L_0x00da;
                case 12: goto L_0x00d7;
                case 13: goto L_0x00d4;
                case 14: goto L_0x00d7;
                case 15: goto L_0x00d7;
                default: goto L_0x00d3;
            }
        L_0x00d3:
            goto L_0x00dd
        L_0x00d4:
            java.lang.String r8 = "MOBILE_DATA_4G"
            goto L_0x00e7
        L_0x00d7:
            java.lang.String r8 = "MOBILE_DATA_3G"
            goto L_0x00e7
        L_0x00da:
            java.lang.String r8 = "MOBILE_DATA_2G"
            goto L_0x00e7
        L_0x00dd:
            java.lang.String r8 = "MOBILE_DATA_UNKNOWN"
            goto L_0x00e7
        L_0x00e0:
            java.lang.String r8 = r8.getSubtypeName()
            goto L_0x00e7
        L_0x00e5:
            java.lang.String r8 = "NO_NETWORK"
        L_0x00e7:
            java.lang.String r9 = "deviceNetworkType"
            r1.put(r9, r8)
            jmjou.c r8 = r5.f28936a
            java.lang.Class<com.onedelhi.secure.s05> r9 = com.onedelhi.secure.s05.class
            jmjou.e r8 = r8.mo48873i(r9)
            com.onedelhi.secure.s05 r8 = (com.onedelhi.secure.s05) r8
            org.json.JSONArray r9 = new org.json.JSONArray
            r9.<init>()
            android.content.Context r10 = r5.mo36562a()
            java.lang.String r11 = "android.permission.ACCESS_COARSE_LOCATION"
            int r10 = com.onedelhi.secure.r70.m26348a(r10, r11)
            if (r10 != 0) goto L_0x0109
            r10 = 1
            goto L_0x010a
        L_0x0109:
            r10 = 0
        L_0x010a:
            java.lang.String r11 = "values"
            if (r10 != 0) goto L_0x0125
            android.content.Context r10 = r5.mo36562a()
            java.lang.String r12 = "android.permission.ACCESS_FINE_LOCATION"
            int r10 = com.onedelhi.secure.r70.m26348a(r10, r12)
            if (r10 != 0) goto L_0x011c
            r10 = 1
            goto L_0x011d
        L_0x011c:
            r10 = 0
        L_0x011d:
            if (r10 == 0) goto L_0x0120
            goto L_0x0125
        L_0x0120:
            r8.mo44136a(r7)
            goto L_0x01ce
        L_0x0125:
            android.content.Context r2 = r5.mo36562a()     // Catch:{ Exception -> 0x01c8 }
            java.lang.Object r2 = r2.getSystemService(r3)     // Catch:{ Exception -> 0x01c8 }
            android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2     // Catch:{ Exception -> 0x01c8 }
            java.util.List r2 = r2.getAllCellInfo()     // Catch:{ Exception -> 0x01c8 }
            if (r2 == 0) goto L_0x01c0
            r3 = 0
        L_0x0136:
            int r10 = r2.size()     // Catch:{ Exception -> 0x01c8 }
            if (r3 >= r10) goto L_0x01c0
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ Exception -> 0x01c8 }
            r10.<init>()     // Catch:{ Exception -> 0x01c8 }
            java.lang.Object r12 = r2.get(r3)     // Catch:{ Exception -> 0x01c8 }
            android.telephony.CellInfo r12 = (android.telephony.CellInfo) r12     // Catch:{ Exception -> 0x01c8 }
            boolean r13 = r12 instanceof android.telephony.CellInfoGsm     // Catch:{ Exception -> 0x01c8 }
            java.lang.String r14 = "mnc"
            java.lang.String r15 = "dbm"
            java.lang.String r7 = "cellId"
            if (r13 == 0) goto L_0x0181
            r13 = r12
            android.telephony.CellInfoGsm r13 = (android.telephony.CellInfoGsm) r13     // Catch:{ Exception -> 0x01c8 }
            android.telephony.CellSignalStrengthGsm r13 = r13.getCellSignalStrength()     // Catch:{ Exception -> 0x01c8 }
            android.telephony.CellInfoGsm r12 = (android.telephony.CellInfoGsm) r12     // Catch:{ Exception -> 0x01c8 }
            android.telephony.CellIdentityGsm r12 = r12.getCellIdentity()     // Catch:{ Exception -> 0x01c8 }
            int r6 = r12.getCid()     // Catch:{ Exception -> 0x01c8 }
            r10.put(r7, r6)     // Catch:{ Exception -> 0x01c8 }
            java.lang.String r6 = "lac"
            int r7 = r12.getLac()     // Catch:{ Exception -> 0x01c8 }
            r10.put(r6, r7)     // Catch:{ Exception -> 0x01c8 }
            int r6 = r13.getDbm()     // Catch:{ Exception -> 0x01c8 }
            r10.put(r15, r6)     // Catch:{ Exception -> 0x01c8 }
            int r6 = r12.getMnc()     // Catch:{ Exception -> 0x01c8 }
            r10.put(r14, r6)     // Catch:{ Exception -> 0x01c8 }
            int r6 = r12.getMcc()     // Catch:{ Exception -> 0x01c8 }
            goto L_0x01b4
        L_0x0181:
            boolean r6 = r12 instanceof android.telephony.CellInfoLte     // Catch:{ Exception -> 0x01c8 }
            if (r6 == 0) goto L_0x01ba
            r6 = r12
            android.telephony.CellInfoLte r6 = (android.telephony.CellInfoLte) r6     // Catch:{ Exception -> 0x01c8 }
            android.telephony.CellSignalStrengthLte r6 = r6.getCellSignalStrength()     // Catch:{ Exception -> 0x01c8 }
            android.telephony.CellInfoLte r12 = (android.telephony.CellInfoLte) r12     // Catch:{ Exception -> 0x01c8 }
            android.telephony.CellIdentityLte r12 = r12.getCellIdentity()     // Catch:{ Exception -> 0x01c8 }
            int r13 = r12.getCi()     // Catch:{ Exception -> 0x01c8 }
            r10.put(r7, r13)     // Catch:{ Exception -> 0x01c8 }
            java.lang.String r7 = "tac"
            int r13 = r12.getTac()     // Catch:{ Exception -> 0x01c8 }
            r10.put(r7, r13)     // Catch:{ Exception -> 0x01c8 }
            int r6 = r6.getDbm()     // Catch:{ Exception -> 0x01c8 }
            r10.put(r15, r6)     // Catch:{ Exception -> 0x01c8 }
            int r6 = r12.getMnc()     // Catch:{ Exception -> 0x01c8 }
            r10.put(r14, r6)     // Catch:{ Exception -> 0x01c8 }
            int r6 = r12.getMcc()     // Catch:{ Exception -> 0x01c8 }
        L_0x01b4:
            r10.put(r0, r6)     // Catch:{ Exception -> 0x01c8 }
            r9.put(r10)     // Catch:{ Exception -> 0x01c8 }
        L_0x01ba:
            int r3 = r3 + 1
            r6 = 1
            r7 = 0
            goto L_0x0136
        L_0x01c0:
            r0 = 1
            r8.mo44136a(r0)     // Catch:{ Exception -> 0x01c8 }
            r8.put(r11, r9)     // Catch:{ Exception -> 0x01c8 }
            goto L_0x01d3
        L_0x01c8:
            r0 = 0
            r8.mo44136a(r0)
            java.lang.String r2 = "UNKNOWN"
        L_0x01ce:
            java.lang.String r0 = "errorCode"
            r8.put(r0, r2)
        L_0x01d3:
            org.json.JSONObject r0 = r8.toJsonObject()
            java.lang.String r2 = "deviceCellInfo"
            r1.put(r2, r0)
            jmjou.c r0 = r5.f28936a
            java.lang.Class<com.onedelhi.secure.p05> r2 = com.onedelhi.secure.p05.class
            jmjou.e r0 = r0.mo48873i(r2)
            com.onedelhi.secure.p05 r0 = (com.onedelhi.secure.p05) r0
            r2 = 0
            r0.f33435b = r2
            java.lang.Double r5 = java.lang.Double.valueOf(r2)
            java.lang.String r6 = "longitude"
            r0.put(r6, r5)
            r0.f33434a = r2
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            java.lang.String r3 = "latitude"
            r0.put(r3, r2)
            org.json.JSONObject r0 = r0.toJsonObject()
            java.lang.String r2 = "deviceLocation"
            r1.put(r2, r0)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            java.lang.String r2 = "isJusPaySDKIntegrated"
            r1.put(r2, r0)
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = "tlsVersion"
            r1.put(r2, r0)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            android.net.Uri r2 = com.onedelhi.secure.k15.C5869a.f31078a
            r0.setData(r2)
            jmjou.c r2 = r16.getObjectFactory()
            java.util.List r0 = com.onedelhi.secure.l05.m55202f(r2, r0)
            jmjou.c r2 = r16.getObjectFactory()
            r2.getClass()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            jmjou.c r3 = r16.getObjectFactory()
            if (r3 == 0) goto L_0x02fb
            jmjou.c r3 = r16.getObjectFactory()
            r3.getClass()
            android.content.Context r3 = jmjou.C7601c.f38776a
            if (r3 == 0) goto L_0x02fb
            if (r0 == 0) goto L_0x02fb
            jmjou.c r3 = r16.getObjectFactory()
            r3.getClass()
            android.content.Context r3 = jmjou.C7601c.f38776a
            android.content.pm.PackageManager r3 = r3.getPackageManager()
            java.util.Iterator r0 = r0.iterator()
        L_0x025a:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x02fb
            java.lang.Object r5 = r0.next()
            android.content.pm.ResolveInfo r5 = (android.content.pm.ResolveInfo) r5
            android.content.pm.ActivityInfo r6 = r5.activityInfo
            java.lang.String r7 = r6.packageName
            android.content.pm.ApplicationInfo r6 = r6.applicationInfo
            java.lang.CharSequence r6 = r3.getApplicationLabel(r6)
            java.lang.String r6 = r6.toString()
            jmjou.c r8 = r16.getObjectFactory()
            java.lang.Class<com.onedelhi.secure.d05> r9 = com.onedelhi.secure.d05.class
            jmjou.e r8 = r8.mo48873i(r9)
            com.onedelhi.secure.d05 r8 = (com.onedelhi.secure.d05) r8
            java.lang.String r9 = "packageName"
            r8.put(r9, r7)
            jmjou.c r9 = r8.getObjectFactory()
            jmjou.e r9 = r9.mo48873i(r4)
            jmjou.b r9 = (jmjou.C7600b) r9
            android.content.SharedPreferences r9 = r9.mo48862b()
            java.lang.String r10 = "f2aa8191-1945-4b84-a511-6bdae6556280"
            java.lang.String r12 = ""
            java.lang.String r9 = r9.getString(r10, r12)
            boolean r9 = r9.equals(r7)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            java.lang.String r13 = "lastUsed"
            r8.put(r13, r9)
            java.lang.String r9 = "appName"
            r8.put(r9, r6)
            jmjou.c r6 = r16.getObjectFactory()
            int r6 = com.onedelhi.secure.l05.m55198b(r7, r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r7 = "appVersionCode"
            r8.put(r7, r6)
            android.content.pm.ActivityInfo r5 = r5.activityInfo
            java.lang.String r5 = r5.name
            jmjou.c r6 = r8.getObjectFactory()
            jmjou.e r6 = r6.mo48873i(r4)
            jmjou.b r6 = (jmjou.C7600b) r6
            java.lang.String r7 = r8.mo34060a()
            r6.mo48864d(r7, r5)
            jmjou.c r5 = r8.getObjectFactory()
            jmjou.e r5 = r5.mo48873i(r4)
            jmjou.b r5 = (jmjou.C7600b) r5
            android.content.SharedPreferences r5 = r5.mo48862b()
            java.lang.String r5 = r5.getString(r10, r12)
            java.lang.String r6 = r8.mo34060a()
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x02f5
            r5 = 0
            r2.add(r5, r8)
            goto L_0x025a
        L_0x02f5:
            r5 = 0
            r2.add(r8)
            goto L_0x025a
        L_0x02fb:
            jmjou.c r0 = r16.getObjectFactory()
            r0.getClass()
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x030b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x031f
            java.lang.Object r3 = r2.next()
            com.onedelhi.secure.d05 r3 = (com.onedelhi.secure.d05) r3
            org.json.JSONObject r3 = r3.toJsonObject()
            r0.put(r3)
            goto L_0x030b
        L_0x031f:
            java.lang.String r2 = "upiApps"
            r1.put(r2, r0)
            r16.mo46494a()
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>()
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r3 = "type"
            java.lang.String r4 = "ALLOWED_RESPONSE_SCHMEMAS"
            r0.put(r3, r4)     // Catch:{ Exception -> 0x0349 }
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ Exception -> 0x0349 }
            r3.<init>()     // Catch:{ Exception -> 0x0349 }
            java.lang.String r4 = "SDK_RESONSE_V2"
            r3.put(r4)     // Catch:{ Exception -> 0x0349 }
            r0.put(r11, r3)     // Catch:{ Exception -> 0x0349 }
            r2.put(r0)     // Catch:{ Exception -> 0x0349 }
            goto L_0x0353
        L_0x0349:
            r0 = move-exception
            java.lang.String r3 = r0.getMessage()
            java.lang.String r4 = "SDKContext"
            com.onedelhi.secure.m05.m56773d(r4, r3, r0)
        L_0x0353:
            java.lang.String r0 = "constraints"
            r1.put(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.w15.init(jmjou.c, jmjou.c$a):void");
    }

    public boolean isCachingAllowed() {
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
