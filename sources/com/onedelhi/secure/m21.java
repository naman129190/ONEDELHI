package com.onedelhi.secure;

public enum m21 {
    JSON(".json"),
    ZIP(".zip");
    

    /* renamed from: b */
    public final String f15877b;

    /* access modifiers changed from: public */
    m21(String str) {
        this.f15877b = str;
    }

    /* renamed from: a */
    public static m21 m21209a(String str) {
        for (m21 m21 : values()) {
            if (str.endsWith(m21.f15877b)) {
                return m21;
            }
        }
        p92.m24544e("Unable to find correct extension for " + str);
        return JSON;
    }

    /* renamed from: b */
    public String mo20044b() {
        return ".temp" + this.f15877b;
    }

    public String toString() {
        return this.f15877b;
    }
}
