package com.onedelhi.secure;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.text.method.DialerKeyListener;
import android.text.method.DigitsKeyListener;
import android.text.method.KeyListener;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TextKeyListener;
import android.util.Log;
import android.widget.TextView;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.ra3;

@C2065el({@C1983dl(attribute = "android:autoLink", method = "setAutoLinkMask", type = TextView.class), @C1983dl(attribute = "android:drawablePadding", method = "setCompoundDrawablePadding", type = TextView.class), @C1983dl(attribute = "android:editorExtras", method = "setInputExtras", type = TextView.class), @C1983dl(attribute = "android:inputType", method = "setRawInputType", type = TextView.class), @C1983dl(attribute = "android:scrollHorizontally", method = "setHorizontallyScrolling", type = TextView.class), @C1983dl(attribute = "android:textAllCaps", method = "setAllCaps", type = TextView.class), @C1983dl(attribute = "android:textColorHighlight", method = "setHighlightColor", type = TextView.class), @C1983dl(attribute = "android:textColorHint", method = "setHintTextColor", type = TextView.class), @C1983dl(attribute = "android:textColorLink", method = "setLinkTextColor", type = TextView.class), @C1983dl(attribute = "android:onEditorAction", method = "setOnEditorActionListener", type = TextView.class)})
@hl3({hl3.C2354a.LIBRARY})
public class ib4 {

    /* renamed from: a */
    public static final int f13560a = 1;

    /* renamed from: a */
    public static final String f13561a = "TextViewBindingAdapters";

    /* renamed from: b */
    public static final int f13562b = 3;

    /* renamed from: c */
    public static final int f13563c = 5;

    /* renamed from: com.onedelhi.secure.ib4$a */
    public static class C2419a implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ C2420b f13564a;

        /* renamed from: a */
        public final /* synthetic */ C2421c f13565a;

        /* renamed from: a */
        public final /* synthetic */ C2422d f13566a;

        /* renamed from: a */
        public final /* synthetic */ st1 f13567a;

        public C2419a(C2421c cVar, C2422d dVar, st1 st1, C2420b bVar) {
            this.f13565a = cVar;
            this.f13566a = dVar;
            this.f13567a = st1;
            this.f13564a = bVar;
        }

        public void afterTextChanged(Editable editable) {
            C2420b bVar = this.f13564a;
            if (bVar != null) {
                bVar.afterTextChanged(editable);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C2421c cVar = this.f13565a;
            if (cVar != null) {
                cVar.beforeTextChanged(charSequence, i, i2, i3);
            }
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C2422d dVar = this.f13566a;
            if (dVar != null) {
                dVar.onTextChanged(charSequence, i, i2, i3);
            }
            st1 st1 = this.f13567a;
            if (st1 != null) {
                st1.mo24536b();
            }
        }
    }

    /* renamed from: com.onedelhi.secure.ib4$b */
    public interface C2420b {
        void afterTextChanged(Editable editable);
    }

    /* renamed from: com.onedelhi.secure.ib4$c */
    public interface C2421c {
        void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3);
    }

    /* renamed from: com.onedelhi.secure.ib4$d */
    public interface C2422d {
        void onTextChanged(CharSequence charSequence, int i, int i2, int i3);
    }

    @C1717al({"android:text"})
    /* renamed from: A */
    public static void m17374A(TextView textView, CharSequence charSequence) {
        CharSequence text = textView.getText();
        if (charSequence == text) {
            return;
        }
        if (charSequence != null || text.length() != 0) {
            if (charSequence instanceof Spanned) {
                if (charSequence.equals(text)) {
                    return;
                }
            } else if (!m17378b(charSequence, text)) {
                return;
            }
            textView.setText(charSequence);
        }
    }

    @C1717al({"android:textSize"})
    /* renamed from: B */
    public static void m17375B(TextView textView, float f) {
        textView.setTextSize(0, f);
    }

    @C1717al(requireAll = false, value = {"android:beforeTextChanged", "android:onTextChanged", "android:afterTextChanged", "android:textAttrChanged"})
    /* renamed from: C */
    public static void m17376C(TextView textView, C2421c cVar, C2422d dVar, C2420b bVar, st1 st1) {
        C2419a aVar = (cVar == null && bVar == null && dVar == null && st1 == null) ? null : new C2419a(cVar, dVar, st1, bVar);
        TextWatcher textWatcher = (TextWatcher) n42.m22335b(textView, aVar, ra3.C3391g.textWatcher);
        if (textWatcher != null) {
            textView.removeTextChangedListener(textWatcher);
        }
        if (aVar != null) {
            textView.addTextChangedListener(aVar);
        }
    }

    @rt1(attribute = "android:text", event = "android:textAttrChanged")
    /* renamed from: a */
    public static String m17377a(TextView textView) {
        return textView.getText().toString();
    }

    /* renamed from: b */
    public static boolean m17378b(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence == null) != (charSequence2 == null)) {
            return true;
        }
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        if (length != charSequence2.length()) {
            return true;
        }
        for (int i = 0; i < length; i++) {
            if (charSequence.charAt(i) != charSequence2.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    @C1717al({"android:autoText"})
    /* renamed from: c */
    public static void m17379c(TextView textView, boolean z) {
        KeyListener keyListener = textView.getKeyListener();
        TextKeyListener.Capitalize capitalize = TextKeyListener.Capitalize.NONE;
        int inputType = keyListener != null ? keyListener.getInputType() : 0;
        if ((inputType & 4096) != 0) {
            capitalize = TextKeyListener.Capitalize.CHARACTERS;
        } else if ((inputType & 8192) != 0) {
            capitalize = TextKeyListener.Capitalize.WORDS;
        } else if ((inputType & 16384) != 0) {
            capitalize = TextKeyListener.Capitalize.SENTENCES;
        }
        textView.setKeyListener(TextKeyListener.getInstance(z, capitalize));
    }

    @C1717al({"android:bufferType"})
    /* renamed from: d */
    public static void m17380d(TextView textView, TextView.BufferType bufferType) {
        textView.setText(textView.getText(), bufferType);
    }

    @C1717al({"android:capitalize"})
    /* renamed from: e */
    public static void m17381e(TextView textView, TextKeyListener.Capitalize capitalize) {
        textView.setKeyListener(TextKeyListener.getInstance((textView.getKeyListener().getInputType() & 32768) != 0, capitalize));
    }

    @C1717al({"android:digits"})
    /* renamed from: f */
    public static void m17382f(TextView textView, CharSequence charSequence) {
        DigitsKeyListener digitsKeyListener;
        if (charSequence != null) {
            digitsKeyListener = DigitsKeyListener.getInstance(charSequence.toString());
        } else if (textView.getKeyListener() instanceof DigitsKeyListener) {
            digitsKeyListener = null;
        } else {
            return;
        }
        textView.setKeyListener(digitsKeyListener);
    }

    @C1717al({"android:drawableBottom"})
    /* renamed from: g */
    public static void m17383g(TextView textView, Drawable drawable) {
        m17392p(drawable);
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        textView.setCompoundDrawables(compoundDrawables[0], compoundDrawables[1], compoundDrawables[2], drawable);
    }

    @C1717al({"android:drawableEnd"})
    /* renamed from: h */
    public static void m17384h(TextView textView, Drawable drawable) {
        m17392p(drawable);
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        textView.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], drawable, compoundDrawablesRelative[3]);
    }

    @C1717al({"android:drawableLeft"})
    /* renamed from: i */
    public static void m17385i(TextView textView, Drawable drawable) {
        m17392p(drawable);
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        textView.setCompoundDrawables(drawable, compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
    }

    @C1717al({"android:drawableRight"})
    /* renamed from: j */
    public static void m17386j(TextView textView, Drawable drawable) {
        m17392p(drawable);
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        textView.setCompoundDrawables(compoundDrawables[0], compoundDrawables[1], drawable, compoundDrawables[3]);
    }

    @C1717al({"android:drawableStart"})
    /* renamed from: k */
    public static void m17387k(TextView textView, Drawable drawable) {
        m17392p(drawable);
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        textView.setCompoundDrawablesRelative(drawable, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
    }

    @C1717al({"android:drawableTop"})
    /* renamed from: l */
    public static void m17388l(TextView textView, Drawable drawable) {
        m17392p(drawable);
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        textView.setCompoundDrawables(compoundDrawables[0], drawable, compoundDrawables[2], compoundDrawables[3]);
    }

    @C1717al({"android:imeActionId"})
    /* renamed from: m */
    public static void m17389m(TextView textView, int i) {
        textView.setImeActionLabel(textView.getImeActionLabel(), i);
    }

    @C1717al({"android:imeActionLabel"})
    /* renamed from: n */
    public static void m17390n(TextView textView, CharSequence charSequence) {
        textView.setImeActionLabel(charSequence, textView.getImeActionId());
    }

    @C1717al({"android:inputMethod"})
    /* renamed from: o */
    public static void m17391o(TextView textView, CharSequence charSequence) {
        StringBuilder sb;
        try {
            textView.setKeyListener((KeyListener) Class.forName(charSequence.toString()).newInstance());
            return;
        } catch (ClassNotFoundException e) {
            e = e;
            sb = new StringBuilder();
        } catch (InstantiationException e2) {
            e = e2;
            sb = new StringBuilder();
        } catch (IllegalAccessException e3) {
            e = e3;
            sb = new StringBuilder();
        }
        sb.append("Could not create input method: ");
        sb.append(charSequence);
        Log.e(f13561a, sb.toString(), e);
    }

    /* renamed from: p */
    public static void m17392p(Drawable drawable) {
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
    }

    @C1717al({"android:lineSpacingExtra"})
    /* renamed from: q */
    public static void m17393q(TextView textView, float f) {
        textView.setLineSpacing(f, textView.getLineSpacingMultiplier());
    }

    @C1717al({"android:lineSpacingMultiplier"})
    /* renamed from: r */
    public static void m17394r(TextView textView, float f) {
        textView.setLineSpacing(textView.getLineSpacingExtra(), f);
    }

    @C1717al({"android:maxLength"})
    /* renamed from: s */
    public static void m17395s(TextView textView, int i) {
        boolean z;
        InputFilter[] filters = textView.getFilters();
        if (filters == null) {
            filters = new InputFilter[]{new InputFilter.LengthFilter(i)};
        } else {
            int i2 = 0;
            while (true) {
                if (i2 >= filters.length) {
                    z = false;
                    break;
                }
                InputFilter inputFilter = filters[i2];
                if (inputFilter instanceof InputFilter.LengthFilter) {
                    if (((InputFilter.LengthFilter) inputFilter).getMax() != i) {
                        filters[i2] = new InputFilter.LengthFilter(i);
                    }
                    z = true;
                } else {
                    i2++;
                }
            }
            if (!z) {
                int length = filters.length + 1;
                InputFilter[] inputFilterArr = new InputFilter[length];
                System.arraycopy(filters, 0, inputFilterArr, 0, filters.length);
                inputFilterArr[length - 1] = new InputFilter.LengthFilter(i);
                filters = inputFilterArr;
            }
        }
        textView.setFilters(filters);
    }

    @C1717al({"android:numeric"})
    /* renamed from: t */
    public static void m17396t(TextView textView, int i) {
        boolean z = true;
        boolean z2 = (i & 3) != 0;
        if ((i & 5) == 0) {
            z = false;
        }
        textView.setKeyListener(DigitsKeyListener.getInstance(z2, z));
    }

    @C1717al({"android:password"})
    /* renamed from: u */
    public static void m17397u(TextView textView, boolean z) {
        PasswordTransformationMethod passwordTransformationMethod;
        if (z) {
            passwordTransformationMethod = PasswordTransformationMethod.getInstance();
        } else if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            passwordTransformationMethod = null;
        } else {
            return;
        }
        textView.setTransformationMethod(passwordTransformationMethod);
    }

    @C1717al({"android:phoneNumber"})
    /* renamed from: v */
    public static void m17398v(TextView textView, boolean z) {
        DialerKeyListener dialerKeyListener;
        if (z) {
            dialerKeyListener = DialerKeyListener.getInstance();
        } else if (textView.getKeyListener() instanceof DialerKeyListener) {
            dialerKeyListener = null;
        } else {
            return;
        }
        textView.setKeyListener(dialerKeyListener);
    }

    @C1717al({"android:shadowColor"})
    /* renamed from: w */
    public static void m17399w(TextView textView, int i) {
        textView.setShadowLayer(textView.getShadowRadius(), textView.getShadowDx(), textView.getShadowDy(), i);
    }

    @C1717al({"android:shadowDx"})
    /* renamed from: x */
    public static void m17400x(TextView textView, float f) {
        int shadowColor = textView.getShadowColor();
        textView.setShadowLayer(textView.getShadowRadius(), f, textView.getShadowDy(), shadowColor);
    }

    @C1717al({"android:shadowDy"})
    /* renamed from: y */
    public static void m17401y(TextView textView, float f) {
        int shadowColor = textView.getShadowColor();
        textView.setShadowLayer(textView.getShadowRadius(), textView.getShadowDx(), f, shadowColor);
    }

    @C1717al({"android:shadowRadius"})
    /* renamed from: z */
    public static void m17402z(TextView textView, float f) {
        textView.setShadowLayer(f, textView.getShadowDx(), textView.getShadowDy(), textView.getShadowColor());
    }
}
