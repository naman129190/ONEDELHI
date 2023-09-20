package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.C0657l;
import com.google.android.material.datepicker.C1563a;
import com.google.android.material.internal.CheckableImageButton;
import com.onedelhi.secure.C3129p8;
import com.onedelhi.secure.C3884x1;
import com.onedelhi.secure.as0;
import com.onedelhi.secure.bf2;
import com.onedelhi.secure.c23;
import com.onedelhi.secure.e54;
import com.onedelhi.secure.e64;
import com.onedelhi.secure.ev2;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.fq4;
import com.onedelhi.secure.fr1;
import com.onedelhi.secure.fy2;
import com.onedelhi.secure.gf2;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.je2;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.ju2;
import com.onedelhi.secure.jz3;
import com.onedelhi.secure.me0;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.pv4;
import com.onedelhi.secure.re3;
import com.onedelhi.secure.sx4;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.wk0;
import com.onedelhi.secure.xk2;
import com.onedelhi.secure.ze2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: com.google.android.material.datepicker.g */
public final class C1590g<S> extends wk0 {

    /* renamed from: a */
    public static final Object f8277a = "CONFIRM_BUTTON_TAG";

    /* renamed from: b */
    public static final Object f8278b = "CANCEL_BUTTON_TAG";

    /* renamed from: b */
    public static final String f8279b = "OVERRIDE_THEME_RES_ID";

    /* renamed from: c */
    public static final Object f8280c = "TOGGLE_BUTTON_TAG";

    /* renamed from: c */
    public static final String f8281c = "DATE_SELECTOR_KEY";

    /* renamed from: d */
    public static final String f8282d = "CALENDAR_CONSTRAINTS_KEY";

    /* renamed from: e */
    public static final String f8283e = "TITLE_TEXT_RES_ID_KEY";

    /* renamed from: f */
    public static final String f8284f = "TITLE_TEXT_KEY";

    /* renamed from: g */
    public static final String f8285g = "POSITIVE_BUTTON_TEXT_RES_ID_KEY";

    /* renamed from: h */
    public static final String f8286h = "POSITIVE_BUTTON_TEXT_KEY";

    /* renamed from: i */
    public static final String f8287i = "NEGATIVE_BUTTON_TEXT_RES_ID_KEY";

    /* renamed from: j */
    public static final String f8288j = "NEGATIVE_BUTTON_TEXT_KEY";

    /* renamed from: k */
    public static final String f8289k = "INPUT_MODE_KEY";

    /* renamed from: s */
    public static final int f8290s = 0;

    /* renamed from: t */
    public static final int f8291t = 1;

    /* renamed from: a */
    public Button f8292a;

    /* renamed from: a */
    public TextView f8293a;
    @ts2

    /* renamed from: a */
    public C1563a f8294a;

    /* renamed from: a */
    public C1577f<S> f8295a;

    /* renamed from: a */
    public CheckableImageButton f8296a;
    @ts2

    /* renamed from: a */
    public bf2 f8297a;

    /* renamed from: a */
    public c23<S> f8298a;
    @ts2

    /* renamed from: a */
    public me0<S> f8299a;

    /* renamed from: a */
    public CharSequence f8300a;

    /* renamed from: a */
    public final LinkedHashSet<ze2<? super S>> f8301a = new LinkedHashSet<>();

    /* renamed from: b */
    public CharSequence f8302b;

    /* renamed from: b */
    public final LinkedHashSet<View.OnClickListener> f8303b = new LinkedHashSet<>();

    /* renamed from: b */
    public boolean f8304b;

    /* renamed from: c */
    public CharSequence f8305c;

    /* renamed from: c */
    public final LinkedHashSet<DialogInterface.OnCancelListener> f8306c = new LinkedHashSet<>();

    /* renamed from: c */
    public boolean f8307c;

    /* renamed from: d */
    public final LinkedHashSet<DialogInterface.OnDismissListener> f8308d = new LinkedHashSet<>();
    @e64

    /* renamed from: n */
    public int f8309n;
    @e54

    /* renamed from: o */
    public int f8310o;

    /* renamed from: p */
    public int f8311p;
    @e54

    /* renamed from: q */
    public int f8312q;
    @e54

    /* renamed from: r */
    public int f8313r;

    /* renamed from: com.google.android.material.datepicker.g$a */
    public class C1591a implements View.OnClickListener {
        public C1591a() {
        }

        public void onClick(View view) {
            Iterator it = C1590g.this.f8301a.iterator();
            while (it.hasNext()) {
                ((ze2) it.next()).mo27958a(C1590g.this.mo12074a0());
            }
            C1590g.this.dismiss();
        }
    }

    /* renamed from: com.google.android.material.datepicker.g$b */
    public class C1592b implements View.OnClickListener {
        public C1592b() {
        }

        public void onClick(View view) {
            Iterator it = C1590g.this.f8303b.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            C1590g.this.dismiss();
        }
    }

    /* renamed from: com.google.android.material.datepicker.g$c */
    public class C1593c implements ju2 {

        /* renamed from: a */
        public final /* synthetic */ int f8316a;

        /* renamed from: a */
        public final /* synthetic */ View f8317a;

        /* renamed from: b */
        public final /* synthetic */ int f8319b;

        public C1593c(int i, View view, int i2) {
            this.f8316a = i;
            this.f8317a = view;
            this.f8319b = i2;
        }

        /* renamed from: a */
        public sx4 mo1063a(View view, sx4 sx4) {
            int i = sx4.mo24592f(sx4.C3559m.m28015i()).f12723b;
            if (this.f8316a >= 0) {
                this.f8317a.getLayoutParams().height = this.f8316a + i;
                View view2 = this.f8317a;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            View view3 = this.f8317a;
            view3.setPadding(view3.getPaddingLeft(), this.f8319b + i, this.f8317a.getPaddingRight(), this.f8317a.getPaddingBottom());
            return sx4;
        }
    }

    /* renamed from: com.google.android.material.datepicker.g$d */
    public class C1594d extends ev2<S> {
        public C1594d() {
        }

        /* renamed from: a */
        public void mo12087a() {
            C1590g.this.f8292a.setEnabled(false);
        }

        /* renamed from: b */
        public void mo12088b(S s) {
            C1590g.this.mo12082o0();
            C1590g.this.f8292a.setEnabled(C1590g.this.mo12072X().mo18817E2());
        }
    }

    /* renamed from: com.google.android.material.datepicker.g$e */
    public class C1595e implements View.OnClickListener {
        public C1595e() {
        }

        public void onClick(View view) {
            C1590g.this.f8292a.setEnabled(C1590g.this.mo12072X().mo18817E2());
            C1590g.this.f8296a.toggle();
            C1590g gVar = C1590g.this;
            gVar.mo12084p0(gVar.f8296a);
            C1590g.this.mo12081l0();
        }
    }

    /* renamed from: com.google.android.material.datepicker.g$f */
    public static final class C1596f<S> {

        /* renamed from: a */
        public int f8322a = 0;

        /* renamed from: a */
        public C1563a f8323a;

        /* renamed from: a */
        public final me0<S> f8324a;

        /* renamed from: a */
        public CharSequence f8325a = null;
        @ts2

        /* renamed from: a */
        public S f8326a = null;

        /* renamed from: b */
        public int f8327b = 0;

        /* renamed from: b */
        public CharSequence f8328b = null;

        /* renamed from: c */
        public int f8329c = 0;

        /* renamed from: c */
        public CharSequence f8330c = null;

        /* renamed from: d */
        public int f8331d = 0;

        /* renamed from: e */
        public int f8332e = 0;

        public C1596f(me0<S> me0) {
            this.f8324a = me0;
        }

        @mr2
        @hl3({hl3.C2354a.f13187b})
        /* renamed from: c */
        public static <S> C1596f<S> m10210c(@mr2 me0<S> me0) {
            return new C1596f<>(me0);
        }

        @mr2
        /* renamed from: d */
        public static C1596f<Long> m10211d() {
            return new C1596f<>(new jz3());
        }

        @mr2
        /* renamed from: e */
        public static C1596f<fy2<Long, Long>> m10212e() {
            return new C1596f<>(new re3());
        }

        /* renamed from: f */
        public static boolean m10213f(xk2 xk2, C1563a aVar) {
            return xk2.compareTo(aVar.mo11998n()) >= 0 && xk2.compareTo(aVar.mo11994i()) <= 0;
        }

        @mr2
        /* renamed from: a */
        public C1590g<S> mo12090a() {
            if (this.f8323a == null) {
                this.f8323a = new C1563a.C1565b().mo12007a();
            }
            if (this.f8327b == 0) {
                this.f8327b = this.f8324a.mo18825g();
            }
            S s = this.f8326a;
            if (s != null) {
                this.f8324a.mo18827l(s);
            }
            if (this.f8323a.mo11997m() == null) {
                this.f8323a.mo12001q(mo12091b());
            }
            return C1590g.m10179f0(this);
        }

        /* renamed from: b */
        public final xk2 mo12091b() {
            if (!this.f8324a.mo18816E1().isEmpty()) {
                xk2 e = xk2.m31506e(this.f8324a.mo18816E1().iterator().next().longValue());
                if (m10213f(e, this.f8323a)) {
                    return e;
                }
            }
            xk2 q = xk2.m31507q();
            return m10213f(q, this.f8323a) ? q : this.f8323a.mo11998n();
        }

        @mr2
        /* renamed from: g */
        public C1596f<S> mo12092g(C1563a aVar) {
            this.f8323a = aVar;
            return this;
        }

        @mr2
        /* renamed from: h */
        public C1596f<S> mo12093h(int i) {
            this.f8332e = i;
            return this;
        }

        @mr2
        /* renamed from: i */
        public C1596f<S> mo12094i(@e54 int i) {
            this.f8331d = i;
            this.f8330c = null;
            return this;
        }

        @mr2
        /* renamed from: j */
        public C1596f<S> mo12095j(@ts2 CharSequence charSequence) {
            this.f8330c = charSequence;
            this.f8331d = 0;
            return this;
        }

        @mr2
        /* renamed from: k */
        public C1596f<S> mo12096k(@e54 int i) {
            this.f8329c = i;
            this.f8328b = null;
            return this;
        }

        @mr2
        /* renamed from: l */
        public C1596f<S> mo12097l(@ts2 CharSequence charSequence) {
            this.f8328b = charSequence;
            this.f8329c = 0;
            return this;
        }

        @mr2
        /* renamed from: m */
        public C1596f<S> mo12098m(S s) {
            this.f8326a = s;
            return this;
        }

        @mr2
        /* renamed from: n */
        public C1596f<S> mo12099n(@e64 int i) {
            this.f8322a = i;
            return this;
        }

        @mr2
        /* renamed from: o */
        public C1596f<S> mo12100o(@e54 int i) {
            this.f8327b = i;
            this.f8325a = null;
            return this;
        }

        @mr2
        /* renamed from: p */
        public C1596f<S> mo12101p(@ts2 CharSequence charSequence) {
            this.f8325a = charSequence;
            this.f8327b = 0;
            return this;
        }
    }

    @hl3({hl3.C2354a.f13187b})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.datepicker.g$g */
    public @interface C1597g {
    }

    @mr2
    /* renamed from: U */
    public static Drawable m10175U(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, C3129p8.m24529b(context, fd3.C2157g.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], C3129p8.m24529b(context, fd3.C2157g.material_ic_edit_black_24dp));
        return stateListDrawable;
    }

    /* renamed from: Z */
    public static int m10176Z(@mr2 Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(fd3.C2156f.mtrl_calendar_content_padding);
        int i = xk2.m31507q().f22617p;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(fd3.C2156f.mtrl_calendar_day_width) * i) + ((i - 1) * resources.getDimensionPixelOffset(fd3.C2156f.mtrl_calendar_month_horizontal_padding));
    }

    /* renamed from: d0 */
    public static boolean m10177d0(@mr2 Context context) {
        return m10180g0(context, 16843277);
    }

    /* renamed from: e0 */
    public static boolean m10178e0(@mr2 Context context) {
        return m10180g0(context, fd3.C2153c.nestedScrollable);
    }

    @mr2
    /* renamed from: f0 */
    public static <S> C1590g<S> m10179f0(@mr2 C1596f<S> fVar) {
        C1590g<S> gVar = new C1590g<>();
        Bundle bundle = new Bundle();
        bundle.putInt(f8279b, fVar.f8322a);
        bundle.putParcelable("DATE_SELECTOR_KEY", fVar.f8324a);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", fVar.f8323a);
        bundle.putInt(f8283e, fVar.f8327b);
        bundle.putCharSequence(f8284f, fVar.f8325a);
        bundle.putInt(f8289k, fVar.f8332e);
        bundle.putInt(f8285g, fVar.f8329c);
        bundle.putCharSequence(f8286h, fVar.f8328b);
        bundle.putInt(f8287i, fVar.f8331d);
        bundle.putCharSequence(f8288j, fVar.f8330c);
        gVar.setArguments(bundle);
        return gVar;
    }

    /* renamed from: g0 */
    public static boolean m10180g0(@mr2 Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(je2.m53278g(context, fd3.C2153c.materialCalendarStyle, C1577f.class.getCanonicalName()), new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    /* renamed from: m0 */
    public static long m10181m0() {
        return xk2.m31507q().f22613b;
    }

    /* renamed from: n0 */
    public static long m10182n0() {
        return fq4.m15211t().getTimeInMillis();
    }

    /* renamed from: L */
    public boolean mo12063L(DialogInterface.OnCancelListener onCancelListener) {
        return this.f8306c.add(onCancelListener);
    }

    /* renamed from: N */
    public boolean mo12064N(DialogInterface.OnDismissListener onDismissListener) {
        return this.f8308d.add(onDismissListener);
    }

    /* renamed from: O */
    public boolean mo12065O(View.OnClickListener onClickListener) {
        return this.f8303b.add(onClickListener);
    }

    /* renamed from: P */
    public boolean mo12066P(ze2<? super S> ze2) {
        return this.f8301a.add(ze2);
    }

    /* renamed from: Q */
    public void mo12067Q() {
        this.f8306c.clear();
    }

    /* renamed from: R */
    public void mo12068R() {
        this.f8308d.clear();
    }

    /* renamed from: S */
    public void mo12069S() {
        this.f8303b.clear();
    }

    /* renamed from: T */
    public void mo12070T() {
        this.f8301a.clear();
    }

    /* renamed from: W */
    public final void mo12071W(Window window) {
        if (!this.f8307c) {
            View findViewById = requireView().findViewById(fd3.C2158h.fullscreen_header);
            as0.m39030b(window, true, pv4.m61666f(findViewById), (Integer) null);
            jt4.m18934a2(findViewById, new C1593c(findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingTop()));
            this.f8307c = true;
        }
    }

    /* renamed from: X */
    public final me0<S> mo12072X() {
        if (this.f8299a == null) {
            this.f8299a = (me0) getArguments().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f8299a;
    }

    /* renamed from: Y */
    public String mo12073Y() {
        return mo12072X().mo18826h1(getContext());
    }

    @ts2
    /* renamed from: a0 */
    public final S mo12074a0() {
        return mo12072X().mo18815A();
    }

    /* renamed from: b0 */
    public final int mo12075b0(Context context) {
        int i = this.f8309n;
        return i != 0 ? i : mo12072X().mo18818M0(context);
    }

    /* renamed from: c0 */
    public final void mo12076c0(Context context) {
        this.f8296a.setTag(f8280c);
        this.f8296a.setImageDrawable(m10175U(context));
        this.f8296a.setChecked(this.f8311p != 0);
        jt4.m18849B1(this.f8296a, (C3884x1) null);
        mo12084p0(this.f8296a);
        this.f8296a.setOnClickListener(new C1595e());
    }

    /* renamed from: h0 */
    public boolean mo12077h0(DialogInterface.OnCancelListener onCancelListener) {
        return this.f8306c.remove(onCancelListener);
    }

    /* renamed from: i0 */
    public boolean mo12078i0(DialogInterface.OnDismissListener onDismissListener) {
        return this.f8308d.remove(onDismissListener);
    }

    /* renamed from: j0 */
    public boolean mo12079j0(View.OnClickListener onClickListener) {
        return this.f8303b.remove(onClickListener);
    }

    /* renamed from: k0 */
    public boolean mo12080k0(ze2<? super S> ze2) {
        return this.f8301a.remove(ze2);
    }

    /* renamed from: l0 */
    public final void mo12081l0() {
        int b0 = mo12075b0(requireContext());
        this.f8295a = C1577f.m10148W(mo12072X(), b0, this.f8294a);
        this.f8298a = this.f8296a.isChecked() ? gf2.m15809y(mo12072X(), b0, this.f8294a) : this.f8295a;
        mo12082o0();
        C0657l r = getChildFragmentManager().mo4611r();
        r.mo4845C(fd3.C2158h.mtrl_calendar_frame, this.f8298a);
        r.mo4728s();
        this.f8298a.mo12056q(new C1594d());
    }

    /* renamed from: o0 */
    public final void mo12082o0() {
        String Y = mo12073Y();
        this.f8293a.setContentDescription(String.format(getString(fd3.C2163m.mtrl_picker_announce_current_selection), new Object[]{Y}));
        this.f8293a.setText(Y);
    }

    public final void onCancel(@mr2 DialogInterface dialogInterface) {
        Iterator it = this.f8306c.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    public final void onCreate(@ts2 Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f8309n = bundle.getInt(f8279b);
        this.f8299a = (me0) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f8294a = (C1563a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f8310o = bundle.getInt(f8283e);
        this.f8300a = bundle.getCharSequence(f8284f);
        this.f8311p = bundle.getInt(f8289k);
        this.f8312q = bundle.getInt(f8285g);
        this.f8302b = bundle.getCharSequence(f8286h);
        this.f8313r = bundle.getInt(f8287i);
        this.f8305c = bundle.getCharSequence(f8288j);
    }

    @mr2
    public final Dialog onCreateDialog(@ts2 Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), mo12075b0(requireContext()));
        Context context = dialog.getContext();
        this.f8304b = m10177d0(context);
        int g = je2.m53278g(context, fd3.C2153c.colorSurface, C1590g.class.getCanonicalName());
        bf2 bf2 = new bf2(context, (AttributeSet) null, fd3.C2153c.materialCalendarStyle, fd3.C2164n.Widget_MaterialComponents_MaterialCalendar);
        this.f8297a = bf2;
        bf2.mo31599Z(context);
        this.f8297a.mo31626o0(ColorStateList.valueOf(g));
        this.f8297a.mo31624n0(jt4.m18904R(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @mr2
    public final View onCreateView(@mr2 LayoutInflater layoutInflater, @ts2 ViewGroup viewGroup, @ts2 Bundle bundle) {
        View view;
        LinearLayout.LayoutParams layoutParams;
        View inflate = layoutInflater.inflate(this.f8304b ? fd3.C2161k.mtrl_picker_fullscreen : fd3.C2161k.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.f8304b) {
            view = inflate.findViewById(fd3.C2158h.mtrl_calendar_frame);
            layoutParams = new LinearLayout.LayoutParams(m10176Z(context), -2);
        } else {
            view = inflate.findViewById(fd3.C2158h.mtrl_calendar_main_pane);
            layoutParams = new LinearLayout.LayoutParams(m10176Z(context), -1);
        }
        view.setLayoutParams(layoutParams);
        TextView textView = (TextView) inflate.findViewById(fd3.C2158h.mtrl_picker_header_selection_text);
        this.f8293a = textView;
        jt4.m18857D1(textView, 1);
        this.f8296a = (CheckableImageButton) inflate.findViewById(fd3.C2158h.mtrl_picker_header_toggle);
        TextView textView2 = (TextView) inflate.findViewById(fd3.C2158h.mtrl_picker_title_text);
        CharSequence charSequence = this.f8300a;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.f8310o);
        }
        mo12076c0(context);
        this.f8292a = (Button) inflate.findViewById(fd3.C2158h.confirm_button);
        if (mo12072X().mo18817E2()) {
            this.f8292a.setEnabled(true);
        } else {
            this.f8292a.setEnabled(false);
        }
        this.f8292a.setTag(f8277a);
        CharSequence charSequence2 = this.f8302b;
        if (charSequence2 != null) {
            this.f8292a.setText(charSequence2);
        } else {
            int i = this.f8312q;
            if (i != 0) {
                this.f8292a.setText(i);
            }
        }
        this.f8292a.setOnClickListener(new C1591a());
        Button button = (Button) inflate.findViewById(fd3.C2158h.cancel_button);
        button.setTag(f8278b);
        CharSequence charSequence3 = this.f8305c;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i2 = this.f8313r;
            if (i2 != 0) {
                button.setText(i2);
            }
        }
        button.setOnClickListener(new C1592b());
        return inflate;
    }

    public final void onDismiss(@mr2 DialogInterface dialogInterface) {
        Iterator it = this.f8308d.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    public final void onSaveInstanceState(@mr2 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(f8279b, this.f8309n);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f8299a);
        C1563a.C1565b bVar = new C1563a.C1565b(this.f8294a);
        if (this.f8295a.mo12050R() != null) {
            bVar.mo12010d(this.f8295a.mo12050R().f22613b);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.mo12007a());
        bundle.putInt(f8283e, this.f8310o);
        bundle.putCharSequence(f8284f, this.f8300a);
        bundle.putInt(f8285g, this.f8312q);
        bundle.putCharSequence(f8286h, this.f8302b);
        bundle.putInt(f8287i, this.f8313r);
        bundle.putCharSequence(f8288j, this.f8305c);
    }

    public void onStart() {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.f8304b) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f8297a);
            mo12071W(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(fd3.C2156f.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable(this.f8297a, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new fr1(requireDialog(), rect));
        }
        mo12081l0();
    }

    public void onStop() {
        this.f8298a.mo13950r();
        super.onStop();
    }

    /* renamed from: p0 */
    public final void mo12084p0(@mr2 CheckableImageButton checkableImageButton) {
        this.f8296a.setContentDescription(checkableImageButton.getContext().getString(this.f8296a.isChecked() ? fd3.C2163m.mtrl_picker_toggle_to_calendar_input_mode : fd3.C2163m.mtrl_picker_toggle_to_text_input_mode));
    }
}
