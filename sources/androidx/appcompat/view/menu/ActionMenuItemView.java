package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.view.menu.C0248e;
import androidx.appcompat.view.menu.C0260k;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.la1;
import com.onedelhi.secure.my3;
import com.onedelhi.secure.of4;
import com.onedelhi.secure.za3;

@hl3({hl3.C2354a.f13188c})
public class ActionMenuItemView extends AppCompatTextView implements C0260k.C0261a, View.OnClickListener, ActionMenuView.C0272a {

    /* renamed from: b */
    public static final String f995b = "ActionMenuItemView";

    /* renamed from: q */
    public static final int f996q = 32;

    /* renamed from: a */
    public Drawable f997a;

    /* renamed from: a */
    public C0236b f998a;

    /* renamed from: a */
    public C0248e.C0250b f999a;

    /* renamed from: a */
    public C0253h f1000a;

    /* renamed from: a */
    public la1 f1001a;

    /* renamed from: a */
    public CharSequence f1002a;

    /* renamed from: c */
    public boolean f1003c;

    /* renamed from: d */
    public boolean f1004d;

    /* renamed from: n */
    public int f1005n;

    /* renamed from: o */
    public int f1006o;

    /* renamed from: p */
    public int f1007p;

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$a */
    public class C0235a extends la1 {
        public C0235a() {
            super(ActionMenuItemView.this);
        }

        /* renamed from: b */
        public my3 mo1194b() {
            C0236b bVar = ActionMenuItemView.this.f998a;
            if (bVar != null) {
                return bVar.mo1196a();
            }
            return null;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
            r0 = mo1194b();
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo1195c() {
            /*
                r3 = this;
                androidx.appcompat.view.menu.ActionMenuItemView r0 = androidx.appcompat.view.menu.ActionMenuItemView.this
                androidx.appcompat.view.menu.e$b r1 = r0.f999a
                r2 = 0
                if (r1 == 0) goto L_0x001c
                androidx.appcompat.view.menu.h r0 = r0.f1000a
                boolean r0 = r1.mo1197a(r0)
                if (r0 == 0) goto L_0x001c
                com.onedelhi.secure.my3 r0 = r3.mo1194b()
                if (r0 == 0) goto L_0x001c
                boolean r0 = r0.mo1238c()
                if (r0 == 0) goto L_0x001c
                r2 = 1
            L_0x001c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ActionMenuItemView.C0235a.mo1195c():boolean");
        }
    }

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$b */
    public static abstract class C0236b {
        /* renamed from: a */
        public abstract my3 mo1196a();
    }

    public ActionMenuItemView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f1003c = mo1178i();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, za3.C4068m.ActionMenuItemView, i, 0);
        this.f1005n = obtainStyledAttributes.getDimensionPixelSize(za3.C4068m.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.f1007p = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1006o = -1;
        setSaveEnabled(false);
    }

    /* renamed from: a */
    public boolean mo1170a() {
        return mo1177h();
    }

    /* renamed from: b */
    public void mo1171b(C0253h hVar, int i) {
        this.f1000a = hVar;
        setIcon(hVar.getIcon());
        setTitle(hVar.mo1428n(this));
        setId(hVar.getItemId());
        setVisibility(hVar.isVisible() ? 0 : 8);
        setEnabled(hVar.isEnabled());
        if (hVar.hasSubMenu() && this.f1001a == null) {
            this.f1001a = new C0235a();
        }
    }

    /* renamed from: d */
    public boolean mo1172d() {
        return true;
    }

    /* renamed from: e */
    public boolean mo1173e() {
        return mo1177h() && this.f1000a.getIcon() == null;
    }

    /* renamed from: f */
    public boolean mo1174f() {
        return true;
    }

    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    public C0253h getItemData() {
        return this.f1000a;
    }

    /* renamed from: h */
    public boolean mo1177h() {
        return !TextUtils.isEmpty(getText());
    }

    /* renamed from: i */
    public final boolean mo1178i() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    /* renamed from: j */
    public final void mo1179j() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f1002a);
        if (this.f997a != null && (!this.f1000a.mo1388G() || (!this.f1003c && !this.f1004d))) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence = null;
        setText(z3 ? this.f1002a : null);
        CharSequence contentDescription = this.f1000a.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            contentDescription = z3 ? null : this.f1000a.getTitle();
        }
        setContentDescription(contentDescription);
        CharSequence tooltipText = this.f1000a.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z3) {
                charSequence = this.f1000a.getTitle();
            }
            of4.m23742a(this, charSequence);
            return;
        }
        of4.m23742a(this, tooltipText);
    }

    public void onClick(View view) {
        C0248e.C0250b bVar = this.f999a;
        if (bVar != null) {
            bVar.mo1197a(this.f1000a);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1003c = mo1178i();
        mo1179j();
    }

    public void onMeasure(int i, int i2) {
        int i3;
        boolean h = mo1177h();
        if (h && (i3 = this.f1006o) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f1005n) : this.f1005n;
        if (mode != 1073741824 && this.f1005n > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (!h && this.f997a != null) {
            super.setPadding((getMeasuredWidth() - this.f997a.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        la1 la1;
        if (!this.f1000a.hasSubMenu() || (la1 = this.f1001a) == null || !la1.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f1004d != z) {
            this.f1004d = z;
            C0253h hVar = this.f1000a;
            if (hVar != null) {
                hVar.mo1397g();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f997a = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f1007p;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i) / ((float) intrinsicWidth)));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i) / ((float) intrinsicHeight)));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        mo1179j();
    }

    public void setItemInvoker(C0248e.C0250b bVar) {
        this.f999a = bVar;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.f1006o = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(C0236b bVar) {
        this.f998a = bVar;
    }

    public void setShortcut(boolean z, char c) {
    }

    public void setTitle(CharSequence charSequence) {
        this.f1002a = charSequence;
        mo1179j();
    }
}
