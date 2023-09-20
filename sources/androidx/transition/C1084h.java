package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.ViewGroup;
import com.onedelhi.secure.C1655a7;
import com.onedelhi.secure.C3042oa;
import com.onedelhi.secure.ak4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.xj4;
import java.io.IOException;
import java.lang.reflect.Constructor;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.transition.h */
public class C1084h {

    /* renamed from: a */
    public static final C3042oa<String, Constructor<?>> f5712a = new C3042oa<>();

    /* renamed from: a */
    public static final Class<?>[] f5713a = {Context.class, AttributeSet.class};

    /* renamed from: a */
    public final Context f5714a;

    public C1084h(@mr2 Context context) {
        this.f5714a = context;
    }

    /* renamed from: d */
    public static C1084h m7171d(Context context) {
        return new C1084h(context);
    }

    /* renamed from: a */
    public final Object mo7037a(AttributeSet attributeSet, Class<?> cls, String str) {
        Object newInstance;
        Class<? extends U> asSubclass;
        String attributeValue = attributeSet.getAttributeValue((String) null, "class");
        if (attributeValue != null) {
            try {
                C3042oa<String, Constructor<?>> oaVar = f5712a;
                synchronized (oaVar) {
                    Constructor<? extends U> constructor = oaVar.get(attributeValue);
                    if (constructor == null && (asSubclass = Class.forName(attributeValue, false, this.f5714a.getClassLoader()).asSubclass(cls)) != null) {
                        constructor = asSubclass.getConstructor(f5713a);
                        constructor.setAccessible(true);
                        oaVar.put(attributeValue, constructor);
                    }
                    newInstance = constructor.newInstance(new Object[]{this.f5714a, attributeSet});
                }
                return newInstance;
            } catch (Exception e) {
                throw new InflateException("Could not instantiate " + cls + " class " + attributeValue, e);
            }
        } else {
            throw new InflateException(str + " tag must have a 'class' attribute");
        }
    }

    /* renamed from: b */
    public final Transition mo7038b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Transition transition) throws XmlPullParserException, IOException {
        Transition transition2;
        PathMotion patternPathMotion;
        int depth = xmlPullParser.getDepth();
        TransitionSet transitionSet = transition instanceof TransitionSet ? (TransitionSet) transition : null;
        loop0:
        while (true) {
            transition2 = null;
            while (true) {
                int next = xmlPullParser.next();
                if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                    if (next == 2) {
                        String name = xmlPullParser.getName();
                        if ("fade".equals(name)) {
                            transition2 = new Fade(this.f5714a, attributeSet);
                        } else if ("changeBounds".equals(name)) {
                            transition2 = new ChangeBounds(this.f5714a, attributeSet);
                        } else if ("slide".equals(name)) {
                            transition2 = new Slide(this.f5714a, attributeSet);
                        } else if ("explode".equals(name)) {
                            transition2 = new Explode(this.f5714a, attributeSet);
                        } else if ("changeImageTransform".equals(name)) {
                            transition2 = new ChangeImageTransform(this.f5714a, attributeSet);
                        } else if ("changeTransform".equals(name)) {
                            transition2 = new ChangeTransform(this.f5714a, attributeSet);
                        } else if ("changeClipBounds".equals(name)) {
                            transition2 = new ChangeClipBounds(this.f5714a, attributeSet);
                        } else if (ak4.C1715h.f9307f.equals(name)) {
                            transition2 = new AutoTransition(this.f5714a, attributeSet);
                        } else if ("changeScroll".equals(name)) {
                            transition2 = new ChangeScroll(this.f5714a, attributeSet);
                        } else if ("transitionSet".equals(name)) {
                            transition2 = new TransitionSet(this.f5714a, attributeSet);
                        } else if (C1655a7.f8848e.equals(name)) {
                            transition2 = (Transition) mo7037a(attributeSet, Transition.class, C1655a7.f8848e);
                        } else if ("targets".equals(name)) {
                            mo7040e(xmlPullParser, attributeSet, transition);
                        } else {
                            if ("arcMotion".equals(name)) {
                                if (transition != null) {
                                    patternPathMotion = new ArcMotion(this.f5714a, attributeSet);
                                } else {
                                    throw new RuntimeException("Invalid use of arcMotion element");
                                }
                            } else if ("pathMotion".equals(name)) {
                                if (transition != null) {
                                    patternPathMotion = (PathMotion) mo7037a(attributeSet, PathMotion.class, "pathMotion");
                                } else {
                                    throw new RuntimeException("Invalid use of pathMotion element");
                                }
                            } else if (!"patternPathMotion".equals(name)) {
                                throw new RuntimeException("Unknown scene name: " + xmlPullParser.getName());
                            } else if (transition != null) {
                                patternPathMotion = new PatternPathMotion(this.f5714a, attributeSet);
                            } else {
                                throw new RuntimeException("Invalid use of patternPathMotion element");
                            }
                            transition.mo6950u0(patternPathMotion);
                        }
                        if (transition2 == null) {
                            continue;
                        } else {
                            if (!xmlPullParser.isEmptyElementTag()) {
                                mo7038b(xmlPullParser, attributeSet, transition2);
                            }
                            if (transitionSet != null) {
                                break;
                            } else if (transition != null) {
                                throw new InflateException("Could not add transition to another transition.");
                            }
                        }
                    }
                }
            }
            transitionSet.mo6970F0(transition2);
        }
        return transition2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        return r1;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.transition.C1086j mo7039c(org.xmlpull.v1.XmlPullParser r5, android.util.AttributeSet r6, android.view.ViewGroup r7) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r4 = this;
            int r0 = r5.getDepth()
            r1 = 0
        L_0x0005:
            int r2 = r5.next()
            r3 = 3
            if (r2 != r3) goto L_0x0012
            int r3 = r5.getDepth()
            if (r3 <= r0) goto L_0x0054
        L_0x0012:
            r3 = 1
            if (r2 == r3) goto L_0x0054
            r3 = 2
            if (r2 == r3) goto L_0x0019
            goto L_0x0005
        L_0x0019:
            java.lang.String r2 = r5.getName()
            java.lang.String r3 = "transitionManager"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x002b
            androidx.transition.j r1 = new androidx.transition.j
            r1.<init>()
            goto L_0x0005
        L_0x002b:
            java.lang.String r3 = "transition"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0039
            if (r1 == 0) goto L_0x0039
            r4.mo7043h(r6, r5, r7, r1)
            goto L_0x0005
        L_0x0039:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Unknown scene name: "
            r7.append(r0)
            java.lang.String r5 = r5.getName()
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r6.<init>(r5)
            throw r6
        L_0x0054:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.C1084h.mo7039c(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.ViewGroup):androidx.transition.j");
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: e */
    public final void mo7040e(XmlPullParser xmlPullParser, AttributeSet attributeSet, Transition transition) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                if (xmlPullParser.getName().equals("target")) {
                    TypedArray obtainStyledAttributes = this.f5714a.obtainStyledAttributes(attributeSet, C1072g.f5677a);
                    int l = xj4.m31495l(obtainStyledAttributes, xmlPullParser, "targetId", 1, 0);
                    if (l != 0) {
                        transition.mo6914b(l);
                    } else {
                        int l2 = xj4.m31495l(obtainStyledAttributes, xmlPullParser, "excludeId", 2, 0);
                        if (l2 != 0) {
                            transition.mo6956y(l2, true);
                        } else {
                            String m = xj4.m31496m(obtainStyledAttributes, xmlPullParser, "targetName", 4);
                            if (m != null) {
                                transition.mo6922e(m);
                            } else {
                                String m2 = xj4.m31496m(obtainStyledAttributes, xmlPullParser, "excludeName", 5);
                                if (m2 != null) {
                                    transition.mo6891B(m2, true);
                                } else {
                                    String m3 = xj4.m31496m(obtainStyledAttributes, xmlPullParser, "excludeClass", 3);
                                    if (m3 != null) {
                                        try {
                                            transition.mo6890A(Class.forName(m3), true);
                                        } catch (ClassNotFoundException e) {
                                            obtainStyledAttributes.recycle();
                                            throw new RuntimeException("Could not create " + m3, e);
                                        }
                                    } else {
                                        String m4 = xj4.m31496m(obtainStyledAttributes, xmlPullParser, "targetClass", 0);
                                        if (m4 != null) {
                                            transition.mo6920d(Class.forName(m4));
                                        }
                                    }
                                }
                            }
                        }
                    }
                    obtainStyledAttributes.recycle();
                } else {
                    throw new RuntimeException("Unknown scene name: " + xmlPullParser.getName());
                }
            }
        }
    }

    /* renamed from: f */
    public Transition mo7041f(int i) {
        XmlResourceParser xml = this.f5714a.getResources().getXml(i);
        try {
            Transition b = mo7038b(xml, Xml.asAttributeSet(xml), (Transition) null);
            xml.close();
            return b;
        } catch (XmlPullParserException e) {
            throw new InflateException(e.getMessage(), e);
        } catch (IOException e2) {
            throw new InflateException(xml.getPositionDescription() + ": " + e2.getMessage(), e2);
        } catch (Throwable th) {
            xml.close();
            throw th;
        }
    }

    /* renamed from: g */
    public C1086j mo7042g(int i, ViewGroup viewGroup) {
        XmlResourceParser xml = this.f5714a.getResources().getXml(i);
        try {
            C1086j c = mo7039c(xml, Xml.asAttributeSet(xml), viewGroup);
            xml.close();
            return c;
        } catch (XmlPullParserException e) {
            InflateException inflateException = new InflateException(e.getMessage());
            inflateException.initCause(e);
            throw inflateException;
        } catch (IOException e2) {
            InflateException inflateException2 = new InflateException(xml.getPositionDescription() + ": " + e2.getMessage());
            inflateException2.initCause(e2);
            throw inflateException2;
        } catch (Throwable th) {
            xml.close();
            throw th;
        }
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: h */
    public final void mo7043h(AttributeSet attributeSet, XmlPullParser xmlPullParser, ViewGroup viewGroup, C1086j jVar) throws Resources.NotFoundException {
        Transition f;
        TypedArray obtainStyledAttributes = this.f5714a.obtainStyledAttributes(attributeSet, C1072g.f5678b);
        int l = xj4.m31495l(obtainStyledAttributes, xmlPullParser, C1655a7.f8848e, 2, -1);
        int l2 = xj4.m31495l(obtainStyledAttributes, xmlPullParser, "fromScene", 0, -1);
        C1071f fVar = null;
        C1071f d = l2 < 0 ? null : C1071f.m7163d(viewGroup, l2, this.f5714a);
        int l3 = xj4.m31495l(obtainStyledAttributes, xmlPullParser, "toScene", 1, -1);
        if (l3 >= 0) {
            fVar = C1071f.m7163d(viewGroup, l3, this.f5714a);
        }
        if (l >= 0 && (f = mo7041f(l)) != null) {
            if (fVar == null) {
                throw new RuntimeException("No toScene for transition ID " + l);
            } else if (d == null) {
                jVar.mo7046l(fVar, f);
            } else {
                jVar.mo7045k(d, fVar, f);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
