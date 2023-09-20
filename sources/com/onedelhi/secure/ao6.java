package com.onedelhi.secure;

import com.onedelhi.secure.i00;
import java.io.IOException;

public final class ao6 extends IOException {
    public ao6() {
        super(i00.C5649f.f30033b);
    }

    public ao6(String str, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th);
    }

    public ao6(Throwable th) {
        super(i00.C5649f.f30033b, th);
    }
}
