package com.onedelhi.secure;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import com.onedelhi.secure.jh4;

public class jv4<R> implements jh4<R> {

    /* renamed from: a */
    public final C2577a f14574a;

    /* renamed from: com.onedelhi.secure.jv4$a */
    public interface C2577a {
        /* renamed from: a */
        Animation mo16166a(Context context);
    }

    public jv4(C2577a aVar) {
        this.f14574a = aVar;
    }

    /* renamed from: a */
    public boolean mo13290a(R r, jh4.C2520a aVar) {
        View f = aVar.mo18432f();
        if (f == null) {
            return false;
        }
        f.clearAnimation();
        f.startAnimation(this.f14574a.mo16166a(f.getContext()));
        return false;
    }
}
