package com.onedelhi.secure;

import android.util.JsonReader;
import android.util.JsonToken;
import com.google.auto.value.AutoValue;
import java.io.IOException;
import java.io.Reader;

@AutoValue
public abstract class f92 {

    /* renamed from: a */
    public static final String f11984a = "LogResponseInternal";

    /* renamed from: a */
    public static f92 m14834a(long j) {
        return new C1910ch(j);
    }

    @mr2
    /* renamed from: b */
    public static f92 m14835b(@mr2 Reader reader) throws IOException {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (!jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    jsonReader.skipValue();
                } else if (jsonReader.peek() == JsonToken.STRING) {
                    return m14834a(Long.parseLong(jsonReader.nextString()));
                } else {
                    f92 a = m14834a(jsonReader.nextLong());
                    jsonReader.close();
                    return a;
                }
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    /* renamed from: c */
    public abstract long mo14141c();
}
