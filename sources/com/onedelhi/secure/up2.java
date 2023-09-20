package com.onedelhi.secure;

import android.app.Dialog;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import java.util.concurrent.atomic.AtomicReference;

public final /* synthetic */ class up2 implements RadioGroup.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ Dialog f36218a;

    /* renamed from: a */
    public final /* synthetic */ LinearLayout f36219a;

    /* renamed from: a */
    public final /* synthetic */ RadioButton f36220a;

    /* renamed from: a */
    public final /* synthetic */ RadioGroup f36221a;

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f36222a;

    /* renamed from: b */
    public final /* synthetic */ LinearLayout f36223b;

    /* renamed from: b */
    public final /* synthetic */ RadioButton f36224b;

    /* renamed from: b */
    public final /* synthetic */ RadioGroup f36225b;

    /* renamed from: c */
    public final /* synthetic */ RadioButton f36226c;

    public /* synthetic */ up2(Dialog dialog, RadioGroup radioGroup, AtomicReference atomicReference, LinearLayout linearLayout, LinearLayout linearLayout2, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, RadioGroup radioGroup2) {
        this.f36218a = dialog;
        this.f36221a = radioGroup;
        this.f36222a = atomicReference;
        this.f36219a = linearLayout;
        this.f36223b = linearLayout2;
        this.f36220a = radioButton;
        this.f36224b = radioButton2;
        this.f36226c = radioButton3;
        this.f36225b = radioGroup2;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        rq2.m26922U0(this.f36218a, this.f36221a, this.f36222a, this.f36219a, this.f36223b, this.f36220a, this.f36224b, this.f36226c, this.f36225b, radioGroup, i);
    }
}
