package com.onedelhi.secure;

import android.graphics.Typeface;
import com.onedelhi.secure.hl3;

@hl3({hl3.C2354a.LIBRARY_GROUP})
/* renamed from: com.onedelhi.secure.fu */
public final class C5306fu extends ua4 {

    /* renamed from: a */
    public final Typeface f28647a;

    /* renamed from: a */
    public final C5307a f28648a;

    /* renamed from: a */
    public boolean f28649a;

    /* renamed from: com.onedelhi.secure.fu$a */
    public interface C5307a {
        /* renamed from: a */
        void mo36310a(Typeface typeface);
    }

    public C5306fu(C5307a aVar, Typeface typeface) {
        this.f28647a = typeface;
        this.f28648a = aVar;
    }

    /* renamed from: a */
    public void mo11710a(int i) {
        mo36309d(this.f28647a);
    }

    /* renamed from: b */
    public void mo11711b(Typeface typeface, boolean z) {
        mo36309d(typeface);
    }

    /* renamed from: c */
    public void mo36308c() {
        this.f28649a = true;
    }

    /* renamed from: d */
    public final void mo36309d(Typeface typeface) {
        if (!this.f28649a) {
            this.f28648a.mo36310a(typeface);
        }
    }
}
