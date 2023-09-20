package com.onedelhi.secure;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class hi2 {

    /* renamed from: a */
    public static final String f29634a = "userId";

    /* renamed from: a */
    public static final Charset f29635a = Charset.forName("UTF-8");

    /* renamed from: a */
    public final t21 f29636a;

    /* renamed from: com.onedelhi.secure.hi2$a */
    public class C5520a extends JSONObject {

        /* renamed from: a */
        public final /* synthetic */ String f29637a;

        public C5520a(String str) throws JSONException {
            this.f29637a = str;
            put(hi2.f29634a, str);
        }
    }

    public hi2(t21 t21) {
        this.f29636a = t21;
    }

    /* renamed from: d */
    public static Map<String, String> m50529d(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, m50533l(jSONObject, next));
        }
        return hashMap;
    }

    /* renamed from: f */
    public static String m50530f(Map<String, String> map) {
        return new JSONObject(map).toString();
    }

    /* renamed from: j */
    public static void m50531j(File file) {
        if (file.exists() && file.delete()) {
            o92 f = o92.m59120f();
            f.mo41617g("Deleted corrupt file: " + file.getAbsolutePath());
        }
    }

    /* renamed from: k */
    public static String m50532k(String str) throws JSONException {
        return new C5520a(str).toString();
    }

    /* renamed from: l */
    public static String m50533l(JSONObject jSONObject, String str) {
        if (!jSONObject.isNull(str)) {
            return jSONObject.optString(str, (String) null);
        }
        return null;
    }

    @mr2
    /* renamed from: a */
    public File mo37330a(String str) {
        return this.f29636a.mo44770p(str, bq4.f26506d);
    }

    @mr2
    /* renamed from: b */
    public File mo37331b(String str) {
        return this.f29636a.mo44770p(str, "keys");
    }

    @mr2
    /* renamed from: c */
    public File mo37332c(String str) {
        return this.f29636a.mo44770p(str, bq4.f26503b);
    }

    @ts2
    /* renamed from: e */
    public final String mo37333e(String str) throws JSONException {
        return m50533l(new JSONObject(str), f29634a);
    }

    /* renamed from: g */
    public Map<String, String> mo37334g(String str) {
        return mo37335h(str, false);
    }

    /* renamed from: h */
    public Map<String, String> mo37335h(String str, boolean z) {
        Exception e;
        FileInputStream fileInputStream;
        File a = z ? mo37330a(str) : mo37331b(str);
        if (!a.exists() || a.length() == 0) {
            m50531j(a);
            return Collections.emptyMap();
        }
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(a);
            try {
                Map<String, String> d = m50529d(u10.m66353H(fileInputStream));
                u10.m66358e(fileInputStream, "Failed to close user metadata file.");
                return d;
            } catch (Exception e2) {
                e = e2;
                try {
                    o92.m59120f().mo41624n("Error deserializing user metadata.", e);
                    m50531j(a);
                    u10.m66358e(fileInputStream, "Failed to close user metadata file.");
                    return Collections.emptyMap();
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    u10.m66358e(fileInputStream2, "Failed to close user metadata file.");
                    throw th;
                }
            }
        } catch (Exception e3) {
            Exception exc = e3;
            fileInputStream = null;
            e = exc;
            o92.m59120f().mo41624n("Error deserializing user metadata.", e);
            m50531j(a);
            u10.m66358e(fileInputStream, "Failed to close user metadata file.");
            return Collections.emptyMap();
        } catch (Throwable th2) {
            th = th2;
            u10.m66358e(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    @ts2
    /* renamed from: i */
    public String mo37336i(String str) {
        FileInputStream fileInputStream;
        File c = mo37332c(str);
        FileInputStream fileInputStream2 = null;
        if (!c.exists() || c.length() == 0) {
            o92.m59120f().mo41613b("No userId set for session " + str);
            m50531j(c);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(c);
            try {
                String e = mo37333e(u10.m66353H(fileInputStream));
                o92.m59120f().mo41613b("Loaded userId " + e + " for session " + str);
                u10.m66358e(fileInputStream, "Failed to close user metadata file.");
                return e;
            } catch (Exception e2) {
                e = e2;
                try {
                    o92.m59120f().mo41624n("Error deserializing user metadata.", e);
                    m50531j(c);
                    u10.m66358e(fileInputStream, "Failed to close user metadata file.");
                    return null;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    u10.m66358e(fileInputStream2, "Failed to close user metadata file.");
                    throw th;
                }
            }
        } catch (Exception e3) {
            e = e3;
            fileInputStream = null;
            o92.m59120f().mo41624n("Error deserializing user metadata.", e);
            m50531j(c);
            u10.m66358e(fileInputStream, "Failed to close user metadata file.");
            return null;
        } catch (Throwable th2) {
            th = th2;
            u10.m66358e(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    /* renamed from: m */
    public void mo37337m(String str, Map<String, String> map) {
        mo37338n(str, map, false);
    }

    /* renamed from: n */
    public void mo37338n(String str, Map<String, String> map, boolean z) {
        File a = z ? mo37330a(str) : mo37331b(str);
        BufferedWriter bufferedWriter = null;
        try {
            String f = m50530f(map);
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(a), f29635a));
            try {
                bufferedWriter2.write(f);
                bufferedWriter2.flush();
                u10.m66358e(bufferedWriter2, "Failed to close key/value metadata file.");
            } catch (Exception e) {
                e = e;
                bufferedWriter = bufferedWriter2;
                try {
                    o92.m59120f().mo41624n("Error serializing key/value metadata.", e);
                    m50531j(a);
                    u10.m66358e(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Throwable th) {
                    th = th;
                    u10.m66358e(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter = bufferedWriter2;
                u10.m66358e(bufferedWriter, "Failed to close key/value metadata file.");
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            o92.m59120f().mo41624n("Error serializing key/value metadata.", e);
            m50531j(a);
            u10.m66358e(bufferedWriter, "Failed to close key/value metadata file.");
        }
    }

    /* renamed from: o */
    public void mo37339o(String str, String str2) {
        File c = mo37332c(str);
        BufferedWriter bufferedWriter = null;
        try {
            String k = m50532k(str2);
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(c), f29635a));
            try {
                bufferedWriter2.write(k);
                bufferedWriter2.flush();
                u10.m66358e(bufferedWriter2, "Failed to close user metadata file.");
            } catch (Exception e) {
                e = e;
                bufferedWriter = bufferedWriter2;
                try {
                    o92.m59120f().mo41624n("Error serializing user metadata.", e);
                    u10.m66358e(bufferedWriter, "Failed to close user metadata file.");
                } catch (Throwable th) {
                    th = th;
                    u10.m66358e(bufferedWriter, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter = bufferedWriter2;
                u10.m66358e(bufferedWriter, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            o92.m59120f().mo41624n("Error serializing user metadata.", e);
            u10.m66358e(bufferedWriter, "Failed to close user metadata file.");
        }
    }
}
