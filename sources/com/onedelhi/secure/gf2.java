package com.onedelhi.secure;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.datepicker.C1563a;
import com.onedelhi.secure.hl3;
import java.util.Iterator;

@hl3({hl3.C2354a.f13187b})
public final class gf2<S> extends c23<S> {

    /* renamed from: b */
    public static final String f12546b = "THEME_RES_ID_KEY";

    /* renamed from: c */
    public static final String f12547c = "DATE_SELECTOR_KEY";

    /* renamed from: d */
    public static final String f12548d = "CALENDAR_CONSTRAINTS_KEY";
    @ts2

    /* renamed from: a */
    public C1563a f12549a;
    @ts2

    /* renamed from: a */
    public me0<S> f12550a;
    @e64

    /* renamed from: n */
    public int f12551n;

    /* renamed from: com.onedelhi.secure.gf2$a */
    public class C2243a extends ev2<S> {
        public C2243a() {
        }

        /* renamed from: a */
        public void mo12087a() {
            Iterator it = gf2.this.f10083a.iterator();
            while (it.hasNext()) {
                ((ev2) it.next()).mo12087a();
            }
        }

        /* renamed from: b */
        public void mo12088b(S s) {
            Iterator it = gf2.this.f10083a.iterator();
            while (it.hasNext()) {
                ((ev2) it.next()).mo12088b(s);
            }
        }
    }

    @mr2
    /* renamed from: y */
    public static <T> gf2<T> m15809y(me0<T> me0, @e64 int i, @mr2 C1563a aVar) {
        gf2<T> gf2 = new gf2<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("DATE_SELECTOR_KEY", me0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        gf2.setArguments(bundle);
        return gf2;
    }

    public void onCreate(@ts2 Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f12551n = bundle.getInt("THEME_RES_ID_KEY");
        this.f12550a = (me0) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f12549a = (C1563a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @mr2
    public View onCreateView(@mr2 LayoutInflater layoutInflater, @ts2 ViewGroup viewGroup, @ts2 Bundle bundle) {
        return this.f12550a.mo18829x2(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f12551n)), viewGroup, bundle, this.f12549a, new C2243a());
    }

    public void onSaveInstanceState(@mr2 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f12551n);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f12550a);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f12549a);
    }

    @mr2
    /* renamed from: s */
    public me0<S> mo12057s() {
        me0<S> me0 = this.f12550a;
        if (me0 != null) {
            return me0;
        }
        throw new IllegalStateException("dateSelector should not be null. Use MaterialTextInputPicker#newInstance() to create this fragment with a DateSelector, and call this method after the fragment has been created.");
    }
}
