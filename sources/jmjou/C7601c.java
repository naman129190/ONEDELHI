package jmjou;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.onedelhi.secure.h35;
import com.onedelhi.secure.l05;
import com.onedelhi.secure.m05;
import com.onedelhi.secure.oz4;
import com.onedelhi.secure.u10;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: jmjou.c */
public class C7601c implements Parcelable {
    public static final Parcelable.Creator<C7601c> CREATOR = new C7604c();

    /* renamed from: a */
    public static Context f38776a;

    /* renamed from: a */
    public static C7603b f38777a = new C7603b();

    /* renamed from: b */
    public static String f38778b = UUID.randomUUID().toString();

    /* renamed from: jmjou.c$a */
    public static class C7602a extends HashMap<String, Object> implements C7606e {
        public void init(C7601c cVar, C7602a aVar) {
        }

        public boolean isCachingAllowed() {
            return false;
        }
    }

    /* renamed from: jmjou.c$b */
    public static class C7603b {

        /* renamed from: a */
        public Map<String, Object> f38779a = new HashMap();

        /* renamed from: a */
        public <T> boolean mo48878a(Class<T> cls) {
            if (l05.m55206j(cls, "ObjectFactory", "tClass")) {
                return false;
            }
            return this.f38779a.containsKey(cls.getCanonicalName());
        }
    }

    /* renamed from: jmjou.c$c */
    public class C7604c implements Parcelable.Creator<C7601c> {
        public Object createFromParcel(Parcel parcel) {
            return new C7601c();
        }

        public Object[] newArray(int i) {
            return new C7601c[i];
        }
    }

    public C7601c() {
    }

    public C7601c(Context context) {
        m05.m56774e("ObjectFactory", "validating context provided to sdk ...");
        if (l05.m55206j(context, "ObjectFactory", "context") || l05.m55206j(context.getApplicationContext(), "ObjectFactory", "appContext")) {
            throw new IllegalArgumentException("Application context is required for initialization.");
        }
        m05.m56770a("ObjectFactory", "context provided is valid");
        f38776a = context.getApplicationContext();
    }

    /* renamed from: a */
    public oz4 mo48865a() {
        return (oz4) mo48873i(oz4.class);
    }

    /* renamed from: b */
    public JSONObject mo48866b(String str) {
        try {
            return new JSONObject(str);
        } catch (JSONException e) {
            m05.m56773d("ObjectFactory", String.format("JSONException with msg = {%s} for the key {%s}", new Object[]{e.getMessage(), str}), e);
            return null;
        }
    }

    /* renamed from: c */
    public String mo48867c() {
        try {
            C7603b bVar = f38777a;
            bVar.getClass();
            if (l05.m55206j("signature_digest", "ObjectFactory", "key") ? false : bVar.f38779a.containsKey("signature_digest")) {
                return (String) f38777a.f38779a.get("signature_digest");
            }
            byte[] byteArray = f38776a.getPackageManager().getPackageInfo(f38776a.getPackageName(), 64).signatures[0].toByteArray();
            MessageDigest instance = MessageDigest.getInstance(u10.f35895a);
            instance.update(byteArray);
            String encodeToString = Base64.encodeToString(instance.digest(), 2);
            f38777a.f38779a.put("signature_digest", encodeToString);
            return encodeToString;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: d */
    public JSONArray mo48868d(String str) {
        try {
            return new JSONArray(str);
        } catch (JSONException e) {
            m05.m56773d("ObjectFactory", String.format("JSONException with msg = {%s} for the key {%s}", new Object[]{e.getMessage(), str}), e);
            return null;
        }
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public <T> Intent mo48870e(Context context, Class<T> cls, Bundle bundle) {
        Intent intent = new Intent(context, cls);
        intent.putExtras(bundle);
        return intent;
    }

    /* renamed from: f */
    public Bundle mo48871f() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("data_factory", this);
        return bundle;
    }

    /* renamed from: h */
    public <T> T mo48872h(String str) {
        C7603b bVar = f38777a;
        bVar.getClass();
        if (l05.m55206j(str, "ObjectFactory", "key") ? false : bVar.f38779a.containsKey(str)) {
            return f38777a.f38779a.get(str);
        }
        return null;
    }

    /* renamed from: i */
    public <T extends C7606e> T mo48873i(Class<T> cls) {
        if (f38777a.mo48878a(cls)) {
            return (C7606e) f38777a.f38779a.get(cls.getCanonicalName());
        }
        T j = mo48874j(cls, (C7602a) null);
        if (j == null || !j.isCachingAllowed()) {
            return j;
        }
        C7603b bVar = f38777a;
        if (!bVar.mo48878a(cls)) {
            synchronized (C7603b.class) {
                if (!bVar.mo48878a(cls)) {
                    bVar.f38779a.put(cls.getCanonicalName(), j);
                }
            }
        }
        return (C7606e) bVar.f38779a.get(cls.getCanonicalName());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.IllegalAccessException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.InstantiationException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.IllegalAccessException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.lang.IllegalAccessException} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T extends jmjou.C7606e> T mo48874j(java.lang.Class<T> r6, jmjou.C7601c.C7602a r7) {
        /*
            r5 = this;
            java.lang.String r0 = "ObjectFactory"
            r1 = 1
            r2 = 0
            r3 = 2
            java.lang.Object r4 = r6.newInstance()     // Catch:{ IllegalAccessException -> 0x0025, InstantiationException -> 0x000f }
            jmjou.e r4 = (jmjou.C7606e) r4     // Catch:{ IllegalAccessException -> 0x0025, InstantiationException -> 0x000f }
            r4.init(r5, r7)     // Catch:{ IllegalAccessException -> 0x0025, InstantiationException -> 0x000f }
            return r4
        L_0x000f:
            r7 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r6 = r6.getName()
            r3[r2] = r6
            java.lang.String r6 = r7.getMessage()
            r3[r1] = r6
            java.lang.String r6 = "InstantiationException for class = {%s} caught,exception message = {%s}."
            java.lang.String r6 = java.lang.String.format(r6, r3)
            goto L_0x003a
        L_0x0025:
            r7 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r6 = r6.getName()
            r3[r2] = r6
            java.lang.String r6 = r7.getMessage()
            r3[r1] = r6
            java.lang.String r6 = "IllegalAccessException for class = {%s} caught,exception message = {%s}. Make sure class has public default constructor available."
            java.lang.String r6 = java.lang.String.format(r6, r3)
        L_0x003a:
            com.onedelhi.secure.m05.m56773d(r0, r6, r7)
            com.onedelhi.secure.oz4 r6 = r5.mo48865a()
            com.onedelhi.secure.oz4$a r7 = com.onedelhi.secure.oz4.C6352a.LOW
            java.lang.String r1 = "This should not happen, there is something wrong with PhonePe SDK"
            r6.mo42319a(r0, r1, r7)
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: jmjou.C7601c.mo48874j(java.lang.Class, jmjou.c$a):jmjou.e");
    }

    /* renamed from: k */
    public <T> boolean mo48875k(String str, T t) {
        if (l05.m55206j(t, "ObjectFactory", str)) {
            return false;
        }
        f38777a.f38779a.put(str, t);
        return true;
    }

    /* renamed from: m */
    public h35 mo48876m(String str) {
        h35 h35 = (h35) mo48873i(h35.class);
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1149187101:
                if (str.equals("SUCCESS")) {
                    c = 0;
                    break;
                }
                break;
            case -879828873:
                if (str.equals("NETWORK_ERROR")) {
                    c = 1;
                    break;
                }
                break;
            case -591252731:
                if (str.equals("EXPIRED")) {
                    c = 2;
                    break;
                }
                break;
            case -137465490:
                if (str.equals("USER_CANCEL")) {
                    c = 3;
                    break;
                }
                break;
            case 1570819351:
                if (str.equals("TRX_FAILED_REPORTED_BY_UPI_APP")) {
                    c = 4;
                    break;
                }
                break;
            case 1687978510:
                if (str.equals("RETRY_LIMIT_EXCEEDED")) {
                    c = 5;
                    break;
                }
                break;
            case 2066319421:
                if (str.equals("FAILED")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                h35.put("statusCode", "SUCCESS");
                break;
            case 1:
                h35.put("statusCode", "NETWORK_ERROR");
                break;
            case 2:
                h35.put("statusCode", "EXPIRED");
                break;
            case 3:
                h35.put("statusCode", "USER_CANCEL");
                break;
            case 4:
                h35.put("statusCode", "TRX_FAILED_REPORTED_BY_UPI_APP");
                break;
            case 5:
                h35.put("statusCode", "RETRY_LIMIT_EXCEEDED");
                break;
            case 6:
                h35.put("statusCode", "FAILED");
                break;
        }
        return h35;
    }

    public void writeToParcel(Parcel parcel, int i) {
    }
}
