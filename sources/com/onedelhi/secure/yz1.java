package com.onedelhi.secure;

import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class yz1 {

    /* renamed from: a */
    public static final String f38139a = "styleUrl";

    /* renamed from: b */
    public static final String f38140b = "heading";

    /* renamed from: c */
    public static final String f38141c = "Icon";

    /* renamed from: d */
    public static final String f38142d = "scale";

    /* renamed from: e */
    public static final String f38143e = "hotSpot";

    /* renamed from: f */
    public static final String f38144f = "color";

    /* renamed from: g */
    public static final String f38145g = "colorMode";

    /* renamed from: h */
    public static final String f38146h = "key";

    /* renamed from: i */
    public static final String f38147i = "normal";

    /* renamed from: j */
    public static final String f38148j = "width";

    /* renamed from: k */
    public static final String f38149k = "outline";

    /* renamed from: l */
    public static final String f38150l = "fill";

    /* renamed from: a */
    public static void m72399a(XmlPullParser xmlPullParser, xz1 xz1) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 3 || !xmlPullParser.getName().equals("BalloonStyle")) {
                if (eventType == 2 && xmlPullParser.getName().equals("text")) {
                    xz1.mo47463B(xmlPullParser.nextText());
                }
                eventType = xmlPullParser.next();
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public static void m72400b(XmlPullParser xmlPullParser, xz1 xz1) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 3 || !xmlPullParser.getName().equals("IconStyle")) {
                if (eventType == 2) {
                    if (xmlPullParser.getName().equals(f38140b)) {
                        xz1.mo47488w(Float.parseFloat(xmlPullParser.nextText()));
                    } else if (xmlPullParser.getName().equals(f38141c)) {
                        m72406h(xmlPullParser, xz1);
                    } else if (xmlPullParser.getName().equals(f38143e)) {
                        m72405g(xmlPullParser, xz1);
                    } else if (xmlPullParser.getName().equals(f38142d)) {
                        xz1.mo47491z(Double.parseDouble(xmlPullParser.nextText()));
                    } else if (xmlPullParser.getName().equals("color")) {
                        xz1.mo47465D(xmlPullParser.nextText());
                    } else if (xmlPullParser.getName().equals(f38145g)) {
                        xz1.mo47490y(xmlPullParser.nextText());
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public static void m72401c(XmlPullParser xmlPullParser, xz1 xz1) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 3 || !xmlPullParser.getName().equals("LineStyle")) {
                if (eventType == 2) {
                    if (xmlPullParser.getName().equals("color")) {
                        xz1.mo47467F(xmlPullParser.nextText());
                    } else if (xmlPullParser.getName().equals(f38148j)) {
                        xz1.mo47470I(Float.valueOf(xmlPullParser.nextText()));
                    } else if (xmlPullParser.getName().equals(f38145g)) {
                        xz1.mo47464C(xmlPullParser.nextText());
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    public static void m72402d(XmlPullParser xmlPullParser, xz1 xz1) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 3 || !xmlPullParser.getName().equals("PolyStyle")) {
                if (eventType == 2) {
                    if (xmlPullParser.getName().equals("color")) {
                        xz1.mo47487v(xmlPullParser.nextText());
                    } else if (xmlPullParser.getName().equals(f38149k)) {
                        xz1.mo47466E(jz1.m53898a(xmlPullParser.nextText()));
                    } else if (xmlPullParser.getName().equals(f38150l)) {
                        xz1.mo47486u(jz1.m53898a(xmlPullParser.nextText()));
                    } else if (xmlPullParser.getName().equals(f38145g)) {
                        xz1.mo47468G(xmlPullParser.nextText());
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    public static xz1 m72403e(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        xz1 xz1 = new xz1();
        m72407i(xmlPullParser.getAttributeValue((String) null, "id"), xz1);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("Style")) {
                return xz1;
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals("IconStyle")) {
                    m72400b(xmlPullParser, xz1);
                } else if (xmlPullParser.getName().equals("LineStyle")) {
                    m72401c(xmlPullParser, xz1);
                } else if (xmlPullParser.getName().equals("PolyStyle")) {
                    m72402d(xmlPullParser, xz1);
                } else if (xmlPullParser.getName().equals("BalloonStyle")) {
                    m72399a(xmlPullParser, xz1);
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    /* renamed from: f */
    public static HashMap<String, String> m72404f(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        HashMap<String, String> hashMap = new HashMap<>();
        Boolean bool = Boolean.FALSE;
        String str = "#" + xmlPullParser.getAttributeValue((String) null, "id");
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("StyleMap")) {
                return hashMap;
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals("key") && xmlPullParser.nextText().equals(f38147i)) {
                    bool = Boolean.TRUE;
                } else if (xmlPullParser.getName().equals("styleUrl") && bool.booleanValue()) {
                    hashMap.put(str, xmlPullParser.nextText());
                    bool = Boolean.FALSE;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    /* renamed from: g */
    public static void m72405g(XmlPullParser xmlPullParser, xz1 xz1) {
        Float valueOf = Float.valueOf(Float.parseFloat(xmlPullParser.getAttributeValue((String) null, "x")));
        Float valueOf2 = Float.valueOf(Float.parseFloat(xmlPullParser.getAttributeValue((String) null, "y")));
        xz1.mo47489x(valueOf.floatValue(), valueOf2.floatValue(), xmlPullParser.getAttributeValue((String) null, "xunits"), xmlPullParser.getAttributeValue((String) null, "yunits"));
    }

    /* renamed from: h */
    public static void m72406h(XmlPullParser xmlPullParser, xz1 xz1) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 3 || !xmlPullParser.getName().equals(f38141c)) {
                if (eventType == 2 && xmlPullParser.getName().equals("href")) {
                    xz1.mo47462A(xmlPullParser.nextText());
                }
                eventType = xmlPullParser.next();
            } else {
                return;
            }
        }
    }

    /* renamed from: i */
    public static void m72407i(String str, xz1 xz1) {
        if (str != null) {
            xz1.mo47469H("#" + str);
        }
    }
}
