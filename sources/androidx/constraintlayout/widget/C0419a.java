package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.widget.C0435e;
import com.onedelhi.secure.jt4;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.constraintlayout.widget.a */
public class C0419a {

    /* renamed from: c */
    public static final String f2696c = "TransitionLayout";

    /* renamed from: a */
    public float f2697a;

    /* renamed from: a */
    public int f2698a;

    /* renamed from: a */
    public C0421b f2699a;

    /* renamed from: a */
    public String f2700a;

    /* renamed from: a */
    public boolean f2701a;

    /* renamed from: b */
    public int f2702b;

    /* renamed from: b */
    public String f2703b;

    /* renamed from: b */
    public boolean f2704b;

    /* renamed from: androidx.constraintlayout.widget.a$a */
    public static /* synthetic */ class C0420a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2705a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.constraintlayout.widget.a$b[] r0 = androidx.constraintlayout.widget.C0419a.C0421b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2705a = r0
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.C0419a.C0421b.REFERENCE_TYPE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2705a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.C0419a.C0421b.BOOLEAN_TYPE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2705a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.C0419a.C0421b.STRING_TYPE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f2705a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.C0419a.C0421b.COLOR_TYPE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f2705a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.C0419a.C0421b.COLOR_DRAWABLE_TYPE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f2705a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.C0419a.C0421b.INT_TYPE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f2705a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.C0419a.C0421b.FLOAT_TYPE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f2705a     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.C0419a.C0421b.DIMENSION_TYPE     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C0419a.C0420a.<clinit>():void");
        }
    }

    /* renamed from: androidx.constraintlayout.widget.a$b */
    public enum C0421b {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public C0419a(C0419a aVar, Object obj) {
        this.f2701a = false;
        this.f2700a = aVar.f2700a;
        this.f2699a = aVar.f2699a;
        mo3322w(obj);
    }

    public C0419a(String str, C0421b bVar) {
        this.f2701a = false;
        this.f2700a = str;
        this.f2699a = bVar;
    }

    public C0419a(String str, C0421b bVar, Object obj, boolean z) {
        this.f2700a = str;
        this.f2699a = bVar;
        this.f2701a = z;
        mo3322w(obj);
    }

    /* renamed from: b */
    public static int m3150b(int i) {
        int i2 = (i & (~(i >> 31))) - 255;
        return (i2 & (i2 >> 31)) + 255;
    }

    /* renamed from: d */
    public static HashMap<String, C0419a> m3151d(HashMap<String, C0419a> hashMap, View view) {
        C0419a aVar;
        HashMap<String, C0419a> hashMap2 = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String next : hashMap.keySet()) {
            C0419a aVar2 = hashMap.get(next);
            try {
                if (next.equals("BackgroundColor")) {
                    aVar = new C0419a(aVar2, (Object) Integer.valueOf(((ColorDrawable) view.getBackground()).getColor()));
                } else {
                    aVar = new C0419a(aVar2, cls.getMethod("getMap" + next, new Class[0]).invoke(view, new Object[0]));
                }
                hashMap2.put(next, aVar);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            }
        }
        return hashMap2;
    }

    /* renamed from: q */
    public static void m3152q(Context context, XmlPullParser xmlPullParser, HashMap<String, C0419a> hashMap) {
        C0421b bVar;
        int resourceId;
        Object string;
        C0421b bVar2;
        float f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0435e.C0448m.CustomAttribute);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        C0421b bVar3 = null;
        boolean z = false;
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == C0435e.C0448m.CustomAttribute_attributeName) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == C0435e.C0448m.CustomAttribute_methodName) {
                str = obtainStyledAttributes.getString(index);
                z = true;
            } else if (index == C0435e.C0448m.CustomAttribute_customBoolean) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                bVar3 = C0421b.BOOLEAN_TYPE;
            } else {
                if (index == C0435e.C0448m.CustomAttribute_customColorValue) {
                    bVar = C0421b.COLOR_TYPE;
                } else if (index == C0435e.C0448m.CustomAttribute_customColorDrawableValue) {
                    bVar = C0421b.COLOR_DRAWABLE_TYPE;
                } else {
                    if (index == C0435e.C0448m.CustomAttribute_customPixelDimension) {
                        bVar2 = C0421b.DIMENSION_TYPE;
                        f = TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics());
                    } else if (index == C0435e.C0448m.CustomAttribute_customDimension) {
                        bVar2 = C0421b.DIMENSION_TYPE;
                        f = obtainStyledAttributes.getDimension(index, 0.0f);
                    } else if (index == C0435e.C0448m.CustomAttribute_customFloatValue) {
                        bVar2 = C0421b.FLOAT_TYPE;
                        f = obtainStyledAttributes.getFloat(index, Float.NaN);
                    } else {
                        if (index == C0435e.C0448m.CustomAttribute_customIntegerValue) {
                            bVar = C0421b.INT_TYPE;
                            resourceId = obtainStyledAttributes.getInteger(index, -1);
                        } else if (index == C0435e.C0448m.CustomAttribute_customStringValue) {
                            bVar = C0421b.STRING_TYPE;
                            string = obtainStyledAttributes.getString(index);
                            Object obj2 = string;
                            bVar3 = bVar;
                            obj = obj2;
                        } else if (index == C0435e.C0448m.CustomAttribute_customReference) {
                            bVar = C0421b.REFERENCE_TYPE;
                            resourceId = obtainStyledAttributes.getResourceId(index, -1);
                            if (resourceId == -1) {
                                resourceId = obtainStyledAttributes.getInt(index, -1);
                            }
                        }
                        string = Integer.valueOf(resourceId);
                        Object obj22 = string;
                        bVar3 = bVar;
                        obj = obj22;
                    }
                    string = Float.valueOf(f);
                    Object obj222 = string;
                    bVar3 = bVar;
                    obj = obj222;
                }
                resourceId = obtainStyledAttributes.getColor(index, 0);
                string = Integer.valueOf(resourceId);
                Object obj2222 = string;
                bVar3 = bVar;
                obj = obj2222;
            }
        }
        if (!(str == null || obj == null)) {
            hashMap.put(str, new C0419a(str, bVar3, obj, z));
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: r */
    public static void m3153r(View view, HashMap<String, C0419a> hashMap) {
        String str;
        Class<?> cls = view.getClass();
        for (String next : hashMap.keySet()) {
            C0419a aVar = hashMap.get(next);
            if (!aVar.f2701a) {
                str = "set" + next;
            } else {
                str = next;
            }
            try {
                switch (C0420a.f2705a[aVar.f2699a.ordinal()]) {
                    case 1:
                        cls.getMethod(str, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(aVar.f2698a)});
                        break;
                    case 2:
                        cls.getMethod(str, new Class[]{Boolean.TYPE}).invoke(view, new Object[]{Boolean.valueOf(aVar.f2704b)});
                        break;
                    case 3:
                        cls.getMethod(str, new Class[]{CharSequence.class}).invoke(view, new Object[]{aVar.f2703b});
                        break;
                    case 4:
                        cls.getMethod(str, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(aVar.f2702b)});
                        break;
                    case 5:
                        Method method = cls.getMethod(str, new Class[]{Drawable.class});
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(aVar.f2702b);
                        method.invoke(view, new Object[]{colorDrawable});
                        break;
                    case 6:
                        cls.getMethod(str, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(aVar.f2698a)});
                        break;
                    case 7:
                        cls.getMethod(str, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(aVar.f2697a)});
                        break;
                    case 8:
                        cls.getMethod(str, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(aVar.f2697a)});
                        break;
                }
            } catch (NoSuchMethodException e) {
                Log.e("TransitionLayout", e.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + next + "\" not found on " + cls.getName());
                StringBuilder sb = new StringBuilder();
                sb.append(cls.getName());
                sb.append(" must have a method ");
                sb.append(str);
                Log.e("TransitionLayout", sb.toString());
            } catch (IllegalAccessException e2) {
                Log.e("TransitionLayout", " Custom Attribute \"" + next + "\" not found on " + cls.getName());
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                Log.e("TransitionLayout", " Custom Attribute \"" + next + "\" not found on " + cls.getName());
                e3.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public void mo3304a(View view) {
        String str;
        Class<?> cls = view.getClass();
        String str2 = this.f2700a;
        if (!this.f2701a) {
            str = "set" + str2;
        } else {
            str = str2;
        }
        try {
            switch (C0420a.f2705a[this.f2699a.ordinal()]) {
                case 1:
                case 6:
                    cls.getMethod(str, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(this.f2698a)});
                    return;
                case 2:
                    cls.getMethod(str, new Class[]{Boolean.TYPE}).invoke(view, new Object[]{Boolean.valueOf(this.f2704b)});
                    return;
                case 3:
                    cls.getMethod(str, new Class[]{CharSequence.class}).invoke(view, new Object[]{this.f2703b});
                    return;
                case 4:
                    cls.getMethod(str, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(this.f2702b)});
                    return;
                case 5:
                    Method method = cls.getMethod(str, new Class[]{Drawable.class});
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(this.f2702b);
                    method.invoke(view, new Object[]{colorDrawable});
                    return;
                case 7:
                    cls.getMethod(str, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(this.f2697a)});
                    return;
                case 8:
                    cls.getMethod(str, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(this.f2697a)});
                    return;
                default:
                    return;
            }
        } catch (NoSuchMethodException e) {
            Log.e("TransitionLayout", e.getMessage());
            Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append(" must have a method ");
            sb.append(str);
            Log.e("TransitionLayout", sb.toString());
        } catch (IllegalAccessException e2) {
            Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
            e2.printStackTrace();
        } catch (InvocationTargetException e3) {
            Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
            e3.printStackTrace();
        }
    }

    /* renamed from: c */
    public boolean mo3305c(C0419a aVar) {
        C0421b bVar;
        if (aVar == null || (bVar = this.f2699a) != aVar.f2699a) {
            return false;
        }
        switch (C0420a.f2705a[bVar.ordinal()]) {
            case 1:
            case 6:
                return this.f2698a == aVar.f2698a;
            case 2:
                return this.f2704b == aVar.f2704b;
            case 3:
                return this.f2698a == aVar.f2698a;
            case 4:
            case 5:
                return this.f2702b == aVar.f2702b;
            case 7:
                return this.f2697a == aVar.f2697a;
            case 8:
                return this.f2697a == aVar.f2697a;
            default:
                return false;
        }
    }

    /* renamed from: e */
    public int mo3306e() {
        return this.f2702b;
    }

    /* renamed from: f */
    public float mo3307f() {
        return this.f2697a;
    }

    /* renamed from: g */
    public int mo3308g() {
        return this.f2698a;
    }

    /* renamed from: h */
    public String mo3309h() {
        return this.f2700a;
    }

    /* renamed from: i */
    public String mo3310i() {
        return this.f2703b;
    }

    /* renamed from: j */
    public C0421b mo3311j() {
        return this.f2699a;
    }

    /* renamed from: k */
    public float mo3312k() {
        switch (C0420a.f2705a[this.f2699a.ordinal()]) {
            case 2:
                return this.f2704b ? 1.0f : 0.0f;
            case 3:
                throw new RuntimeException("Cannot interpolate String");
            case 4:
            case 5:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 6:
                return (float) this.f2698a;
            case 7:
                return this.f2697a;
            case 8:
                return this.f2697a;
            default:
                return Float.NaN;
        }
    }

    /* renamed from: l */
    public void mo3313l(float[] fArr) {
        switch (C0420a.f2705a[this.f2699a.ordinal()]) {
            case 2:
                fArr[0] = this.f2704b ? 1.0f : 0.0f;
                return;
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
            case 5:
                int i = this.f2702b;
                float pow = (float) Math.pow((double) (((float) ((i >> 16) & 255)) / 255.0f), 2.2d);
                float pow2 = (float) Math.pow((double) (((float) ((i >> 8) & 255)) / 255.0f), 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = (float) Math.pow((double) (((float) (i & 255)) / 255.0f), 2.2d);
                fArr[3] = ((float) ((i >> 24) & 255)) / 255.0f;
                return;
            case 6:
                fArr[0] = (float) this.f2698a;
                return;
            case 7:
                fArr[0] = this.f2697a;
                return;
            case 8:
                fArr[0] = this.f2697a;
                return;
            default:
                return;
        }
    }

    /* renamed from: m */
    public boolean mo3314m() {
        return this.f2704b;
    }

    /* renamed from: n */
    public boolean mo3315n() {
        int i = C0420a.f2705a[this.f2699a.ordinal()];
        return (i == 1 || i == 2 || i == 3) ? false : true;
    }

    /* renamed from: o */
    public boolean mo3316o() {
        return this.f2701a;
    }

    /* renamed from: p */
    public int mo3317p() {
        int i = C0420a.f2705a[this.f2699a.ordinal()];
        return (i == 4 || i == 5) ? 4 : 1;
    }

    /* renamed from: s */
    public void mo3318s(int i) {
        this.f2702b = i;
    }

    /* renamed from: t */
    public void mo3319t(float f) {
        this.f2697a = f;
    }

    /* renamed from: u */
    public void mo3320u(int i) {
        this.f2698a = i;
    }

    /* renamed from: v */
    public void mo3321v(String str) {
        this.f2703b = str;
    }

    /* renamed from: w */
    public void mo3322w(Object obj) {
        switch (C0420a.f2705a[this.f2699a.ordinal()]) {
            case 1:
            case 6:
                this.f2698a = ((Integer) obj).intValue();
                return;
            case 2:
                this.f2704b = ((Boolean) obj).booleanValue();
                return;
            case 3:
                this.f2703b = (String) obj;
                return;
            case 4:
            case 5:
                this.f2702b = ((Integer) obj).intValue();
                return;
            case 7:
            case 8:
                this.f2697a = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }

    /* renamed from: x */
    public void mo3323x(float[] fArr) {
        float f;
        boolean z = false;
        switch (C0420a.f2705a[this.f2699a.ordinal()]) {
            case 1:
            case 6:
                this.f2698a = (int) fArr[0];
                return;
            case 2:
                if (((double) fArr[0]) > 0.5d) {
                    z = true;
                }
                this.f2704b = z;
                return;
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
            case 5:
                int HSVToColor = Color.HSVToColor(fArr);
                this.f2702b = HSVToColor;
                this.f2702b = (m3150b((int) (fArr[3] * 255.0f)) << 24) | (HSVToColor & jt4.f14542r);
                return;
            case 7:
                f = fArr[0];
                break;
            case 8:
                f = fArr[0];
                break;
            default:
                return;
        }
        this.f2697a = f;
    }
}
