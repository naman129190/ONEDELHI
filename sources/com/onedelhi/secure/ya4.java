package com.onedelhi.secure;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.onedelhi.secure.hl3;
import java.lang.ref.WeakReference;

@hl3({hl3.C2354a.LIBRARY_GROUP})
public class ya4 {

    /* renamed from: a */
    public float f37853a;

    /* renamed from: a */
    public final TextPaint f37854a = new TextPaint(1);
    @ts2

    /* renamed from: a */
    public sa4 f37855a;

    /* renamed from: a */
    public final ua4 f37856a = new C7321a();
    @ts2

    /* renamed from: a */
    public WeakReference<C7322b> f37857a = new WeakReference<>((Object) null);

    /* renamed from: a */
    public boolean f37858a = true;

    /* renamed from: com.onedelhi.secure.ya4$a */
    public class C7321a extends ua4 {
        public C7321a() {
        }

        /* renamed from: a */
        public void mo11710a(int i) {
            boolean unused = ya4.this.f37858a = true;
            C7322b bVar = (C7322b) ya4.this.f37857a.get();
            if (bVar != null) {
                bVar.mo11839a();
            }
        }

        /* renamed from: b */
        public void mo11711b(@mr2 Typeface typeface, boolean z) {
            if (!z) {
                boolean unused = ya4.this.f37858a = true;
                C7322b bVar = (C7322b) ya4.this.f37857a.get();
                if (bVar != null) {
                    bVar.mo11839a();
                }
            }
        }
    }

    /* renamed from: com.onedelhi.secure.ya4$b */
    public interface C7322b {
        /* renamed from: a */
        void mo11839a();

        @mr2
        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public ya4(@ts2 C7322b bVar) {
        mo47669h(bVar);
    }

    /* renamed from: c */
    public final float mo47664c(@ts2 CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f37854a.measureText(charSequence, 0, charSequence.length());
    }

    @ts2
    /* renamed from: d */
    public sa4 mo47665d() {
        return this.f37855a;
    }

    @mr2
    /* renamed from: e */
    public TextPaint mo47666e() {
        return this.f37854a;
    }

    /* renamed from: f */
    public float mo47667f(String str) {
        if (!this.f37858a) {
            return this.f37853a;
        }
        float c = mo47664c(str);
        this.f37853a = c;
        this.f37858a = false;
        return c;
    }

    /* renamed from: g */
    public boolean mo47668g() {
        return this.f37858a;
    }

    /* renamed from: h */
    public void mo47669h(@ts2 C7322b bVar) {
        this.f37857a = new WeakReference<>(bVar);
    }

    /* renamed from: i */
    public void mo47670i(@ts2 sa4 sa4, Context context) {
        if (this.f37855a != sa4) {
            this.f37855a = sa4;
            if (sa4 != null) {
                sa4.mo44267o(context, this.f37854a, this.f37856a);
                C7322b bVar = (C7322b) this.f37857a.get();
                if (bVar != null) {
                    this.f37854a.drawableState = bVar.getState();
                }
                sa4.mo44266n(context, this.f37854a, this.f37856a);
                this.f37858a = true;
            }
            C7322b bVar2 = (C7322b) this.f37857a.get();
            if (bVar2 != null) {
                bVar2.mo11839a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    /* renamed from: j */
    public void mo47671j(boolean z) {
        this.f37858a = z;
    }

    /* renamed from: k */
    public void mo47672k(Context context) {
        this.f37855a.mo44266n(context, this.f37854a, this.f37856a);
    }
}
