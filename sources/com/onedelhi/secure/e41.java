package com.onedelhi.secure;

import com.google.android.gms.common.internal.Preconditions;

public class e41 extends Exception {
    @Deprecated
    public e41() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e41(@mr2 String str) {
        super(str);
        Preconditions.checkNotEmpty(str, "Detail message must not be empty");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e41(@mr2 String str, @mr2 Throwable th) {
        super(str, th);
        Preconditions.checkNotEmpty(str, "Detail message must not be empty");
    }
}
