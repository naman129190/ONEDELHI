package com.onedelhi.secure;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class d35 {

    /* renamed from: a */
    public static final Set<String> f27206a = new HashSet(Arrays.asList(new String[]{"47DEQpj8HBSa+/TImW+5JCeuQeRkm5NMpJWZG3hSuFU=", "9Bwm9kIBsrAcvjMPTDjBzKtSD8OnnsGZPwlTJDMKteA=", "8Rw90Ej3Ttt8RRkrg+WYDS9n7IS03bk5bjP/UXPtaY8=", "Ko8tivDrEjiY90yGasP6ZpBU4jwXvHqVvQI0GS3GNdA="}));

    /* renamed from: com.onedelhi.secure.d35$a */
    public enum C4952a {
        UAT("https://", "mercury-uat.phonepe.com", 3),
        PRODUCTION_T1("https://", "mercury-t1.phonepe.com", 3),
        PRODUCTION("https://", "newmercury.phonepe.com", 3),
        API_UAT("https://", "api-preprod.phonepe.com", 3),
        API_PRODUCTION("https://", "api.phonepe.com", 3);
        

        /* renamed from: b */
        public final String f27213b;

        /* renamed from: c */
        public final String f27214c;

        /* renamed from: d */
        public final String f27215d;

        /* access modifiers changed from: public */
        C4952a(String str, String str2, int i) {
            this.f27215d = str + str2 + "/v" + i + "/";
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            this.f27213b = sb.toString();
            this.f27214c = str2;
        }
    }

    /* renamed from: a */
    public static C4952a m44668a(boolean z) {
        return z ? C4952a.UAT : C4952a.PRODUCTION;
    }
}
