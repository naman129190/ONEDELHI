package com.onedelhi.secure;

import android.view.View;

public class cv4 {

    /* renamed from: a */
    public float f10500a;

    /* renamed from: a */
    public int f10501a;

    /* renamed from: b */
    public int f10502b;

    /* renamed from: c */
    public int f10503c;

    /* renamed from: d */
    public int f10504d;

    /* renamed from: a */
    public void mo14395a(View view) {
        this.f10501a = view.getLeft();
        this.f10502b = view.getTop();
        this.f10503c = view.getRight();
        this.f10504d = view.getBottom();
        this.f10500a = view.getRotation();
    }

    /* renamed from: b */
    public int mo14396b() {
        return this.f10504d - this.f10502b;
    }

    /* renamed from: c */
    public int mo14397c() {
        return this.f10503c - this.f10501a;
    }
}
