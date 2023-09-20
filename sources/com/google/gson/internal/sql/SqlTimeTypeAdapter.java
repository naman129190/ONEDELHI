package com.google.gson.internal.sql;

import com.onedelhi.secure.cj4;
import com.onedelhi.secure.dj4;
import com.onedelhi.secure.ew1;
import com.onedelhi.secure.fj1;
import com.onedelhi.secure.fw1;
import com.onedelhi.secure.lw1;
import com.onedelhi.secure.tj4;
import com.onedelhi.secure.xv1;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public final class SqlTimeTypeAdapter extends cj4<Time> {

    /* renamed from: a */
    public static final dj4 f25577a = new dj4() {
        /* renamed from: a */
        public <T> cj4<T> mo30126a(fj1 fj1, tj4<T> tj4) {
            if (tj4.getRawType() == Time.class) {
                return new SqlTimeTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a */
    public final DateFormat f25578a;

    public SqlTimeTypeAdapter() {
        this.f25578a = new SimpleDateFormat("hh:mm:ss a");
    }

    /* renamed from: j */
    public Time mo30144e(xv1 xv1) throws IOException {
        Time time;
        if (xv1.mo36944q0() == fw1.NULL) {
            xv1.mo36940j0();
            return null;
        }
        String o0 = xv1.mo36942o0();
        try {
            synchronized (this) {
                time = new Time(this.f25578a.parse(o0).getTime());
            }
            return time;
        } catch (ParseException e) {
            throw new ew1("Failed parsing '" + o0 + "' as SQL Time; at path " + xv1.mo36943q(), e);
        }
    }

    /* renamed from: k */
    public void mo30145i(lw1 lw1, Time time) throws IOException {
        String format;
        if (time == null) {
            lw1.mo37582M();
            return;
        }
        synchronized (this) {
            format = this.f25578a.format(time);
        }
        lw1.mo37580G0(format);
    }
}
