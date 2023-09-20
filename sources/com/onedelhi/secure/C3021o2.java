package com.onedelhi.secure;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* renamed from: com.onedelhi.secure.o2 */
public class C3021o2 extends Drawable {

    /* renamed from: a */
    public final ActionBarContainer f17646a;

    @sj3(21)
    /* renamed from: com.onedelhi.secure.o2$a */
    public static class C3022a {
        /* renamed from: a */
        public static void m23282a(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }
    }

    public C3021o2(ActionBarContainer actionBarContainer) {
        this.f17646a = actionBarContainer;
    }

    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f17646a;
        if (actionBarContainer.f1222c) {
            Drawable drawable = actionBarContainer.f1220c;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f1215a;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f17646a;
        Drawable drawable3 = actionBarContainer2.f1217b;
        if (drawable3 != null && actionBarContainer2.f1223d) {
            drawable3.draw(canvas);
        }
    }

    public int getOpacity() {
        return 0;
    }

    @sj3(21)
    public void getOutline(@mr2 Outline outline) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.f17646a;
        if (!actionBarContainer.f1222c) {
            drawable = actionBarContainer.f1215a;
            if (drawable == null) {
                return;
            }
        } else if (actionBarContainer.f1220c != null) {
            drawable = actionBarContainer.f1215a;
        } else {
            return;
        }
        C3022a.m23282a(drawable, outline);
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
