package com.onedelhi.secure;

import java.util.HashMap;
import java.util.Map;

public final class mb5 {

    /* renamed from: a */
    public final long f16057a;

    /* renamed from: a */
    public String f16058a;

    /* renamed from: a */
    public final Map f16059a;

    public mb5(String str, long j, Map map) {
        this.f16058a = str;
        this.f16057a = j;
        HashMap hashMap = new HashMap();
        this.f16059a = hashMap;
        if (map != null) {
            hashMap.putAll(map);
        }
    }

    /* renamed from: a */
    public final long mo20282a() {
        return this.f16057a;
    }

    /* renamed from: b */
    public final mb5 clone() {
        return new mb5(this.f16058a, this.f16057a, new HashMap(this.f16059a));
    }

    /* renamed from: c */
    public final Object mo20284c(String str) {
        if (this.f16059a.containsKey(str)) {
            return this.f16059a.get(str);
        }
        return null;
    }

    /* renamed from: d */
    public final String mo20286d() {
        return this.f16058a;
    }

    /* renamed from: e */
    public final Map mo20287e() {
        return this.f16059a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mb5)) {
            return false;
        }
        mb5 mb5 = (mb5) obj;
        if (this.f16057a == mb5.f16057a && this.f16058a.equals(mb5.f16058a)) {
            return this.f16059a.equals(mb5.f16059a);
        }
        return false;
    }

    /* renamed from: f */
    public final void mo20289f(String str) {
        this.f16058a = str;
    }

    /* renamed from: g */
    public final void mo20290g(String str, Object obj) {
        if (obj == null) {
            this.f16059a.remove(str);
        } else {
            this.f16059a.put(str, obj);
        }
    }

    public final int hashCode() {
        long j = this.f16057a;
        return (((this.f16058a.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f16059a.hashCode();
    }

    public final String toString() {
        String str = this.f16058a;
        long j = this.f16057a;
        String obj = this.f16059a.toString();
        return "Event{name='" + str + "', timestamp=" + j + ", params=" + obj + "}";
    }
}
