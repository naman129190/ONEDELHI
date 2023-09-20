package com.onedelhi.secure;

import com.onedelhi.secure.hl3;
import java.nio.ByteBuffer;
import java.util.UUID;

@hl3({hl3.C2354a.f13188c})
public final class cn4 {
    @mr2
    /* renamed from: a */
    public static UUID m12634a(@mr2 byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        return new UUID(wrap.getLong(), wrap.getLong());
    }

    @mr2
    /* renamed from: b */
    public static byte[] m12635b(@mr2 UUID uuid) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[16]);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        return wrap.array();
    }
}
