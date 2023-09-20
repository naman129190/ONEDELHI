package easypay.appinvoke.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.AppCompatEditText;
import com.onedelhi.secure.d10;
import com.onedelhi.secure.de3;
import com.onedelhi.secure.hb4;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.to1;
import com.onedelhi.secure.ts2;
import java.util.Locale;

public class OtpEditText extends AppCompatEditText {

    /* renamed from: c */
    public static final String f38728c = "OtpEditText";

    /* renamed from: a */
    public float f38729a = 24.0f;

    /* renamed from: a */
    public ColorStateList f38730a;

    /* renamed from: a */
    public Paint f38731a;

    /* renamed from: a */
    public Rect f38732a = new Rect();

    /* renamed from: a */
    public Drawable f38733a;

    /* renamed from: a */
    public View.OnClickListener f38734a;

    /* renamed from: a */
    public View.OnLongClickListener f38735a;

    /* renamed from: a */
    public C7597i f38736a = null;

    /* renamed from: a */
    public C7598j f38737a = null;

    /* renamed from: a */
    public StringBuilder f38738a = null;

    /* renamed from: a */
    public float[] f38739a;

    /* renamed from: a */
    public RectF[] f38740a;

    /* renamed from: b */
    public float f38741b;

    /* renamed from: b */
    public Paint f38742b;

    /* renamed from: b */
    public String f38743b = null;

    /* renamed from: b */
    public boolean f38744b = false;

    /* renamed from: b */
    public float[] f38745b;

    /* renamed from: c */
    public float f38746c = 6.0f;

    /* renamed from: c */
    public Paint f38747c;

    /* renamed from: c */
    public boolean f38748c = false;

    /* renamed from: d */
    public float f38749d = 8.0f;

    /* renamed from: d */
    public boolean f38750d = false;

    /* renamed from: e */
    public float f38751e = 1.0f;

    /* renamed from: e */
    public boolean f38752e = false;

    /* renamed from: f */
    public float f38753f = 2.0f;

    /* renamed from: f */
    public boolean f38754f = false;

    /* renamed from: g */
    public boolean f38755g = true;

    /* renamed from: n */
    public int f38756n = 6;

    /* renamed from: o */
    public int f38757o = 0;

    /* renamed from: p */
    public int f38758p = 0;
    @d10

    /* renamed from: q */
    public int f38759q = 0;
    @d10

    /* renamed from: r */
    public int f38760r;
    @d10

    /* renamed from: s */
    public int f38761s;
    @d10

    /* renamed from: t */
    public int f38762t;
    @d10

    /* renamed from: u */
    public int f38763u;

    /* renamed from: easypay.appinvoke.widget.OtpEditText$a */
    public class C7589a implements ActionMode.Callback {
        public C7589a() {
        }

        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return false;
        }

        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }

        public void onDestroyActionMode(ActionMode actionMode) {
        }

        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }
    }

    /* renamed from: easypay.appinvoke.widget.OtpEditText$b */
    public class C7590b implements View.OnClickListener {
        public C7590b() {
        }

        public void onClick(View view) {
            OtpEditText otpEditText = OtpEditText.this;
            otpEditText.setSelection(otpEditText.getText().length());
            View.OnClickListener onClickListener = OtpEditText.this.f38734a;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* renamed from: easypay.appinvoke.widget.OtpEditText$c */
    public class C7591c implements View.OnLongClickListener {
        public C7591c() {
        }

        public boolean onLongClick(View view) {
            OtpEditText otpEditText = OtpEditText.this;
            otpEditText.setSelection(otpEditText.getText().length());
            View.OnLongClickListener onLongClickListener = OtpEditText.this.f38735a;
            if (onLongClickListener == null) {
                return false;
            }
            return onLongClickListener.onLongClick(view);
        }
    }

    /* renamed from: easypay.appinvoke.widget.OtpEditText$d */
    public class C7592d implements ValueAnimator.AnimatorUpdateListener {
        public C7592d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            OtpEditText.this.f38742b.setTextSize(((Float) valueAnimator.getAnimatedValue()).floatValue());
            OtpEditText.this.invalidate();
        }
    }

    /* renamed from: easypay.appinvoke.widget.OtpEditText$e */
    public class C7593e implements Animator.AnimatorListener {
        public C7593e() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            OtpEditText otpEditText = OtpEditText.this;
            otpEditText.f38736a.mo48858a(otpEditText.getText());
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: easypay.appinvoke.widget.OtpEditText$f */
    public class C7594f implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ int f38769a;

        public C7594f(int i) {
            this.f38769a = i;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            OtpEditText.this.f38745b[this.f38769a] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            OtpEditText.this.invalidate();
        }
    }

    /* renamed from: easypay.appinvoke.widget.OtpEditText$g */
    public class C7595g implements ValueAnimator.AnimatorUpdateListener {
        public C7595g() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            OtpEditText.this.f38742b.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* renamed from: easypay.appinvoke.widget.OtpEditText$h */
    public class C7596h implements Animator.AnimatorListener {
        public C7596h() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            OtpEditText otpEditText = OtpEditText.this;
            otpEditText.f38736a.mo48858a(otpEditText.getText());
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: easypay.appinvoke.widget.OtpEditText$i */
    public interface C7597i {
        /* renamed from: a */
        void mo48858a(CharSequence charSequence);
    }

    /* renamed from: easypay.appinvoke.widget.OtpEditText$j */
    public interface C7598j {
        /* renamed from: a */
        void mo48859a();

        /* renamed from: b */
        void mo48860b();
    }

    public OtpEditText(Context context) {
        super(context);
    }

    public OtpEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo48824l(context, attributeSet);
    }

    public OtpEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo48824l(context, attributeSet);
    }

    @TargetApi(21)
    public OtpEditText(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        mo48824l(context, attributeSet);
    }

    private CharSequence getFullText() {
        return this.f38743b == null ? getText() : getMaskChars();
    }

    private StringBuilder getMaskChars() {
        if (this.f38738a == null) {
            this.f38738a = new StringBuilder();
        }
        int length = getText().length();
        while (this.f38738a.length() != length) {
            if (this.f38738a.length() < length) {
                this.f38738a.append(this.f38743b);
            } else {
                StringBuilder sb = this.f38738a;
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        return this.f38738a;
    }

    /* renamed from: d */
    public void mo48815d() {
        this.f38754f = true;
        this.f38752e = true;
        this.f38731a.setColor(this.f38759q);
        this.f38742b.setColor(this.f38759q);
        invalidate();
        if (!this.f38750d) {
            return;
        }
        if (this.f38758p == 0) {
            mo48820h();
        } else {
            mo48817f();
        }
    }

    /* renamed from: e */
    public final void mo48816e(CharSequence charSequence, int i) {
        float[] fArr = this.f38745b;
        fArr[i] = this.f38740a[i].bottom - this.f38749d;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{fArr[i] + getPaint().getTextSize(), this.f38745b[i]});
        ofFloat.setDuration(300);
        ofFloat.setInterpolator(new OvershootInterpolator());
        ofFloat.addUpdateListener(new C7594f(i));
        this.f38742b.setAlpha(255);
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 255});
        ofInt.setDuration(300);
        ofInt.addUpdateListener(new C7595g());
        AnimatorSet animatorSet = new AnimatorSet();
        if (charSequence.length() == this.f38756n && this.f38736a != null) {
            animatorSet.addListener(new C7596h());
        }
        animatorSet.playTogether(new Animator[]{ofFloat, ofInt});
        animatorSet.start();
    }

    /* renamed from: f */
    public final void mo48817f() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(1000);
        animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(this, "translationY", new float[]{0.0f, 0.0f, -30.0f, 0.0f, -15.0f, 0.0f, 0.0f})});
        animatorSet.start();
    }

    /* renamed from: g */
    public final void mo48818g() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, getPaint().getTextSize()});
        ofFloat.setDuration(200);
        ofFloat.setInterpolator(new OvershootInterpolator());
        ofFloat.addUpdateListener(new C7592d());
        if (getText().length() == this.f38756n && this.f38736a != null) {
            ofFloat.addListener(new C7593e());
        }
        ofFloat.start();
    }

    public CharSequence getError() {
        return super.getError();
    }

    /* renamed from: h */
    public final void mo48820h() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(1000);
        animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(this, "translationX", new float[]{0.0f, 25.0f, -25.0f, 25.0f, -25.0f, 15.0f, -15.0f, 6.0f, -6.0f, 0.0f})});
        animatorSet.start();
    }

    /* renamed from: i */
    public void mo48821i(boolean z) {
        this.f38748c = z;
    }

    /* renamed from: j */
    public final int mo48822j(int i) {
        return (int) TypedValue.applyDimension(1, (float) i, getContext().getApplicationContext().getResources().getDisplayMetrics());
    }

    /* renamed from: k */
    public void mo48823k() {
        requestFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(this, 0);
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: l */
    public final void mo48824l(Context context, AttributeSet attributeSet) {
        float f = context.getResources().getDisplayMetrics().density;
        this.f38751e *= f;
        this.f38753f *= f;
        this.f38729a *= f;
        this.f38749d = f * this.f38749d;
        boolean z = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, de3.C5013n.OtpEditText, 0, 0);
        try {
            TypedValue typedValue = new TypedValue();
            obtainStyledAttributes.getValue(de3.C5013n.OtpEditText_otpInputAnimStyle, typedValue);
            this.f38757o = typedValue.data;
            obtainStyledAttributes.getValue(de3.C5013n.OtpEditText_otpErrorAnimStyle, typedValue);
            this.f38758p = typedValue.data;
            this.f38751e = obtainStyledAttributes.getDimension(de3.C5013n.OtpEditText_otpStrokeLineHeight, this.f38751e);
            this.f38753f = obtainStyledAttributes.getDimension(de3.C5013n.OtpEditText_otpStrokeLineSelectedHeight, this.f38753f);
            this.f38729a = obtainStyledAttributes.getDimension(de3.C5013n.OtpEditText_otpCharacterSpacing, this.f38729a);
            this.f38749d = obtainStyledAttributes.getDimension(de3.C5013n.OtpEditText_otpTextBottomLinePadding, this.f38749d);
            this.f38744b = obtainStyledAttributes.getBoolean(de3.C5013n.OtpEditText_otpBackgroundIsSquare, this.f38744b);
            this.f38733a = obtainStyledAttributes.getDrawable(de3.C5013n.OtpEditText_otpBackgroundDrawable);
            this.f38759q = obtainStyledAttributes.getColor(de3.C5013n.OtpEditText_otpErrorTextColor, -7829368);
            this.f38763u = obtainStyledAttributes.getColor(de3.C5013n.OtpEditText_otpLineErrorColor, getTextColors().getColorForState(new int[]{16842914}, Color.parseColor("#fd5c5c")));
            this.f38761s = obtainStyledAttributes.getColor(de3.C5013n.OtpEditText_otpLineFocusedColor, getTextColors().getColorForState(new int[]{16842908}, -12303292));
            this.f38762t = obtainStyledAttributes.getColor(de3.C5013n.OtpEditText_otpLineNextCharColor, getTextColors().getColorForState(new int[]{16842908}, -12303292));
            this.f38760r = obtainStyledAttributes.getColor(de3.C5013n.OtpEditText_otpLineUnFocusedColor, getTextColors().getColorForState(new int[]{16842914}, -7829368));
            obtainStyledAttributes.recycle();
            this.f38731a = new Paint(getPaint());
            this.f38742b = new Paint(getPaint());
            Paint paint = new Paint(getPaint());
            this.f38747c = paint;
            paint.setStrokeWidth(this.f38751e);
            setBackgroundResource(0);
            int attributeIntValue = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLength", 6);
            this.f38756n = attributeIntValue;
            float f2 = (float) attributeIntValue;
            this.f38746c = f2;
            this.f38739a = new float[((int) f2)];
            super.setCustomSelectionActionModeCallback(new C7589a());
            super.setOnClickListener(new C7590b());
            super.setOnLongClickListener(new C7591c());
            if ((getInputType() & 128) == 128 || (getInputType() & 16) == 16) {
                this.f38743b = "●";
            }
            if (!TextUtils.isEmpty(this.f38743b)) {
                this.f38738a = getMaskChars();
            }
            getPaint().getTextBounds(to1.f35743f, 0, 1, this.f38732a);
            this.f38748c = this.f38757o > -1;
            if (this.f38758p > -1) {
                z = true;
            }
            this.f38750d = z;
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: m */
    public boolean mo48825m() {
        return this.f38755g;
    }

    /* renamed from: n */
    public boolean mo48826n() {
        return this.f38752e;
    }

    /* renamed from: o */
    public final void mo48827o(int i, int i2) {
        Paint paint;
        int i3;
        int i4;
        if (this.f38752e) {
            paint = this.f38747c;
            i3 = this.f38763u;
        } else {
            if (isFocused()) {
                this.f38747c.setStrokeWidth(this.f38753f);
                if (i == i2 || (i2 == (i4 = this.f38756n) && i == i4 - 1 && this.f38755g)) {
                    paint = this.f38747c;
                    i3 = this.f38762t;
                } else if (i < i2) {
                    paint = this.f38747c;
                    i3 = this.f38761s;
                }
            } else {
                this.f38747c.setStrokeWidth(this.f38751e);
            }
            paint = this.f38747c;
            i3 = this.f38760r;
        }
        paint.setColor(i3);
    }

    public void onDraw(Canvas canvas) {
        Paint paint;
        float f;
        float f2;
        int i;
        CharSequence fullText = getFullText();
        int length = fullText.length();
        float[] fArr = this.f38739a;
        if (length > fArr.length) {
            length = fArr.length;
        }
        int i2 = length;
        getPaint().getTextWidths(fullText, 0, i2, this.f38739a);
        int i3 = 0;
        while (((float) i3) < this.f38746c) {
            if (this.f38733a != null) {
                boolean z = true;
                boolean z2 = i3 < i2;
                if (i3 != i2) {
                    z = false;
                }
                mo48831p(z2, z);
                Drawable drawable = this.f38733a;
                RectF[] rectFArr = this.f38740a;
                drawable.setBounds((int) rectFArr[i3].left, (int) rectFArr[i3].top, (int) rectFArr[i3].right, (int) rectFArr[i3].bottom);
                this.f38733a.draw(canvas);
            }
            float f3 = this.f38740a[i3].left + (this.f38741b / 2.0f);
            if (i2 > i3) {
                if (!this.f38748c || i3 != i2 - 1) {
                    i = i3 + 1;
                    f2 = f3 - (this.f38739a[i3] / 2.0f);
                    f = this.f38745b[i3];
                    paint = this.f38731a;
                } else {
                    i = i3 + 1;
                    f2 = f3 - (this.f38739a[i3] / 2.0f);
                    f = this.f38745b[i3];
                    paint = this.f38742b;
                }
                canvas.drawText(fullText, i3, i, f2, f, paint);
            }
            if (this.f38733a == null) {
                mo48827o(i3, i2);
                RectF[] rectFArr2 = this.f38740a;
                canvas.drawLine(rectFArr2[i3].left, rectFArr2[i3].top, rectFArr2[i3].right, rectFArr2[i3].bottom, this.f38747c);
            }
            i3++;
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        float f;
        int i5;
        super.onSizeChanged(i, i2, i3, i4);
        ColorStateList textColors = getTextColors();
        this.f38730a = textColors;
        if (textColors != null) {
            this.f38742b.setColor(textColors.getDefaultColor());
            this.f38731a.setColor(this.f38730a.getDefaultColor());
        }
        int width = (getWidth() - jt4.m18968j0(this)) - jt4.m18972k0(this);
        float f2 = this.f38729a;
        float f3 = (float) width;
        if (f2 < 0.0f) {
            f = f3 / ((this.f38746c * 2.0f) - 1.0f);
        } else {
            float f4 = this.f38746c;
            f = ((f3 - (f2 * (f4 - 1.0f))) / f4) + ((float) mo48822j(2));
        }
        this.f38741b = f;
        float f5 = this.f38746c;
        this.f38740a = new RectF[((int) f5)];
        this.f38745b = new float[((int) f5)];
        int height = getHeight() - getPaddingBottom();
        int i6 = 1;
        if (hb4.m16618b(Locale.getDefault()) == 1) {
            i6 = -1;
            i5 = (int) (((float) (getWidth() - jt4.m18972k0(this))) - this.f38741b);
        } else {
            i5 = jt4.m18972k0(this) + mo48822j(2);
        }
        for (int i7 = 0; ((float) i7) < this.f38746c; i7++) {
            float f6 = (float) i5;
            float f7 = (float) height;
            this.f38740a[i7] = new RectF(f6, f7, this.f38741b + f6, f7);
            if (this.f38733a != null) {
                if (this.f38744b) {
                    this.f38740a[i7].top = (float) getPaddingTop();
                    RectF[] rectFArr = this.f38740a;
                    rectFArr[i7].right = rectFArr[i7].height() + f6;
                } else {
                    this.f38740a[i7].top -= ((float) this.f38732a.height()) + (this.f38749d * 2.0f);
                }
            }
            float f8 = this.f38729a;
            i5 = (int) (f8 < 0.0f ? f6 + (((float) i6) * this.f38741b * 2.0f) : f6 + (((float) i6) * (this.f38741b + f8)));
            this.f38745b[i7] = this.f38740a[i7].bottom - this.f38749d;
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        setError(false);
        C7598j jVar = this.f38737a;
        if (jVar != null) {
            jVar.mo48860b();
        }
        if (this.f38754f || this.f38752e) {
            this.f38754f = false;
            this.f38752e = false;
            ColorStateList colorStateList = this.f38730a;
            if (colorStateList != null) {
                this.f38742b.setColor(colorStateList.getDefaultColor());
                this.f38731a.setColor(this.f38730a.getDefaultColor());
            }
        }
        if (this.f38740a != null && this.f38748c) {
            int i4 = this.f38757o;
            if (i4 == -1) {
                invalidate();
            } else if (i3 <= i2) {
            } else {
                if (i4 == 0) {
                    mo48818g();
                } else {
                    mo48816e(charSequence, i);
                }
            }
        } else if (this.f38736a != null && charSequence.length() == this.f38756n) {
            this.f38736a.mo48858a(charSequence);
        }
    }

    public boolean onTextContextMenuItem(int i) {
        boolean onTextContextMenuItem = super.onTextContextMenuItem(i);
        if (i == 16908322) {
            this.f38737a.mo48859a();
        }
        return onTextContextMenuItem;
    }

    /* renamed from: p */
    public void mo48831p(boolean z, boolean z2) {
        if (this.f38752e) {
            this.f38733a.setState(new int[]{16842914});
        } else if (isFocused()) {
            this.f38733a.setState(new int[]{16842908});
            if (z2) {
                this.f38733a.setState(new int[]{16842908, 16842913});
            } else if (z) {
                this.f38733a.setState(new int[]{16842908, 16842912});
            }
        } else {
            this.f38733a.setState(new int[]{-16842908});
        }
    }

    public void setActive(boolean z) {
        this.f38755g = z;
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        throw new RuntimeException("setCustomSelectionActionModeCallback() is not allowed.");
    }

    public void setError(CharSequence charSequence) {
        Log.e(f38728c, "setError(CharSequence error) is not supported");
    }

    public void setError(CharSequence charSequence, Drawable drawable) {
        Log.e(f38728c, "setError(CharSequence error, Drawable icon) is not supported");
    }

    public void setError(boolean z) {
        this.f38752e = z;
    }

    public void setMaxLength(int i) {
        this.f38756n = i;
        float f = (float) i;
        this.f38746c = f;
        this.f38739a = new float[((int) f)];
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
        setText((CharSequence) null);
        invalidate();
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f38734a = onClickListener;
    }

    public void setOnLongClickListener(@ts2 View.OnLongClickListener onLongClickListener) {
        this.f38735a = onLongClickListener;
    }

    public void setOnPinEnteredListener(C7597i iVar) {
        this.f38736a = iVar;
    }

    public void setOnTextChangedListener(C7598j jVar) {
        this.f38737a = jVar;
    }
}
