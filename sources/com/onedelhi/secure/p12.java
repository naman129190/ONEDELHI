package com.onedelhi.secure;

import android.util.AttributeSet;
import androidx.constraintlayout.motion.widget.C0393b;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Deque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class p12 {
    @mr2

    /* renamed from: a */
    public final Deque<WeakReference<XmlPullParser>> f18286a = new ArrayDeque();

    /* renamed from: b */
    public static boolean m24335b(@ts2 XmlPullParser xmlPullParser) {
        if (xmlPullParser == null) {
            return true;
        }
        try {
            return xmlPullParser.getEventType() == 3 || xmlPullParser.getEventType() == 1;
        } catch (XmlPullParserException unused) {
            return true;
        }
    }

    @ts2
    /* renamed from: c */
    public static XmlPullParser m24336c(@mr2 Deque<WeakReference<XmlPullParser>> deque) {
        while (!deque.isEmpty()) {
            XmlPullParser xmlPullParser = (XmlPullParser) deque.peek().get();
            if (!m24335b(xmlPullParser)) {
                return xmlPullParser;
            }
            deque.pop();
        }
        return null;
    }

    /* renamed from: d */
    public static boolean m24337d(@mr2 XmlPullParser xmlPullParser, @ts2 XmlPullParser xmlPullParser2) {
        if (xmlPullParser2 == null || xmlPullParser == xmlPullParser2) {
            return false;
        }
        try {
            if (xmlPullParser2.getEventType() == 2) {
                return C0393b.f2117h.equals(xmlPullParser2.getName());
            }
            return false;
        } catch (XmlPullParserException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo22202a(@mr2 AttributeSet attributeSet) {
        if (!(attributeSet instanceof XmlPullParser)) {
            return false;
        }
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        if (xmlPullParser.getDepth() != 1) {
            return false;
        }
        XmlPullParser c = m24336c(this.f18286a);
        this.f18286a.push(new WeakReference(xmlPullParser));
        return m24337d(xmlPullParser, c);
    }
}
