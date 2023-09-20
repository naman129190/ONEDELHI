package com.onedelhi.secure;

import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

@ii2(mo38103bv = {1, 0, 3}, mo38106k = 3, mo38107mv = {1, 4, 0})
public final /* synthetic */ class y73 extends rm2 {
    public y73(PublicSuffixDatabase publicSuffixDatabase) {
        super(publicSuffixDatabase, PublicSuffixDatabase.class, "publicSuffixListBytes", "getPublicSuffixListBytes()[B", 0);
    }

    @ss2
    public Object get() {
        return PublicSuffixDatabase.m74718b((PublicSuffixDatabase) this.f36657a);
    }

    public void set(@ss2 Object obj) {
        ((PublicSuffixDatabase) this.f36657a).f38861a = (byte[]) obj;
    }
}
