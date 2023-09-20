package com.onedelhi.secure;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

public class iv2 implements View.OnTouchListener {

    /* renamed from: a */
    public final GestureDetector f30476a;

    /* renamed from: com.onedelhi.secure.iv2$b */
    public final class C5750b extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a */
        public static final int f30477a = 100;

        /* renamed from: b */
        public static final int f30478b = 100;

        public C5750b() {
        }

        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            float x = motionEvent2.getX() - motionEvent.getX();
            float y = motionEvent2.getY() - motionEvent.getY();
            if (Math.abs(x) <= Math.abs(y) || Math.abs(x) <= 100.0f || Math.abs(f) <= 100.0f) {
                if (Math.abs(y) <= 100.0f || Math.abs(f2) <= 100.0f) {
                    return false;
                }
                if (y > 0.0f) {
                    iv2.this.mo38258b();
                    return false;
                }
                iv2.this.mo38261e();
                return false;
            } else if (x > 0.0f) {
                iv2.this.mo38260d();
                return true;
            } else {
                iv2.this.mo38259c();
                return true;
            }
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            iv2.this.mo38257a();
            return true;
        }
    }

    public iv2(Context context) {
        this.f30476a = new GestureDetector(context, new C5750b());
    }

    /* renamed from: a */
    public void mo38257a() {
    }

    /* renamed from: b */
    public void mo38258b() {
    }

    /* renamed from: c */
    public void mo38259c() {
    }

    /* renamed from: d */
    public void mo38260d() {
    }

    /* renamed from: e */
    public void mo38261e() {
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f30476a.onTouchEvent(motionEvent);
    }
}
