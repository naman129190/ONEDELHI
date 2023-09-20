package com.google.android.material.datepicker;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.android.material.textfield.TextInputLayout;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.fe0;
import com.onedelhi.secure.fq4;
import com.onedelhi.secure.ge0;
import com.onedelhi.secure.mb4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ne0;
import com.onedelhi.secure.tk4;
import com.onedelhi.secure.ts2;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

/* renamed from: com.google.android.material.datepicker.c */
public abstract class C1572c extends mb4 {

    /* renamed from: n */
    public static final int f8228n = 1000;

    /* renamed from: a */
    public final C1563a f8229a;
    @mr2

    /* renamed from: a */
    public final TextInputLayout f8230a;

    /* renamed from: a */
    public final Runnable f8231a;

    /* renamed from: a */
    public final DateFormat f8232a;

    /* renamed from: b */
    public Runnable f8233b;

    /* renamed from: b */
    public final String f8234b;

    public C1572c(String str, DateFormat dateFormat, @mr2 TextInputLayout textInputLayout, C1563a aVar) {
        this.f8232a = dateFormat;
        this.f8230a = textInputLayout;
        this.f8229a = aVar;
        this.f8234b = textInputLayout.getContext().getString(fd3.C2163m.mtrl_picker_out_of_range);
        this.f8231a = new ge0(this, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m10123d(long j) {
        String c = ne0.m22707c(j);
        this.f8230a.setError(String.format(this.f8234b, new Object[]{mo12028i(c)}));
        mo12025f();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m10124e(String str) {
        TextInputLayout textInputLayout = this.f8230a;
        DateFormat dateFormat = this.f8232a;
        Context context = textInputLayout.getContext();
        String string = context.getString(fd3.C2163m.mtrl_picker_invalid_format);
        String format = String.format(context.getString(fd3.C2163m.mtrl_picker_invalid_format_use), new Object[]{mo12028i(str)});
        String format2 = String.format(context.getString(fd3.C2163m.mtrl_picker_invalid_format_example), new Object[]{mo12028i(dateFormat.format(new Date(fq4.m15211t().getTimeInMillis())))});
        textInputLayout.setError(string + "\n" + format + "\n" + format2);
        mo12025f();
    }

    /* renamed from: c */
    public final Runnable mo12024c(long j) {
        return new fe0(this, j);
    }

    /* renamed from: f */
    public void mo12025f() {
    }

    /* renamed from: g */
    public abstract void mo12026g(@ts2 Long l);

    /* renamed from: h */
    public void mo12027h(View view, Runnable runnable) {
        view.postDelayed(runnable, 1000);
    }

    /* renamed from: i */
    public final String mo12028i(String str) {
        return str.replace(' ', tk4.f35699f);
    }

    public void onTextChanged(@mr2 CharSequence charSequence, int i, int i2, int i3) {
        this.f8230a.removeCallbacks(this.f8231a);
        this.f8230a.removeCallbacks(this.f8233b);
        this.f8230a.setError((CharSequence) null);
        mo12026g((Long) null);
        if (!TextUtils.isEmpty(charSequence)) {
            try {
                Date parse = this.f8232a.parse(charSequence.toString());
                this.f8230a.setError((CharSequence) null);
                long time = parse.getTime();
                if (!this.f8229a.mo11992h().mo12013Z(time) || !this.f8229a.mo12000p(time)) {
                    Runnable c = mo12024c(time);
                    this.f8233b = c;
                    mo12027h(this.f8230a, c);
                    return;
                }
                mo12026g(Long.valueOf(parse.getTime()));
            } catch (ParseException unused) {
                mo12027h(this.f8230a, this.f8231a);
            }
        }
    }
}
