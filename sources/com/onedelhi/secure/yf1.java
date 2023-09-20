package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

public final class yf1 {

    /* renamed from: a */
    public final C3994a f23035a;

    /* renamed from: com.onedelhi.secure.yf1$a */
    public interface C3994a {
        /* renamed from: a */
        boolean mo27447a(MotionEvent motionEvent);

        /* renamed from: b */
        boolean mo27448b();

        /* renamed from: c */
        void mo27449c(boolean z);

        /* renamed from: d */
        void mo27450d(GestureDetector.OnDoubleTapListener onDoubleTapListener);
    }

    /* renamed from: com.onedelhi.secure.yf1$b */
    public static class C3995b implements C3994a {

        /* renamed from: e */
        public static final int f23036e = ViewConfiguration.getTapTimeout();

        /* renamed from: f */
        public static final int f23037f = ViewConfiguration.getDoubleTapTimeout();

        /* renamed from: g */
        public static final int f23038g = 1;

        /* renamed from: h */
        public static final int f23039h = 2;

        /* renamed from: i */
        public static final int f23040i = 3;

        /* renamed from: a */
        public float f23041a;

        /* renamed from: a */
        public int f23042a;

        /* renamed from: a */
        public final Handler f23043a;

        /* renamed from: a */
        public GestureDetector.OnDoubleTapListener f23044a;

        /* renamed from: a */
        public final GestureDetector.OnGestureListener f23045a;

        /* renamed from: a */
        public MotionEvent f23046a;

        /* renamed from: a */
        public VelocityTracker f23047a;

        /* renamed from: a */
        public boolean f23048a;

        /* renamed from: b */
        public float f23049b;

        /* renamed from: b */
        public int f23050b;

        /* renamed from: b */
        public MotionEvent f23051b;

        /* renamed from: b */
        public boolean f23052b;

        /* renamed from: c */
        public float f23053c;

        /* renamed from: c */
        public int f23054c;

        /* renamed from: c */
        public boolean f23055c;

        /* renamed from: d */
        public float f23056d;

        /* renamed from: d */
        public int f23057d;

        /* renamed from: d */
        public boolean f23058d;

        /* renamed from: e */
        public boolean f23059e;

        /* renamed from: f */
        public boolean f23060f;

        /* renamed from: g */
        public boolean f23061g;

        /* renamed from: com.onedelhi.secure.yf1$b$a */
        public class C3996a extends Handler {
            public C3996a() {
            }

            public C3996a(Handler handler) {
                super(handler.getLooper());
            }

            public void handleMessage(Message message) {
                int i = message.what;
                if (i == 1) {
                    C3995b bVar = C3995b.this;
                    bVar.f23045a.onShowPress(bVar.f23046a);
                } else if (i == 2) {
                    C3995b.this.mo27453g();
                } else if (i == 3) {
                    C3995b bVar2 = C3995b.this;
                    GestureDetector.OnDoubleTapListener onDoubleTapListener = bVar2.f23044a;
                    if (onDoubleTapListener == null) {
                        return;
                    }
                    if (!bVar2.f23048a) {
                        onDoubleTapListener.onSingleTapConfirmed(bVar2.f23046a);
                    } else {
                        bVar2.f23052b = true;
                    }
                } else {
                    throw new RuntimeException("Unknown message " + message);
                }
            }
        }

        public C3995b(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            if (handler != null) {
                this.f23043a = new C3996a(handler);
            } else {
                this.f23043a = new C3996a();
            }
            this.f23045a = onGestureListener;
            if (onGestureListener instanceof GestureDetector.OnDoubleTapListener) {
                mo27450d((GestureDetector.OnDoubleTapListener) onGestureListener);
            }
            mo27454h(context);
        }

        /* JADX WARNING: Removed duplicated region for block: B:100:0x0208  */
        /* JADX WARNING: Removed duplicated region for block: B:103:0x021f  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo27447a(android.view.MotionEvent r13) {
            /*
                r12 = this;
                int r0 = r13.getAction()
                android.view.VelocityTracker r1 = r12.f23047a
                if (r1 != 0) goto L_0x000e
                android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
                r12.f23047a = r1
            L_0x000e:
                android.view.VelocityTracker r1 = r12.f23047a
                r1.addMovement(r13)
                r0 = r0 & 255(0xff, float:3.57E-43)
                r1 = 6
                r2 = 1
                r3 = 0
                if (r0 != r1) goto L_0x001c
                r4 = 1
                goto L_0x001d
            L_0x001c:
                r4 = 0
            L_0x001d:
                if (r4 == 0) goto L_0x0024
                int r5 = r13.getActionIndex()
                goto L_0x0025
            L_0x0024:
                r5 = -1
            L_0x0025:
                int r6 = r13.getPointerCount()
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
            L_0x002d:
                if (r8 >= r6) goto L_0x003f
                if (r5 != r8) goto L_0x0032
                goto L_0x003c
            L_0x0032:
                float r11 = r13.getX(r8)
                float r9 = r9 + r11
                float r11 = r13.getY(r8)
                float r10 = r10 + r11
            L_0x003c:
                int r8 = r8 + 1
                goto L_0x002d
            L_0x003f:
                if (r4 == 0) goto L_0x0044
                int r4 = r6 + -1
                goto L_0x0045
            L_0x0044:
                r4 = r6
            L_0x0045:
                float r4 = (float) r4
                float r9 = r9 / r4
                float r10 = r10 / r4
                r4 = 2
                r5 = 3
                if (r0 == 0) goto L_0x01bf
                r8 = 1000(0x3e8, float:1.401E-42)
                if (r0 == r2) goto L_0x0131
                if (r0 == r4) goto L_0x00ba
                if (r0 == r5) goto L_0x00b5
                r2 = 5
                if (r0 == r2) goto L_0x00a8
                if (r0 == r1) goto L_0x005b
                goto L_0x0250
            L_0x005b:
                r12.f23041a = r9
                r12.f23053c = r9
                r12.f23049b = r10
                r12.f23056d = r10
                android.view.VelocityTracker r0 = r12.f23047a
                int r1 = r12.f23057d
                float r1 = (float) r1
                r0.computeCurrentVelocity(r8, r1)
                int r0 = r13.getActionIndex()
                int r1 = r13.getPointerId(r0)
                android.view.VelocityTracker r2 = r12.f23047a
                float r2 = r2.getXVelocity(r1)
                android.view.VelocityTracker r4 = r12.f23047a
                float r1 = r4.getYVelocity(r1)
                r4 = 0
            L_0x0080:
                if (r4 >= r6) goto L_0x0250
                if (r4 != r0) goto L_0x0085
                goto L_0x00a5
            L_0x0085:
                int r5 = r13.getPointerId(r4)
                android.view.VelocityTracker r8 = r12.f23047a
                float r8 = r8.getXVelocity(r5)
                float r8 = r8 * r2
                android.view.VelocityTracker r9 = r12.f23047a
                float r5 = r9.getYVelocity(r5)
                float r5 = r5 * r1
                float r8 = r8 + r5
                int r5 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
                if (r5 >= 0) goto L_0x00a5
                android.view.VelocityTracker r13 = r12.f23047a
                r13.clear()
                goto L_0x0250
            L_0x00a5:
                int r4 = r4 + 1
                goto L_0x0080
            L_0x00a8:
                r12.f23041a = r9
                r12.f23053c = r9
                r12.f23049b = r10
                r12.f23056d = r10
                r12.mo27452f()
                goto L_0x0250
            L_0x00b5:
                r12.mo27451e()
                goto L_0x0250
            L_0x00ba:
                boolean r0 = r12.f23055c
                if (r0 == 0) goto L_0x00c0
                goto L_0x0250
            L_0x00c0:
                float r0 = r12.f23041a
                float r0 = r0 - r9
                float r1 = r12.f23049b
                float r1 = r1 - r10
                boolean r6 = r12.f23060f
                if (r6 == 0) goto L_0x00d3
                android.view.GestureDetector$OnDoubleTapListener r0 = r12.f23044a
                boolean r13 = r0.onDoubleTapEvent(r13)
                r3 = r3 | r13
                goto L_0x0250
            L_0x00d3:
                boolean r6 = r12.f23058d
                if (r6 == 0) goto L_0x0111
                float r6 = r12.f23053c
                float r6 = r9 - r6
                int r6 = (int) r6
                float r7 = r12.f23056d
                float r7 = r10 - r7
                int r7 = (int) r7
                int r6 = r6 * r6
                int r7 = r7 * r7
                int r6 = r6 + r7
                int r7 = r12.f23042a
                if (r6 <= r7) goto L_0x0108
                android.view.GestureDetector$OnGestureListener r7 = r12.f23045a
                android.view.MotionEvent r8 = r12.f23046a
                boolean r13 = r7.onScroll(r8, r13, r0, r1)
                r12.f23041a = r9
                r12.f23049b = r10
                r12.f23058d = r3
                android.os.Handler r0 = r12.f23043a
                r0.removeMessages(r5)
                android.os.Handler r0 = r12.f23043a
                r0.removeMessages(r2)
                android.os.Handler r0 = r12.f23043a
                r0.removeMessages(r4)
                goto L_0x0109
            L_0x0108:
                r13 = 0
            L_0x0109:
                int r0 = r12.f23042a
                if (r6 <= r0) goto L_0x01bc
                r12.f23059e = r3
                goto L_0x01bc
            L_0x0111:
                float r2 = java.lang.Math.abs(r0)
                r4 = 1065353216(0x3f800000, float:1.0)
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 >= 0) goto L_0x0123
                float r2 = java.lang.Math.abs(r1)
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 < 0) goto L_0x0250
            L_0x0123:
                android.view.GestureDetector$OnGestureListener r2 = r12.f23045a
                android.view.MotionEvent r3 = r12.f23046a
                boolean r3 = r2.onScroll(r3, r13, r0, r1)
                r12.f23041a = r9
                r12.f23049b = r10
                goto L_0x0250
            L_0x0131:
                r12.f23048a = r3
                android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r13)
                boolean r1 = r12.f23060f
                if (r1 == 0) goto L_0x0143
                android.view.GestureDetector$OnDoubleTapListener r1 = r12.f23044a
                boolean r13 = r1.onDoubleTapEvent(r13)
                r13 = r13 | r3
                goto L_0x019b
            L_0x0143:
                boolean r1 = r12.f23055c
                if (r1 == 0) goto L_0x014f
                android.os.Handler r13 = r12.f23043a
                r13.removeMessages(r5)
                r12.f23055c = r3
                goto L_0x0191
            L_0x014f:
                boolean r1 = r12.f23058d
                if (r1 == 0) goto L_0x0166
                android.view.GestureDetector$OnGestureListener r1 = r12.f23045a
                boolean r1 = r1.onSingleTapUp(r13)
                boolean r5 = r12.f23052b
                if (r5 == 0) goto L_0x0164
                android.view.GestureDetector$OnDoubleTapListener r5 = r12.f23044a
                if (r5 == 0) goto L_0x0164
                r5.onSingleTapConfirmed(r13)
            L_0x0164:
                r13 = r1
                goto L_0x019b
            L_0x0166:
                android.view.VelocityTracker r1 = r12.f23047a
                int r5 = r13.getPointerId(r3)
                int r6 = r12.f23057d
                float r6 = (float) r6
                r1.computeCurrentVelocity(r8, r6)
                float r6 = r1.getYVelocity(r5)
                float r1 = r1.getXVelocity(r5)
                float r5 = java.lang.Math.abs(r6)
                int r7 = r12.f23054c
                float r7 = (float) r7
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 > 0) goto L_0x0193
                float r5 = java.lang.Math.abs(r1)
                int r7 = r12.f23054c
                float r7 = (float) r7
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 <= 0) goto L_0x0191
                goto L_0x0193
            L_0x0191:
                r13 = 0
                goto L_0x019b
            L_0x0193:
                android.view.GestureDetector$OnGestureListener r5 = r12.f23045a
                android.view.MotionEvent r7 = r12.f23046a
                boolean r13 = r5.onFling(r7, r13, r1, r6)
            L_0x019b:
                android.view.MotionEvent r1 = r12.f23051b
                if (r1 == 0) goto L_0x01a2
                r1.recycle()
            L_0x01a2:
                r12.f23051b = r0
                android.view.VelocityTracker r0 = r12.f23047a
                if (r0 == 0) goto L_0x01ae
                r0.recycle()
                r0 = 0
                r12.f23047a = r0
            L_0x01ae:
                r12.f23060f = r3
                r12.f23052b = r3
                android.os.Handler r0 = r12.f23043a
                r0.removeMessages(r2)
                android.os.Handler r0 = r12.f23043a
                r0.removeMessages(r4)
            L_0x01bc:
                r3 = r13
                goto L_0x0250
            L_0x01bf:
                android.view.GestureDetector$OnDoubleTapListener r0 = r12.f23044a
                if (r0 == 0) goto L_0x01fb
                android.os.Handler r0 = r12.f23043a
                boolean r0 = r0.hasMessages(r5)
                if (r0 == 0) goto L_0x01d0
                android.os.Handler r1 = r12.f23043a
                r1.removeMessages(r5)
            L_0x01d0:
                android.view.MotionEvent r1 = r12.f23046a
                if (r1 == 0) goto L_0x01f3
                android.view.MotionEvent r6 = r12.f23051b
                if (r6 == 0) goto L_0x01f3
                if (r0 == 0) goto L_0x01f3
                boolean r0 = r12.mo27455i(r1, r6, r13)
                if (r0 == 0) goto L_0x01f3
                r12.f23060f = r2
                android.view.GestureDetector$OnDoubleTapListener r0 = r12.f23044a
                android.view.MotionEvent r1 = r12.f23046a
                boolean r0 = r0.onDoubleTap(r1)
                r0 = r0 | r3
                android.view.GestureDetector$OnDoubleTapListener r1 = r12.f23044a
                boolean r1 = r1.onDoubleTapEvent(r13)
                r0 = r0 | r1
                goto L_0x01fc
            L_0x01f3:
                android.os.Handler r0 = r12.f23043a
                int r1 = f23037f
                long r6 = (long) r1
                r0.sendEmptyMessageDelayed(r5, r6)
            L_0x01fb:
                r0 = 0
            L_0x01fc:
                r12.f23041a = r9
                r12.f23053c = r9
                r12.f23049b = r10
                r12.f23056d = r10
                android.view.MotionEvent r1 = r12.f23046a
                if (r1 == 0) goto L_0x020b
                r1.recycle()
            L_0x020b:
                android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r13)
                r12.f23046a = r1
                r12.f23058d = r2
                r12.f23059e = r2
                r12.f23048a = r2
                r12.f23055c = r3
                r12.f23052b = r3
                boolean r1 = r12.f23061g
                if (r1 == 0) goto L_0x0239
                android.os.Handler r1 = r12.f23043a
                r1.removeMessages(r4)
                android.os.Handler r1 = r12.f23043a
                android.view.MotionEvent r3 = r12.f23046a
                long r5 = r3.getDownTime()
                int r3 = f23036e
                long r7 = (long) r3
                long r5 = r5 + r7
                int r3 = android.view.ViewConfiguration.getLongPressTimeout()
                long r7 = (long) r3
                long r5 = r5 + r7
                r1.sendEmptyMessageAtTime(r4, r5)
            L_0x0239:
                android.os.Handler r1 = r12.f23043a
                android.view.MotionEvent r3 = r12.f23046a
                long r3 = r3.getDownTime()
                int r5 = f23036e
                long r5 = (long) r5
                long r3 = r3 + r5
                r1.sendEmptyMessageAtTime(r2, r3)
                android.view.GestureDetector$OnGestureListener r1 = r12.f23045a
                boolean r13 = r1.onDown(r13)
                r3 = r0 | r13
            L_0x0250:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.yf1.C3995b.mo27447a(android.view.MotionEvent):boolean");
        }

        /* renamed from: b */
        public boolean mo27448b() {
            return this.f23061g;
        }

        /* renamed from: c */
        public void mo27449c(boolean z) {
            this.f23061g = z;
        }

        /* renamed from: d */
        public void mo27450d(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
            this.f23044a = onDoubleTapListener;
        }

        /* renamed from: e */
        public final void mo27451e() {
            this.f23043a.removeMessages(1);
            this.f23043a.removeMessages(2);
            this.f23043a.removeMessages(3);
            this.f23047a.recycle();
            this.f23047a = null;
            this.f23060f = false;
            this.f23048a = false;
            this.f23058d = false;
            this.f23059e = false;
            this.f23052b = false;
            if (this.f23055c) {
                this.f23055c = false;
            }
        }

        /* renamed from: f */
        public final void mo27452f() {
            this.f23043a.removeMessages(1);
            this.f23043a.removeMessages(2);
            this.f23043a.removeMessages(3);
            this.f23060f = false;
            this.f23058d = false;
            this.f23059e = false;
            this.f23052b = false;
            if (this.f23055c) {
                this.f23055c = false;
            }
        }

        /* renamed from: g */
        public void mo27453g() {
            this.f23043a.removeMessages(3);
            this.f23052b = false;
            this.f23055c = true;
            this.f23045a.onLongPress(this.f23046a);
        }

        /* renamed from: h */
        public final void mo27454h(Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null");
            } else if (this.f23045a != null) {
                this.f23061g = true;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
                int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
                this.f23054c = viewConfiguration.getScaledMinimumFlingVelocity();
                this.f23057d = viewConfiguration.getScaledMaximumFlingVelocity();
                this.f23042a = scaledTouchSlop * scaledTouchSlop;
                this.f23050b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            } else {
                throw new IllegalArgumentException("OnGestureListener must not be null");
            }
        }

        /* renamed from: i */
        public final boolean mo27455i(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3) {
            if (!this.f23059e || motionEvent3.getEventTime() - motionEvent2.getEventTime() > ((long) f23037f)) {
                return false;
            }
            int x = ((int) motionEvent.getX()) - ((int) motionEvent3.getX());
            int y = ((int) motionEvent.getY()) - ((int) motionEvent3.getY());
            return (x * x) + (y * y) < this.f23050b;
        }
    }

    /* renamed from: com.onedelhi.secure.yf1$c */
    public static class C3997c implements C3994a {

        /* renamed from: a */
        public final GestureDetector f23063a;

        public C3997c(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            this.f23063a = new GestureDetector(context, onGestureListener, handler);
        }

        /* renamed from: a */
        public boolean mo27447a(MotionEvent motionEvent) {
            return this.f23063a.onTouchEvent(motionEvent);
        }

        /* renamed from: b */
        public boolean mo27448b() {
            return this.f23063a.isLongpressEnabled();
        }

        /* renamed from: c */
        public void mo27449c(boolean z) {
            this.f23063a.setIsLongpressEnabled(z);
        }

        /* renamed from: d */
        public void mo27450d(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
            this.f23063a.setOnDoubleTapListener(onDoubleTapListener);
        }
    }

    public yf1(@mr2 Context context, @mr2 GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, (Handler) null);
    }

    public yf1(@mr2 Context context, @mr2 GestureDetector.OnGestureListener onGestureListener, @ts2 Handler handler) {
        this.f23035a = new C3997c(context, onGestureListener, handler);
    }

    /* renamed from: a */
    public boolean mo27443a() {
        return this.f23035a.mo27448b();
    }

    /* renamed from: b */
    public boolean mo27444b(@mr2 MotionEvent motionEvent) {
        return this.f23035a.mo27447a(motionEvent);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    /* renamed from: c */
    public void mo27445c(boolean z) {
        this.f23035a.mo27449c(z);
    }

    /* renamed from: d */
    public void mo27446d(@ts2 GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f23035a.mo27450d(onDoubleTapListener);
    }
}
