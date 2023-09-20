package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.C0435e;
import com.onedelhi.secure.q60;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.constraintlayout.widget.b */
public class C0422b {

    /* renamed from: a */
    public static final String f2715a = "ConstraintLayoutStates";

    /* renamed from: a */
    public static final boolean f2716a = false;

    /* renamed from: a */
    public int f2717a = -1;

    /* renamed from: a */
    public SparseArray<C0423a> f2718a = new SparseArray<>();

    /* renamed from: a */
    public final ConstraintLayout f2719a;

    /* renamed from: a */
    public C0426d f2720a;

    /* renamed from: a */
    public q60 f2721a = null;

    /* renamed from: b */
    public int f2722b = -1;

    /* renamed from: b */
    public SparseArray<C0426d> f2723b = new SparseArray<>();

    /* renamed from: androidx.constraintlayout.widget.b$a */
    public static class C0423a {

        /* renamed from: a */
        public int f2724a;

        /* renamed from: a */
        public C0426d f2725a;

        /* renamed from: a */
        public ArrayList<C0424b> f2726a = new ArrayList<>();

        /* renamed from: b */
        public int f2727b = -1;

        public C0423a(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0435e.C0448m.State);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0435e.C0448m.State_android_id) {
                    this.f2724a = obtainStyledAttributes.getResourceId(index, this.f2724a);
                } else if (index == C0435e.C0448m.State_constraints) {
                    this.f2727b = obtainStyledAttributes.getResourceId(index, this.f2727b);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f2727b);
                    context.getResources().getResourceName(this.f2727b);
                    if ("layout".equals(resourceTypeName)) {
                        C0426d dVar = new C0426d();
                        this.f2725a = dVar;
                        dVar.mo3395G(context, this.f2727b);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public void mo3329a(C0424b bVar) {
            this.f2726a.add(bVar);
        }

        /* renamed from: b */
        public int mo3330b(float f, float f2) {
            for (int i = 0; i < this.f2726a.size(); i++) {
                if (this.f2726a.get(i).mo3331a(f, f2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.b$b */
    public static class C0424b {

        /* renamed from: a */
        public float f2728a = Float.NaN;

        /* renamed from: a */
        public int f2729a;

        /* renamed from: a */
        public C0426d f2730a;

        /* renamed from: b */
        public float f2731b = Float.NaN;

        /* renamed from: b */
        public int f2732b = -1;

        /* renamed from: c */
        public float f2733c = Float.NaN;

        /* renamed from: d */
        public float f2734d = Float.NaN;

        public C0424b(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0435e.C0448m.Variant);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0435e.C0448m.Variant_constraints) {
                    this.f2732b = obtainStyledAttributes.getResourceId(index, this.f2732b);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f2732b);
                    context.getResources().getResourceName(this.f2732b);
                    if ("layout".equals(resourceTypeName)) {
                        C0426d dVar = new C0426d();
                        this.f2730a = dVar;
                        dVar.mo3395G(context, this.f2732b);
                    }
                } else if (index == C0435e.C0448m.Variant_region_heightLessThan) {
                    this.f2734d = obtainStyledAttributes.getDimension(index, this.f2734d);
                } else if (index == C0435e.C0448m.Variant_region_heightMoreThan) {
                    this.f2731b = obtainStyledAttributes.getDimension(index, this.f2731b);
                } else if (index == C0435e.C0448m.Variant_region_widthLessThan) {
                    this.f2733c = obtainStyledAttributes.getDimension(index, this.f2733c);
                } else if (index == C0435e.C0448m.Variant_region_widthMoreThan) {
                    this.f2728a = obtainStyledAttributes.getDimension(index, this.f2728a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public boolean mo3331a(float f, float f2) {
            if (!Float.isNaN(this.f2728a) && f < this.f2728a) {
                return false;
            }
            if (!Float.isNaN(this.f2731b) && f2 < this.f2731b) {
                return false;
            }
            if (Float.isNaN(this.f2733c) || f <= this.f2733c) {
                return Float.isNaN(this.f2734d) || f2 <= this.f2734d;
            }
            return false;
        }
    }

    public C0422b(Context context, ConstraintLayout constraintLayout, int i) {
        this.f2719a = constraintLayout;
        mo3324a(context, i);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3324a(android.content.Context r9, int r10) {
        /*
            r8 = this;
            android.content.res.Resources r0 = r9.getResources()
            android.content.res.XmlResourceParser r10 = r0.getXml(r10)
            r0 = 0
            int r1 = r10.getEventType()     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
        L_0x000d:
            r2 = 1
            if (r1 == r2) goto L_0x008c
            if (r1 == 0) goto L_0x007b
            r3 = 2
            if (r1 == r3) goto L_0x0017
            goto L_0x007e
        L_0x0017:
            java.lang.String r1 = r10.getName()     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            r4 = -1
            int r5 = r1.hashCode()     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            r6 = 4
            r7 = 3
            switch(r5) {
                case -1349929691: goto L_0x004d;
                case 80204913: goto L_0x0043;
                case 1382829617: goto L_0x003a;
                case 1657696882: goto L_0x0030;
                case 1901439077: goto L_0x0026;
                default: goto L_0x0025;
            }     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
        L_0x0025:
            goto L_0x0057
        L_0x0026:
            java.lang.String r2 = "Variant"
            boolean r1 = r1.equals(r2)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            if (r1 == 0) goto L_0x0057
            r2 = 3
            goto L_0x0058
        L_0x0030:
            java.lang.String r2 = "layoutDescription"
            boolean r1 = r1.equals(r2)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            if (r1 == 0) goto L_0x0057
            r2 = 0
            goto L_0x0058
        L_0x003a:
            java.lang.String r5 = "StateSet"
            boolean r1 = r1.equals(r5)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            if (r1 == 0) goto L_0x0057
            goto L_0x0058
        L_0x0043:
            java.lang.String r2 = "State"
            boolean r1 = r1.equals(r2)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            if (r1 == 0) goto L_0x0057
            r2 = 2
            goto L_0x0058
        L_0x004d:
            java.lang.String r2 = "ConstraintSet"
            boolean r1 = r1.equals(r2)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            if (r1 == 0) goto L_0x0057
            r2 = 4
            goto L_0x0058
        L_0x0057:
            r2 = -1
        L_0x0058:
            if (r2 == r3) goto L_0x006e
            if (r2 == r7) goto L_0x0063
            if (r2 == r6) goto L_0x005f
            goto L_0x007e
        L_0x005f:
            r8.mo3326c(r9, r10)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            goto L_0x007e
        L_0x0063:
            androidx.constraintlayout.widget.b$b r1 = new androidx.constraintlayout.widget.b$b     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            r1.<init>(r9, r10)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            if (r0 == 0) goto L_0x007e
            r0.mo3329a(r1)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            goto L_0x007e
        L_0x006e:
            androidx.constraintlayout.widget.b$a r0 = new androidx.constraintlayout.widget.b$a     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            r0.<init>(r9, r10)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            android.util.SparseArray<androidx.constraintlayout.widget.b$a> r1 = r8.f2718a     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            int r2 = r0.f2724a     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            r1.put(r2, r0)     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            goto L_0x007e
        L_0x007b:
            r10.getName()     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
        L_0x007e:
            int r1 = r10.next()     // Catch:{ XmlPullParserException -> 0x0088, IOException -> 0x0083 }
            goto L_0x000d
        L_0x0083:
            r9 = move-exception
            r9.printStackTrace()
            goto L_0x008c
        L_0x0088:
            r9 = move-exception
            r9.printStackTrace()
        L_0x008c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C0422b.mo3324a(android.content.Context, int):void");
    }

    /* renamed from: b */
    public boolean mo3325b(int i, float f, float f2) {
        int i2 = this.f2717a;
        if (i2 != i) {
            return true;
        }
        C0423a aVar = (C0423a) (i == -1 ? this.f2718a.valueAt(0) : this.f2718a.get(i2));
        int i3 = this.f2722b;
        return (i3 == -1 || !aVar.f2726a.get(i3).mo3331a(f, f2)) && this.f2722b != aVar.mo3330b(f, f2);
    }

    /* renamed from: c */
    public final void mo3326c(Context context, XmlPullParser xmlPullParser) {
        int i;
        C0426d dVar = new C0426d();
        int attributeCount = xmlPullParser.getAttributeCount();
        int i2 = 0;
        while (i2 < attributeCount) {
            String attributeName = xmlPullParser.getAttributeName(i2);
            String attributeValue = xmlPullParser.getAttributeValue(i2);
            if (attributeName == null || attributeValue == null || !"id".equals(attributeName)) {
                i2++;
            } else {
                if (attributeValue.contains("/")) {
                    i = context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName());
                } else {
                    i = -1;
                }
                if (i == -1) {
                    if (attributeValue.length() > 1) {
                        i = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                dVar.mo3491x0(context, xmlPullParser);
                this.f2723b.put(i, dVar);
                return;
            }
        }
    }

    /* renamed from: d */
    public void mo3327d(q60 q60) {
        this.f2721a = q60;
    }

    /* renamed from: e */
    public void mo3328e(int i, float f, float f2) {
        int b;
        int i2 = this.f2717a;
        if (i2 == i) {
            C0423a aVar = (C0423a) (i == -1 ? this.f2718a.valueAt(0) : this.f2718a.get(i2));
            int i3 = this.f2722b;
            if ((i3 == -1 || !aVar.f2726a.get(i3).mo3331a(f, f2)) && this.f2722b != (b = aVar.mo3330b(f, f2))) {
                C0426d dVar = b == -1 ? this.f2720a : aVar.f2726a.get(b).f2730a;
                int i4 = b == -1 ? aVar.f2727b : aVar.f2726a.get(b).f2732b;
                if (dVar != null) {
                    this.f2722b = b;
                    q60 q60 = this.f2721a;
                    if (q60 != null) {
                        q60.mo22853b(-1, i4);
                    }
                    dVar.mo3473r(this.f2719a);
                    q60 q602 = this.f2721a;
                    if (q602 != null) {
                        q602.mo22852a(-1, i4);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        this.f2717a = i;
        C0423a aVar2 = this.f2718a.get(i);
        int b2 = aVar2.mo3330b(f, f2);
        C0426d dVar2 = b2 == -1 ? aVar2.f2725a : aVar2.f2726a.get(b2).f2730a;
        int i5 = b2 == -1 ? aVar2.f2727b : aVar2.f2726a.get(b2).f2732b;
        if (dVar2 == null) {
            Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i + ", dim =" + f + ", " + f2);
            return;
        }
        this.f2722b = b2;
        q60 q603 = this.f2721a;
        if (q603 != null) {
            q603.mo22853b(i, i5);
        }
        dVar2.mo3473r(this.f2719a);
        q60 q604 = this.f2721a;
        if (q604 != null) {
            q604.mo22852a(i, i5);
        }
    }
}
