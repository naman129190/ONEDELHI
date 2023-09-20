package com.onedelhi.secure;

public class pd2 {

    /* renamed from: b */
    public static String f18437b = "\r";

    /* renamed from: a */
    public final float f18438a;

    /* renamed from: a */
    public final String f18439a;

    /* renamed from: b */
    public final float f18440b;

    public pd2(String str, float f, float f2) {
        this.f18439a = str;
        this.f18440b = f2;
        this.f18438a = f;
    }

    /* renamed from: a */
    public boolean mo22391a(String str) {
        if (this.f18439a.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.f18439a.endsWith(f18437b)) {
            String str2 = this.f18439a;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
