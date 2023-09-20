package com.onedelhi.secure;

import android.content.Context;
import android.util.Log;
import android.util.Xml;
import androidx.constraintlayout.widget.C0419a;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class sy1 {

    /* renamed from: a */
    public static final int f20597a = -1;

    /* renamed from: a */
    public static final String f20598a = "CustomMethod";

    /* renamed from: b */
    public static final String f20599b = "CustomAttribute";

    /* renamed from: b */
    public static HashMap<String, Constructor<? extends ly1>> f20600b = null;

    /* renamed from: c */
    public static final String f20601c = "KeyFrames";

    /* renamed from: a */
    public HashMap<Integer, ArrayList<ly1>> f20602a = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends ly1>> hashMap = new HashMap<>();
        f20600b = hashMap;
        try {
            hashMap.put("KeyAttribute", my1.class.getConstructor(new Class[0]));
            f20600b.put("KeyPosition", zy1.class.getConstructor(new Class[0]));
            f20600b.put("KeyCycle", oy1.class.getConstructor(new Class[0]));
            f20600b.put("KeyTimeCycle", cz1.class.getConstructor(new Class[0]));
            f20600b.put("KeyTrigger", dz1.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException e) {
            Log.e(f20601c, "unable to load", e);
        }
    }

    public sy1() {
    }

    public sy1(Context context, XmlPullParser xmlPullParser) {
        HashMap<String, C0419a> hashMap;
        ly1 ly1;
        Exception e;
        ly1 ly12 = null;
        try {
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (f20600b.containsKey(name)) {
                        try {
                            Constructor constructor = f20600b.get(name);
                            if (constructor != null) {
                                ly1 = (ly1) constructor.newInstance(new Object[0]);
                                try {
                                    ly1.mo14440f(context, Xml.asAttributeSet(xmlPullParser));
                                    mo24664c(ly1);
                                } catch (Exception e2) {
                                    e = e2;
                                }
                                ly12 = ly1;
                            } else {
                                throw new NullPointerException("Keymaker for " + name + " not found");
                            }
                        } catch (Exception e3) {
                            Exception exc = e3;
                            ly1 = ly12;
                            e = exc;
                            Log.e(f20601c, "unable to create ", e);
                            ly12 = ly1;
                            eventType = xmlPullParser.next();
                        }
                    } else {
                        if (name.equalsIgnoreCase("CustomAttribute")) {
                            if (ly12 != null) {
                                hashMap = ly12.f15690a;
                                if (hashMap == null) {
                                }
                            }
                        } else if (!(!name.equalsIgnoreCase("CustomMethod") || ly12 == null || (hashMap = ly12.f15690a) == null)) {
                        }
                        C0419a.m3152q(context, xmlPullParser, hashMap);
                    }
                } else if (eventType == 3) {
                    if ("KeyFrameSet".equals(xmlPullParser.getName())) {
                        return;
                    }
                }
                eventType = xmlPullParser.next();
            }
        } catch (XmlPullParserException e4) {
            e4.printStackTrace();
        } catch (IOException e5) {
            e5.printStackTrace();
        }
    }

    /* renamed from: f */
    public static String m28023f(int i, Context context) {
        return context.getResources().getResourceEntryName(i);
    }

    /* renamed from: a */
    public void mo24662a(cl2 cl2) {
        ArrayList arrayList = this.f20602a.get(-1);
        if (arrayList != null) {
            cl2.mo14225b(arrayList);
        }
    }

    /* renamed from: b */
    public void mo24663b(cl2 cl2) {
        ArrayList arrayList = this.f20602a.get(Integer.valueOf(cl2.f10344a));
        if (arrayList != null) {
            cl2.mo14225b(arrayList);
        }
        ArrayList arrayList2 = this.f20602a.get(-1);
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ly1 ly1 = (ly1) it.next();
                if (ly1.mo19936g(((ConstraintLayout.LayoutParams) cl2.f10346a.getLayoutParams()).f2555b)) {
                    cl2.mo14223a(ly1);
                }
            }
        }
    }

    /* renamed from: c */
    public void mo24664c(ly1 ly1) {
        if (!this.f20602a.containsKey(Integer.valueOf(ly1.f15691b))) {
            this.f20602a.put(Integer.valueOf(ly1.f15691b), new ArrayList());
        }
        ArrayList arrayList = this.f20602a.get(Integer.valueOf(ly1.f15691b));
        if (arrayList != null) {
            arrayList.add(ly1);
        }
    }

    /* renamed from: d */
    public ArrayList<ly1> mo24665d(int i) {
        return this.f20602a.get(Integer.valueOf(i));
    }

    /* renamed from: e */
    public Set<Integer> mo24666e() {
        return this.f20602a.keySet();
    }
}
