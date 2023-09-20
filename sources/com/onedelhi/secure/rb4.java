package com.onedelhi.secure;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.widget.SpinnerAdapter;

public interface rb4 extends SpinnerAdapter {

    /* renamed from: com.onedelhi.secure.rb4$a */
    public static final class C3399a {

        /* renamed from: a */
        public final Context f19765a;

        /* renamed from: a */
        public final LayoutInflater f19766a;

        /* renamed from: b */
        public LayoutInflater f19767b;

        public C3399a(@mr2 Context context) {
            this.f19765a = context;
            this.f19766a = LayoutInflater.from(context);
        }

        @mr2
        /* renamed from: a */
        public LayoutInflater mo23787a() {
            LayoutInflater layoutInflater = this.f19767b;
            return layoutInflater != null ? layoutInflater : this.f19766a;
        }

        @ts2
        /* renamed from: b */
        public Resources.Theme mo23788b() {
            LayoutInflater layoutInflater = this.f19767b;
            if (layoutInflater == null) {
                return null;
            }
            return layoutInflater.getContext().getTheme();
        }

        /* renamed from: c */
        public void mo23789c(@ts2 Resources.Theme theme) {
            this.f19767b = theme == null ? null : theme == this.f19765a.getTheme() ? this.f19766a : LayoutInflater.from(new z70(this.f19765a, theme));
        }
    }

    @ts2
    Resources.Theme getDropDownViewTheme();

    void setDropDownViewTheme(@ts2 Resources.Theme theme);
}
