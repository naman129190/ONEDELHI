package com.onedelhi.secure;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class b76 {

    /* renamed from: a */
    public final Bundle f9725a = new Bundle();

    /* renamed from: a */
    public final /* synthetic */ q76 f9726a;

    /* renamed from: a */
    public final String f9727a = "default_event_parameters";

    /* renamed from: b */
    public Bundle f9728b;

    public b76(q76 q76, String str, Bundle bundle) {
        this.f9726a = q76;
        Preconditions.checkNotEmpty("default_event_parameters");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:35|36|47) */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r11.f9726a.f11205a.mo15136e().mo12726r().mo25379a("Error reading value from SharedPreferences. Value dropped");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00a3 */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009b A[Catch:{ NumberFormatException | JSONException -> 0x00a3 }] */
    @com.onedelhi.secure.ly4
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo13517a() {
        /*
            r11 = this;
            android.os.Bundle r0 = r11.f9728b
            if (r0 == 0) goto L_0x0006
            goto L_0x00d4
        L_0x0006:
            com.onedelhi.secure.q76 r0 = r11.f9726a
            android.content.SharedPreferences r0 = r0.mo22924o()
            java.lang.String r1 = r11.f9727a
            r2 = 0
            java.lang.String r0 = r0.getString(r1, r2)
            if (r0 == 0) goto L_0x00cc
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ JSONException -> 0x00bb }
            r1.<init>()     // Catch:{ JSONException -> 0x00bb }
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ JSONException -> 0x00bb }
            r2.<init>(r0)     // Catch:{ JSONException -> 0x00bb }
            r0 = 0
            r3 = 0
        L_0x0021:
            int r4 = r2.length()     // Catch:{ JSONException -> 0x00bb }
            if (r3 >= r4) goto L_0x00b8
            org.json.JSONObject r4 = r2.getJSONObject(r3)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            java.lang.String r5 = "n"
            java.lang.String r5 = r4.getString(r5)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            java.lang.String r6 = "t"
            java.lang.String r6 = r4.getString(r6)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            int r7 = r6.hashCode()     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            r8 = 100
            r9 = 2
            r10 = 1
            if (r7 == r8) goto L_0x005e
            r8 = 108(0x6c, float:1.51E-43)
            if (r7 == r8) goto L_0x0054
            r8 = 115(0x73, float:1.61E-43)
            if (r7 == r8) goto L_0x004a
            goto L_0x0068
        L_0x004a:
            java.lang.String r7 = "s"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x0068
            r7 = 0
            goto L_0x0069
        L_0x0054:
            java.lang.String r7 = "l"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x0068
            r7 = 2
            goto L_0x0069
        L_0x005e:
            java.lang.String r7 = "d"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x0068
            r7 = 1
            goto L_0x0069
        L_0x0068:
            r7 = -1
        L_0x0069:
            java.lang.String r8 = "v"
            if (r7 == 0) goto L_0x009b
            if (r7 == r10) goto L_0x008f
            if (r7 == r9) goto L_0x0083
            com.onedelhi.secure.q76 r4 = r11.f9726a     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            com.onedelhi.secure.za6 r4 = r4.f11205a     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            com.onedelhi.secure.a56 r4 = r4.mo15136e()     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            com.onedelhi.secure.u46 r4 = r4.mo12726r()     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            java.lang.String r5 = "Unrecognized persisted bundle type. Type"
            r4.mo25380b(r5, r6)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            goto L_0x00b4
        L_0x0083:
            java.lang.String r4 = r4.getString(r8)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            long r6 = java.lang.Long.parseLong(r4)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            r1.putLong(r5, r6)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            goto L_0x00b4
        L_0x008f:
            java.lang.String r4 = r4.getString(r8)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            double r6 = java.lang.Double.parseDouble(r4)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            r1.putDouble(r5, r6)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            goto L_0x00b4
        L_0x009b:
            java.lang.String r4 = r4.getString(r8)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            r1.putString(r5, r4)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            goto L_0x00b4
        L_0x00a3:
            com.onedelhi.secure.q76 r4 = r11.f9726a     // Catch:{ JSONException -> 0x00bb }
            com.onedelhi.secure.za6 r4 = r4.f11205a     // Catch:{ JSONException -> 0x00bb }
            com.onedelhi.secure.a56 r4 = r4.mo15136e()     // Catch:{ JSONException -> 0x00bb }
            com.onedelhi.secure.u46 r4 = r4.mo12726r()     // Catch:{ JSONException -> 0x00bb }
            java.lang.String r5 = "Error reading value from SharedPreferences. Value dropped"
            r4.mo25379a(r5)     // Catch:{ JSONException -> 0x00bb }
        L_0x00b4:
            int r3 = r3 + 1
            goto L_0x0021
        L_0x00b8:
            r11.f9728b = r1     // Catch:{ JSONException -> 0x00bb }
            goto L_0x00cc
        L_0x00bb:
            com.onedelhi.secure.q76 r0 = r11.f9726a
            com.onedelhi.secure.za6 r0 = r0.f11205a
            com.onedelhi.secure.a56 r0 = r0.mo15136e()
            com.onedelhi.secure.u46 r0 = r0.mo12726r()
            java.lang.String r1 = "Error loading bundle from SharedPreferences. Values will be lost"
            r0.mo25379a(r1)
        L_0x00cc:
            android.os.Bundle r0 = r11.f9728b
            if (r0 != 0) goto L_0x00d4
            android.os.Bundle r0 = r11.f9725a
            r11.f9728b = r0
        L_0x00d4:
            android.os.Bundle r0 = r11.f9728b
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.b76.mo13517a():android.os.Bundle");
    }

    @ly4
    /* renamed from: b */
    public final void mo13518b(Bundle bundle) {
        String str;
        if (bundle == null) {
            bundle = new Bundle();
        }
        SharedPreferences.Editor edit = this.f9726a.mo22924o().edit();
        if (bundle.size() == 0) {
            edit.remove(this.f9727a);
        } else {
            String str2 = this.f9727a;
            JSONArray jSONArray = new JSONArray();
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, str3);
                        jSONObject.put("v", obj.toString());
                        if (obj instanceof String) {
                            str = "s";
                        } else if (obj instanceof Long) {
                            str = "l";
                        } else if (obj instanceof Double) {
                            str = GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG;
                        } else {
                            this.f9726a.f11205a.mo15136e().mo12726r().mo25380b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                        }
                        jSONObject.put("t", str);
                        jSONArray.put(jSONObject);
                    } catch (JSONException e) {
                        this.f9726a.f11205a.mo15136e().mo12726r().mo25380b("Cannot serialize bundle value to SharedPreferences", e);
                    }
                }
            }
            edit.putString(str2, jSONArray.toString());
        }
        edit.apply();
        this.f9728b = bundle;
    }
}
