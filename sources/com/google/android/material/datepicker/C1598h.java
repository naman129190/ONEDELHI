package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.onedelhi.secure.C2660ks;
import com.onedelhi.secure.C3087os;
import com.onedelhi.secure.fq4;
import com.onedelhi.secure.me0;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.xk2;
import java.util.Collection;

/* renamed from: com.google.android.material.datepicker.h */
public class C1598h extends BaseAdapter {

    /* renamed from: n */
    public static final int f8333n = fq4.m15213v().getMaximum(4);

    /* renamed from: o */
    public static final int f8334o = ((fq4.m15213v().getMaximum(5) + fq4.m15213v().getMaximum(7)) - 1);

    /* renamed from: a */
    public final C1563a f8335a;

    /* renamed from: a */
    public final me0<?> f8336a;

    /* renamed from: a */
    public C3087os f8337a;

    /* renamed from: a */
    public final xk2 f8338a;

    /* renamed from: a */
    public Collection<Long> f8339a;

    public C1598h(xk2 xk2, me0<?> me0, C1563a aVar) {
        this.f8338a = xk2;
        this.f8336a = me0;
        this.f8335a = aVar;
        this.f8339a = me0.mo18816E1();
    }

    /* renamed from: a */
    public int mo12102a(int i) {
        return mo12103b() + (i - 1);
    }

    /* renamed from: b */
    public int mo12103b() {
        return this.f8338a.mo26969r(this.f8335a.mo11995j());
    }

    @ts2
    /* renamed from: c */
    public Long getItem(int i) {
        if (i < mo12103b() || i > mo12115i()) {
            return null;
        }
        return Long.valueOf(this.f8338a.mo26970s(mo12116j(i)));
    }

    /* JADX WARNING: type inference failed for: r7v11, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0080 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0081  */
    @com.onedelhi.secure.mr2
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.widget.TextView getView(int r6, @com.onedelhi.secure.ts2 android.view.View r7, @com.onedelhi.secure.mr2 android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.mo12106e(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L_0x001e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = com.onedelhi.secure.fd3.C2161k.mtrl_calendar_day
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x001e:
            int r7 = r5.mo12103b()
            int r7 = r6 - r7
            if (r7 < 0) goto L_0x0072
            com.onedelhi.secure.xk2 r8 = r5.f8338a
            int r2 = r8.f22618q
            if (r7 < r2) goto L_0x002d
            goto L_0x0072
        L_0x002d:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r3[r1] = r4
            java.lang.String r4 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r4, r3)
            r0.setText(r8)
            com.onedelhi.secure.xk2 r8 = r5.f8338a
            long r7 = r8.mo26970s(r7)
            com.onedelhi.secure.xk2 r3 = r5.f8338a
            int r3 = r3.f22616o
            com.onedelhi.secure.xk2 r4 = com.onedelhi.secure.xk2.m31507q()
            int r4 = r4.f22616o
            if (r3 != r4) goto L_0x0064
            java.lang.String r7 = com.onedelhi.secure.ne0.m22711g(r7)
            goto L_0x0068
        L_0x0064:
            java.lang.String r7 = com.onedelhi.secure.ne0.m22716l(r7)
        L_0x0068:
            r0.setContentDescription(r7)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L_0x007a
        L_0x0072:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
        L_0x007a:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L_0x0081
            return r0
        L_0x0081:
            long r6 = r6.longValue()
            r5.mo12117k(r0, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.C1598h.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    /* renamed from: e */
    public final void mo12106e(Context context) {
        if (this.f8337a == null) {
            this.f8337a = new C3087os(context);
        }
    }

    /* renamed from: f */
    public boolean mo12107f(int i) {
        return i % this.f8338a.f22617p == 0;
    }

    /* renamed from: g */
    public boolean mo12108g(int i) {
        return (i + 1) % this.f8338a.f22617p == 0;
    }

    public int getCount() {
        return f8334o;
    }

    public long getItemId(int i) {
        return (long) (i / this.f8338a.f22617p);
    }

    /* renamed from: h */
    public final boolean mo12113h(long j) {
        for (Long longValue : this.f8336a.mo18816E1()) {
            if (fq4.m15192a(j) == fq4.m15192a(longValue.longValue())) {
                return true;
            }
        }
        return false;
    }

    public boolean hasStableIds() {
        return true;
    }

    /* renamed from: i */
    public int mo12115i() {
        return (mo12103b() + this.f8338a.f22618q) - 1;
    }

    /* renamed from: j */
    public int mo12116j(int i) {
        return (i - mo12103b()) + 1;
    }

    /* renamed from: k */
    public final void mo12117k(@ts2 TextView textView, long j) {
        C2660ks ksVar;
        if (textView != null) {
            if (this.f8335a.mo11992h().mo12013Z(j)) {
                textView.setEnabled(true);
                if (mo12113h(j)) {
                    ksVar = this.f8337a.f18086b;
                } else {
                    int i = (fq4.m15211t().getTimeInMillis() > j ? 1 : (fq4.m15211t().getTimeInMillis() == j ? 0 : -1));
                    C3087os osVar = this.f8337a;
                    ksVar = i == 0 ? osVar.f18087c : osVar.f18085a;
                }
            } else {
                textView.setEnabled(false);
                ksVar = this.f8337a.f18091g;
            }
            ksVar.mo19185f(textView);
        }
    }

    /* renamed from: l */
    public final void mo12118l(MaterialCalendarGridView materialCalendarGridView, long j) {
        if (xk2.m31506e(j).equals(this.f8338a)) {
            mo12117k((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().mo12102a(this.f8338a.mo26971t(j)) - materialCalendarGridView.getFirstVisiblePosition()), j);
        }
    }

    /* renamed from: m */
    public void mo12119m(MaterialCalendarGridView materialCalendarGridView) {
        for (Long longValue : this.f8339a) {
            mo12118l(materialCalendarGridView, longValue.longValue());
        }
        me0<?> me0 = this.f8336a;
        if (me0 != null) {
            for (Long longValue2 : me0.mo18816E1()) {
                mo12118l(materialCalendarGridView, longValue2.longValue());
            }
            this.f8339a = this.f8336a.mo18816E1();
        }
    }

    /* renamed from: n */
    public boolean mo12120n(int i) {
        return i >= mo12103b() && i <= mo12115i();
    }
}
