package com.onedelhi.secure;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* renamed from: com.onedelhi.secure.s8 */
public final class C3478s8 {
    @ts2

    /* renamed from: a */
    public TextClassifier f20254a;
    @mr2

    /* renamed from: a */
    public TextView f20255a;

    @sj3(26)
    /* renamed from: com.onedelhi.secure.s8$a */
    public static final class C3479a {
        @mr2
        @pn0
        /* renamed from: a */
        public static TextClassifier m27320a(@mr2 TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
    }

    public C3478s8(@mr2 TextView textView) {
        this.f20255a = (TextView) k43.m19455l(textView);
    }

    @mr2
    @sj3(api = 26)
    /* renamed from: a */
    public TextClassifier mo24263a() {
        TextClassifier textClassifier = this.f20254a;
        return textClassifier == null ? C3479a.m27320a(this.f20255a) : textClassifier;
    }

    @sj3(api = 26)
    /* renamed from: b */
    public void mo24264b(@ts2 TextClassifier textClassifier) {
        this.f20254a = textClassifier;
    }
}
