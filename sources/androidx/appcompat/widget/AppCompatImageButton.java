package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import com.onedelhi.secure.C1765b8;
import com.onedelhi.secure.C2837m8;
import com.onedelhi.secure.bf4;
import com.onedelhi.secure.dp0;
import com.onedelhi.secure.ff4;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.qb4;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.xe4;
import com.onedelhi.secure.za3;

public class AppCompatImageButton extends ImageButton implements bf4, ff4 {

    /* renamed from: a */
    public final C1765b8 f1354a;

    /* renamed from: a */
    public final C2837m8 f1355a;

    /* renamed from: b */
    public boolean f1356b;

    public AppCompatImageButton(@mr2 Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatImageButton(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, za3.C4057b.imageButtonStyle);
    }

    public AppCompatImageButton(@mr2 Context context, @ts2 AttributeSet attributeSet, int i) {
        super(xe4.m31415b(context), attributeSet, i);
        this.f1356b = false;
        qb4.m25632a(this, getContext());
        C1765b8 b8Var = new C1765b8(this);
        this.f1354a = b8Var;
        b8Var.mo13523e(attributeSet, i);
        C2837m8 m8Var = new C2837m8(this);
        this.f1355a = m8Var;
        m8Var.mo20175g(attributeSet, i);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1765b8 b8Var = this.f1354a;
        if (b8Var != null) {
            b8Var.mo13520b();
        }
        C2837m8 m8Var = this.f1355a;
        if (m8Var != null) {
            m8Var.mo20171c();
        }
    }

    @ts2
    @hl3({hl3.C2354a.f13188c})
    public ColorStateList getSupportBackgroundTintList() {
        C1765b8 b8Var = this.f1354a;
        if (b8Var != null) {
            return b8Var.mo13521c();
        }
        return null;
    }

    @ts2
    @hl3({hl3.C2354a.f13188c})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1765b8 b8Var = this.f1354a;
        if (b8Var != null) {
            return b8Var.mo13522d();
        }
        return null;
    }

    @ts2
    @hl3({hl3.C2354a.f13188c})
    public ColorStateList getSupportImageTintList() {
        C2837m8 m8Var = this.f1355a;
        if (m8Var != null) {
            return m8Var.mo20172d();
        }
        return null;
    }

    @ts2
    @hl3({hl3.C2354a.f13188c})
    public PorterDuff.Mode getSupportImageTintMode() {
        C2837m8 m8Var = this.f1355a;
        if (m8Var != null) {
            return m8Var.mo20173e();
        }
        return null;
    }

    public boolean hasOverlappingRendering() {
        return this.f1355a.mo20174f() && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(@ts2 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1765b8 b8Var = this.f1354a;
        if (b8Var != null) {
            b8Var.mo13524f(drawable);
        }
    }

    public void setBackgroundResource(@dp0 int i) {
        super.setBackgroundResource(i);
        C1765b8 b8Var = this.f1354a;
        if (b8Var != null) {
            b8Var.mo13525g(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C2837m8 m8Var = this.f1355a;
        if (m8Var != null) {
            m8Var.mo20171c();
        }
    }

    public void setImageDrawable(@ts2 Drawable drawable) {
        C2837m8 m8Var = this.f1355a;
        if (!(m8Var == null || drawable == null || this.f1356b)) {
            m8Var.mo20176h(drawable);
        }
        super.setImageDrawable(drawable);
        C2837m8 m8Var2 = this.f1355a;
        if (m8Var2 != null) {
            m8Var2.mo20171c();
            if (!this.f1356b) {
                this.f1355a.mo20170b();
            }
        }
    }

    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f1356b = true;
    }

    public void setImageResource(@dp0 int i) {
        this.f1355a.mo20177i(i);
    }

    public void setImageURI(@ts2 Uri uri) {
        super.setImageURI(uri);
        C2837m8 m8Var = this.f1355a;
        if (m8Var != null) {
            m8Var.mo20171c();
        }
    }

    @hl3({hl3.C2354a.f13188c})
    public void setSupportBackgroundTintList(@ts2 ColorStateList colorStateList) {
        C1765b8 b8Var = this.f1354a;
        if (b8Var != null) {
            b8Var.mo13527i(colorStateList);
        }
    }

    @hl3({hl3.C2354a.f13188c})
    public void setSupportBackgroundTintMode(@ts2 PorterDuff.Mode mode) {
        C1765b8 b8Var = this.f1354a;
        if (b8Var != null) {
            b8Var.mo13528j(mode);
        }
    }

    @hl3({hl3.C2354a.f13188c})
    public void setSupportImageTintList(@ts2 ColorStateList colorStateList) {
        C2837m8 m8Var = this.f1355a;
        if (m8Var != null) {
            m8Var.mo20179k(colorStateList);
        }
    }

    @hl3({hl3.C2354a.f13188c})
    public void setSupportImageTintMode(@ts2 PorterDuff.Mode mode) {
        C2837m8 m8Var = this.f1355a;
        if (m8Var != null) {
            m8Var.mo20180l(mode);
        }
    }
}
