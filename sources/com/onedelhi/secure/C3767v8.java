package com.onedelhi.secure;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import android.view.View;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.AppCompatToggleButton;
import com.onedelhi.secure.za3;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.onedelhi.secure.v8 */
public class C3767v8 {

    /* renamed from: a */
    public static final ty3<String, Constructor<? extends View>> f21695a = new ty3<>();

    /* renamed from: a */
    public static final String f21696a = "AppCompatViewInflater";

    /* renamed from: a */
    public static final int[] f21697a = {16843375};

    /* renamed from: a */
    public static final Class<?>[] f21698a = {Context.class, AttributeSet.class};

    /* renamed from: a */
    public static final String[] f21699a = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: b */
    public static final int[] f21700b = {16844160};

    /* renamed from: c */
    public static final int[] f21701c = {16844156};

    /* renamed from: d */
    public static final int[] f21702d = {16844148};

    /* renamed from: a */
    public final Object[] f21703a = new Object[2];

    /* renamed from: com.onedelhi.secure.v8$a */
    public static class C3768a implements View.OnClickListener {

        /* renamed from: a */
        public Context f21704a;

        /* renamed from: a */
        public final View f21705a;

        /* renamed from: a */
        public Method f21706a;

        /* renamed from: b */
        public final String f21707b;

        public C3768a(@mr2 View view, @mr2 String str) {
            this.f21705a = view;
            this.f21707b = str;
        }

        /* renamed from: a */
        public final void mo25900a(@ts2 Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f21707b, new Class[]{View.class})) != null) {
                        this.f21706a = method;
                        this.f21704a = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f21705a.getId();
            if (id == -1) {
                str = "";
            } else {
                str = " with id '" + this.f21705a.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f21707b + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f21705a.getClass() + str);
        }

        public void onClick(@mr2 View view) {
            if (this.f21706a == null) {
                mo25900a(this.f21705a.getContext());
            }
            try {
                this.f21706a.invoke(this.f21704a, new Object[]{view});
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    /* renamed from: u */
    public static Context m29853u(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, za3.C4068m.View, 0, 0);
        int resourceId = z ? obtainStyledAttributes.getResourceId(za3.C4068m.View_android_theme, 0) : 0;
        if (z2 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(za3.C4068m.View_theme, 0)) != 0) {
            Log.i(f21696a, "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? (!(context instanceof z70) || ((z70) context).mo27822c() != resourceId) ? new z70(context, resourceId) : context : context;
    }

    /* renamed from: a */
    public final void mo25879a(@mr2 Context context, @mr2 View view, @mr2 AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT <= 28) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f21700b);
            if (obtainStyledAttributes.hasValue(0)) {
                jt4.m18853C1(view, obtainStyledAttributes.getBoolean(0, false));
            }
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f21701c);
            if (obtainStyledAttributes2.hasValue(0)) {
                jt4.m18861E1(view, obtainStyledAttributes2.getString(0));
            }
            obtainStyledAttributes2.recycle();
            TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f21702d);
            if (obtainStyledAttributes3.hasValue(0)) {
                jt4.m18986n2(view, obtainStyledAttributes3.getBoolean(0, false));
            }
            obtainStyledAttributes3.recycle();
        }
    }

    /* renamed from: b */
    public final void mo25880b(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && jt4.m18884K0(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f21697a);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new C3768a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    @mr2
    /* renamed from: c */
    public AppCompatAutoCompleteTextView mo25881c(Context context, AttributeSet attributeSet) {
        return new AppCompatAutoCompleteTextView(context, attributeSet);
    }

    @mr2
    /* renamed from: d */
    public AppCompatButton mo25882d(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    @mr2
    /* renamed from: e */
    public AppCompatCheckBox mo25883e(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    @mr2
    /* renamed from: f */
    public AppCompatCheckedTextView mo25884f(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckedTextView(context, attributeSet);
    }

    @mr2
    /* renamed from: g */
    public AppCompatEditText mo25885g(Context context, AttributeSet attributeSet) {
        return new AppCompatEditText(context, attributeSet);
    }

    @mr2
    /* renamed from: h */
    public AppCompatImageButton mo25886h(Context context, AttributeSet attributeSet) {
        return new AppCompatImageButton(context, attributeSet);
    }

    @mr2
    /* renamed from: i */
    public AppCompatImageView mo25887i(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    @mr2
    /* renamed from: j */
    public AppCompatMultiAutoCompleteTextView mo25888j(Context context, AttributeSet attributeSet) {
        return new AppCompatMultiAutoCompleteTextView(context, attributeSet);
    }

    @mr2
    /* renamed from: k */
    public AppCompatRadioButton mo25889k(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    @mr2
    /* renamed from: l */
    public AppCompatRatingBar mo25890l(Context context, AttributeSet attributeSet) {
        return new AppCompatRatingBar(context, attributeSet);
    }

    @mr2
    /* renamed from: m */
    public AppCompatSeekBar mo25891m(Context context, AttributeSet attributeSet) {
        return new AppCompatSeekBar(context, attributeSet);
    }

    @mr2
    /* renamed from: n */
    public AppCompatSpinner mo25892n(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    @mr2
    /* renamed from: o */
    public AppCompatTextView mo25893o(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    @mr2
    /* renamed from: p */
    public AppCompatToggleButton mo25894p(Context context, AttributeSet attributeSet) {
        return new AppCompatToggleButton(context, attributeSet);
    }

    @ts2
    /* renamed from: q */
    public View mo25895q(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* renamed from: r */
    public final View mo25896r(View view, String str, @mr2 Context context, @mr2 AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        View view2;
        Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = m29853u(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = xe4.m31415b(context2);
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 0;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = 1;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = 2;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 3;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c = 4;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = 5;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 6;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c = 8;
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = 9;
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = 10;
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 11;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = 12;
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = 13;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                view2 = mo25890l(context2, attributeSet);
                break;
            case 1:
                view2 = mo25884f(context2, attributeSet);
                break;
            case 2:
                view2 = mo25888j(context2, attributeSet);
                break;
            case 3:
                view2 = mo25893o(context2, attributeSet);
                break;
            case 4:
                view2 = mo25886h(context2, attributeSet);
                break;
            case 5:
                view2 = mo25891m(context2, attributeSet);
                break;
            case 6:
                view2 = mo25892n(context2, attributeSet);
                break;
            case 7:
                view2 = mo25889k(context2, attributeSet);
                break;
            case 8:
                view2 = mo25894p(context2, attributeSet);
                break;
            case 9:
                view2 = mo25887i(context2, attributeSet);
                break;
            case 10:
                view2 = mo25881c(context2, attributeSet);
                break;
            case 11:
                view2 = mo25883e(context2, attributeSet);
                break;
            case 12:
                view2 = mo25885g(context2, attributeSet);
                break;
            case 13:
                view2 = mo25882d(context2, attributeSet);
                break;
            default:
                view2 = mo25895q(context2, str, attributeSet);
                break;
        }
        mo25899v(view2, str);
        if (view2 == null && context != context2) {
            view2 = mo25898t(context2, str, attributeSet);
        }
        if (view2 != null) {
            mo25880b(view2, attributeSet);
            mo25879a(context2, view2, attributeSet);
        }
        return view2;
    }

    /* renamed from: s */
    public final View mo25897s(Context context, String str, String str2) throws ClassNotFoundException, InflateException {
        String str3;
        ty3<String, Constructor<? extends View>> ty3 = f21695a;
        Constructor<? extends U> constructor = ty3.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f21698a);
            ty3.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f21703a);
    }

    /* renamed from: t */
    public final View mo25898t(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue((String) null, "class");
        }
        try {
            Object[] objArr = this.f21703a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                int i = 0;
                while (true) {
                    String[] strArr = f21699a;
                    if (i < strArr.length) {
                        View s = mo25897s(context, str, strArr[i]);
                        if (s != null) {
                            return s;
                        }
                        i++;
                    } else {
                        Object[] objArr2 = this.f21703a;
                        objArr2[0] = null;
                        objArr2[1] = null;
                        return null;
                    }
                }
            } else {
                View s2 = mo25897s(context, str, (String) null);
                Object[] objArr3 = this.f21703a;
                objArr3[0] = null;
                objArr3[1] = null;
                return s2;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr4 = this.f21703a;
            objArr4[0] = null;
            objArr4[1] = null;
        }
    }

    /* renamed from: v */
    public final void mo25899v(View view, String str) {
        if (view == null) {
            throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
        }
    }
}
