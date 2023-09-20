package com.onedelhi.secure;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.onedelhi.secure.r1 */
public class C6633r1 {

    /* renamed from: a */
    public final Context f34475a;

    /* renamed from: a */
    public final b73<C4623b5> f34476a;
    @mj1("this")

    /* renamed from: a */
    public final Map<String, s31> f34477a = new HashMap();

    @hw4(otherwise = 3)
    public C6633r1(Context context, b73<C4623b5> b73) {
        this.f34475a = context;
        this.f34476a = b73;
    }

    @hw4
    /* renamed from: a */
    public s31 mo43779a(String str) {
        return new s31(this.f34475a, this.f34476a, str);
    }

    /* renamed from: b */
    public synchronized s31 mo43780b(String str) {
        if (!this.f34477a.containsKey(str)) {
            this.f34477a.put(str, mo43779a(str));
        }
        return this.f34477a.get(str);
    }
}
