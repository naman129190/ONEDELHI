package com.onedelhi.secure;

import android.view.View;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class th4 {

    /* renamed from: a */
    public View f20844a;

    /* renamed from: a */
    public final ArrayList<Transition> f20845a = new ArrayList<>();

    /* renamed from: a */
    public final Map<String, Object> f20846a = new HashMap();

    @Deprecated
    public th4() {
    }

    public th4(@mr2 View view) {
        this.f20844a = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof th4)) {
            return false;
        }
        th4 th4 = (th4) obj;
        return this.f20844a == th4.f20844a && this.f20846a.equals(th4.f20846a);
    }

    public int hashCode() {
        return (this.f20844a.hashCode() * 31) + this.f20846a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f20844a + "\n") + "    values:";
        for (String next : this.f20846a.keySet()) {
            str = str + "    " + next + ": " + this.f20846a.get(next) + "\n";
        }
        return str;
    }
}
