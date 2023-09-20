package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Layout;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import com.onedelhi.secure.hl3;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class d43 implements Spannable {

    /* renamed from: a */
    public static final char f10612a = '\n';

    /* renamed from: a */
    public static final Object f10613a = new Object();
    @mj1("sLock")
    @mr2

    /* renamed from: a */
    public static Executor f10614a;
    @ts2

    /* renamed from: a */
    public final PrecomputedText f10615a;
    @mr2

    /* renamed from: a */
    public final Spannable f10616a;
    @mr2

    /* renamed from: a */
    public final C1942a f10617a;
    @mr2

    /* renamed from: a */
    public final int[] f10618a;

    /* renamed from: com.onedelhi.secure.d43$a */
    public static final class C1942a {

        /* renamed from: a */
        public final int f10619a;

        /* renamed from: a */
        public final PrecomputedText.Params f10620a;
        @ts2

        /* renamed from: a */
        public final TextDirectionHeuristic f10621a;
        @mr2

        /* renamed from: a */
        public final TextPaint f10622a;

        /* renamed from: b */
        public final int f10623b;

        /* renamed from: com.onedelhi.secure.d43$a$a */
        public static class C1943a {

            /* renamed from: a */
            public int f10624a;

            /* renamed from: a */
            public TextDirectionHeuristic f10625a;
            @mr2

            /* renamed from: a */
            public final TextPaint f10626a;

            /* renamed from: b */
            public int f10627b;

            public C1943a(@mr2 TextPaint textPaint) {
                this.f10626a = textPaint;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f10624a = 1;
                    this.f10627b = 1;
                } else {
                    this.f10627b = 0;
                    this.f10624a = 0;
                }
                this.f10625a = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }

            @mr2
            /* renamed from: a */
            public C1942a mo14517a() {
                return new C1942a(this.f10626a, this.f10625a, this.f10624a, this.f10627b);
            }

            @sj3(23)
            /* renamed from: b */
            public C1943a mo14518b(int i) {
                this.f10624a = i;
                return this;
            }

            @sj3(23)
            /* renamed from: c */
            public C1943a mo14519c(int i) {
                this.f10627b = i;
                return this;
            }

            @sj3(18)
            /* renamed from: d */
            public C1943a mo14520d(@mr2 TextDirectionHeuristic textDirectionHeuristic) {
                this.f10625a = textDirectionHeuristic;
                return this;
            }
        }

        @sj3(28)
        public C1942a(@mr2 PrecomputedText.Params params) {
            this.f10622a = params.getTextPaint();
            this.f10621a = params.getTextDirection();
            this.f10619a = params.getBreakStrategy();
            this.f10623b = params.getHyphenationFrequency();
            this.f10620a = Build.VERSION.SDK_INT < 29 ? null : params;
        }

        public C1942a(@mr2 TextPaint textPaint, @mr2 TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            this.f10620a = Build.VERSION.SDK_INT >= 29 ? new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build() : null;
            this.f10622a = textPaint;
            this.f10621a = textDirectionHeuristic;
            this.f10619a = i;
            this.f10623b = i2;
        }

        @hl3({hl3.C2354a.f13188c})
        /* renamed from: a */
        public boolean mo14509a(@mr2 C1942a aVar) {
            int i = Build.VERSION.SDK_INT;
            if ((i >= 23 && (this.f10619a != aVar.mo14510b() || this.f10623b != aVar.mo14511c())) || this.f10622a.getTextSize() != aVar.mo14513e().getTextSize() || this.f10622a.getTextScaleX() != aVar.mo14513e().getTextScaleX() || this.f10622a.getTextSkewX() != aVar.mo14513e().getTextSkewX() || this.f10622a.getLetterSpacing() != aVar.mo14513e().getLetterSpacing() || !TextUtils.equals(this.f10622a.getFontFeatureSettings(), aVar.mo14513e().getFontFeatureSettings()) || this.f10622a.getFlags() != aVar.mo14513e().getFlags()) {
                return false;
            }
            if (i >= 24) {
                if (!this.f10622a.getTextLocales().equals(aVar.mo14513e().getTextLocales())) {
                    return false;
                }
            } else if (!this.f10622a.getTextLocale().equals(aVar.mo14513e().getTextLocale())) {
                return false;
            }
            return this.f10622a.getTypeface() == null ? aVar.mo14513e().getTypeface() == null : this.f10622a.getTypeface().equals(aVar.mo14513e().getTypeface());
        }

        @sj3(23)
        /* renamed from: b */
        public int mo14510b() {
            return this.f10619a;
        }

        @sj3(23)
        /* renamed from: c */
        public int mo14511c() {
            return this.f10623b;
        }

        @sj3(18)
        @ts2
        /* renamed from: d */
        public TextDirectionHeuristic mo14512d() {
            return this.f10621a;
        }

        @mr2
        /* renamed from: e */
        public TextPaint mo14513e() {
            return this.f10622a;
        }

        public boolean equals(@ts2 Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C1942a)) {
                return false;
            }
            C1942a aVar = (C1942a) obj;
            return mo14509a(aVar) && this.f10621a == aVar.mo14512d();
        }

        public int hashCode() {
            if (Build.VERSION.SDK_INT >= 24) {
                return ot2.m24057b(Float.valueOf(this.f10622a.getTextSize()), Float.valueOf(this.f10622a.getTextScaleX()), Float.valueOf(this.f10622a.getTextSkewX()), Float.valueOf(this.f10622a.getLetterSpacing()), Integer.valueOf(this.f10622a.getFlags()), this.f10622a.getTextLocales(), this.f10622a.getTypeface(), Boolean.valueOf(this.f10622a.isElegantTextHeight()), this.f10621a, Integer.valueOf(this.f10619a), Integer.valueOf(this.f10623b));
            }
            return ot2.m24057b(Float.valueOf(this.f10622a.getTextSize()), Float.valueOf(this.f10622a.getTextScaleX()), Float.valueOf(this.f10622a.getTextSkewX()), Float.valueOf(this.f10622a.getLetterSpacing()), Integer.valueOf(this.f10622a.getFlags()), this.f10622a.getTextLocale(), this.f10622a.getTypeface(), Boolean.valueOf(this.f10622a.isElegantTextHeight()), this.f10621a, Integer.valueOf(this.f10619a), Integer.valueOf(this.f10623b));
        }

        public String toString() {
            StringBuilder sb;
            Object textLocale;
            StringBuilder sb2 = new StringBuilder(to1.f35745h);
            sb2.append("textSize=" + this.f10622a.getTextSize());
            sb2.append(", textScaleX=" + this.f10622a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f10622a.getTextSkewX());
            int i = Build.VERSION.SDK_INT;
            sb2.append(", letterSpacing=" + this.f10622a.getLetterSpacing());
            sb2.append(", elegantTextHeight=" + this.f10622a.isElegantTextHeight());
            if (i >= 24) {
                sb = new StringBuilder();
                sb.append(", textLocale=");
                textLocale = this.f10622a.getTextLocales();
            } else {
                sb = new StringBuilder();
                sb.append(", textLocale=");
                textLocale = this.f10622a.getTextLocale();
            }
            sb.append(textLocale);
            sb2.append(sb.toString());
            sb2.append(", typeface=" + this.f10622a.getTypeface());
            if (i >= 26) {
                sb2.append(", variationSettings=" + this.f10622a.getFontVariationSettings());
            }
            sb2.append(", textDir=" + this.f10621a);
            sb2.append(", breakStrategy=" + this.f10619a);
            sb2.append(", hyphenationFrequency=" + this.f10623b);
            sb2.append("}");
            return sb2.toString();
        }
    }

    /* renamed from: com.onedelhi.secure.d43$b */
    public static class C1944b extends FutureTask<d43> {

        /* renamed from: com.onedelhi.secure.d43$b$a */
        public static class C1945a implements Callable<d43> {

            /* renamed from: a */
            public C1942a f10628a;

            /* renamed from: a */
            public CharSequence f10629a;

            public C1945a(@mr2 C1942a aVar, @mr2 CharSequence charSequence) {
                this.f10628a = aVar;
                this.f10629a = charSequence;
            }

            /* renamed from: a */
            public d43 call() throws Exception {
                return d43.m12948a(this.f10629a, this.f10628a);
            }
        }

        public C1944b(@mr2 C1942a aVar, @mr2 CharSequence charSequence) {
            super(new C1945a(aVar, charSequence));
        }
    }

    @sj3(28)
    public d43(@mr2 PrecomputedText precomputedText, @mr2 C1942a aVar) {
        this.f10616a = precomputedText;
        this.f10617a = aVar;
        this.f10618a = null;
        this.f10615a = Build.VERSION.SDK_INT < 29 ? null : precomputedText;
    }

    public d43(@mr2 CharSequence charSequence, @mr2 C1942a aVar, @mr2 int[] iArr) {
        this.f10616a = new SpannableString(charSequence);
        this.f10617a = aVar;
        this.f10618a = iArr;
        this.f10615a = null;
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: a */
    public static d43 m12948a(@mr2 CharSequence charSequence, @mr2 C1942a aVar) {
        PrecomputedText.Params params;
        k43.m19455l(charSequence);
        k43.m19455l(aVar);
        try {
            cg4.m12477b("PrecomputedText");
            if (Build.VERSION.SDK_INT >= 29 && (params = aVar.f10620a) != null) {
                return new d43(PrecomputedText.create(charSequence, params), aVar);
            }
            ArrayList arrayList = new ArrayList();
            int length = charSequence.length();
            int i = 0;
            while (i < length) {
                int indexOf = TextUtils.indexOf(charSequence, 10, i, length);
                i = indexOf < 0 ? length : indexOf + 1;
                arrayList.add(Integer.valueOf(i));
            }
            int[] iArr = new int[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
            }
            if (Build.VERSION.SDK_INT >= 23) {
                StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), aVar.mo14513e(), Integer.MAX_VALUE).setBreakStrategy(aVar.mo14510b()).setHyphenationFrequency(aVar.mo14511c()).setTextDirection(aVar.mo14512d()).build();
            } else {
                new StaticLayout(charSequence, aVar.mo14513e(), Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            d43 d43 = new d43(charSequence, aVar, iArr);
            cg4.m12479d();
            return d43;
        } finally {
            cg4.m12479d();
        }
    }

    @hn4
    /* renamed from: g */
    public static Future<d43> m12949g(@mr2 CharSequence charSequence, @mr2 C1942a aVar, @ts2 Executor executor) {
        C1944b bVar = new C1944b(aVar, charSequence);
        if (executor == null) {
            synchronized (f10613a) {
                if (f10614a == null) {
                    f10614a = Executors.newFixedThreadPool(1);
                }
                executor = f10614a;
            }
        }
        executor.execute(bVar);
        return bVar;
    }

    @js1(from = 0)
    /* renamed from: b */
    public int mo14493b() {
        return Build.VERSION.SDK_INT >= 29 ? this.f10615a.getParagraphCount() : this.f10618a.length;
    }

    @js1(from = 0)
    /* renamed from: c */
    public int mo14494c(@js1(from = 0) int i) {
        k43.m19450g(i, 0, mo14493b(), "paraIndex");
        return Build.VERSION.SDK_INT >= 29 ? this.f10615a.getParagraphEnd(i) : this.f10618a[i];
    }

    public char charAt(int i) {
        return this.f10616a.charAt(i);
    }

    @js1(from = 0)
    /* renamed from: d */
    public int mo14496d(@js1(from = 0) int i) {
        k43.m19450g(i, 0, mo14493b(), "paraIndex");
        if (Build.VERSION.SDK_INT >= 29) {
            return this.f10615a.getParagraphStart(i);
        }
        if (i == 0) {
            return 0;
        }
        return this.f10618a[i - 1];
    }

    @mr2
    /* renamed from: e */
    public C1942a mo14497e() {
        return this.f10617a;
    }

    @sj3(28)
    @ts2
    @hl3({hl3.C2354a.f13188c})
    /* renamed from: f */
    public PrecomputedText mo14498f() {
        Spannable spannable = this.f10616a;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    public int getSpanEnd(Object obj) {
        return this.f10616a.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.f10616a.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        return this.f10616a.getSpanStart(obj);
    }

    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? this.f10615a.getSpans(i, i2, cls) : this.f10616a.getSpans(i, i2, cls);
    }

    public int length() {
        return this.f10616a.length();
    }

    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f10616a.nextSpanTransition(i, i2, cls);
    }

    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.f10615a.removeSpan(obj);
        } else {
            this.f10616a.removeSpan(obj);
        }
    }

    public void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.f10615a.setSpan(obj, i, i2, i3);
        } else {
            this.f10616a.setSpan(obj, i, i2, i3);
        }
    }

    public CharSequence subSequence(int i, int i2) {
        return this.f10616a.subSequence(i, i2);
    }

    @mr2
    public String toString() {
        return this.f10616a.toString();
    }
}
