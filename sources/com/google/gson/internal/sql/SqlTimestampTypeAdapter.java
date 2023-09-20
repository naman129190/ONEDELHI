package com.google.gson.internal.sql;

import com.onedelhi.secure.cj4;
import com.onedelhi.secure.dj4;
import com.onedelhi.secure.fj1;
import com.onedelhi.secure.lw1;
import com.onedelhi.secure.tj4;
import com.onedelhi.secure.xv1;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

public class SqlTimestampTypeAdapter extends cj4<Timestamp> {

    /* renamed from: a */
    public static final dj4 f25579a = new dj4() {
        /* renamed from: a */
        public <T> cj4<T> mo30126a(fj1 fj1, tj4<T> tj4) {
            if (tj4.getRawType() == Timestamp.class) {
                return new SqlTimestampTypeAdapter(fj1.mo36015q(Date.class));
            }
            return null;
        }
    };

    /* renamed from: a */
    public final cj4<Date> f25580a;

    public SqlTimestampTypeAdapter(cj4<Date> cj4) {
        this.f25580a = cj4;
    }

    /* renamed from: j */
    public Timestamp mo30144e(xv1 xv1) throws IOException {
        Date e = this.f25580a.mo30144e(xv1);
        if (e != null) {
            return new Timestamp(e.getTime());
        }
        return null;
    }

    /* renamed from: k */
    public void mo30145i(lw1 lw1, Timestamp timestamp) throws IOException {
        this.f25580a.mo30145i(lw1, timestamp);
    }
}
