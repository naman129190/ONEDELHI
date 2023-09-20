package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.circularreveal.CircularRevealFrameLayout;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;

@Deprecated
public class TransformationChildLayout extends CircularRevealFrameLayout {
    public TransformationChildLayout(@mr2 Context context) {
        this(context, (AttributeSet) null);
    }

    public TransformationChildLayout(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
