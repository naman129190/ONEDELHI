package com.google.gson.internal.bind;

import com.onedelhi.secure.c43;
import com.onedelhi.secure.cj4;
import com.onedelhi.secure.dj4;
import com.onedelhi.secure.ew1;
import com.onedelhi.secure.fj1;
import com.onedelhi.secure.fw1;
import com.onedelhi.secure.lw1;
import com.onedelhi.secure.nu1;
import com.onedelhi.secure.tj4;
import com.onedelhi.secure.xv1;
import com.onedelhi.secure.yn1;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public final class DateTypeAdapter extends cj4<Date> {

    /* renamed from: a */
    public static final dj4 f25450a = new dj4() {
        /* renamed from: a */
        public <T> cj4<T> mo30126a(fj1 fj1, tj4<T> tj4) {
            if (tj4.getRawType() == Date.class) {
                return new DateTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a */
    public final List<DateFormat> f25451a;

    public DateTypeAdapter() {
        ArrayList arrayList = new ArrayList();
        this.f25451a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (nu1.m58807e()) {
            arrayList.add(c43.m40731e(2, 2));
        }
    }

    /* renamed from: j */
    public final Date mo30149j(xv1 xv1) throws IOException {
        String o0 = xv1.mo36942o0();
        synchronized (this.f25451a) {
            for (DateFormat parse : this.f25451a) {
                try {
                    Date parse2 = parse.parse(o0);
                    return parse2;
                } catch (ParseException unused) {
                }
            }
            try {
                return yn1.m71983g(o0, new ParsePosition(0));
            } catch (ParseException e) {
                throw new ew1("Failed parsing '" + o0 + "' as Date; at path " + xv1.mo36943q(), e);
            }
        }
    }

    /* renamed from: k */
    public Date mo30144e(xv1 xv1) throws IOException {
        if (xv1.mo36944q0() != fw1.NULL) {
            return mo30149j(xv1);
        }
        xv1.mo36940j0();
        return null;
    }

    /* renamed from: l */
    public void mo30145i(lw1 lw1, Date date) throws IOException {
        String format;
        if (date == null) {
            lw1.mo37582M();
            return;
        }
        DateFormat dateFormat = this.f25451a.get(0);
        synchronized (this.f25451a) {
            format = dateFormat.format(date);
        }
        lw1.mo37580G0(format);
    }
}
