package com.onedelhi.secure;

import com.onedelhi.secure.hl3;
import java.util.Locale;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
public class k31 {

    /* renamed from: a */
    public static final int f14697a = 4;

    /* renamed from: a */
    public static final String f14698a = "\n\u000b\f\r  ";

    /* renamed from: a */
    public static final Pattern f14699a = Pattern.compile("[^,*•\t                　\n\u000b\f\r  ]+(?=[,*•\t                　\n\u000b\f\r  ]|$)", 2);

    /* renamed from: a */
    public static final C2594a[] f14700a = {new C2594a(99, 99, -1, -1), new C2594a(35, 36, -1, -1), new C2594a(71, 72, -1, -1), new C2594a(96, 96, -1, -1), new C2594a(85, 86, -1, -1), new C2594a(90, 96, -1, -1), new C2594a(80, 81, -1, -1), new C2594a(6, 6, -1, -1), new C2594a(20, 20, -1, -1), new C2594a(19, 19, -1, -1), new C2594a(32, 34, -1, -1), new C2594a(96, 96, -1, -1), new C2594a(30, 31, -1, -1), new C2594a(96, 96, -1, -1), new C2594a(96, 96, -1, -1), new C2594a(50, 52, -1, -1), new C2594a(83, 83, -1, -1), new C2594a(60, 62, -1, -1), new C2594a(46, 47, -1, -1), new C2594a(66, 67, 73, -1), new C2594a(40, 42, -1, -1), new C2594a(70, 71, -1, -1), new C2594a(1, 2, -1, -1), new C2594a(20, 21, -1, -1), new C2594a(3, 4, -1, -1), new C2594a(96, 96, -1, -1), new C2594a(48, 49, -1, -1), new C2594a(55, 56, -1, -1), new C2594a(63, 65, -1, -1), new C2594a(96, 96, -1, -1), new C2594a(38, 39, -1, -1), new C2594a(55, 56, -1, -1), new C2594a(27, 28, -1, -1), new C2594a(58, 58, -1, -1), new C2594a(68, 69, -1, -1), new C2594a(3, 4, -1, -1), new C2594a(7, 8, -1, -1), new C2594a(87, 88, 86, -1), new C2594a(88, 89, 96, -1), new C2594a(10, 14, 0, 6), new C2594a(43, 45, -1, -1), new C2594a(73, 74, -1, -1), new C2594a(97, 97, -1, -1), new C2594a(15, 19, -1, -1), new C2594a(6, 6, 0, 9), new C2594a(96, 96, -1, -1), new C2594a(2, 2, -1, -1), new C2594a(29, 29, -1, -1), new C2594a(57, 57, -1, -1), new C2594a(37, 38, -1, -1), new C2594a(75, 79, 87, 88), new C2594a(84, 84, -1, -1), new C2594a(22, 24, 20, -1), new C2594a(6, 9, -1, -1), new C2594a(5, 5, -1, -1), new C2594a(98, 99, -1, -1), new C2594a(53, 54, -1, -1), new C2594a(24, 26, -1, -1), new C2594a(82, 83, -1, -1)};

    /* renamed from: b */
    public static final int f14701b = 14;

    /* renamed from: b */
    public static final String f14702b = "\t                　";

    /* renamed from: b */
    public static final Pattern f14703b = Pattern.compile("(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?)(?:-(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?))*(?=[,\"'\t                　\n\u000b\f\r  ]|$)", 2);

    /* renamed from: c */
    public static final int f14704c = 5;

    /* renamed from: c */
    public static final String f14705c = "\t                　\n\u000b\f\r  ";

    /* renamed from: c */
    public static final Pattern f14706c = Pattern.compile("(?:(ak|alaska)|(al|alabama)|(ar|arkansas)|(as|american[\t                　]+samoa)|(az|arizona)|(ca|california)|(co|colorado)|(ct|connecticut)|(dc|district[\t                　]+of[\t                　]+columbia)|(de|delaware)|(fl|florida)|(fm|federated[\t                　]+states[\t                　]+of[\t                　]+micronesia)|(ga|georgia)|(gu|guam)|(hi|hawaii)|(ia|iowa)|(id|idaho)|(il|illinois)|(in|indiana)|(ks|kansas)|(ky|kentucky)|(la|louisiana)|(ma|massachusetts)|(md|maryland)|(me|maine)|(mh|marshall[\t                　]+islands)|(mi|michigan)|(mn|minnesota)|(mo|missouri)|(mp|northern[\t                　]+mariana[\t                　]+islands)|(ms|mississippi)|(mt|montana)|(nc|north[\t                　]+carolina)|(nd|north[\t                　]+dakota)|(ne|nebraska)|(nh|new[\t                　]+hampshire)|(nj|new[\t                　]+jersey)|(nm|new[\t                　]+mexico)|(nv|nevada)|(ny|new[\t                　]+york)|(oh|ohio)|(ok|oklahoma)|(or|oregon)|(pa|pennsylvania)|(pr|puerto[\t                　]+rico)|(pw|palau)|(ri|rhode[\t                　]+island)|(sc|south[\t                　]+carolina)|(sd|south[\t                　]+dakota)|(tn|tennessee)|(tx|texas)|(ut|utah)|(va|virginia)|(vi|virgin[\t                　]+islands)|(vt|vermont)|(wa|washington)|(wi|wisconsin)|(wv|west[\t                　]+virginia)|(wy|wyoming))(?=[,*•\t                　\n\u000b\f\r  ]|$)", 2);

    /* renamed from: d */
    public static final int f14707d = 25;

    /* renamed from: d */
    public static final String f14708d = ",*•\t                　\n\u000b\f\r  ";

    /* renamed from: d */
    public static final Pattern f14709d = Pattern.compile("(?:alley|annex|arcade|ave[.]?|avenue|alameda|bayou|beach|bend|bluffs?|bottom|boulevard|branch|bridge|brooks?|burgs?|bypass|broadway|camino|camp|canyon|cape|causeway|centers?|circles?|cliffs?|club|common|corners?|course|courts?|coves?|creek|crescent|crest|crossing|crossroad|curve|circulo|dale|dam|divide|drives?|estates?|expressway|extensions?|falls?|ferry|fields?|flats?|fords?|forest|forges?|forks?|fort|freeway|gardens?|gateway|glens?|greens?|groves?|harbors?|haven|heights|highway|hills?|hollow|inlet|islands?|isle|junctions?|keys?|knolls?|lakes?|land|landing|lane|lights?|loaf|locks?|lodge|loop|mall|manors?|meadows?|mews|mills?|mission|motorway|mount|mountains?|neck|orchard|oval|overpass|parks?|parkways?|pass|passage|path|pike|pines?|plains?|plaza|points?|ports?|prairie|privada|radial|ramp|ranch|rapids?|rd[.]?|rest|ridges?|river|roads?|route|row|rue|run|shoals?|shores?|skyway|springs?|spurs?|squares?|station|stravenue|stream|st[.]?|streets?|summit|speedway|terrace|throughway|trace|track|trafficway|trail|tunnel|turnpike|underpass|unions?|valleys?|viaduct|views?|villages?|ville|vista|walks?|wall|ways?|wells?|xing|xrd)(?=[,*•\t                　\n\u000b\f\r  ]|$)", 2);

    /* renamed from: e */
    public static final int f14710e = 5;

    /* renamed from: e */
    public static final String f14711e = "(?=[,*•\t                　\n\u000b\f\r  ]|$)";

    /* renamed from: e */
    public static final Pattern f14712e = Pattern.compile("([0-9]+)(st|nd|rd|th)", 2);

    /* renamed from: f */
    public static final String f14713f = ",\"'\t                　\n\u000b\f\r  ";

    /* renamed from: f */
    public static final Pattern f14714f = Pattern.compile("(?:[0-9]{5}(?:-[0-9]{4})?)(?=[,*•\t                　\n\u000b\f\r  ]|$)", 2);

    /* renamed from: g */
    public static final String f14715g = "(?=[,\"'\t                　\n\u000b\f\r  ]|$)";

    /* renamed from: h */
    public static final String f14716h = ":,\"'\t                　\n\u000b\f\r  ";

    /* renamed from: i */
    public static final String f14717i = "(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?)";

    /* renamed from: com.onedelhi.secure.k31$a */
    public static class C2594a {

        /* renamed from: a */
        public int f14718a;

        /* renamed from: b */
        public int f14719b;

        /* renamed from: c */
        public int f14720c;

        /* renamed from: d */
        public int f14721d;

        public C2594a(int i, int i2, int i3, int i4) {
            this.f14718a = i;
            this.f14719b = i2;
            this.f14720c = i3;
            this.f14721d = i4;
        }

        /* renamed from: a */
        public boolean mo18879a(String str) {
            int parseInt = Integer.parseInt(str.substring(0, 2));
            return (this.f14718a <= parseInt && parseInt <= this.f14719b) || parseInt == this.f14720c || parseInt == this.f14721d;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0026, code lost:
        return -r13;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m19413a(java.lang.String r13, java.util.regex.MatchResult r14) {
        /*
            int r14 = r14.end()
            java.util.regex.Pattern r0 = f14699a
            java.util.regex.Matcher r0 = r0.matcher(r13)
            r1 = -1
            r2 = 0
            r3 = 1
            java.lang.String r4 = ""
            r5 = 1
            r6 = 1
            r7 = 1
            r8 = 0
            r9 = -1
            r10 = -1
        L_0x0015:
            int r11 = r13.length()
            if (r14 >= r11) goto L_0x00d5
            boolean r11 = r0.find(r14)
            if (r11 != 0) goto L_0x0027
            int r13 = r13.length()
        L_0x0025:
            int r13 = -r13
            return r13
        L_0x0027:
            int r11 = r0.end()
            int r12 = r0.start()
            int r11 = r11 - r12
            r12 = 25
            if (r11 <= r12) goto L_0x0039
            int r13 = r0.end()
            goto L_0x0025
        L_0x0039:
            int r11 = r0.start()
            if (r14 >= r11) goto L_0x0051
            int r11 = r14 + 1
            char r14 = r13.charAt(r14)
            java.lang.String r12 = "\n\u000b\f\r  "
            int r14 = r12.indexOf(r14)
            if (r14 == r1) goto L_0x004f
            int r5 = r5 + 1
        L_0x004f:
            r14 = r11
            goto L_0x0039
        L_0x0051:
            r11 = 5
            if (r5 <= r11) goto L_0x0056
            goto L_0x00d5
        L_0x0056:
            int r6 = r6 + r3
            r12 = 14
            if (r6 <= r12) goto L_0x005d
            goto L_0x00d5
        L_0x005d:
            java.util.regex.MatchResult r12 = m19420h(r13, r14)
            if (r12 == 0) goto L_0x006d
            if (r7 == 0) goto L_0x0069
            if (r5 <= r3) goto L_0x0069
            int r13 = -r14
            return r13
        L_0x0069:
            if (r9 != r1) goto L_0x00cb
            r9 = r14
            goto L_0x00cb
        L_0x006d:
            java.lang.String r7 = r0.group(r2)
            boolean r7 = m19416d(r7)
            if (r7 == 0) goto L_0x007a
            r7 = 0
            r8 = 1
            goto L_0x00cb
        L_0x007a:
            if (r6 != r11) goto L_0x0083
            if (r8 != 0) goto L_0x0083
            int r14 = r0.end()
            goto L_0x00d5
        L_0x0083:
            if (r8 == 0) goto L_0x00ca
            r7 = 4
            if (r6 <= r7) goto L_0x00ca
            java.util.regex.MatchResult r14 = m19421i(r13, r14)
            if (r14 == 0) goto L_0x00ca
            java.lang.String r7 = "et"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x00a7
            java.lang.String r4 = r14.group(r2)
            java.lang.String r7 = "al"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x00a7
            int r14 = r14.end()
            goto L_0x00d5
        L_0x00a7:
            java.util.regex.Pattern r4 = f14699a
            java.util.regex.Matcher r4 = r4.matcher(r13)
            int r7 = r14.end()
            boolean r7 = r4.find(r7)
            if (r7 == 0) goto L_0x00c6
            java.lang.String r7 = r4.group(r2)
            boolean r14 = m19419g(r7, r14)
            if (r14 == 0) goto L_0x00ca
            int r13 = r4.end()
            return r13
        L_0x00c6:
            int r10 = r14.end()
        L_0x00ca:
            r7 = 0
        L_0x00cb:
            java.lang.String r4 = r0.group(r2)
            int r14 = r0.end()
            goto L_0x0015
        L_0x00d5:
            if (r10 <= 0) goto L_0x00d8
            return r10
        L_0x00d8:
            if (r9 <= 0) goto L_0x00db
            goto L_0x00dc
        L_0x00db:
            r9 = r14
        L_0x00dc:
            int r13 = -r9
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.k31.m19413a(java.lang.String, java.util.regex.MatchResult):int");
    }

    /* renamed from: b */
    public static boolean m19414b(String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (Character.isDigit(str.charAt(i2))) {
                i++;
            }
        }
        if (i > 5) {
            return false;
        }
        Matcher matcher = f14712e.matcher(str);
        if (!matcher.find()) {
            return true;
        }
        int parseInt = Integer.parseInt(matcher.group(1));
        if (parseInt == 0) {
            return false;
        }
        String lowerCase = matcher.group(2).toLowerCase(Locale.getDefault());
        int i3 = parseInt % 10;
        String str2 = "th";
        if (i3 == 1) {
            if (parseInt % 100 != 11) {
                str2 = C6792st.f35188a;
            }
            return lowerCase.equals(str2);
        } else if (i3 == 2) {
            if (parseInt % 100 != 12) {
                str2 = "nd";
            }
            return lowerCase.equals(str2);
        } else if (i3 != 3) {
            return lowerCase.equals(str2);
        } else {
            if (parseInt % 100 != 13) {
                str2 = "rd";
            }
            return lowerCase.equals(str2);
        }
    }

    /* renamed from: c */
    public static String m19415c(String str) {
        Matcher matcher = f14703b.matcher(str);
        int i = 0;
        while (matcher.find(i)) {
            if (m19414b(matcher.group(0))) {
                int start = matcher.start();
                int a = m19413a(str, matcher);
                if (a > 0) {
                    return str.substring(start, a);
                }
                i = -a;
            } else {
                i = matcher.end();
            }
        }
        return null;
    }

    @hw4
    /* renamed from: d */
    public static boolean m19416d(String str) {
        return f14709d.matcher(str).matches();
    }

    @hw4
    /* renamed from: e */
    public static boolean m19417e(String str) {
        return f14714f.matcher(str).matches();
    }

    @hw4
    /* renamed from: f */
    public static boolean m19418f(String str, String str2) {
        return m19419g(str, m19421i(str2, 0));
    }

    /* renamed from: g */
    public static boolean m19419g(String str, MatchResult matchResult) {
        if (matchResult == null) {
            return false;
        }
        int groupCount = matchResult.groupCount();
        while (true) {
            if (groupCount <= 0) {
                break;
            }
            int i = groupCount - 1;
            if (matchResult.group(groupCount) != null) {
                groupCount = i;
                break;
            }
            groupCount = i;
        }
        return f14714f.matcher(str).matches() && f14700a[groupCount].mo18879a(str);
    }

    @hw4
    /* renamed from: h */
    public static MatchResult m19420h(String str, int i) {
        if (i > 0 && f14716h.indexOf(str.charAt(i - 1)) == -1) {
            return null;
        }
        Matcher region = f14703b.matcher(str).region(i, str.length());
        if (region.lookingAt()) {
            MatchResult matchResult = region.toMatchResult();
            if (m19414b(matchResult.group(0))) {
                return matchResult;
            }
        }
        return null;
    }

    @hw4
    /* renamed from: i */
    public static MatchResult m19421i(String str, int i) {
        if (i > 0 && f14708d.indexOf(str.charAt(i - 1)) == -1) {
            return null;
        }
        Matcher region = f14706c.matcher(str).region(i, str.length());
        if (region.lookingAt()) {
            return region.toMatchResult();
        }
        return null;
    }
}
