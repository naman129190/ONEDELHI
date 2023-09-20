package com.onedelhi.secure;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class lz1 {

    /* renamed from: a */
    public static final String f31876a = "name|description|visibility|open|address|phoneNumber";

    /* renamed from: b */
    public static final String f31877b = "Folder|Document";

    /* renamed from: c */
    public static final String f31878c = "Placemark";

    /* renamed from: d */
    public static final String f31879d = "Style";

    /* renamed from: e */
    public static final String f31880e = "StyleMap";

    /* renamed from: f */
    public static final String f31881f = "ExtendedData";

    /* renamed from: g */
    public static final String f31882g = "GroundOverlay";

    /* renamed from: h */
    public static final String f31883h = "altitude|altitudeModeGroup|altitudeMode|begin|bottomFov|cookie|displayName|displayMode|displayMode|end|expires|extrude|flyToView|gridOrigin|httpQuery|leftFov|linkDescription|linkName|linkSnippet|listItemType|maxSnippetLines|maxSessionLength|message|minAltitude|minFadeExtent|minLodPixels|minRefreshPeriod|maxAltitude|maxFadeExtent|maxLodPixels|maxHeight|maxWidth|near|overlayXY|range|refreshMode|refreshInterval|refreshVisibility|rightFov|roll|rotationXY|screenXY|shape|sourceHref|state|targetHref|tessellate|tileSize|topFov|viewBoundScale|viewFormat|viewRefreshMode|viewRefreshTime|when";

    /* renamed from: a */
    public static kz1 m56662a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        ArrayList arrayList = new ArrayList();
        HashMap hashMap4 = new HashMap();
        HashMap hashMap5 = new HashMap();
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "id") != null ? xmlPullParser.getAttributeValue((String) null, "id") : null;
        xmlPullParser.next();
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals(name)) {
                return new kz1(hashMap, hashMap2, hashMap3, hashMap4, arrayList, hashMap5, attributeValue);
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().matches(f31883h)) {
                    sz1.m65052g(xmlPullParser);
                } else if (xmlPullParser.getName().matches("Folder|Document")) {
                    arrayList.add(m56662a(xmlPullParser));
                } else if (xmlPullParser.getName().matches(f31876a)) {
                    hashMap.put(xmlPullParser.getName(), xmlPullParser.nextText());
                } else if (xmlPullParser.getName().equals("StyleMap")) {
                    m56666e(xmlPullParser, hashMap4);
                } else if (xmlPullParser.getName().equals("Style")) {
                    m56665d(xmlPullParser, hashMap2);
                } else if (xmlPullParser.getName().equals("Placemark")) {
                    m56664c(xmlPullParser, hashMap3);
                } else if (xmlPullParser.getName().equals("ExtendedData")) {
                    m56667f(xmlPullParser, hashMap);
                } else if (xmlPullParser.getName().equals("GroundOverlay")) {
                    hashMap5.put(mz1.m57762d(xmlPullParser), (Object) null);
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    /* renamed from: b */
    public static kz1 m56663b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        return m56662a(xmlPullParser);
    }

    /* renamed from: c */
    public static void m56664c(XmlPullParser xmlPullParser, HashMap<tz1, Object> hashMap) throws XmlPullParserException, IOException {
        hashMap.put(mz1.m57766h(xmlPullParser), (Object) null);
    }

    /* renamed from: d */
    public static void m56665d(XmlPullParser xmlPullParser, HashMap<String, xz1> hashMap) throws XmlPullParserException, IOException {
        if (xmlPullParser.getAttributeValue((String) null, "id") != null) {
            xz1 e = yz1.m72403e(xmlPullParser);
            hashMap.put(e.mo47477m(), e);
        }
    }

    /* renamed from: e */
    public static void m56666e(XmlPullParser xmlPullParser, HashMap<String, String> hashMap) throws XmlPullParserException, IOException {
        hashMap.putAll(yz1.m72404f(xmlPullParser));
    }

    /* renamed from: f */
    public static void m56667f(XmlPullParser xmlPullParser, HashMap<String, String> hashMap) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        String str = null;
        while (true) {
            if (eventType != 3 || !xmlPullParser.getName().equals("ExtendedData")) {
                if (eventType == 2) {
                    if (xmlPullParser.getName().equals("Data")) {
                        str = xmlPullParser.getAttributeValue((String) null, "name");
                    } else if (xmlPullParser.getName().equals("value") && str != null) {
                        hashMap.put(str, xmlPullParser.nextText());
                        str = null;
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                return;
            }
        }
    }
}
