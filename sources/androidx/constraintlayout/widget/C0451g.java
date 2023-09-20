package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.C0435e;
import com.onedelhi.secure.q60;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.constraintlayout.widget.g */
public class C0451g {

    /* renamed from: a */
    public static final String f3163a = "ConstraintLayoutStates";

    /* renamed from: a */
    public static final boolean f3164a = false;

    /* renamed from: a */
    public int f3165a = -1;

    /* renamed from: a */
    public SparseArray<C0452a> f3166a = new SparseArray<>();

    /* renamed from: a */
    public C0426d f3167a;

    /* renamed from: a */
    public q60 f3168a = null;

    /* renamed from: b */
    public int f3169b = -1;

    /* renamed from: b */
    public SparseArray<C0426d> f3170b = new SparseArray<>();

    /* renamed from: c */
    public int f3171c = -1;

    /* renamed from: androidx.constraintlayout.widget.g$a */
    public static class C0452a {

        /* renamed from: a */
        public int f3172a;

        /* renamed from: a */
        public ArrayList<C0453b> f3173a = new ArrayList<>();

        /* renamed from: a */
        public boolean f3174a;

        /* renamed from: b */
        public int f3175b = -1;

        public C0452a(Context context, XmlPullParser xmlPullParser) {
            this.f3174a = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0435e.C0448m.State);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0435e.C0448m.State_android_id) {
                    this.f3172a = obtainStyledAttributes.getResourceId(index, this.f3172a);
                } else if (index == C0435e.C0448m.State_constraints) {
                    this.f3175b = obtainStyledAttributes.getResourceId(index, this.f3175b);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f3175b);
                    context.getResources().getResourceName(this.f3175b);
                    if ("layout".equals(resourceTypeName)) {
                        this.f3174a = true;
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public void mo3567a(C0453b bVar) {
            this.f3173a.add(bVar);
        }

        /* renamed from: b */
        public int mo3568b(float f, float f2) {
            for (int i = 0; i < this.f3173a.size(); i++) {
                if (this.f3173a.get(i).mo3569a(f, f2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.g$b */
    public static class C0453b {

        /* renamed from: a */
        public float f3176a = Float.NaN;

        /* renamed from: a */
        public int f3177a;

        /* renamed from: a */
        public boolean f3178a;

        /* renamed from: b */
        public float f3179b = Float.NaN;

        /* renamed from: b */
        public int f3180b = -1;

        /* renamed from: c */
        public float f3181c = Float.NaN;

        /* renamed from: d */
        public float f3182d = Float.NaN;

        public C0453b(Context context, XmlPullParser xmlPullParser) {
            this.f3178a = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0435e.C0448m.Variant);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0435e.C0448m.Variant_constraints) {
                    this.f3180b = obtainStyledAttributes.getResourceId(index, this.f3180b);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f3180b);
                    context.getResources().getResourceName(this.f3180b);
                    if ("layout".equals(resourceTypeName)) {
                        this.f3178a = true;
                    }
                } else if (index == C0435e.C0448m.Variant_region_heightLessThan) {
                    this.f3182d = obtainStyledAttributes.getDimension(index, this.f3182d);
                } else if (index == C0435e.C0448m.Variant_region_heightMoreThan) {
                    this.f3179b = obtainStyledAttributes.getDimension(index, this.f3179b);
                } else if (index == C0435e.C0448m.Variant_region_widthLessThan) {
                    this.f3181c = obtainStyledAttributes.getDimension(index, this.f3181c);
                } else if (index == C0435e.C0448m.Variant_region_widthMoreThan) {
                    this.f3176a = obtainStyledAttributes.getDimension(index, this.f3176a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public boolean mo3569a(float f, float f2) {
            if (!Float.isNaN(this.f3176a) && f < this.f3176a) {
                return false;
            }
            if (!Float.isNaN(this.f3179b) && f2 < this.f3179b) {
                return false;
            }
            if (Float.isNaN(this.f3181c) || f <= this.f3181c) {
                return Float.isNaN(this.f3182d) || f2 <= this.f3182d;
            }
            return false;
        }
    }

    public C0451g(Context context, XmlPullParser xmlPullParser) {
        mo3562b(context, xmlPullParser);
    }

    /* renamed from: a */
    public int mo3561a(int i, int i2, float f, float f2) {
        C0452a aVar = this.f3166a.get(i2);
        if (aVar == null) {
            return i2;
        }
        if (f != -1.0f && f2 != -1.0f) {
            C0453b bVar = null;
            Iterator<C0453b> it = aVar.f3173a.iterator();
            while (it.hasNext()) {
                C0453b next = it.next();
                if (next.mo3569a(f, f2)) {
                    if (i == next.f3180b) {
                        return i;
                    }
                    bVar = next;
                }
            }
            return bVar != null ? bVar.f3180b : aVar.f3175b;
        } else if (aVar.f3175b == i) {
            return i;
        } else {
            Iterator<C0453b> it2 = aVar.f3173a.iterator();
            while (it2.hasNext()) {
                if (i == it2.next().f3180b) {
                    return i;
                }
            }
            return aVar.f3175b;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3562b(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            r9 = this;
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)
            int[] r1 = androidx.constraintlayout.widget.C0435e.C0448m.StateSet
            android.content.res.TypedArray r0 = r10.obtainStyledAttributes(r0, r1)
            int r1 = r0.getIndexCount()
            r2 = 0
            r3 = 0
        L_0x0010:
            if (r3 >= r1) goto L_0x0025
            int r4 = r0.getIndex(r3)
            int r5 = androidx.constraintlayout.widget.C0435e.C0448m.StateSet_defaultState
            if (r4 != r5) goto L_0x0022
            int r5 = r9.f3165a
            int r4 = r0.getResourceId(r4, r5)
            r9.f3165a = r4
        L_0x0022:
            int r3 = r3 + 1
            goto L_0x0010
        L_0x0025:
            r0.recycle()
            r0 = 0
            int r1 = r11.getEventType()     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
        L_0x002d:
            r3 = 1
            if (r1 == r3) goto L_0x00a7
            if (r1 == 0) goto L_0x0096
            java.lang.String r4 = "StateSet"
            r5 = 3
            r6 = 2
            if (r1 == r6) goto L_0x0046
            if (r1 == r5) goto L_0x003b
            goto L_0x0099
        L_0x003b:
            java.lang.String r1 = r11.getName()     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            boolean r1 = r4.equals(r1)     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            if (r1 == 0) goto L_0x0099
            return
        L_0x0046:
            java.lang.String r1 = r11.getName()     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            r7 = -1
            int r8 = r1.hashCode()     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            switch(r8) {
                case 80204913: goto L_0x006e;
                case 1301459538: goto L_0x0064;
                case 1382829617: goto L_0x005d;
                case 1901439077: goto L_0x0053;
                default: goto L_0x0052;
            }     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
        L_0x0052:
            goto L_0x0078
        L_0x0053:
            java.lang.String r3 = "Variant"
            boolean r1 = r1.equals(r3)     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            if (r1 == 0) goto L_0x0078
            r3 = 3
            goto L_0x0079
        L_0x005d:
            boolean r1 = r1.equals(r4)     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            if (r1 == 0) goto L_0x0078
            goto L_0x0079
        L_0x0064:
            java.lang.String r3 = "LayoutDescription"
            boolean r1 = r1.equals(r3)     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            if (r1 == 0) goto L_0x0078
            r3 = 0
            goto L_0x0079
        L_0x006e:
            java.lang.String r3 = "State"
            boolean r1 = r1.equals(r3)     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            if (r1 == 0) goto L_0x0078
            r3 = 2
            goto L_0x0079
        L_0x0078:
            r3 = -1
        L_0x0079:
            if (r3 == r6) goto L_0x0089
            if (r3 == r5) goto L_0x007e
            goto L_0x0099
        L_0x007e:
            androidx.constraintlayout.widget.g$b r1 = new androidx.constraintlayout.widget.g$b     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            r1.<init>(r10, r11)     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            if (r0 == 0) goto L_0x0099
            r0.mo3567a(r1)     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            goto L_0x0099
        L_0x0089:
            androidx.constraintlayout.widget.g$a r0 = new androidx.constraintlayout.widget.g$a     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            r0.<init>(r10, r11)     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            android.util.SparseArray<androidx.constraintlayout.widget.g$a> r1 = r9.f3166a     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            int r3 = r0.f3172a     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            r1.put(r3, r0)     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            goto L_0x0099
        L_0x0096:
            r11.getName()     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
        L_0x0099:
            int r1 = r11.next()     // Catch:{ XmlPullParserException -> 0x00a3, IOException -> 0x009e }
            goto L_0x002d
        L_0x009e:
            r10 = move-exception
            r10.printStackTrace()
            goto L_0x00a7
        L_0x00a3:
            r10 = move-exception
            r10.printStackTrace()
        L_0x00a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C0451g.mo3562b(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    /* renamed from: c */
    public boolean mo3563c(int i, float f, float f2) {
        int i2 = this.f3169b;
        if (i2 != i) {
            return true;
        }
        C0452a aVar = (C0452a) (i == -1 ? this.f3166a.valueAt(0) : this.f3166a.get(i2));
        int i3 = this.f3171c;
        return (i3 == -1 || !aVar.f3173a.get(i3).mo3569a(f, f2)) && this.f3171c != aVar.mo3568b(f, f2);
    }

    /* renamed from: d */
    public void mo3564d(q60 q60) {
        this.f3168a = q60;
    }

    /* renamed from: e */
    public int mo3565e(int i, int i2, int i3) {
        return mo3566f(-1, i, (float) i2, (float) i3);
    }

    /* renamed from: f */
    public int mo3566f(int i, int i2, float f, float f2) {
        int b;
        if (i == i2) {
            C0452a aVar = (C0452a) (i2 == -1 ? this.f3166a.valueAt(0) : this.f3166a.get(this.f3169b));
            if (aVar == null) {
                return -1;
            }
            return ((this.f3171c == -1 || !aVar.f3173a.get(i).mo3569a(f, f2)) && i != (b = aVar.mo3568b(f, f2))) ? b == -1 ? aVar.f3175b : aVar.f3173a.get(b).f3180b : i;
        }
        C0452a aVar2 = this.f3166a.get(i2);
        if (aVar2 == null) {
            return -1;
        }
        int b2 = aVar2.mo3568b(f, f2);
        return b2 == -1 ? aVar2.f3175b : aVar2.f3173a.get(b2).f3180b;
    }
}
