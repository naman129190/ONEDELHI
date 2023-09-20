package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.C1577f;
import com.onedelhi.secure.C2660ks;
import com.onedelhi.secure.C3087os;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.fq4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.sd4;
import com.onedelhi.secure.xk2;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: com.google.android.material.datepicker.j */
public class C1602j extends RecyclerView.C0805h<C1604b> {

    /* renamed from: a */
    public final C1577f<?> f8348a;

    /* renamed from: com.google.android.material.datepicker.j$a */
    public class C1603a implements View.OnClickListener {

        /* renamed from: n */
        public final /* synthetic */ int f8350n;

        public C1603a(int i) {
            this.f8350n = i;
        }

        public void onClick(View view) {
            C1602j.this.f8348a.mo12053Y(C1602j.this.f8348a.mo12048P().mo11991f(xk2.m31505b(this.f8350n, C1602j.this.f8348a.mo12050R().f22615n)));
            C1602j.this.f8348a.mo12054Z(C1577f.C1588k.DAY);
        }
    }

    /* renamed from: com.google.android.material.datepicker.j$b */
    public static class C1604b extends RecyclerView.C0803f0 {

        /* renamed from: a */
        public final TextView f8351a;

        public C1604b(TextView textView) {
            super(textView);
            this.f8351a = textView;
        }
    }

    public C1602j(C1577f<?> fVar) {
        this.f8348a = fVar;
    }

    @mr2
    /* renamed from: K */
    public final View.OnClickListener mo12127K(int i) {
        return new C1603a(i);
    }

    /* renamed from: L */
    public int mo12128L(int i) {
        return i - this.f8348a.mo12048P().mo11998n().f22616o;
    }

    /* renamed from: M */
    public int mo12129M(int i) {
        return this.f8348a.mo12048P().mo11998n().f22616o + i;
    }

    /* renamed from: N */
    public void mo5728x(@mr2 C1604b bVar, int i) {
        int M = mo12129M(i);
        String string = bVar.f8351a.getContext().getString(fd3.C2163m.mtrl_picker_navigate_to_year_description);
        bVar.f8351a.setText(String.format(Locale.getDefault(), sd4.f34979c, new Object[]{Integer.valueOf(M)}));
        bVar.f8351a.setContentDescription(String.format(string, new Object[]{Integer.valueOf(M)}));
        C3087os Q = this.f8348a.mo12049Q();
        Calendar t = fq4.m15211t();
        C2660ks ksVar = t.get(1) == M ? Q.f18090f : Q.f18088d;
        for (Long longValue : this.f8348a.mo12057s().mo18816E1()) {
            t.setTimeInMillis(longValue.longValue());
            if (t.get(1) == M) {
                ksVar = Q.f18089e;
            }
        }
        ksVar.mo19185f(bVar.f8351a);
        bVar.f8351a.setOnClickListener(mo12127K(M));
    }

    @mr2
    /* renamed from: O */
    public C1604b mo5730z(@mr2 ViewGroup viewGroup, int i) {
        return new C1604b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(fd3.C2161k.mtrl_calendar_year, viewGroup, false));
    }

    /* renamed from: g */
    public int mo5711g() {
        return this.f8348a.mo12048P().mo11999o();
    }
}
