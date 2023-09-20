package com.onedelhi.secure;

import android.util.Log;
import java.io.Writer;

public final class l92 extends Writer {

    /* renamed from: a */
    public StringBuilder f15236a = new StringBuilder(128);

    /* renamed from: b */
    public final String f15237b;

    public l92(String str) {
        this.f15237b = str;
    }

    /* renamed from: a */
    public final void mo19342a() {
        if (this.f15236a.length() > 0) {
            Log.d(this.f15237b, this.f15236a.toString());
            StringBuilder sb = this.f15236a;
            sb.delete(0, sb.length());
        }
    }

    public void close() {
        mo19342a();
    }

    public void flush() {
        mo19342a();
    }

    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == 10) {
                mo19342a();
            } else {
                this.f15236a.append(c);
            }
        }
    }
}
