package com.onedelhi.secure;

import android.util.Log;
import com.onedelhi.secure.hl3;
import java.io.Writer;

@Deprecated
@hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
public class m92 extends Writer {

    /* renamed from: a */
    public StringBuilder f15955a = new StringBuilder(128);

    /* renamed from: b */
    public final String f15956b;

    public m92(String str) {
        this.f15956b = str;
    }

    /* renamed from: a */
    public final void mo20189a() {
        if (this.f15955a.length() > 0) {
            Log.d(this.f15956b, this.f15955a.toString());
            StringBuilder sb = this.f15955a;
            sb.delete(0, sb.length());
        }
    }

    public void close() {
        mo20189a();
    }

    public void flush() {
        mo20189a();
    }

    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == 10) {
                mo20189a();
            } else {
                this.f15955a.append(c);
            }
        }
    }
}
