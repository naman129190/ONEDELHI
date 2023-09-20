package com.onedelhi.secure;

import android.text.TextUtils;
import com.onedelhi.secure.C4623b5;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.onedelhi.secure.t1 */
public class C6819t1 {
    @hw4

    /* renamed from: a */
    public static final DateFormat f35321a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* renamed from: a */
    public static final String[] f35322a = {"experimentId", f35326g, f35328i, f35327h, "variantId"};
    @hw4

    /* renamed from: d */
    public static final String f35323d = "experimentId";
    @hw4

    /* renamed from: e */
    public static final String f35324e = "variantId";
    @hw4

    /* renamed from: f */
    public static final String f35325f = "triggerEvent";
    @hw4

    /* renamed from: g */
    public static final String f35326g = "experimentStartTime";
    @hw4

    /* renamed from: h */
    public static final String f35327h = "triggerTimeoutMillis";
    @hw4

    /* renamed from: i */
    public static final String f35328i = "timeToLiveMillis";

    /* renamed from: a */
    public final long f35329a;

    /* renamed from: a */
    public final String f35330a;

    /* renamed from: a */
    public final Date f35331a;

    /* renamed from: b */
    public final long f35332b;

    /* renamed from: b */
    public final String f35333b;

    /* renamed from: c */
    public final String f35334c;

    public C6819t1(String str, String str2, String str3, Date date, long j, long j2) {
        this.f35330a = str;
        this.f35333b = str2;
        this.f35334c = str3;
        this.f35331a = date;
        this.f35329a = j;
        this.f35332b = j2;
    }

    /* renamed from: a */
    public static C6819t1 m65121a(C4623b5.C4626c cVar) {
        String str = cVar.f26152c;
        if (str == null) {
            str = "";
        }
        return new C6819t1(cVar.f26149b, String.valueOf(cVar.f26144a), str, new Date(cVar.f26150c), cVar.f26142a, cVar.f26147b);
    }

    /* renamed from: b */
    public static C6819t1 m65122b(Map<String, String> map) throws C6733s1 {
        m65124l(map);
        try {
            return new C6819t1(map.get("experimentId"), map.get("variantId"), map.containsKey(f35325f) ? map.get(f35325f) : "", f35321a.parse(map.get(f35326g)), Long.parseLong(map.get(f35327h)), Long.parseLong(map.get(f35328i)));
        } catch (ParseException e) {
            throw new C6733s1("Could not process experiment: parsing experiment start time failed.", e);
        } catch (NumberFormatException e2) {
            throw new C6733s1("Could not process experiment: one of the durations could not be converted into a long.", e2);
        }
    }

    /* renamed from: k */
    public static void m65123k(C6819t1 t1Var) throws C6733s1 {
        m65124l(t1Var.mo44732j());
    }

    /* renamed from: l */
    public static void m65124l(Map<String, String> map) throws C6733s1 {
        ArrayList arrayList = new ArrayList();
        for (String str : f35322a) {
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new C6733s1(String.format("The following keys are missing from the experiment info map: %s", new Object[]{arrayList}));
        }
    }

    /* renamed from: c */
    public String mo44725c() {
        return this.f35330a;
    }

    /* renamed from: d */
    public long mo44726d() {
        return this.f35331a.getTime();
    }

    /* renamed from: e */
    public long mo44727e() {
        return this.f35332b;
    }

    /* renamed from: f */
    public String mo44728f() {
        return this.f35334c;
    }

    /* renamed from: g */
    public long mo44729g() {
        return this.f35329a;
    }

    /* renamed from: h */
    public String mo44730h() {
        return this.f35333b;
    }

    /* renamed from: i */
    public C4623b5.C4626c mo44731i(String str) {
        C4623b5.C4626c cVar = new C4623b5.C4626c();
        cVar.f26145a = str;
        cVar.f26150c = mo44726d();
        cVar.f26149b = this.f35330a;
        cVar.f26144a = this.f35333b;
        cVar.f26152c = TextUtils.isEmpty(this.f35334c) ? null : this.f35334c;
        cVar.f26142a = this.f35329a;
        cVar.f26147b = this.f35332b;
        return cVar;
    }

    @hw4
    /* renamed from: j */
    public Map<String, String> mo44732j() {
        HashMap hashMap = new HashMap();
        hashMap.put("experimentId", this.f35330a);
        hashMap.put("variantId", this.f35333b);
        hashMap.put(f35325f, this.f35334c);
        hashMap.put(f35326g, f35321a.format(this.f35331a));
        hashMap.put(f35327h, Long.toString(this.f35329a));
        hashMap.put(f35328i, Long.toString(this.f35332b));
        return hashMap;
    }
}
