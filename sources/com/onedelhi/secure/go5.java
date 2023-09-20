package com.onedelhi.secure;

import java.util.Arrays;

public final class go5 extends mo5 {

    /* renamed from: b */
    public final String f12686b;

    public go5(String str) {
        this.f12686b = str;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        mo5 mo5 = (mo5) obj;
        mo5.mo16758d();
        String str = this.f12686b;
        int length = str.length();
        String str2 = ((go5) mo5).f12686b;
        return length != str2.length() ? str.length() - str2.length() : str.compareTo(str2);
    }

    /* renamed from: d */
    public final int mo16758d() {
        return 3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && go5.class == obj.getClass()) {
            return this.f12686b.equals(((go5) obj).f12686b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{3, this.f12686b});
    }

    public final String toString() {
        String str = this.f12686b;
        return "\"" + str + "\"";
    }
}
