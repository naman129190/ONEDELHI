package com.onedelhi.secure;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.material.datepicker.C1563a;
import com.google.android.material.datepicker.C1572c;
import com.google.android.material.datepicker.C1590g;
import com.google.android.material.textfield.TextInputLayout;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.hl3;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;

@hl3({hl3.C2354a.LIBRARY_GROUP})
public class re3 implements me0<fy2<Long, Long>> {
    public static final Parcelable.Creator<re3> CREATOR = new C3412c();
    @ts2

    /* renamed from: a */
    public Long f19795a = null;
    @ts2

    /* renamed from: b */
    public Long f19796b = null;

    /* renamed from: b */
    public String f19797b;
    @ts2

    /* renamed from: c */
    public Long f19798c = null;

    /* renamed from: c */
    public final String f19799c = " ";
    @ts2

    /* renamed from: d */
    public Long f19800d = null;

    /* renamed from: com.onedelhi.secure.re3$a */
    public class C3410a extends C1572c {

        /* renamed from: a */
        public final /* synthetic */ ev2 f19801a;

        /* renamed from: b */
        public final /* synthetic */ TextInputLayout f19803b;

        /* renamed from: c */
        public final /* synthetic */ TextInputLayout f19804c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3410a(String str, DateFormat dateFormat, TextInputLayout textInputLayout, C1563a aVar, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, ev2 ev2) {
            super(str, dateFormat, textInputLayout, aVar);
            this.f19803b = textInputLayout2;
            this.f19804c = textInputLayout3;
            this.f19801a = ev2;
        }

        /* renamed from: f */
        public void mo12025f() {
            Long unused = re3.this.f19798c = null;
            re3.this.mo23828m(this.f19803b, this.f19804c, this.f19801a);
        }

        /* renamed from: g */
        public void mo12026g(@ts2 Long l) {
            Long unused = re3.this.f19798c = l;
            re3.this.mo23828m(this.f19803b, this.f19804c, this.f19801a);
        }
    }

    /* renamed from: com.onedelhi.secure.re3$b */
    public class C3411b extends C1572c {

        /* renamed from: a */
        public final /* synthetic */ ev2 f19805a;

        /* renamed from: b */
        public final /* synthetic */ TextInputLayout f19807b;

        /* renamed from: c */
        public final /* synthetic */ TextInputLayout f19808c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3411b(String str, DateFormat dateFormat, TextInputLayout textInputLayout, C1563a aVar, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, ev2 ev2) {
            super(str, dateFormat, textInputLayout, aVar);
            this.f19807b = textInputLayout2;
            this.f19808c = textInputLayout3;
            this.f19805a = ev2;
        }

        /* renamed from: f */
        public void mo12025f() {
            Long unused = re3.this.f19800d = null;
            re3.this.mo23828m(this.f19807b, this.f19808c, this.f19805a);
        }

        /* renamed from: g */
        public void mo12026g(@ts2 Long l) {
            Long unused = re3.this.f19800d = l;
            re3.this.mo23828m(this.f19807b, this.f19808c, this.f19805a);
        }
    }

    /* renamed from: com.onedelhi.secure.re3$c */
    public class C3412c implements Parcelable.Creator<re3> {
        @mr2
        /* renamed from: a */
        public re3 createFromParcel(@mr2 Parcel parcel) {
            Class<Long> cls = Long.class;
            re3 re3 = new re3();
            Long unused = re3.f19795a = (Long) parcel.readValue(cls.getClassLoader());
            Long unused2 = re3.f19796b = (Long) parcel.readValue(cls.getClassLoader());
            return re3;
        }

        @mr2
        /* renamed from: b */
        public re3[] newArray(int i) {
            return new re3[i];
        }
    }

    @mr2
    /* renamed from: E1 */
    public Collection<Long> mo18816E1() {
        ArrayList arrayList = new ArrayList();
        Long l = this.f19795a;
        if (l != null) {
            arrayList.add(l);
        }
        Long l2 = this.f19796b;
        if (l2 != null) {
            arrayList.add(l2);
        }
        return arrayList;
    }

    /* renamed from: E2 */
    public boolean mo18817E2() {
        Long l = this.f19795a;
        return (l == null || this.f19796b == null || !mo23825i(l.longValue(), this.f19796b.longValue())) ? false : true;
    }

    /* renamed from: M0 */
    public int mo18818M0(@mr2 Context context) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return je2.m53278g(context, Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(fd3.C2156f.mtrl_calendar_maximum_default_fullscreen_minor_axis) ? fd3.C2153c.materialCalendarTheme : fd3.C2153c.materialCalendarFullscreenTheme, C1590g.class.getCanonicalName());
    }

    /* renamed from: U1 */
    public void mo18819U1(long j) {
        Long l = this.f19795a;
        if (l != null) {
            if (this.f19796b != null || !mo23825i(l.longValue(), j)) {
                this.f19796b = null;
            } else {
                this.f19796b = Long.valueOf(j);
                return;
            }
        }
        this.f19795a = Long.valueOf(j);
    }

    @mr2
    /* renamed from: V1 */
    public Collection<fy2<Long, Long>> mo18820V1() {
        if (this.f19795a == null || this.f19796b == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new fy2(this.f19795a, this.f19796b));
        return arrayList;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: f */
    public final void mo23823f(@mr2 TextInputLayout textInputLayout, @mr2 TextInputLayout textInputLayout2) {
        if (textInputLayout.getError() != null && this.f19797b.contentEquals(textInputLayout.getError())) {
            textInputLayout.setError((CharSequence) null);
        }
        if (textInputLayout2.getError() != null && " ".contentEquals(textInputLayout2.getError())) {
            textInputLayout2.setError((CharSequence) null);
        }
    }

    /* renamed from: g */
    public int mo18825g() {
        return fd3.C2163m.mtrl_picker_range_header_title;
    }

    @mr2
    /* renamed from: h */
    public fy2<Long, Long> mo18815A() {
        return new fy2<>(this.f19795a, this.f19796b);
    }

    @mr2
    /* renamed from: h1 */
    public String mo18826h1(@mr2 Context context) {
        Resources resources = context.getResources();
        Long l = this.f19795a;
        if (l == null && this.f19796b == null) {
            return resources.getString(fd3.C2163m.mtrl_picker_range_header_unselected);
        }
        Long l2 = this.f19796b;
        if (l2 == null) {
            return resources.getString(fd3.C2163m.mtrl_picker_range_header_only_start_selected, new Object[]{ne0.m22707c(l.longValue())});
        } else if (l == null) {
            return resources.getString(fd3.C2163m.mtrl_picker_range_header_only_end_selected, new Object[]{ne0.m22707c(l2.longValue())});
        } else {
            fy2<String, String> a = ne0.m22705a(l, l2);
            return resources.getString(fd3.C2163m.mtrl_picker_range_header_selected, new Object[]{a.f12385a, a.f12386b});
        }
    }

    /* renamed from: i */
    public final boolean mo23825i(long j, long j2) {
        return j <= j2;
    }

    /* renamed from: j */
    public final void mo23826j(@mr2 TextInputLayout textInputLayout, @mr2 TextInputLayout textInputLayout2) {
        textInputLayout.setError(this.f19797b);
        textInputLayout2.setError(" ");
    }

    /* renamed from: k */
    public void mo18827l(@mr2 fy2<Long, Long> fy2) {
        F f = fy2.f12385a;
        if (!(f == null || fy2.f12386b == null)) {
            k43.m19444a(mo23825i(((Long) f).longValue(), ((Long) fy2.f12386b).longValue()));
        }
        F f2 = fy2.f12385a;
        Long l = null;
        this.f19795a = f2 == null ? null : Long.valueOf(fq4.m15192a(((Long) f2).longValue()));
        S s = fy2.f12386b;
        if (s != null) {
            l = Long.valueOf(fq4.m15192a(((Long) s).longValue()));
        }
        this.f19796b = l;
    }

    /* renamed from: m */
    public final void mo23828m(@mr2 TextInputLayout textInputLayout, @mr2 TextInputLayout textInputLayout2, @mr2 ev2<fy2<Long, Long>> ev2) {
        Long l = this.f19798c;
        if (l == null || this.f19800d == null) {
            mo23823f(textInputLayout, textInputLayout2);
            ev2.mo12087a();
        } else if (mo23825i(l.longValue(), this.f19800d.longValue())) {
            this.f19795a = this.f19798c;
            this.f19796b = this.f19800d;
            ev2.mo12088b(mo18815A());
        } else {
            mo23826j(textInputLayout, textInputLayout2);
            ev2.mo12087a();
        }
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        parcel.writeValue(this.f19795a);
        parcel.writeValue(this.f19796b);
    }

    /* renamed from: x2 */
    public View mo18829x2(@mr2 LayoutInflater layoutInflater, @ts2 ViewGroup viewGroup, @ts2 Bundle bundle, C1563a aVar, @mr2 ev2<fy2<Long, Long>> ev2) {
        View inflate = layoutInflater.inflate(fd3.C2161k.mtrl_picker_text_input_date_range, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(fd3.C2158h.mtrl_picker_text_input_range_start);
        TextInputLayout textInputLayout2 = (TextInputLayout) inflate.findViewById(fd3.C2158h.mtrl_picker_text_input_range_end);
        EditText editText = textInputLayout.getEditText();
        EditText editText2 = textInputLayout2.getEditText();
        if (fc2.m47740a()) {
            editText.setInputType(17);
            editText2.setInputType(17);
        }
        this.f19797b = inflate.getResources().getString(fd3.C2163m.mtrl_picker_invalid_range);
        SimpleDateFormat p = fq4.m15207p();
        Long l = this.f19795a;
        if (l != null) {
            editText.setText(p.format(l));
            this.f19798c = this.f19795a;
        }
        Long l2 = this.f19796b;
        if (l2 != null) {
            editText2.setText(p.format(l2));
            this.f19800d = this.f19796b;
        }
        String q = fq4.m15208q(inflate.getResources(), p);
        textInputLayout.setPlaceholderText(q);
        textInputLayout2.setPlaceholderText(q);
        C1563a aVar2 = aVar;
        C3410a aVar3 = r0;
        TextInputLayout textInputLayout3 = textInputLayout;
        String str = q;
        TextInputLayout textInputLayout4 = textInputLayout2;
        SimpleDateFormat simpleDateFormat = p;
        ev2<fy2<Long, Long>> ev22 = ev2;
        C3410a aVar4 = new C3410a(q, p, textInputLayout, aVar2, textInputLayout3, textInputLayout4, ev22);
        editText.addTextChangedListener(aVar3);
        editText2.addTextChangedListener(new C3411b(str, simpleDateFormat, textInputLayout2, aVar2, textInputLayout3, textInputLayout4, ev22));
        le0.m20528b(editText, editText2);
        return inflate;
    }
}
