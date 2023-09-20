package com.onedelhi.secure;

import com.google.gson.internal.bind.TypeAdapters;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public final class xg0<T extends Date> extends cj4<T> {

    /* renamed from: a */
    public static final String f37462a = "DefaultDateTypeAdapter";

    /* renamed from: a */
    public final C7251b<T> f37463a;

    /* renamed from: a */
    public final List<DateFormat> f37464a;

    /* renamed from: com.onedelhi.secure.xg0$b */
    public static abstract class C7251b<T extends Date> {

        /* renamed from: a */
        public static final C7251b<Date> f37465a = new C7252a(Date.class);

        /* renamed from: a */
        public final Class<T> f37466a;

        /* renamed from: com.onedelhi.secure.xg0$b$a */
        public class C7252a extends C7251b<Date> {
            public C7252a(Class cls) {
                super(cls);
            }

            /* renamed from: f */
            public Date mo34776f(Date date) {
                return date;
            }
        }

        public C7251b(Class<T> cls) {
            this.f37466a = cls;
        }

        /* renamed from: a */
        public final dj4 mo47171a(int i) {
            return mo47175e(new xg0(this, i));
        }

        /* renamed from: b */
        public final dj4 mo47172b(int i, int i2) {
            return mo47175e(new xg0(this, i, i2));
        }

        /* renamed from: c */
        public final dj4 mo47173c(String str) {
            return mo47175e(new xg0(this, str));
        }

        /* renamed from: d */
        public final dj4 mo47174d() {
            return mo47175e(new xg0(this, 2, 2));
        }

        /* renamed from: e */
        public final dj4 mo47175e(xg0<T> xg0) {
            return TypeAdapters.m35364b(this.f37466a, xg0);
        }

        /* renamed from: f */
        public abstract T mo34776f(Date date);
    }

    public xg0(C7251b<T> bVar, int i) {
        ArrayList arrayList = new ArrayList();
        this.f37464a = arrayList;
        this.f37463a = (C7251b) C4453a.m35637b(bVar);
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateInstance(i, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateInstance(i));
        }
        if (nu1.m58807e()) {
            arrayList.add(c43.m40730d(i));
        }
    }

    public xg0(C7251b<T> bVar, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        this.f37464a = arrayList;
        this.f37463a = (C7251b) C4453a.m35637b(bVar);
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i, i2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (nu1.m58807e()) {
            arrayList.add(c43.m40731e(i, i2));
        }
    }

    public xg0(C7251b<T> bVar, String str) {
        ArrayList arrayList = new ArrayList();
        this.f37464a = arrayList;
        this.f37463a = (C7251b) C4453a.m35637b(bVar);
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(new SimpleDateFormat(str));
        }
    }

    /* renamed from: j */
    public final Date mo47167j(xv1 xv1) throws IOException {
        String o0 = xv1.mo36942o0();
        synchronized (this.f37464a) {
            for (DateFormat parse : this.f37464a) {
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
    public T mo30144e(xv1 xv1) throws IOException {
        if (xv1.mo36944q0() == fw1.NULL) {
            xv1.mo36940j0();
            return null;
        }
        return this.f37463a.mo34776f(mo47167j(xv1));
    }

    /* renamed from: l */
    public void mo30145i(lw1 lw1, Date date) throws IOException {
        String format;
        if (date == null) {
            lw1.mo37582M();
            return;
        }
        DateFormat dateFormat = this.f37464a.get(0);
        synchronized (this.f37464a) {
            format = dateFormat.format(date);
        }
        lw1.mo37580G0(format);
    }

    public String toString() {
        StringBuilder sb;
        String simpleName;
        DateFormat dateFormat = this.f37464a.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            sb = new StringBuilder();
            sb.append("DefaultDateTypeAdapter(");
            simpleName = ((SimpleDateFormat) dateFormat).toPattern();
        } else {
            sb = new StringBuilder();
            sb.append("DefaultDateTypeAdapter(");
            simpleName = dateFormat.getClass().getSimpleName();
        }
        sb.append(simpleName);
        sb.append(')');
        return sb.toString();
    }
}
