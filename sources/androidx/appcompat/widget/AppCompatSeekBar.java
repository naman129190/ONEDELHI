package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.onedelhi.secure.C3243q8;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.qb4;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.za3;

public class AppCompatSeekBar extends SeekBar {

    /* renamed from: a */
    public final C3243q8 f1371a;

    public AppCompatSeekBar(@mr2 Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatSeekBar(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, za3.C4057b.seekBarStyle);
    }

    public AppCompatSeekBar(@mr2 Context context, @ts2 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        qb4.m25632a(this, getContext());
        C3243q8 q8Var = new C3243q8(this);
        this.f1371a = q8Var;
        q8Var.mo20993c(attributeSet, i);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f1371a.mo22935h();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f1371a.mo22939l();
    }

    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1371a.mo22934g(canvas);
    }
}
