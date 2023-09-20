package com.onedelhi.secure;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
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
public class jz3 implements me0<Long> {
    public static final Parcelable.Creator<jz3> CREATOR = new C2589b();
    @ts2

    /* renamed from: a */
    public Long f14666a;

    /* renamed from: com.onedelhi.secure.jz3$a */
    public class C2588a extends C1572c {

        /* renamed from: a */
        public final /* synthetic */ ev2 f14667a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2588a(String str, DateFormat dateFormat, TextInputLayout textInputLayout, C1563a aVar, ev2 ev2) {
            super(str, dateFormat, textInputLayout, aVar);
            this.f14667a = ev2;
        }

        /* renamed from: f */
        public void mo12025f() {
            this.f14667a.mo12087a();
        }

        /* renamed from: g */
        public void mo12026g(@ts2 Long l) {
            if (l == null) {
                jz3.this.mo18821c();
            } else {
                jz3.this.mo18819U1(l.longValue());
            }
            this.f14667a.mo12088b(jz3.this.mo18815A());
        }
    }

    /* renamed from: com.onedelhi.secure.jz3$b */
    public class C2589b implements Parcelable.Creator<jz3> {
        @mr2
        /* renamed from: a */
        public jz3 createFromParcel(@mr2 Parcel parcel) {
            jz3 jz3 = new jz3();
            Long unused = jz3.f14666a = (Long) parcel.readValue(Long.class.getClassLoader());
            return jz3;
        }

        @mr2
        /* renamed from: b */
        public jz3[] newArray(int i) {
            return new jz3[i];
        }
    }

    @mr2
    /* renamed from: E1 */
    public Collection<Long> mo18816E1() {
        ArrayList arrayList = new ArrayList();
        Long l = this.f14666a;
        if (l != null) {
            arrayList.add(l);
        }
        return arrayList;
    }

    /* renamed from: E2 */
    public boolean mo18817E2() {
        return this.f14666a != null;
    }

    /* renamed from: M0 */
    public int mo18818M0(Context context) {
        return je2.m53278g(context, fd3.C2153c.materialCalendarTheme, C1590g.class.getCanonicalName());
    }

    /* renamed from: U1 */
    public void mo18819U1(long j) {
        this.f14666a = Long.valueOf(j);
    }

    @mr2
    /* renamed from: V1 */
    public Collection<fy2<Long, Long>> mo18820V1() {
        return new ArrayList();
    }

    /* renamed from: c */
    public final void mo18821c() {
        this.f14666a = null;
    }

    @ts2
    /* renamed from: d */
    public Long mo18815A() {
        return this.f14666a;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public void mo18827l(@ts2 Long l) {
        this.f14666a = l == null ? null : Long.valueOf(fq4.m15192a(l.longValue()));
    }

    /* renamed from: g */
    public int mo18825g() {
        return fd3.C2163m.mtrl_picker_date_header_title;
    }

    @mr2
    /* renamed from: h1 */
    public String mo18826h1(@mr2 Context context) {
        Resources resources = context.getResources();
        Long l = this.f14666a;
        if (l == null) {
            return resources.getString(fd3.C2163m.mtrl_picker_date_header_unselected);
        }
        String j = ne0.m22714j(l.longValue());
        return resources.getString(fd3.C2163m.mtrl_picker_date_header_selected, new Object[]{j});
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        parcel.writeValue(this.f14666a);
    }

    /* renamed from: x2 */
    public View mo18829x2(@mr2 LayoutInflater layoutInflater, @ts2 ViewGroup viewGroup, @ts2 Bundle bundle, C1563a aVar, @mr2 ev2<Long> ev2) {
        View inflate = layoutInflater.inflate(fd3.C2161k.mtrl_picker_text_input_date, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(fd3.C2158h.mtrl_picker_text_input_date);
        EditText editText = textInputLayout.getEditText();
        if (fc2.m47740a()) {
            editText.setInputType(17);
        }
        SimpleDateFormat p = fq4.m15207p();
        String q = fq4.m15208q(inflate.getResources(), p);
        textInputLayout.setPlaceholderText(q);
        Long l = this.f14666a;
        if (l != null) {
            editText.setText(p.format(l));
        }
        editText.addTextChangedListener(new C2588a(q, p, textInputLayout, aVar, ev2));
        le0.m20528b(editText);
        return inflate;
    }
}
