package androidx.emoji2.text;

import android.os.Build;
import android.text.TextPaint;
import androidx.emoji2.text.C0552c;
import com.onedelhi.secure.C3568t7;
import com.onedelhi.secure.by2;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.mr2;

@C3568t7
@hl3({hl3.C2354a.f13185a})
/* renamed from: androidx.emoji2.text.b */
public class C0551b implements C0552c.C0558e {

    /* renamed from: a */
    public static final int f3537a = 10;

    /* renamed from: a */
    public static final ThreadLocal<StringBuilder> f3538a = new ThreadLocal<>();

    /* renamed from: a */
    public final TextPaint f3539a;

    public C0551b() {
        TextPaint textPaint = new TextPaint();
        this.f3539a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    /* renamed from: b */
    public static StringBuilder m4100b() {
        ThreadLocal<StringBuilder> threadLocal = f3538a;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return threadLocal.get();
    }

    /* renamed from: a */
    public boolean mo4164a(@mr2 CharSequence charSequence, int i, int i2, int i3) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 23 && i3 > i4) {
            return false;
        }
        StringBuilder b = m4100b();
        b.setLength(0);
        while (i < i2) {
            b.append(charSequence.charAt(i));
            i++;
        }
        return by2.m12139a(this.f3539a, b.toString());
    }
}
