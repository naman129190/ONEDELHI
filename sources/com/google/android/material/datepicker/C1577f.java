package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.recyclerview.widget.C0945u;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.onedelhi.secure.C1638a2;
import com.onedelhi.secure.C3087os;
import com.onedelhi.secure.C3884x1;
import com.onedelhi.secure.c23;
import com.onedelhi.secure.e64;
import com.onedelhi.secure.e83;
import com.onedelhi.secure.ev2;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.fq4;
import com.onedelhi.secure.fy2;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.hw4;
import com.onedelhi.secure.i04;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.me0;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.ue0;
import com.onedelhi.secure.xk2;
import java.util.Calendar;
import java.util.Iterator;

@hl3({hl3.C2354a.f13187b})
/* renamed from: com.google.android.material.datepicker.f */
public final class C1577f<S> extends c23<S> {
    @hw4

    /* renamed from: a */
    public static final Object f8237a = "MONTHS_VIEW_GROUP_TAG";
    @hw4

    /* renamed from: b */
    public static final Object f8238b = "NAVIGATION_PREV_TAG";

    /* renamed from: b */
    public static final String f8239b = "THEME_RES_ID_KEY";
    @hw4

    /* renamed from: c */
    public static final Object f8240c = "NAVIGATION_NEXT_TAG";

    /* renamed from: c */
    public static final String f8241c = "GRID_SELECTOR_KEY";
    @hw4

    /* renamed from: d */
    public static final Object f8242d = "SELECTOR_TOGGLE_TAG";

    /* renamed from: d */
    public static final String f8243d = "CALENDAR_CONSTRAINTS_KEY";

    /* renamed from: e */
    public static final String f8244e = "CURRENT_MONTH_KEY";

    /* renamed from: o */
    public static final int f8245o = 3;

    /* renamed from: a */
    public View f8246a;

    /* renamed from: a */
    public RecyclerView f8247a;
    @ts2

    /* renamed from: a */
    public C1563a f8248a;

    /* renamed from: a */
    public C1588k f8249a;
    @ts2

    /* renamed from: a */
    public me0<S> f8250a;

    /* renamed from: a */
    public C3087os f8251a;
    @ts2

    /* renamed from: a */
    public xk2 f8252a;

    /* renamed from: b */
    public View f8253b;

    /* renamed from: b */
    public RecyclerView f8254b;
    @e64

    /* renamed from: n */
    public int f8255n;

    /* renamed from: com.google.android.material.datepicker.f$a */
    public class C1578a implements Runnable {

        /* renamed from: n */
        public final /* synthetic */ int f8257n;

        public C1578a(int i) {
            this.f8257n = i;
        }

        public void run() {
            C1577f.this.f8254b.mo5396O1(this.f8257n);
        }
    }

    /* renamed from: com.google.android.material.datepicker.f$b */
    public class C1579b extends C3884x1 {
        public C1579b() {
        }

        /* renamed from: g */
        public void mo3893g(View view, @mr2 C1638a2 a2Var) {
            super.mo3893g(view, a2Var);
            a2Var.mo12553Y0((Object) null);
        }
    }

    /* renamed from: com.google.android.material.datepicker.f$c */
    public class C1580c extends i04 {

        /* renamed from: m */
        public final /* synthetic */ int f8260m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1580c(Context context, int i, boolean z, int i2) {
            super(context, i, z);
            this.f8260m = i2;
        }

        /* renamed from: k2 */
        public void mo5299k2(@mr2 RecyclerView.C0797c0 c0Var, @mr2 int[] iArr) {
            if (this.f8260m == 0) {
                iArr[0] = C1577f.this.f8254b.getWidth();
                iArr[1] = C1577f.this.f8254b.getWidth();
                return;
            }
            iArr[0] = C1577f.this.f8254b.getHeight();
            iArr[1] = C1577f.this.f8254b.getHeight();
        }
    }

    /* renamed from: com.google.android.material.datepicker.f$d */
    public class C1581d implements C1589l {
        public C1581d() {
        }

        /* renamed from: a */
        public void mo12059a(long j) {
            if (C1577f.this.f8248a.mo11992h().mo12013Z(j)) {
                C1577f.this.f8250a.mo18819U1(j);
                Iterator it = C1577f.this.f10083a.iterator();
                while (it.hasNext()) {
                    ((ev2) it.next()).mo12088b(C1577f.this.f8250a.mo18815A());
                }
                C1577f.this.f8254b.getAdapter().mo5717m();
                if (C1577f.this.f8247a != null) {
                    C1577f.this.f8247a.getAdapter().mo5717m();
                }
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.f$e */
    public class C1582e extends RecyclerView.C0818o {

        /* renamed from: a */
        public final Calendar f8263a = fq4.m15213v();

        /* renamed from: b */
        public final Calendar f8264b = fq4.m15213v();

        public C1582e() {
        }

        /* renamed from: i */
        public void mo5783i(@mr2 Canvas canvas, @mr2 RecyclerView recyclerView, @mr2 RecyclerView.C0797c0 c0Var) {
            if ((recyclerView.getAdapter() instanceof C1602j) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                C1602j jVar = (C1602j) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (fy2 next : C1577f.this.f8250a.mo18820V1()) {
                    F f = next.f12385a;
                    if (!(f == null || next.f12386b == null)) {
                        this.f8263a.setTimeInMillis(((Long) f).longValue());
                        this.f8264b.setTimeInMillis(((Long) next.f12386b).longValue());
                        int L = jVar.mo12128L(this.f8263a.get(1));
                        int L2 = jVar.mo12128L(this.f8264b.get(1));
                        View J = gridLayoutManager.mo5266J(L);
                        View J2 = gridLayoutManager.mo5266J(L2);
                        int D3 = L / gridLayoutManager.mo5197D3();
                        int D32 = L2 / gridLayoutManager.mo5197D3();
                        int i = D3;
                        while (i <= D32) {
                            View J3 = gridLayoutManager.mo5266J(gridLayoutManager.mo5197D3() * i);
                            if (J3 != null) {
                                canvas.drawRect((float) (i == D3 ? J.getLeft() + (J.getWidth() / 2) : 0), (float) (J3.getTop() + C1577f.this.f8251a.f18088d.mo19184e()), (float) (i == D32 ? J2.getLeft() + (J2.getWidth() / 2) : recyclerView.getWidth()), (float) (J3.getBottom() - C1577f.this.f8251a.f18088d.mo19181b()), C1577f.this.f8251a.f18084a);
                            }
                            i++;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.f$f */
    public class C1583f extends C3884x1 {
        public C1583f() {
        }

        /* renamed from: g */
        public void mo3893g(View view, @mr2 C1638a2 a2Var) {
            C1577f fVar;
            int i;
            super.mo3893g(view, a2Var);
            if (C1577f.this.f8253b.getVisibility() == 0) {
                fVar = C1577f.this;
                i = fd3.C2163m.mtrl_picker_toggle_to_year_selection;
            } else {
                fVar = C1577f.this;
                i = fd3.C2163m.mtrl_picker_toggle_to_day_selection;
            }
            a2Var.mo12593l1(fVar.getString(i));
        }
    }

    /* renamed from: com.google.android.material.datepicker.f$g */
    public class C1584g extends RecyclerView.C0827t {

        /* renamed from: a */
        public final /* synthetic */ MaterialButton f8266a;

        /* renamed from: a */
        public final /* synthetic */ C1599i f8268a;

        public C1584g(C1599i iVar, MaterialButton materialButton) {
            this.f8268a = iVar;
            this.f8266a = materialButton;
        }

        /* renamed from: a */
        public void mo5915a(@mr2 RecyclerView recyclerView, int i) {
            if (i == 0) {
                recyclerView.announceForAccessibility(this.f8266a.getText());
            }
        }

        /* renamed from: b */
        public void mo5916b(@mr2 RecyclerView recyclerView, int i, int i2) {
            LinearLayoutManager U = C1577f.this.mo12051U();
            int x2 = i < 0 ? U.mo5328x2() : U.mo5257A2();
            xk2 unused = C1577f.this.f8252a = this.f8268a.mo12121K(x2);
            this.f8266a.setText(this.f8268a.mo12122L(x2));
        }
    }

    /* renamed from: com.google.android.material.datepicker.f$h */
    public class C1585h implements View.OnClickListener {
        public C1585h() {
        }

        public void onClick(View view) {
            C1577f.this.mo12055a0();
        }
    }

    /* renamed from: com.google.android.material.datepicker.f$i */
    public class C1586i implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ C1599i f8271a;

        public C1586i(C1599i iVar) {
            this.f8271a = iVar;
        }

        public void onClick(View view) {
            int x2 = C1577f.this.mo12051U().mo5328x2() + 1;
            if (x2 < C1577f.this.f8254b.getAdapter().mo5711g()) {
                C1577f.this.mo12053Y(this.f8271a.mo12121K(x2));
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.f$j */
    public class C1587j implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ C1599i f8273a;

        public C1587j(C1599i iVar) {
            this.f8273a = iVar;
        }

        public void onClick(View view) {
            int A2 = C1577f.this.mo12051U().mo5257A2() - 1;
            if (A2 >= 0) {
                C1577f.this.mo12053Y(this.f8273a.mo12121K(A2));
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.f$k */
    public enum C1588k {
        DAY,
        YEAR
    }

    /* renamed from: com.google.android.material.datepicker.f$l */
    public interface C1589l {
        /* renamed from: a */
        void mo12059a(long j);
    }

    @e83
    /* renamed from: S */
    public static int m10146S(@mr2 Context context) {
        return context.getResources().getDimensionPixelSize(fd3.C2156f.mtrl_calendar_day_height);
    }

    /* renamed from: T */
    public static int m10147T(@mr2 Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(fd3.C2156f.mtrl_calendar_navigation_height) + resources.getDimensionPixelOffset(fd3.C2156f.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelOffset(fd3.C2156f.mtrl_calendar_navigation_bottom_padding);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(fd3.C2156f.mtrl_calendar_days_of_week_height);
        int i = C1598h.f8333n;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(fd3.C2156f.mtrl_calendar_day_height) * i) + ((i - 1) * resources.getDimensionPixelOffset(fd3.C2156f.mtrl_calendar_month_vertical_padding)) + resources.getDimensionPixelOffset(fd3.C2156f.mtrl_calendar_bottom_padding);
    }

    @mr2
    /* renamed from: W */
    public static <T> C1577f<T> m10148W(@mr2 me0<T> me0, @e64 int i, @mr2 C1563a aVar) {
        C1577f<T> fVar = new C1577f<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable(f8241c, me0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable(f8244e, aVar.mo11997m());
        fVar.setArguments(bundle);
        return fVar;
    }

    /* renamed from: N */
    public final void mo12046N(@mr2 View view, @mr2 C1599i iVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(fd3.C2158h.month_navigation_fragment_toggle);
        materialButton.setTag(f8242d);
        jt4.m18849B1(materialButton, new C1583f());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(fd3.C2158h.month_navigation_previous);
        materialButton2.setTag(f8238b);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(fd3.C2158h.month_navigation_next);
        materialButton3.setTag(f8240c);
        this.f8246a = view.findViewById(fd3.C2158h.mtrl_calendar_year_selector_frame);
        this.f8253b = view.findViewById(fd3.C2158h.mtrl_calendar_day_selector_frame);
        mo12054Z(C1588k.DAY);
        materialButton.setText(this.f8252a.mo26972u());
        this.f8254b.mo5506r(new C1584g(iVar, materialButton));
        materialButton.setOnClickListener(new C1585h());
        materialButton3.setOnClickListener(new C1586i(iVar));
        materialButton2.setOnClickListener(new C1587j(iVar));
    }

    @mr2
    /* renamed from: O */
    public final RecyclerView.C0818o mo12047O() {
        return new C1582e();
    }

    @ts2
    /* renamed from: P */
    public C1563a mo12048P() {
        return this.f8248a;
    }

    /* renamed from: Q */
    public C3087os mo12049Q() {
        return this.f8251a;
    }

    @ts2
    /* renamed from: R */
    public xk2 mo12050R() {
        return this.f8252a;
    }

    @mr2
    /* renamed from: U */
    public LinearLayoutManager mo12051U() {
        return (LinearLayoutManager) this.f8254b.getLayoutManager();
    }

    /* renamed from: X */
    public final void mo12052X(int i) {
        this.f8254b.post(new C1578a(i));
    }

    /* renamed from: Y */
    public void mo12053Y(xk2 xk2) {
        RecyclerView recyclerView;
        int i;
        C1599i iVar = (C1599i) this.f8254b.getAdapter();
        int M = iVar.mo12123M(xk2);
        int M2 = M - iVar.mo12123M(this.f8252a);
        boolean z = true;
        boolean z2 = Math.abs(M2) > 3;
        if (M2 <= 0) {
            z = false;
        }
        this.f8252a = xk2;
        if (!z2 || !z) {
            if (z2) {
                recyclerView = this.f8254b;
                i = M + 3;
            }
            mo12052X(M);
        }
        recyclerView = this.f8254b;
        i = M - 3;
        recyclerView.mo5372G1(i);
        mo12052X(M);
    }

    /* renamed from: Z */
    public void mo12054Z(C1588k kVar) {
        this.f8249a = kVar;
        if (kVar == C1588k.YEAR) {
            this.f8247a.getLayoutManager().mo5275R1(((C1602j) this.f8247a.getAdapter()).mo12128L(this.f8252a.f22616o));
            this.f8246a.setVisibility(0);
            this.f8253b.setVisibility(8);
        } else if (kVar == C1588k.DAY) {
            this.f8246a.setVisibility(8);
            this.f8253b.setVisibility(0);
            mo12053Y(this.f8252a);
        }
    }

    /* renamed from: a0 */
    public void mo12055a0() {
        C1588k kVar = this.f8249a;
        C1588k kVar2 = C1588k.YEAR;
        if (kVar == kVar2) {
            mo12054Z(C1588k.DAY);
        } else if (kVar == C1588k.DAY) {
            mo12054Z(kVar2);
        }
    }

    public void onCreate(@ts2 Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f8255n = bundle.getInt("THEME_RES_ID_KEY");
        this.f8250a = (me0) bundle.getParcelable(f8241c);
        this.f8248a = (C1563a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f8252a = (xk2) bundle.getParcelable(f8244e);
    }

    @mr2
    public View onCreateView(@mr2 LayoutInflater layoutInflater, @ts2 ViewGroup viewGroup, @ts2 Bundle bundle) {
        int i;
        int i2;
        ue0 ue0;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f8255n);
        this.f8251a = new C3087os(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        xk2 n = this.f8248a.mo11998n();
        if (C1590g.m10177d0(contextThemeWrapper)) {
            i2 = fd3.C2161k.mtrl_calendar_vertical;
            i = 1;
        } else {
            i2 = fd3.C2161k.mtrl_calendar_horizontal;
            i = 0;
        }
        View inflate = cloneInContext.inflate(i2, viewGroup, false);
        inflate.setMinimumHeight(m10147T(requireContext()));
        GridView gridView = (GridView) inflate.findViewById(fd3.C2158h.mtrl_calendar_days_of_week);
        jt4.m18849B1(gridView, new C1579b());
        int j = this.f8248a.mo11995j();
        if (j <= 0) {
            ue0 = new ue0();
        }
        gridView.setAdapter(ue0);
        gridView.setNumColumns(n.f22617p);
        gridView.setEnabled(false);
        this.f8254b = (RecyclerView) inflate.findViewById(fd3.C2158h.mtrl_calendar_months);
        this.f8254b.setLayoutManager(new C1580c(getContext(), i, false, i));
        this.f8254b.setTag(f8237a);
        C1599i iVar = new C1599i(contextThemeWrapper, this.f8250a, this.f8248a, new C1581d());
        this.f8254b.setAdapter(iVar);
        int integer = contextThemeWrapper.getResources().getInteger(fd3.C2159i.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(fd3.C2158h.mtrl_calendar_year_selector_frame);
        this.f8247a = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f8247a.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f8247a.setAdapter(new C1602j(this));
            this.f8247a.mo5482n(mo12047O());
        }
        if (inflate.findViewById(fd3.C2158h.month_navigation_fragment_toggle) != null) {
            mo12046N(inflate, iVar);
        }
        if (!C1590g.m10177d0(contextThemeWrapper)) {
            new C0945u().mo6554b(this.f8254b);
        }
        this.f8254b.mo5372G1(iVar.mo12123M(this.f8252a));
        return inflate;
    }

    public void onSaveInstanceState(@mr2 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f8255n);
        bundle.putParcelable(f8241c, this.f8250a);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f8248a);
        bundle.putParcelable(f8244e, this.f8252a);
    }

    /* renamed from: q */
    public boolean mo12056q(@mr2 ev2<S> ev2) {
        return super.mo12056q(ev2);
    }

    @ts2
    /* renamed from: s */
    public me0<S> mo12057s() {
        return this.f8250a;
    }
}
