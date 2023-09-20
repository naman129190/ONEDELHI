package com.google.android.material.slider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.onedelhi.secure.C6582qj;
import com.onedelhi.secure.C6703rj;
import com.onedelhi.secure.a12;
import com.onedelhi.secure.dp0;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.js1;
import com.onedelhi.secure.k10;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ob4;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.yk0;
import com.onedelhi.secure.zk0;
import java.util.ArrayList;
import java.util.List;

public class RangeSlider extends BaseSlider<RangeSlider, C4187b, C4188c> {

    /* renamed from: I */
    public int f24319I;

    /* renamed from: f */
    public float f24320f;

    /* renamed from: com.google.android.material.slider.RangeSlider$b */
    public interface C4187b extends C6582qj<RangeSlider> {
        /* renamed from: a */
        /* bridge */ /* synthetic */ void mo28780a(@mr2 Object obj, float f, boolean z);

        /* renamed from: b */
        void mo28781b(@mr2 RangeSlider rangeSlider, float f, boolean z);
    }

    /* renamed from: com.google.android.material.slider.RangeSlider$c */
    public interface C4188c extends C6703rj<RangeSlider> {
        /* renamed from: a */
        /* bridge */ /* synthetic */ void mo28782a(@mr2 Object obj);

        /* renamed from: b */
        /* bridge */ /* synthetic */ void mo28783b(@mr2 Object obj);

        /* renamed from: e */
        void mo28784e(@mr2 RangeSlider rangeSlider);

        /* renamed from: f */
        void mo28785f(@mr2 RangeSlider rangeSlider);
    }

    /* renamed from: com.google.android.material.slider.RangeSlider$d */
    public static class C4189d extends AbsSavedState {
        public static final Parcelable.Creator<C4189d> CREATOR = new C4190a();

        /* renamed from: a */
        public float f24321a;

        /* renamed from: n */
        public int f24322n;

        /* renamed from: com.google.android.material.slider.RangeSlider$d$a */
        public class C4190a implements Parcelable.Creator<C4189d> {
            /* renamed from: a */
            public C4189d createFromParcel(Parcel parcel) {
                return new C4189d(parcel);
            }

            /* renamed from: b */
            public C4189d[] newArray(int i) {
                return new C4189d[i];
            }
        }

        public C4189d(Parcel parcel) {
            super(parcel.readParcelable(C4189d.class.getClassLoader()));
            this.f24321a = parcel.readFloat();
            this.f24322n = parcel.readInt();
        }

        public C4189d(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.f24321a);
            parcel.writeInt(this.f24322n);
        }
    }

    public RangeSlider(@mr2 Context context) {
        this(context, (AttributeSet) null);
    }

    public RangeSlider(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, fd3.C2153c.sliderStyle);
    }

    public RangeSlider(@mr2 Context context, @ts2 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray k = ob4.m59195k(context, attributeSet, fd3.C2165o.RangeSlider, i, BaseSlider.f24235F, new int[0]);
        int i2 = fd3.C2165o.RangeSlider_values;
        if (k.hasValue(i2)) {
            setValues(m33839H0(k.getResources().obtainTypedArray(k.getResourceId(i2, 0))));
        }
        this.f24320f = k.getDimension(fd3.C2165o.RangeSlider_minSeparation, 0.0f);
        k.recycle();
    }

    /* renamed from: H0 */
    public static List<Float> m33839H0(TypedArray typedArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < typedArray.length(); i++) {
            arrayList.add(Float.valueOf(typedArray.getFloat(i, -1.0f)));
        }
        return arrayList;
    }

    /* renamed from: M */
    public /* bridge */ /* synthetic */ boolean mo28634M() {
        return super.mo28634M();
    }

    /* renamed from: S */
    public /* bridge */ /* synthetic */ boolean mo28640S() {
        return super.mo28640S();
    }

    public /* bridge */ /* synthetic */ boolean dispatchHoverEvent(@mr2 MotionEvent motionEvent) {
        return super.dispatchHoverEvent(motionEvent);
    }

    public /* bridge */ /* synthetic */ boolean dispatchKeyEvent(@mr2 KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @mr2
    public /* bridge */ /* synthetic */ CharSequence getAccessibilityClassName() {
        return super.getAccessibilityClassName();
    }

    public /* bridge */ /* synthetic */ int getActiveThumbIndex() {
        return super.getActiveThumbIndex();
    }

    public /* bridge */ /* synthetic */ int getFocusedThumbIndex() {
        return super.getFocusedThumbIndex();
    }

    @zk0
    public /* bridge */ /* synthetic */ int getHaloRadius() {
        return super.getHaloRadius();
    }

    @mr2
    public /* bridge */ /* synthetic */ ColorStateList getHaloTintList() {
        return super.getHaloTintList();
    }

    public /* bridge */ /* synthetic */ int getLabelBehavior() {
        return super.getLabelBehavior();
    }

    public float getMinSeparation() {
        return this.f24320f;
    }

    public /* bridge */ /* synthetic */ float getStepSize() {
        return super.getStepSize();
    }

    public /* bridge */ /* synthetic */ float getThumbElevation() {
        return super.getThumbElevation();
    }

    @zk0
    public /* bridge */ /* synthetic */ int getThumbRadius() {
        return super.getThumbRadius();
    }

    public /* bridge */ /* synthetic */ ColorStateList getThumbStrokeColor() {
        return super.getThumbStrokeColor();
    }

    public /* bridge */ /* synthetic */ float getThumbStrokeWidth() {
        return super.getThumbStrokeWidth();
    }

    @mr2
    public /* bridge */ /* synthetic */ ColorStateList getThumbTintList() {
        return super.getThumbTintList();
    }

    @mr2
    public /* bridge */ /* synthetic */ ColorStateList getTickActiveTintList() {
        return super.getTickActiveTintList();
    }

    @mr2
    public /* bridge */ /* synthetic */ ColorStateList getTickInactiveTintList() {
        return super.getTickInactiveTintList();
    }

    @mr2
    public /* bridge */ /* synthetic */ ColorStateList getTickTintList() {
        return super.getTickTintList();
    }

    @mr2
    public /* bridge */ /* synthetic */ ColorStateList getTrackActiveTintList() {
        return super.getTrackActiveTintList();
    }

    @zk0
    public /* bridge */ /* synthetic */ int getTrackHeight() {
        return super.getTrackHeight();
    }

    @mr2
    public /* bridge */ /* synthetic */ ColorStateList getTrackInactiveTintList() {
        return super.getTrackInactiveTintList();
    }

    @zk0
    public /* bridge */ /* synthetic */ int getTrackSidePadding() {
        return super.getTrackSidePadding();
    }

    @mr2
    public /* bridge */ /* synthetic */ ColorStateList getTrackTintList() {
        return super.getTrackTintList();
    }

    @zk0
    public /* bridge */ /* synthetic */ int getTrackWidth() {
        return super.getTrackWidth();
    }

    public /* bridge */ /* synthetic */ float getValueFrom() {
        return super.getValueFrom();
    }

    public /* bridge */ /* synthetic */ float getValueTo() {
        return super.getValueTo();
    }

    @mr2
    public List<Float> getValues() {
        return super.getValues();
    }

    /* renamed from: h */
    public /* bridge */ /* synthetic */ void mo28683h(@mr2 C6582qj qjVar) {
        super.mo28683h(qjVar);
    }

    /* renamed from: i */
    public /* bridge */ /* synthetic */ void mo28684i(@mr2 C6703rj rjVar) {
        super.mo28684i(rjVar);
    }

    /* renamed from: j0 */
    public /* bridge */ /* synthetic */ void mo28687j0(@mr2 C6582qj qjVar) {
        super.mo28687j0(qjVar);
    }

    /* renamed from: k0 */
    public /* bridge */ /* synthetic */ void mo28689k0(@mr2 C6703rj rjVar) {
        super.mo28689k0(rjVar);
    }

    public /* bridge */ /* synthetic */ boolean onKeyDown(int i, @mr2 KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    public /* bridge */ /* synthetic */ boolean onKeyUp(int i, @mr2 KeyEvent keyEvent) {
        return super.onKeyUp(i, keyEvent);
    }

    public void onRestoreInstanceState(@ts2 Parcelable parcelable) {
        C4189d dVar = (C4189d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        this.f24320f = dVar.f24321a;
        int c = dVar.f24322n;
        this.f24319I = c;
        setSeparationUnit(c);
    }

    @mr2
    public Parcelable onSaveInstanceState() {
        C4189d dVar = new C4189d(super.onSaveInstanceState());
        float unused = dVar.f24321a = this.f24320f;
        int unused2 = dVar.f24322n = this.f24319I;
        return dVar;
    }

    public /* bridge */ /* synthetic */ boolean onTouchEvent(@mr2 MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: p */
    public /* bridge */ /* synthetic */ void mo28710p() {
        super.mo28710p();
    }

    /* renamed from: q */
    public /* bridge */ /* synthetic */ void mo28712q() {
        super.mo28712q();
    }

    public void setCustomThumbDrawable(@dp0 int i) {
        super.setCustomThumbDrawable(i);
    }

    public void setCustomThumbDrawable(@mr2 Drawable drawable) {
        super.setCustomThumbDrawable(drawable);
    }

    public void setCustomThumbDrawablesForValues(@dp0 @mr2 int... iArr) {
        super.setCustomThumbDrawablesForValues(iArr);
    }

    public void setCustomThumbDrawablesForValues(@mr2 Drawable... drawableArr) {
        super.setCustomThumbDrawablesForValues(drawableArr);
    }

    public /* bridge */ /* synthetic */ void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    public /* bridge */ /* synthetic */ void setFocusedThumbIndex(int i) {
        super.setFocusedThumbIndex(i);
    }

    public /* bridge */ /* synthetic */ void setHaloRadius(@js1(from = 0) @zk0 int i) {
        super.setHaloRadius(i);
    }

    public /* bridge */ /* synthetic */ void setHaloRadiusResource(@yk0 int i) {
        super.setHaloRadiusResource(i);
    }

    public /* bridge */ /* synthetic */ void setHaloTintList(@mr2 ColorStateList colorStateList) {
        super.setHaloTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setLabelBehavior(int i) {
        super.setLabelBehavior(i);
    }

    public /* bridge */ /* synthetic */ void setLabelFormatter(@ts2 a12 a12) {
        super.setLabelFormatter(a12);
    }

    public void setMinSeparation(@zk0 float f) {
        this.f24320f = f;
        this.f24319I = 0;
        setSeparationUnit(0);
    }

    public void setMinSeparationValue(float f) {
        this.f24320f = f;
        this.f24319I = 1;
        setSeparationUnit(1);
    }

    public /* bridge */ /* synthetic */ void setStepSize(float f) {
        super.setStepSize(f);
    }

    public /* bridge */ /* synthetic */ void setThumbElevation(float f) {
        super.setThumbElevation(f);
    }

    public /* bridge */ /* synthetic */ void setThumbElevationResource(@yk0 int i) {
        super.setThumbElevationResource(i);
    }

    public /* bridge */ /* synthetic */ void setThumbRadius(@js1(from = 0) @zk0 int i) {
        super.setThumbRadius(i);
    }

    public /* bridge */ /* synthetic */ void setThumbRadiusResource(@yk0 int i) {
        super.setThumbRadiusResource(i);
    }

    public /* bridge */ /* synthetic */ void setThumbStrokeColor(@ts2 ColorStateList colorStateList) {
        super.setThumbStrokeColor(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setThumbStrokeColorResource(@k10 int i) {
        super.setThumbStrokeColorResource(i);
    }

    public /* bridge */ /* synthetic */ void setThumbStrokeWidth(float f) {
        super.setThumbStrokeWidth(f);
    }

    public /* bridge */ /* synthetic */ void setThumbStrokeWidthResource(@yk0 int i) {
        super.setThumbStrokeWidthResource(i);
    }

    public /* bridge */ /* synthetic */ void setThumbTintList(@mr2 ColorStateList colorStateList) {
        super.setThumbTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setTickActiveTintList(@mr2 ColorStateList colorStateList) {
        super.setTickActiveTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setTickInactiveTintList(@mr2 ColorStateList colorStateList) {
        super.setTickInactiveTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setTickTintList(@mr2 ColorStateList colorStateList) {
        super.setTickTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setTickVisible(boolean z) {
        super.setTickVisible(z);
    }

    public /* bridge */ /* synthetic */ void setTrackActiveTintList(@mr2 ColorStateList colorStateList) {
        super.setTrackActiveTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setTrackHeight(@js1(from = 0) @zk0 int i) {
        super.setTrackHeight(i);
    }

    public /* bridge */ /* synthetic */ void setTrackInactiveTintList(@mr2 ColorStateList colorStateList) {
        super.setTrackInactiveTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setTrackTintList(@mr2 ColorStateList colorStateList) {
        super.setTrackTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setValueFrom(float f) {
        super.setValueFrom(f);
    }

    public /* bridge */ /* synthetic */ void setValueTo(float f) {
        super.setValueTo(f);
    }

    public void setValues(@mr2 List<Float> list) {
        super.setValues(list);
    }

    public void setValues(@mr2 Float... fArr) {
        super.setValues(fArr);
    }
}
