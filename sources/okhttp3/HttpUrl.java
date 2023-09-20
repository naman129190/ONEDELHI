package okhttp3;

import com.google.android.gms.common.internal.ImagesContract;
import com.onedelhi.secure.C6205no;
import com.onedelhi.secure.ak0;
import com.onedelhi.secure.df3;
import com.onedelhi.secure.dm1;
import com.onedelhi.secure.eh3;
import com.onedelhi.secure.gs1;
import com.onedelhi.secure.hv3;
import com.onedelhi.secure.ii2;
import com.onedelhi.secure.jt1;
import com.onedelhi.secure.m51;
import com.onedelhi.secure.nq4;
import com.onedelhi.secure.oi3;
import com.onedelhi.secure.s00;
import com.onedelhi.secure.ss2;
import com.onedelhi.secure.t00;
import com.onedelhi.secure.t54;
import com.onedelhi.secure.tk4;
import com.onedelhi.secure.u54;
import com.onedelhi.secure.uw1;
import com.onedelhi.secure.vl1;
import com.onedelhi.secure.vr2;
import com.onedelhi.secure.wg0;
import com.onedelhi.secure.xj0;
import com.onedelhi.secure.zw1;
import easypay.appinvoke.manager.Constants;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

@ii2(mo38103bv = {1, 0, 3}, mo38104d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 J2\u00020\u0001:\u0002IJBa\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eJ\u000f\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b!J\r\u0010\u0011\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\"J\r\u0010\u0012\u001a\u00020\u0003H\u0007¢\u0006\u0002\b#J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0007¢\u0006\u0002\b$J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b%J\r\u0010\u0016\u001a\u00020\u0003H\u0007¢\u0006\u0002\b&J\u0013\u0010'\u001a\u00020\u00182\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u0002J\u000f\u0010\f\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b)J\b\u0010*\u001a\u00020\bH\u0016J\r\u0010\u0006\u001a\u00020\u0003H\u0007¢\u0006\u0002\b+J\u0006\u0010,\u001a\u00020-J\u0010\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010.\u001a\u00020\u0003J\r\u0010\u0005\u001a\u00020\u0003H\u0007¢\u0006\u0002\b/J\u0013\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0007¢\u0006\u0002\b0J\r\u0010\u001a\u001a\u00020\bH\u0007¢\u0006\u0002\b1J\r\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\b2J\u000f\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b3J\u0010\u00104\u001a\u0004\u0018\u00010\u00032\u0006\u00105\u001a\u00020\u0003J\u000e\u00106\u001a\u00020\u00032\u0006\u00107\u001a\u00020\bJ\u0013\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u001eH\u0007¢\u0006\u0002\b8J\u0010\u00109\u001a\u0004\u0018\u00010\u00032\u0006\u00107\u001a\u00020\bJ\u0016\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\n2\u0006\u00105\u001a\u00020\u0003J\r\u0010 \u001a\u00020\bH\u0007¢\u0006\u0002\b;J\u0006\u0010<\u001a\u00020\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\u00002\u0006\u0010.\u001a\u00020\u0003J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b>J\b\u0010?\u001a\u00020\u0003H\u0016J\r\u0010@\u001a\u00020AH\u0007¢\u0006\u0002\bBJ\r\u0010C\u001a\u00020DH\u0007¢\u0006\u0002\b\rJ\b\u0010E\u001a\u0004\u0018\u00010\u0003J\r\u0010B\u001a\u00020AH\u0007¢\u0006\u0002\bFJ\r\u0010\r\u001a\u00020DH\u0007¢\u0006\u0002\bGJ\r\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\bHR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0012\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\n8G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\u0016\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010R\u0015\u0010\f\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0010R\u0013\u0010\u0006\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0010R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0019R\u0013\u0010\u0005\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0010R\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0014R\u0011\u0010\u001a\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0007\u001a\u00020\b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u001bR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0010R\u0018\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\nX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u001e8G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001fR\u0011\u0010 \u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b \u0010\u001bR\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0010R\u000e\u0010\r\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0010¨\u0006K"}, mo38105d2 = {"Lokhttp3/HttpUrl;", "", "scheme", "", "username", "password", "host", "port", "", "pathSegments", "", "queryNamesAndValues", "fragment", "url", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "encodedFragment", "()Ljava/lang/String;", "encodedPassword", "encodedPath", "encodedPathSegments", "()Ljava/util/List;", "encodedQuery", "encodedUsername", "isHttps", "", "()Z", "pathSize", "()I", "query", "queryParameterNames", "", "()Ljava/util/Set;", "querySize", "-deprecated_encodedFragment", "-deprecated_encodedPassword", "-deprecated_encodedPath", "-deprecated_encodedPathSegments", "-deprecated_encodedQuery", "-deprecated_encodedUsername", "equals", "other", "-deprecated_fragment", "hashCode", "-deprecated_host", "newBuilder", "Lokhttp3/HttpUrl$Builder;", "link", "-deprecated_password", "-deprecated_pathSegments", "-deprecated_pathSize", "-deprecated_port", "-deprecated_query", "queryParameter", "name", "queryParameterName", "index", "-deprecated_queryParameterNames", "queryParameterValue", "queryParameterValues", "-deprecated_querySize", "redact", "resolve", "-deprecated_scheme", "toString", "toUri", "Ljava/net/URI;", "uri", "toUrl", "Ljava/net/URL;", "topPrivateDomain", "-deprecated_uri", "-deprecated_url", "-deprecated_username", "Builder", "Companion", "okhttp"}, mo38106k = 1, mo38107mv = {1, 4, 0})
public final class HttpUrl {
    public static final Companion Companion = new Companion((wg0) null);
    @vr2
    public static final String FORM_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#&!$(),~";
    @vr2
    public static final String FRAGMENT_ENCODE_SET = "";
    @vr2
    public static final String FRAGMENT_ENCODE_SET_URI = " \"#<>\\^`{|}";
    /* access modifiers changed from: private */
    public static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    @vr2
    public static final String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    @vr2
    public static final String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";
    @vr2
    public static final String PATH_SEGMENT_ENCODE_SET_URI = "[]";
    @vr2
    public static final String QUERY_COMPONENT_ENCODE_SET = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";
    @vr2
    public static final String QUERY_COMPONENT_ENCODE_SET_URI = "\\^`{|}";
    @vr2
    public static final String QUERY_COMPONENT_REENCODE_SET = " \"'<>#&=";
    @vr2
    public static final String QUERY_ENCODE_SET = " \"'<>#";
    @vr2
    public static final String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    @ss2
    private final String fragment;
    @vr2
    private final String host;
    private final boolean isHttps;
    @vr2
    private final String password;
    @vr2
    private final List<String> pathSegments;
    private final int port;
    private final List<String> queryNamesAndValues;
    @vr2
    private final String scheme;
    private final String url;
    @vr2
    private final String username;

    @Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010!\n\u0002\b\r\u0018\u0000 \\2\u00020\u0001:\u0001\\B\u0007¢\u0006\u0004\bZ\u0010[J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004H\u0002J \u0010\u000f\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0002J0\u0010\u0012\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004H\u0002J\b\u0010\u0015\u001a\u00020\nH\u0002J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0004J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0004J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0004J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0004J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0004J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0004J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0002J\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0004J\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0004J\u0016\u0010$\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0004J\u0016\u0010%\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0004J\u000e\u0010&\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0002J\u000e\u0010'\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0004J\u0010\u0010(\u001a\u00020\u00002\b\u0010(\u001a\u0004\u0018\u00010\u0004J\u0010\u0010)\u001a\u00020\u00002\b\u0010)\u001a\u0004\u0018\u00010\u0004J\u0018\u0010,\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u00042\b\u0010+\u001a\u0004\u0018\u00010\u0004J\u0018\u0010/\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u00042\b\u0010.\u001a\u0004\u0018\u00010\u0004J\u0018\u00100\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u00042\b\u0010+\u001a\u0004\u0018\u00010\u0004J\u0018\u00101\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u00042\b\u0010.\u001a\u0004\u0018\u00010\u0004J\u000e\u00102\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0004J\u000e\u00103\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u0004J\u0010\u00104\u001a\u00020\u00002\b\u00104\u001a\u0004\u0018\u00010\u0004J\u0010\u00105\u001a\u00020\u00002\b\u00105\u001a\u0004\u0018\u00010\u0004J\u000f\u00108\u001a\u00020\u0000H\u0000¢\u0006\u0004\b6\u00107J\u0006\u0010:\u001a\u000209J\b\u0010;\u001a\u00020\u0004H\u0016J!\u0010?\u001a\u00020\u00002\b\u0010<\u001a\u0004\u0018\u0001092\u0006\u0010\f\u001a\u00020\u0004H\u0000¢\u0006\u0004\b=\u0010>R$\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010\u0018\u001a\u00020\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010@\u001a\u0004\bE\u0010B\"\u0004\bF\u0010DR\"\u0010\u001a\u001a\u00020\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010@\u001a\u0004\bG\u0010B\"\u0004\bH\u0010DR$\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010@\u001a\u0004\bI\u0010B\"\u0004\bJ\u0010DR\"\u0010\u001c\u001a\u00020\u00028\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040P8\u0000X\u0004¢\u0006\f\n\u0004\b!\u0010Q\u001a\u0004\bR\u0010SR,\u0010T\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010P8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bT\u0010Q\u001a\u0004\bU\u0010S\"\u0004\bV\u0010WR$\u00105\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b5\u0010@\u001a\u0004\bX\u0010B\"\u0004\bY\u0010D¨\u0006]"}, d2 = {"Lokhttp3/HttpUrl$Builder;", "", "", "effectivePort", "", "pathSegments", "", "alreadyEncoded", "addPathSegments", "canonicalName", "Lcom/onedelhi/secure/un4;", "removeAllCanonicalQueryParameters", "input", "startPos", "limit", "resolvePath", "pos", "addTrailingSlash", "push", "isDot", "isDotDot", "pop", "scheme", "username", "encodedUsername", "password", "encodedPassword", "host", "port", "pathSegment", "addPathSegment", "encodedPathSegment", "addEncodedPathSegment", "encodedPathSegments", "addEncodedPathSegments", "index", "setPathSegment", "setEncodedPathSegment", "removePathSegment", "encodedPath", "query", "encodedQuery", "name", "value", "addQueryParameter", "encodedName", "encodedValue", "addEncodedQueryParameter", "setQueryParameter", "setEncodedQueryParameter", "removeAllQueryParameters", "removeAllEncodedQueryParameters", "fragment", "encodedFragment", "reencodeForUri$okhttp", "()Lokhttp3/HttpUrl$Builder;", "reencodeForUri", "Lokhttp3/HttpUrl;", "build", "toString", "base", "parse$okhttp", "(Lokhttp3/HttpUrl;Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;", "parse", "Ljava/lang/String;", "getScheme$okhttp", "()Ljava/lang/String;", "setScheme$okhttp", "(Ljava/lang/String;)V", "getEncodedUsername$okhttp", "setEncodedUsername$okhttp", "getEncodedPassword$okhttp", "setEncodedPassword$okhttp", "getHost$okhttp", "setHost$okhttp", "I", "getPort$okhttp", "()I", "setPort$okhttp", "(I)V", "", "Ljava/util/List;", "getEncodedPathSegments$okhttp", "()Ljava/util/List;", "encodedQueryNamesAndValues", "getEncodedQueryNamesAndValues$okhttp", "setEncodedQueryNamesAndValues$okhttp", "(Ljava/util/List;)V", "getEncodedFragment$okhttp", "setEncodedFragment$okhttp", "<init>", "()V", "Companion", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class Builder {
        public static final Companion Companion = new Companion((wg0) null);
        @vr2
        public static final String INVALID_HOST = "Invalid URL host";
        @ss2
        private String encodedFragment;
        @vr2
        private String encodedPassword = "";
        @vr2
        private final List<String> encodedPathSegments;
        @ss2
        private List<String> encodedQueryNamesAndValues;
        @vr2
        private String encodedUsername = "";
        @ss2
        private String host;
        private int port = -1;
        @ss2
        private String scheme;

        @ii2(mo38103bv = {1, 0, 3}, mo38104d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002J \u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002J \u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002J\u001c\u0010\f\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, mo38105d2 = {"Lokhttp3/HttpUrl$Builder$Companion;", "", "()V", "INVALID_HOST", "", "parsePort", "", "input", "pos", "limit", "portColonOffset", "schemeDelimiterOffset", "slashCount", "okhttp"}, mo38106k = 1, mo38107mv = {1, 4, 0})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(wg0 wg0) {
                this();
            }

            /* access modifiers changed from: private */
            public final int parsePort(String str, int i, int i2) {
                try {
                    int parseInt = Integer.parseInt(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i, i2, "", false, false, false, false, (Charset) null, 248, (Object) null));
                    if (1 <= parseInt && 65535 >= parseInt) {
                        return parseInt;
                    }
                    return -1;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            /* access modifiers changed from: private */
            public final int portColonOffset(String str, int i, int i2) {
                while (i < i2) {
                    char charAt = str.charAt(i);
                    if (charAt == ':') {
                        return i;
                    }
                    if (charAt == '[') {
                        do {
                            i++;
                            if (i >= i2) {
                                break;
                            }
                        } while (str.charAt(i) == ']');
                    }
                    i++;
                }
                return i2;
            }

            /* access modifiers changed from: private */
            public final int schemeDelimiterOffset(String str, int i, int i2) {
                if (i2 - i < 2) {
                    return -1;
                }
                char charAt = str.charAt(i);
                if ((jt1.m53781t(charAt, 97) < 0 || jt1.m53781t(charAt, 122) > 0) && (jt1.m53781t(charAt, 65) < 0 || jt1.m53781t(charAt, 90) > 0)) {
                    return -1;
                }
                while (true) {
                    i++;
                    if (i >= i2) {
                        return -1;
                    }
                    char charAt2 = str.charAt(i);
                    if (('a' > charAt2 || 'z' < charAt2) && (('A' > charAt2 || 'Z' < charAt2) && (('0' > charAt2 || '9' < charAt2) && charAt2 != '+' && charAt2 != '-' && charAt2 != '.'))) {
                        if (charAt2 == ':') {
                            return i;
                        }
                        return -1;
                    }
                }
            }

            /* access modifiers changed from: private */
            public final int slashCount(String str, int i, int i2) {
                int i3 = 0;
                while (i < i2) {
                    char charAt = str.charAt(i);
                    if (charAt != '\\' && charAt != '/') {
                        break;
                    }
                    i3++;
                    i++;
                }
                return i3;
            }
        }

        public Builder() {
            ArrayList arrayList = new ArrayList();
            this.encodedPathSegments = arrayList;
            arrayList.add("");
        }

        private final Builder addPathSegments(String str, boolean z) {
            int i = 0;
            do {
                int q = nq4.m58717q(str, "/\\", i, str.length());
                push(str, i, q, q < str.length(), z);
                i = q + 1;
            } while (i <= str.length());
            return this;
        }

        private final int effectivePort() {
            int i = this.port;
            if (i != -1) {
                return i;
            }
            Companion companion = HttpUrl.Companion;
            String str = this.scheme;
            jt1.m53774m(str);
            return companion.defaultPort(str);
        }

        private final boolean isDot(String str) {
            return jt1.m53768g(str, ".") || t54.m65410K1(str, "%2e", true);
        }

        private final boolean isDotDot(String str) {
            return jt1.m53768g(str, "..") || t54.m65410K1(str, "%2e.", true) || t54.m65410K1(str, ".%2e", true) || t54.m65410K1(str, "%2e%2e", true);
        }

        private final void pop() {
            List<String> list = this.encodedPathSegments;
            if (!(list.remove(list.size() - 1).length() == 0) || !(!this.encodedPathSegments.isEmpty())) {
                this.encodedPathSegments.add("");
                return;
            }
            List<String> list2 = this.encodedPathSegments;
            list2.set(list2.size() - 1, "");
        }

        private final void push(String str, int i, int i2, boolean z, boolean z2) {
            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i, i2, HttpUrl.PATH_SEGMENT_ENCODE_SET, z2, false, false, false, (Charset) null, 240, (Object) null);
            if (!isDot(canonicalize$okhttp$default)) {
                if (isDotDot(canonicalize$okhttp$default)) {
                    pop();
                    return;
                }
                List<String> list = this.encodedPathSegments;
                if (list.get(list.size() - 1).length() == 0) {
                    List<String> list2 = this.encodedPathSegments;
                    list2.set(list2.size() - 1, canonicalize$okhttp$default);
                } else {
                    this.encodedPathSegments.add(canonicalize$okhttp$default);
                }
                if (z) {
                    this.encodedPathSegments.add("");
                }
            }
        }

        private final void removeAllCanonicalQueryParameters(String str) {
            List<String> list = this.encodedQueryNamesAndValues;
            jt1.m53774m(list);
            gs1 e1 = df3.m45173e1(df3.m45156W(list.size() - 2, 0), 2);
            int j = e1.mo36871j();
            int l = e1.mo36872l();
            int n = e1.mo36873n();
            if (n >= 0) {
                if (j > l) {
                    return;
                }
            } else if (j < l) {
                return;
            }
            while (true) {
                List<String> list2 = this.encodedQueryNamesAndValues;
                jt1.m53774m(list2);
                if (jt1.m53768g(str, list2.get(j))) {
                    List<String> list3 = this.encodedQueryNamesAndValues;
                    jt1.m53774m(list3);
                    list3.remove(j + 1);
                    List<String> list4 = this.encodedQueryNamesAndValues;
                    jt1.m53774m(list4);
                    list4.remove(j);
                    List<String> list5 = this.encodedQueryNamesAndValues;
                    jt1.m53774m(list5);
                    if (list5.isEmpty()) {
                        this.encodedQueryNamesAndValues = null;
                        return;
                    }
                }
                if (j != l) {
                    j += n;
                } else {
                    return;
                }
            }
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0044 A[SYNTHETIC] */
        private final void resolvePath(java.lang.String r11, int r12, int r13) {
            /*
                r10 = this;
                if (r12 != r13) goto L_0x0003
                return
            L_0x0003:
                char r0 = r11.charAt(r12)
                r1 = 47
                java.lang.String r2 = ""
                r3 = 1
                if (r0 == r1) goto L_0x001e
                r1 = 92
                if (r0 != r1) goto L_0x0013
                goto L_0x001e
            L_0x0013:
                java.util.List<java.lang.String> r0 = r10.encodedPathSegments
                int r1 = r0.size()
                int r1 = r1 - r3
                r0.set(r1, r2)
                goto L_0x0029
            L_0x001e:
                java.util.List<java.lang.String> r0 = r10.encodedPathSegments
                r0.clear()
                java.util.List<java.lang.String> r0 = r10.encodedPathSegments
                r0.add(r2)
                goto L_0x0041
            L_0x0029:
                r6 = r12
                if (r6 >= r13) goto L_0x0044
                java.lang.String r12 = "/\\"
                int r12 = com.onedelhi.secure.nq4.m58717q(r11, r12, r6, r13)
                if (r12 >= r13) goto L_0x0036
                r0 = 1
                goto L_0x0037
            L_0x0036:
                r0 = 0
            L_0x0037:
                r9 = 1
                r4 = r10
                r5 = r11
                r7 = r12
                r8 = r0
                r4.push(r5, r6, r7, r8, r9)
                if (r0 == 0) goto L_0x0029
            L_0x0041:
                int r12 = r12 + 1
                goto L_0x0029
            L_0x0044:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.resolvePath(java.lang.String, int, int):void");
        }

        @vr2
        public final Builder addEncodedPathSegment(@vr2 String str) {
            jt1.m53777p(str, "encodedPathSegment");
            push(str, 0, str.length(), false, true);
            return this;
        }

        @vr2
        public final Builder addEncodedPathSegments(@vr2 String str) {
            jt1.m53777p(str, "encodedPathSegments");
            return addPathSegments(str, true);
        }

        @vr2
        public final Builder addEncodedQueryParameter(@vr2 String str, @ss2 String str2) {
            jt1.m53777p(str, "encodedName");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            jt1.m53774m(list);
            Companion companion = HttpUrl.Companion;
            list.add(Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, (Charset) null, 211, (Object) null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            jt1.m53774m(list2);
            list2.add(str2 != null ? Companion.canonicalize$okhttp$default(companion, str2, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, (Charset) null, 211, (Object) null) : null);
            return this;
        }

        @vr2
        public final Builder addPathSegment(@vr2 String str) {
            jt1.m53777p(str, "pathSegment");
            push(str, 0, str.length(), false, false);
            return this;
        }

        @vr2
        public final Builder addPathSegments(@vr2 String str) {
            jt1.m53777p(str, "pathSegments");
            return addPathSegments(str, false);
        }

        @vr2
        public final Builder addQueryParameter(@vr2 String str, @ss2 String str2) {
            jt1.m53777p(str, "name");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            jt1.m53774m(list);
            Companion companion = HttpUrl.Companion;
            list.add(Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, (Charset) null, 219, (Object) null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            jt1.m53774m(list2);
            list2.add(str2 != null ? Companion.canonicalize$okhttp$default(companion, str2, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, (Charset) null, 219, (Object) null) : null);
            return this;
        }

        @vr2
        public final HttpUrl build() {
            ArrayList arrayList;
            String str = this.scheme;
            if (str != null) {
                Companion companion = HttpUrl.Companion;
                String percentDecode$okhttp$default = Companion.percentDecode$okhttp$default(companion, this.encodedUsername, 0, 0, false, 7, (Object) null);
                String percentDecode$okhttp$default2 = Companion.percentDecode$okhttp$default(companion, this.encodedPassword, 0, 0, false, 7, (Object) null);
                String str2 = this.host;
                if (str2 != null) {
                    int effectivePort = effectivePort();
                    List<String> list = this.encodedPathSegments;
                    ArrayList arrayList2 = new ArrayList(t00.m65073Z(list, 10));
                    for (String percentDecode$okhttp$default3 : list) {
                        arrayList2.add(Companion.percentDecode$okhttp$default(HttpUrl.Companion, percentDecode$okhttp$default3, 0, 0, false, 7, (Object) null));
                    }
                    List<String> list2 = this.encodedQueryNamesAndValues;
                    if (list2 != null) {
                        arrayList = new ArrayList(t00.m65073Z(list2, 10));
                        for (String str3 : list2) {
                            arrayList.add(str3 != null ? Companion.percentDecode$okhttp$default(HttpUrl.Companion, str3, 0, 0, true, 3, (Object) null) : null);
                        }
                    } else {
                        arrayList = null;
                    }
                    String str4 = this.encodedFragment;
                    return new HttpUrl(str, percentDecode$okhttp$default, percentDecode$okhttp$default2, str2, effectivePort, arrayList2, arrayList, str4 != null ? Companion.percentDecode$okhttp$default(HttpUrl.Companion, str4, 0, 0, false, 7, (Object) null) : null, toString());
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        @vr2
        public final Builder encodedFragment(@ss2 String str) {
            this.encodedFragment = str != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, "", true, false, false, true, (Charset) null, 179, (Object) null) : null;
            return this;
        }

        @vr2
        public final Builder encodedPassword(@vr2 String str) {
            jt1.m53777p(str, "encodedPassword");
            this.encodedPassword = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, (Charset) null, 243, (Object) null);
            return this;
        }

        @vr2
        public final Builder encodedPath(@vr2 String str) {
            jt1.m53777p(str, "encodedPath");
            if (t54.m65466u2(str, "/", false, 2, (Object) null)) {
                resolvePath(str, 0, str.length());
                return this;
            }
            throw new IllegalArgumentException(("unexpected encodedPath: " + str).toString());
        }

        @vr2
        public final Builder encodedQuery(@ss2 String str) {
            List<String> list;
            if (str != null) {
                Companion companion = HttpUrl.Companion;
                String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, (Charset) null, 211, (Object) null);
                if (canonicalize$okhttp$default != null) {
                    list = companion.toQueryNamesAndValues$okhttp(canonicalize$okhttp$default);
                    this.encodedQueryNamesAndValues = list;
                    return this;
                }
            }
            list = null;
            this.encodedQueryNamesAndValues = list;
            return this;
        }

        @vr2
        public final Builder encodedUsername(@vr2 String str) {
            jt1.m53777p(str, "encodedUsername");
            this.encodedUsername = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, (Charset) null, 243, (Object) null);
            return this;
        }

        @vr2
        public final Builder fragment(@ss2 String str) {
            this.encodedFragment = str != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, "", false, false, false, true, (Charset) null, 187, (Object) null) : null;
            return this;
        }

        @ss2
        public final String getEncodedFragment$okhttp() {
            return this.encodedFragment;
        }

        @vr2
        public final String getEncodedPassword$okhttp() {
            return this.encodedPassword;
        }

        @vr2
        public final List<String> getEncodedPathSegments$okhttp() {
            return this.encodedPathSegments;
        }

        @ss2
        public final List<String> getEncodedQueryNamesAndValues$okhttp() {
            return this.encodedQueryNamesAndValues;
        }

        @vr2
        public final String getEncodedUsername$okhttp() {
            return this.encodedUsername;
        }

        @ss2
        public final String getHost$okhttp() {
            return this.host;
        }

        public final int getPort$okhttp() {
            return this.port;
        }

        @ss2
        public final String getScheme$okhttp() {
            return this.scheme;
        }

        @vr2
        public final Builder host(@vr2 String str) {
            jt1.m53777p(str, dm1.f27488b);
            String e = vl1.m68221e(Companion.percentDecode$okhttp$default(HttpUrl.Companion, str, 0, 0, false, 7, (Object) null));
            if (e != null) {
                this.host = e;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + str);
        }

        @vr2
        public final Builder parse$okhttp(@ss2 HttpUrl httpUrl, @vr2 String str) {
            int i;
            int q;
            int i2;
            String str2;
            int i3;
            String str3;
            int i4;
            boolean z;
            boolean z2;
            String str4 = str;
            jt1.m53777p(str4, "input");
            int D = nq4.m58666D(str4, 0, 0, 3, (Object) null);
            int F = nq4.m58668F(str4, D, 0, 2, (Object) null);
            Companion companion = Companion;
            int access$schemeDelimiterOffset = companion.schemeDelimiterOffset(str4, D, F);
            String str5 = "(this as java.lang.Strin…ing(startIndex, endIndex)";
            char c = 65535;
            if (access$schemeDelimiterOffset != -1) {
                if (t54.m65460r2(str4, "https:", D, true)) {
                    this.scheme = m51.f32019b;
                    D += 6;
                } else if (t54.m65460r2(str4, "http:", D, true)) {
                    this.scheme = m51.f32018a;
                    D += 5;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Expected URL scheme 'http' or 'https' but was '");
                    String substring = str4.substring(0, access$schemeDelimiterOffset);
                    jt1.m53776o(substring, str5);
                    sb.append(substring);
                    sb.append("'");
                    throw new IllegalArgumentException(sb.toString());
                }
            } else if (httpUrl != null) {
                this.scheme = httpUrl.scheme();
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int access$slashCount = companion.slashCount(str4, D, F);
            char c2 = '?';
            char c3 = '#';
            if (access$slashCount >= 2 || httpUrl == null || (!jt1.m53768g(httpUrl.scheme(), this.scheme))) {
                int i5 = D + access$slashCount;
                boolean z3 = false;
                boolean z4 = false;
                while (true) {
                    q = nq4.m58717q(str4, "@/\\?#", i5, F);
                    char charAt = q != F ? str4.charAt(q) : 65535;
                    if (charAt == c || charAt == c3 || charAt == '/' || charAt == '\\' || charAt == c2) {
                        String str6 = str5;
                        i = F;
                        int i6 = q;
                        Companion companion2 = Companion;
                        int access$portColonOffset = companion2.portColonOffset(str4, i5, i6);
                        int i7 = access$portColonOffset + 1;
                    } else {
                        if (charAt != '@') {
                            str3 = str5;
                            i3 = F;
                        } else {
                            if (!z3) {
                                int p = nq4.m58716p(str4, ':', i5, q);
                                Companion companion3 = HttpUrl.Companion;
                                String str7 = "%40";
                                int i8 = q;
                                int i9 = p;
                                i3 = F;
                                String str8 = str5;
                                String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion3, str, i5, p, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, (Charset) null, 240, (Object) null);
                                if (z4) {
                                    canonicalize$okhttp$default = this.encodedUsername + str7 + canonicalize$okhttp$default;
                                }
                                this.encodedUsername = canonicalize$okhttp$default;
                                int i10 = i8;
                                int i11 = i9;
                                if (i11 != i10) {
                                    this.encodedPassword = Companion.canonicalize$okhttp$default(companion3, str, i11 + 1, i10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, (Charset) null, 240, (Object) null);
                                    z2 = true;
                                } else {
                                    z2 = z3;
                                }
                                z3 = z2;
                                str3 = str8;
                                z = true;
                                i4 = i10;
                            } else {
                                i3 = F;
                                String str9 = str5;
                                int i12 = q;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(this.encodedPassword);
                                sb2.append("%40");
                                StringBuilder sb3 = sb2;
                                str3 = str9;
                                i4 = i12;
                                sb3.append(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i5, i12, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, (Charset) null, 240, (Object) null));
                                this.encodedPassword = sb3.toString();
                                z = z4;
                            }
                            i5 = i4 + 1;
                            z4 = z;
                        }
                        str5 = str3;
                        F = i3;
                        c3 = '#';
                        c2 = '?';
                        c = 65535;
                    }
                }
                String str62 = str5;
                i = F;
                int i62 = q;
                Companion companion22 = Companion;
                int access$portColonOffset2 = companion22.portColonOffset(str4, i5, i62);
                int i72 = access$portColonOffset2 + 1;
                if (i72 < i62) {
                    i2 = i5;
                    this.host = vl1.m68221e(Companion.percentDecode$okhttp$default(HttpUrl.Companion, str, i5, access$portColonOffset2, false, 4, (Object) null));
                    int access$parsePort = companion22.parsePort(str4, i72, i62);
                    this.port = access$parsePort;
                    if (access$parsePort != -1) {
                        str2 = str62;
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Invalid URL port: \"");
                        String substring2 = str4.substring(i72, i62);
                        jt1.m53776o(substring2, str62);
                        sb4.append(substring2);
                        sb4.append(tk4.f35693a);
                        throw new IllegalArgumentException(sb4.toString().toString());
                    }
                } else {
                    i2 = i5;
                    str2 = str62;
                    Companion companion4 = HttpUrl.Companion;
                    this.host = vl1.m68221e(Companion.percentDecode$okhttp$default(companion4, str, i2, access$portColonOffset2, false, 4, (Object) null));
                    String str10 = this.scheme;
                    jt1.m53774m(str10);
                    this.port = companion4.defaultPort(str10);
                }
                if (this.host != null) {
                    D = i62;
                } else {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Invalid URL host: \"");
                    String substring3 = str4.substring(i2, access$portColonOffset2);
                    jt1.m53776o(substring3, str2);
                    sb5.append(substring3);
                    sb5.append(tk4.f35693a);
                    throw new IllegalArgumentException(sb5.toString().toString());
                }
            } else {
                this.encodedUsername = httpUrl.encodedUsername();
                this.encodedPassword = httpUrl.encodedPassword();
                this.host = httpUrl.host();
                this.port = httpUrl.port();
                this.encodedPathSegments.clear();
                this.encodedPathSegments.addAll(httpUrl.encodedPathSegments());
                if (D == F || str4.charAt(D) == '#') {
                    encodedQuery(httpUrl.encodedQuery());
                }
                i = F;
            }
            int i13 = i;
            int q2 = nq4.m58717q(str4, "?#", D, i13);
            resolvePath(str4, D, q2);
            if (q2 < i13 && str4.charAt(q2) == '?') {
                int p2 = nq4.m58716p(str4, '#', q2, i13);
                Companion companion5 = HttpUrl.Companion;
                this.encodedQueryNamesAndValues = companion5.toQueryNamesAndValues$okhttp(Companion.canonicalize$okhttp$default(companion5, str, q2 + 1, p2, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, (Charset) null, 208, (Object) null));
                q2 = p2;
            }
            if (q2 < i13 && str4.charAt(q2) == '#') {
                this.encodedFragment = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, q2 + 1, i13, "", true, false, false, true, (Charset) null, 176, (Object) null);
            }
            return this;
        }

        @vr2
        public final Builder password(@vr2 String str) {
            jt1.m53777p(str, "password");
            this.encodedPassword = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, (Charset) null, 251, (Object) null);
            return this;
        }

        @vr2
        public final Builder port(int i) {
            boolean z = true;
            if (1 > i || 65535 < i) {
                z = false;
            }
            if (z) {
                this.port = i;
                return this;
            }
            throw new IllegalArgumentException(("unexpected port: " + i).toString());
        }

        @vr2
        public final Builder query(@ss2 String str) {
            List<String> list;
            if (str != null) {
                Companion companion = HttpUrl.Companion;
                String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_ENCODE_SET, false, false, true, false, (Charset) null, 219, (Object) null);
                if (canonicalize$okhttp$default != null) {
                    list = companion.toQueryNamesAndValues$okhttp(canonicalize$okhttp$default);
                    this.encodedQueryNamesAndValues = list;
                    return this;
                }
            }
            list = null;
            this.encodedQueryNamesAndValues = list;
            return this;
        }

        @vr2
        public final Builder reencodeForUri$okhttp() {
            String str = this.host;
            String str2 = null;
            this.host = str != null ? new eh3("[\"<>^`{|}]").mo35382n(str, "") : null;
            int size = this.encodedPathSegments.size();
            for (int i = 0; i < size; i++) {
                List<String> list = this.encodedPathSegments;
                list.set(i, Companion.canonicalize$okhttp$default(HttpUrl.Companion, list.get(i), 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, true, true, false, false, (Charset) null, 227, (Object) null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str3 = list2.get(i2);
                    list2.set(i2, str3 != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str3, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true, false, (Charset) null, 195, (Object) null) : null);
                }
            }
            String str4 = this.encodedFragment;
            if (str4 != null) {
                str2 = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str4, 0, 0, HttpUrl.FRAGMENT_ENCODE_SET_URI, true, true, false, true, (Charset) null, Constants.ACTION_NB_RESEND_CLICKED, (Object) null);
            }
            this.encodedFragment = str2;
            return this;
        }

        @vr2
        public final Builder removeAllEncodedQueryParameters(@vr2 String str) {
            jt1.m53777p(str, "encodedName");
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, (Charset) null, 211, (Object) null));
            return this;
        }

        @vr2
        public final Builder removeAllQueryParameters(@vr2 String str) {
            jt1.m53777p(str, "name");
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, (Charset) null, 219, (Object) null));
            return this;
        }

        @vr2
        public final Builder removePathSegment(int i) {
            this.encodedPathSegments.remove(i);
            if (this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add("");
            }
            return this;
        }

        @vr2
        public final Builder scheme(@vr2 String str) {
            jt1.m53777p(str, "scheme");
            String str2 = m51.f32018a;
            if (!t54.m65410K1(str, str2, true)) {
                str2 = m51.f32019b;
                if (!t54.m65410K1(str, str2, true)) {
                    throw new IllegalArgumentException("unexpected scheme: " + str);
                }
            }
            this.scheme = str2;
            return this;
        }

        public final void setEncodedFragment$okhttp(@ss2 String str) {
            this.encodedFragment = str;
        }

        public final void setEncodedPassword$okhttp(@vr2 String str) {
            jt1.m53777p(str, "<set-?>");
            this.encodedPassword = str;
        }

        @vr2
        public final Builder setEncodedPathSegment(int i, @vr2 String str) {
            jt1.m53777p(str, "encodedPathSegment");
            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, true, false, false, false, (Charset) null, 243, (Object) null);
            this.encodedPathSegments.set(i, canonicalize$okhttp$default);
            if (!isDot(canonicalize$okhttp$default) && !isDotDot(canonicalize$okhttp$default)) {
                return this;
            }
            throw new IllegalArgumentException(("unexpected path segment: " + str).toString());
        }

        public final void setEncodedQueryNamesAndValues$okhttp(@ss2 List<String> list) {
            this.encodedQueryNamesAndValues = list;
        }

        @vr2
        public final Builder setEncodedQueryParameter(@vr2 String str, @ss2 String str2) {
            jt1.m53777p(str, "encodedName");
            removeAllEncodedQueryParameters(str);
            addEncodedQueryParameter(str, str2);
            return this;
        }

        public final void setEncodedUsername$okhttp(@vr2 String str) {
            jt1.m53777p(str, "<set-?>");
            this.encodedUsername = str;
        }

        public final void setHost$okhttp(@ss2 String str) {
            this.host = str;
        }

        @vr2
        public final Builder setPathSegment(int i, @vr2 String str) {
            jt1.m53777p(str, "pathSegment");
            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, false, false, false, false, (Charset) null, 251, (Object) null);
            if (!isDot(canonicalize$okhttp$default) && !isDotDot(canonicalize$okhttp$default)) {
                this.encodedPathSegments.set(i, canonicalize$okhttp$default);
                return this;
            }
            throw new IllegalArgumentException(("unexpected path segment: " + str).toString());
        }

        public final void setPort$okhttp(int i) {
            this.port = i;
        }

        @vr2
        public final Builder setQueryParameter(@vr2 String str, @ss2 String str2) {
            jt1.m53777p(str, "name");
            removeAllQueryParameters(str);
            addQueryParameter(str, str2);
            return this;
        }

        public final void setScheme$okhttp(@ss2 String str) {
            this.scheme = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
            if ((r6.encodedPassword.length() > 0) != false) goto L_0x0032;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x008e, code lost:
            if (r1 != r3.defaultPort(r2)) goto L_0x0090;
         */
        @com.onedelhi.secure.vr2
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String toString() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r6.scheme
                if (r1 == 0) goto L_0x000f
                r0.append(r1)
                java.lang.String r1 = "://"
                goto L_0x0011
            L_0x000f:
                java.lang.String r1 = "//"
            L_0x0011:
                r0.append(r1)
                java.lang.String r1 = r6.encodedUsername
                int r1 = r1.length()
                r2 = 1
                r3 = 0
                if (r1 <= 0) goto L_0x0020
                r1 = 1
                goto L_0x0021
            L_0x0020:
                r1 = 0
            L_0x0021:
                r4 = 58
                if (r1 != 0) goto L_0x0032
                java.lang.String r1 = r6.encodedPassword
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x002f
                r1 = 1
                goto L_0x0030
            L_0x002f:
                r1 = 0
            L_0x0030:
                if (r1 == 0) goto L_0x0050
            L_0x0032:
                java.lang.String r1 = r6.encodedUsername
                r0.append(r1)
                java.lang.String r1 = r6.encodedPassword
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x0040
                goto L_0x0041
            L_0x0040:
                r2 = 0
            L_0x0041:
                if (r2 == 0) goto L_0x004b
                r0.append(r4)
                java.lang.String r1 = r6.encodedPassword
                r0.append(r1)
            L_0x004b:
                r1 = 64
                r0.append(r1)
            L_0x0050:
                java.lang.String r1 = r6.host
                if (r1 == 0) goto L_0x0074
                com.onedelhi.secure.jt1.m53774m(r1)
                r2 = 2
                r5 = 0
                boolean r1 = com.onedelhi.secure.u54.m66598U2(r1, r4, r3, r2, r5)
                if (r1 == 0) goto L_0x006f
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.host
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L_0x0074
            L_0x006f:
                java.lang.String r1 = r6.host
                r0.append(r1)
            L_0x0074:
                int r1 = r6.port
                r2 = -1
                if (r1 != r2) goto L_0x007d
                java.lang.String r1 = r6.scheme
                if (r1 == 0) goto L_0x0096
            L_0x007d:
                int r1 = r6.effectivePort()
                java.lang.String r2 = r6.scheme
                if (r2 == 0) goto L_0x0090
                okhttp3.HttpUrl$Companion r3 = okhttp3.HttpUrl.Companion
                com.onedelhi.secure.jt1.m53774m(r2)
                int r2 = r3.defaultPort(r2)
                if (r1 == r2) goto L_0x0096
            L_0x0090:
                r0.append(r4)
                r0.append(r1)
            L_0x0096:
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                java.util.List<java.lang.String> r2 = r6.encodedPathSegments
                r1.toPathString$okhttp(r2, r0)
                java.util.List<java.lang.String> r2 = r6.encodedQueryNamesAndValues
                if (r2 == 0) goto L_0x00ae
                r2 = 63
                r0.append(r2)
                java.util.List<java.lang.String> r2 = r6.encodedQueryNamesAndValues
                com.onedelhi.secure.jt1.m53774m(r2)
                r1.toQueryString$okhttp(r2, r0)
            L_0x00ae:
                java.lang.String r1 = r6.encodedFragment
                if (r1 == 0) goto L_0x00bc
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.encodedFragment
                r0.append(r1)
            L_0x00bc:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                com.onedelhi.secure.jt1.m53776o(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.toString():java.lang.String");
        }

        @vr2
        public final Builder username(@vr2 String str) {
            jt1.m53777p(str, "username");
            this.encodedUsername = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, (Charset) null, 251, (Object) null);
            return this;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0019\n\u0002\b\r\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bG\u0010HJ,\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002J\u001c\u0010\f\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002JV\u0010\u0014\u001a\u00020\n*\u00020\u00022\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0003H\u0007J%\u0010\u001d\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\u00030\u00172\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001f\u001a\u00020\n*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00172\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019H\u0000¢\u0006\u0004\b\u001e\u0010\u001cJ\u001b\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030 *\u00020\u0003H\u0000¢\u0006\u0004\b!\u0010\"J\u0013\u0010'\u001a\u00020$*\u00020\u0003H\u0007¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u0004\u0018\u00010$*\u00020\u0003H\u0007¢\u0006\u0004\b(\u0010&J\u0015\u0010)\u001a\u0004\u0018\u00010$*\u00020*H\u0007¢\u0006\u0004\b%\u0010+J\u0015\u0010)\u001a\u0004\u0018\u00010$*\u00020,H\u0007¢\u0006\u0004\b%\u0010-J\u0017\u0010%\u001a\u00020$2\u0006\u0010.\u001a\u00020\u0003H\u0007¢\u0006\u0004\b/\u0010&J\u0019\u0010(\u001a\u0004\u0018\u00010$2\u0006\u0010.\u001a\u00020\u0003H\u0007¢\u0006\u0004\b0\u0010&J\u0019\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010.\u001a\u00020*H\u0007¢\u0006\u0004\b/\u0010+J\u0019\u0010%\u001a\u0004\u0018\u00010$2\u0006\u00101\u001a\u00020,H\u0007¢\u0006\u0004\b/\u0010-J1\u00104\u001a\u00020\u0003*\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b2\u00103Jc\u00107\u001a\u00020\u0003*\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0004\b5\u00106R\u0014\u00108\u001a\u00020\u00038\u0000XT¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010:\u001a\u00020\u00038\u0000XT¢\u0006\u0006\n\u0004\b:\u00109R\u0014\u0010;\u001a\u00020\u00038\u0000XT¢\u0006\u0006\n\u0004\b;\u00109R\u0014\u0010=\u001a\u00020<8\u0002X\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020\u00038\u0000XT¢\u0006\u0006\n\u0004\b?\u00109R\u0014\u0010@\u001a\u00020\u00038\u0000XT¢\u0006\u0006\n\u0004\b@\u00109R\u0014\u0010A\u001a\u00020\u00038\u0000XT¢\u0006\u0006\n\u0004\bA\u00109R\u0014\u0010B\u001a\u00020\u00038\u0000XT¢\u0006\u0006\n\u0004\bB\u00109R\u0014\u0010C\u001a\u00020\u00038\u0000XT¢\u0006\u0006\n\u0004\bC\u00109R\u0014\u0010D\u001a\u00020\u00038\u0000XT¢\u0006\u0006\n\u0004\bD\u00109R\u0014\u0010E\u001a\u00020\u00038\u0000XT¢\u0006\u0006\n\u0004\bE\u00109R\u0014\u0010F\u001a\u00020\u00038\u0000XT¢\u0006\u0006\n\u0004\bF\u00109¨\u0006I"}, d2 = {"Lokhttp3/HttpUrl$Companion;", "", "Lcom/onedelhi/secure/no;", "", "encoded", "", "pos", "limit", "", "plusIsSpace", "Lcom/onedelhi/secure/un4;", "writePercentDecoded", "isPercentEncoded", "input", "encodeSet", "alreadyEncoded", "strict", "unicodeAllowed", "Ljava/nio/charset/Charset;", "charset", "writeCanonicalized", "scheme", "defaultPort", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "out", "toPathString$okhttp", "(Ljava/util/List;Ljava/lang/StringBuilder;)V", "toPathString", "toQueryString$okhttp", "toQueryString", "", "toQueryNamesAndValues$okhttp", "(Ljava/lang/String;)Ljava/util/List;", "toQueryNamesAndValues", "Lokhttp3/HttpUrl;", "get", "(Ljava/lang/String;)Lokhttp3/HttpUrl;", "toHttpUrl", "parse", "toHttpUrlOrNull", "Ljava/net/URL;", "(Ljava/net/URL;)Lokhttp3/HttpUrl;", "Ljava/net/URI;", "(Ljava/net/URI;)Lokhttp3/HttpUrl;", "url", "-deprecated_get", "-deprecated_parse", "uri", "percentDecode$okhttp", "(Ljava/lang/String;IIZ)Ljava/lang/String;", "percentDecode", "canonicalize$okhttp", "(Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)Ljava/lang/String;", "canonicalize", "FORM_ENCODE_SET", "Ljava/lang/String;", "FRAGMENT_ENCODE_SET", "FRAGMENT_ENCODE_SET_URI", "", "HEX_DIGITS", "[C", "PASSWORD_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET_URI", "QUERY_COMPONENT_ENCODE_SET", "QUERY_COMPONENT_ENCODE_SET_URI", "QUERY_COMPONENT_REENCODE_SET", "QUERY_ENCODE_SET", "USERNAME_ENCODE_SET", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(wg0 wg0) {
            this();
        }

        public static /* synthetic */ String canonicalize$okhttp$default(Companion companion, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset, int i3, Object obj) {
            int i4 = i3;
            return companion.canonicalize$okhttp(str, (i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? str.length() : i2, str2, (i4 & 8) != 0 ? false : z, (i4 & 16) != 0 ? false : z2, (i4 & 32) != 0 ? false : z3, (i4 & 64) != 0 ? false : z4, (i4 & 128) != 0 ? null : charset);
        }

        private final boolean isPercentEncoded(String str, int i, int i2) {
            int i3 = i + 2;
            return i3 < i2 && str.charAt(i) == '%' && nq4.m58677O(str.charAt(i + 1)) != -1 && nq4.m58677O(str.charAt(i3)) != -1;
        }

        public static /* synthetic */ String percentDecode$okhttp$default(Companion companion, String str, int i, int i2, boolean z, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = str.length();
            }
            if ((i3 & 4) != 0) {
                z = false;
            }
            return companion.percentDecode$okhttp(str, i, i2, z);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0065, code lost:
            if (isPercentEncoded(r1, r5, r2) == false) goto L_0x0072;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void writeCanonicalized(com.onedelhi.secure.C6205no r15, java.lang.String r16, int r17, int r18, java.lang.String r19, boolean r20, boolean r21, boolean r22, boolean r23, java.nio.charset.Charset r24) {
            /*
                r14 = this;
                r0 = r15
                r1 = r16
                r2 = r18
                r3 = r24
                r4 = 0
                r5 = r17
                r6 = r4
            L_0x000b:
                if (r5 >= r2) goto L_0x00bf
                java.lang.String r7 = "null cannot be cast to non-null type java.lang.String"
                java.util.Objects.requireNonNull(r1, r7)
                int r7 = r1.codePointAt(r5)
                if (r20 == 0) goto L_0x002e
                r8 = 9
                if (r7 == r8) goto L_0x0029
                r8 = 10
                if (r7 == r8) goto L_0x0029
                r8 = 12
                if (r7 == r8) goto L_0x0029
                r8 = 13
                if (r7 == r8) goto L_0x0029
                goto L_0x002e
            L_0x0029:
                r8 = r14
                r12 = r19
                goto L_0x00b8
            L_0x002e:
                r8 = 43
                if (r7 != r8) goto L_0x003f
                if (r22 == 0) goto L_0x003f
                if (r20 == 0) goto L_0x0039
                java.lang.String r8 = "+"
                goto L_0x003b
            L_0x0039:
                java.lang.String r8 = "%2B"
            L_0x003b:
                r15.mo41279n(r8)
                goto L_0x0029
            L_0x003f:
                r8 = 32
                r9 = 37
                if (r7 < r8) goto L_0x006f
                r8 = 127(0x7f, float:1.78E-43)
                if (r7 == r8) goto L_0x006f
                r8 = 128(0x80, float:1.794E-43)
                if (r7 < r8) goto L_0x004f
                if (r23 == 0) goto L_0x006f
            L_0x004f:
                char r8 = (char) r7
                r10 = 0
                r11 = 2
                r12 = r19
                boolean r8 = com.onedelhi.secure.u54.m66598U2(r12, r8, r10, r11, r4)
                if (r8 != 0) goto L_0x006d
                if (r7 != r9) goto L_0x0068
                if (r20 == 0) goto L_0x006d
                if (r21 == 0) goto L_0x0068
                r8 = r14
                boolean r10 = r14.isPercentEncoded(r1, r5, r2)
                if (r10 != 0) goto L_0x0069
                goto L_0x0072
            L_0x0068:
                r8 = r14
            L_0x0069:
                r15.mo41274k2(r7)
                goto L_0x00b8
            L_0x006d:
                r8 = r14
                goto L_0x0072
            L_0x006f:
                r8 = r14
                r12 = r19
            L_0x0072:
                if (r6 != 0) goto L_0x0079
                com.onedelhi.secure.no r6 = new com.onedelhi.secure.no
                r6.<init>()
            L_0x0079:
                if (r3 == 0) goto L_0x008d
                java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.UTF_8
                boolean r10 = com.onedelhi.secure.jt1.m53768g(r3, r10)
                if (r10 == 0) goto L_0x0084
                goto L_0x008d
            L_0x0084:
                int r10 = java.lang.Character.charCount(r7)
                int r10 = r10 + r5
                r6.mo41229J2(r1, r5, r10, r3)
                goto L_0x0090
            L_0x008d:
                r6.mo41274k2(r7)
            L_0x0090:
                boolean r10 = r6.mo31685f2()
                if (r10 != 0) goto L_0x00b8
                byte r10 = r6.readByte()
                r10 = r10 & 255(0xff, float:3.57E-43)
                r15.mo41230L0(r9)
                char[] r11 = okhttp3.HttpUrl.HEX_DIGITS
                int r13 = r10 >> 4
                r13 = r13 & 15
                char r11 = r11[r13]
                r15.mo41230L0(r11)
                char[] r11 = okhttp3.HttpUrl.HEX_DIGITS
                r10 = r10 & 15
                char r10 = r11[r10]
                r15.mo41230L0(r10)
                goto L_0x0090
            L_0x00b8:
                int r7 = java.lang.Character.charCount(r7)
                int r5 = r5 + r7
                goto L_0x000b
            L_0x00bf:
                r8 = r14
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Companion.writeCanonicalized(com.onedelhi.secure.no, java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):void");
        }

        private final void writePercentDecoded(C6205no noVar, String str, int i, int i2, boolean z) {
            int i3;
            while (i < i2) {
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                int codePointAt = str.codePointAt(i);
                if (codePointAt == 37 && (i3 = i + 2) < i2) {
                    int O = nq4.m58677O(str.charAt(i + 1));
                    int O2 = nq4.m58677O(str.charAt(i3));
                    if (!(O == -1 || O2 == -1)) {
                        noVar.mo41230L0((O << 4) + O2);
                        i = Character.charCount(codePointAt) + i3;
                    }
                } else if (codePointAt == 43 && z) {
                    noVar.mo41230L0(32);
                    i++;
                }
                noVar.mo41274k2(codePointAt);
                i += Character.charCount(codePointAt);
            }
        }

        @uw1(name = "-deprecated_get")
        @vr2
        @xj0(level = ak0.ERROR, message = "moved to extension function", replaceWith = @oi3(expression = "url.toHttpUrl()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrl"}))
        /* renamed from: -deprecated_get  reason: not valid java name */
        public final HttpUrl m74817deprecated_get(@vr2 String str) {
            jt1.m53777p(str, ImagesContract.URL);
            return get(str);
        }

        @uw1(name = "-deprecated_get")
        @ss2
        @xj0(level = ak0.ERROR, message = "moved to extension function", replaceWith = @oi3(expression = "uri.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        /* renamed from: -deprecated_get  reason: not valid java name */
        public final HttpUrl m74818deprecated_get(@vr2 URI uri) {
            jt1.m53777p(uri, "uri");
            return get(uri);
        }

        @uw1(name = "-deprecated_get")
        @ss2
        @xj0(level = ak0.ERROR, message = "moved to extension function", replaceWith = @oi3(expression = "url.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        /* renamed from: -deprecated_get  reason: not valid java name */
        public final HttpUrl m74819deprecated_get(@vr2 URL url) {
            jt1.m53777p(url, ImagesContract.URL);
            return get(url);
        }

        @uw1(name = "-deprecated_parse")
        @ss2
        @xj0(level = ak0.ERROR, message = "moved to extension function", replaceWith = @oi3(expression = "url.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        /* renamed from: -deprecated_parse  reason: not valid java name */
        public final HttpUrl m74820deprecated_parse(@vr2 String str) {
            jt1.m53777p(str, ImagesContract.URL);
            return parse(str);
        }

        @vr2
        public final String canonicalize$okhttp(@vr2 String str, int i, int i2, @vr2 String str2, boolean z, boolean z2, boolean z3, boolean z4, @ss2 Charset charset) {
            String str3 = str;
            int i3 = i2;
            String str4 = str2;
            jt1.m53777p(str, "$this$canonicalize");
            jt1.m53777p(str4, "encodeSet");
            int i4 = i;
            while (i4 < i3) {
                int codePointAt = str.codePointAt(i4);
                if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || z4) && !u54.m66598U2(str4, (char) codePointAt, false, 2, (Object) null))) {
                    if (codePointAt == 37) {
                        if (z) {
                            if (z2) {
                                if (!isPercentEncoded(str, i4, i3)) {
                                    C6205no noVar = new C6205no();
                                    int i5 = i;
                                    noVar.mo41246W0(str, i, i4);
                                    writeCanonicalized(noVar, str, i4, i2, str2, z, z2, z3, z4, charset);
                                    return noVar.mo31688j();
                                }
                                if (codePointAt == 43 || !z3) {
                                    i4 += Character.charCount(codePointAt);
                                } else {
                                    C6205no noVar2 = new C6205no();
                                    int i52 = i;
                                    noVar2.mo41246W0(str, i, i4);
                                    writeCanonicalized(noVar2, str, i4, i2, str2, z, z2, z3, z4, charset);
                                    return noVar2.mo31688j();
                                }
                            }
                        }
                    }
                    if (codePointAt == 43) {
                    }
                    i4 += Character.charCount(codePointAt);
                }
                C6205no noVar22 = new C6205no();
                int i522 = i;
                noVar22.mo41246W0(str, i, i4);
                writeCanonicalized(noVar22, str, i4, i2, str2, z, z2, z3, z4, charset);
                return noVar22.mo31688j();
            }
            int i6 = i;
            String substring = str.substring(i, i2);
            jt1.m53776o(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }

        @zw1
        public final int defaultPort(@vr2 String str) {
            jt1.m53777p(str, "scheme");
            int hashCode = str.hashCode();
            if (hashCode != 3213448) {
                if (hashCode == 99617003 && str.equals(m51.f32019b)) {
                    return 443;
                }
            } else if (str.equals(m51.f32018a)) {
                return 80;
            }
            return -1;
        }

        @zw1
        @uw1(name = "get")
        @vr2
        public final HttpUrl get(@vr2 String str) {
            jt1.m53777p(str, "$this$toHttpUrl");
            return new Builder().parse$okhttp((HttpUrl) null, str).build();
        }

        @zw1
        @uw1(name = "get")
        @ss2
        public final HttpUrl get(@vr2 URI uri) {
            jt1.m53777p(uri, "$this$toHttpUrlOrNull");
            String uri2 = uri.toString();
            jt1.m53776o(uri2, "toString()");
            return parse(uri2);
        }

        @zw1
        @uw1(name = "get")
        @ss2
        public final HttpUrl get(@vr2 URL url) {
            jt1.m53777p(url, "$this$toHttpUrlOrNull");
            String url2 = url.toString();
            jt1.m53776o(url2, "toString()");
            return parse(url2);
        }

        @zw1
        @uw1(name = "parse")
        @ss2
        public final HttpUrl parse(@vr2 String str) {
            jt1.m53777p(str, "$this$toHttpUrlOrNull");
            try {
                return get(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @vr2
        public final String percentDecode$okhttp(@vr2 String str, int i, int i2, boolean z) {
            jt1.m53777p(str, "$this$percentDecode");
            for (int i3 = i; i3 < i2; i3++) {
                char charAt = str.charAt(i3);
                if (charAt == '%' || (charAt == '+' && z)) {
                    C6205no noVar = new C6205no();
                    noVar.mo41246W0(str, i, i3);
                    writePercentDecoded(noVar, str, i3, i2, z);
                    return noVar.mo31688j();
                }
            }
            String substring = str.substring(i, i2);
            jt1.m53776o(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }

        public final void toPathString$okhttp(@vr2 List<String> list, @vr2 StringBuilder sb) {
            jt1.m53777p(list, "$this$toPathString");
            jt1.m53777p(sb, "out");
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb.append('/');
                sb.append(list.get(i));
            }
        }

        @vr2
        public final List<String> toQueryNamesAndValues$okhttp(@vr2 String str) {
            String str2;
            jt1.m53777p(str, "$this$toQueryNamesAndValues");
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= str.length()) {
                int q3 = u54.m66666q3(str, tk4.f35696c, i, false, 4, (Object) null);
                if (q3 == -1) {
                    q3 = str.length();
                }
                int i2 = q3;
                int q32 = u54.m66666q3(str, '=', i, false, 4, (Object) null);
                if (q32 == -1 || q32 > i2) {
                    String substring = str.substring(i, i2);
                    jt1.m53776o(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring);
                    str2 = null;
                } else {
                    String substring2 = str.substring(i, q32);
                    jt1.m53776o(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring2);
                    str2 = str.substring(q32 + 1, i2);
                    jt1.m53776o(str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                }
                arrayList.add(str2);
                i = i2 + 1;
            }
            return arrayList;
        }

        public final void toQueryString$okhttp(@vr2 List<String> list, @vr2 StringBuilder sb) {
            jt1.m53777p(list, "$this$toQueryString");
            jt1.m53777p(sb, "out");
            gs1 e1 = df3.m45173e1(df3.m45236z1(0, list.size()), 2);
            int j = e1.mo36871j();
            int l = e1.mo36872l();
            int n = e1.mo36873n();
            if (n >= 0) {
                if (j > l) {
                    return;
                }
            } else if (j < l) {
                return;
            }
            while (true) {
                String str = list.get(j);
                String str2 = list.get(j + 1);
                if (j > 0) {
                    sb.append(tk4.f35696c);
                }
                sb.append(str);
                if (str2 != null) {
                    sb.append('=');
                    sb.append(str2);
                }
                if (j != l) {
                    j += n;
                } else {
                    return;
                }
            }
        }
    }

    public HttpUrl(@vr2 String str, @vr2 String str2, @vr2 String str3, @vr2 String str4, int i, @vr2 List<String> list, @ss2 List<String> list2, @ss2 String str5, @vr2 String str6) {
        jt1.m53777p(str, "scheme");
        jt1.m53777p(str2, "username");
        jt1.m53777p(str3, "password");
        jt1.m53777p(str4, dm1.f27488b);
        jt1.m53777p(list, "pathSegments");
        jt1.m53777p(str6, ImagesContract.URL);
        this.scheme = str;
        this.username = str2;
        this.password = str3;
        this.host = str4;
        this.port = i;
        this.pathSegments = list;
        this.queryNamesAndValues = list2;
        this.fragment = str5;
        this.url = str6;
        this.isHttps = jt1.m53768g(str, m51.f32019b);
    }

    @zw1
    public static final int defaultPort(@vr2 String str) {
        return Companion.defaultPort(str);
    }

    @zw1
    @uw1(name = "get")
    @vr2
    public static final HttpUrl get(@vr2 String str) {
        return Companion.get(str);
    }

    @zw1
    @uw1(name = "get")
    @ss2
    public static final HttpUrl get(@vr2 URI uri) {
        return Companion.get(uri);
    }

    @zw1
    @uw1(name = "get")
    @ss2
    public static final HttpUrl get(@vr2 URL url2) {
        return Companion.get(url2);
    }

    @zw1
    @uw1(name = "parse")
    @ss2
    public static final HttpUrl parse(@vr2 String str) {
        return Companion.parse(str);
    }

    @uw1(name = "-deprecated_encodedFragment")
    @ss2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "encodedFragment", imports = {}))
    /* renamed from: -deprecated_encodedFragment  reason: not valid java name */
    public final String m74798deprecated_encodedFragment() {
        return encodedFragment();
    }

    @uw1(name = "-deprecated_encodedPassword")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "encodedPassword", imports = {}))
    /* renamed from: -deprecated_encodedPassword  reason: not valid java name */
    public final String m74799deprecated_encodedPassword() {
        return encodedPassword();
    }

    @uw1(name = "-deprecated_encodedPath")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "encodedPath", imports = {}))
    /* renamed from: -deprecated_encodedPath  reason: not valid java name */
    public final String m74800deprecated_encodedPath() {
        return encodedPath();
    }

    @uw1(name = "-deprecated_encodedPathSegments")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "encodedPathSegments", imports = {}))
    /* renamed from: -deprecated_encodedPathSegments  reason: not valid java name */
    public final List<String> m74801deprecated_encodedPathSegments() {
        return encodedPathSegments();
    }

    @uw1(name = "-deprecated_encodedQuery")
    @ss2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "encodedQuery", imports = {}))
    /* renamed from: -deprecated_encodedQuery  reason: not valid java name */
    public final String m74802deprecated_encodedQuery() {
        return encodedQuery();
    }

    @uw1(name = "-deprecated_encodedUsername")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "encodedUsername", imports = {}))
    /* renamed from: -deprecated_encodedUsername  reason: not valid java name */
    public final String m74803deprecated_encodedUsername() {
        return encodedUsername();
    }

    @uw1(name = "-deprecated_fragment")
    @ss2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "fragment", imports = {}))
    /* renamed from: -deprecated_fragment  reason: not valid java name */
    public final String m74804deprecated_fragment() {
        return this.fragment;
    }

    @uw1(name = "-deprecated_host")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "host", imports = {}))
    /* renamed from: -deprecated_host  reason: not valid java name */
    public final String m74805deprecated_host() {
        return this.host;
    }

    @uw1(name = "-deprecated_password")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "password", imports = {}))
    /* renamed from: -deprecated_password  reason: not valid java name */
    public final String m74806deprecated_password() {
        return this.password;
    }

    @uw1(name = "-deprecated_pathSegments")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "pathSegments", imports = {}))
    /* renamed from: -deprecated_pathSegments  reason: not valid java name */
    public final List<String> m74807deprecated_pathSegments() {
        return this.pathSegments;
    }

    @uw1(name = "-deprecated_pathSize")
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "pathSize", imports = {}))
    /* renamed from: -deprecated_pathSize  reason: not valid java name */
    public final int m74808deprecated_pathSize() {
        return pathSize();
    }

    @uw1(name = "-deprecated_port")
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "port", imports = {}))
    /* renamed from: -deprecated_port  reason: not valid java name */
    public final int m74809deprecated_port() {
        return this.port;
    }

    @uw1(name = "-deprecated_query")
    @ss2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "query", imports = {}))
    /* renamed from: -deprecated_query  reason: not valid java name */
    public final String m74810deprecated_query() {
        return query();
    }

    @uw1(name = "-deprecated_queryParameterNames")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "queryParameterNames", imports = {}))
    /* renamed from: -deprecated_queryParameterNames  reason: not valid java name */
    public final Set<String> m74811deprecated_queryParameterNames() {
        return queryParameterNames();
    }

    @uw1(name = "-deprecated_querySize")
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "querySize", imports = {}))
    /* renamed from: -deprecated_querySize  reason: not valid java name */
    public final int m74812deprecated_querySize() {
        return querySize();
    }

    @uw1(name = "-deprecated_scheme")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "scheme", imports = {}))
    /* renamed from: -deprecated_scheme  reason: not valid java name */
    public final String m74813deprecated_scheme() {
        return this.scheme;
    }

    @uw1(name = "-deprecated_uri")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to toUri()", replaceWith = @oi3(expression = "toUri()", imports = {}))
    /* renamed from: -deprecated_uri  reason: not valid java name */
    public final URI m74814deprecated_uri() {
        return uri();
    }

    @uw1(name = "-deprecated_url")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to toUrl()", replaceWith = @oi3(expression = "toUrl()", imports = {}))
    /* renamed from: -deprecated_url  reason: not valid java name */
    public final URL m74815deprecated_url() {
        return url();
    }

    @uw1(name = "-deprecated_username")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "username", imports = {}))
    /* renamed from: -deprecated_username  reason: not valid java name */
    public final String m74816deprecated_username() {
        return this.username;
    }

    @uw1(name = "encodedFragment")
    @ss2
    public final String encodedFragment() {
        if (this.fragment == null) {
            return null;
        }
        String str = this.url;
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(u54.m66666q3(this.url, '#', 0, false, 6, (Object) null) + 1);
        jt1.m53776o(substring, "(this as java.lang.String).substring(startIndex)");
        return substring;
    }

    @uw1(name = "encodedPassword")
    @vr2
    public final String encodedPassword() {
        if (this.password.length() == 0) {
            return "";
        }
        int q3 = u54.m66666q3(this.url, '@', 0, false, 6, (Object) null);
        String str = this.url;
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(u54.m66666q3(this.url, ':', this.scheme.length() + 3, false, 4, (Object) null) + 1, q3);
        jt1.m53776o(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    @uw1(name = "encodedPath")
    @vr2
    public final String encodedPath() {
        int q3 = u54.m66666q3(this.url, '/', this.scheme.length() + 3, false, 4, (Object) null);
        String str = this.url;
        int q = nq4.m58717q(str, "?#", q3, str.length());
        String str2 = this.url;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        String substring = str2.substring(q3, q);
        jt1.m53776o(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    @uw1(name = "encodedPathSegments")
    @vr2
    public final List<String> encodedPathSegments() {
        int q3 = u54.m66666q3(this.url, '/', this.scheme.length() + 3, false, 4, (Object) null);
        String str = this.url;
        int q = nq4.m58717q(str, "?#", q3, str.length());
        ArrayList arrayList = new ArrayList();
        while (q3 < q) {
            int i = q3 + 1;
            int p = nq4.m58716p(this.url, '/', i, q);
            String str2 = this.url;
            Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
            String substring = str2.substring(i, p);
            jt1.m53776o(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            arrayList.add(substring);
            q3 = p;
        }
        return arrayList;
    }

    @uw1(name = "encodedQuery")
    @ss2
    public final String encodedQuery() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        int q3 = u54.m66666q3(this.url, '?', 0, false, 6, (Object) null) + 1;
        String str = this.url;
        int p = nq4.m58716p(str, '#', q3, str.length());
        String str2 = this.url;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        String substring = str2.substring(q3, p);
        jt1.m53776o(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    @uw1(name = "encodedUsername")
    @vr2
    public final String encodedUsername() {
        if (this.username.length() == 0) {
            return "";
        }
        int length = this.scheme.length() + 3;
        String str = this.url;
        int q = nq4.m58717q(str, ":@", length, str.length());
        String str2 = this.url;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        String substring = str2.substring(length, q);
        jt1.m53776o(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public boolean equals(@ss2 Object obj) {
        return (obj instanceof HttpUrl) && jt1.m53768g(((HttpUrl) obj).url, this.url);
    }

    @uw1(name = "fragment")
    @ss2
    public final String fragment() {
        return this.fragment;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    @uw1(name = "host")
    @vr2
    public final String host() {
        return this.host;
    }

    public final boolean isHttps() {
        return this.isHttps;
    }

    @vr2
    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.setScheme$okhttp(this.scheme);
        builder.setEncodedUsername$okhttp(encodedUsername());
        builder.setEncodedPassword$okhttp(encodedPassword());
        builder.setHost$okhttp(this.host);
        builder.setPort$okhttp(this.port != Companion.defaultPort(this.scheme) ? this.port : -1);
        builder.getEncodedPathSegments$okhttp().clear();
        builder.getEncodedPathSegments$okhttp().addAll(encodedPathSegments());
        builder.encodedQuery(encodedQuery());
        builder.setEncodedFragment$okhttp(encodedFragment());
        return builder;
    }

    @ss2
    public final Builder newBuilder(@vr2 String str) {
        jt1.m53777p(str, "link");
        try {
            return new Builder().parse$okhttp(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @uw1(name = "password")
    @vr2
    public final String password() {
        return this.password;
    }

    @uw1(name = "pathSegments")
    @vr2
    public final List<String> pathSegments() {
        return this.pathSegments;
    }

    @uw1(name = "pathSize")
    public final int pathSize() {
        return this.pathSegments.size();
    }

    @uw1(name = "port")
    public final int port() {
        return this.port;
    }

    @uw1(name = "query")
    @ss2
    public final String query() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Companion.toQueryString$okhttp(this.queryNamesAndValues, sb);
        return sb.toString();
    }

    @ss2
    public final String queryParameter(@vr2 String str) {
        jt1.m53777p(str, "name");
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            return null;
        }
        gs1 e1 = df3.m45173e1(df3.m45236z1(0, list.size()), 2);
        int j = e1.mo36871j();
        int l = e1.mo36872l();
        int n = e1.mo36873n();
        if (n < 0 ? j >= l : j <= l) {
            while (!jt1.m53768g(str, this.queryNamesAndValues.get(j))) {
                if (j != l) {
                    j += n;
                }
            }
            return this.queryNamesAndValues.get(j + 1);
        }
        return null;
    }

    @vr2
    public final String queryParameterName(int i) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            String str = list.get(i * 2);
            jt1.m53774m(str);
            return str;
        }
        throw new IndexOutOfBoundsException();
    }

    @uw1(name = "queryParameterNames")
    @vr2
    public final Set<String> queryParameterNames() {
        if (this.queryNamesAndValues == null) {
            return hv3.m51155k();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        gs1 e1 = df3.m45173e1(df3.m45236z1(0, this.queryNamesAndValues.size()), 2);
        int j = e1.mo36871j();
        int l = e1.mo36872l();
        int n = e1.mo36873n();
        if (n < 0 ? j >= l : j <= l) {
            while (true) {
                String str = this.queryNamesAndValues.get(j);
                jt1.m53774m(str);
                linkedHashSet.add(str);
                if (j == l) {
                    break;
                }
                j += n;
            }
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        jt1.m53776o(unmodifiableSet, "Collections.unmodifiableSet(result)");
        return unmodifiableSet;
    }

    @ss2
    public final String queryParameterValue(int i) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.get((i * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    @vr2
    public final List<String> queryParameterValues(@vr2 String str) {
        jt1.m53777p(str, "name");
        if (this.queryNamesAndValues == null) {
            return s00.m64037F();
        }
        ArrayList arrayList = new ArrayList();
        gs1 e1 = df3.m45173e1(df3.m45236z1(0, this.queryNamesAndValues.size()), 2);
        int j = e1.mo36871j();
        int l = e1.mo36872l();
        int n = e1.mo36873n();
        if (n < 0 ? j >= l : j <= l) {
            while (true) {
                if (jt1.m53768g(str, this.queryNamesAndValues.get(j))) {
                    arrayList.add(this.queryNamesAndValues.get(j + 1));
                }
                if (j == l) {
                    break;
                }
                j += n;
            }
        }
        List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
        jt1.m53776o(unmodifiableList, "Collections.unmodifiableList(result)");
        return unmodifiableList;
    }

    @uw1(name = "querySize")
    public final int querySize() {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    @vr2
    public final String redact() {
        Builder newBuilder = newBuilder("/...");
        jt1.m53774m(newBuilder);
        return newBuilder.username("").password("").build().toString();
    }

    @ss2
    public final HttpUrl resolve(@vr2 String str) {
        jt1.m53777p(str, "link");
        Builder newBuilder = newBuilder(str);
        if (newBuilder != null) {
            return newBuilder.build();
        }
        return null;
    }

    @uw1(name = "scheme")
    @vr2
    public final String scheme() {
        return this.scheme;
    }

    @vr2
    public String toString() {
        return this.url;
    }

    @ss2
    public final String topPrivateDomain() {
        if (nq4.m58703h(this.host)) {
            return null;
        }
        return PublicSuffixDatabase.f38856a.mo49740c().mo49734e(this.host);
    }

    @uw1(name = "uri")
    @vr2
    public final URI uri() {
        String builder = newBuilder().reencodeForUri$okhttp().toString();
        try {
            return new URI(builder);
        } catch (URISyntaxException e) {
            try {
                URI create = URI.create(new eh3("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").mo35382n(builder, ""));
                jt1.m53776o(create, "try {\n        val stripp…e) // Unexpected!\n      }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    @uw1(name = "url")
    @vr2
    public final URL url() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @uw1(name = "username")
    @vr2
    public final String username() {
        return this.username;
    }
}
