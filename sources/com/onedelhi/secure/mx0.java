package com.onedelhi.secure;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.Location;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import com.onedelhi.secure.ak4;
import com.onedelhi.secure.hl3;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.utils.CharsetNames;

public class mx0 {

    /* renamed from: A */
    public static final int f16412A = 7;

    /* renamed from: A */
    public static final String f16413A = "ImageDescription";

    /* renamed from: A */
    public static final short f16414A = 3;

    /* renamed from: A0 */
    public static final int f16415A0 = 4;

    /* renamed from: A0 */
    public static final String f16416A0 = "FocalPlaneYResolution";

    /* renamed from: A0 */
    public static final short f16417A0 = 0;

    /* renamed from: A1 */
    public static final String f16418A1 = "GPSDestBearing";

    /* renamed from: B */
    public static final int f16419B = 8;

    /* renamed from: B */
    public static final String f16420B = "Make";

    /* renamed from: B */
    public static final short f16421B = 4;

    /* renamed from: B0 */
    public static final int f16422B0 = 5;

    /* renamed from: B0 */
    public static final String f16423B0 = "FocalPlaneResolutionUnit";

    /* renamed from: B0 */
    public static final short f16424B0 = 1;

    /* renamed from: B1 */
    public static final String f16425B1 = "GPSDestDistanceRef";

    /* renamed from: C */
    public static final int f16426C = 32773;

    /* renamed from: C */
    public static final String f16427C = "Model";

    /* renamed from: C */
    public static final short f16428C = 5;

    /* renamed from: C0 */
    public static final int f16429C0 = 6;

    /* renamed from: C0 */
    public static final String f16430C0 = "SubjectLocation";

    /* renamed from: C0 */
    public static final short f16431C0 = 0;

    /* renamed from: C1 */
    public static final String f16432C1 = "GPSDestDistance";

    /* renamed from: D */
    public static final int f16433D = 34892;

    /* renamed from: D */
    public static final String f16434D = "Software";

    /* renamed from: D */
    public static final short f16435D = 6;

    /* renamed from: D0 */
    public static final int f16436D0 = 7;

    /* renamed from: D0 */
    public static final String f16437D0 = "ExposureIndex";

    /* renamed from: D0 */
    public static final short f16438D0 = 1;

    /* renamed from: D1 */
    public static final String f16439D1 = "GPSProcessingMethod";

    /* renamed from: E */
    public static final int f16440E = 0;

    /* renamed from: E */
    public static final String f16441E = "Artist";

    /* renamed from: E */
    public static final short f16442E = 255;

    /* renamed from: E0 */
    public static final int f16443E0 = 8;

    /* renamed from: E0 */
    public static final String f16444E0 = "SensingMethod";

    /* renamed from: E0 */
    public static final short f16445E0 = 2;

    /* renamed from: E1 */
    public static final String f16446E1 = "GPSAreaInformation";

    /* renamed from: F */
    public static final int f16447F = 1;

    /* renamed from: F */
    public static final String f16448F = "Copyright";

    /* renamed from: F */
    public static final short f16449F = 0;

    /* renamed from: F0 */
    public static final int f16450F0 = 9;

    /* renamed from: F0 */
    public static final String f16451F0 = "FileSource";

    /* renamed from: F0 */
    public static final short f16452F0 = 3;

    /* renamed from: F1 */
    public static final String f16453F1 = "GPSDateStamp";

    /* renamed from: G */
    public static final int f16454G = 2;

    /* renamed from: G */
    public static final String f16455G = "ExifVersion";

    /* renamed from: G */
    public static final short f16456G = 1;

    /* renamed from: G0 */
    public static final int f16457G0 = 10;

    /* renamed from: G0 */
    public static final String f16458G0 = "SceneType";

    /* renamed from: G0 */
    public static final short f16459G0 = 0;

    /* renamed from: G1 */
    public static final String f16460G1 = "GPSDifferential";

    /* renamed from: H */
    public static final int f16461H = 6;

    /* renamed from: H */
    public static final String f16462H = "FlashpixVersion";

    /* renamed from: H */
    public static final short f16463H = 2;

    /* renamed from: H0 */
    public static final int f16464H0 = 11;

    /* renamed from: H0 */
    public static final String f16465H0 = "CFAPattern";

    /* renamed from: H0 */
    public static final short f16466H0 = 1;

    /* renamed from: H1 */
    public static final String f16467H1 = "GPSHPositioningError";

    /* renamed from: I */
    public static final int f16468I = 0;

    /* renamed from: I */
    public static final String f16469I = "ColorSpace";

    /* renamed from: I */
    public static final short f16470I = 3;

    /* renamed from: I0 */
    public static final int f16471I0 = 12;

    /* renamed from: I0 */
    public static final String f16472I0 = "CustomRendered";

    /* renamed from: I0 */
    public static final short f16473I0 = 2;

    /* renamed from: I1 */
    public static final String f16474I1 = "InteroperabilityIndex";

    /* renamed from: J */
    public static final int f16475J = 1;

    /* renamed from: J */
    public static final String f16476J = "Gamma";

    /* renamed from: J */
    public static final short f16477J = 4;

    /* renamed from: J0 */
    public static final int f16478J0 = 13;

    /* renamed from: J0 */
    public static final String f16479J0 = "ExposureMode";

    /* renamed from: J0 */
    public static final short f16480J0 = 3;

    /* renamed from: J1 */
    public static final String f16481J1 = "ThumbnailImageLength";

    /* renamed from: K */
    public static final int f16482K = 0;

    /* renamed from: K */
    public static final String f16483K = "PixelXDimension";

    /* renamed from: K */
    public static final short f16484K = 9;

    /* renamed from: K0 */
    public static final int f16485K0 = 14;

    /* renamed from: K0 */
    public static final String f16486K0 = "WhiteBalance";

    /* renamed from: K0 */
    public static final short f16487K0 = 4;

    /* renamed from: K1 */
    public static final String f16488K1 = "ThumbnailImageWidth";

    /* renamed from: L */
    public static final int f16489L = 1;

    /* renamed from: L */
    public static final String f16490L = "PixelYDimension";

    /* renamed from: L */
    public static final short f16491L = 10;

    /* renamed from: L0 */
    public static final String f16492L0 = "DigitalZoomRatio";

    /* renamed from: L0 */
    public static final short f16493L0 = 0;
    @hl3({hl3.C2354a.LIBRARY})

    /* renamed from: L1 */
    public static final String f16494L1 = "ThumbnailOrientation";

    /* renamed from: M */
    public static final int f16495M = 5000;

    /* renamed from: M */
    public static final String f16496M = "ComponentsConfiguration";

    /* renamed from: M */
    public static final short f16497M = 11;

    /* renamed from: M0 */
    public static final String f16498M0 = "FocalLengthIn35mmFilm";

    /* renamed from: M0 */
    public static final short f16499M0 = 1;

    /* renamed from: M1 */
    public static final String f16500M1 = "DNGVersion";

    /* renamed from: N */
    public static final int f16501N = 84;

    /* renamed from: N */
    public static final String f16502N = "CompressedBitsPerPixel";

    /* renamed from: N */
    public static final short f16503N = 12;

    /* renamed from: N0 */
    public static final String f16504N0 = "SceneCaptureType";

    /* renamed from: N0 */
    public static final short f16505N0 = 2;

    /* renamed from: N1 */
    public static final String f16506N1 = "DefaultCropSize";

    /* renamed from: O */
    public static final int f16507O = 4;

    /* renamed from: O */
    public static final String f16508O = "MakerNote";

    /* renamed from: O */
    public static final short f16509O = 13;

    /* renamed from: O0 */
    public static final String f16510O0 = "GainControl";

    /* renamed from: O0 */
    public static final short f16511O0 = 0;

    /* renamed from: O1 */
    public static final String f16512O1 = "ThumbnailImage";

    /* renamed from: P */
    public static final int f16513P = 8;

    /* renamed from: P */
    public static final String f16514P = "UserComment";

    /* renamed from: P */
    public static final short f16515P = 14;

    /* renamed from: P0 */
    public static final String f16516P0 = "Contrast";

    /* renamed from: P0 */
    public static final short f16517P0 = 0;

    /* renamed from: P1 */
    public static final String f16518P1 = "PreviewImageStart";

    /* renamed from: Q */
    public static final int f16519Q = 12;

    /* renamed from: Q */
    public static final String f16520Q = "RelatedSoundFile";

    /* renamed from: Q */
    public static final short f16521Q = 15;

    /* renamed from: Q0 */
    public static final String f16522Q0 = "Saturation";

    /* renamed from: Q0 */
    public static final short f16523Q0 = 0;

    /* renamed from: Q1 */
    public static final String f16524Q1 = "PreviewImageLength";

    /* renamed from: R */
    public static final int f16525R = 6;

    /* renamed from: R */
    public static final String f16526R = "DateTimeOriginal";

    /* renamed from: R */
    public static final short f16527R = 16;

    /* renamed from: R0 */
    public static final String f16528R0 = "Sharpness";

    /* renamed from: R0 */
    public static final short f16529R0 = 0;

    /* renamed from: R1 */
    public static final String f16530R1 = "AspectFrame";

    /* renamed from: S */
    public static final int f16531S = 4;

    /* renamed from: S */
    public static final String f16532S = "DateTimeDigitized";

    /* renamed from: S */
    public static final short f16533S = 17;

    /* renamed from: S0 */
    public static final String f16534S0 = "DeviceSettingDescription";

    /* renamed from: S0 */
    public static final short f16535S0 = 1;

    /* renamed from: S1 */
    public static final String f16536S1 = "SensorBottomBorder";

    /* renamed from: T */
    public static final int f16537T = 4;

    /* renamed from: T */
    public static final String f16538T = "OffsetTime";

    /* renamed from: T */
    public static final short f16539T = 18;

    /* renamed from: T0 */
    public static final String f16540T0 = "SubjectDistanceRange";

    /* renamed from: T0 */
    public static final short f16541T0 = 2;

    /* renamed from: T1 */
    public static final String f16542T1 = "SensorLeftBorder";

    /* renamed from: U */
    public static final int f16543U = 4;

    /* renamed from: U */
    public static final String f16544U = "OffsetTimeOriginal";

    /* renamed from: U */
    public static final short f16545U = 19;

    /* renamed from: U0 */
    public static final String f16546U0 = "ImageUniqueID";

    /* renamed from: U0 */
    public static final short f16547U0 = 0;

    /* renamed from: U1 */
    public static final String f16548U1 = "SensorRightBorder";

    /* renamed from: V */
    public static final int f16549V = 10;

    /* renamed from: V */
    public static final String f16550V = "OffsetTimeDigitized";

    /* renamed from: V */
    public static final short f16551V = 20;
    @Deprecated

    /* renamed from: V0 */
    public static final String f16552V0 = "CameraOwnerName";

    /* renamed from: V0 */
    public static final short f16553V0 = 1;

    /* renamed from: V1 */
    public static final String f16554V1 = "SensorTopBorder";

    /* renamed from: W */
    public static final int f16555W = 4;

    /* renamed from: W */
    public static final String f16556W = "SubSecTime";

    /* renamed from: W */
    public static final short f16557W = 21;

    /* renamed from: W0 */
    public static final String f16558W0 = "CameraOwnerName";

    /* renamed from: W0 */
    public static final short f16559W0 = 2;

    /* renamed from: W1 */
    public static final String f16560W1 = "ISO";

    /* renamed from: X */
    public static final int f16561X = 4;

    /* renamed from: X */
    public static final String f16562X = "SubSecTimeOriginal";

    /* renamed from: X */
    public static final short f16563X = 22;

    /* renamed from: X0 */
    public static final String f16564X0 = "BodySerialNumber";

    /* renamed from: X0 */
    public static final short f16565X0 = 3;

    /* renamed from: X1 */
    public static final String f16566X1 = "JpgFromRaw";

    /* renamed from: Y */
    public static final int f16567Y = 8;

    /* renamed from: Y */
    public static final String f16568Y = "SubSecTimeDigitized";

    /* renamed from: Y */
    public static final short f16569Y = 23;

    /* renamed from: Y0 */
    public static final String f16570Y0 = "LensSpecification";

    /* renamed from: Y0 */
    public static final short f16571Y0 = 0;

    /* renamed from: Y1 */
    public static final String f16572Y1 = "Xmp";

    /* renamed from: Z */
    public static final int f16573Z = 1;

    /* renamed from: Z */
    public static final String f16574Z = "ExposureTime";

    /* renamed from: Z */
    public static final short f16575Z = 24;

    /* renamed from: Z0 */
    public static final String f16576Z0 = "LensMake";

    /* renamed from: Z0 */
    public static final short f16577Z0 = 1;

    /* renamed from: Z1 */
    public static final String f16578Z1 = "NewSubfileType";

    /* renamed from: a */
    public static final byte f16579a = 47;

    /* renamed from: a */
    public static final C2899f f16580a = new C2899f(f16757p, 273, 3);

    /* renamed from: a */
    public static final Charset f16581a;

    /* renamed from: a */
    public static SimpleDateFormat f16582a = null;

    /* renamed from: a */
    public static final HashMap<Integer, Integer> f16583a = new HashMap<>();

    /* renamed from: a */
    public static final HashSet<String> f16584a = new HashSet<>(Arrays.asList(new String[]{f16593a0, f16492L0, f16574Z, f16781r0, f16703j1}));

    /* renamed from: a */
    public static final List<Integer> f16585a = Arrays.asList(new Integer[]{1, 6, 3, 8});

    /* renamed from: a */
    public static final Pattern f16586a = Pattern.compile(".*[1-9].*");

    /* renamed from: a */
    public static final short f16587a = 1;

    /* renamed from: a */
    public static final int[] f16588a = {8, 8, 8};

    /* renamed from: a */
    public static final C2899f[] f16589a;

    /* renamed from: a */
    public static final String[] f16590a = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: a */
    public static final C2899f[][] f16591a;

    /* renamed from: a0 */
    public static final int f16592a0 = 2;

    /* renamed from: a0 */
    public static final String f16593a0 = "FNumber";

    /* renamed from: a0 */
    public static final short f16594a0 = 255;

    /* renamed from: a1 */
    public static final String f16595a1 = "LensModel";

    /* renamed from: a1 */
    public static final short f16596a1 = 0;

    /* renamed from: a2 */
    public static final String f16597a2 = "SubfileType";

    /* renamed from: b */
    public static final byte f16598b = 42;

    /* renamed from: b */
    public static final C2899f f16599b = new C2899f(f16787s, br1.f9936j, 4);

    /* renamed from: b */
    public static final String f16600b = "ExifInterface";

    /* renamed from: b */
    public static final List<Integer> f16601b = Arrays.asList(new Integer[]{2, 7, 4, 5});

    /* renamed from: b */
    public static final Pattern f16602b = Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");

    /* renamed from: b */
    public static final short f16603b = 2;

    /* renamed from: b */
    public static final byte[] f16604b = {-1, f16628d, -1};

    /* renamed from: b */
    public static final int[] f16605b = {4};

    /* renamed from: b */
    public static final C2899f[] f16606b;

    /* renamed from: b */
    public static final HashMap<Integer, C2899f>[] f16607b;

    /* renamed from: b0 */
    public static final int f16608b0 = 3;

    /* renamed from: b0 */
    public static final String f16609b0 = "ExposureProgram";

    /* renamed from: b0 */
    public static final short f16610b0 = 1;

    /* renamed from: b1 */
    public static final String f16611b1 = "LensSerialNumber";

    /* renamed from: b1 */
    public static final short f16612b1 = 1;

    /* renamed from: b2 */
    public static final String f16613b2 = "ExifIFDPointer";

    /* renamed from: c */
    public static final byte f16614c = -1;

    /* renamed from: c */
    public static final C2899f f16615c = new C2899f(f16797t, 514, 4);

    /* renamed from: c */
    public static final String f16616c = "ImageWidth";

    /* renamed from: c */
    public static final short f16617c = 1;

    /* renamed from: c */
    public static final byte[] f16618c = {102, 116, 121, 112};

    /* renamed from: c */
    public static final int[] f16619c = {8};

    /* renamed from: c */
    public static final C2899f[] f16620c;

    /* renamed from: c */
    public static final HashMap<String, C2899f>[] f16621c;

    /* renamed from: c0 */
    public static final int f16622c0 = 4;

    /* renamed from: c0 */
    public static final String f16623c0 = "SpectralSensitivity";

    /* renamed from: c0 */
    public static final short f16624c0 = 4;

    /* renamed from: c1 */
    public static final String f16625c1 = "GPSVersionID";

    /* renamed from: c1 */
    public static final short f16626c1 = 20306;

    /* renamed from: c2 */
    public static final String f16627c2 = "GPSInfoIFDPointer";

    /* renamed from: d */
    public static final byte f16628d = -40;

    /* renamed from: d */
    public static final String f16629d = "ImageLength";

    /* renamed from: d */
    public static final short f16630d = 2;

    /* renamed from: d */
    public static final byte[] f16631d = {109, 105, 102, TarConstants.LF_LINK};

    /* renamed from: d */
    public static final int[] f16632d = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: d */
    public static final C2899f[] f16633d;

    /* renamed from: d0 */
    public static final int f16634d0 = 5;
    @Deprecated

    /* renamed from: d0 */
    public static final String f16635d0 = "ISOSpeedRatings";

    /* renamed from: d0 */
    public static final short f16636d0 = 6;

    /* renamed from: d1 */
    public static final String f16637d1 = "GPSLatitudeRef";

    /* renamed from: d1 */
    public static final short f16638d1 = 21330;

    /* renamed from: d2 */
    public static final String f16639d2 = "InteroperabilityIFDPointer";

    /* renamed from: e */
    public static final byte f16640e = -64;

    /* renamed from: e */
    public static final String f16641e = "BitsPerSample";

    /* renamed from: e */
    public static final short f16642e = 2;

    /* renamed from: e */
    public static final byte[] f16643e = {104, 101, 105, 99};

    /* renamed from: e */
    public static final C2899f[] f16644e;

    /* renamed from: e0 */
    public static final int f16645e0 = 6;

    /* renamed from: e0 */
    public static final String f16646e0 = "PhotographicSensitivity";

    /* renamed from: e0 */
    public static final short f16647e0 = 8;

    /* renamed from: e1 */
    public static final String f16648e1 = "GPSLatitude";

    /* renamed from: e1 */
    public static final short f16649e1 = 85;

    /* renamed from: e2 */
    public static final String f16650e2 = "SubIFDPointer";

    /* renamed from: f */
    public static final byte f16651f = -63;

    /* renamed from: f */
    public static final String f16652f = "Compression";

    /* renamed from: f */
    public static final short f16653f = 3;

    /* renamed from: f */
    public static final byte[] f16654f = {79, TarConstants.LF_GNUTYPE_LONGNAME, 89, 77, 80, 0};

    /* renamed from: f */
    public static final C2899f[] f16655f;

    /* renamed from: f0 */
    public static final int f16656f0 = 7;

    /* renamed from: f0 */
    public static final String f16657f0 = "OECF";

    /* renamed from: f0 */
    public static final short f16658f0 = 16;

    /* renamed from: f1 */
    public static final String f16659f1 = "GPSLongitudeRef";

    /* renamed from: f1 */
    public static final short f16660f1 = 18761;

    /* renamed from: f2 */
    public static final String f16661f2 = "CameraSettingsIFDPointer";

    /* renamed from: g */
    public static final byte f16662g = -62;

    /* renamed from: g */
    public static final String f16663g = "PhotometricInterpretation";

    /* renamed from: g */
    public static final short f16664g = 0;

    /* renamed from: g */
    public static final byte[] f16665g = {79, TarConstants.LF_GNUTYPE_LONGNAME, 89, 77, 80, 85, TarConstants.LF_GNUTYPE_SPARSE, 0, 73, 73};

    /* renamed from: g */
    public static final C2899f[] f16666g;

    /* renamed from: g0 */
    public static final int f16667g0 = 8;

    /* renamed from: g0 */
    public static final String f16668g0 = "SensitivityType";

    /* renamed from: g0 */
    public static final short f16669g0 = 24;

    /* renamed from: g1 */
    public static final String f16670g1 = "GPSLongitude";

    /* renamed from: g1 */
    public static final short f16671g1 = 19789;

    /* renamed from: g2 */
    public static final String f16672g2 = "ImageProcessingIFDPointer";

    /* renamed from: h */
    public static final byte f16673h = -61;

    /* renamed from: h */
    public static final String f16674h = "Orientation";

    /* renamed from: h */
    public static final short f16675h = 1;

    /* renamed from: h */
    public static final boolean f16676h = Log.isLoggable(f16600b, 3);

    /* renamed from: h */
    public static final byte[] f16677h = {-119, 80, 78, 71, v44.f21655a, 10, 26, 10};

    /* renamed from: h */
    public static final C2899f[] f16678h;

    /* renamed from: h0 */
    public static final int f16679h0 = 9;

    /* renamed from: h0 */
    public static final String f16680h0 = "StandardOutputSensitivity";

    /* renamed from: h0 */
    public static final short f16681h0 = 32;

    /* renamed from: h1 */
    public static final String f16682h1 = "GPSAltitudeRef";

    /* renamed from: h2 */
    public static final String f16683h2 = "N";

    /* renamed from: i */
    public static final byte f16684i = -59;

    /* renamed from: i */
    public static final String f16685i = "SamplesPerPixel";

    /* renamed from: i */
    public static final short f16686i = 2;

    /* renamed from: i */
    public static final byte[] f16687i = {101, TarConstants.LF_PAX_EXTENDED_HEADER_UC, 73, 102};

    /* renamed from: i */
    public static final C2899f[] f16688i;

    /* renamed from: i0 */
    public static final int f16689i0 = 10;

    /* renamed from: i0 */
    public static final String f16690i0 = "RecommendedExposureIndex";

    /* renamed from: i0 */
    public static final short f16691i0 = 64;

    /* renamed from: i1 */
    public static final String f16692i1 = "GPSAltitude";

    /* renamed from: i2 */
    public static final String f16693i2 = "S";

    /* renamed from: j */
    public static final byte f16694j = -58;

    /* renamed from: j */
    public static final int f16695j = 512;

    /* renamed from: j */
    public static final String f16696j = "PlanarConfiguration";

    /* renamed from: j */
    public static final short f16697j = 3;

    /* renamed from: j */
    public static final byte[] f16698j = {73, 72, 68, 82};

    /* renamed from: j */
    public static final C2899f[] f16699j = {new C2899f(f16650e2, 330, 4), new C2899f(f16613b2, 34665, 4), new C2899f(f16627c2, 34853, 4), new C2899f(f16639d2, 40965, 4), new C2899f(f16661f2, 8224, 1), new C2899f(f16672g2, 8256, 1)};

    /* renamed from: j0 */
    public static final int f16700j0 = 11;

    /* renamed from: j0 */
    public static final String f16701j0 = "ISOSpeed";

    /* renamed from: j0 */
    public static final short f16702j0 = 1;

    /* renamed from: j1 */
    public static final String f16703j1 = "GPSTimeStamp";

    /* renamed from: j2 */
    public static final String f16704j2 = "E";

    /* renamed from: k */
    public static final byte f16705k = -57;

    /* renamed from: k */
    public static final int f16706k = 0;

    /* renamed from: k */
    public static final String f16707k = "YCbCrSubSampling";

    /* renamed from: k */
    public static final short f16708k = 4;

    /* renamed from: k */
    public static final byte[] f16709k = {73, 69, 78, 68};

    /* renamed from: k0 */
    public static final int f16710k0 = 12;

    /* renamed from: k0 */
    public static final String f16711k0 = "ISOSpeedLatitudeyyy";

    /* renamed from: k0 */
    public static final short f16712k0 = 2;

    /* renamed from: k1 */
    public static final String f16713k1 = "GPSSatellites";

    /* renamed from: k2 */
    public static final String f16714k2 = "W";

    /* renamed from: l */
    public static final byte f16715l = -55;

    /* renamed from: l */
    public static final int f16716l = 1;

    /* renamed from: l */
    public static final String f16717l = "YCbCrPositioning";

    /* renamed from: l */
    public static final short f16718l = 5;

    /* renamed from: l */
    public static final byte[] f16719l = {82, 73, 70, 70};

    /* renamed from: l0 */
    public static final int f16720l0 = 13;

    /* renamed from: l0 */
    public static final String f16721l0 = "ISOSpeedLatitudezzz";

    /* renamed from: l0 */
    public static final short f16722l0 = 3;

    /* renamed from: l1 */
    public static final String f16723l1 = "GPSStatus";

    /* renamed from: l2 */
    public static final String f16724l2 = "A";

    /* renamed from: m */
    public static final byte f16725m = -54;

    /* renamed from: m */
    public static final int f16726m = 2;

    /* renamed from: m */
    public static final String f16727m = "XResolution";

    /* renamed from: m */
    public static final short f16728m = 6;

    /* renamed from: m */
    public static final byte[] f16729m = {87, 69, 66, 80};

    /* renamed from: m0 */
    public static final int f16730m0 = 0;

    /* renamed from: m0 */
    public static final String f16731m0 = "ShutterSpeedValue";

    /* renamed from: m0 */
    public static final short f16732m0 = 4;

    /* renamed from: m1 */
    public static final String f16733m1 = "GPSMeasureMode";

    /* renamed from: m2 */
    public static final String f16734m2 = "V";

    /* renamed from: n */
    public static final byte f16735n = -53;

    /* renamed from: n */
    public static final int f16736n = 3;

    /* renamed from: n */
    public static final String f16737n = "YResolution";

    /* renamed from: n */
    public static final short f16738n = 7;

    /* renamed from: n */
    public static final byte[] f16739n = {69, TarConstants.LF_PAX_EXTENDED_HEADER_UC, 73, 70};

    /* renamed from: n0 */
    public static final int f16740n0 = 1;

    /* renamed from: n0 */
    public static final String f16741n0 = "ApertureValue";

    /* renamed from: n0 */
    public static final short f16742n0 = 5;

    /* renamed from: n1 */
    public static final String f16743n1 = "GPSDOP";

    /* renamed from: n2 */
    public static final String f16744n2 = "2";

    /* renamed from: o */
    public static final byte f16745o = -51;

    /* renamed from: o */
    public static final int f16746o = 4;

    /* renamed from: o */
    public static final String f16747o = "ResolutionUnit";

    /* renamed from: o */
    public static final short f16748o = 8;

    /* renamed from: o */
    public static final byte[] f16749o = {-99, 1, f16598b};

    /* renamed from: o0 */
    public static final int f16750o0 = 2;

    /* renamed from: o0 */
    public static final String f16751o0 = "BrightnessValue";

    /* renamed from: o0 */
    public static final short f16752o0 = 7;

    /* renamed from: o1 */
    public static final String f16753o1 = "GPSSpeedRef";

    /* renamed from: o2 */
    public static final String f16754o2 = "3";

    /* renamed from: p */
    public static final byte f16755p = -50;

    /* renamed from: p */
    public static final int f16756p = 5;

    /* renamed from: p */
    public static final String f16757p = "StripOffsets";

    /* renamed from: p */
    public static final short f16758p = 0;

    /* renamed from: p */
    public static final byte[] f16759p = "VP8X".getBytes(Charset.defaultCharset());

    /* renamed from: p0 */
    public static final int f16760p0 = 3;

    /* renamed from: p0 */
    public static final String f16761p0 = "ExposureBiasValue";

    /* renamed from: p0 */
    public static final short f16762p0 = 8;

    /* renamed from: p1 */
    public static final String f16763p1 = "GPSSpeed";

    /* renamed from: p2 */
    public static final String f16764p2 = "K";

    /* renamed from: q */
    public static final byte f16765q = -49;

    /* renamed from: q */
    public static final int f16766q = 6;

    /* renamed from: q */
    public static final String f16767q = "RowsPerStrip";

    /* renamed from: q */
    public static final short f16768q = 1;

    /* renamed from: q */
    public static final byte[] f16769q = "VP8L".getBytes(Charset.defaultCharset());

    /* renamed from: q0 */
    public static final int f16770q0 = 4;

    /* renamed from: q0 */
    public static final String f16771q0 = "MaxApertureValue";

    /* renamed from: q0 */
    public static final short f16772q0 = 0;

    /* renamed from: q1 */
    public static final String f16773q1 = "GPSTrackRef";

    /* renamed from: q2 */
    public static final String f16774q2 = "M";

    /* renamed from: r */
    public static final byte f16775r = -38;

    /* renamed from: r */
    public static final int f16776r = 7;

    /* renamed from: r */
    public static final String f16777r = "StripByteCounts";

    /* renamed from: r */
    public static final short f16778r = 2;

    /* renamed from: r */
    public static final byte[] f16779r = "VP8 ".getBytes(Charset.defaultCharset());

    /* renamed from: r0 */
    public static final int f16780r0 = 5;

    /* renamed from: r0 */
    public static final String f16781r0 = "SubjectDistance";

    /* renamed from: r0 */
    public static final short f16782r0 = 1;

    /* renamed from: r1 */
    public static final String f16783r1 = "GPSTrack";

    /* renamed from: r2 */
    public static final String f16784r2 = "N";

    /* renamed from: s */
    public static final byte f16785s = -31;

    /* renamed from: s */
    public static final int f16786s = 8;

    /* renamed from: s */
    public static final String f16787s = "JPEGInterchangeFormat";

    /* renamed from: s */
    public static final short f16788s = 3;

    /* renamed from: s */
    public static final byte[] f16789s = "ANIM".getBytes(Charset.defaultCharset());

    /* renamed from: s0 */
    public static final int f16790s0 = 6;

    /* renamed from: s0 */
    public static final String f16791s0 = "MeteringMode";

    /* renamed from: s0 */
    public static final short f16792s0 = 2;

    /* renamed from: s1 */
    public static final String f16793s1 = "GPSImgDirectionRef";

    /* renamed from: s2 */
    public static final String f16794s2 = "T";

    /* renamed from: t */
    public static final byte f16795t = -2;

    /* renamed from: t */
    public static final int f16796t = 1;

    /* renamed from: t */
    public static final String f16797t = "JPEGInterchangeFormatLength";

    /* renamed from: t */
    public static final short f16798t = 4;

    /* renamed from: t */
    public static final byte[] f16799t = "ANMF".getBytes(Charset.defaultCharset());

    /* renamed from: t0 */
    public static final int f16800t0 = 7;

    /* renamed from: t0 */
    public static final String f16801t0 = "LightSource";

    /* renamed from: t0 */
    public static final short f16802t0 = 3;

    /* renamed from: t1 */
    public static final String f16803t1 = "GPSImgDirection";

    /* renamed from: t2 */
    public static final String f16804t2 = "M";

    /* renamed from: u */
    public static final byte f16805u = -39;

    /* renamed from: u */
    public static final int f16806u = 65535;

    /* renamed from: u */
    public static final String f16807u = "TransferFunction";

    /* renamed from: u */
    public static final short f16808u = 5;

    /* renamed from: u */
    public static final byte[] f16809u = "XMP ".getBytes(Charset.defaultCharset());

    /* renamed from: u0 */
    public static final int f16810u0 = 8;

    /* renamed from: u0 */
    public static final String f16811u0 = "Flash";

    /* renamed from: u0 */
    public static final short f16812u0 = 1;

    /* renamed from: u1 */
    public static final String f16813u1 = "GPSMapDatum";

    /* renamed from: u2 */
    public static final String f16814u2 = "K";
    @Deprecated

    /* renamed from: v */
    public static final int f16815v = 0;

    /* renamed from: v */
    public static final String f16816v = "WhitePoint";

    /* renamed from: v */
    public static final short f16817v = 6;

    /* renamed from: v */
    public static final byte[] f16818v = {65, TarConstants.LF_GNUTYPE_SPARSE, 67, 73, 73, 0, 0, 0};

    /* renamed from: v0 */
    public static final int f16819v0 = 9;

    /* renamed from: v0 */
    public static final String f16820v0 = "SubjectArea";

    /* renamed from: v0 */
    public static final short f16821v0 = 0;

    /* renamed from: v1 */
    public static final String f16822v1 = "GPSDestLatitudeRef";

    /* renamed from: v2 */
    public static final String f16823v2 = "M";
    @Deprecated

    /* renamed from: w */
    public static final int f16824w = 1;

    /* renamed from: w */
    public static final String f16825w = "PrimaryChromaticities";

    /* renamed from: w */
    public static final short f16826w = 7;

    /* renamed from: w */
    public static final byte[] f16827w;

    /* renamed from: w0 */
    public static final int f16828w0 = 0;

    /* renamed from: w0 */
    public static final String f16829w0 = "FocalLength";

    /* renamed from: w0 */
    public static final short f16830w0 = 1;

    /* renamed from: w1 */
    public static final String f16831w1 = "GPSDestLatitude";

    /* renamed from: w2 */
    public static final String f16832w2 = "N";

    /* renamed from: x */
    public static final int f16833x = 1;

    /* renamed from: x */
    public static final String f16834x = "YCbCrCoefficients";

    /* renamed from: x */
    public static final short f16835x = 0;

    /* renamed from: x */
    public static final byte[] f16836x;

    /* renamed from: x0 */
    public static final int f16837x0 = 1;

    /* renamed from: x0 */
    public static final String f16838x0 = "FlashEnergy";

    /* renamed from: x0 */
    public static final short f16839x0 = 0;

    /* renamed from: x1 */
    public static final String f16840x1 = "GPSDestLongitudeRef";

    /* renamed from: x2 */
    public static final String f16841x2 = "FUJIFILMCCD-RAW";

    /* renamed from: y */
    public static final int f16842y = 2;

    /* renamed from: y */
    public static final String f16843y = "ReferenceBlackWhite";

    /* renamed from: y */
    public static final short f16844y = 1;

    /* renamed from: y0 */
    public static final int f16845y0 = 2;

    /* renamed from: y0 */
    public static final String f16846y0 = "SpatialFrequencyResponse";

    /* renamed from: y0 */
    public static final short f16847y0 = 1;

    /* renamed from: y1 */
    public static final String f16848y1 = "GPSDestLongitude";

    /* renamed from: y2 */
    public static final String f16849y2 = "PENTAX";

    /* renamed from: z */
    public static final int f16850z = 6;

    /* renamed from: z */
    public static final String f16851z = "DateTime";

    /* renamed from: z */
    public static final short f16852z = 2;

    /* renamed from: z0 */
    public static final int f16853z0 = 3;

    /* renamed from: z0 */
    public static final String f16854z0 = "FocalPlaneXResolution";

    /* renamed from: z0 */
    public static final short f16855z0 = 2;

    /* renamed from: z1 */
    public static final String f16856z1 = "GPSDestBearingRef";

    /* renamed from: a */
    public int f16857a;

    /* renamed from: a */
    public AssetManager.AssetInputStream f16858a;

    /* renamed from: a */
    public FileDescriptor f16859a;

    /* renamed from: a */
    public String f16860a;

    /* renamed from: a */
    public ByteOrder f16861a;

    /* renamed from: a */
    public Set<Integer> f16862a;

    /* renamed from: a */
    public boolean f16863a;

    /* renamed from: a */
    public byte[] f16864a;

    /* renamed from: a */
    public final HashMap<String, C2897d>[] f16865a;

    /* renamed from: b */
    public int f16866b;

    /* renamed from: b */
    public boolean f16867b;

    /* renamed from: c */
    public int f16868c;

    /* renamed from: c */
    public boolean f16869c;

    /* renamed from: d */
    public int f16870d;

    /* renamed from: d */
    public boolean f16871d;

    /* renamed from: e */
    public int f16872e;

    /* renamed from: e */
    public boolean f16873e;

    /* renamed from: f */
    public int f16874f;

    /* renamed from: f */
    public boolean f16875f;

    /* renamed from: g */
    public int f16876g;

    /* renamed from: g */
    public boolean f16877g;

    /* renamed from: h */
    public int f16878h;

    /* renamed from: i */
    public int f16879i;

    /* renamed from: com.onedelhi.secure.mx0$a */
    public class C2894a extends MediaDataSource {

        /* renamed from: a */
        public final /* synthetic */ C2895b f16880a;

        /* renamed from: b */
        public long f16882b;

        public C2894a(C2895b bVar) {
            this.f16880a = bVar;
        }

        public void close() throws IOException {
        }

        public long getSize() throws IOException {
            return -1;
        }

        public int readAt(long j, byte[] bArr, int i, int i2) throws IOException {
            if (i2 == 0) {
                return 0;
            }
            if (j < 0) {
                return -1;
            }
            try {
                long j2 = this.f16882b;
                if (j2 != j) {
                    if (j2 >= 0 && j >= j2 + ((long) this.f16880a.available())) {
                        return -1;
                    }
                    this.f16880a.mo20770d(j);
                    this.f16882b = j;
                }
                if (i2 > this.f16880a.available()) {
                    i2 = this.f16880a.available();
                }
                int read = this.f16880a.read(bArr, i, i2);
                if (read >= 0) {
                    this.f16882b += (long) read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f16882b = -1;
            return -1;
        }
    }

    /* renamed from: com.onedelhi.secure.mx0$b */
    public static class C2895b extends InputStream implements DataInput {

        /* renamed from: b */
        public static final ByteOrder f16883b = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: c */
        public static final ByteOrder f16884c = ByteOrder.BIG_ENDIAN;

        /* renamed from: a */
        public DataInputStream f16885a;

        /* renamed from: a */
        public ByteOrder f16886a;

        /* renamed from: n */
        public final int f16887n;

        /* renamed from: o */
        public int f16888o;

        public C2895b(InputStream inputStream) throws IOException {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        public C2895b(InputStream inputStream, ByteOrder byteOrder) throws IOException {
            this.f16886a = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f16885a = dataInputStream;
            int available = dataInputStream.available();
            this.f16887n = available;
            this.f16888o = 0;
            this.f16885a.mark(available);
            this.f16886a = byteOrder;
        }

        public C2895b(byte[] bArr) throws IOException {
            this((InputStream) new ByteArrayInputStream(bArr));
        }

        /* renamed from: a */
        public int mo20766a() {
            return this.f16887n;
        }

        public int available() throws IOException {
            return this.f16885a.available();
        }

        /* renamed from: b */
        public int mo20768b() {
            return this.f16888o;
        }

        /* renamed from: c */
        public long mo20769c() throws IOException {
            return ((long) readInt()) & ZipConstants.ZIP64_MAGIC;
        }

        /* renamed from: d */
        public void mo20770d(long j) throws IOException {
            int i = this.f16888o;
            if (((long) i) > j) {
                this.f16888o = 0;
                this.f16885a.reset();
                this.f16885a.mark(this.f16887n);
            } else {
                j -= (long) i;
            }
            int i2 = (int) j;
            if (skipBytes(i2) != i2) {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        /* renamed from: g */
        public void mo20771g(ByteOrder byteOrder) {
            this.f16886a = byteOrder;
        }

        public int read() throws IOException {
            this.f16888o++;
            return this.f16885a.read();
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            int read = this.f16885a.read(bArr, i, i2);
            this.f16888o += read;
            return read;
        }

        public boolean readBoolean() throws IOException {
            this.f16888o++;
            return this.f16885a.readBoolean();
        }

        public byte readByte() throws IOException {
            int i = this.f16888o + 1;
            this.f16888o = i;
            if (i <= this.f16887n) {
                int read = this.f16885a.read();
                if (read >= 0) {
                    return (byte) read;
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public char readChar() throws IOException {
            this.f16888o += 2;
            return this.f16885a.readChar();
        }

        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        public void readFully(byte[] bArr) throws IOException {
            int length = this.f16888o + bArr.length;
            this.f16888o = length;
            if (length > this.f16887n) {
                throw new EOFException();
            } else if (this.f16885a.read(bArr, 0, bArr.length) != bArr.length) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        public void readFully(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.f16888o + i2;
            this.f16888o = i3;
            if (i3 > this.f16887n) {
                throw new EOFException();
            } else if (this.f16885a.read(bArr, i, i2) != i2) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        public int readInt() throws IOException {
            int i = this.f16888o + 4;
            this.f16888o = i;
            if (i <= this.f16887n) {
                int read = this.f16885a.read();
                int read2 = this.f16885a.read();
                int read3 = this.f16885a.read();
                int read4 = this.f16885a.read();
                if ((read | read2 | read3 | read4) >= 0) {
                    ByteOrder byteOrder = this.f16886a;
                    if (byteOrder == f16883b) {
                        return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == f16884c) {
                        return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                    }
                    throw new IOException("Invalid byte order: " + this.f16886a);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public String readLine() throws IOException {
            Log.d(mx0.f16600b, "Currently unsupported");
            return null;
        }

        public long readLong() throws IOException {
            int i = this.f16888o + 8;
            this.f16888o = i;
            if (i <= this.f16887n) {
                int read = this.f16885a.read();
                int read2 = this.f16885a.read();
                int read3 = this.f16885a.read();
                int read4 = this.f16885a.read();
                int read5 = this.f16885a.read();
                int read6 = this.f16885a.read();
                int read7 = this.f16885a.read();
                int read8 = this.f16885a.read();
                if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                    ByteOrder byteOrder = this.f16886a;
                    if (byteOrder == f16883b) {
                        return (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8) + ((long) read);
                    }
                    int i2 = read2;
                    if (byteOrder == f16884c) {
                        return (((long) read) << 56) + (((long) i2) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8) + ((long) read8);
                    }
                    throw new IOException("Invalid byte order: " + this.f16886a);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public short readShort() throws IOException {
            int i = this.f16888o + 2;
            this.f16888o = i;
            if (i <= this.f16887n) {
                int read = this.f16885a.read();
                int read2 = this.f16885a.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f16886a;
                    if (byteOrder == f16883b) {
                        return (short) ((read2 << 8) + read);
                    }
                    if (byteOrder == f16884c) {
                        return (short) ((read << 8) + read2);
                    }
                    throw new IOException("Invalid byte order: " + this.f16886a);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public String readUTF() throws IOException {
            this.f16888o += 2;
            return this.f16885a.readUTF();
        }

        public int readUnsignedByte() throws IOException {
            this.f16888o++;
            return this.f16885a.readUnsignedByte();
        }

        public int readUnsignedShort() throws IOException {
            int i = this.f16888o + 2;
            this.f16888o = i;
            if (i <= this.f16887n) {
                int read = this.f16885a.read();
                int read2 = this.f16885a.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f16886a;
                    if (byteOrder == f16883b) {
                        return (read2 << 8) + read;
                    }
                    if (byteOrder == f16884c) {
                        return (read << 8) + read2;
                    }
                    throw new IOException("Invalid byte order: " + this.f16886a);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public int skipBytes(int i) throws IOException {
            int min = Math.min(i, this.f16887n - this.f16888o);
            int i2 = 0;
            while (i2 < min) {
                i2 += this.f16885a.skipBytes(min - i2);
            }
            this.f16888o += i2;
            return i2;
        }
    }

    /* renamed from: com.onedelhi.secure.mx0$c */
    public static class C2896c extends FilterOutputStream {

        /* renamed from: a */
        public final OutputStream f16889a;

        /* renamed from: a */
        public ByteOrder f16890a;

        public C2896c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.f16889a = outputStream;
            this.f16890a = byteOrder;
        }

        /* renamed from: a */
        public void mo20789a(ByteOrder byteOrder) {
            this.f16890a = byteOrder;
        }

        /* renamed from: b */
        public void mo20790b(int i) throws IOException {
            this.f16889a.write(i);
        }

        /* renamed from: c */
        public void mo20791c(int i) throws IOException {
            OutputStream outputStream;
            int i2;
            ByteOrder byteOrder = this.f16890a;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f16889a.write((i >>> 0) & 255);
                this.f16889a.write((i >>> 8) & 255);
                this.f16889a.write((i >>> 16) & 255);
                outputStream = this.f16889a;
                i2 = i >>> 24;
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f16889a.write((i >>> 24) & 255);
                this.f16889a.write((i >>> 16) & 255);
                this.f16889a.write((i >>> 8) & 255);
                outputStream = this.f16889a;
                i2 = i >>> 0;
            } else {
                return;
            }
            outputStream.write(i2 & 255);
        }

        /* renamed from: d */
        public void mo20792d(short s) throws IOException {
            OutputStream outputStream;
            int i;
            ByteOrder byteOrder = this.f16890a;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f16889a.write((s >>> 0) & 255);
                outputStream = this.f16889a;
                i = s >>> 8;
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f16889a.write((s >>> 8) & 255);
                outputStream = this.f16889a;
                i = s >>> 0;
            } else {
                return;
            }
            outputStream.write(i & 255);
        }

        /* renamed from: g */
        public void mo20793g(long j) throws IOException {
            mo20791c((int) j);
        }

        /* renamed from: h */
        public void mo20794h(int i) throws IOException {
            mo20792d((short) i);
        }

        public void write(byte[] bArr) throws IOException {
            this.f16889a.write(bArr);
        }

        public void write(byte[] bArr, int i, int i2) throws IOException {
            this.f16889a.write(bArr, i, i2);
        }
    }

    /* renamed from: com.onedelhi.secure.mx0$d */
    public static class C2897d {

        /* renamed from: b */
        public static final long f16891b = -1;

        /* renamed from: a */
        public final int f16892a;

        /* renamed from: a */
        public final long f16893a;

        /* renamed from: a */
        public final byte[] f16894a;

        /* renamed from: b */
        public final int f16895b;

        public C2897d(int i, int i2, long j, byte[] bArr) {
            this.f16892a = i;
            this.f16895b = i2;
            this.f16893a = j;
            this.f16894a = bArr;
        }

        public C2897d(int i, int i2, byte[] bArr) {
            this(i, i2, -1, bArr);
        }

        /* renamed from: a */
        public static C2897d m22150a(String str) {
            if (str.length() != 1 || str.charAt(0) < '0' || str.charAt(0) > '1') {
                byte[] bytes = str.getBytes(mx0.f16581a);
                return new C2897d(1, bytes.length, bytes);
            }
            return new C2897d(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
        }

        /* renamed from: b */
        public static C2897d m22151b(double d, ByteOrder byteOrder) {
            return m22152c(new double[]{d}, byteOrder);
        }

        /* renamed from: c */
        public static C2897d m22152c(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(mx0.f16632d[12] * dArr.length)]);
            wrap.order(byteOrder);
            for (double putDouble : dArr) {
                wrap.putDouble(putDouble);
            }
            return new C2897d(12, dArr.length, wrap.array());
        }

        /* renamed from: d */
        public static C2897d m22153d(int i, ByteOrder byteOrder) {
            return m22154e(new int[]{i}, byteOrder);
        }

        /* renamed from: e */
        public static C2897d m22154e(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(mx0.f16632d[9] * iArr.length)]);
            wrap.order(byteOrder);
            for (int putInt : iArr) {
                wrap.putInt(putInt);
            }
            return new C2897d(9, iArr.length, wrap.array());
        }

        /* renamed from: f */
        public static C2897d m22155f(C2901h hVar, ByteOrder byteOrder) {
            return m22156g(new C2901h[]{hVar}, byteOrder);
        }

        /* renamed from: g */
        public static C2897d m22156g(C2901h[] hVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(mx0.f16632d[10] * hVarArr.length)]);
            wrap.order(byteOrder);
            for (C2901h hVar : hVarArr) {
                wrap.putInt((int) hVar.f16900a);
                wrap.putInt((int) hVar.f16901b);
            }
            return new C2897d(10, hVarArr.length, wrap.array());
        }

        /* renamed from: h */
        public static C2897d m22157h(String str) {
            byte[] bytes = (str + 0).getBytes(mx0.f16581a);
            return new C2897d(2, bytes.length, bytes);
        }

        /* renamed from: i */
        public static C2897d m22158i(long j, ByteOrder byteOrder) {
            return m22159j(new long[]{j}, byteOrder);
        }

        /* renamed from: j */
        public static C2897d m22159j(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(mx0.f16632d[4] * jArr.length)]);
            wrap.order(byteOrder);
            for (long j : jArr) {
                wrap.putInt((int) j);
            }
            return new C2897d(4, jArr.length, wrap.array());
        }

        /* renamed from: k */
        public static C2897d m22160k(C2901h hVar, ByteOrder byteOrder) {
            return m22161l(new C2901h[]{hVar}, byteOrder);
        }

        /* renamed from: l */
        public static C2897d m22161l(C2901h[] hVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(mx0.f16632d[5] * hVarArr.length)]);
            wrap.order(byteOrder);
            for (C2901h hVar : hVarArr) {
                wrap.putInt((int) hVar.f16900a);
                wrap.putInt((int) hVar.f16901b);
            }
            return new C2897d(5, hVarArr.length, wrap.array());
        }

        /* renamed from: m */
        public static C2897d m22162m(int i, ByteOrder byteOrder) {
            return m22163n(new int[]{i}, byteOrder);
        }

        /* renamed from: n */
        public static C2897d m22163n(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(mx0.f16632d[3] * iArr.length)]);
            wrap.order(byteOrder);
            for (int i : iArr) {
                wrap.putShort((short) i);
            }
            return new C2897d(3, iArr.length, wrap.array());
        }

        /* renamed from: o */
        public double mo20797o(ByteOrder byteOrder) {
            Object r = mo20800r(byteOrder);
            if (r == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            } else if (r instanceof String) {
                return Double.parseDouble((String) r);
            } else {
                if (r instanceof long[]) {
                    long[] jArr = (long[]) r;
                    if (jArr.length == 1) {
                        return (double) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (r instanceof int[]) {
                    int[] iArr = (int[]) r;
                    if (iArr.length == 1) {
                        return (double) iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (r instanceof double[]) {
                    double[] dArr = (double[]) r;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (r instanceof C2901h[]) {
                    C2901h[] hVarArr = (C2901h[]) r;
                    if (hVarArr.length == 1) {
                        return hVarArr[0].mo20804a();
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
        }

        /* renamed from: p */
        public int mo20798p(ByteOrder byteOrder) {
            Object r = mo20800r(byteOrder);
            if (r == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            } else if (r instanceof String) {
                return Integer.parseInt((String) r);
            } else {
                if (r instanceof long[]) {
                    long[] jArr = (long[]) r;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (r instanceof int[]) {
                    int[] iArr = (int[]) r;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
        }

        /* renamed from: q */
        public String mo20799q(ByteOrder byteOrder) {
            Object r = mo20800r(byteOrder);
            if (r == null) {
                return null;
            }
            if (r instanceof String) {
                return (String) r;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            if (r instanceof long[]) {
                long[] jArr = (long[]) r;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(vf4.f36537c);
                    }
                }
                return sb.toString();
            } else if (r instanceof int[]) {
                int[] iArr = (int[]) r;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(vf4.f36537c);
                    }
                }
                return sb.toString();
            } else if (r instanceof double[]) {
                double[] dArr = (double[]) r;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(vf4.f36537c);
                    }
                }
                return sb.toString();
            } else if (!(r instanceof C2901h[])) {
                return null;
            } else {
                C2901h[] hVarArr = (C2901h[]) r;
                while (i < hVarArr.length) {
                    sb.append(hVarArr[i].f16900a);
                    sb.append('/');
                    sb.append(hVarArr[i].f16901b);
                    i++;
                    if (i != hVarArr.length) {
                        sb.append(vf4.f36537c);
                    }
                }
                return sb.toString();
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:164:0x019f A[SYNTHETIC, Splitter:B:164:0x019f] */
        /* renamed from: r */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object mo20800r(java.nio.ByteOrder r11) {
            /*
                r10 = this;
                java.lang.String r0 = "IOException occurred while closing InputStream"
                java.lang.String r1 = "ExifInterface"
                r2 = 0
                com.onedelhi.secure.mx0$b r3 = new com.onedelhi.secure.mx0$b     // Catch:{ IOException -> 0x0189, all -> 0x0187 }
                byte[] r4 = r10.f16894a     // Catch:{ IOException -> 0x0189, all -> 0x0187 }
                r3.<init>((byte[]) r4)     // Catch:{ IOException -> 0x0189, all -> 0x0187 }
                r3.mo20771g(r11)     // Catch:{ IOException -> 0x0185 }
                int r11 = r10.f16892a     // Catch:{ IOException -> 0x0185 }
                r4 = 1
                r5 = 0
                switch(r11) {
                    case 1: goto L_0x0148;
                    case 2: goto L_0x00fd;
                    case 3: goto L_0x00e3;
                    case 4: goto L_0x00c9;
                    case 5: goto L_0x00a6;
                    case 6: goto L_0x0148;
                    case 7: goto L_0x00fd;
                    case 8: goto L_0x008c;
                    case 9: goto L_0x0072;
                    case 10: goto L_0x004d;
                    case 11: goto L_0x0032;
                    case 12: goto L_0x0018;
                    default: goto L_0x0016;
                }     // Catch:{ IOException -> 0x0185 }
            L_0x0016:
                goto L_0x017c
            L_0x0018:
                int r11 = r10.f16895b     // Catch:{ IOException -> 0x0185 }
                double[] r11 = new double[r11]     // Catch:{ IOException -> 0x0185 }
            L_0x001c:
                int r4 = r10.f16895b     // Catch:{ IOException -> 0x0185 }
                if (r5 >= r4) goto L_0x0029
                double r6 = r3.readDouble()     // Catch:{ IOException -> 0x0185 }
                r11[r5] = r6     // Catch:{ IOException -> 0x0185 }
                int r5 = r5 + 1
                goto L_0x001c
            L_0x0029:
                r3.close()     // Catch:{ IOException -> 0x002d }
                goto L_0x0031
            L_0x002d:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0031:
                return r11
            L_0x0032:
                int r11 = r10.f16895b     // Catch:{ IOException -> 0x0185 }
                double[] r11 = new double[r11]     // Catch:{ IOException -> 0x0185 }
            L_0x0036:
                int r4 = r10.f16895b     // Catch:{ IOException -> 0x0185 }
                if (r5 >= r4) goto L_0x0044
                float r4 = r3.readFloat()     // Catch:{ IOException -> 0x0185 }
                double r6 = (double) r4     // Catch:{ IOException -> 0x0185 }
                r11[r5] = r6     // Catch:{ IOException -> 0x0185 }
                int r5 = r5 + 1
                goto L_0x0036
            L_0x0044:
                r3.close()     // Catch:{ IOException -> 0x0048 }
                goto L_0x004c
            L_0x0048:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x004c:
                return r11
            L_0x004d:
                int r11 = r10.f16895b     // Catch:{ IOException -> 0x0185 }
                com.onedelhi.secure.mx0$h[] r11 = new com.onedelhi.secure.mx0.C2901h[r11]     // Catch:{ IOException -> 0x0185 }
            L_0x0051:
                int r4 = r10.f16895b     // Catch:{ IOException -> 0x0185 }
                if (r5 >= r4) goto L_0x0069
                int r4 = r3.readInt()     // Catch:{ IOException -> 0x0185 }
                long r6 = (long) r4     // Catch:{ IOException -> 0x0185 }
                int r4 = r3.readInt()     // Catch:{ IOException -> 0x0185 }
                long r8 = (long) r4     // Catch:{ IOException -> 0x0185 }
                com.onedelhi.secure.mx0$h r4 = new com.onedelhi.secure.mx0$h     // Catch:{ IOException -> 0x0185 }
                r4.<init>(r6, r8)     // Catch:{ IOException -> 0x0185 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0185 }
                int r5 = r5 + 1
                goto L_0x0051
            L_0x0069:
                r3.close()     // Catch:{ IOException -> 0x006d }
                goto L_0x0071
            L_0x006d:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0071:
                return r11
            L_0x0072:
                int r11 = r10.f16895b     // Catch:{ IOException -> 0x0185 }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0185 }
            L_0x0076:
                int r4 = r10.f16895b     // Catch:{ IOException -> 0x0185 }
                if (r5 >= r4) goto L_0x0083
                int r4 = r3.readInt()     // Catch:{ IOException -> 0x0185 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0185 }
                int r5 = r5 + 1
                goto L_0x0076
            L_0x0083:
                r3.close()     // Catch:{ IOException -> 0x0087 }
                goto L_0x008b
            L_0x0087:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x008b:
                return r11
            L_0x008c:
                int r11 = r10.f16895b     // Catch:{ IOException -> 0x0185 }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0185 }
            L_0x0090:
                int r4 = r10.f16895b     // Catch:{ IOException -> 0x0185 }
                if (r5 >= r4) goto L_0x009d
                short r4 = r3.readShort()     // Catch:{ IOException -> 0x0185 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0185 }
                int r5 = r5 + 1
                goto L_0x0090
            L_0x009d:
                r3.close()     // Catch:{ IOException -> 0x00a1 }
                goto L_0x00a5
            L_0x00a1:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00a5:
                return r11
            L_0x00a6:
                int r11 = r10.f16895b     // Catch:{ IOException -> 0x0185 }
                com.onedelhi.secure.mx0$h[] r11 = new com.onedelhi.secure.mx0.C2901h[r11]     // Catch:{ IOException -> 0x0185 }
            L_0x00aa:
                int r4 = r10.f16895b     // Catch:{ IOException -> 0x0185 }
                if (r5 >= r4) goto L_0x00c0
                long r6 = r3.mo20769c()     // Catch:{ IOException -> 0x0185 }
                long r8 = r3.mo20769c()     // Catch:{ IOException -> 0x0185 }
                com.onedelhi.secure.mx0$h r4 = new com.onedelhi.secure.mx0$h     // Catch:{ IOException -> 0x0185 }
                r4.<init>(r6, r8)     // Catch:{ IOException -> 0x0185 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0185 }
                int r5 = r5 + 1
                goto L_0x00aa
            L_0x00c0:
                r3.close()     // Catch:{ IOException -> 0x00c4 }
                goto L_0x00c8
            L_0x00c4:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00c8:
                return r11
            L_0x00c9:
                int r11 = r10.f16895b     // Catch:{ IOException -> 0x0185 }
                long[] r11 = new long[r11]     // Catch:{ IOException -> 0x0185 }
            L_0x00cd:
                int r4 = r10.f16895b     // Catch:{ IOException -> 0x0185 }
                if (r5 >= r4) goto L_0x00da
                long r6 = r3.mo20769c()     // Catch:{ IOException -> 0x0185 }
                r11[r5] = r6     // Catch:{ IOException -> 0x0185 }
                int r5 = r5 + 1
                goto L_0x00cd
            L_0x00da:
                r3.close()     // Catch:{ IOException -> 0x00de }
                goto L_0x00e2
            L_0x00de:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00e2:
                return r11
            L_0x00e3:
                int r11 = r10.f16895b     // Catch:{ IOException -> 0x0185 }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0185 }
            L_0x00e7:
                int r4 = r10.f16895b     // Catch:{ IOException -> 0x0185 }
                if (r5 >= r4) goto L_0x00f4
                int r4 = r3.readUnsignedShort()     // Catch:{ IOException -> 0x0185 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0185 }
                int r5 = r5 + 1
                goto L_0x00e7
            L_0x00f4:
                r3.close()     // Catch:{ IOException -> 0x00f8 }
                goto L_0x00fc
            L_0x00f8:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00fc:
                return r11
            L_0x00fd:
                int r11 = r10.f16895b     // Catch:{ IOException -> 0x0185 }
                byte[] r6 = com.onedelhi.secure.mx0.f16818v     // Catch:{ IOException -> 0x0185 }
                int r6 = r6.length     // Catch:{ IOException -> 0x0185 }
                if (r11 < r6) goto L_0x011a
                r11 = 0
            L_0x0105:
                byte[] r6 = com.onedelhi.secure.mx0.f16818v     // Catch:{ IOException -> 0x0185 }
                int r7 = r6.length     // Catch:{ IOException -> 0x0185 }
                if (r11 >= r7) goto L_0x0117
                byte[] r7 = r10.f16894a     // Catch:{ IOException -> 0x0185 }
                byte r7 = r7[r11]     // Catch:{ IOException -> 0x0185 }
                byte r8 = r6[r11]     // Catch:{ IOException -> 0x0185 }
                if (r7 == r8) goto L_0x0114
                r4 = 0
                goto L_0x0117
            L_0x0114:
                int r11 = r11 + 1
                goto L_0x0105
            L_0x0117:
                if (r4 == 0) goto L_0x011a
                int r5 = r6.length     // Catch:{ IOException -> 0x0185 }
            L_0x011a:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0185 }
                r11.<init>()     // Catch:{ IOException -> 0x0185 }
            L_0x011f:
                int r4 = r10.f16895b     // Catch:{ IOException -> 0x0185 }
                if (r5 >= r4) goto L_0x013b
                byte[] r4 = r10.f16894a     // Catch:{ IOException -> 0x0185 }
                byte r4 = r4[r5]     // Catch:{ IOException -> 0x0185 }
                if (r4 != 0) goto L_0x012a
                goto L_0x013b
            L_0x012a:
                r6 = 32
                if (r4 < r6) goto L_0x0133
                char r4 = (char) r4     // Catch:{ IOException -> 0x0185 }
                r11.append(r4)     // Catch:{ IOException -> 0x0185 }
                goto L_0x0138
            L_0x0133:
                r4 = 63
                r11.append(r4)     // Catch:{ IOException -> 0x0185 }
            L_0x0138:
                int r5 = r5 + 1
                goto L_0x011f
            L_0x013b:
                java.lang.String r11 = r11.toString()     // Catch:{ IOException -> 0x0185 }
                r3.close()     // Catch:{ IOException -> 0x0143 }
                goto L_0x0147
            L_0x0143:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0147:
                return r11
            L_0x0148:
                byte[] r11 = r10.f16894a     // Catch:{ IOException -> 0x0185 }
                int r6 = r11.length     // Catch:{ IOException -> 0x0185 }
                if (r6 != r4) goto L_0x016c
                byte r6 = r11[r5]     // Catch:{ IOException -> 0x0185 }
                if (r6 < 0) goto L_0x016c
                byte r6 = r11[r5]     // Catch:{ IOException -> 0x0185 }
                if (r6 > r4) goto L_0x016c
                java.lang.String r6 = new java.lang.String     // Catch:{ IOException -> 0x0185 }
                char[] r4 = new char[r4]     // Catch:{ IOException -> 0x0185 }
                byte r11 = r11[r5]     // Catch:{ IOException -> 0x0185 }
                int r11 = r11 + 48
                char r11 = (char) r11     // Catch:{ IOException -> 0x0185 }
                r4[r5] = r11     // Catch:{ IOException -> 0x0185 }
                r6.<init>(r4)     // Catch:{ IOException -> 0x0185 }
                r3.close()     // Catch:{ IOException -> 0x0167 }
                goto L_0x016b
            L_0x0167:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L_0x016b:
                return r6
            L_0x016c:
                java.lang.String r4 = new java.lang.String     // Catch:{ IOException -> 0x0185 }
                java.nio.charset.Charset r5 = com.onedelhi.secure.mx0.f16581a     // Catch:{ IOException -> 0x0185 }
                r4.<init>(r11, r5)     // Catch:{ IOException -> 0x0185 }
                r3.close()     // Catch:{ IOException -> 0x0177 }
                goto L_0x017b
            L_0x0177:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L_0x017b:
                return r4
            L_0x017c:
                r3.close()     // Catch:{ IOException -> 0x0180 }
                goto L_0x0184
            L_0x0180:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L_0x0184:
                return r2
            L_0x0185:
                r11 = move-exception
                goto L_0x018b
            L_0x0187:
                r11 = move-exception
                goto L_0x019d
            L_0x0189:
                r11 = move-exception
                r3 = r2
            L_0x018b:
                java.lang.String r4 = "IOException occurred during reading a value"
                android.util.Log.w(r1, r4, r11)     // Catch:{ all -> 0x019b }
                if (r3 == 0) goto L_0x019a
                r3.close()     // Catch:{ IOException -> 0x0196 }
                goto L_0x019a
            L_0x0196:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L_0x019a:
                return r2
            L_0x019b:
                r11 = move-exception
                r2 = r3
            L_0x019d:
                if (r2 == 0) goto L_0x01a7
                r2.close()     // Catch:{ IOException -> 0x01a3 }
                goto L_0x01a7
            L_0x01a3:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x01a7:
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.mx0.C2897d.mo20800r(java.nio.ByteOrder):java.lang.Object");
        }

        /* renamed from: s */
        public int mo20801s() {
            return mx0.f16632d[this.f16892a] * this.f16895b;
        }

        public String toString() {
            return pl2.f33726c + mx0.f16590a[this.f16892a] + ", data length:" + this.f16894a.length + pl2.f33727d;
        }
    }

    @hl3({hl3.C2354a.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.onedelhi.secure.mx0$e */
    public @interface C2898e {
    }

    /* renamed from: com.onedelhi.secure.mx0$f */
    public static class C2899f {

        /* renamed from: a */
        public final int f16896a;

        /* renamed from: a */
        public final String f16897a;

        /* renamed from: b */
        public final int f16898b;

        /* renamed from: c */
        public final int f16899c;

        public C2899f(String str, int i, int i2) {
            this.f16897a = str;
            this.f16896a = i;
            this.f16898b = i2;
            this.f16899c = -1;
        }

        public C2899f(String str, int i, int i2, int i3) {
            this.f16897a = str;
            this.f16896a = i;
            this.f16898b = i2;
            this.f16899c = i3;
        }

        /* renamed from: a */
        public boolean mo20803a(int i) {
            int i2;
            int i3 = this.f16898b;
            if (i3 == 7 || i == 7 || i3 == i || (i2 = this.f16899c) == i) {
                return true;
            }
            if ((i3 == 4 || i2 == 4) && i == 3) {
                return true;
            }
            if ((i3 == 9 || i2 == 9) && i == 8) {
                return true;
            }
            return (i3 == 12 || i2 == 12) && i == 11;
        }
    }

    @hl3({hl3.C2354a.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.onedelhi.secure.mx0$g */
    public @interface C2900g {
    }

    /* renamed from: com.onedelhi.secure.mx0$h */
    public static class C2901h {

        /* renamed from: a */
        public final long f16900a;

        /* renamed from: b */
        public final long f16901b;

        public C2901h(double d) {
            this((long) (d * 10000.0d), 10000);
        }

        public C2901h(long j, long j2) {
            if (j2 == 0) {
                this.f16900a = 0;
                this.f16901b = 1;
                return;
            }
            this.f16900a = j;
            this.f16901b = j2;
        }

        /* renamed from: a */
        public double mo20804a() {
            return ((double) this.f16900a) / ((double) this.f16901b);
        }

        public String toString() {
            return this.f16900a + "/" + this.f16901b;
        }
    }

    static {
        C2899f[] fVarArr = {new C2899f(f16578Z1, wg1.f22108h, 4), new C2899f(f16597a2, 255, 4), new C2899f(f16616c, 256, 3, 4), new C2899f(f16629d, 257, 3, 4), new C2899f(f16641e, BZip2Constants.MAX_ALPHA_SIZE, 3), new C2899f(f16652f, 259, 3), new C2899f(f16663g, 262, 3), new C2899f(f16413A, C3527sn.f20441p, 2), new C2899f(f16420B, 271, 2), new C2899f(f16427C, u02.f35863B, 2), new C2899f(f16757p, 273, 3, 4), new C2899f(f16674h, hh0.f13094k, 3), new C2899f(f16685i, 277, 3), new C2899f(f16767q, 278, 3, 4), new C2899f(f16777r, 279, 3, 4), new C2899f(f16727m, 282, 5), new C2899f(f16737n, 283, 5), new C2899f(f16696j, 284, 3), new C2899f(f16747o, 296, 3), new C2899f(f16807u, 301, 3), new C2899f(f16434D, 305, 2), new C2899f(f16851z, 306, 2), new C2899f(f16441E, 315, 2), new C2899f(f16816v, ak4.C1708a.f9151r, 5), new C2899f(f16825w, 319, 5), new C2899f(f16650e2, 330, 4), new C2899f(f16787s, br1.f9936j, 4), new C2899f(f16797t, 514, 4), new C2899f(f16834x, 529, 5), new C2899f(f16707k, 530, 3), new C2899f(f16717l, 531, 3), new C2899f(f16843y, 532, 5), new C2899f(f16448F, 33432, 2), new C2899f(f16613b2, 34665, 4), new C2899f(f16627c2, 34853, 4), new C2899f(f16554V1, 4, 4), new C2899f(f16542T1, 5, 4), new C2899f(f16536S1, 6, 4), new C2899f(f16548U1, 7, 4), new C2899f(f16560W1, 23, 3), new C2899f(f16566X1, 46, 7), new C2899f(f16572Y1, 700, 1)};
        f16589a = fVarArr;
        C2899f[] fVarArr2 = {new C2899f(f16574Z, 33434, 5), new C2899f(f16593a0, 33437, 5), new C2899f(f16609b0, 34850, 3), new C2899f(f16623c0, 34852, 2), new C2899f(f16646e0, 34855, 3), new C2899f(f16657f0, 34856, 7), new C2899f(f16668g0, 34864, 3), new C2899f(f16680h0, 34865, 4), new C2899f(f16690i0, 34866, 4), new C2899f(f16701j0, 34867, 4), new C2899f(f16711k0, 34868, 4), new C2899f(f16721l0, 34869, 4), new C2899f(f16455G, CpioConstants.C_ISNWK, 2), new C2899f(f16526R, 36867, 2), new C2899f(f16532S, 36868, 2), new C2899f(f16538T, 36880, 2), new C2899f(f16544U, 36881, 2), new C2899f(f16550V, 36882, 2), new C2899f(f16496M, 37121, 7), new C2899f(f16502N, 37122, 5), new C2899f(f16731m0, 37377, 10), new C2899f(f16741n0, 37378, 5), new C2899f(f16751o0, 37379, 10), new C2899f(f16761p0, 37380, 10), new C2899f(f16771q0, 37381, 5), new C2899f(f16781r0, 37382, 5), new C2899f(f16791s0, 37383, 3), new C2899f(f16801t0, 37384, 3), new C2899f(f16811u0, 37385, 3), new C2899f(f16829w0, 37386, 5), new C2899f(f16820v0, 37396, 3), new C2899f(f16508O, 37500, 7), new C2899f(f16514P, 37510, 7), new C2899f(f16556W, 37520, 2), new C2899f(f16562X, 37521, 2), new C2899f(f16568Y, 37522, 2), new C2899f(f16462H, 40960, 7), new C2899f(f16469I, 40961, 3), new C2899f(f16483K, 40962, 3, 4), new C2899f(f16490L, 40963, 3, 4), new C2899f(f16520Q, 40964, 2), new C2899f(f16639d2, 40965, 4), new C2899f(f16838x0, 41483, 5), new C2899f(f16846y0, 41484, 7), new C2899f(f16854z0, 41486, 5), new C2899f(f16416A0, 41487, 5), new C2899f(f16423B0, 41488, 3), new C2899f(f16430C0, 41492, 3), new C2899f(f16437D0, 41493, 5), new C2899f(f16444E0, 41495, 3), new C2899f(f16451F0, 41728, 7), new C2899f(f16458G0, 41729, 7), new C2899f(f16465H0, 41730, 7), new C2899f(f16472I0, 41985, 3), new C2899f(f16479J0, 41986, 3), new C2899f(f16486K0, 41987, 3), new C2899f(f16492L0, 41988, 5), new C2899f(f16498M0, 41989, 3), new C2899f(f16504N0, 41990, 3), new C2899f(f16510O0, 41991, 3), new C2899f(f16516P0, 41992, 3), new C2899f(f16522Q0, 41993, 3), new C2899f(f16528R0, 41994, 3), new C2899f(f16534S0, 41995, 7), new C2899f(f16540T0, 41996, 3), new C2899f(f16546U0, 42016, 2), new C2899f("CameraOwnerName", 42032, 2), new C2899f(f16564X0, 42033, 2), new C2899f(f16570Y0, 42034, 5), new C2899f(f16576Z0, 42035, 2), new C2899f(f16595a1, 42036, 2), new C2899f(f16476J, 42240, 5), new C2899f(f16500M1, 50706, 1), new C2899f(f16506N1, 50720, 3, 4)};
        f16606b = fVarArr2;
        C2899f[] fVarArr3 = {new C2899f(f16625c1, 0, 1), new C2899f(f16637d1, 1, 2), new C2899f(f16648e1, 2, 5), new C2899f(f16659f1, 3, 2), new C2899f(f16670g1, 4, 5), new C2899f(f16682h1, 5, 1), new C2899f(f16692i1, 6, 5), new C2899f(f16703j1, 7, 5), new C2899f(f16713k1, 8, 2), new C2899f(f16723l1, 9, 2), new C2899f(f16733m1, 10, 2), new C2899f(f16743n1, 11, 5), new C2899f(f16753o1, 12, 2), new C2899f(f16763p1, 13, 5), new C2899f(f16773q1, 14, 2), new C2899f(f16783r1, 15, 5), new C2899f(f16793s1, 16, 2), new C2899f(f16803t1, 17, 5), new C2899f(f16813u1, 18, 2), new C2899f(f16822v1, 19, 2), new C2899f(f16831w1, 20, 5), new C2899f(f16840x1, 21, 2), new C2899f(f16848y1, 22, 5), new C2899f(f16856z1, 23, 2), new C2899f(f16418A1, 24, 5), new C2899f(f16425B1, 25, 2), new C2899f(f16432C1, 26, 5), new C2899f(f16439D1, 27, 7), new C2899f(f16446E1, 28, 7), new C2899f(f16453F1, 29, 2), new C2899f(f16460G1, 30, 3), new C2899f(f16467H1, 31, 5)};
        f16620c = fVarArr3;
        C2899f[] fVarArr4 = {new C2899f(f16474I1, 1, 2)};
        f16633d = fVarArr4;
        C2899f[] fVarArr5 = {new C2899f(f16578Z1, wg1.f22108h, 4), new C2899f(f16597a2, 255, 4), new C2899f(f16488K1, 256, 3, 4), new C2899f(f16481J1, 257, 3, 4), new C2899f(f16641e, BZip2Constants.MAX_ALPHA_SIZE, 3), new C2899f(f16652f, 259, 3), new C2899f(f16663g, 262, 3), new C2899f(f16413A, C3527sn.f20441p, 2), new C2899f(f16420B, 271, 2), new C2899f(f16427C, u02.f35863B, 2), new C2899f(f16757p, 273, 3, 4), new C2899f(f16494L1, hh0.f13094k, 3), new C2899f(f16685i, 277, 3), new C2899f(f16767q, 278, 3, 4), new C2899f(f16777r, 279, 3, 4), new C2899f(f16727m, 282, 5), new C2899f(f16737n, 283, 5), new C2899f(f16696j, 284, 3), new C2899f(f16747o, 296, 3), new C2899f(f16807u, 301, 3), new C2899f(f16434D, 305, 2), new C2899f(f16851z, 306, 2), new C2899f(f16441E, 315, 2), new C2899f(f16816v, ak4.C1708a.f9151r, 5), new C2899f(f16825w, 319, 5), new C2899f(f16650e2, 330, 4), new C2899f(f16787s, br1.f9936j, 4), new C2899f(f16797t, 514, 4), new C2899f(f16834x, 529, 5), new C2899f(f16707k, 530, 3), new C2899f(f16717l, 531, 3), new C2899f(f16843y, 532, 5), new C2899f(f16448F, 33432, 2), new C2899f(f16613b2, 34665, 4), new C2899f(f16627c2, 34853, 4), new C2899f(f16500M1, 50706, 1), new C2899f(f16506N1, 50720, 3, 4)};
        f16644e = fVarArr5;
        C2899f[] fVarArr6 = {new C2899f(f16512O1, 256, 7), new C2899f(f16661f2, 8224, 4), new C2899f(f16672g2, 8256, 4)};
        f16655f = fVarArr6;
        C2899f[] fVarArr7 = {new C2899f(f16518P1, 257, 4), new C2899f(f16524Q1, BZip2Constants.MAX_ALPHA_SIZE, 4)};
        f16666g = fVarArr7;
        C2899f[] fVarArr8 = {new C2899f(f16530R1, 4371, 3)};
        f16678h = fVarArr8;
        C2899f[] fVarArr9 = {new C2899f(f16469I, 55, 3)};
        f16688i = fVarArr9;
        C2899f[][] fVarArr10 = {fVarArr, fVarArr2, fVarArr3, fVarArr4, fVarArr5, fVarArr, fVarArr6, fVarArr7, fVarArr8, fVarArr9};
        f16591a = fVarArr10;
        f16607b = new HashMap[fVarArr10.length];
        f16621c = new HashMap[fVarArr10.length];
        Charset forName = Charset.forName(CharsetNames.US_ASCII);
        f16581a = forName;
        f16827w = hh0.f13085b.getBytes(forName);
        f16836x = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        f16582a = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            C2899f[][] fVarArr11 = f16591a;
            if (i < fVarArr11.length) {
                f16607b[i] = new HashMap<>();
                f16621c[i] = new HashMap<>();
                for (C2899f fVar : fVarArr11[i]) {
                    f16607b[i].put(Integer.valueOf(fVar.f16896a), fVar);
                    f16621c[i].put(fVar.f16897a, fVar);
                }
                i++;
            } else {
                HashMap<Integer, Integer> hashMap = f16583a;
                C2899f[] fVarArr12 = f16699j;
                hashMap.put(Integer.valueOf(fVarArr12[0].f16896a), 5);
                hashMap.put(Integer.valueOf(fVarArr12[1].f16896a), 1);
                hashMap.put(Integer.valueOf(fVarArr12[2].f16896a), 2);
                hashMap.put(Integer.valueOf(fVarArr12[3].f16896a), 3);
                hashMap.put(Integer.valueOf(fVarArr12[4].f16896a), 7);
                hashMap.put(Integer.valueOf(fVarArr12[5].f16896a), 8);
                return;
            }
        }
    }

    public mx0(@mr2 File file) throws IOException {
        C2899f[][] fVarArr = f16591a;
        this.f16865a = new HashMap[fVarArr.length];
        this.f16862a = new HashSet(fVarArr.length);
        this.f16861a = ByteOrder.BIG_ENDIAN;
        Objects.requireNonNull(file, "file cannot be null");
        mo20717U(file.getAbsolutePath());
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0056  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public mx0(@com.onedelhi.secure.mr2 java.io.FileDescriptor r5) throws java.io.IOException {
        /*
            r4 = this;
            r4.<init>()
            com.onedelhi.secure.mx0$f[][] r0 = f16591a
            int r1 = r0.length
            java.util.HashMap[] r1 = new java.util.HashMap[r1]
            r4.f16865a = r1
            java.util.HashSet r1 = new java.util.HashSet
            int r0 = r0.length
            r1.<init>(r0)
            r4.f16862a = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r4.f16861a = r0
            java.lang.String r0 = "fileDescriptor cannot be null"
            java.util.Objects.requireNonNull(r5, r0)
            r0 = 0
            r4.f16858a = r0
            r4.f16860a = r0
            r1 = 0
            boolean r2 = m22058d0(r5)
            if (r2 == 0) goto L_0x0038
            r4.f16859a = r5
            java.io.FileDescriptor r5 = android.system.Os.dup(r5)     // Catch:{ Exception -> 0x002f }
            r1 = 1
            goto L_0x003a
        L_0x002f:
            r5 = move-exception
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Failed to duplicate file descriptor"
            r0.<init>(r1, r5)
            throw r0
        L_0x0038:
            r4.f16859a = r0
        L_0x003a:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x004d }
            r2.<init>(r5)     // Catch:{ all -> 0x004d }
            r4.mo20733k0(r2)     // Catch:{ all -> 0x004b }
            m22057d(r2)
            if (r1 == 0) goto L_0x004a
            m22056c(r5)
        L_0x004a:
            return
        L_0x004b:
            r0 = move-exception
            goto L_0x0051
        L_0x004d:
            r2 = move-exception
            r3 = r2
            r2 = r0
            r0 = r3
        L_0x0051:
            m22057d(r2)
            if (r1 == 0) goto L_0x0059
            m22056c(r5)
        L_0x0059:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.mx0.<init>(java.io.FileDescriptor):void");
    }

    public mx0(@mr2 InputStream inputStream) throws IOException {
        this(inputStream, false);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public mx0(@mr2 InputStream inputStream, int i) throws IOException {
        this(inputStream, i != 1 ? false : true);
    }

    public mx0(@mr2 InputStream inputStream, boolean z) throws IOException {
        C2899f[][] fVarArr = f16591a;
        this.f16865a = new HashMap[fVarArr.length];
        this.f16862a = new HashSet(fVarArr.length);
        this.f16861a = ByteOrder.BIG_ENDIAN;
        Objects.requireNonNull(inputStream, "inputStream cannot be null");
        this.f16860a = null;
        if (z) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, f16495M);
            if (!m22053V(bufferedInputStream)) {
                Log.w(f16600b, "Given data does not follow the structure of an Exif-only data.");
                return;
            }
            this.f16863a = true;
            this.f16858a = null;
            this.f16859a = null;
            inputStream = bufferedInputStream;
        } else {
            if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f16858a = (AssetManager.AssetInputStream) inputStream;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    if (m22058d0(fileInputStream.getFD())) {
                        this.f16858a = null;
                        this.f16859a = fileInputStream.getFD();
                    }
                }
                this.f16858a = null;
            }
            this.f16859a = null;
        }
        mo20733k0(inputStream);
    }

    public mx0(@mr2 String str) throws IOException {
        C2899f[][] fVarArr = f16591a;
        this.f16865a = new HashMap[fVarArr.length];
        this.f16862a = new HashSet(fVarArr.length);
        this.f16861a = ByteOrder.BIG_ENDIAN;
        Objects.requireNonNull(str, "filename cannot be null");
        mo20717U(str);
    }

    /* renamed from: F0 */
    public static boolean m22051F0(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr2.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:68|69|70) */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        java.lang.Double.parseDouble(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x015c, code lost:
        return new android.util.Pair<>(12, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0162, code lost:
        return new android.util.Pair<>(2, -1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:68:0x014e */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> m22052P(java.lang.String r12) {
        /*
            java.lang.String r0 = ","
            boolean r1 = r12.contains(r0)
            r2 = 0
            r3 = 1
            r4 = 2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r6 = -1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            if (r1 == 0) goto L_0x00a6
            java.lang.String[] r12 = r12.split(r0, r6)
            r0 = r12[r2]
            android.util.Pair r0 = m22052P(r0)
            java.lang.Object r1 = r0.first
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 != r4) goto L_0x0029
            return r0
        L_0x0029:
            int r1 = r12.length
            if (r3 >= r1) goto L_0x00a5
            r1 = r12[r3]
            android.util.Pair r1 = m22052P(r1)
            java.lang.Object r2 = r1.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r4 = r0.first
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x004d
            java.lang.Object r2 = r1.second
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r4 = r0.first
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            r2 = -1
            goto L_0x0055
        L_0x004d:
            java.lang.Object r2 = r0.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
        L_0x0055:
            java.lang.Object r4 = r0.second
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r4 == r6) goto L_0x0080
            java.lang.Object r4 = r1.first
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r8 = r0.second
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L_0x0077
            java.lang.Object r1 = r1.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r4 = r0.second
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0080
        L_0x0077:
            java.lang.Object r1 = r0.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            goto L_0x0081
        L_0x0080:
            r1 = -1
        L_0x0081:
            if (r2 != r6) goto L_0x008b
            if (r1 != r6) goto L_0x008b
            android.util.Pair r12 = new android.util.Pair
            r12.<init>(r5, r7)
            return r12
        L_0x008b:
            if (r2 != r6) goto L_0x0097
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.<init>(r1, r7)
            goto L_0x00a2
        L_0x0097:
            if (r1 != r6) goto L_0x00a2
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.<init>(r1, r7)
        L_0x00a2:
            int r3 = r3 + 1
            goto L_0x0029
        L_0x00a5:
            return r0
        L_0x00a6:
            java.lang.String r0 = "/"
            boolean r1 = r12.contains(r0)
            r8 = 0
            if (r1 == 0) goto L_0x0105
            java.lang.String[] r12 = r12.split(r0, r6)
            int r0 = r12.length
            if (r0 != r4) goto L_0x00ff
            r0 = r12[r2]     // Catch:{ NumberFormatException -> 0x00ff }
            double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x00ff }
            long r0 = (long) r0     // Catch:{ NumberFormatException -> 0x00ff }
            r12 = r12[r3]     // Catch:{ NumberFormatException -> 0x00ff }
            double r2 = java.lang.Double.parseDouble(r12)     // Catch:{ NumberFormatException -> 0x00ff }
            long r2 = (long) r2     // Catch:{ NumberFormatException -> 0x00ff }
            r12 = 10
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 < 0) goto L_0x00f5
            int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x00d0
            goto L_0x00f5
        L_0x00d0:
            r4 = 5
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r6 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r6 > 0) goto L_0x00eb
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x00dd
            goto L_0x00eb
        L_0x00dd:
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x00ff }
            r0.<init>(r12, r1)     // Catch:{ NumberFormatException -> 0x00ff }
            return r0
        L_0x00eb:
            android.util.Pair r12 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x00ff }
            r12.<init>(r0, r7)     // Catch:{ NumberFormatException -> 0x00ff }
            return r12
        L_0x00f5:
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ NumberFormatException -> 0x00ff }
            r0.<init>(r12, r7)     // Catch:{ NumberFormatException -> 0x00ff }
            return r0
        L_0x00ff:
            android.util.Pair r12 = new android.util.Pair
            r12.<init>(r5, r7)
            return r12
        L_0x0105:
            long r0 = java.lang.Long.parseLong(r12)     // Catch:{ NumberFormatException -> 0x014e }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ NumberFormatException -> 0x014e }
            long r1 = r0.longValue()     // Catch:{ NumberFormatException -> 0x014e }
            r3 = 4
            int r4 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r4 < 0) goto L_0x0130
            long r1 = r0.longValue()     // Catch:{ NumberFormatException -> 0x014e }
            r10 = 65535(0xffff, double:3.23786E-319)
            int r4 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r4 > 0) goto L_0x0130
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x014e }
            r1 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x014e }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch:{ NumberFormatException -> 0x014e }
            r0.<init>(r1, r2)     // Catch:{ NumberFormatException -> 0x014e }
            return r0
        L_0x0130:
            long r0 = r0.longValue()     // Catch:{ NumberFormatException -> 0x014e }
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x0144
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x014e }
            r1 = 9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x014e }
            r0.<init>(r1, r7)     // Catch:{ NumberFormatException -> 0x014e }
            return r0
        L_0x0144:
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x014e }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch:{ NumberFormatException -> 0x014e }
            r0.<init>(r1, r7)     // Catch:{ NumberFormatException -> 0x014e }
            return r0
        L_0x014e:
            java.lang.Double.parseDouble(r12)     // Catch:{ NumberFormatException -> 0x015d }
            android.util.Pair r12 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x015d }
            r0 = 12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x015d }
            r12.<init>(r0, r7)     // Catch:{ NumberFormatException -> 0x015d }
            return r12
        L_0x015d:
            android.util.Pair r12 = new android.util.Pair
            r12.<init>(r5, r7)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.mx0.m22052P(java.lang.String):android.util.Pair");
    }

    /* renamed from: V */
    public static boolean m22053V(BufferedInputStream bufferedInputStream) throws IOException {
        byte[] bArr = f16827w;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i = 0;
        while (true) {
            byte[] bArr3 = f16827w;
            if (i >= bArr3.length) {
                return true;
            }
            if (bArr2[i] != bArr3[i]) {
                return false;
            }
            i++;
        }
    }

    /* renamed from: Y */
    public static boolean m22054Y(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = f16604b;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    /* renamed from: b */
    public static String m22055b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            sb.append(String.format("%02x", new Object[]{Byte.valueOf(bArr[i])}));
        }
        return sb.toString();
    }

    /* renamed from: c */
    public static void m22056c(FileDescriptor fileDescriptor) {
        try {
            Os.close(fileDescriptor);
        } catch (Exception unused) {
            Log.e(f16600b, "Error closing fd.");
        }
    }

    /* renamed from: d */
    public static void m22057d(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: d0 */
    public static boolean m22058d0(FileDescriptor fileDescriptor) {
        try {
            Os.lseek(fileDescriptor, 0, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (!f16676h) {
                return false;
            }
            Log.d(f16600b, "The file descriptor for the given input is not seekable");
            return false;
        }
    }

    /* renamed from: f */
    public static double m22059f(String str, String str2) {
        try {
            String[] split = str.split(vf4.f36537c, -1);
            String[] split2 = split[0].split("/", -1);
            String[] split3 = split[1].split("/", -1);
            String[] split4 = split[2].split("/", -1);
            double parseDouble = (Double.parseDouble(split2[0].trim()) / Double.parseDouble(split2[1].trim())) + ((Double.parseDouble(split3[0].trim()) / Double.parseDouble(split3[1].trim())) / 60.0d) + ((Double.parseDouble(split4[0].trim()) / Double.parseDouble(split4[1].trim())) / 3600.0d);
            if (!str2.equals(f16693i2)) {
                if (!str2.equals(f16714k2)) {
                    if (!str2.equals("N")) {
                        if (!str2.equals(f16704j2)) {
                            throw new IllegalArgumentException();
                        }
                    }
                    return parseDouble;
                }
            }
            return -parseDouble;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: g */
    public static long[] m22060g(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                jArr[i] = (long) iArr[i];
            }
            return jArr;
        } else if (obj instanceof long[]) {
            return (long[]) obj;
        } else {
            return null;
        }
    }

    /* renamed from: g0 */
    public static boolean m22061g0(@mr2 String str) {
        Objects.requireNonNull(str, "mimeType shouldn't be null");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.hashCode();
        char c = 65535;
        switch (lowerCase.hashCode()) {
            case -1875291391:
                if (lowerCase.equals("image/x-fuji-raf")) {
                    c = 0;
                    break;
                }
                break;
            case -1635437028:
                if (lowerCase.equals("image/x-samsung-srw")) {
                    c = 1;
                    break;
                }
                break;
            case -1594371159:
                if (lowerCase.equals("image/x-sony-arw")) {
                    c = 2;
                    break;
                }
                break;
            case -1487464693:
                if (lowerCase.equals("image/heic")) {
                    c = 3;
                    break;
                }
                break;
            case -1487464690:
                if (lowerCase.equals("image/heif")) {
                    c = 4;
                    break;
                }
                break;
            case -1487394660:
                if (lowerCase.equals("image/jpeg")) {
                    c = 5;
                    break;
                }
                break;
            case -1487018032:
                if (lowerCase.equals("image/webp")) {
                    c = 6;
                    break;
                }
                break;
            case -1423313290:
                if (lowerCase.equals("image/x-adobe-dng")) {
                    c = 7;
                    break;
                }
                break;
            case -985160897:
                if (lowerCase.equals("image/x-panasonic-rw2")) {
                    c = 8;
                    break;
                }
                break;
            case -879258763:
                if (lowerCase.equals("image/png")) {
                    c = 9;
                    break;
                }
                break;
            case -332763809:
                if (lowerCase.equals("image/x-pentax-pef")) {
                    c = 10;
                    break;
                }
                break;
            case 1378106698:
                if (lowerCase.equals("image/x-olympus-orf")) {
                    c = 11;
                    break;
                }
                break;
            case 2099152104:
                if (lowerCase.equals("image/x-nikon-nef")) {
                    c = 12;
                    break;
                }
                break;
            case 2099152524:
                if (lowerCase.equals("image/x-nikon-nrw")) {
                    c = 13;
                    break;
                }
                break;
            case 2111234748:
                if (lowerCase.equals("image/x-canon-cr2")) {
                    c = 14;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: h */
    public static int m22062h(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        int i = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return i;
            }
            i += read;
            outputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: i */
    public static void m22063i(InputStream inputStream, OutputStream outputStream, int i) throws IOException {
        byte[] bArr = new byte[8192];
        while (i > 0) {
            int min = Math.min(i, 8192);
            int read = inputStream.read(bArr, 0, min);
            if (read == min) {
                i -= read;
                outputStream.write(bArr, 0, read);
            } else {
                throw new IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
        }
    }

    /* renamed from: l0 */
    public static long m22064l0(@ts2 String str, @ts2 String str2) {
        if (str != null && f16586a.matcher(str).matches()) {
            try {
                Date parse = f16582a.parse(str, new ParsePosition(0));
                if (parse == null) {
                    return -1;
                }
                long time = parse.getTime();
                if (str2 == null) {
                    return time;
                }
                try {
                    long parseLong = Long.parseLong(str2);
                    while (parseLong > 1000) {
                        parseLong /= 10;
                    }
                    return time + parseLong;
                } catch (NumberFormatException unused) {
                    return time;
                }
            } catch (IllegalArgumentException unused2) {
            }
        }
        return -1;
    }

    @Deprecated
    /* renamed from: A */
    public boolean mo20689A(float[] fArr) {
        double[] B = mo20691B();
        if (B == null) {
            return false;
        }
        fArr[0] = (float) B[0];
        fArr[1] = (float) B[1];
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:81:0x024d, code lost:
        r3.put(r1, r4);
        r4 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02ef, code lost:
        r3.put(r1, r4);
     */
    /* renamed from: A0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo20690A0(@com.onedelhi.secure.mr2 java.lang.String r18, @com.onedelhi.secure.ts2 java.lang.String r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.String r3 = "tag shouldn't be null"
            java.util.Objects.requireNonNull(r1, r3)
            java.lang.String r3 = "ISOSpeedRatings"
            boolean r3 = r3.equals(r1)
            java.lang.String r4 = "ExifInterface"
            if (r3 == 0) goto L_0x0020
            boolean r1 = f16676h
            if (r1 == 0) goto L_0x001e
            java.lang.String r1 = "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY."
            android.util.Log.d(r4, r1)
        L_0x001e:
            java.lang.String r1 = "PhotographicSensitivity"
        L_0x0020:
            r3 = 2
            r5 = 1
            if (r2 == 0) goto L_0x00aa
            java.util.HashSet<java.lang.String> r6 = f16584a
            boolean r6 = r6.contains(r1)
            if (r6 == 0) goto L_0x00aa
            java.lang.String r6 = "GPSTimeStamp"
            boolean r6 = r1.equals(r6)
            java.lang.String r7 = " : "
            java.lang.String r8 = "Invalid value for "
            if (r6 == 0) goto L_0x0096
            java.util.regex.Pattern r6 = f16602b
            java.util.regex.Matcher r6 = r6.matcher(r2)
            boolean r9 = r6.find()
            if (r9 != 0) goto L_0x005d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
        L_0x0049:
            r3.append(r8)
            r3.append(r1)
            r3.append(r7)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            android.util.Log.w(r4, r1)
            return
        L_0x005d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = r6.group(r5)
            int r7 = java.lang.Integer.parseInt(r7)
            r2.append(r7)
            java.lang.String r7 = "/1,"
            r2.append(r7)
            java.lang.String r8 = r6.group(r3)
            int r8 = java.lang.Integer.parseInt(r8)
            r2.append(r8)
            r2.append(r7)
            r7 = 3
            java.lang.String r6 = r6.group(r7)
            int r6 = java.lang.Integer.parseInt(r6)
            r2.append(r6)
            java.lang.String r6 = "/1"
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            goto L_0x00aa
        L_0x0096:
            double r9 = java.lang.Double.parseDouble(r19)     // Catch:{ NumberFormatException -> 0x00a4 }
            com.onedelhi.secure.mx0$h r6 = new com.onedelhi.secure.mx0$h     // Catch:{ NumberFormatException -> 0x00a4 }
            r6.<init>(r9)     // Catch:{ NumberFormatException -> 0x00a4 }
            java.lang.String r2 = r6.toString()     // Catch:{ NumberFormatException -> 0x00a4 }
            goto L_0x00aa
        L_0x00a4:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            goto L_0x0049
        L_0x00aa:
            r6 = 0
            r7 = 0
        L_0x00ac:
            com.onedelhi.secure.mx0$f[][] r8 = f16591a
            int r8 = r8.length
            if (r7 >= r8) goto L_0x02fd
            r8 = 4
            if (r7 != r8) goto L_0x00ba
            boolean r8 = r0.f16867b
            if (r8 != 0) goto L_0x00ba
            goto L_0x02f5
        L_0x00ba:
            java.util.HashMap<java.lang.String, com.onedelhi.secure.mx0$f>[] r8 = f16621c
            r8 = r8[r7]
            java.lang.Object r8 = r8.get(r1)
            com.onedelhi.secure.mx0$f r8 = (com.onedelhi.secure.mx0.C2899f) r8
            if (r8 == 0) goto L_0x02f5
            if (r2 != 0) goto L_0x00d1
            java.util.HashMap<java.lang.String, com.onedelhi.secure.mx0$d>[] r8 = r0.f16865a
            r8 = r8[r7]
            r8.remove(r1)
            goto L_0x02f5
        L_0x00d1:
            android.util.Pair r9 = m22052P(r2)
            int r10 = r8.f16898b
            java.lang.Object r11 = r9.first
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r12 = -1
            if (r10 == r11) goto L_0x01a1
            int r10 = r8.f16898b
            java.lang.Object r11 = r9.second
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            if (r10 != r11) goto L_0x00f0
            goto L_0x01a1
        L_0x00f0:
            int r10 = r8.f16899c
            if (r10 == r12) goto L_0x010e
            java.lang.Object r11 = r9.first
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            if (r10 == r11) goto L_0x010a
            int r10 = r8.f16899c
            java.lang.Object r11 = r9.second
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            if (r10 != r11) goto L_0x010e
        L_0x010a:
            int r8 = r8.f16899c
            goto L_0x01a3
        L_0x010e:
            int r10 = r8.f16898b
            if (r10 == r5) goto L_0x019f
            r11 = 7
            if (r10 == r11) goto L_0x019f
            if (r10 != r3) goto L_0x0119
            goto L_0x019f
        L_0x0119:
            boolean r10 = f16676h
            if (r10 == 0) goto L_0x02f5
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Given tag ("
            r10.append(r11)
            r10.append(r1)
            java.lang.String r11 = ") value didn't match with one of expected formats: "
            r10.append(r11)
            java.lang.String[] r11 = f16590a
            int r13 = r8.f16898b
            r13 = r11[r13]
            r10.append(r13)
            int r13 = r8.f16899c
            java.lang.String r14 = ""
            java.lang.String r15 = ", "
            if (r13 != r12) goto L_0x0142
            r8 = r14
            goto L_0x0155
        L_0x0142:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r15)
            int r8 = r8.f16899c
            r8 = r11[r8]
            r13.append(r8)
            java.lang.String r8 = r13.toString()
        L_0x0155:
            r10.append(r8)
            java.lang.String r8 = " (guess: "
            r10.append(r8)
            java.lang.Object r8 = r9.first
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r8 = r11[r8]
            r10.append(r8)
            java.lang.Object r8 = r9.second
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            if (r8 != r12) goto L_0x0175
            goto L_0x018e
        L_0x0175:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r15)
            java.lang.Object r9 = r9.second
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r9 = r11[r9]
            r8.append(r9)
            java.lang.String r14 = r8.toString()
        L_0x018e:
            r10.append(r14)
            java.lang.String r8 = ")"
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            android.util.Log.d(r4, r8)
            goto L_0x02f5
        L_0x019f:
            r8 = r10
            goto L_0x01a3
        L_0x01a1:
            int r8 = r8.f16898b
        L_0x01a3:
            java.lang.String r9 = "/"
            java.lang.String r10 = ","
            switch(r8) {
                case 1: goto L_0x02e4;
                case 2: goto L_0x02d8;
                case 3: goto L_0x02b3;
                case 4: goto L_0x028e;
                case 5: goto L_0x0254;
                case 6: goto L_0x01aa;
                case 7: goto L_0x02d8;
                case 8: goto L_0x01aa;
                case 9: goto L_0x022b;
                case 10: goto L_0x01ee;
                case 11: goto L_0x01aa;
                case 12: goto L_0x01c9;
                default: goto L_0x01aa;
            }
        L_0x01aa:
            r16 = r4
            r15 = 1
            boolean r3 = f16676h
            if (r3 == 0) goto L_0x02f2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Data format isn't one of expected formats: "
            r3.append(r4)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            r4 = r16
            android.util.Log.d(r4, r3)
            goto L_0x02f6
        L_0x01c9:
            java.lang.String[] r8 = r2.split(r10, r12)
            int r9 = r8.length
            double[] r9 = new double[r9]
            r10 = 0
        L_0x01d1:
            int r11 = r8.length
            if (r10 >= r11) goto L_0x01df
            r11 = r8[r10]
            double r11 = java.lang.Double.parseDouble(r11)
            r9[r10] = r11
            int r10 = r10 + 1
            goto L_0x01d1
        L_0x01df:
            java.util.HashMap<java.lang.String, com.onedelhi.secure.mx0$d>[] r8 = r0.f16865a
            r8 = r8[r7]
            java.nio.ByteOrder r10 = r0.f16861a
            com.onedelhi.secure.mx0$d r9 = com.onedelhi.secure.mx0.C2897d.m22152c(r9, r10)
            r8.put(r1, r9)
            goto L_0x02f5
        L_0x01ee:
            java.lang.String[] r8 = r2.split(r10, r12)
            int r10 = r8.length
            com.onedelhi.secure.mx0$h[] r10 = new com.onedelhi.secure.mx0.C2901h[r10]
            r11 = 0
        L_0x01f6:
            int r13 = r8.length
            if (r11 >= r13) goto L_0x021e
            r13 = r8[r11]
            java.lang.String[] r13 = r13.split(r9, r12)
            com.onedelhi.secure.mx0$h r14 = new com.onedelhi.secure.mx0$h
            r15 = r13[r6]
            r16 = r4
            double r3 = java.lang.Double.parseDouble(r15)
            long r3 = (long) r3
            r13 = r13[r5]
            double r5 = java.lang.Double.parseDouble(r13)
            long r5 = (long) r5
            r14.<init>(r3, r5)
            r10[r11] = r14
            int r11 = r11 + 1
            r4 = r16
            r3 = 2
            r5 = 1
            r6 = 0
            goto L_0x01f6
        L_0x021e:
            r16 = r4
            java.util.HashMap<java.lang.String, com.onedelhi.secure.mx0$d>[] r3 = r0.f16865a
            r3 = r3[r7]
            java.nio.ByteOrder r4 = r0.f16861a
            com.onedelhi.secure.mx0$d r4 = com.onedelhi.secure.mx0.C2897d.m22156g(r10, r4)
            goto L_0x024d
        L_0x022b:
            r16 = r4
            java.lang.String[] r3 = r2.split(r10, r12)
            int r4 = r3.length
            int[] r4 = new int[r4]
            r5 = 0
        L_0x0235:
            int r6 = r3.length
            if (r5 >= r6) goto L_0x0243
            r6 = r3[r5]
            int r6 = java.lang.Integer.parseInt(r6)
            r4[r5] = r6
            int r5 = r5 + 1
            goto L_0x0235
        L_0x0243:
            java.util.HashMap<java.lang.String, com.onedelhi.secure.mx0$d>[] r3 = r0.f16865a
            r3 = r3[r7]
            java.nio.ByteOrder r5 = r0.f16861a
            com.onedelhi.secure.mx0$d r4 = com.onedelhi.secure.mx0.C2897d.m22154e(r4, r5)
        L_0x024d:
            r3.put(r1, r4)
            r4 = r16
            goto L_0x02f5
        L_0x0254:
            r16 = r4
            java.lang.String[] r3 = r2.split(r10, r12)
            int r4 = r3.length
            com.onedelhi.secure.mx0$h[] r4 = new com.onedelhi.secure.mx0.C2901h[r4]
            r5 = 0
        L_0x025e:
            int r6 = r3.length
            if (r5 >= r6) goto L_0x0282
            r6 = r3[r5]
            java.lang.String[] r6 = r6.split(r9, r12)
            com.onedelhi.secure.mx0$h r8 = new com.onedelhi.secure.mx0$h
            r11 = 0
            r10 = r6[r11]
            double r13 = java.lang.Double.parseDouble(r10)
            long r13 = (long) r13
            r15 = 1
            r6 = r6[r15]
            double r11 = java.lang.Double.parseDouble(r6)
            long r10 = (long) r11
            r8.<init>(r13, r10)
            r4[r5] = r8
            int r5 = r5 + 1
            r12 = -1
            goto L_0x025e
        L_0x0282:
            r15 = 1
            java.util.HashMap<java.lang.String, com.onedelhi.secure.mx0$d>[] r3 = r0.f16865a
            r3 = r3[r7]
            java.nio.ByteOrder r5 = r0.f16861a
            com.onedelhi.secure.mx0$d r4 = com.onedelhi.secure.mx0.C2897d.m22161l(r4, r5)
            goto L_0x02ef
        L_0x028e:
            r16 = r4
            r3 = -1
            r15 = 1
            java.lang.String[] r3 = r2.split(r10, r3)
            int r4 = r3.length
            long[] r4 = new long[r4]
            r5 = 0
        L_0x029a:
            int r6 = r3.length
            if (r5 >= r6) goto L_0x02a8
            r6 = r3[r5]
            long r8 = java.lang.Long.parseLong(r6)
            r4[r5] = r8
            int r5 = r5 + 1
            goto L_0x029a
        L_0x02a8:
            java.util.HashMap<java.lang.String, com.onedelhi.secure.mx0$d>[] r3 = r0.f16865a
            r3 = r3[r7]
            java.nio.ByteOrder r5 = r0.f16861a
            com.onedelhi.secure.mx0$d r4 = com.onedelhi.secure.mx0.C2897d.m22159j(r4, r5)
            goto L_0x02ef
        L_0x02b3:
            r16 = r4
            r3 = -1
            r15 = 1
            java.lang.String[] r3 = r2.split(r10, r3)
            int r4 = r3.length
            int[] r4 = new int[r4]
            r5 = 0
        L_0x02bf:
            int r6 = r3.length
            if (r5 >= r6) goto L_0x02cd
            r6 = r3[r5]
            int r6 = java.lang.Integer.parseInt(r6)
            r4[r5] = r6
            int r5 = r5 + 1
            goto L_0x02bf
        L_0x02cd:
            java.util.HashMap<java.lang.String, com.onedelhi.secure.mx0$d>[] r3 = r0.f16865a
            r3 = r3[r7]
            java.nio.ByteOrder r5 = r0.f16861a
            com.onedelhi.secure.mx0$d r4 = com.onedelhi.secure.mx0.C2897d.m22163n(r4, r5)
            goto L_0x02ef
        L_0x02d8:
            r16 = r4
            r15 = 1
            java.util.HashMap<java.lang.String, com.onedelhi.secure.mx0$d>[] r3 = r0.f16865a
            r3 = r3[r7]
            com.onedelhi.secure.mx0$d r4 = com.onedelhi.secure.mx0.C2897d.m22157h(r2)
            goto L_0x02ef
        L_0x02e4:
            r16 = r4
            r15 = 1
            java.util.HashMap<java.lang.String, com.onedelhi.secure.mx0$d>[] r3 = r0.f16865a
            r3 = r3[r7]
            com.onedelhi.secure.mx0$d r4 = com.onedelhi.secure.mx0.C2897d.m22150a(r2)
        L_0x02ef:
            r3.put(r1, r4)
        L_0x02f2:
            r4 = r16
            goto L_0x02f6
        L_0x02f5:
            r15 = 1
        L_0x02f6:
            int r7 = r7 + 1
            r3 = 2
            r5 = 1
            r6 = 0
            goto L_0x00ac
        L_0x02fd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.mx0.mo20690A0(java.lang.String, java.lang.String):void");
    }

    @ts2
    /* renamed from: B */
    public double[] mo20691B() {
        String o = mo20739o(f16648e1);
        String o2 = mo20739o(f16637d1);
        String o3 = mo20739o(f16670g1);
        String o4 = mo20739o(f16659f1);
        if (o == null || o2 == null || o3 == null || o4 == null) {
            return null;
        }
        try {
            return new double[]{m22059f(o, o2), m22059f(o3, o4)};
        } catch (IllegalArgumentException unused) {
            Log.w(f16600b, "Latitude/longitude values are not parsable. " + String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", new Object[]{o, o2, o3, o4}));
            return null;
        }
    }

    @hl3({hl3.C2354a.LIBRARY})
    /* renamed from: B0 */
    public void mo20692B0(long j) {
        mo20690A0(f16851z, f16582a.format(new Date(j)));
        mo20690A0(f16556W, Long.toString(j % 1000));
    }

    /* renamed from: C */
    public final int mo20693C(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(f16495M);
        byte[] bArr = new byte[f16495M];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (m22054Y(bArr)) {
            return 4;
        }
        if (mo20723b0(bArr)) {
            return 9;
        }
        if (mo20719X(bArr)) {
            return 12;
        }
        if (mo20720Z(bArr)) {
            return 7;
        }
        if (mo20724c0(bArr)) {
            return 10;
        }
        if (mo20722a0(bArr)) {
            return 13;
        }
        return mo20731j0(bArr) ? 14 : 0;
    }

    /* renamed from: C0 */
    public void mo20694C0(Location location) {
        if (location != null) {
            mo20690A0(f16439D1, location.getProvider());
            mo20696D0(location.getLatitude(), location.getLongitude());
            mo20762z0(location.getAltitude());
            mo20690A0(f16753o1, "K");
            mo20690A0(f16763p1, new C2901h((double) ((location.getSpeed() * ((float) TimeUnit.HOURS.toSeconds(1))) / 1000.0f)).toString());
            String[] split = f16582a.format(new Date(location.getTime())).split("\\s+", -1);
            mo20690A0(f16453F1, split[0]);
            mo20690A0(f16703j1, split[1]);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo20695D(com.onedelhi.secure.mx0.C2895b r7) throws java.io.IOException {
        /*
            r6 = this;
            r6.mo20700G(r7)
            java.util.HashMap<java.lang.String, com.onedelhi.secure.mx0$d>[] r7 = r6.f16865a
            r0 = 1
            r7 = r7[r0]
            java.lang.String r1 = "MakerNote"
            java.lang.Object r7 = r7.get(r1)
            com.onedelhi.secure.mx0$d r7 = (com.onedelhi.secure.mx0.C2897d) r7
            if (r7 == 0) goto L_0x00f5
            com.onedelhi.secure.mx0$b r1 = new com.onedelhi.secure.mx0$b
            byte[] r7 = r7.f16894a
            r1.<init>((byte[]) r7)
            java.nio.ByteOrder r7 = r6.f16861a
            r1.mo20771g(r7)
            byte[] r7 = f16654f
            int r2 = r7.length
            byte[] r2 = new byte[r2]
            r1.readFully(r2)
            r3 = 0
            r1.mo20770d(r3)
            byte[] r3 = f16665g
            int r4 = r3.length
            byte[] r4 = new byte[r4]
            r1.readFully(r4)
            boolean r7 = java.util.Arrays.equals(r2, r7)
            if (r7 == 0) goto L_0x003f
            r2 = 8
        L_0x003b:
            r1.mo20770d(r2)
            goto L_0x0048
        L_0x003f:
            boolean r7 = java.util.Arrays.equals(r4, r3)
            if (r7 == 0) goto L_0x0048
            r2 = 12
            goto L_0x003b
        L_0x0048:
            r7 = 6
            r6.mo20744q0(r1, r7)
            java.util.HashMap<java.lang.String, com.onedelhi.secure.mx0$d>[] r7 = r6.f16865a
            r1 = 7
            r7 = r7[r1]
            java.lang.String r2 = "PreviewImageStart"
            java.lang.Object r7 = r7.get(r2)
            com.onedelhi.secure.mx0$d r7 = (com.onedelhi.secure.mx0.C2897d) r7
            java.util.HashMap<java.lang.String, com.onedelhi.secure.mx0$d>[] r2 = r6.f16865a
            r1 = r2[r1]
            java.lang.String r2 = "PreviewImageLength"
            java.lang.Object r1 = r1.get(r2)
            com.onedelhi.secure.mx0$d r1 = (com.onedelhi.secure.mx0.C2897d) r1
            if (r7 == 0) goto L_0x007c
            if (r1 == 0) goto L_0x007c
            java.util.HashMap<java.lang.String, com.onedelhi.secure.mx0$d>[] r2 = r6.f16865a
            r3 = 5
            r2 = r2[r3]
            java.lang.String r4 = "JPEGInterchangeFormat"
            r2.put(r4, r7)
            java.util.HashMap<java.lang.String, com.onedelhi.secure.mx0$d>[] r7 = r6.f16865a
            r7 = r7[r3]
            java.lang.String r2 = "JPEGInterchangeFormatLength"
            r7.put(r2, r1)
        L_0x007c:
            java.util.HashMap<java.lang.String, com.onedelhi.secure.mx0$d>[] r7 = r6.f16865a
            r1 = 8
            r7 = r7[r1]
            java.lang.String r1 = "AspectFrame"
            java.lang.Object r7 = r7.get(r1)
            com.onedelhi.secure.mx0$d r7 = (com.onedelhi.secure.mx0.C2897d) r7
            if (r7 == 0) goto L_0x00f5
            java.nio.ByteOrder r1 = r6.f16861a
            java.lang.Object r7 = r7.mo20800r(r1)
            int[] r7 = (int[]) r7
            if (r7 == 0) goto L_0x00db
            int r1 = r7.length
            r2 = 4
            if (r1 == r2) goto L_0x009b
            goto L_0x00db
        L_0x009b:
            r1 = 2
            r2 = r7[r1]
            r3 = 0
            r4 = r7[r3]
            if (r2 <= r4) goto L_0x00f5
            r2 = 3
            r4 = r7[r2]
            r5 = r7[r0]
            if (r4 <= r5) goto L_0x00f5
            r1 = r7[r1]
            r4 = r7[r3]
            int r1 = r1 - r4
            int r1 = r1 + r0
            r2 = r7[r2]
            r7 = r7[r0]
            int r2 = r2 - r7
            int r2 = r2 + r0
            if (r1 >= r2) goto L_0x00bc
            int r1 = r1 + r2
            int r2 = r1 - r2
            int r1 = r1 - r2
        L_0x00bc:
            java.nio.ByteOrder r7 = r6.f16861a
            com.onedelhi.secure.mx0$d r7 = com.onedelhi.secure.mx0.C2897d.m22162m(r1, r7)
            java.nio.ByteOrder r0 = r6.f16861a
            com.onedelhi.secure.mx0$d r0 = com.onedelhi.secure.mx0.C2897d.m22162m(r2, r0)
            java.util.HashMap<java.lang.String, com.onedelhi.secure.mx0$d>[] r1 = r6.f16865a
            r1 = r1[r3]
            java.lang.String r2 = "ImageWidth"
            r1.put(r2, r7)
            java.util.HashMap<java.lang.String, com.onedelhi.secure.mx0$d>[] r7 = r6.f16865a
            r7 = r7[r3]
            java.lang.String r1 = "ImageLength"
            r7.put(r1, r0)
            goto L_0x00f5
        L_0x00db:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid aspect frame values. frame="
            r0.append(r1)
            java.lang.String r7 = java.util.Arrays.toString(r7)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = "ExifInterface"
            android.util.Log.w(r0, r7)
        L_0x00f5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.mx0.mo20695D(com.onedelhi.secure.mx0$b):void");
    }

    /* renamed from: D0 */
    public void mo20696D0(double d, double d2) {
        if (d < -90.0d || d > 90.0d || Double.isNaN(d)) {
            throw new IllegalArgumentException("Latitude value " + d + " is not valid.");
        } else if (d2 < -180.0d || d2 > 180.0d || Double.isNaN(d2)) {
            throw new IllegalArgumentException("Longitude value " + d2 + " is not valid.");
        } else {
            mo20690A0(f16637d1, d >= 0.0d ? "N" : f16693i2);
            mo20690A0(f16648e1, mo20725e(Math.abs(d)));
            mo20690A0(f16659f1, d2 >= 0.0d ? f16704j2 : f16714k2);
            mo20690A0(f16670g1, mo20725e(Math.abs(d2)));
        }
    }

    /* renamed from: E */
    public final void mo20697E(C2895b bVar) throws IOException {
        if (f16676h) {
            Log.d(f16600b, "getPngAttributes starting with: " + bVar);
        }
        bVar.mo20771g(ByteOrder.BIG_ENDIAN);
        byte[] bArr = f16677h;
        bVar.skipBytes(bArr.length);
        int length = bArr.length + 0;
        while (true) {
            try {
                int readInt = bVar.readInt();
                int i = length + 4;
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int i2 = i + 4;
                    if (i2 == 16) {
                        if (!Arrays.equals(bArr2, f16698j)) {
                            throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                        }
                    }
                    if (!Arrays.equals(bArr2, f16709k)) {
                        if (Arrays.equals(bArr2, f16687i)) {
                            byte[] bArr3 = new byte[readInt];
                            if (bVar.read(bArr3) == readInt) {
                                int readInt2 = bVar.readInt();
                                CRC32 crc32 = new CRC32();
                                crc32.update(bArr2);
                                crc32.update(bArr3);
                                if (((int) crc32.getValue()) == readInt2) {
                                    this.f16872e = i2;
                                    mo20742p0(bArr3, 0);
                                    mo20705I0();
                                    return;
                                }
                                throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                            }
                            throw new IOException("Failed to read given length for given PNG chunk type: " + m22055b(bArr2));
                        }
                        int i3 = readInt + 4;
                        bVar.skipBytes(i3);
                        length = i2 + i3;
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    /* renamed from: E0 */
    public final void mo20698E0(C2895b bVar) throws IOException {
        HashMap<String, C2897d> hashMap = this.f16865a[4];
        C2897d dVar = hashMap.get(f16652f);
        if (dVar != null) {
            int p = dVar.mo20798p(this.f16861a);
            this.f16870d = p;
            if (p != 1) {
                if (p != 6) {
                    if (p != 7) {
                        return;
                    }
                }
            }
            if (mo20726e0(hashMap)) {
                mo20714R(bVar, hashMap);
                return;
            }
            return;
        }
        this.f16870d = 6;
        mo20713Q(bVar, hashMap);
    }

    /* renamed from: F */
    public final void mo20699F(C2895b bVar) throws IOException {
        bVar.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        bVar.read(bArr);
        bVar.skipBytes(4);
        bVar.read(bArr2);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        mo20761z(bVar, i, 5);
        bVar.mo20770d((long) i2);
        bVar.mo20771g(ByteOrder.BIG_ENDIAN);
        int readInt = bVar.readInt();
        if (f16676h) {
            Log.d(f16600b, "numberOfDirectoryEntry: " + readInt);
        }
        for (int i3 = 0; i3 < readInt; i3++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == f16580a.f16896a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                C2897d m = C2897d.m22162m(readShort, this.f16861a);
                C2897d m2 = C2897d.m22162m(readShort2, this.f16861a);
                this.f16865a[0].put(f16629d, m);
                this.f16865a[0].put(f16616c, m2);
                if (f16676h) {
                    Log.d(f16600b, "Updated to length: " + readShort + ", width: " + readShort2);
                    return;
                }
                return;
            }
            bVar.skipBytes(readUnsignedShort2);
        }
    }

    /* renamed from: G */
    public final void mo20700G(C2895b bVar) throws IOException {
        C2897d dVar;
        mo20736m0(bVar, bVar.available());
        mo20744q0(bVar, 0);
        mo20703H0(bVar, 0);
        mo20703H0(bVar, 5);
        mo20703H0(bVar, 4);
        mo20705I0();
        if (this.f16857a == 8 && (dVar = this.f16865a[1].get(f16508O)) != null) {
            C2895b bVar2 = new C2895b(dVar.f16894a);
            bVar2.mo20771g(this.f16861a);
            bVar2.mo20770d(6);
            mo20744q0(bVar2, 9);
            C2897d dVar2 = this.f16865a[9].get(f16469I);
            if (dVar2 != null) {
                this.f16865a[1].put(f16469I, dVar2);
            }
        }
    }

    /* renamed from: G0 */
    public final void mo20701G0(int i, int i2) throws IOException {
        String str;
        if (!this.f16865a[i].isEmpty() && !this.f16865a[i2].isEmpty()) {
            C2897d dVar = this.f16865a[i].get(f16629d);
            C2897d dVar2 = this.f16865a[i].get(f16616c);
            C2897d dVar3 = this.f16865a[i2].get(f16629d);
            C2897d dVar4 = this.f16865a[i2].get(f16616c);
            if (dVar == null || dVar2 == null) {
                if (f16676h) {
                    str = "First image does not contain valid size information";
                } else {
                    return;
                }
            } else if (dVar3 != null && dVar4 != null) {
                int p = dVar.mo20798p(this.f16861a);
                int p2 = dVar2.mo20798p(this.f16861a);
                int p3 = dVar3.mo20798p(this.f16861a);
                int p4 = dVar4.mo20798p(this.f16861a);
                if (p < p3 && p2 < p4) {
                    HashMap<String, C2897d>[] hashMapArr = this.f16865a;
                    HashMap<String, C2897d> hashMap = hashMapArr[i];
                    hashMapArr[i] = hashMapArr[i2];
                    hashMapArr[i2] = hashMap;
                    return;
                }
                return;
            } else if (f16676h) {
                str = "Second image does not contain valid size information";
            } else {
                return;
            }
            Log.d(f16600b, str);
        } else if (f16676h) {
            Log.d(f16600b, "Cannot perform swap since only one image data exists");
        }
    }

    /* renamed from: H */
    public int mo20702H() {
        switch (mo20745r(f16674h, 1)) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return C3527sn.f20441p;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    /* renamed from: H0 */
    public final void mo20703H0(C2895b bVar, int i) throws IOException {
        C2897d dVar;
        C2897d dVar2;
        StringBuilder sb;
        String arrays;
        C2897d dVar3 = this.f16865a[i].get(f16506N1);
        C2897d dVar4 = this.f16865a[i].get(f16554V1);
        C2897d dVar5 = this.f16865a[i].get(f16542T1);
        C2897d dVar6 = this.f16865a[i].get(f16536S1);
        C2897d dVar7 = this.f16865a[i].get(f16548U1);
        if (dVar3 != null) {
            if (dVar3.f16892a == 5) {
                C2901h[] hVarArr = (C2901h[]) dVar3.mo20800r(this.f16861a);
                if (hVarArr == null || hVarArr.length != 2) {
                    sb = new StringBuilder();
                    sb.append("Invalid crop size values. cropSize=");
                    arrays = Arrays.toString(hVarArr);
                } else {
                    dVar2 = C2897d.m22160k(hVarArr[0], this.f16861a);
                    dVar = C2897d.m22160k(hVarArr[1], this.f16861a);
                    this.f16865a[i].put(f16616c, dVar2);
                    this.f16865a[i].put(f16629d, dVar);
                    return;
                }
            } else {
                int[] iArr = (int[]) dVar3.mo20800r(this.f16861a);
                if (iArr == null || iArr.length != 2) {
                    sb = new StringBuilder();
                    sb.append("Invalid crop size values. cropSize=");
                    arrays = Arrays.toString(iArr);
                } else {
                    dVar2 = C2897d.m22162m(iArr[0], this.f16861a);
                    dVar = C2897d.m22162m(iArr[1], this.f16861a);
                    this.f16865a[i].put(f16616c, dVar2);
                    this.f16865a[i].put(f16629d, dVar);
                    return;
                }
            }
            sb.append(arrays);
            Log.w(f16600b, sb.toString());
        } else if (dVar4 == null || dVar5 == null || dVar6 == null || dVar7 == null) {
            mo20750t0(bVar, i);
        } else {
            int p = dVar4.mo20798p(this.f16861a);
            int p2 = dVar6.mo20798p(this.f16861a);
            int p3 = dVar7.mo20798p(this.f16861a);
            int p4 = dVar5.mo20798p(this.f16861a);
            if (p2 > p && p3 > p4) {
                C2897d m = C2897d.m22162m(p2 - p, this.f16861a);
                C2897d m2 = C2897d.m22162m(p3 - p4, this.f16861a);
                this.f16865a[i].put(f16629d, m);
                this.f16865a[i].put(f16616c, m2);
            }
        }
    }

    /* renamed from: I */
    public final void mo20704I(C2895b bVar) throws IOException {
        mo20700G(bVar);
        if (this.f16865a[0].get(f16566X1) != null) {
            mo20761z(bVar, this.f16879i, 5);
        }
        C2897d dVar = this.f16865a[0].get(f16560W1);
        C2897d dVar2 = this.f16865a[1].get(f16646e0);
        if (dVar != null && dVar2 == null) {
            this.f16865a[1].put(f16646e0, dVar);
        }
    }

    /* renamed from: I0 */
    public final void mo20705I0() throws IOException {
        mo20701G0(0, 5);
        mo20701G0(0, 4);
        mo20701G0(5, 4);
        C2897d dVar = this.f16865a[1].get(f16483K);
        C2897d dVar2 = this.f16865a[1].get(f16490L);
        if (!(dVar == null || dVar2 == null)) {
            this.f16865a[0].put(f16616c, dVar);
            this.f16865a[0].put(f16629d, dVar2);
        }
        if (this.f16865a[4].isEmpty() && mo20728h0(this.f16865a[5])) {
            HashMap<String, C2897d>[] hashMapArr = this.f16865a;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (!mo20728h0(this.f16865a[4])) {
            Log.d(f16600b, "No image meets the size requirements of a thumbnail image.");
        }
    }

    /* renamed from: J */
    public final void mo20706J(C2895b bVar) throws IOException {
        byte[] bArr = f16827w;
        bVar.skipBytes(bArr.length);
        byte[] bArr2 = new byte[bVar.available()];
        bVar.readFully(bArr2);
        this.f16872e = bArr.length;
        mo20742p0(bArr2, 0);
    }

    /* renamed from: J0 */
    public final int mo20707J0(C2896c cVar) throws IOException {
        C2896c cVar2 = cVar;
        C2899f[][] fVarArr = f16591a;
        int[] iArr = new int[fVarArr.length];
        int[] iArr2 = new int[fVarArr.length];
        for (C2899f fVar : f16699j) {
            mo20746r0(fVar.f16897a);
        }
        mo20746r0(f16599b.f16897a);
        mo20746r0(f16615c.f16897a);
        for (int i = 0; i < f16591a.length; i++) {
            for (Object obj : this.f16865a[i].entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() == null) {
                    this.f16865a[i].remove(entry.getKey());
                }
            }
        }
        if (!this.f16865a[1].isEmpty()) {
            this.f16865a[0].put(f16699j[1].f16897a, C2897d.m22158i(0, this.f16861a));
        }
        if (!this.f16865a[2].isEmpty()) {
            this.f16865a[0].put(f16699j[2].f16897a, C2897d.m22158i(0, this.f16861a));
        }
        if (!this.f16865a[3].isEmpty()) {
            this.f16865a[1].put(f16699j[3].f16897a, C2897d.m22158i(0, this.f16861a));
        }
        if (this.f16867b) {
            this.f16865a[4].put(f16599b.f16897a, C2897d.m22158i(0, this.f16861a));
            this.f16865a[4].put(f16615c.f16897a, C2897d.m22158i((long) this.f16868c, this.f16861a));
        }
        for (int i2 = 0; i2 < f16591a.length; i2++) {
            int i3 = 0;
            for (Map.Entry<String, C2897d> value : this.f16865a[i2].entrySet()) {
                int s = ((C2897d) value.getValue()).mo20801s();
                if (s > 4) {
                    i3 += s;
                }
            }
            iArr2[i2] = iArr2[i2] + i3;
        }
        int i4 = 8;
        for (int i5 = 0; i5 < f16591a.length; i5++) {
            if (!this.f16865a[i5].isEmpty()) {
                iArr[i5] = i4;
                i4 += (this.f16865a[i5].size() * 12) + 2 + 4 + iArr2[i5];
            }
        }
        if (this.f16867b) {
            this.f16865a[4].put(f16599b.f16897a, C2897d.m22158i((long) i4, this.f16861a));
            this.f16866b = this.f16872e + i4;
            i4 += this.f16868c;
        }
        if (this.f16857a == 4) {
            i4 += 8;
        }
        if (f16676h) {
            for (int i6 = 0; i6 < f16591a.length; i6++) {
                Log.d(f16600b, String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", new Object[]{Integer.valueOf(i6), Integer.valueOf(iArr[i6]), Integer.valueOf(this.f16865a[i6].size()), Integer.valueOf(iArr2[i6]), Integer.valueOf(i4)}));
            }
        }
        if (!this.f16865a[1].isEmpty()) {
            this.f16865a[0].put(f16699j[1].f16897a, C2897d.m22158i((long) iArr[1], this.f16861a));
        }
        if (!this.f16865a[2].isEmpty()) {
            this.f16865a[0].put(f16699j[2].f16897a, C2897d.m22158i((long) iArr[2], this.f16861a));
        }
        if (!this.f16865a[3].isEmpty()) {
            this.f16865a[1].put(f16699j[3].f16897a, C2897d.m22158i((long) iArr[3], this.f16861a));
        }
        int i7 = this.f16857a;
        if (i7 == 4) {
            cVar2.mo20794h(i4);
            cVar2.write(f16827w);
        } else if (i7 == 13) {
            cVar2.mo20791c(i4);
            cVar2.write(f16687i);
        } else if (i7 == 14) {
            cVar2.write(f16739n);
            cVar2.mo20791c(i4);
        }
        cVar2.mo20792d(this.f16861a == ByteOrder.BIG_ENDIAN ? f16671g1 : f16660f1);
        cVar2.mo20789a(this.f16861a);
        cVar2.mo20794h(42);
        cVar2.mo20793g(8);
        for (int i8 = 0; i8 < f16591a.length; i8++) {
            if (!this.f16865a[i8].isEmpty()) {
                cVar2.mo20794h(this.f16865a[i8].size());
                int size = iArr[i8] + 2 + (this.f16865a[i8].size() * 12) + 4;
                for (Map.Entry next : this.f16865a[i8].entrySet()) {
                    int i9 = f16621c[i8].get(next.getKey()).f16896a;
                    C2897d dVar = (C2897d) next.getValue();
                    int s2 = dVar.mo20801s();
                    cVar2.mo20794h(i9);
                    cVar2.mo20794h(dVar.f16892a);
                    cVar2.mo20791c(dVar.f16895b);
                    if (s2 > 4) {
                        cVar2.mo20793g((long) size);
                        size += s2;
                    } else {
                        cVar2.write(dVar.f16894a);
                        if (s2 < 4) {
                            while (s2 < 4) {
                                cVar2.mo20790b(0);
                                s2++;
                            }
                        }
                    }
                }
                if (i8 != 0 || this.f16865a[4].isEmpty()) {
                    cVar2.mo20793g(0);
                } else {
                    cVar2.mo20793g((long) iArr[4]);
                }
                for (Map.Entry<String, C2897d> value2 : this.f16865a[i8].entrySet()) {
                    byte[] bArr = ((C2897d) value2.getValue()).f16894a;
                    if (bArr.length > 4) {
                        cVar2.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.f16867b) {
            cVar2.write(mo20710M());
        }
        if (this.f16857a == 14 && i4 % 2 == 1) {
            cVar2.mo20790b(0);
        }
        cVar2.mo20789a(ByteOrder.BIG_ENDIAN);
        return i4;
    }

    @ts2
    /* renamed from: K */
    public byte[] mo20708K() {
        int i = this.f16870d;
        if (i == 6 || i == 7) {
            return mo20710M();
        }
        return null;
    }

    @ts2
    /* renamed from: L */
    public Bitmap mo20709L() {
        if (!this.f16867b) {
            return null;
        }
        if (this.f16864a == null) {
            this.f16864a = mo20710M();
        }
        int i = this.f16870d;
        if (i == 6 || i == 7) {
            return BitmapFactory.decodeByteArray(this.f16864a, 0, this.f16868c);
        }
        if (i == 1) {
            int length = this.f16864a.length / 3;
            int[] iArr = new int[length];
            for (int i2 = 0; i2 < length; i2++) {
                byte[] bArr = this.f16864a;
                int i3 = i2 * 3;
                iArr[i2] = (bArr[i3] << 16) + 0 + (bArr[i3 + 1] << 8) + bArr[i3 + 2];
            }
            C2897d dVar = this.f16865a[4].get(f16629d);
            C2897d dVar2 = this.f16865a[4].get(f16616c);
            if (!(dVar == null || dVar2 == null)) {
                return Bitmap.createBitmap(iArr, dVar2.mo20798p(this.f16861a), dVar.mo20798p(this.f16861a), Bitmap.Config.ARGB_8888);
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x005e A[SYNTHETIC, Splitter:B:38:0x005e] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0093 A[Catch:{ Exception -> 0x0091 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00b5  */
    @com.onedelhi.secure.ts2
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] mo20710M() {
        /*
            r11 = this;
            java.lang.String r0 = "ExifInterface"
            boolean r1 = r11.f16867b
            r2 = 0
            if (r1 != 0) goto L_0x0008
            return r2
        L_0x0008:
            byte[] r1 = r11.f16864a
            if (r1 == 0) goto L_0x000d
            return r1
        L_0x000d:
            android.content.res.AssetManager$AssetInputStream r1 = r11.f16858a     // Catch:{ Exception -> 0x009c, all -> 0x0099 }
            if (r1 == 0) goto L_0x002e
            boolean r3 = r1.markSupported()     // Catch:{ Exception -> 0x0029, all -> 0x0025 }
            if (r3 == 0) goto L_0x001c
            r1.reset()     // Catch:{ Exception -> 0x0029, all -> 0x0025 }
        L_0x001a:
            r3 = r2
            goto L_0x005c
        L_0x001c:
            java.lang.String r3 = "Cannot read thumbnail from inputstream without mark/reset support"
            android.util.Log.d(r0, r3)     // Catch:{ Exception -> 0x0029, all -> 0x0025 }
            m22057d(r1)
            return r2
        L_0x0025:
            r0 = move-exception
            r3 = r2
            goto L_0x00af
        L_0x0029:
            r3 = move-exception
            r4 = r3
            r3 = r2
            goto L_0x00a0
        L_0x002e:
            java.lang.String r1 = r11.f16860a     // Catch:{ Exception -> 0x009c, all -> 0x0099 }
            if (r1 == 0) goto L_0x003a
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x009c, all -> 0x0099 }
            java.lang.String r3 = r11.f16860a     // Catch:{ Exception -> 0x009c, all -> 0x0099 }
            r1.<init>(r3)     // Catch:{ Exception -> 0x009c, all -> 0x0099 }
            goto L_0x001a
        L_0x003a:
            java.io.FileDescriptor r1 = r11.f16859a     // Catch:{ Exception -> 0x009c, all -> 0x0099 }
            if (r1 == 0) goto L_0x005a
            java.io.FileDescriptor r1 = android.system.Os.dup(r1)     // Catch:{ Exception -> 0x009c, all -> 0x0099 }
            r3 = 0
            int r5 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x0055, all -> 0x0052 }
            android.system.Os.lseek(r1, r3, r5)     // Catch:{ Exception -> 0x0055, all -> 0x0052 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0055, all -> 0x0052 }
            r3.<init>(r1)     // Catch:{ Exception -> 0x0055, all -> 0x0052 }
            r10 = r3
            r3 = r1
            r1 = r10
            goto L_0x005c
        L_0x0052:
            r0 = move-exception
            r3 = r1
            goto L_0x00b0
        L_0x0055:
            r3 = move-exception
            r4 = r3
            r3 = r1
            r1 = r2
            goto L_0x00a0
        L_0x005a:
            r1 = r2
            r3 = r1
        L_0x005c:
            if (r1 == 0) goto L_0x0093
            int r4 = r11.f16866b     // Catch:{ Exception -> 0x0091 }
            long r4 = (long) r4     // Catch:{ Exception -> 0x0091 }
            long r4 = r1.skip(r4)     // Catch:{ Exception -> 0x0091 }
            int r6 = r11.f16866b     // Catch:{ Exception -> 0x0091 }
            long r6 = (long) r6
            java.lang.String r8 = "Corrupted image"
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 != 0) goto L_0x008b
            int r4 = r11.f16868c     // Catch:{ Exception -> 0x0091 }
            byte[] r4 = new byte[r4]     // Catch:{ Exception -> 0x0091 }
            int r5 = r1.read(r4)     // Catch:{ Exception -> 0x0091 }
            int r6 = r11.f16868c     // Catch:{ Exception -> 0x0091 }
            if (r5 != r6) goto L_0x0085
            r11.f16864a = r4     // Catch:{ Exception -> 0x0091 }
            m22057d(r1)
            if (r3 == 0) goto L_0x0084
            m22056c(r3)
        L_0x0084:
            return r4
        L_0x0085:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ Exception -> 0x0091 }
            r4.<init>(r8)     // Catch:{ Exception -> 0x0091 }
            throw r4     // Catch:{ Exception -> 0x0091 }
        L_0x008b:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ Exception -> 0x0091 }
            r4.<init>(r8)     // Catch:{ Exception -> 0x0091 }
            throw r4     // Catch:{ Exception -> 0x0091 }
        L_0x0091:
            r4 = move-exception
            goto L_0x00a0
        L_0x0093:
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException     // Catch:{ Exception -> 0x0091 }
            r4.<init>()     // Catch:{ Exception -> 0x0091 }
            throw r4     // Catch:{ Exception -> 0x0091 }
        L_0x0099:
            r0 = move-exception
            r3 = r2
            goto L_0x00b0
        L_0x009c:
            r3 = move-exception
            r1 = r2
            r4 = r3
            r3 = r1
        L_0x00a0:
            java.lang.String r5 = "Encountered exception while getting thumbnail"
            android.util.Log.d(r0, r5, r4)     // Catch:{ all -> 0x00ae }
            m22057d(r1)
            if (r3 == 0) goto L_0x00ad
            m22056c(r3)
        L_0x00ad:
            return r2
        L_0x00ae:
            r0 = move-exception
        L_0x00af:
            r2 = r1
        L_0x00b0:
            m22057d(r2)
            if (r3 == 0) goto L_0x00b8
            m22056c(r3)
        L_0x00b8:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.mx0.mo20710M():byte[]");
    }

    @ts2
    /* renamed from: N */
    public long[] mo20711N() {
        if (this.f16875f) {
            throw new IllegalStateException("The underlying file has been modified since being parsed");
        } else if (!this.f16867b) {
            return null;
        } else {
            if (this.f16869c && !this.f16871d) {
                return null;
            }
            return new long[]{(long) this.f16866b, (long) this.f16868c};
        }
    }

    /* renamed from: O */
    public final void mo20712O(C2895b bVar) throws IOException {
        if (f16676h) {
            Log.d(f16600b, "getWebpAttributes starting with: " + bVar);
        }
        bVar.mo20771g(ByteOrder.LITTLE_ENDIAN);
        bVar.skipBytes(f16719l.length);
        int readInt = bVar.readInt() + 8;
        int skipBytes = bVar.skipBytes(f16729m.length) + 8;
        while (true) {
            try {
                byte[] bArr = new byte[4];
                if (bVar.read(bArr) == 4) {
                    int readInt2 = bVar.readInt();
                    int i = skipBytes + 4 + 4;
                    if (Arrays.equals(f16739n, bArr)) {
                        byte[] bArr2 = new byte[readInt2];
                        if (bVar.read(bArr2) == readInt2) {
                            this.f16872e = i;
                            mo20742p0(bArr2, 0);
                            this.f16872e = i;
                            return;
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + m22055b(bArr));
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    int i2 = i + readInt2;
                    if (i2 != readInt) {
                        if (i2 <= readInt) {
                            int skipBytes2 = bVar.skipBytes(readInt2);
                            if (skipBytes2 == readInt2) {
                                skipBytes = i + skipBytes2;
                            } else {
                                throw new IOException("Encountered WebP file with invalid chunk size");
                            }
                        } else {
                            throw new IOException("Encountered WebP file with invalid chunk size");
                        }
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    /* renamed from: Q */
    public final void mo20713Q(C2895b bVar, HashMap hashMap) throws IOException {
        C2897d dVar = (C2897d) hashMap.get(f16787s);
        C2897d dVar2 = (C2897d) hashMap.get(f16797t);
        if (dVar != null && dVar2 != null) {
            int p = dVar.mo20798p(this.f16861a);
            int p2 = dVar2.mo20798p(this.f16861a);
            if (this.f16857a == 7) {
                p += this.f16874f;
            }
            int min = Math.min(p2, bVar.mo20766a() - p);
            if (p > 0 && min > 0) {
                this.f16867b = true;
                int i = this.f16872e + p;
                this.f16866b = i;
                this.f16868c = min;
                if (this.f16860a == null && this.f16858a == null && this.f16859a == null) {
                    byte[] bArr = new byte[min];
                    bVar.mo20770d((long) i);
                    bVar.readFully(bArr);
                    this.f16864a = bArr;
                }
            }
            if (f16676h) {
                Log.d(f16600b, "Setting thumbnail attributes with offset: " + p + ", length: " + min);
            }
        }
    }

    /* renamed from: R */
    public final void mo20714R(C2895b bVar, HashMap hashMap) throws IOException {
        String str;
        C2895b bVar2 = bVar;
        HashMap hashMap2 = hashMap;
        C2897d dVar = (C2897d) hashMap2.get(f16757p);
        C2897d dVar2 = (C2897d) hashMap2.get(f16777r);
        if (dVar != null && dVar2 != null) {
            long[] g = m22060g(dVar.mo20800r(this.f16861a));
            long[] g2 = m22060g(dVar2.mo20800r(this.f16861a));
            if (g == null || g.length == 0) {
                str = "stripOffsets should not be null or have zero length.";
            } else if (g2 == null || g2.length == 0) {
                str = "stripByteCounts should not be null or have zero length.";
            } else if (g.length != g2.length) {
                str = "stripOffsets and stripByteCounts should have same length.";
            } else {
                long j = 0;
                for (long j2 : g2) {
                    j += j2;
                }
                int i = (int) j;
                byte[] bArr = new byte[i];
                this.f16871d = true;
                this.f16869c = true;
                this.f16867b = true;
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < g.length; i4++) {
                    int i5 = (int) g[i4];
                    int i6 = (int) g2[i4];
                    if (i4 < g.length - 1 && ((long) (i5 + i6)) != g[i4 + 1]) {
                        this.f16871d = false;
                    }
                    int i7 = i5 - i2;
                    if (i7 < 0) {
                        Log.d(f16600b, "Invalid strip offset value");
                    }
                    bVar2.mo20770d((long) i7);
                    int i8 = i2 + i7;
                    byte[] bArr2 = new byte[i6];
                    bVar2.read(bArr2);
                    i2 = i8 + i6;
                    System.arraycopy(bArr2, 0, bArr, i3, i6);
                    i3 += i6;
                }
                this.f16864a = bArr;
                if (this.f16871d) {
                    this.f16866b = ((int) g[0]) + this.f16872e;
                    this.f16868c = i;
                    return;
                }
                return;
            }
            Log.w(f16600b, str);
        }
    }

    /* renamed from: S */
    public boolean mo20715S(@mr2 String str) {
        return mo20755w(str) != null;
    }

    /* renamed from: T */
    public boolean mo20716T() {
        return this.f16867b;
    }

    /* renamed from: U */
    public final void mo20717U(String str) throws IOException {
        Objects.requireNonNull(str, "filename cannot be null");
        FileInputStream fileInputStream = null;
        this.f16858a = null;
        this.f16860a = str;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                if (m22058d0(fileInputStream2.getFD())) {
                    this.f16859a = fileInputStream2.getFD();
                } else {
                    this.f16859a = null;
                }
                mo20733k0(fileInputStream2);
                m22057d(fileInputStream2);
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                m22057d(fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            m22057d(fileInputStream);
            throw th;
        }
    }

    /* renamed from: W */
    public boolean mo20718W() {
        int r = mo20745r(f16674h, 1);
        return r == 2 || r == 7 || r == 4 || r == 5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x0092 A[Catch:{ all -> 0x008b }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00a1  */
    /* renamed from: X */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo20719X(byte[] r15) throws java.io.IOException {
        /*
            r14 = this;
            r0 = 0
            r1 = 0
            com.onedelhi.secure.mx0$b r2 = new com.onedelhi.secure.mx0$b     // Catch:{ Exception -> 0x008d }
            r2.<init>((byte[]) r15)     // Catch:{ Exception -> 0x008d }
            int r1 = r2.readInt()     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            long r3 = (long) r1     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            r1 = 4
            byte[] r5 = new byte[r1]     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            r2.read(r5)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            byte[] r6 = f16618c     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            boolean r5 = java.util.Arrays.equals(r5, r6)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            if (r5 != 0) goto L_0x001e
            r2.close()
            return r0
        L_0x001e:
            r5 = 16
            r7 = 8
            r9 = 1
            int r11 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x0034
            long r3 = r2.readLong()     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            int r11 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r11 >= 0) goto L_0x0035
            r2.close()
            return r0
        L_0x0034:
            r5 = r7
        L_0x0035:
            int r11 = r15.length     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            long r11 = (long) r11     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            int r13 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r13 <= 0) goto L_0x003d
            int r15 = r15.length     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            long r3 = (long) r15
        L_0x003d:
            long r3 = r3 - r5
            int r15 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r15 >= 0) goto L_0x0046
            r2.close()
            return r0
        L_0x0046:
            byte[] r15 = new byte[r1]     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            r5 = 0
            r7 = 0
            r8 = 0
        L_0x004c:
            r11 = 4
            long r11 = r3 / r11
            int r13 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r13 >= 0) goto L_0x0081
            int r11 = r2.read(r15)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            if (r11 == r1) goto L_0x005e
            r2.close()
            return r0
        L_0x005e:
            int r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x0063
            goto L_0x007f
        L_0x0063:
            byte[] r11 = f16631d     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            boolean r11 = java.util.Arrays.equals(r15, r11)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            r12 = 1
            if (r11 == 0) goto L_0x006e
            r7 = 1
            goto L_0x0077
        L_0x006e:
            byte[] r11 = f16643e     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            boolean r11 = java.util.Arrays.equals(r15, r11)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            if (r11 == 0) goto L_0x0077
            r8 = 1
        L_0x0077:
            if (r7 == 0) goto L_0x007f
            if (r8 == 0) goto L_0x007f
            r2.close()
            return r12
        L_0x007f:
            long r5 = r5 + r9
            goto L_0x004c
        L_0x0081:
            r2.close()
            goto L_0x009e
        L_0x0085:
            r15 = move-exception
            r1 = r2
            goto L_0x009f
        L_0x0088:
            r15 = move-exception
            r1 = r2
            goto L_0x008e
        L_0x008b:
            r15 = move-exception
            goto L_0x009f
        L_0x008d:
            r15 = move-exception
        L_0x008e:
            boolean r2 = f16676h     // Catch:{ all -> 0x008b }
            if (r2 == 0) goto L_0x0099
            java.lang.String r2 = "ExifInterface"
            java.lang.String r3 = "Exception parsing HEIF file type box."
            android.util.Log.d(r2, r3, r15)     // Catch:{ all -> 0x008b }
        L_0x0099:
            if (r1 == 0) goto L_0x009e
            r1.close()
        L_0x009e:
            return r0
        L_0x009f:
            if (r1 == 0) goto L_0x00a4
            r1.close()
        L_0x00a4:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.mx0.mo20719X(byte[]):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0030  */
    /* renamed from: Z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo20720Z(byte[] r4) throws java.io.IOException {
        /*
            r3 = this;
            r0 = 0
            r1 = 0
            com.onedelhi.secure.mx0$b r2 = new com.onedelhi.secure.mx0$b     // Catch:{ Exception -> 0x002d, all -> 0x0026 }
            r2.<init>((byte[]) r4)     // Catch:{ Exception -> 0x002d, all -> 0x0026 }
            java.nio.ByteOrder r4 = r3.mo20740o0(r2)     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            r3.f16861a = r4     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            r2.mo20771g(r4)     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            short r4 = r2.readShort()     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            r1 = 20306(0x4f52, float:2.8455E-41)
            if (r4 == r1) goto L_0x001c
            r1 = 21330(0x5352, float:2.989E-41)
            if (r4 != r1) goto L_0x001d
        L_0x001c:
            r0 = 1
        L_0x001d:
            r2.close()
            return r0
        L_0x0021:
            r4 = move-exception
            r1 = r2
            goto L_0x0027
        L_0x0024:
            r1 = r2
            goto L_0x002e
        L_0x0026:
            r4 = move-exception
        L_0x0027:
            if (r1 == 0) goto L_0x002c
            r1.close()
        L_0x002c:
            throw r4
        L_0x002d:
        L_0x002e:
            if (r1 == 0) goto L_0x0033
            r1.close()
        L_0x0033:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.mx0.mo20720Z(byte[]):boolean");
    }

    /* renamed from: a */
    public final void mo20721a() {
        String o = mo20739o(f16526R);
        if (o != null && mo20739o(f16851z) == null) {
            this.f16865a[0].put(f16851z, C2897d.m22157h(o));
        }
        if (mo20739o(f16616c) == null) {
            this.f16865a[0].put(f16616c, C2897d.m22158i(0, this.f16861a));
        }
        if (mo20739o(f16629d) == null) {
            this.f16865a[0].put(f16629d, C2897d.m22158i(0, this.f16861a));
        }
        if (mo20739o(f16674h) == null) {
            this.f16865a[0].put(f16674h, C2897d.m22158i(0, this.f16861a));
        }
        if (mo20739o(f16801t0) == null) {
            this.f16865a[1].put(f16801t0, C2897d.m22158i(0, this.f16861a));
        }
    }

    /* renamed from: a0 */
    public final boolean mo20722a0(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = f16677h;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    /* renamed from: b0 */
    public final boolean mo20723b0(byte[] bArr) throws IOException {
        byte[] bytes = f16841x2.getBytes(Charset.defaultCharset());
        for (int i = 0; i < bytes.length; i++) {
            if (bArr[i] != bytes[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x002c  */
    /* renamed from: c0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo20724c0(byte[] r4) throws java.io.IOException {
        /*
            r3 = this;
            r0 = 0
            r1 = 0
            com.onedelhi.secure.mx0$b r2 = new com.onedelhi.secure.mx0$b     // Catch:{ Exception -> 0x0029, all -> 0x0022 }
            r2.<init>((byte[]) r4)     // Catch:{ Exception -> 0x0029, all -> 0x0022 }
            java.nio.ByteOrder r4 = r3.mo20740o0(r2)     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            r3.f16861a = r4     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            r2.mo20771g(r4)     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            short r4 = r2.readShort()     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            r1 = 85
            if (r4 != r1) goto L_0x0019
            r0 = 1
        L_0x0019:
            r2.close()
            return r0
        L_0x001d:
            r4 = move-exception
            r1 = r2
            goto L_0x0023
        L_0x0020:
            r1 = r2
            goto L_0x002a
        L_0x0022:
            r4 = move-exception
        L_0x0023:
            if (r1 == 0) goto L_0x0028
            r1.close()
        L_0x0028:
            throw r4
        L_0x0029:
        L_0x002a:
            if (r1 == 0) goto L_0x002f
            r1.close()
        L_0x002f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.mx0.mo20724c0(byte[]):boolean");
    }

    /* renamed from: e */
    public final String mo20725e(double d) {
        long j = (long) d;
        double d2 = d - ((double) j);
        long j2 = (long) (d2 * 60.0d);
        long round = Math.round((d2 - (((double) j2) / 60.0d)) * 3600.0d * 1.0E7d);
        return j + "/1," + j2 + "/1," + round + "/10000000";
    }

    /* renamed from: e0 */
    public final boolean mo20726e0(HashMap hashMap) throws IOException {
        C2897d dVar;
        int p;
        C2897d dVar2 = (C2897d) hashMap.get(f16641e);
        if (dVar2 != null) {
            int[] iArr = (int[]) dVar2.mo20800r(this.f16861a);
            int[] iArr2 = f16588a;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f16857a == 3 && (dVar = (C2897d) hashMap.get(f16663g)) != null && (((p = dVar.mo20798p(this.f16861a)) == 1 && Arrays.equals(iArr, f16619c)) || (p == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (!f16676h) {
            return false;
        }
        Log.d(f16600b, "Unsupported data type value");
        return false;
    }

    /* renamed from: f0 */
    public final boolean mo20727f0() {
        if (!this.f16873e) {
            return false;
        }
        int i = this.f16857a;
        return i == 4 || i == 13 || i == 14;
    }

    /* renamed from: h0 */
    public final boolean mo20728h0(HashMap hashMap) throws IOException {
        C2897d dVar = (C2897d) hashMap.get(f16629d);
        C2897d dVar2 = (C2897d) hashMap.get(f16616c);
        if (dVar == null || dVar2 == null) {
            return false;
        }
        return dVar.mo20798p(this.f16861a) <= 512 && dVar2.mo20798p(this.f16861a) <= 512;
    }

    /* renamed from: i0 */
    public boolean mo20729i0() {
        if (!this.f16867b) {
            return false;
        }
        int i = this.f16870d;
        return i == 6 || i == 7;
    }

    /* renamed from: j */
    public final void mo20730j(C2895b bVar, C2896c cVar, byte[] bArr, byte[] bArr2) throws IOException {
        String str;
        while (true) {
            byte[] bArr3 = new byte[4];
            if (bVar.read(bArr3) != 4) {
                StringBuilder sb = new StringBuilder();
                sb.append("Encountered invalid length while copying WebP chunks up tochunk type ");
                Charset charset = f16581a;
                sb.append(new String(bArr, charset));
                if (bArr2 == null) {
                    str = "";
                } else {
                    str = " or " + new String(bArr2, charset);
                }
                sb.append(str);
                throw new IOException(sb.toString());
            }
            mo20732k(bVar, cVar, bArr3);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    /* renamed from: j0 */
    public final boolean mo20731j0(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = f16719l;
            if (i >= bArr2.length) {
                int i2 = 0;
                while (true) {
                    byte[] bArr3 = f16729m;
                    if (i2 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[f16719l.length + i2 + 4] != bArr3[i2]) {
                        return false;
                    }
                    i2++;
                }
            } else if (bArr[i] != bArr2[i]) {
                return false;
            } else {
                i++;
            }
        }
    }

    /* renamed from: k */
    public final void mo20732k(C2895b bVar, C2896c cVar, byte[] bArr) throws IOException {
        int readInt = bVar.readInt();
        cVar.write(bArr);
        cVar.mo20791c(readInt);
        if (readInt % 2 == 1) {
            readInt++;
        }
        m22063i(bVar, cVar, readInt);
    }

    /* renamed from: k0 */
    public final void mo20733k0(@mr2 InputStream inputStream) {
        Objects.requireNonNull(inputStream, "inputstream shouldn't be null");
        int i = 0;
        while (i < f16591a.length) {
            try {
                this.f16865a[i] = new HashMap<>();
                i++;
            } catch (IOException e) {
                this.f16873e = false;
                boolean z = f16676h;
                if (z) {
                    Log.w(f16600b, "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                mo20721a();
                if (!z) {
                    return;
                }
            } catch (Throwable th) {
                mo20721a();
                if (f16676h) {
                    mo20738n0();
                }
                throw th;
            }
        }
        if (!this.f16863a) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, f16495M);
            this.f16857a = mo20693C(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        C2895b bVar = new C2895b(inputStream);
        if (!this.f16863a) {
            switch (this.f16857a) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 5:
                case 6:
                case 8:
                case 11:
                    mo20700G(bVar);
                    break;
                case 4:
                    mo20761z(bVar, 0, 0);
                    break;
                case 7:
                    mo20695D(bVar);
                    break;
                case 9:
                    mo20699F(bVar);
                    break;
                case 10:
                    mo20704I(bVar);
                    break;
                case 12:
                    mo20759y(bVar);
                    break;
                case 13:
                    mo20697E(bVar);
                    break;
                case 14:
                    mo20712O(bVar);
                    break;
            }
        } else {
            mo20706J(bVar);
        }
        mo20698E0(bVar);
        this.f16873e = true;
        mo20721a();
        if (!f16676h) {
            return;
        }
        mo20738n0();
    }

    /* renamed from: l */
    public void mo20734l() {
        int i = 1;
        switch (mo20745r(f16674h, 1)) {
            case 1:
                i = 2;
                break;
            case 2:
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 3;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 5;
                break;
            case 7:
                i = 8;
                break;
            case 8:
                i = 7;
                break;
            default:
                i = 0;
                break;
        }
        mo20690A0(f16674h, Integer.toString(i));
    }

    /* renamed from: m */
    public void mo20735m() {
        int i = 1;
        switch (mo20745r(f16674h, 1)) {
            case 1:
                i = 4;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 2;
                break;
            case 4:
                break;
            case 5:
                i = 8;
                break;
            case 6:
                i = 7;
                break;
            case 7:
                i = 6;
                break;
            case 8:
                i = 5;
                break;
            default:
                i = 0;
                break;
        }
        mo20690A0(f16674h, Integer.toString(i));
    }

    /* renamed from: m0 */
    public final void mo20736m0(C2895b bVar, int i) throws IOException {
        ByteOrder o0 = mo20740o0(bVar);
        this.f16861a = o0;
        bVar.mo20771g(o0);
        int readUnsignedShort = bVar.readUnsignedShort();
        int i2 = this.f16857a;
        if (i2 == 7 || i2 == 10 || readUnsignedShort == 42) {
            int readInt = bVar.readInt();
            if (readInt < 8 || readInt >= i) {
                throw new IOException("Invalid first Ifd offset: " + readInt);
            }
            int i3 = readInt - 8;
            if (i3 > 0 && bVar.skipBytes(i3) != i3) {
                throw new IOException("Couldn't jump to first Ifd: " + i3);
            }
            return;
        }
        throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
    }

    /* renamed from: n */
    public double mo20737n(double d) {
        double q = mo20743q(f16692i1, -1.0d);
        int i = -1;
        int r = mo20745r(f16682h1, -1);
        if (q < 0.0d || r < 0) {
            return d;
        }
        if (r != 1) {
            i = 1;
        }
        return q * ((double) i);
    }

    /* renamed from: n0 */
    public final void mo20738n0() {
        for (int i = 0; i < this.f16865a.length; i++) {
            Log.d(f16600b, "The size of tag group[" + i + "]: " + this.f16865a[i].size());
            for (Map.Entry next : this.f16865a[i].entrySet()) {
                C2897d dVar = (C2897d) next.getValue();
                Log.d(f16600b, "tagName: " + ((String) next.getKey()) + ", tagType: " + dVar.toString() + ", tagValue: '" + dVar.mo20799q(this.f16861a) + "'");
            }
        }
    }

    @ts2
    /* renamed from: o */
    public String mo20739o(@mr2 String str) {
        String str2;
        Objects.requireNonNull(str, "tag shouldn't be null");
        C2897d w = mo20755w(str);
        if (w != null) {
            if (!f16584a.contains(str)) {
                return w.mo20799q(this.f16861a);
            }
            if (str.equals(f16703j1)) {
                int i = w.f16892a;
                if (i == 5 || i == 10) {
                    C2901h[] hVarArr = (C2901h[]) w.mo20800r(this.f16861a);
                    if (hVarArr == null || hVarArr.length != 3) {
                        str2 = "Invalid GPS Timestamp array. array=" + Arrays.toString(hVarArr);
                    } else {
                        return String.format("%02d:%02d:%02d", new Object[]{Integer.valueOf((int) (((float) hVarArr[0].f16900a) / ((float) hVarArr[0].f16901b))), Integer.valueOf((int) (((float) hVarArr[1].f16900a) / ((float) hVarArr[1].f16901b))), Integer.valueOf((int) (((float) hVarArr[2].f16900a) / ((float) hVarArr[2].f16901b)))});
                    }
                } else {
                    str2 = "GPS Timestamp format is not rational. format=" + w.f16892a;
                }
                Log.w(f16600b, str2);
                return null;
            }
            try {
                return Double.toString(w.mo20797o(this.f16861a));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* renamed from: o0 */
    public final ByteOrder mo20740o0(C2895b bVar) throws IOException {
        short readShort = bVar.readShort();
        if (readShort == 18761) {
            if (f16676h) {
                Log.d(f16600b, "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        } else if (readShort == 19789) {
            if (f16676h) {
                Log.d(f16600b, "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        } else {
            throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
        }
    }

    @ts2
    /* renamed from: p */
    public byte[] mo20741p(@mr2 String str) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        C2897d w = mo20755w(str);
        if (w != null) {
            return w.f16894a;
        }
        return null;
    }

    /* renamed from: p0 */
    public final void mo20742p0(byte[] bArr, int i) throws IOException {
        C2895b bVar = new C2895b(bArr);
        mo20736m0(bVar, bArr.length);
        mo20744q0(bVar, i);
    }

    /* renamed from: q */
    public double mo20743q(@mr2 String str, double d) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        C2897d w = mo20755w(str);
        if (w == null) {
            return d;
        }
        try {
            return w.mo20797o(this.f16861a);
        } catch (NumberFormatException unused) {
            return d;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02a0  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02d9  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0147  */
    /* renamed from: q0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo20744q0(com.onedelhi.secure.mx0.C2895b r31, int r32) throws java.io.IOException {
        /*
            r30 = this;
            r0 = r30
            r1 = r31
            r2 = r32
            java.util.Set<java.lang.Integer> r3 = r0.f16862a
            int r4 = r1.f16888o
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            int r3 = r1.f16888o
            r4 = 2
            int r3 = r3 + r4
            int r5 = r1.f16887n
            if (r3 <= r5) goto L_0x001a
            return
        L_0x001a:
            short r3 = r31.readShort()
            boolean r5 = f16676h
            java.lang.String r6 = "ExifInterface"
            if (r5 == 0) goto L_0x0038
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "numberOfDirectoryEntry: "
            r5.append(r7)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            android.util.Log.d(r6, r5)
        L_0x0038:
            int r5 = r1.f16888o
            int r7 = r3 * 12
            int r5 = r5 + r7
            int r7 = r1.f16887n
            if (r5 > r7) goto L_0x03fb
            if (r3 > 0) goto L_0x0045
            goto L_0x03fb
        L_0x0045:
            r5 = 0
            r7 = 0
        L_0x0047:
            r8 = 5
            if (r7 >= r3) goto L_0x037e
            int r13 = r31.readUnsignedShort()
            int r14 = r31.readUnsignedShort()
            int r15 = r31.readInt()
            int r9 = r31.mo20768b()
            long r9 = (long) r9
            r18 = 4
            long r9 = r9 + r18
            java.util.HashMap<java.lang.Integer, com.onedelhi.secure.mx0$f>[] r20 = f16607b
            r12 = r20[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            java.lang.Object r4 = r12.get(r4)
            com.onedelhi.secure.mx0$f r4 = (com.onedelhi.secure.mx0.C2899f) r4
            boolean r12 = f16676h
            r11 = 3
            if (r12 == 0) goto L_0x00a3
            java.lang.Object[] r8 = new java.lang.Object[r8]
            java.lang.Integer r23 = java.lang.Integer.valueOf(r32)
            r8[r5] = r23
            java.lang.Integer r23 = java.lang.Integer.valueOf(r13)
            r20 = 1
            r8[r20] = r23
            if (r4 == 0) goto L_0x0087
            java.lang.String r5 = r4.f16897a
            goto L_0x0088
        L_0x0087:
            r5 = 0
        L_0x0088:
            r22 = 2
            r8[r22] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r14)
            r8[r11] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r15)
            r21 = 4
            r8[r21] = r5
            java.lang.String r5 = "ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d"
            java.lang.String r5 = java.lang.String.format(r5, r8)
            android.util.Log.d(r6, r5)
        L_0x00a3:
            r5 = 7
            if (r4 != 0) goto L_0x00c1
            if (r12 == 0) goto L_0x00bc
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r11 = "Skip the tag entry since tag number is not defined: "
            r8.append(r11)
            r8.append(r13)
        L_0x00b5:
            java.lang.String r8 = r8.toString()
            android.util.Log.d(r6, r8)
        L_0x00bc:
            r11 = r6
            r25 = r7
            goto L_0x013a
        L_0x00c1:
            if (r14 <= 0) goto L_0x0121
            int[] r8 = f16632d
            int r11 = r8.length
            if (r14 < r11) goto L_0x00c9
            goto L_0x0121
        L_0x00c9:
            boolean r11 = r4.mo20803a(r14)
            if (r11 != 0) goto L_0x00ed
            if (r12 == 0) goto L_0x00bc
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r11 = "Skip the tag entry since data format ("
            r8.append(r11)
            java.lang.String[] r11 = f16590a
            r11 = r11[r14]
            r8.append(r11)
            java.lang.String r11 = ") is unexpected for tag: "
            r8.append(r11)
            java.lang.String r11 = r4.f16897a
            r8.append(r11)
            goto L_0x00b5
        L_0x00ed:
            if (r14 != r5) goto L_0x00f1
            int r14 = r4.f16898b
        L_0x00f1:
            r11 = r6
            long r5 = (long) r15
            r8 = r8[r14]
            r25 = r7
            long r7 = (long) r8
            long r5 = r5 * r7
            r7 = 0
            int r26 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r26 < 0) goto L_0x010a
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r26 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r26 <= 0) goto L_0x0108
            goto L_0x010a
        L_0x0108:
            r7 = 1
            goto L_0x013d
        L_0x010a:
            if (r12 == 0) goto L_0x013c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Skip the tag entry since the number of components is invalid: "
            r7.append(r8)
            r7.append(r15)
            java.lang.String r7 = r7.toString()
            android.util.Log.d(r11, r7)
            goto L_0x013c
        L_0x0121:
            r11 = r6
            r25 = r7
            if (r12 == 0) goto L_0x013a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Skip the tag entry since data format is invalid: "
            r5.append(r6)
            r5.append(r14)
            java.lang.String r5 = r5.toString()
            android.util.Log.d(r11, r5)
        L_0x013a:
            r5 = 0
        L_0x013c:
            r7 = 0
        L_0x013d:
            if (r7 != 0) goto L_0x0147
            r1.mo20770d(r9)
            r26 = r3
        L_0x0144:
            r13 = 2
            goto L_0x0372
        L_0x0147:
            java.lang.String r7 = "Compression"
            int r8 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r8 <= 0) goto L_0x020f
            int r8 = r31.readInt()
            r26 = r3
            if (r12 == 0) goto L_0x016c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r18 = r14
            java.lang.String r14 = "seek to data offset: "
            r3.append(r14)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r11, r3)
            goto L_0x016e
        L_0x016c:
            r18 = r14
        L_0x016e:
            int r3 = r0.f16857a
            r14 = 7
            if (r3 != r14) goto L_0x01ce
            java.lang.String r3 = r4.f16897a
            java.lang.String r14 = "MakerNote"
            boolean r3 = r14.equals(r3)
            if (r3 == 0) goto L_0x0180
            r0.f16874f = r8
            goto L_0x01c9
        L_0x0180:
            r3 = 6
            if (r2 != r3) goto L_0x01c9
            java.lang.String r14 = r4.f16897a
            java.lang.String r3 = "ThumbnailImage"
            boolean r3 = r3.equals(r14)
            if (r3 == 0) goto L_0x01c9
            r0.f16876g = r8
            r0.f16878h = r15
            java.nio.ByteOrder r3 = r0.f16861a
            r14 = 6
            com.onedelhi.secure.mx0$d r3 = com.onedelhi.secure.mx0.C2897d.m22162m(r14, r3)
            int r14 = r0.f16876g
            r19 = r15
            long r14 = (long) r14
            java.nio.ByteOrder r2 = r0.f16861a
            com.onedelhi.secure.mx0$d r2 = com.onedelhi.secure.mx0.C2897d.m22158i(r14, r2)
            int r14 = r0.f16878h
            long r14 = (long) r14
            r24 = r13
            java.nio.ByteOrder r13 = r0.f16861a
            com.onedelhi.secure.mx0$d r13 = com.onedelhi.secure.mx0.C2897d.m22158i(r14, r13)
            java.util.HashMap<java.lang.String, com.onedelhi.secure.mx0$d>[] r14 = r0.f16865a
            r15 = 4
            r14 = r14[r15]
            r14.put(r7, r3)
            java.util.HashMap<java.lang.String, com.onedelhi.secure.mx0$d>[] r3 = r0.f16865a
            r3 = r3[r15]
            java.lang.String r14 = "JPEGInterchangeFormat"
            r3.put(r14, r2)
            java.util.HashMap<java.lang.String, com.onedelhi.secure.mx0$d>[] r2 = r0.f16865a
            r2 = r2[r15]
            java.lang.String r3 = "JPEGInterchangeFormatLength"
            r2.put(r3, r13)
            goto L_0x01e2
        L_0x01c9:
            r24 = r13
            r19 = r15
            goto L_0x01e2
        L_0x01ce:
            r24 = r13
            r19 = r15
            r2 = 10
            if (r3 != r2) goto L_0x01e2
            java.lang.String r2 = r4.f16897a
            java.lang.String r3 = "JpgFromRaw"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x01e2
            r0.f16879i = r8
        L_0x01e2:
            long r2 = (long) r8
            long r13 = r2 + r5
            int r15 = r1.f16887n
            r27 = r4
            r28 = r5
            long r4 = (long) r15
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x01f4
            r1.mo20770d(r2)
            goto L_0x021b
        L_0x01f4:
            if (r12 == 0) goto L_0x020a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Skip the tag entry since data offset is invalid: "
            r2.append(r3)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r11, r2)
        L_0x020a:
            r1.mo20770d(r9)
            goto L_0x0144
        L_0x020f:
            r26 = r3
            r27 = r4
            r28 = r5
            r24 = r13
            r18 = r14
            r19 = r15
        L_0x021b:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r2 = f16583a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r24)
            java.lang.Object r2 = r2.get(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r12 == 0) goto L_0x0248
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "nextIfdType: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r4 = " byteCount: "
            r3.append(r4)
            r5 = r28
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r11, r3)
            goto L_0x024a
        L_0x0248:
            r5 = r28
        L_0x024a:
            r3 = 8
            if (r2 == 0) goto L_0x02f4
            r4 = -1
            r14 = r18
            r6 = 3
            if (r14 == r6) goto L_0x0272
            r6 = 4
            if (r14 == r6) goto L_0x026d
            if (r14 == r3) goto L_0x0268
            r3 = 9
            if (r14 == r3) goto L_0x0263
            r3 = 13
            if (r14 == r3) goto L_0x0263
            goto L_0x0277
        L_0x0263:
            int r3 = r31.readInt()
            goto L_0x0276
        L_0x0268:
            short r3 = r31.readShort()
            goto L_0x0276
        L_0x026d:
            long r4 = r31.mo20769c()
            goto L_0x0277
        L_0x0272:
            int r3 = r31.readUnsignedShort()
        L_0x0276:
            long r4 = (long) r3
        L_0x0277:
            r13 = 2
            if (r12 == 0) goto L_0x0293
            java.lang.Object[] r3 = new java.lang.Object[r13]
            java.lang.Long r6 = java.lang.Long.valueOf(r4)
            r7 = 0
            r3[r7] = r6
            r8 = r27
            java.lang.String r6 = r8.f16897a
            r7 = 1
            r3[r7] = r6
            java.lang.String r6 = "Offset: %d, tagName: %s"
            java.lang.String r3 = java.lang.String.format(r6, r3)
            android.util.Log.d(r11, r3)
        L_0x0293:
            r6 = 0
            int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r3 <= 0) goto L_0x02d9
            int r3 = r1.f16887n
            long r6 = (long) r3
            int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r3 >= 0) goto L_0x02d9
            java.util.Set<java.lang.Integer> r3 = r0.f16862a
            int r6 = (int) r4
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            boolean r3 = r3.contains(r6)
            if (r3 != 0) goto L_0x02b8
            r1.mo20770d(r4)
            int r2 = r2.intValue()
            r0.mo20744q0(r1, r2)
            goto L_0x02ef
        L_0x02b8:
            if (r12 == 0) goto L_0x02ef
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "Skip jump into the IFD since it has already been read: IfdType "
            r3.append(r6)
            r3.append(r2)
            java.lang.String r2 = " (at "
            r3.append(r2)
            r3.append(r4)
            java.lang.String r2 = ")"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            goto L_0x02ec
        L_0x02d9:
            if (r12 == 0) goto L_0x02ef
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Skip jump into the IFD since its offset is invalid: "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
        L_0x02ec:
            android.util.Log.d(r11, r2)
        L_0x02ef:
            r1.mo20770d(r9)
            goto L_0x0372
        L_0x02f4:
            r14 = r18
            r8 = r27
            r13 = 2
            int r2 = r31.mo20768b()
            int r4 = r0.f16872e
            int r2 = r2 + r4
            int r4 = (int) r5
            byte[] r4 = new byte[r4]
            r1.readFully(r4)
            com.onedelhi.secure.mx0$d r5 = new com.onedelhi.secure.mx0$d
            r12 = r4
            long r3 = (long) r2
            r2 = r19
            r15 = r5
            r16 = r14
            r17 = r2
            r18 = r3
            r20 = r12
            r15.<init>(r16, r17, r18, r20)
            java.util.HashMap<java.lang.String, com.onedelhi.secure.mx0$d>[] r2 = r0.f16865a
            r2 = r2[r32]
            java.lang.String r3 = r8.f16897a
            r2.put(r3, r5)
            java.lang.String r2 = r8.f16897a
            java.lang.String r3 = "DNGVersion"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x032e
            r2 = 3
            r0.f16857a = r2
        L_0x032e:
            java.lang.String r2 = r8.f16897a
            java.lang.String r3 = "Make"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0342
            java.lang.String r2 = r8.f16897a
            java.lang.String r3 = "Model"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0350
        L_0x0342:
            java.nio.ByteOrder r2 = r0.f16861a
            java.lang.String r2 = r5.mo20799q(r2)
            java.lang.String r3 = "PENTAX"
            boolean r2 = r2.contains(r3)
            if (r2 != 0) goto L_0x0363
        L_0x0350:
            java.lang.String r2 = r8.f16897a
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x0367
            java.nio.ByteOrder r2 = r0.f16861a
            int r2 = r5.mo20798p(r2)
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r2 != r3) goto L_0x0367
        L_0x0363:
            r2 = 8
            r0.f16857a = r2
        L_0x0367:
            int r2 = r31.mo20768b()
            long r2 = (long) r2
            int r4 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r4 == 0) goto L_0x0372
            goto L_0x02ef
        L_0x0372:
            int r7 = r25 + 1
            short r7 = (short) r7
            r2 = r32
            r6 = r11
            r3 = r26
            r4 = 2
            r5 = 0
            goto L_0x0047
        L_0x037e:
            r11 = r6
            int r2 = r31.mo20768b()
            r3 = 4
            int r2 = r2 + r3
            int r3 = r1.f16887n
            if (r2 > r3) goto L_0x03fb
            int r2 = r31.readInt()
            boolean r3 = f16676h
            if (r3 == 0) goto L_0x03a4
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r6 = 0
            r4[r6] = r5
            java.lang.String r5 = "nextIfdOffset: %d"
            java.lang.String r4 = java.lang.String.format(r5, r4)
            android.util.Log.d(r11, r4)
        L_0x03a4:
            long r4 = (long) r2
            r6 = 0
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 <= 0) goto L_0x03e5
            int r6 = r1.f16887n
            if (r2 >= r6) goto L_0x03e5
            java.util.Set<java.lang.Integer> r6 = r0.f16862a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            boolean r6 = r6.contains(r7)
            if (r6 != 0) goto L_0x03db
            r1.mo20770d(r4)
            java.util.HashMap<java.lang.String, com.onedelhi.secure.mx0$d>[] r2 = r0.f16865a
            r3 = 4
            r2 = r2[r3]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x03cd
            r0.mo20744q0(r1, r3)
            goto L_0x03fb
        L_0x03cd:
            java.util.HashMap<java.lang.String, com.onedelhi.secure.mx0$d>[] r2 = r0.f16865a
            r2 = r2[r8]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x03fb
            r0.mo20744q0(r1, r8)
            goto L_0x03fb
        L_0x03db:
            if (r3 == 0) goto L_0x03fb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since re-reading an IFD may cause an infinite loop: "
            goto L_0x03ee
        L_0x03e5:
            if (r3 == 0) goto L_0x03fb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since a wrong offset may cause an infinite loop: "
        L_0x03ee:
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r11, r1)
        L_0x03fb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.mx0.mo20744q0(com.onedelhi.secure.mx0$b, int):void");
    }

    /* renamed from: r */
    public int mo20745r(@mr2 String str, int i) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        C2897d w = mo20755w(str);
        if (w == null) {
            return i;
        }
        try {
            return w.mo20798p(this.f16861a);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* renamed from: r0 */
    public final void mo20746r0(String str) {
        for (int i = 0; i < f16591a.length; i++) {
            this.f16865a[i].remove(str);
        }
    }

    @ts2
    /* renamed from: s */
    public long[] mo20747s(@mr2 String str) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        if (!this.f16875f) {
            C2897d w = mo20755w(str);
            if (w == null) {
                return null;
            }
            return new long[]{w.f16893a, (long) w.f16894a.length};
        }
        throw new IllegalStateException("The underlying file has been modified since being parsed");
    }

    /* renamed from: s0 */
    public void mo20748s0() {
        mo20690A0(f16674h, Integer.toString(1));
    }

    @hl3({hl3.C2354a.LIBRARY})
    /* renamed from: t */
    public long mo20749t() {
        return m22064l0(mo20739o(f16851z), mo20739o(f16556W));
    }

    /* renamed from: t0 */
    public final void mo20750t0(C2895b bVar, int i) throws IOException {
        C2897d dVar;
        C2897d dVar2 = this.f16865a[i].get(f16629d);
        C2897d dVar3 = this.f16865a[i].get(f16616c);
        if ((dVar2 == null || dVar3 == null) && (dVar = this.f16865a[i].get(f16787s)) != null) {
            mo20761z(bVar, dVar.mo20798p(this.f16861a), i);
        }
    }

    @hl3({hl3.C2354a.LIBRARY})
    /* renamed from: u */
    public long mo20751u() {
        return m22064l0(mo20739o(f16532S), mo20739o(f16568Y));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004c, code lost:
        if (r0 < 0) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0025, code lost:
        if (r0 < 0) goto L_0x0027;
     */
    /* renamed from: u0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo20752u0(int r7) {
        /*
            r6 = this;
            int r0 = r7 % 90
            if (r0 != 0) goto L_0x0057
            r0 = 1
            java.lang.String r1 = "Orientation"
            int r0 = r6.mo20745r(r1, r0)
            java.util.List<java.lang.Integer> r2 = f16585a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            boolean r3 = r2.contains(r3)
            r4 = 0
            r5 = 4
            if (r3 == 0) goto L_0x0034
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r0 = r2.indexOf(r0)
            int r7 = r7 / 90
            int r0 = r0 + r7
            int r0 = r0 % r5
            if (r0 >= 0) goto L_0x0028
        L_0x0027:
            r4 = 4
        L_0x0028:
            int r0 = r0 + r4
            java.lang.Object r7 = r2.get(r0)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r4 = r7.intValue()
            goto L_0x004f
        L_0x0034:
            java.util.List<java.lang.Integer> r2 = f16601b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            boolean r3 = r2.contains(r3)
            if (r3 == 0) goto L_0x004f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r0 = r2.indexOf(r0)
            int r7 = r7 / 90
            int r0 = r0 + r7
            int r0 = r0 % r5
            if (r0 >= 0) goto L_0x0028
            goto L_0x0027
        L_0x004f:
            java.lang.String r7 = java.lang.Integer.toString(r4)
            r6.mo20690A0(r1, r7)
            return
        L_0x0057:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "degree should be a multiple of 90"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.mx0.mo20752u0(int):void");
    }

    @hl3({hl3.C2354a.LIBRARY})
    /* renamed from: v */
    public long mo20753v() {
        return m22064l0(mo20739o(f16526R), mo20739o(f16562X));
    }

    /* JADX WARNING: type inference failed for: r5v15, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b2 A[Catch:{ Exception -> 0x0109, all -> 0x0106 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ba A[Catch:{ Exception -> 0x0109, all -> 0x0106 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00db A[Catch:{ Exception -> 0x00fc, all -> 0x00fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00df A[Catch:{ Exception -> 0x00fc, all -> 0x00fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0115 A[Catch:{ all -> 0x0138 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0130 A[Catch:{ all -> 0x0138 }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: v0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo20754v0() throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.mo20727f0()
            if (r0 == 0) goto L_0x0158
            java.io.FileDescriptor r0 = r8.f16859a
            if (r0 != 0) goto L_0x0017
            java.lang.String r0 = r8.f16860a
            if (r0 == 0) goto L_0x000f
            goto L_0x0017
        L_0x000f:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "ExifInterface does not support saving attributes for the current input."
            r0.<init>(r1)
            throw r0
        L_0x0017:
            r0 = 1
            r8.f16875f = r0
            byte[] r0 = r8.mo20708K()
            r8.f16864a = r0
            java.lang.String r0 = r8.f16860a
            r1 = 0
            if (r0 == 0) goto L_0x002d
            java.io.File r0 = new java.io.File
            java.lang.String r2 = r8.f16860a
            r0.<init>(r2)
            goto L_0x002e
        L_0x002d:
            r0 = r1
        L_0x002e:
            java.lang.String r2 = r8.f16860a     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            r3 = 0
            if (r2 == 0) goto L_0x006f
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            r5.<init>()     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            java.lang.String r6 = r8.f16860a     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            r5.append(r6)     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            java.lang.String r6 = ".tmp"
            r5.append(r6)     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            r2.<init>(r5)     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            boolean r5 = r0.renameTo(r2)     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            if (r5 == 0) goto L_0x0054
            r5 = r1
            goto L_0x00a2
        L_0x0054:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            r3.<init>()     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            java.lang.String r4 = "Couldn't rename to "
            r3.append(r4)     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            java.lang.String r2 = r2.getAbsolutePath()     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            r3.append(r2)     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            throw r0     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
        L_0x006f:
            java.io.FileDescriptor r2 = r8.f16859a     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            if (r2 == 0) goto L_0x00a0
            java.lang.String r2 = "temp"
            java.lang.String r5 = "tmp"
            java.io.File r2 = java.io.File.createTempFile(r2, r5)     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            java.io.FileDescriptor r5 = r8.f16859a     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            int r6 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            android.system.Os.lseek(r5, r3, r6)     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            java.io.FileDescriptor r6 = r8.f16859a     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            r5.<init>(r6)     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x009b, all -> 0x0096 }
            r6.<init>(r2)     // Catch:{ Exception -> 0x009b, all -> 0x0096 }
            m22062h(r5, r6)     // Catch:{ Exception -> 0x0094, all -> 0x0092 }
            goto L_0x00a3
        L_0x0092:
            r0 = move-exception
            goto L_0x0098
        L_0x0094:
            r0 = move-exception
            goto L_0x009d
        L_0x0096:
            r0 = move-exception
            r6 = r1
        L_0x0098:
            r1 = r5
            goto L_0x0151
        L_0x009b:
            r0 = move-exception
            r6 = r1
        L_0x009d:
            r1 = r5
            goto L_0x0148
        L_0x00a0:
            r2 = r1
            r5 = r2
        L_0x00a2:
            r6 = r5
        L_0x00a3:
            m22057d(r5)
            m22057d(r6)
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0109, all -> 0x0106 }
            r5.<init>(r2)     // Catch:{ Exception -> 0x0109, all -> 0x0106 }
            java.lang.String r6 = r8.f16860a     // Catch:{ Exception -> 0x0109, all -> 0x0106 }
            if (r6 == 0) goto L_0x00ba
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0109, all -> 0x0106 }
            java.lang.String r4 = r8.f16860a     // Catch:{ Exception -> 0x0109, all -> 0x0106 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x0109, all -> 0x0106 }
            goto L_0x00cc
        L_0x00ba:
            java.io.FileDescriptor r6 = r8.f16859a     // Catch:{ Exception -> 0x0109, all -> 0x0106 }
            if (r6 == 0) goto L_0x00cb
            int r7 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x0109, all -> 0x0106 }
            android.system.Os.lseek(r6, r3, r7)     // Catch:{ Exception -> 0x0109, all -> 0x0106 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0109, all -> 0x0106 }
            java.io.FileDescriptor r4 = r8.f16859a     // Catch:{ Exception -> 0x0109, all -> 0x0106 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x0109, all -> 0x0106 }
            goto L_0x00cc
        L_0x00cb:
            r3 = r1
        L_0x00cc:
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x0109, all -> 0x0106 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x0109, all -> 0x0106 }
            java.io.BufferedOutputStream r5 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x0102, all -> 0x00fe }
            r5.<init>(r3)     // Catch:{ Exception -> 0x0102, all -> 0x00fe }
            int r3 = r8.f16857a     // Catch:{ Exception -> 0x00fc, all -> 0x00fa }
            r6 = 4
            if (r3 != r6) goto L_0x00df
            r8.mo20756w0(r4, r5)     // Catch:{ Exception -> 0x00fc, all -> 0x00fa }
            goto L_0x00ee
        L_0x00df:
            r6 = 13
            if (r3 != r6) goto L_0x00e7
            r8.mo20758x0(r4, r5)     // Catch:{ Exception -> 0x00fc, all -> 0x00fa }
            goto L_0x00ee
        L_0x00e7:
            r6 = 14
            if (r3 != r6) goto L_0x00ee
            r8.mo20760y0(r4, r5)     // Catch:{ Exception -> 0x00fc, all -> 0x00fa }
        L_0x00ee:
            m22057d(r4)
            m22057d(r5)
            r2.delete()
            r8.f16864a = r1
            return
        L_0x00fa:
            r0 = move-exception
            goto L_0x0100
        L_0x00fc:
            r3 = move-exception
            goto L_0x0104
        L_0x00fe:
            r0 = move-exception
            r5 = r1
        L_0x0100:
            r1 = r4
            goto L_0x0139
        L_0x0102:
            r3 = move-exception
            r5 = r1
        L_0x0104:
            r1 = r4
            goto L_0x010b
        L_0x0106:
            r0 = move-exception
            r5 = r1
            goto L_0x0139
        L_0x0109:
            r3 = move-exception
            r5 = r1
        L_0x010b:
            java.lang.String r4 = r8.f16860a     // Catch:{ all -> 0x0138 }
            if (r4 == 0) goto L_0x0130
            boolean r4 = r2.renameTo(r0)     // Catch:{ all -> 0x0138 }
            if (r4 != 0) goto L_0x0130
            java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x0138 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0138 }
            r4.<init>()     // Catch:{ all -> 0x0138 }
            java.lang.String r6 = "Couldn't restore original file: "
            r4.append(r6)     // Catch:{ all -> 0x0138 }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ all -> 0x0138 }
            r4.append(r0)     // Catch:{ all -> 0x0138 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x0138 }
            r3.<init>(r0)     // Catch:{ all -> 0x0138 }
            throw r3     // Catch:{ all -> 0x0138 }
        L_0x0130:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0138 }
            java.lang.String r4 = "Failed to save new file"
            r0.<init>(r4, r3)     // Catch:{ all -> 0x0138 }
            throw r0     // Catch:{ all -> 0x0138 }
        L_0x0138:
            r0 = move-exception
        L_0x0139:
            m22057d(r1)
            m22057d(r5)
            r2.delete()
            throw r0
        L_0x0143:
            r0 = move-exception
            r6 = r1
            goto L_0x0151
        L_0x0146:
            r0 = move-exception
            r6 = r1
        L_0x0148:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x0150 }
            java.lang.String r3 = "Failed to copy original file to temp file"
            r2.<init>(r3, r0)     // Catch:{ all -> 0x0150 }
            throw r2     // Catch:{ all -> 0x0150 }
        L_0x0150:
            r0 = move-exception
        L_0x0151:
            m22057d(r1)
            m22057d(r6)
            throw r0
        L_0x0158:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "ExifInterface only supports saving attributes on JPEG, PNG, or WebP formats."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.mx0.mo20754v0():void");
    }

    @ts2
    /* renamed from: w */
    public final C2897d mo20755w(@mr2 String str) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        if (f16635d0.equals(str)) {
            if (f16676h) {
                Log.d(f16600b, "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = f16646e0;
        }
        for (int i = 0; i < f16591a.length; i++) {
            C2897d dVar = this.f16865a[i].get(str);
            if (dVar != null) {
                return dVar;
            }
        }
        return null;
    }

    /* renamed from: w0 */
    public final void mo20756w0(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (f16676h) {
            Log.d(f16600b, "saveJpegAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + pl2.f33727d);
        }
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        C2896c cVar = new C2896c(outputStream, ByteOrder.BIG_ENDIAN);
        if (dataInputStream.readByte() == -1) {
            cVar.mo20790b(-1);
            if (dataInputStream.readByte() == -40) {
                cVar.mo20790b(-40);
                C2897d dVar = null;
                if (mo20739o(f16572Y1) != null && this.f16877g) {
                    dVar = this.f16865a[0].remove(f16572Y1);
                }
                cVar.mo20790b(-1);
                cVar.mo20790b(-31);
                mo20707J0(cVar);
                if (dVar != null) {
                    this.f16865a[0].put(f16572Y1, dVar);
                }
                byte[] bArr = new byte[4096];
                while (dataInputStream.readByte() == -1) {
                    byte readByte = dataInputStream.readByte();
                    if (readByte == -39 || readByte == -38) {
                        cVar.mo20790b(-1);
                        cVar.mo20790b(readByte);
                        m22062h(dataInputStream, cVar);
                        return;
                    } else if (readByte != -31) {
                        cVar.mo20790b(-1);
                        cVar.mo20790b(readByte);
                        int readUnsignedShort = dataInputStream.readUnsignedShort();
                        cVar.mo20794h(readUnsignedShort);
                        int i = readUnsignedShort - 2;
                        if (i >= 0) {
                            while (i > 0) {
                                int read = dataInputStream.read(bArr, 0, Math.min(i, 4096));
                                if (read < 0) {
                                    break;
                                }
                                cVar.write(bArr, 0, read);
                                i -= read;
                            }
                        } else {
                            throw new IOException("Invalid length");
                        }
                    } else {
                        int readUnsignedShort2 = dataInputStream.readUnsignedShort() - 2;
                        if (readUnsignedShort2 >= 0) {
                            byte[] bArr2 = new byte[6];
                            if (readUnsignedShort2 >= 6) {
                                if (dataInputStream.read(bArr2) != 6) {
                                    throw new IOException("Invalid exif");
                                } else if (Arrays.equals(bArr2, f16827w)) {
                                    int i2 = readUnsignedShort2 - 6;
                                    if (dataInputStream.skipBytes(i2) != i2) {
                                        throw new IOException("Invalid length");
                                    }
                                }
                            }
                            cVar.mo20790b(-1);
                            cVar.mo20790b(readByte);
                            cVar.mo20794h(readUnsignedShort2 + 2);
                            if (readUnsignedShort2 >= 6) {
                                readUnsignedShort2 -= 6;
                                cVar.write(bArr2);
                            }
                            while (readUnsignedShort2 > 0) {
                                int read2 = dataInputStream.read(bArr, 0, Math.min(readUnsignedShort2, 4096));
                                if (read2 < 0) {
                                    break;
                                }
                                cVar.write(bArr, 0, read2);
                                readUnsignedShort2 -= read2;
                            }
                        } else {
                            throw new IOException("Invalid length");
                        }
                    }
                }
                throw new IOException("Invalid marker");
            }
            throw new IOException("Invalid marker");
        }
        throw new IOException("Invalid marker");
    }

    @hl3({hl3.C2354a.LIBRARY})
    /* renamed from: x */
    public long mo20757x() {
        String o = mo20739o(f16453F1);
        String o2 = mo20739o(f16703j1);
        if (!(o == null || o2 == null)) {
            Pattern pattern = f16586a;
            if (pattern.matcher(o).matches() || pattern.matcher(o2).matches()) {
                try {
                    Date parse = f16582a.parse(o + ' ' + o2, new ParsePosition(0));
                    if (parse == null) {
                        return -1;
                    }
                    return parse.getTime();
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        return -1;
    }

    /* renamed from: x0 */
    public final void mo20758x0(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (f16676h) {
            Log.d(f16600b, "savePngAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + pl2.f33727d);
        }
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        C2896c cVar = new C2896c(outputStream, byteOrder);
        byte[] bArr = f16677h;
        m22063i(dataInputStream, cVar, bArr.length);
        int i = this.f16872e;
        if (i == 0) {
            int readInt = dataInputStream.readInt();
            cVar.mo20791c(readInt);
            m22063i(dataInputStream, cVar, readInt + 4 + 4);
        } else {
            m22063i(dataInputStream, cVar, ((i - bArr.length) - 4) - 4);
            dataInputStream.skipBytes(dataInputStream.readInt() + 4 + 4);
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                C2896c cVar2 = new C2896c(byteArrayOutputStream2, byteOrder);
                mo20707J0(cVar2);
                byte[] byteArray = ((ByteArrayOutputStream) cVar2.f16889a).toByteArray();
                cVar.write(byteArray);
                CRC32 crc32 = new CRC32();
                crc32.update(byteArray, 4, byteArray.length - 4);
                cVar.mo20791c((int) crc32.getValue());
                m22057d(byteArrayOutputStream2);
                m22062h(dataInputStream, cVar);
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream = byteArrayOutputStream2;
                m22057d(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            m22057d(byteArrayOutputStream);
            throw th;
        }
    }

    /* renamed from: y */
    public final void mo20759y(C2895b bVar) throws IOException {
        String str;
        String str2;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                mediaMetadataRetriever.setDataSource(new C2894a(bVar));
            } else {
                FileDescriptor fileDescriptor = this.f16859a;
                if (fileDescriptor != null) {
                    mediaMetadataRetriever.setDataSource(fileDescriptor);
                } else {
                    String str3 = this.f16860a;
                    if (str3 != null) {
                        mediaMetadataRetriever.setDataSource(str3);
                    } else {
                        mediaMetadataRetriever.release();
                        return;
                    }
                }
            }
            String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
            String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
            String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
            String str4 = null;
            if ("yes".equals(extractMetadata3)) {
                str4 = mediaMetadataRetriever.extractMetadata(29);
                str2 = mediaMetadataRetriever.extractMetadata(30);
                str = mediaMetadataRetriever.extractMetadata(31);
            } else if ("yes".equals(extractMetadata4)) {
                str4 = mediaMetadataRetriever.extractMetadata(18);
                str2 = mediaMetadataRetriever.extractMetadata(19);
                str = mediaMetadataRetriever.extractMetadata(24);
            } else {
                str2 = null;
                str = null;
            }
            if (str4 != null) {
                this.f16865a[0].put(f16616c, C2897d.m22162m(Integer.parseInt(str4), this.f16861a));
            }
            if (str2 != null) {
                this.f16865a[0].put(f16629d, C2897d.m22162m(Integer.parseInt(str2), this.f16861a));
            }
            if (str != null) {
                int i = 1;
                int parseInt = Integer.parseInt(str);
                if (parseInt == 90) {
                    i = 6;
                } else if (parseInt == 180) {
                    i = 3;
                } else if (parseInt == 270) {
                    i = 8;
                }
                this.f16865a[0].put(f16674h, C2897d.m22162m(i, this.f16861a));
            }
            if (!(extractMetadata == null || extractMetadata2 == null)) {
                int parseInt2 = Integer.parseInt(extractMetadata);
                int parseInt3 = Integer.parseInt(extractMetadata2);
                if (parseInt3 > 6) {
                    bVar.mo20770d((long) parseInt2);
                    byte[] bArr = new byte[6];
                    if (bVar.read(bArr) == 6) {
                        int i2 = parseInt2 + 6;
                        int i3 = parseInt3 - 6;
                        if (Arrays.equals(bArr, f16827w)) {
                            byte[] bArr2 = new byte[i3];
                            if (bVar.read(bArr2) == i3) {
                                this.f16872e = i2;
                                mo20742p0(bArr2, 0);
                            } else {
                                throw new IOException("Can't read exif");
                            }
                        } else {
                            throw new IOException("Invalid identifier");
                        }
                    } else {
                        throw new IOException("Can't read identifier");
                    }
                } else {
                    throw new IOException("Invalid exif length");
                }
            }
            if (f16676h) {
                Log.d(f16600b, "Heif meta: " + str4 + "x" + str2 + ", rotation " + str);
            }
        } finally {
            mediaMetadataRetriever.release();
        }
    }

    /* renamed from: y0 */
    public final void mo20760y0(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (f16676h) {
            Log.d(f16600b, "saveWebpAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + pl2.f33727d);
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        C2895b bVar = new C2895b(inputStream, byteOrder);
        C2896c cVar = new C2896c(outputStream, byteOrder);
        byte[] bArr = f16719l;
        m22063i(bVar, cVar, bArr.length);
        byte[] bArr2 = f16729m;
        bVar.skipBytes(bArr2.length + 4);
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                C2896c cVar2 = new C2896c(byteArrayOutputStream2, byteOrder);
                int i = this.f16872e;
                if (i != 0) {
                    m22063i(bVar, cVar2, ((i - ((bArr.length + 4) + bArr2.length)) - 4) - 4);
                    bVar.skipBytes(4);
                    bVar.skipBytes(bVar.readInt());
                } else {
                    byte[] bArr3 = new byte[4];
                    if (bVar.read(bArr3) == 4) {
                        byte[] bArr4 = f16759p;
                        if (Arrays.equals(bArr3, bArr4)) {
                            int readInt = bVar.readInt();
                            boolean z = true;
                            byte[] bArr5 = new byte[(readInt % 2 == 1 ? readInt + 1 : readInt)];
                            bVar.read(bArr5);
                            bArr5[0] = (byte) (bArr5[0] | 8);
                            if (((bArr5[0] >> 1) & 1) != 1) {
                                z = false;
                            }
                            cVar2.write(bArr4);
                            cVar2.mo20791c(readInt);
                            cVar2.write(bArr5);
                            if (z) {
                                mo20730j(bVar, cVar2, f16789s, (byte[]) null);
                                while (true) {
                                    byte[] bArr6 = new byte[4];
                                    inputStream.read(bArr6);
                                    if (!Arrays.equals(bArr6, f16799t)) {
                                        break;
                                    }
                                    mo20732k(bVar, cVar2, bArr6);
                                }
                            } else {
                                mo20730j(bVar, cVar2, f16779r, f16769q);
                            }
                        } else {
                            if (Arrays.equals(bArr3, f16779r) || Arrays.equals(bArr3, f16769q)) {
                                throw new IOException("WebP files with only VP8 or VP8L chunks are currently not supported");
                            }
                            m22062h(bVar, cVar2);
                            int size = byteArrayOutputStream2.size();
                            byte[] bArr7 = f16729m;
                            cVar.mo20791c(size + bArr7.length);
                            cVar.write(bArr7);
                            byteArrayOutputStream2.writeTo(cVar);
                            m22057d(byteArrayOutputStream2);
                        }
                    } else {
                        throw new IOException("Encountered invalid length while parsing WebP chunk type");
                    }
                }
                mo20707J0(cVar2);
                m22062h(bVar, cVar2);
                int size2 = byteArrayOutputStream2.size();
                byte[] bArr72 = f16729m;
                cVar.mo20791c(size2 + bArr72.length);
                cVar.write(bArr72);
                byteArrayOutputStream2.writeTo(cVar);
                m22057d(byteArrayOutputStream2);
            } catch (Exception e) {
                e = e;
                byteArrayOutputStream = byteArrayOutputStream2;
                try {
                    throw new IOException("Failed to save WebP file", e);
                } catch (Throwable th) {
                    th = th;
                    m22057d(byteArrayOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream = byteArrayOutputStream2;
                m22057d(byteArrayOutputStream);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            throw new IOException("Failed to save WebP file", e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00f3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x018d A[SYNTHETIC] */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo20761z(com.onedelhi.secure.mx0.C2895b r20, int r21, int r22) throws java.io.IOException {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            boolean r4 = f16676h
            java.lang.String r5 = "ExifInterface"
            if (r4 == 0) goto L_0x0022
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "getJpegAttributes starting with: "
            r4.append(r6)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            android.util.Log.d(r5, r4)
        L_0x0022:
            java.nio.ByteOrder r4 = java.nio.ByteOrder.BIG_ENDIAN
            r1.mo20771g(r4)
            long r6 = (long) r2
            r1.mo20770d(r6)
            byte r4 = r20.readByte()
            java.lang.String r6 = "Invalid marker: "
            r7 = -1
            if (r4 != r7) goto L_0x01d7
            r8 = 1
            int r2 = r2 + r8
            byte r9 = r20.readByte()
            r10 = -40
            if (r9 != r10) goto L_0x01bc
            int r2 = r2 + r8
        L_0x003f:
            byte r4 = r20.readByte()
            if (r4 != r7) goto L_0x019f
            int r2 = r2 + r8
            byte r4 = r20.readByte()
            boolean r6 = f16676h
            if (r6 == 0) goto L_0x0068
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Found JPEG segment indicator: "
            r9.append(r10)
            r10 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r10 = java.lang.Integer.toHexString(r10)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r5, r9)
        L_0x0068:
            int r2 = r2 + r8
            r9 = -39
            if (r4 == r9) goto L_0x0199
            r9 = -38
            if (r4 != r9) goto L_0x0073
            goto L_0x0199
        L_0x0073:
            int r9 = r20.readUnsignedShort()
            int r9 = r9 + -2
            int r2 = r2 + 2
            if (r6 == 0) goto L_0x00a6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r10 = "JPEG segment: "
            r6.append(r10)
            r10 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r10 = java.lang.Integer.toHexString(r10)
            r6.append(r10)
            java.lang.String r10 = " (length: "
            r6.append(r10)
            int r10 = r9 + 2
            r6.append(r10)
            java.lang.String r10 = ")"
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            android.util.Log.d(r5, r6)
        L_0x00a6:
            java.lang.String r6 = "Invalid length"
            if (r9 < 0) goto L_0x0193
            r10 = -31
            r11 = 0
            if (r4 == r10) goto L_0x0128
            r10 = -2
            if (r4 == r10) goto L_0x00fb
            switch(r4) {
                case -64: goto L_0x00c2;
                case -63: goto L_0x00c2;
                case -62: goto L_0x00c2;
                case -61: goto L_0x00c2;
                default: goto L_0x00b5;
            }
        L_0x00b5:
            switch(r4) {
                case -59: goto L_0x00c2;
                case -58: goto L_0x00c2;
                case -57: goto L_0x00c2;
                default: goto L_0x00b8;
            }
        L_0x00b8:
            switch(r4) {
                case -55: goto L_0x00c2;
                case -54: goto L_0x00c2;
                case -53: goto L_0x00c2;
                default: goto L_0x00bb;
            }
        L_0x00bb:
            switch(r4) {
                case -51: goto L_0x00c2;
                case -50: goto L_0x00c2;
                case -49: goto L_0x00c2;
                default: goto L_0x00be;
            }
        L_0x00be:
            r10 = r2
            r2 = 1
            goto L_0x0176
        L_0x00c2:
            int r4 = r1.skipBytes(r8)
            if (r4 != r8) goto L_0x00f3
            java.util.HashMap<java.lang.String, com.onedelhi.secure.mx0$d>[] r4 = r0.f16865a
            r4 = r4[r3]
            int r10 = r20.readUnsignedShort()
            long r10 = (long) r10
            java.nio.ByteOrder r12 = r0.f16861a
            com.onedelhi.secure.mx0$d r10 = com.onedelhi.secure.mx0.C2897d.m22158i(r10, r12)
            java.lang.String r11 = "ImageLength"
            r4.put(r11, r10)
            java.util.HashMap<java.lang.String, com.onedelhi.secure.mx0$d>[] r4 = r0.f16865a
            r4 = r4[r3]
            int r10 = r20.readUnsignedShort()
            long r10 = (long) r10
            java.nio.ByteOrder r12 = r0.f16861a
            com.onedelhi.secure.mx0$d r10 = com.onedelhi.secure.mx0.C2897d.m22158i(r10, r12)
            java.lang.String r11 = "ImageWidth"
            r4.put(r11, r10)
            int r9 = r9 + -5
            goto L_0x00be
        L_0x00f3:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Invalid SOFx"
            r1.<init>(r2)
            throw r1
        L_0x00fb:
            byte[] r4 = new byte[r9]
            int r10 = r1.read(r4)
            if (r10 != r9) goto L_0x0120
            java.lang.String r9 = "UserComment"
            java.lang.String r10 = r0.mo20739o(r9)
            if (r10 != 0) goto L_0x011d
            java.util.HashMap<java.lang.String, com.onedelhi.secure.mx0$d>[] r10 = r0.f16865a
            r10 = r10[r8]
            java.lang.String r12 = new java.lang.String
            java.nio.charset.Charset r13 = f16581a
            r12.<init>(r4, r13)
            com.onedelhi.secure.mx0$d r4 = com.onedelhi.secure.mx0.C2897d.m22157h(r12)
            r10.put(r9, r4)
        L_0x011d:
            r10 = r2
        L_0x011e:
            r2 = 1
            goto L_0x0175
        L_0x0120:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Invalid exif"
            r1.<init>(r2)
            throw r1
        L_0x0128:
            byte[] r4 = new byte[r9]
            r1.readFully(r4)
            int r10 = r2 + r9
            byte[] r12 = f16827w
            boolean r13 = m22051F0(r4, r12)
            if (r13 == 0) goto L_0x0144
            int r13 = r12.length
            int r2 = r2 + r13
            int r12 = r12.length
            byte[] r4 = java.util.Arrays.copyOfRange(r4, r12, r9)
            r0.f16872e = r2
            r0.mo20742p0(r4, r3)
            goto L_0x011e
        L_0x0144:
            byte[] r12 = f16836x
            boolean r13 = m22051F0(r4, r12)
            if (r13 == 0) goto L_0x011e
            int r13 = r12.length
            int r2 = r2 + r13
            int r12 = r12.length
            byte[] r4 = java.util.Arrays.copyOfRange(r4, r12, r9)
            java.lang.String r9 = "Xmp"
            java.lang.String r12 = r0.mo20739o(r9)
            if (r12 != 0) goto L_0x011e
            java.util.HashMap<java.lang.String, com.onedelhi.secure.mx0$d>[] r12 = r0.f16865a
            r12 = r12[r11]
            com.onedelhi.secure.mx0$d r15 = new com.onedelhi.secure.mx0$d
            r14 = 1
            int r13 = r4.length
            long r7 = (long) r2
            r2 = r13
            r13 = r15
            r11 = r15
            r15 = r2
            r16 = r7
            r18 = r4
            r13.<init>(r14, r15, r16, r18)
            r12.put(r9, r11)
            r2 = 1
            r0.f16877g = r2
        L_0x0175:
            r9 = 0
        L_0x0176:
            if (r9 < 0) goto L_0x018d
            int r4 = r1.skipBytes(r9)
            if (r4 != r9) goto L_0x0185
            int r4 = r10 + r9
            r2 = r4
            r7 = -1
            r8 = 1
            goto L_0x003f
        L_0x0185:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Invalid JPEG segment"
            r1.<init>(r2)
            throw r1
        L_0x018d:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r6)
            throw r1
        L_0x0193:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r6)
            throw r1
        L_0x0199:
            java.nio.ByteOrder r2 = r0.f16861a
            r1.mo20771g(r2)
            return
        L_0x019f:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid marker:"
            r2.append(r3)
            r3 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01bc:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            r3 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01d7:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            r3 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.mx0.mo20761z(com.onedelhi.secure.mx0$b, int, int):void");
    }

    /* renamed from: z0 */
    public void mo20762z0(double d) {
        String str = d >= 0.0d ? qa0.f34045b : mm0.f16219f;
        mo20690A0(f16692i1, new C2901h(Math.abs(d)).toString());
        mo20690A0(f16682h1, str);
    }
}
