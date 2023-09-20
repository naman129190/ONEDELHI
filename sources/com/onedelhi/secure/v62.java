package com.onedelhi.secure;

import android.os.LocaleList;
import java.util.Locale;

@sj3(24)
public final class v62 implements u62 {

    /* renamed from: a */
    public final LocaleList f21676a;

    public v62(Object obj) {
        this.f21676a = (LocaleList) obj;
    }

    /* renamed from: a */
    public Object mo24717a() {
        return this.f21676a;
    }

    @ts2
    /* renamed from: b */
    public Locale mo24718b(@mr2 String[] strArr) {
        return this.f21676a.getFirstMatch(strArr);
    }

    /* renamed from: c */
    public Locale mo24719c(int i) {
        return this.f21676a.get(i);
    }

    /* renamed from: d */
    public String mo24720d() {
        return this.f21676a.toLanguageTags();
    }

    /* renamed from: e */
    public int mo24721e(Locale locale) {
        return this.f21676a.indexOf(locale);
    }

    public boolean equals(Object obj) {
        return this.f21676a.equals(((u62) obj).mo24717a());
    }

    public int hashCode() {
        return this.f21676a.hashCode();
    }

    public boolean isEmpty() {
        return this.f21676a.isEmpty();
    }

    public int size() {
        return this.f21676a.size();
    }

    public String toString() {
        return this.f21676a.toString();
    }
}
