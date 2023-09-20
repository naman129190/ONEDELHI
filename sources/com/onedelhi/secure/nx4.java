package com.onedelhi.secure;

import android.view.View;
import android.view.WindowId;

@sj3(18)
public class nx4 implements ox4 {

    /* renamed from: a */
    public final WindowId f17617a;

    public nx4(@mr2 View view) {
        this.f17617a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof nx4) && ((nx4) obj).f17617a.equals(this.f17617a);
    }

    public int hashCode() {
        return this.f17617a.hashCode();
    }
}
