package com.onedelhi.secure;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class mz1 {

    /* renamed from: a */
    public static final int f32310a = 0;

    /* renamed from: a */
    public static final String f32311a = "Point|LineString|Polygon|MultiGeometry";

    /* renamed from: b */
    public static final int f32312b = 1;

    /* renamed from: b */
    public static final String f32313b = "name|description|drawOrder|visibility|open|address|phoneNumber";

    /* renamed from: c */
    public static final String f32314c = "outerBoundaryIs|innerBoundaryIs";

    /* renamed from: d */
    public static final String f32315d = "ExtendedData";

    /* renamed from: e */
    public static final String f32316e = "styleUrl";

    /* renamed from: f */
    public static final String f32317f = "Style";

    /* renamed from: g */
    public static final String f32318g = "north|south|east|west";

    /* renamed from: a */
    public static LatLng m57759a(String str) {
        String[] split = str.split(vf4.f36537c);
        return new LatLng(Double.valueOf(Double.parseDouble(split[1])).doubleValue(), Double.valueOf(Double.parseDouble(split[0])).doubleValue());
    }

    /* renamed from: b */
    public static ArrayList<LatLng> m57760b(String str) {
        ArrayList<LatLng> arrayList = new ArrayList<>();
        for (String a : str.trim().split("(\\s+)")) {
            arrayList.add(m57759a(a));
        }
        return arrayList;
    }

    /* renamed from: c */
    public static nz1 m57761c(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals(str)) {
                return null;
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals("Point")) {
                    return m57767i(xmlPullParser);
                }
                if (xmlPullParser.getName().equals("LineString")) {
                    return m57764f(xmlPullParser);
                }
                if (xmlPullParser.getName().equals("Polygon")) {
                    return m57768j(xmlPullParser);
                }
                if (xmlPullParser.getName().equals(rz1.f34809a)) {
                    return m57765g(xmlPullParser);
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    /* renamed from: d */
    public static oz1 m57762d(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        int eventType = xmlPullParser.getEventType();
        String str = null;
        float f = 0.0f;
        int i = 1;
        float f2 = 0.0f;
        while (true) {
            if (eventType != 3 || !xmlPullParser.getName().equals("GroundOverlay")) {
                if (eventType == 2) {
                    if (xmlPullParser.getName().equals(yz1.f38141c)) {
                        str = m57769k(xmlPullParser);
                    } else if (xmlPullParser.getName().equals("drawOrder")) {
                        f = Float.parseFloat(xmlPullParser.nextText());
                    } else if (xmlPullParser.getName().equals("visibility")) {
                        i = Integer.parseInt(xmlPullParser.nextText());
                    } else if (xmlPullParser.getName().equals("ExtendedData")) {
                        hashMap.putAll(m57771m(xmlPullParser));
                    } else if (xmlPullParser.getName().equals(ly1.f15667d)) {
                        f2 = m57770l(xmlPullParser);
                    } else if (xmlPullParser.getName().matches(f32313b) || xmlPullParser.getName().equals("color")) {
                        hashMap.put(xmlPullParser.getName(), xmlPullParser.nextText());
                    } else if (xmlPullParser.getName().matches(f32318g)) {
                        hashMap2.put(xmlPullParser.getName(), Double.valueOf(Double.parseDouble(xmlPullParser.nextText())));
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                return new oz1(str, m57763e((Double) hashMap2.get("north"), (Double) hashMap2.get("south"), (Double) hashMap2.get("east"), (Double) hashMap2.get("west")), f, i, hashMap, f2);
            }
        }
    }

    /* renamed from: e */
    public static LatLngBounds m57763e(Double d, Double d2, Double d3, Double d4) {
        return new LatLngBounds(new LatLng(d2.doubleValue(), d4.doubleValue()), new LatLng(d.doubleValue(), d3.doubleValue()));
    }

    /* renamed from: f */
    public static qz1 m57764f(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ArrayList<LatLng> arrayList = new ArrayList<>();
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("LineString")) {
                return new qz1(arrayList);
            }
            if (eventType == 2 && xmlPullParser.getName().equals(jf1.f30738g)) {
                arrayList = m57760b(xmlPullParser.nextText());
            }
            eventType = xmlPullParser.next();
        }
    }

    /* renamed from: g */
    public static rz1 m57765g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3 && xmlPullParser.getName().equals(rz1.f34809a)) {
                return new rz1(arrayList);
            }
            if (next == 2 && xmlPullParser.getName().matches(f32311a)) {
                arrayList.add(m57761c(xmlPullParser, xmlPullParser.getName()));
            }
        }
    }

    /* renamed from: h */
    public static tz1 m57766h(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        HashMap hashMap = new HashMap();
        int eventType = xmlPullParser.getEventType();
        nz1 nz1 = null;
        String str = null;
        xz1 xz1 = null;
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("Placemark")) {
                return new tz1(nz1, str, xz1, hashMap);
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals("styleUrl")) {
                    str = xmlPullParser.nextText();
                } else if (xmlPullParser.getName().matches(f32311a)) {
                    nz1 = m57761c(xmlPullParser, xmlPullParser.getName());
                } else if (xmlPullParser.getName().matches(f32313b)) {
                    hashMap.put(xmlPullParser.getName(), xmlPullParser.nextText());
                } else if (xmlPullParser.getName().equals("ExtendedData")) {
                    hashMap.putAll(m57771m(xmlPullParser));
                } else if (xmlPullParser.getName().equals("Style")) {
                    xz1 = yz1.m72403e(xmlPullParser);
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    /* renamed from: i */
    public static uz1 m57767i(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        LatLng latLng = null;
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("Point")) {
                return new uz1(latLng);
            }
            if (eventType == 2 && xmlPullParser.getName().equals(jf1.f30738g)) {
                latLng = m57759a(xmlPullParser.nextText());
            }
            eventType = xmlPullParser.next();
        }
    }

    /* renamed from: j */
    public static vz1 m57768j(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        Boolean bool = Boolean.FALSE;
        ArrayList<LatLng> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("Polygon")) {
                return new vz1(arrayList, arrayList2);
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().matches(f32314c)) {
                    bool = Boolean.valueOf(xmlPullParser.getName().equals("outerBoundaryIs"));
                } else if (xmlPullParser.getName().equals(jf1.f30738g)) {
                    if (bool.booleanValue()) {
                        arrayList = m57760b(xmlPullParser.nextText());
                    } else {
                        arrayList2.add(m57760b(xmlPullParser.nextText()));
                    }
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    /* renamed from: k */
    public static String m57769k(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals(yz1.f38141c)) {
                return null;
            }
            if (eventType == 2 && xmlPullParser.getName().equals("href")) {
                return xmlPullParser.nextText();
            }
            eventType = xmlPullParser.next();
        }
    }

    /* renamed from: l */
    public static float m57770l(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        return -Float.parseFloat(xmlPullParser.nextText());
    }

    /* renamed from: m */
    public static HashMap<String, String> m57771m(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        HashMap<String, String> hashMap = new HashMap<>();
        int eventType = xmlPullParser.getEventType();
        String str = null;
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("ExtendedData")) {
                return hashMap;
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals("Data")) {
                    str = xmlPullParser.getAttributeValue((String) null, "name");
                } else if (xmlPullParser.getName().equals("value") && str != null) {
                    hashMap.put(str, xmlPullParser.nextText());
                    str = null;
                }
            }
            eventType = xmlPullParser.next();
        }
    }
}
