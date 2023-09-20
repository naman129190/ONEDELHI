package com.onedelhi.secure;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public class pz1 {

    /* renamed from: a */
    public final wz1 f33849a;

    public pz1(th1 th1, int i, Context context) throws XmlPullParserException, IOException {
        this(th1, context.getResources().openRawResource(i), context);
    }

    public pz1(th1 th1, InputStream inputStream, Context context) throws XmlPullParserException, IOException {
        if (inputStream != null) {
            wz1 wz1 = new wz1(th1, context);
            this.f33849a = wz1;
            sz1 sz1 = new sz1(m61772b(inputStream));
            sz1.mo44656f();
            inputStream.close();
            wz1.mo46949Z(sz1.mo44655e(), sz1.mo44654d(), sz1.mo44653c(), sz1.mo44651a(), sz1.mo44652b());
            return;
        }
        throw new IllegalArgumentException("KML InputStream cannot be null");
    }

    /* renamed from: b */
    public static XmlPullParser m61772b(InputStream inputStream) throws XmlPullParserException {
        XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
        newInstance.setNamespaceAware(true);
        XmlPullParser newPullParser = newInstance.newPullParser();
        newPullParser.setInput(inputStream, (String) null);
        return newPullParser;
    }

    /* renamed from: a */
    public void mo42975a() throws IOException, XmlPullParserException {
        this.f33849a.mo46958s();
    }

    /* renamed from: c */
    public Iterable<kz1> mo42976c() {
        return this.f33849a.mo46936J();
    }

    /* renamed from: d */
    public Iterable<oz1> mo42977d() {
        return this.f33849a.mo46933G();
    }

    /* renamed from: e */
    public th1 mo42978e() {
        return this.f33849a.mo46935I();
    }

    /* renamed from: f */
    public Iterable<tz1> mo42979f() {
        return this.f33849a.mo46934H();
    }

    /* renamed from: g */
    public boolean mo42980g() {
        return this.f33849a.mo46939N();
    }

    /* renamed from: h */
    public boolean mo42981h() {
        return this.f33849a.mo46938M();
    }

    /* renamed from: i */
    public void mo42982i() {
        this.f33849a.mo46942Q();
    }

    /* renamed from: j */
    public void mo42983j(th1 th1) {
        this.f33849a.mo46947X(th1);
    }
}
