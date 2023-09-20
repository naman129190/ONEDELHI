package com.onedelhi.secure;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class sz1 {

    /* renamed from: a */
    public static final String f35263a = "Style";

    /* renamed from: b */
    public static final String f35264b = "StyleMap";

    /* renamed from: c */
    public static final String f35265c = "Placemark";

    /* renamed from: d */
    public static final String f35266d = "GroundOverlay";

    /* renamed from: e */
    public static final String f35267e = "Folder|Document";

    /* renamed from: f */
    public static final String f35268f = "altitude|altitudeModeGroup|altitudeMode|begin|bottomFov|cookie|displayName|displayMode|displayMode|end|expires|extrude|flyToView|gridOrigin|httpQuery|leftFov|linkDescription|linkName|linkSnippet|listItemType|maxSnippetLines|maxSessionLength|message|minAltitude|minFadeExtent|minLodPixels|minRefreshPeriod|maxAltitude|maxFadeExtent|maxLodPixels|maxHeight|maxWidth|near|NetworkLink|NetworkLinkControl|overlayXY|range|refreshMode|refreshInterval|refreshVisibility|rightFov|roll|rotationXY|screenXY|shape|sourceHref|state|targetHref|tessellate|tileSize|topFov|viewBoundScale|viewFormat|viewRefreshMode|viewRefreshTime|when";

    /* renamed from: a */
    public final ArrayList<kz1> f35269a = new ArrayList<>();

    /* renamed from: a */
    public final HashMap<tz1, Object> f35270a = new HashMap<>();

    /* renamed from: a */
    public final XmlPullParser f35271a;

    /* renamed from: b */
    public final HashMap<String, xz1> f35272b = new HashMap<>();

    /* renamed from: c */
    public final HashMap<String, String> f35273c = new HashMap<>();

    /* renamed from: d */
    public final HashMap<oz1, wi1> f35274d = new HashMap<>();

    public sz1(XmlPullParser xmlPullParser) {
        this.f35271a = xmlPullParser;
    }

    /* renamed from: g */
    public static void m65052g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() == 2) {
            int i = 1;
            while (i != 0) {
                int next = xmlPullParser.next();
                if (next == 2) {
                    i++;
                } else if (next == 3) {
                    i--;
                }
            }
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public ArrayList<kz1> mo44651a() {
        return this.f35269a;
    }

    /* renamed from: b */
    public HashMap<oz1, wi1> mo44652b() {
        return this.f35274d;
    }

    /* renamed from: c */
    public HashMap<tz1, Object> mo44653c() {
        return this.f35270a;
    }

    /* renamed from: d */
    public HashMap<String, String> mo44654d() {
        return this.f35273c;
    }

    /* renamed from: e */
    public HashMap<String, xz1> mo44655e() {
        return this.f35272b;
    }

    /* renamed from: f */
    public void mo44656f() throws XmlPullParserException, IOException {
        int eventType = this.f35271a.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                if (this.f35271a.getName().matches(f35268f)) {
                    m65052g(this.f35271a);
                }
                if (this.f35271a.getName().matches("Folder|Document")) {
                    this.f35269a.add(lz1.m56663b(this.f35271a));
                }
                if (this.f35271a.getName().equals("Style")) {
                    xz1 e = yz1.m72403e(this.f35271a);
                    this.f35272b.put(e.mo47477m(), e);
                }
                if (this.f35271a.getName().equals("StyleMap")) {
                    this.f35273c.putAll(yz1.m72404f(this.f35271a));
                }
                if (this.f35271a.getName().equals("Placemark")) {
                    this.f35270a.put(mz1.m57766h(this.f35271a), (Object) null);
                }
                if (this.f35271a.getName().equals("GroundOverlay")) {
                    this.f35274d.put(mz1.m57762d(this.f35271a), (Object) null);
                }
            }
            eventType = this.f35271a.next();
        }
        this.f35272b.put((Object) null, new xz1());
    }
}
