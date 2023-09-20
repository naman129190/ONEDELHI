package com.onedelhi.secure;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import java.util.regex.Pattern;

public final class uf4 {

    /* renamed from: a */
    public static final Pattern f36096a = Pattern.compile(f36099f);
    @hw4

    /* renamed from: d */
    public static final String f36097d = "!";

    /* renamed from: e */
    public static final String f36098e = "/topics/";

    /* renamed from: f */
    public static final String f36099f = "[a-zA-Z0-9-_.~%]{1,900}";

    /* renamed from: a */
    public final String f36100a;

    /* renamed from: b */
    public final String f36101b;

    /* renamed from: c */
    public final String f36102c;

    public uf4(String str, String str2) {
        this.f36100a = m67010d(str2, str);
        this.f36101b = str;
        this.f36102c = str + f36097d + str2;
    }

    @ts2
    /* renamed from: a */
    public static uf4 m67009a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(f36097d, -1);
        if (split.length != 2) {
            return null;
        }
        return new uf4(split[0], split[1]);
    }

    @mr2
    /* renamed from: d */
    public static String m67010d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", new Object[]{str2}));
            str = str.substring(8);
        }
        if (str != null && f36096a.matcher(str).matches()) {
            return str;
        }
        throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", new Object[]{str, f36099f}));
    }

    /* renamed from: f */
    public static uf4 m67011f(@mr2 String str) {
        return new uf4(mx0.f16693i2, str);
    }

    /* renamed from: g */
    public static uf4 m67012g(@mr2 String str) {
        return new uf4("U", str);
    }

    /* renamed from: b */
    public String mo45580b() {
        return this.f36101b;
    }

    /* renamed from: c */
    public String mo45581c() {
        return this.f36100a;
    }

    /* renamed from: e */
    public String mo45582e() {
        return this.f36102c;
    }

    public boolean equals(@ts2 Object obj) {
        if (!(obj instanceof uf4)) {
            return false;
        }
        uf4 uf4 = (uf4) obj;
        return this.f36100a.equals(uf4.f36100a) && this.f36101b.equals(uf4.f36101b);
    }

    public int hashCode() {
        return Objects.hashCode(this.f36101b, this.f36100a);
    }
}
