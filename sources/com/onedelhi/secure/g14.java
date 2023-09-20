package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import com.onedelhi.secure.hl3;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@hl3({hl3.C2354a.f13187b})
public final class g14 extends SpannableStringBuilder {
    @mr2

    /* renamed from: a */
    public final Class<?> f12390a;
    @mr2

    /* renamed from: a */
    public final List<C2210a> f12391a = new ArrayList();

    /* renamed from: com.onedelhi.secure.g14$a */
    public static class C2210a implements TextWatcher, SpanWatcher {

        /* renamed from: a */
        public final Object f12392a;

        /* renamed from: a */
        public final AtomicInteger f12393a = new AtomicInteger(0);

        public C2210a(Object obj) {
            this.f12392a = obj;
        }

        /* renamed from: a */
        public final void mo16270a() {
            this.f12393a.incrementAndGet();
        }

        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f12392a).afterTextChanged(editable);
        }

        /* renamed from: b */
        public final boolean mo16272b(Object obj) {
            return obj instanceof ys0;
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f12392a).beforeTextChanged(charSequence, i, i2, i3);
        }

        /* renamed from: c */
        public final void mo16274c() {
            this.f12393a.decrementAndGet();
        }

        public void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
            if (this.f12393a.get() <= 0 || !mo16272b(obj)) {
                ((SpanWatcher) this.f12392a).onSpanAdded(spannable, obj, i, i2);
            }
        }

        public void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            if (this.f12393a.get() <= 0 || !mo16272b(obj)) {
                if (Build.VERSION.SDK_INT < 28) {
                    int i7 = i > i2 ? 0 : i;
                    if (i3 > i4) {
                        i6 = i7;
                        i5 = 0;
                    } else {
                        i5 = i3;
                        i6 = i7;
                    }
                } else {
                    i6 = i;
                    i5 = i3;
                }
                ((SpanWatcher) this.f12392a).onSpanChanged(spannable, obj, i6, i2, i5, i4);
            }
        }

        public void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
            if (this.f12393a.get() <= 0 || !mo16272b(obj)) {
                ((SpanWatcher) this.f12392a).onSpanRemoved(spannable, obj, i, i2);
            }
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f12392a).onTextChanged(charSequence, i, i2, i3);
        }
    }

    @hl3({hl3.C2354a.f13185a})
    public g14(@mr2 Class<?> cls) {
        k43.m19456m(cls, "watcherClass cannot be null");
        this.f12390a = cls;
    }

    @hl3({hl3.C2354a.f13185a})
    public g14(@mr2 Class<?> cls, @mr2 CharSequence charSequence) {
        super(charSequence);
        k43.m19456m(cls, "watcherClass cannot be null");
        this.f12390a = cls;
    }

    @hl3({hl3.C2354a.f13185a})
    public g14(@mr2 Class<?> cls, @mr2 CharSequence charSequence, int i, int i2) {
        super(charSequence, i, i2);
        k43.m19456m(cls, "watcherClass cannot be null");
        this.f12390a = cls;
    }

    @mr2
    @hl3({hl3.C2354a.f13187b})
    /* renamed from: c */
    public static g14 m15436c(@mr2 Class<?> cls, @mr2 CharSequence charSequence) {
        return new g14(cls, charSequence);
    }

    @hl3({hl3.C2354a.f13185a})
    /* renamed from: a */
    public void mo16245a() {
        mo16250b();
    }

    @mr2
    public SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    @mr2
    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @mr2
    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }

    /* renamed from: b */
    public final void mo16250b() {
        for (int i = 0; i < this.f12391a.size(); i++) {
            this.f12391a.get(i).mo16270a();
        }
    }

    @hl3({hl3.C2354a.f13185a})
    /* renamed from: d */
    public void mo16251d() {
        mo16261i();
        mo16253e();
    }

    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    /* renamed from: e */
    public final void mo16253e() {
        for (int i = 0; i < this.f12391a.size(); i++) {
            this.f12391a.get(i).onTextChanged(this, 0, length(), length());
        }
    }

    /* renamed from: f */
    public final C2210a mo16254f(Object obj) {
        for (int i = 0; i < this.f12391a.size(); i++) {
            C2210a aVar = this.f12391a.get(i);
            if (aVar.f12392a == obj) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: g */
    public final boolean mo16255g(@mr2 Class<?> cls) {
        return this.f12390a == cls;
    }

    public int getSpanEnd(@ts2 Object obj) {
        C2210a f;
        if (mo16260h(obj) && (f = mo16254f(obj)) != null) {
            obj = f;
        }
        return super.getSpanEnd(obj);
    }

    public int getSpanFlags(@ts2 Object obj) {
        C2210a f;
        if (mo16260h(obj) && (f = mo16254f(obj)) != null) {
            obj = f;
        }
        return super.getSpanFlags(obj);
    }

    public int getSpanStart(@ts2 Object obj) {
        C2210a f;
        if (mo16260h(obj) && (f = mo16254f(obj)) != null) {
            obj = f;
        }
        return super.getSpanStart(obj);
    }

    @SuppressLint({"UnknownNullness"})
    public <T> T[] getSpans(int i, int i2, @mr2 Class<T> cls) {
        if (!mo16255g(cls)) {
            return super.getSpans(i, i2, cls);
        }
        C2210a[] aVarArr = (C2210a[]) super.getSpans(i, i2, C2210a.class);
        T[] tArr = (Object[]) Array.newInstance(cls, aVarArr.length);
        for (int i3 = 0; i3 < aVarArr.length; i3++) {
            tArr[i3] = aVarArr[i3].f12392a;
        }
        return tArr;
    }

    /* renamed from: h */
    public final boolean mo16260h(@ts2 Object obj) {
        return obj != null && mo16255g(obj.getClass());
    }

    /* renamed from: i */
    public final void mo16261i() {
        for (int i = 0; i < this.f12391a.size(); i++) {
            this.f12391a.get(i).mo16274c();
        }
    }

    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    public int nextSpanTransition(int i, int i2, @ts2 Class<C2210a> cls) {
        if (cls == null || mo16255g(cls)) {
            cls = C2210a.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    public void removeSpan(@ts2 Object obj) {
        C2210a aVar;
        if (mo16260h(obj)) {
            aVar = mo16254f(obj);
            if (aVar != null) {
                obj = aVar;
            }
        } else {
            aVar = null;
        }
        super.removeSpan(obj);
        if (aVar != null) {
            this.f12391a.remove(aVar);
        }
    }

    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        mo16250b();
        super.replace(i, i2, charSequence);
        mo16261i();
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        mo16250b();
        super.replace(i, i2, charSequence, i3, i4);
        mo16261i();
        return this;
    }

    public void setSpan(@ts2 Object obj, int i, int i2, int i3) {
        if (mo16260h(obj)) {
            C2210a aVar = new C2210a(obj);
            this.f12391a.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @SuppressLint({"UnknownNullness"})
    public CharSequence subSequence(int i, int i2) {
        return new g14(this.f12390a, this, i, i2);
    }
}
