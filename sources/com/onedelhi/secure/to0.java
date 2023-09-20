package com.onedelhi.secure;

import android.graphics.Point;
import android.view.View;

public class to0 {

    /* renamed from: a */
    public int f20966a;

    /* renamed from: a */
    public final View.OnLongClickListener f20967a = new ro0(this);

    /* renamed from: a */
    public final View.OnTouchListener f20968a = new so0(this);

    /* renamed from: a */
    public final View f20969a;

    /* renamed from: a */
    public final C3648a f20970a;

    /* renamed from: a */
    public boolean f20971a;

    /* renamed from: b */
    public int f20972b;

    /* renamed from: com.onedelhi.secure.to0$a */
    public interface C3648a {
        /* renamed from: a */
        boolean mo25235a(@mr2 View view, @mr2 to0 to0);
    }

    public to0(@mr2 View view, @mr2 C3648a aVar) {
        this.f20969a = view;
        this.f20970a = aVar;
    }

    /* renamed from: a */
    public void mo25230a() {
        this.f20969a.setOnLongClickListener(this.f20967a);
        this.f20969a.setOnTouchListener(this.f20968a);
    }

    /* renamed from: b */
    public void mo25231b() {
        this.f20969a.setOnLongClickListener((View.OnLongClickListener) null);
        this.f20969a.setOnTouchListener((View.OnTouchListener) null);
    }

    /* renamed from: c */
    public void mo25232c(@mr2 Point point) {
        point.set(this.f20966a, this.f20972b);
    }

    /* renamed from: d */
    public boolean mo25233d(@mr2 View view) {
        return this.f20970a.mo25235a(view, this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (r2 != 3) goto L_0x004d;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo25234e(@com.onedelhi.secure.mr2 android.view.View r7, @com.onedelhi.secure.mr2 android.view.MotionEvent r8) {
        /*
            r6 = this;
            float r0 = r8.getX()
            int r0 = (int) r0
            float r1 = r8.getY()
            int r1 = (int) r1
            int r2 = r8.getAction()
            r3 = 0
            if (r2 == 0) goto L_0x0049
            r4 = 1
            if (r2 == r4) goto L_0x0046
            r5 = 2
            if (r2 == r5) goto L_0x001b
            r7 = 3
            if (r2 == r7) goto L_0x0046
            goto L_0x004d
        L_0x001b:
            r2 = 8194(0x2002, float:1.1482E-41)
            boolean r2 = com.onedelhi.secure.dl2.m13234l(r8, r2)
            if (r2 == 0) goto L_0x004d
            int r8 = r8.getButtonState()
            r8 = r8 & r4
            if (r8 != 0) goto L_0x002b
            goto L_0x004d
        L_0x002b:
            boolean r8 = r6.f20971a
            if (r8 == 0) goto L_0x0030
            goto L_0x004d
        L_0x0030:
            int r8 = r6.f20966a
            if (r8 != r0) goto L_0x0039
            int r8 = r6.f20972b
            if (r8 != r1) goto L_0x0039
            goto L_0x004d
        L_0x0039:
            r6.f20966a = r0
            r6.f20972b = r1
            com.onedelhi.secure.to0$a r8 = r6.f20970a
            boolean r7 = r8.mo25235a(r7, r6)
            r6.f20971a = r7
            return r7
        L_0x0046:
            r6.f20971a = r3
            goto L_0x004d
        L_0x0049:
            r6.f20966a = r0
            r6.f20972b = r1
        L_0x004d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.to0.mo25234e(android.view.View, android.view.MotionEvent):boolean");
    }
}
