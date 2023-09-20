package okhttp3;

import com.onedelhi.secure.C4478ab;
import com.onedelhi.secure.C5880ka;
import com.onedelhi.secure.ak0;
import com.onedelhi.secure.df3;
import com.onedelhi.secure.ey2;
import com.onedelhi.secure.gs1;
import com.onedelhi.secure.ii2;
import com.onedelhi.secure.jt1;
import com.onedelhi.secure.nq4;
import com.onedelhi.secure.nx1;
import com.onedelhi.secure.oi3;
import com.onedelhi.secure.re0;
import com.onedelhi.secure.s00;
import com.onedelhi.secure.ss2;
import com.onedelhi.secure.t54;
import com.onedelhi.secure.u54;
import com.onedelhi.secure.uw1;
import com.onedelhi.secure.vr2;
import com.onedelhi.secure.wg0;
import com.onedelhi.secure.x00;
import com.onedelhi.secure.x44;
import com.onedelhi.secure.xj0;
import com.onedelhi.secure.yi4;
import com.onedelhi.secure.zw1;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.Metadata;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@Metadata(bv = {}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0007\u0018\u0000 '2\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0002('B\u0017\b\u0002\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\"¢\u0006\u0004\b%\u0010&J\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0004\u001a\u00020\u0003J\u0012\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0007J\u000f\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\nJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010J\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010\u0015\u001a\u00020\u0014J\u001b\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0016H\u0002J\u0006\u0010\u0019\u001a\u00020\u0018J\u0013\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002J\b\u0010\u001e\u001a\u00020\nH\u0016J\b\u0010\u001f\u001a\u00020\u0003H\u0016J\u0018\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00120 R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0011\u0010\r\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\r\u0010\f¨\u0006)"}, d2 = {"Lokhttp3/Headers;", "", "Lcom/onedelhi/secure/ey2;", "", "name", "get", "Ljava/util/Date;", "getDate", "Ljava/time/Instant;", "getInstant", "", "-deprecated_size", "()I", "size", "index", "value", "", "names", "", "values", "", "byteCount", "", "iterator", "Lokhttp3/Headers$Builder;", "newBuilder", "", "other", "", "equals", "hashCode", "toString", "", "toMultimap", "", "namesAndValues", "[Ljava/lang/String;", "<init>", "([Ljava/lang/String;)V", "Companion", "Builder", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class Headers implements Iterable<ey2<? extends String, ? extends String>>, nx1 {
    public static final Companion Companion = new Companion((wg0) null);
    private final String[] namesAndValues;

    @ii2(mo38103bv = {1, 0, 3}, mo38104d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0016\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\rJ\u0016\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010J\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0012J\u001d\u0010\u0011\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0012J\u0016\u0010\u0013\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010\u0014\u001a\u00020\u0010J\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0002J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0005J\u0019\u0010\u0017\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0019\u0010\u0017\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\rH\u0002J\u0019\u0010\u0017\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, mo38105d2 = {"Lokhttp3/Headers$Builder;", "", "()V", "namesAndValues", "", "", "getNamesAndValues$okhttp", "()Ljava/util/List;", "add", "line", "name", "value", "Ljava/time/Instant;", "Ljava/util/Date;", "addAll", "headers", "Lokhttp3/Headers;", "addLenient", "addLenient$okhttp", "addUnsafeNonAscii", "build", "get", "removeAll", "set", "okhttp"}, mo38106k = 1, mo38107mv = {1, 4, 0})
    public static final class Builder {
        @vr2
        private final List<String> namesAndValues = new ArrayList(20);

        @vr2
        public final Builder add(@vr2 String str) {
            jt1.m53777p(str, "line");
            int q3 = u54.m66666q3(str, ':', 0, false, 6, (Object) null);
            if (q3 != -1) {
                String substring = str.substring(0, q3);
                jt1.m53776o(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                Objects.requireNonNull(substring, "null cannot be cast to non-null type kotlin.CharSequence");
                String obj = u54.m66544E5(substring).toString();
                String substring2 = str.substring(q3 + 1);
                jt1.m53776o(substring2, "(this as java.lang.String).substring(startIndex)");
                add(obj, substring2);
                return this;
            }
            throw new IllegalArgumentException(("Unexpected header: " + str).toString());
        }

        @vr2
        public final Builder add(@vr2 String str, @vr2 String str2) {
            jt1.m53777p(str, "name");
            jt1.m53777p(str2, "value");
            Companion companion = Headers.Companion;
            companion.checkName(str);
            companion.checkValue(str2, str);
            addLenient$okhttp(str, str2);
            return this;
        }

        @IgnoreJRERequirement
        @vr2
        public final Builder add(@vr2 String str, @vr2 Instant instant) {
            jt1.m53777p(str, "name");
            jt1.m53777p(instant, "value");
            add(str, new Date(instant.toEpochMilli()));
            return this;
        }

        @vr2
        public final Builder add(@vr2 String str, @vr2 Date date) {
            jt1.m53777p(str, "name");
            jt1.m53777p(date, "value");
            add(str, re0.m63548b(date));
            return this;
        }

        @vr2
        public final Builder addAll(@vr2 Headers headers) {
            jt1.m53777p(headers, "headers");
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                addLenient$okhttp(headers.name(i), headers.value(i));
            }
            return this;
        }

        @vr2
        public final Builder addLenient$okhttp(@vr2 String str) {
            jt1.m53777p(str, "line");
            int q3 = u54.m66666q3(str, ':', 1, false, 4, (Object) null);
            if (q3 != -1) {
                String substring = str.substring(0, q3);
                jt1.m53776o(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String substring2 = str.substring(q3 + 1);
                jt1.m53776o(substring2, "(this as java.lang.String).substring(startIndex)");
                addLenient$okhttp(substring, substring2);
            } else {
                if (str.charAt(0) == ':') {
                    str = str.substring(1);
                    jt1.m53776o(str, "(this as java.lang.String).substring(startIndex)");
                }
                addLenient$okhttp("", str);
            }
            return this;
        }

        @vr2
        public final Builder addLenient$okhttp(@vr2 String str, @vr2 String str2) {
            jt1.m53777p(str, "name");
            jt1.m53777p(str2, "value");
            this.namesAndValues.add(str);
            this.namesAndValues.add(u54.m66544E5(str2).toString());
            return this;
        }

        @vr2
        public final Builder addUnsafeNonAscii(@vr2 String str, @vr2 String str2) {
            jt1.m53777p(str, "name");
            jt1.m53777p(str2, "value");
            Headers.Companion.checkName(str);
            addLenient$okhttp(str, str2);
            return this;
        }

        @vr2
        public final Headers build() {
            Object[] array = this.namesAndValues.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            return new Headers((String[]) array, (wg0) null);
        }

        @ss2
        public final String get(@vr2 String str) {
            jt1.m53777p(str, "name");
            gs1 e1 = df3.m45173e1(df3.m45156W(this.namesAndValues.size() - 2, 0), 2);
            int j = e1.mo36871j();
            int l = e1.mo36872l();
            int n = e1.mo36873n();
            if (n >= 0) {
                if (j > l) {
                    return null;
                }
            } else if (j < l) {
                return null;
            }
            while (!t54.m65410K1(str, this.namesAndValues.get(j), true)) {
                if (j == l) {
                    return null;
                }
                j += n;
            }
            return this.namesAndValues.get(j + 1);
        }

        @vr2
        public final List<String> getNamesAndValues$okhttp() {
            return this.namesAndValues;
        }

        @vr2
        public final Builder removeAll(@vr2 String str) {
            jt1.m53777p(str, "name");
            int i = 0;
            while (i < this.namesAndValues.size()) {
                if (t54.m65410K1(str, this.namesAndValues.get(i), true)) {
                    this.namesAndValues.remove(i);
                    this.namesAndValues.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        @vr2
        public final Builder set(@vr2 String str, @vr2 String str2) {
            jt1.m53777p(str, "name");
            jt1.m53777p(str2, "value");
            Companion companion = Headers.Companion;
            companion.checkName(str);
            companion.checkValue(str2, str);
            removeAll(str);
            addLenient$okhttp(str, str2);
            return this;
        }

        @IgnoreJRERequirement
        @vr2
        public final Builder set(@vr2 String str, @vr2 Instant instant) {
            jt1.m53777p(str, "name");
            jt1.m53777p(instant, "value");
            return set(str, new Date(instant.toEpochMilli()));
        }

        @vr2
        public final Builder set(@vr2 String str, @vr2 Date date) {
            jt1.m53777p(str, "name");
            jt1.m53777p(date, "value");
            set(str, re0.m63548b(date));
            return this;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0006\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0003H\u0002J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002J#\u0010\u000f\u001a\u00020\f2\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H\u0007¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\r\u001a\u00020\f2\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H\u0007¢\u0006\u0004\b\u0010\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\f*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0011H\u0007¢\u0006\u0004\b\r\u0010\u0012J#\u0010\r\u001a\u00020\f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0011H\u0007¢\u0006\u0004\b\u0010\u0010\u0012¨\u0006\u0017"}, d2 = {"Lokhttp3/Headers$Companion;", "", "", "", "namesAndValues", "name", "get", "([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lcom/onedelhi/secure/un4;", "checkName", "value", "checkValue", "Lokhttp3/Headers;", "of", "([Ljava/lang/String;)Lokhttp3/Headers;", "headersOf", "-deprecated_of", "", "(Ljava/util/Map;)Lokhttp3/Headers;", "toHeaders", "headers", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(wg0 wg0) {
            this();
        }

        /* access modifiers changed from: private */
        public final void checkName(String str) {
            if (str.length() > 0) {
                int length = str.length();
                int i = 0;
                while (i < length) {
                    char charAt = str.charAt(i);
                    if ('!' <= charAt && '~' >= charAt) {
                        i++;
                    } else {
                        throw new IllegalArgumentException(nq4.m58722v("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str).toString());
                    }
                }
                return;
            }
            throw new IllegalArgumentException("name is empty".toString());
        }

        /* access modifiers changed from: private */
        public final void checkValue(String str, String str2) {
            String str3;
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (!(charAt == 9 || (' ' <= charAt && '~' >= charAt))) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(nq4.m58722v("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i), str2));
                    if (nq4.m58674L(str2)) {
                        str3 = "";
                    } else {
                        str3 = ": " + str;
                    }
                    sb.append(str3);
                    throw new IllegalArgumentException(sb.toString().toString());
                }
            }
        }

        /* access modifiers changed from: private */
        public final String get(String[] strArr, String str) {
            gs1 e1 = df3.m45173e1(df3.m45156W(strArr.length - 2, 0), 2);
            int j = e1.mo36871j();
            int l = e1.mo36872l();
            int n = e1.mo36873n();
            if (n >= 0) {
                if (j > l) {
                    return null;
                }
            } else if (j < l) {
                return null;
            }
            while (!t54.m65410K1(str, strArr[j], true)) {
                if (j == l) {
                    return null;
                }
                j += n;
            }
            return strArr[j + 1];
        }

        @uw1(name = "-deprecated_of")
        @vr2
        @xj0(level = ak0.ERROR, message = "function moved to extension", replaceWith = @oi3(expression = "headers.toHeaders()", imports = {}))
        /* renamed from: -deprecated_of  reason: not valid java name */
        public final Headers m74796deprecated_of(@vr2 Map<String, String> map) {
            jt1.m53777p(map, "headers");
            return mo49238of(map);
        }

        @uw1(name = "-deprecated_of")
        @vr2
        @xj0(level = ak0.ERROR, message = "function name changed", replaceWith = @oi3(expression = "headersOf(*namesAndValues)", imports = {}))
        /* renamed from: -deprecated_of  reason: not valid java name */
        public final Headers m74797deprecated_of(@vr2 String... strArr) {
            jt1.m53777p(strArr, "namesAndValues");
            return mo49239of((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        @zw1
        @uw1(name = "of")
        @vr2
        /* renamed from: of */
        public final Headers mo49238of(@vr2 Map<String, String> map) {
            jt1.m53777p(map, "$this$toHeaders");
            String[] strArr = new String[(map.size() * 2)];
            int i = 0;
            for (Map.Entry next : map.entrySet()) {
                String str = (String) next.getKey();
                String str2 = (String) next.getValue();
                Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
                String obj = u54.m66544E5(str).toString();
                Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.CharSequence");
                String obj2 = u54.m66544E5(str2).toString();
                checkName(obj);
                checkValue(obj2, obj);
                strArr[i] = obj;
                strArr[i + 1] = obj2;
                i += 2;
            }
            return new Headers(strArr, (wg0) null);
        }

        @zw1
        @uw1(name = "of")
        @vr2
        /* renamed from: of */
        public final Headers mo49239of(@vr2 String... strArr) {
            jt1.m53777p(strArr, "namesAndValues");
            if (strArr.length % 2 == 0) {
                Object clone = strArr.clone();
                Objects.requireNonNull(clone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                String[] strArr2 = (String[]) clone;
                int length = strArr2.length;
                int i = 0;
                while (i < length) {
                    if (strArr2[i] != null) {
                        String str = strArr2[i];
                        Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
                        strArr2[i] = u54.m66544E5(str).toString();
                        i++;
                    } else {
                        throw new IllegalArgumentException("Headers cannot be null".toString());
                    }
                }
                gs1 e1 = df3.m45173e1(C4478ab.m36578Oe(strArr2), 2);
                int j = e1.mo36871j();
                int l = e1.mo36872l();
                int n = e1.mo36873n();
                if (n < 0 ? j >= l : j <= l) {
                    while (true) {
                        String str2 = strArr2[j];
                        String str3 = strArr2[j + 1];
                        checkName(str2);
                        checkValue(str3, str2);
                        if (j == l) {
                            break;
                        }
                        j += n;
                    }
                }
                return new Headers(strArr2, (wg0) null);
            }
            throw new IllegalArgumentException("Expected alternating header names and values".toString());
        }
    }

    private Headers(String[] strArr) {
        this.namesAndValues = strArr;
    }

    public /* synthetic */ Headers(String[] strArr, wg0 wg0) {
        this(strArr);
    }

    @zw1
    @uw1(name = "of")
    @vr2
    /* renamed from: of */
    public static final Headers m74713of(@vr2 Map<String, String> map) {
        return Companion.mo49238of(map);
    }

    @zw1
    @uw1(name = "of")
    @vr2
    /* renamed from: of */
    public static final Headers m74714of(@vr2 String... strArr) {
        return Companion.mo49239of(strArr);
    }

    @uw1(name = "-deprecated_size")
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "size", imports = {}))
    /* renamed from: -deprecated_size  reason: not valid java name */
    public final int m74795deprecated_size() {
        return size();
    }

    public final long byteCount() {
        String[] strArr = this.namesAndValues;
        long length = (long) (strArr.length * 2);
        int length2 = strArr.length;
        for (int i = 0; i < length2; i++) {
            length += (long) this.namesAndValues[i].length();
        }
        return length;
    }

    public boolean equals(@ss2 Object obj) {
        return (obj instanceof Headers) && Arrays.equals(this.namesAndValues, ((Headers) obj).namesAndValues);
    }

    @ss2
    public final String get(@vr2 String str) {
        jt1.m53777p(str, "name");
        return Companion.get(this.namesAndValues, str);
    }

    @ss2
    public final Date getDate(@vr2 String str) {
        jt1.m53777p(str, "name");
        String str2 = get(str);
        if (str2 != null) {
            return re0.m63547a(str2);
        }
        return null;
    }

    @IgnoreJRERequirement
    @ss2
    public final Instant getInstant(@vr2 String str) {
        jt1.m53777p(str, "name");
        Date date = getDate(str);
        if (date != null) {
            return date.toInstant();
        }
        return null;
    }

    public int hashCode() {
        return Arrays.hashCode(this.namesAndValues);
    }

    @vr2
    public Iterator<ey2<String, String>> iterator() {
        int size = size();
        ey2[] ey2Arr = new ey2[size];
        for (int i = 0; i < size; i++) {
            ey2Arr[i] = yi4.m71797a(name(i), value(i));
        }
        return C5880ka.m54166a(ey2Arr);
    }

    @vr2
    public final String name(int i) {
        return this.namesAndValues[i * 2];
    }

    @vr2
    public final Set<String> names() {
        TreeSet treeSet = new TreeSet(t54.m65420S1(x44.f37329a));
        int size = size();
        for (int i = 0; i < size; i++) {
            treeSet.add(name(i));
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(treeSet);
        jt1.m53776o(unmodifiableSet, "Collections.unmodifiableSet(result)");
        return unmodifiableSet;
    }

    @vr2
    public final Builder newBuilder() {
        Builder builder = new Builder();
        x00.m69814q0(builder.getNamesAndValues$okhttp(), this.namesAndValues);
        return builder;
    }

    @uw1(name = "size")
    public final int size() {
        return this.namesAndValues.length / 2;
    }

    @vr2
    public final Map<String, List<String>> toMultimap() {
        TreeMap treeMap = new TreeMap(t54.m65420S1(x44.f37329a));
        int size = size();
        for (int i = 0; i < size; i++) {
            String name = name(i);
            Locale locale = Locale.US;
            jt1.m53776o(locale, "Locale.US");
            Objects.requireNonNull(name, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = name.toLowerCase(locale);
            jt1.m53776o(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(value(i));
        }
        return treeMap;
    }

    @vr2
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String name = name(i);
            String value = value(i);
            sb.append(name);
            sb.append(": ");
            if (nq4.m58674L(name)) {
                value = "██";
            }
            sb.append(value);
            sb.append("\n");
        }
        String sb2 = sb.toString();
        jt1.m53776o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @vr2
    public final String value(int i) {
        return this.namesAndValues[(i * 2) + 1];
    }

    @vr2
    public final List<String> values(@vr2 String str) {
        jt1.m53777p(str, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if (t54.m65410K1(str, name(i), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(value(i));
            }
        }
        if (arrayList == null) {
            return s00.m64037F();
        }
        List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
        jt1.m53776o(unmodifiableList, "Collections.unmodifiableList(result)");
        return unmodifiableList;
    }
}
