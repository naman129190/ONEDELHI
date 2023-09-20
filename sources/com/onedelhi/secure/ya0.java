package com.onedelhi.secure;

import android.util.Base64;
import android.util.JsonReader;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.FirebaseMessaging;
import com.onedelhi.secure.ak4;
import com.onedelhi.secure.es2;
import com.onedelhi.secure.pa0;
import com.onedelhi.secure.vh3;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

public class ya0 {

    /* renamed from: a */
    public static final od0 f37852a = new kv1().mo39521k(C5240ff.f28280a).mo39522l(true).mo39520j();

    /* renamed from: com.onedelhi.secure.ya0$a */
    public interface C7320a<T> {
        /* renamed from: a */
        T mo43829a(@mr2 JsonReader jsonReader) throws IOException;
    }

    @mr2
    /* renamed from: A */
    public static pa0.C6383f.C6391d.C6392a.C6394b.C6402e m71435A(@mr2 JsonReader jsonReader) throws IOException {
        pa0.C6383f.C6391d.C6392a.C6394b.C6402e.C6403a a = pa0.C6383f.C6391d.C6392a.C6394b.C6402e.m60740a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3373707:
                    if (nextName.equals("name")) {
                        c = 1;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo40578b(m71451n(jsonReader, ta0.f35518a));
                    break;
                case 1:
                    a.mo40580d(jsonReader.nextString());
                    break;
                case 2:
                    a.mo40579c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo40577a();
    }

    @mr2
    /* renamed from: B */
    public static pa0.C6379e.C6381b m71436B(@mr2 JsonReader jsonReader) throws IOException {
        pa0.C6379e.C6381b.C6382a a = pa0.C6379e.C6381b.m60597a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("filename")) {
                a.mo31662c(jsonReader.nextString());
            } else if (!nextName.equals("contents")) {
                jsonReader.skipValue();
            } else {
                a.mo31661b(Base64.decode(jsonReader.nextString(), 2));
            }
        }
        jsonReader.endObject();
        return a.mo31660a();
    }

    @mr2
    /* renamed from: C */
    public static pa0.C6379e m71437C(@mr2 JsonReader jsonReader) throws IOException {
        pa0.C6379e.C6380a a = pa0.C6379e.m60590a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("files")) {
                a.mo30923b(m71451n(jsonReader, va0.f36469a));
            } else if (!nextName.equals("orgId")) {
                jsonReader.skipValue();
            } else {
                a.mo30924c(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a.mo30922a();
    }

    @mr2
    /* renamed from: D */
    public static pa0.C6383f.C6411e m71438D(@mr2 JsonReader jsonReader) throws IOException {
        pa0.C6383f.C6411e.C6412a a = pa0.C6383f.C6411e.m60784a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c = 0;
                        break;
                    }
                    break;
                case -293026577:
                    if (nextName.equals("jailbroken")) {
                        c = 1;
                        break;
                    }
                    break;
                case 351608024:
                    if (nextName.equals("version")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo42477b(jsonReader.nextString());
                    break;
                case 1:
                    a.mo42478c(jsonReader.nextBoolean());
                    break;
                case 2:
                    a.mo42480e(jsonReader.nextString());
                    break;
                case 3:
                    a.mo42479d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo42476a();
    }

    @mr2
    /* renamed from: E */
    public static pa0 m71439E(@mr2 JsonReader jsonReader) throws IOException {
        pa0.C6376c b = pa0.m60529b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -2118372775:
                    if (nextName.equals("ndkPayload")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1962630338:
                    if (nextName.equals(vh3.C7051b.f36564T)) {
                        c = 1;
                        break;
                    }
                    break;
                case -1375141843:
                    if (nextName.equals("appExitInfo")) {
                        c = 2;
                        break;
                    }
                    break;
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c = 3;
                        break;
                    }
                    break;
                case 344431858:
                    if (nextName.equals("gmpAppId")) {
                        c = 4;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c = 5;
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c = 6;
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c = 7;
                        break;
                    }
                    break;
                case 1984987798:
                    if (nextName.equals(jw3.f30975b)) {
                        c = 8;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    b.mo42452g(m71437C(jsonReader));
                    break;
                case 1:
                    b.mo42454i(jsonReader.nextString());
                    break;
                case 2:
                    b.mo42447b(m71450m(jsonReader));
                    break;
                case 3:
                    b.mo42448c(jsonReader.nextString());
                    break;
                case 4:
                    b.mo42450e(jsonReader.nextString());
                    break;
                case 5:
                    b.mo42451f(jsonReader.nextString());
                    break;
                case 6:
                    b.mo42453h(jsonReader.nextInt());
                    break;
                case 7:
                    b.mo42449d(jsonReader.nextString());
                    break;
                case 8:
                    b.mo42455j(m71440F(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return b.mo42446a();
    }

    @mr2
    /* renamed from: F */
    public static pa0.C6383f m71440F(@mr2 JsonReader jsonReader) throws IOException {
        pa0.C6383f.C6388b a = pa0.C6383f.m60603a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -2128794476:
                    if (nextName.equals("startedAt")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1618432855:
                    if (nextName.equals("identifier")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1606742899:
                    if (nextName.equals("endedAt")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1335157162:
                    if (nextName.equals(C2889mv.f16368m)) {
                        c = 3;
                        break;
                    }
                    break;
                case -1291329255:
                    if (nextName.equals("events")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3556:
                    if (nextName.equals("os")) {
                        c = 5;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals(FirebaseMessaging.f25020d)) {
                        c = 6;
                        break;
                    }
                    break;
                case 3599307:
                    if (nextName.equals("user")) {
                        c = 7;
                        break;
                    }
                    break;
                case 286956243:
                    if (nextName.equals("generator")) {
                        c = 8;
                        break;
                    }
                    break;
                case 1025385094:
                    if (nextName.equals("crashed")) {
                        c = 9;
                        break;
                    }
                    break;
                case 2047016109:
                    if (nextName.equals("generatorType")) {
                        c = 10;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo32361l(jsonReader.nextLong());
                    break;
                case 1:
                    a.mo42466j(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case 2:
                    a.mo32355e(Long.valueOf(jsonReader.nextLong()));
                    break;
                case 3:
                    a.mo32354d(m71454q(jsonReader));
                    break;
                case 4:
                    a.mo32356f(m71451n(jsonReader, ra0.f34546a));
                    break;
                case 5:
                    a.mo32360k(m71438D(jsonReader));
                    break;
                case 6:
                    a.mo32352b(m71449l(jsonReader));
                    break;
                case 7:
                    a.mo32362m(m71441G(jsonReader));
                    break;
                case 8:
                    a.mo32357g(jsonReader.nextString());
                    break;
                case 9:
                    a.mo32353c(jsonReader.nextBoolean());
                    break;
                case 10:
                    a.mo32358h(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo32351a();
    }

    @mr2
    /* renamed from: G */
    public static pa0.C6383f.C6413f m71441G(@mr2 JsonReader jsonReader) throws IOException {
        pa0.C6383f.C6413f.C6414a a = pa0.C6383f.C6413f.m60794a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("identifier")) {
                jsonReader.skipValue();
            } else {
                a.mo42483b(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a.mo42482a();
    }

    @mr2
    /* renamed from: l */
    public static pa0.C6383f.C6384a m71449l(@mr2 JsonReader jsonReader) throws IOException {
        pa0.C6383f.C6384a.C6385a a = pa0.C6383f.C6384a.m60620a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1618432855:
                    if (nextName.equals("identifier")) {
                        c = 0;
                        break;
                    }
                    break;
                case -519438642:
                    if (nextName.equals("developmentPlatform")) {
                        c = 1;
                        break;
                    }
                    break;
                case 213652010:
                    if (nextName.equals("developmentPlatformVersion")) {
                        c = 2;
                        break;
                    }
                    break;
                case 351608024:
                    if (nextName.equals("version")) {
                        c = 3;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo34406e(jsonReader.nextString());
                    break;
                case 1:
                    a.mo34403b(jsonReader.nextString());
                    break;
                case 2:
                    a.mo34404c(jsonReader.nextString());
                    break;
                case 3:
                    a.mo34409h(jsonReader.nextString());
                    break;
                case 4:
                    a.mo34407f(jsonReader.nextString());
                    break;
                case 5:
                    a.mo34405d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo34402a();
    }

    @mr2
    /* renamed from: m */
    public static pa0.C6371a m71450m(@mr2 JsonReader jsonReader) throws IOException {
        pa0.C6371a.C6374b a = pa0.C6371a.m60546a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1516200806:
                    if (nextName.equals("buildIdMappingForArch")) {
                        c = 0;
                        break;
                    }
                    break;
                case 110987:
                    if (nextName.equals("pid")) {
                        c = 1;
                        break;
                    }
                    break;
                case 111312:
                    if (nextName.equals("pss")) {
                        c = 2;
                        break;
                    }
                    break;
                case 113234:
                    if (nextName.equals("rss")) {
                        c = 3;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c = 4;
                        break;
                    }
                    break;
                case 202325402:
                    if (nextName.equals("processName")) {
                        c = 5;
                        break;
                    }
                    break;
                case 722137681:
                    if (nextName.equals("reasonCode")) {
                        c = 6;
                        break;
                    }
                    break;
                case 723857505:
                    if (nextName.equals("traceFile")) {
                        c = 7;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = 8;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo42437b(m71451n(jsonReader, sa0.f34942a));
                    break;
                case 1:
                    a.mo42439d(jsonReader.nextInt());
                    break;
                case 2:
                    a.mo42441f(jsonReader.nextLong());
                    break;
                case 3:
                    a.mo42443h(jsonReader.nextLong());
                    break;
                case 4:
                    a.mo42444i(jsonReader.nextLong());
                    break;
                case 5:
                    a.mo42440e(jsonReader.nextString());
                    break;
                case 6:
                    a.mo42442g(jsonReader.nextInt());
                    break;
                case 7:
                    a.mo42445j(jsonReader.nextString());
                    break;
                case 8:
                    a.mo42438c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo42436a();
    }

    @mr2
    /* renamed from: n */
    public static <T> lp1<T> m71451n(@mr2 JsonReader jsonReader, @mr2 C7320a<T> aVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.mo43829a(jsonReader));
        }
        jsonReader.endArray();
        return lp1.m56329b(arrayList);
    }

    @mr2
    /* renamed from: o */
    public static pa0.C6371a.C6372a m71452o(@mr2 JsonReader jsonReader) throws IOException {
        pa0.C6371a.C6372a.C6373a a = pa0.C6371a.C6372a.m60556a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -609862170:
                    if (nextName.equals("libraryName")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3002454:
                    if (nextName.equals("arch")) {
                        c = 1;
                        break;
                    }
                    break;
                case 230943785:
                    if (nextName.equals("buildId")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo42435d(jsonReader.nextString());
                    break;
                case 1:
                    a.mo42433b(jsonReader.nextString());
                    break;
                case 2:
                    a.mo42434c(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo42432a();
    }

    @mr2
    /* renamed from: p */
    public static pa0.C6377d m71453p(@mr2 JsonReader jsonReader) throws IOException {
        pa0.C6377d.C6378a a = pa0.C6377d.m60584a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("key")) {
                a.mo42459b(jsonReader.nextString());
            } else if (!nextName.equals("value")) {
                jsonReader.skipValue();
            } else {
                a.mo42460c(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a.mo42458a();
    }

    @mr2
    /* renamed from: q */
    public static pa0.C6383f.C6389c m71454q(@mr2 JsonReader jsonReader) throws IOException {
        pa0.C6383f.C6389c.C6390a a = pa0.C6383f.C6389c.m60656a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1981332476:
                    if (nextName.equals("simulator")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1969347631:
                    if (nextName.equals(C2889mv.f16371p)) {
                        c = 1;
                        break;
                    }
                    break;
                case 112670:
                    if (nextName.equals("ram")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3002454:
                    if (nextName.equals("arch")) {
                        c = 3;
                        break;
                    }
                    break;
                case 81784169:
                    if (nextName.equals("diskSpace")) {
                        c = 4;
                        break;
                    }
                    break;
                case 94848180:
                    if (nextName.equals("cores")) {
                        c = 5;
                        break;
                    }
                    break;
                case 104069929:
                    if (nextName.equals(C2889mv.f16366k)) {
                        c = 6;
                        break;
                    }
                    break;
                case 109757585:
                    if (nextName.equals(vh3.C7052c.f36570Z)) {
                        c = 7;
                        break;
                    }
                    break;
                case 2078953423:
                    if (nextName.equals("modelClass")) {
                        c = 8;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo35937i(jsonReader.nextBoolean());
                    break;
                case 1:
                    a.mo35933e(jsonReader.nextString());
                    break;
                case 2:
                    a.mo35936h(jsonReader.nextLong());
                    break;
                case 3:
                    a.mo35930b(jsonReader.nextInt());
                    break;
                case 4:
                    a.mo35932d(jsonReader.nextLong());
                    break;
                case 5:
                    a.mo35931c(jsonReader.nextInt());
                    break;
                case 6:
                    a.mo35934f(jsonReader.nextString());
                    break;
                case 7:
                    a.mo35938j(jsonReader.nextInt());
                    break;
                case 8:
                    a.mo35935g(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo35929a();
    }

    @mr2
    /* renamed from: r */
    public static pa0.C6383f.C6391d m71455r(@mr2 JsonReader jsonReader) throws IOException {
        pa0.C6383f.C6391d.C6406b a = pa0.C6383f.C6391d.m60676a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1335157162:
                    if (nextName.equals(C2889mv.f16368m)) {
                        c = 0;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals(FirebaseMessaging.f25020d)) {
                        c = 1;
                        break;
                    }
                    break;
                case 107332:
                    if (nextName.equals("log")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c = 3;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo36713c(m71458u(jsonReader));
                    break;
                case 1:
                    a.mo36712b(m71456s(jsonReader));
                    break;
                case 2:
                    a.mo36714d(m71462y(jsonReader));
                    break;
                case 3:
                    a.mo36716f(jsonReader.nextString());
                    break;
                case 4:
                    a.mo36715e(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo36711a();
    }

    @mr2
    /* renamed from: s */
    public static pa0.C6383f.C6391d.C6392a m71456s(@mr2 JsonReader jsonReader) throws IOException {
        pa0.C6383f.C6391d.C6392a.C6393a a = pa0.C6383f.C6391d.C6392a.m60683a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1332194002:
                    if (nextName.equals(es2.C2101r.f11625h)) {
                        c = 0;
                        break;
                    }
                    break;
                case -1090974952:
                    if (nextName.equals("execution")) {
                        c = 1;
                        break;
                    }
                    break;
                case -80231855:
                    if (nextName.equals("internalKeys")) {
                        c = 2;
                        break;
                    }
                    break;
                case 555169704:
                    if (nextName.equals("customAttributes")) {
                        c = 3;
                        break;
                    }
                    break;
                case 928737948:
                    if (nextName.equals("uiOrientation")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo37296b(Boolean.valueOf(jsonReader.nextBoolean()));
                    break;
                case 1:
                    a.mo37298d(m71459v(jsonReader));
                    break;
                case 2:
                    a.mo37299e(m71451n(jsonReader, xa0.f37376a));
                    break;
                case 3:
                    a.mo37297c(m71451n(jsonReader, xa0.f37376a));
                    break;
                case 4:
                    a.mo37300f(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo37295a();
    }

    @mr2
    /* renamed from: t */
    public static pa0.C6383f.C6391d.C6392a.C6394b.C6395a m71457t(@mr2 JsonReader jsonReader) throws IOException {
        pa0.C6383f.C6391d.C6392a.C6394b.C6395a.C6396a a = pa0.C6383f.C6391d.C6392a.C6394b.C6395a.m60702a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case 3373707:
                    if (nextName.equals("name")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3530753:
                    if (nextName.equals("size")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3601339:
                    if (nextName.equals("uuid")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1153765347:
                    if (nextName.equals("baseAddress")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo38630c(jsonReader.nextString());
                    break;
                case 1:
                    a.mo38631d(jsonReader.nextLong());
                    break;
                case 2:
                    a.mo42468f(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case 3:
                    a.mo38629b(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo38628a();
    }

    @mr2
    /* renamed from: u */
    public static pa0.C6383f.C6391d.C6407c m71458u(@mr2 JsonReader jsonReader) throws IOException {
        pa0.C6383f.C6391d.C6407c.C6408a a = pa0.C6383f.C6391d.C6407c.m60766a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1708606089:
                    if (nextName.equals("batteryLevel")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1455558134:
                    if (nextName.equals("batteryVelocity")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1439500848:
                    if (nextName.equals("orientation")) {
                        c = 2;
                        break;
                    }
                    break;
                case 279795450:
                    if (nextName.equals("diskUsed")) {
                        c = 3;
                        break;
                    }
                    break;
                case 976541947:
                    if (nextName.equals("ramUsed")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1516795582:
                    if (nextName.equals("proximityOn")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo41770b(Double.valueOf(jsonReader.nextDouble()));
                    break;
                case 1:
                    a.mo41771c(jsonReader.nextInt());
                    break;
                case 2:
                    a.mo41773e(jsonReader.nextInt());
                    break;
                case 3:
                    a.mo41772d(jsonReader.nextLong());
                    break;
                case 4:
                    a.mo41775g(jsonReader.nextLong());
                    break;
                case 5:
                    a.mo41774f(jsonReader.nextBoolean());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo41769a();
    }

    @mr2
    /* renamed from: v */
    public static pa0.C6383f.C6391d.C6392a.C6394b m71459v(@mr2 JsonReader jsonReader) throws IOException {
        pa0.C6383f.C6391d.C6392a.C6394b.C6397b a = pa0.C6383f.C6391d.C6392a.C6394b.m60696a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1375141843:
                    if (nextName.equals("appExitInfo")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1337936983:
                    if (nextName.equals("threads")) {
                        c = 1;
                        break;
                    }
                    break;
                case -902467928:
                    if (nextName.equals("signal")) {
                        c = 2;
                        break;
                    }
                    break;
                case 937615455:
                    if (nextName.equals("binaries")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1481625679:
                    if (nextName.equals("exception")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo38073b(m71450m(jsonReader));
                    break;
                case 1:
                    a.mo38077f(m71451n(jsonReader, ua0.f36017a));
                    break;
                case 2:
                    a.mo38076e(m71463z(jsonReader));
                    break;
                case 3:
                    a.mo38074c(m71451n(jsonReader, wa0.f36941a));
                    break;
                case 4:
                    a.mo38075d(m71460w(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo38072a();
    }

    @mr2
    /* renamed from: w */
    public static pa0.C6383f.C6391d.C6392a.C6394b.C6398c m71460w(@mr2 JsonReader jsonReader) throws IOException {
        pa0.C6383f.C6391d.C6392a.C6394b.C6398c.C6399a a = pa0.C6383f.C6391d.C6392a.C6394b.C6398c.m60720a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c = 0;
                        break;
                    }
                    break;
                case -934964668:
                    if (nextName.equals("reason")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c = 2;
                        break;
                    }
                    break;
                case 91997906:
                    if (nextName.equals("causedBy")) {
                        c = 3;
                        break;
                    }
                    break;
                case 581754413:
                    if (nextName.equals("overflowCount")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo39252c(m71451n(jsonReader, ta0.f35518a));
                    break;
                case 1:
                    a.mo39254e(jsonReader.nextString());
                    break;
                case 2:
                    a.mo39255f(jsonReader.nextString());
                    break;
                case 3:
                    a.mo39251b(m71460w(jsonReader));
                    break;
                case 4:
                    a.mo39253d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo39250a();
    }

    @mr2
    /* renamed from: x */
    public static pa0.C6383f.C6391d.C6392a.C6394b.C6402e.C6404b m71461x(@mr2 JsonReader jsonReader) throws IOException {
        pa0.C6383f.C6391d.C6392a.C6394b.C6402e.C6404b.C6405a a = pa0.C6383f.C6391d.C6392a.C6394b.C6402e.C6404b.m60748a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1019779949:
                    if (nextName.equals(ak4.C1710c.f9217v)) {
                        c = 0;
                        break;
                    }
                    break;
                case -887523944:
                    if (nextName.equals("symbol")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3571:
                    if (nextName.equals("pc")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3143036:
                    if (nextName.equals("file")) {
                        c = 3;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo41049d(jsonReader.nextLong());
                    break;
                case 1:
                    a.mo41051f(jsonReader.nextString());
                    break;
                case 2:
                    a.mo41050e(jsonReader.nextLong());
                    break;
                case 3:
                    a.mo41047b(jsonReader.nextString());
                    break;
                case 4:
                    a.mo41048c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo41046a();
    }

    @mr2
    /* renamed from: y */
    public static pa0.C6383f.C6391d.C6409d m71462y(@mr2 JsonReader jsonReader) throws IOException {
        pa0.C6383f.C6391d.C6409d.C6410a a = pa0.C6383f.C6391d.C6409d.m60780a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals(FirebaseAnalytics.C4305d.f24947P)) {
                jsonReader.skipValue();
            } else {
                a.mo42471b(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a.mo42470a();
    }

    @mr2
    /* renamed from: z */
    public static pa0.C6383f.C6391d.C6392a.C6394b.C6400d m71463z(@mr2 JsonReader jsonReader) throws IOException {
        pa0.C6383f.C6391d.C6392a.C6394b.C6400d.C6401a a = pa0.C6383f.C6391d.C6392a.C6394b.C6400d.m60732a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1147692044:
                    if (nextName.equals("address")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3059181:
                    if (nextName.equals("code")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3373707:
                    if (nextName.equals("name")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo39841b(jsonReader.nextLong());
                    break;
                case 1:
                    a.mo39842c(jsonReader.nextString());
                    break;
                case 2:
                    a.mo39843d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo39840a();
    }

    @mr2
    /* renamed from: H */
    public pa0 mo47658H(@mr2 String str) throws IOException {
        JsonReader jsonReader;
        try {
            jsonReader = new JsonReader(new StringReader(str));
            pa0 E = m71439E(jsonReader);
            jsonReader.close();
            return E;
        } catch (IllegalStateException e) {
            throw new IOException(e);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    @mr2
    /* renamed from: I */
    public String mo47659I(@mr2 pa0 pa0) {
        return f37852a.mo39527b(pa0);
    }

    @mr2
    /* renamed from: h */
    public pa0.C6371a mo47660h(@mr2 String str) throws IOException {
        JsonReader jsonReader;
        try {
            jsonReader = new JsonReader(new StringReader(str));
            pa0.C6371a m = m71450m(jsonReader);
            jsonReader.close();
            return m;
        } catch (IllegalStateException e) {
            throw new IOException(e);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    @mr2
    /* renamed from: i */
    public String mo47661i(@mr2 pa0.C6371a aVar) {
        return f37852a.mo39527b(aVar);
    }

    @mr2
    /* renamed from: j */
    public pa0.C6383f.C6391d mo47662j(@mr2 String str) throws IOException {
        JsonReader jsonReader;
        try {
            jsonReader = new JsonReader(new StringReader(str));
            pa0.C6383f.C6391d r = m71455r(jsonReader);
            jsonReader.close();
            return r;
        } catch (IllegalStateException e) {
            throw new IOException(e);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    @mr2
    /* renamed from: k */
    public String mo47663k(@mr2 pa0.C6383f.C6391d dVar) {
        return f37852a.mo39527b(dVar);
    }
}
