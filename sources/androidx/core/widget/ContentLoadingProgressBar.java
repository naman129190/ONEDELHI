package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.onedelhi.secure.d70;
import com.onedelhi.secure.e70;
import com.onedelhi.secure.f70;
import com.onedelhi.secure.g70;
import com.onedelhi.secure.hn4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;

public class ContentLoadingProgressBar extends ProgressBar {

    /* renamed from: n */
    public static final int f3331n = 500;

    /* renamed from: o */
    public static final int f3332o = 500;

    /* renamed from: a */
    public final Runnable f3333a;

    /* renamed from: b */
    public long f3334b;

    /* renamed from: b */
    public final Runnable f3335b;

    /* renamed from: b */
    public boolean f3336b;

    /* renamed from: c */
    public boolean f3337c;

    /* renamed from: d */
    public boolean f3338d;

    public ContentLoadingProgressBar(@mr2 Context context) {
        this(context, (AttributeSet) null);
    }

    public ContentLoadingProgressBar(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f3334b = -1;
        this.f3336b = false;
        this.f3337c = false;
        this.f3338d = false;
        this.f3333a = new d70(this);
        this.f3335b = new f70(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m3692g() {
        this.f3336b = false;
        this.f3334b = -1;
        setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m3693h() {
        this.f3337c = false;
        if (!this.f3338d) {
            this.f3334b = System.currentTimeMillis();
            setVisibility(0);
        }
    }

    /* renamed from: e */
    public void mo3792e() {
        post(new e70(this));
    }

    @hn4
    /* renamed from: f */
    public final void mo3793f() {
        this.f3338d = true;
        removeCallbacks(this.f3335b);
        this.f3337c = false;
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.f3334b;
        long j2 = currentTimeMillis - j;
        if (j2 >= 500 || j == -1) {
            setVisibility(8);
        } else if (!this.f3336b) {
            postDelayed(this.f3333a, 500 - j2);
            this.f3336b = true;
        }
    }

    /* renamed from: i */
    public final void mo3794i() {
        removeCallbacks(this.f3333a);
        removeCallbacks(this.f3335b);
    }

    /* renamed from: j */
    public void mo3795j() {
        post(new g70(this));
    }

    @hn4
    /* renamed from: k */
    public final void mo3796k() {
        this.f3334b = -1;
        this.f3338d = false;
        removeCallbacks(this.f3333a);
        this.f3336b = false;
        if (!this.f3337c) {
            postDelayed(this.f3335b, 500);
            this.f3337c = true;
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo3794i();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo3794i();
    }
}
