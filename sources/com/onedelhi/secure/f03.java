package com.onedelhi.secure;

import java.io.IOException;
import java.net.URI;
import java.nio.file.CopyOption;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.UserPrincipal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0016\u001a\r\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\b\u001a\r\u0010\u0003\u001a\u00020\u0002*\u00020\u0000H\b\u001a\u0014\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\u0007\u001a\u0014\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\u0007\u001a\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\u0007\u001a\u001f\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\tH\b\u001a0\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\"\u00020\rH\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a(\u0010\u0012\u001a\u00020\t*\u00020\u00002\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\f\"\u00020\u0011H\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a(\u0010\u0014\u001a\u00020\t*\u00020\u00002\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\f\"\u00020\u0011H\b¢\u0006\u0004\b\u0014\u0010\u0013\u001a(\u0010\u0015\u001a\u00020\t*\u00020\u00002\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\f\"\u00020\u0011H\b¢\u0006\u0004\b\u0015\u0010\u0013\u001a(\u0010\u0016\u001a\u00020\t*\u00020\u00002\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\f\"\u00020\u0011H\b¢\u0006\u0004\b\u0016\u0010\u0013\u001a\r\u0010\u0017\u001a\u00020\t*\u00020\u0000H\b\u001a\r\u0010\u0018\u001a\u00020\t*\u00020\u0000H\b\u001a\r\u0010\u0019\u001a\u00020\t*\u00020\u0000H\b\u001a\r\u0010\u001a\u001a\u00020\t*\u00020\u0000H\b\u001a\r\u0010\u001b\u001a\u00020\t*\u00020\u0000H\b\u001a\u0015\u0010\u001d\u001a\u00020\t*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0000H\b\u001a\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00000\u001f*\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u0002H\u0007\u001aA\u0010%\u001a\u00028\u0000\"\u0004\b\u0000\u0010!*\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u00022\u0018\u0010$\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000#\u0012\u0004\u0012\u00028\u00000\"H\bø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001a.\u0010)\u001a\u00020'*\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u00022\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020'0\"H\bø\u0001\u0000\u001a\r\u0010+\u001a\u00020**\u00020\u0000H\b\u001a\r\u0010,\u001a\u00020'*\u00020\u0000H\b\u001a\r\u0010-\u001a\u00020\t*\u00020\u0000H\b\u001a0\u00100\u001a\u00020\u0000*\u00020\u00002\u001a\u0010/\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030.0\f\"\u0006\u0012\u0002\b\u00030.H\b¢\u0006\u0004\b0\u00101\u001a0\u00102\u001a\u00020\u0000*\u00020\u00002\u001a\u0010/\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030.0\f\"\u0006\u0012\u0002\b\u00030.H\b¢\u0006\u0004\b2\u00101\u001a0\u00103\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\"\u00020\rH\b¢\u0006\u0004\b3\u0010\u0010\u001a\u001f\u00104\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\tH\b\u001a\r\u00106\u001a\u000205*\u00020\u0000H\b\u001a2\u00109\u001a\u0004\u0018\u000108*\u00020\u00002\u0006\u00107\u001a\u00020\u00022\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\f\"\u00020\u0011H\b¢\u0006\u0004\b9\u0010:\u001a:\u0010<\u001a\u00020\u0000*\u00020\u00002\u0006\u00107\u001a\u00020\u00022\b\u0010;\u001a\u0004\u0018\u0001082\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\f\"\u00020\u0011H\b¢\u0006\u0004\b<\u0010=\u001a6\u0010@\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010?\u0018\u0001*\u00020>*\u00020\u00002\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\f\"\u00020\u0011H\b¢\u0006\u0004\b@\u0010A\u001a4\u0010B\u001a\u00028\u0000\"\n\b\u0000\u0010?\u0018\u0001*\u00020>*\u00020\u00002\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\f\"\u00020\u0011H\b¢\u0006\u0004\bB\u0010A\u001a\u001c\u0010G\u001a\u00020F2\u0006\u0010C\u001a\u00020\u00002\n\u0010E\u001a\u0006\u0012\u0002\b\u00030DH\u0001\u001a4\u0010J\u001a\u00028\u0000\"\n\b\u0000\u0010I\u0018\u0001*\u00020H*\u00020\u00002\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\f\"\u00020\u0011H\b¢\u0006\u0004\bJ\u0010K\u001a>\u0010M\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u0001080L*\u00020\u00002\u0006\u0010/\u001a\u00020\u00022\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\f\"\u00020\u0011H\b¢\u0006\u0004\bM\u0010N\u001a(\u0010P\u001a\u00020O*\u00020\u00002\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\f\"\u00020\u0011H\b¢\u0006\u0004\bP\u0010Q\u001a\u0015\u0010R\u001a\u00020\u0000*\u00020\u00002\u0006\u0010;\u001a\u00020OH\b\u001a*\u0010T\u001a\u0004\u0018\u00010S*\u00020\u00002\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\f\"\u00020\u0011H\b¢\u0006\u0004\bT\u0010U\u001a\u0015\u0010V\u001a\u00020\u0000*\u00020\u00002\u0006\u0010;\u001a\u00020SH\b\u001a.\u0010Y\u001a\b\u0012\u0004\u0012\u00020X0W*\u00020\u00002\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\f\"\u00020\u0011H\b¢\u0006\u0004\bY\u0010Z\u001a\u001b\u0010[\u001a\u00020\u0000*\u00020\u00002\f\u0010;\u001a\b\u0012\u0004\u0012\u00020X0WH\b\u001a\u0015\u0010\\\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\b\u001a8\u0010]\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u001a\u0010/\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030.0\f\"\u0006\u0012\u0002\b\u00030.H\b¢\u0006\u0004\b]\u0010^\u001a\r\u0010_\u001a\u00020\u0000*\u00020\u0000H\b\u001a0\u0010`\u001a\u00020\u0000*\u00020\u00002\u001a\u0010/\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030.0\f\"\u0006\u0012\u0002\b\u00030.H\b¢\u0006\u0004\b`\u00101\u001aD\u0010c\u001a\u00020\u00002\n\b\u0002\u0010a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010b\u001a\u0004\u0018\u00010\u00022\u001a\u0010/\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030.0\f\"\u0006\u0012\u0002\b\u00030.H\b¢\u0006\u0004\bc\u0010d\u001aM\u0010f\u001a\u00020\u00002\b\u0010e\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010b\u001a\u0004\u0018\u00010\u00022\u001a\u0010/\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030.0\f\"\u0006\u0012\u0002\b\u00030.H\u0007¢\u0006\u0004\bf\u0010g\u001a8\u0010!\u001a\u00020\u00002\n\b\u0002\u0010a\u001a\u0004\u0018\u00010\u00022\u001a\u0010/\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030.0\f\"\u0006\u0012\u0002\b\u00030.H\b¢\u0006\u0004\b!\u0010h\u001aA\u0010i\u001a\u00020\u00002\b\u0010e\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010a\u001a\u0004\u0018\u00010\u00022\u001a\u0010/\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030.0\f\"\u0006\u0012\u0002\b\u00030.H\u0007¢\u0006\u0004\bi\u0010j\u001a\u0015\u0010k\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0000H\n\u001a\u0015\u0010l\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0002H\n\u001a\u0011\u0010m\u001a\u00020\u00002\u0006\u0010C\u001a\u00020\u0002H\b\u001a,\u0010o\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00022\u0012\u0010n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\f\"\u00020\u0002H\b¢\u0006\u0004\bo\u0010p\u001a\r\u0010r\u001a\u00020\u0000*\u00020qH\b\"\u001e\u0010w\u001a\u00020\u0002*\u00020\u00008FX\u0004¢\u0006\f\u0012\u0004\bu\u0010v\u001a\u0004\bs\u0010t\"\u001e\u0010z\u001a\u00020\u0002*\u00020\u00008FX\u0004¢\u0006\f\u0012\u0004\by\u0010v\u001a\u0004\bx\u0010t\"\u001e\u0010}\u001a\u00020\u0002*\u00020\u00008FX\u0004¢\u0006\f\u0012\u0004\b|\u0010v\u001a\u0004\b{\u0010t\" \u0010\u0001\u001a\u00020\u0002*\u00020\u00008Æ\u0002X\u0004¢\u0006\f\u0012\u0004\b\u0010v\u001a\u0004\b~\u0010t\"!\u0010\u0001\u001a\u00020\u0002*\u00020\u00008FX\u0004¢\u0006\u000e\u0012\u0005\b\u0001\u0010v\u001a\u0005\b\u0001\u0010t\"\"\u0010\u0001\u001a\u00020\u0002*\u00020\u00008Æ\u0002X\u0004¢\u0006\u000e\u0012\u0005\b\u0001\u0010v\u001a\u0005\b\u0001\u0010t\u0002\u0007\n\u0005\b20\u0001¨\u0006\u0001"}, d2 = {"Ljava/nio/file/Path;", "J", "", "K", "base", "U0", "W0", "V0", "target", "", "overwrite", "L", "", "Ljava/nio/file/CopyOption;", "options", "M", "(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)Ljava/nio/file/Path;", "Ljava/nio/file/LinkOption;", "f0", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z", "Q0", "H0", "D0", "J0", "E0", "F0", "G0", "K0", "other", "I0", "glob", "", "L0", "T", "Lkotlin/Function1;", "Lcom/onedelhi/secure/zt3;", "block", "c1", "(Ljava/nio/file/Path;Ljava/lang/String;Lcom/onedelhi/secure/ec1;)Ljava/lang/Object;", "Lcom/onedelhi/secure/un4;", "action", "l0", "", "j0", "b0", "c0", "Ljava/nio/file/attribute/FileAttribute;", "attributes", "P", "(Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "O", "O0", "N0", "Ljava/nio/file/FileStore;", "k0", "attribute", "", "n0", "(Ljava/nio/file/Path;Ljava/lang/String;[Ljava/nio/file/LinkOption;)Ljava/lang/Object;", "value", "X0", "(Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/Object;[Ljava/nio/file/LinkOption;)Ljava/nio/file/Path;", "Ljava/nio/file/attribute/FileAttributeView;", "V", "i0", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/FileAttributeView;", "h0", "path", "Ljava/lang/Class;", "attributeViewClass", "", "g0", "Ljava/nio/file/attribute/BasicFileAttributes;", "A", "R0", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/BasicFileAttributes;", "", "S0", "(Ljava/nio/file/Path;Ljava/lang/String;[Ljava/nio/file/LinkOption;)Ljava/util/Map;", "Ljava/nio/file/attribute/FileTime;", "u0", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/FileTime;", "Y0", "Ljava/nio/file/attribute/UserPrincipal;", "z0", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/UserPrincipal;", "Z0", "", "Ljava/nio/file/attribute/PosixFilePermission;", "C0", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/util/Set;", "a1", "R", "S", "(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "T0", "Q", "prefix", "suffix", "X", "(Ljava/lang/String;Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "directory", "Y", "(Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "(Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "U", "(Ljava/nio/file/Path;Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "e0", "d0", "H", "subpaths", "I", "(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;", "Ljava/net/URI;", "b1", "v0", "(Ljava/nio/file/Path;)Ljava/lang/String;", "getName$annotations", "(Ljava/nio/file/Path;)V", "name", "x0", "getNameWithoutExtension$annotations", "nameWithoutExtension", "o0", "getExtension$annotations", "extension", "A0", "getPathString$annotations", "pathString", "s0", "getInvariantSeparatorsPathString$annotations", "invariantSeparatorsPathString", "q0", "getInvariantSeparatorsPath$annotations", "invariantSeparatorsPath", "kotlin-stdlib-jdk7"}, k = 5, mv = {1, 6, 0}, xs = "kotlin/io/path/PathsKt")
public class f03 extends e03 {
    /* renamed from: A0 */
    public static final String m47361A0(Path path) {
        jt1.m53777p(path, "<this>");
        return path.toString();
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @xq1
    /* renamed from: B0 */
    public static /* synthetic */ void m47362B0(Path path) {
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @xq1
    /* renamed from: C0 */
    public static final Set<PosixFilePermission> m47363C0(Path path, LinkOption... linkOptionArr) throws IOException {
        jt1.m53777p(path, "<this>");
        jt1.m53777p(linkOptionArr, "options");
        Set<PosixFilePermission> posixFilePermissions = Files.getPosixFilePermissions(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        jt1.m53776o(posixFilePermissions, "getPosixFilePermissions(this, *options)");
        return posixFilePermissions;
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @xq1
    /* renamed from: D0 */
    public static final boolean m47364D0(Path path, LinkOption... linkOptionArr) {
        jt1.m53777p(path, "<this>");
        jt1.m53777p(linkOptionArr, "options");
        return Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @xq1
    /* renamed from: E0 */
    public static final boolean m47365E0(Path path) {
        jt1.m53777p(path, "<this>");
        return Files.isExecutable(path);
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @xq1
    /* renamed from: F0 */
    public static final boolean m47366F0(Path path) throws IOException {
        jt1.m53777p(path, "<this>");
        return Files.isHidden(path);
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @xq1
    /* renamed from: G0 */
    public static final boolean m47367G0(Path path) {
        jt1.m53777p(path, "<this>");
        return Files.isReadable(path);
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @xq1
    /* renamed from: H */
    public static final Path m47368H(String str) {
        jt1.m53777p(str, "path");
        Path path = Paths.get(str, new String[0]);
        jt1.m53776o(path, "get(path)");
        return path;
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @xq1
    /* renamed from: H0 */
    public static final boolean m47369H0(Path path, LinkOption... linkOptionArr) {
        jt1.m53777p(path, "<this>");
        jt1.m53777p(linkOptionArr, "options");
        return Files.isRegularFile(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @xq1
    /* renamed from: I */
    public static final Path m47370I(String str, String... strArr) {
        jt1.m53777p(str, "base");
        jt1.m53777p(strArr, "subpaths");
        Path path = Paths.get(str, (String[]) Arrays.copyOf(strArr, strArr.length));
        jt1.m53776o(path, "get(base, *subpaths)");
        return path;
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @xq1
    /* renamed from: I0 */
    public static final boolean m47371I0(Path path, Path path2) throws IOException {
        jt1.m53777p(path, "<this>");
        jt1.m53777p(path2, "other");
        return Files.isSameFile(path, path2);
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @xq1
    /* renamed from: J */
    public static final Path m47372J(Path path) {
        jt1.m53777p(path, "<this>");
        Path absolutePath = path.toAbsolutePath();
        jt1.m53776o(absolutePath, "toAbsolutePath()");
        return absolutePath;
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @xq1
    /* renamed from: J0 */
    public static final boolean m47373J0(Path path) {
        jt1.m53777p(path, "<this>");
        return Files.isSymbolicLink(path);
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @xq1
    /* renamed from: K */
    public static final String m47374K(Path path) {
        jt1.m53777p(path, "<this>");
        return path.toAbsolutePath().toString();
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @xq1
    /* renamed from: K0 */
    public static final boolean m47375K0(Path path) {
        jt1.m53777p(path, "<this>");
        return Files.isWritable(path);
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @xq1
    /* renamed from: L */
    public static final Path m47376L(Path path, Path path2, boolean z) throws IOException {
        jt1.m53777p(path, "<this>");
        jt1.m53777p(path2, "target");
        CopyOption[] copyOptionArr = z ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path copy = Files.copy(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        jt1.m53776o(copy, "copy(this, target, *options)");
        return copy;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        com.onedelhi.secure.C5630hz.m51313a(r1, r2);
     */
    @com.onedelhi.secure.vr2
    @com.onedelhi.secure.gz3(version = "1.5")
    @com.onedelhi.secure.tw4(markerClass = {com.onedelhi.secure.iy0.class})
    /* renamed from: L0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List<java.nio.file.Path> m47377L0(@com.onedelhi.secure.vr2 java.nio.file.Path r1, @com.onedelhi.secure.vr2 java.lang.String r2) throws java.io.IOException {
        /*
            java.lang.String r0 = "<this>"
            com.onedelhi.secure.jt1.m53777p(r1, r0)
            java.lang.String r0 = "glob"
            com.onedelhi.secure.jt1.m53777p(r2, r0)
            java.nio.file.DirectoryStream r1 = java.nio.file.Files.newDirectoryStream(r1, r2)
            java.lang.String r2 = "it"
            com.onedelhi.secure.jt1.m53776o(r1, r2)     // Catch:{ all -> 0x001c }
            java.util.List r2 = com.onedelhi.secure.a10.m35769Q5(r1)     // Catch:{ all -> 0x001c }
            r0 = 0
            com.onedelhi.secure.C5630hz.m51313a(r1, r0)
            return r2
        L_0x001c:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x001e }
        L_0x001e:
            r0 = move-exception
            com.onedelhi.secure.C5630hz.m51313a(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.f03.m47377L0(java.nio.file.Path, java.lang.String):java.util.List");
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @xq1
    /* renamed from: M */
    public static final Path m47378M(Path path, Path path2, CopyOption... copyOptionArr) throws IOException {
        jt1.m53777p(path, "<this>");
        jt1.m53777p(path2, "target");
        jt1.m53777p(copyOptionArr, "options");
        Path copy = Files.copy(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        jt1.m53776o(copy, "copy(this, target, *options)");
        return copy;
    }

    /* renamed from: M0 */
    public static /* synthetic */ List m47379M0(Path path, String str, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            str = "*";
        }
        return m47377L0(path, str);
    }

    /* renamed from: N */
    public static /* synthetic */ Path m47380N(Path path, Path path2, boolean z, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            z = false;
        }
        jt1.m53777p(path, "<this>");
        jt1.m53777p(path2, "target");
        CopyOption[] copyOptionArr = z ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path copy = Files.copy(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        jt1.m53776o(copy, "copy(this, target, *options)");
        return copy;
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @xq1
    /* renamed from: N0 */
    public static final Path m47381N0(Path path, Path path2, boolean z) throws IOException {
        jt1.m53777p(path, "<this>");
        jt1.m53777p(path2, "target");
        CopyOption[] copyOptionArr = z ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path move = Files.move(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        jt1.m53776o(move, "move(this, target, *options)");
        return move;
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @xq1
    /* renamed from: O */
    public static final Path m47382O(Path path, FileAttribute<?>... fileAttributeArr) throws IOException {
        jt1.m53777p(path, "<this>");
        jt1.m53777p(fileAttributeArr, "attributes");
        Path createDirectories = Files.createDirectories(path, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        jt1.m53776o(createDirectories, "createDirectories(this, *attributes)");
        return createDirectories;
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @xq1
    /* renamed from: O0 */
    public static final Path m47383O0(Path path, Path path2, CopyOption... copyOptionArr) throws IOException {
        jt1.m53777p(path, "<this>");
        jt1.m53777p(path2, "target");
        jt1.m53777p(copyOptionArr, "options");
        Path move = Files.move(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        jt1.m53776o(move, "move(this, target, *options)");
        return move;
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @xq1
    /* renamed from: P */
    public static final Path m47384P(Path path, FileAttribute<?>... fileAttributeArr) throws IOException {
        jt1.m53777p(path, "<this>");
        jt1.m53777p(fileAttributeArr, "attributes");
        Path createDirectory = Files.createDirectory(path, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        jt1.m53776o(createDirectory, "createDirectory(this, *attributes)");
        return createDirectory;
    }

    /* renamed from: P0 */
    public static /* synthetic */ Path m47385P0(Path path, Path path2, boolean z, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            z = false;
        }
        jt1.m53777p(path, "<this>");
        jt1.m53777p(path2, "target");
        CopyOption[] copyOptionArr = z ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path move = Files.move(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        jt1.m53776o(move, "move(this, target, *options)");
        return move;
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @xq1
    /* renamed from: Q */
    public static final Path m47386Q(Path path, FileAttribute<?>... fileAttributeArr) throws IOException {
        jt1.m53777p(path, "<this>");
        jt1.m53777p(fileAttributeArr, "attributes");
        Path createFile = Files.createFile(path, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        jt1.m53776o(createFile, "createFile(this, *attributes)");
        return createFile;
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @xq1
    /* renamed from: Q0 */
    public static final boolean m47387Q0(Path path, LinkOption... linkOptionArr) {
        jt1.m53777p(path, "<this>");
        jt1.m53777p(linkOptionArr, "options");
        return Files.notExists(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @xq1
    /* renamed from: R */
    public static final Path m47388R(Path path, Path path2) throws IOException {
        jt1.m53777p(path, "<this>");
        jt1.m53777p(path2, "target");
        Path createLink = Files.createLink(path, path2);
        jt1.m53776o(createLink, "createLink(this, target)");
        return createLink;
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @xq1
    /* renamed from: R0 */
    public static final /* synthetic */ <A extends BasicFileAttributes> A m47389R0(Path path, LinkOption... linkOptionArr) throws IOException {
        jt1.m53777p(path, "<this>");
        jt1.m53777p(linkOptionArr, "options");
        jt1.m53786y(4, mx0.f16724l2);
        A readAttributes = Files.readAttributes(path, BasicFileAttributes.class, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        jt1.m53776o(readAttributes, "readAttributes(this, A::class.java, *options)");
        return readAttributes;
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @xq1
    /* renamed from: S */
    public static final Path m47390S(Path path, Path path2, FileAttribute<?>... fileAttributeArr) throws IOException {
        jt1.m53777p(path, "<this>");
        jt1.m53777p(path2, "target");
        jt1.m53777p(fileAttributeArr, "attributes");
        Path createSymbolicLink = Files.createSymbolicLink(path, path2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        jt1.m53776o(createSymbolicLink, "createSymbolicLink(this, target, *attributes)");
        return createSymbolicLink;
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @xq1
    /* renamed from: S0 */
    public static final Map<String, Object> m47391S0(Path path, String str, LinkOption... linkOptionArr) throws IOException {
        jt1.m53777p(path, "<this>");
        jt1.m53777p(str, "attributes");
        jt1.m53777p(linkOptionArr, "options");
        Map<String, Object> readAttributes = Files.readAttributes(path, str, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        jt1.m53776o(readAttributes, "readAttributes(this, attributes, *options)");
        return readAttributes;
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @xq1
    /* renamed from: T */
    public static final Path m47392T(String str, FileAttribute<?>... fileAttributeArr) throws IOException {
        jt1.m53777p(fileAttributeArr, "attributes");
        Path createTempDirectory = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        jt1.m53776o(createTempDirectory, "createTempDirectory(prefix, *attributes)");
        return createTempDirectory;
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @xq1
    /* renamed from: T0 */
    public static final Path m47393T0(Path path) throws IOException {
        jt1.m53777p(path, "<this>");
        Path readSymbolicLink = Files.readSymbolicLink(path);
        jt1.m53776o(readSymbolicLink, "readSymbolicLink(this)");
        return readSymbolicLink;
    }

    @vr2
    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    /* renamed from: U */
    public static final Path m47394U(@ss2 Path path, @ss2 String str, @vr2 FileAttribute<?>... fileAttributeArr) throws IOException {
        String str2;
        Path path2;
        jt1.m53777p(fileAttributeArr, "attributes");
        if (path != null) {
            path2 = Files.createTempDirectory(path, str, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
            str2 = "createTempDirectory(dire…ory, prefix, *attributes)";
        } else {
            path2 = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
            str2 = "createTempDirectory(prefix, *attributes)";
        }
        jt1.m53776o(path2, str2);
        return path2;
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @vr2
    /* renamed from: U0 */
    public static final Path m47395U0(@vr2 Path path, @vr2 Path path2) {
        jt1.m53777p(path, "<this>");
        jt1.m53777p(path2, "base");
        try {
            return a03.f25687a.mo30380a(path, path2);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage() + "\nthis path: " + path + "\nbase path: " + path2, e);
        }
    }

    /* renamed from: V */
    public static /* synthetic */ Path m47396V(String str, FileAttribute[] fileAttributeArr, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            str = null;
        }
        jt1.m53777p(fileAttributeArr, "attributes");
        Path createTempDirectory = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        jt1.m53776o(createTempDirectory, "createTempDirectory(prefix, *attributes)");
        return createTempDirectory;
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @ss2
    /* renamed from: V0 */
    public static final Path m47397V0(@vr2 Path path, @vr2 Path path2) {
        jt1.m53777p(path, "<this>");
        jt1.m53777p(path2, "base");
        try {
            return a03.f25687a.mo30380a(path, path2);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: W */
    public static /* synthetic */ Path m47398W(Path path, String str, FileAttribute[] fileAttributeArr, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            str = null;
        }
        return m47394U(path, str, fileAttributeArr);
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @vr2
    /* renamed from: W0 */
    public static final Path m47399W0(@vr2 Path path, @vr2 Path path2) {
        jt1.m53777p(path, "<this>");
        jt1.m53777p(path2, "base");
        Path V0 = m47397V0(path, path2);
        return V0 == null ? path : V0;
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @xq1
    /* renamed from: X */
    public static final Path m47400X(String str, String str2, FileAttribute<?>... fileAttributeArr) throws IOException {
        jt1.m53777p(fileAttributeArr, "attributes");
        Path createTempFile = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        jt1.m53776o(createTempFile, "createTempFile(prefix, suffix, *attributes)");
        return createTempFile;
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @xq1
    /* renamed from: X0 */
    public static final Path m47401X0(Path path, String str, Object obj, LinkOption... linkOptionArr) throws IOException {
        jt1.m53777p(path, "<this>");
        jt1.m53777p(str, "attribute");
        jt1.m53777p(linkOptionArr, "options");
        Path attribute = Files.setAttribute(path, str, obj, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        jt1.m53776o(attribute, "setAttribute(this, attribute, value, *options)");
        return attribute;
    }

    @vr2
    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    /* renamed from: Y */
    public static final Path m47402Y(@ss2 Path path, @ss2 String str, @ss2 String str2, @vr2 FileAttribute<?>... fileAttributeArr) throws IOException {
        String str3;
        Path path2;
        jt1.m53777p(fileAttributeArr, "attributes");
        if (path != null) {
            path2 = Files.createTempFile(path, str, str2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
            str3 = "createTempFile(directory…fix, suffix, *attributes)";
        } else {
            path2 = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
            str3 = "createTempFile(prefix, suffix, *attributes)";
        }
        jt1.m53776o(path2, str3);
        return path2;
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @xq1
    /* renamed from: Y0 */
    public static final Path m47403Y0(Path path, FileTime fileTime) throws IOException {
        jt1.m53777p(path, "<this>");
        jt1.m53777p(fileTime, "value");
        Path lastModifiedTime = Files.setLastModifiedTime(path, fileTime);
        jt1.m53776o(lastModifiedTime, "setLastModifiedTime(this, value)");
        return lastModifiedTime;
    }

    /* renamed from: Z */
    public static /* synthetic */ Path m47404Z(String str, String str2, FileAttribute[] fileAttributeArr, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        jt1.m53777p(fileAttributeArr, "attributes");
        Path createTempFile = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        jt1.m53776o(createTempFile, "createTempFile(prefix, suffix, *attributes)");
        return createTempFile;
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @xq1
    /* renamed from: Z0 */
    public static final Path m47405Z0(Path path, UserPrincipal userPrincipal) throws IOException {
        jt1.m53777p(path, "<this>");
        jt1.m53777p(userPrincipal, "value");
        Path owner = Files.setOwner(path, userPrincipal);
        jt1.m53776o(owner, "setOwner(this, value)");
        return owner;
    }

    /* renamed from: a0 */
    public static /* synthetic */ Path m47406a0(Path path, String str, String str2, FileAttribute[] fileAttributeArr, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        return m47402Y(path, str, str2, fileAttributeArr);
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @xq1
    /* renamed from: a1 */
    public static final Path m47407a1(Path path, Set<? extends PosixFilePermission> set) throws IOException {
        jt1.m53777p(path, "<this>");
        jt1.m53777p(set, "value");
        Path posixFilePermissions = Files.setPosixFilePermissions(path, set);
        jt1.m53776o(posixFilePermissions, "setPosixFilePermissions(this, value)");
        return posixFilePermissions;
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @xq1
    /* renamed from: b0 */
    public static final void m47408b0(Path path) throws IOException {
        jt1.m53777p(path, "<this>");
        Files.delete(path);
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @xq1
    /* renamed from: b1 */
    public static final Path m47409b1(URI uri) {
        jt1.m53777p(uri, "<this>");
        Path path = Paths.get(uri);
        jt1.m53776o(path, "get(this)");
        return path;
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @xq1
    /* renamed from: c0 */
    public static final boolean m47410c0(Path path) throws IOException {
        jt1.m53777p(path, "<this>");
        return Files.deleteIfExists(path);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0038, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
        com.onedelhi.secure.uq1.m67403d(1);
        com.onedelhi.secure.C5630hz.m51313a(r1, r3);
        com.onedelhi.secure.uq1.m67402c(1);
     */
    @com.onedelhi.secure.gz3(version = "1.5")
    @com.onedelhi.secure.tw4(markerClass = {com.onedelhi.secure.iy0.class})
    @com.onedelhi.secure.xq1
    /* renamed from: c1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> T m47411c1(java.nio.file.Path r1, java.lang.String r2, com.onedelhi.secure.ec1<? super com.onedelhi.secure.zt3<? extends java.nio.file.Path>, ? extends T> r3) throws java.io.IOException {
        /*
            java.lang.String r0 = "<this>"
            com.onedelhi.secure.jt1.m53777p(r1, r0)
            java.lang.String r0 = "glob"
            com.onedelhi.secure.jt1.m53777p(r2, r0)
            java.lang.String r0 = "block"
            com.onedelhi.secure.jt1.m53777p(r3, r0)
            java.nio.file.DirectoryStream r1 = java.nio.file.Files.newDirectoryStream(r1, r2)
            r2 = 1
            java.lang.String r0 = "it"
            com.onedelhi.secure.jt1.m53776o(r1, r0)     // Catch:{ all -> 0x002c }
            com.onedelhi.secure.zt3 r0 = com.onedelhi.secure.a10.m35912v1(r1)     // Catch:{ all -> 0x002c }
            java.lang.Object r3 = r3.mo17094X(r0)     // Catch:{ all -> 0x002c }
            com.onedelhi.secure.uq1.m67403d(r2)
            r0 = 0
            com.onedelhi.secure.C5630hz.m51313a(r1, r0)
            com.onedelhi.secure.uq1.m67402c(r2)
            return r3
        L_0x002c:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x002e }
        L_0x002e:
            r0 = move-exception
            com.onedelhi.secure.uq1.m67403d(r2)
            com.onedelhi.secure.C5630hz.m51313a(r1, r3)
            com.onedelhi.secure.uq1.m67402c(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.f03.m47411c1(java.nio.file.Path, java.lang.String, com.onedelhi.secure.ec1):java.lang.Object");
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @xq1
    /* renamed from: d0 */
    public static final Path m47412d0(Path path, String str) {
        jt1.m53777p(path, "<this>");
        jt1.m53777p(str, "other");
        Path resolve = path.resolve(str);
        jt1.m53776o(resolve, "this.resolve(other)");
        return resolve;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        com.onedelhi.secure.uq1.m67403d(1);
        com.onedelhi.secure.C5630hz.m51313a(r0, r1);
        com.onedelhi.secure.uq1.m67402c(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
        throw r2;
     */
    /* renamed from: d1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object m47413d1(java.nio.file.Path r0, java.lang.String r1, com.onedelhi.secure.ec1 r2, int r3, java.lang.Object r4) throws java.io.IOException {
        /*
            r4 = 1
            r3 = r3 & r4
            if (r3 == 0) goto L_0x0006
            java.lang.String r1 = "*"
        L_0x0006:
            java.lang.String r3 = "<this>"
            com.onedelhi.secure.jt1.m53777p(r0, r3)
            java.lang.String r3 = "glob"
            com.onedelhi.secure.jt1.m53777p(r1, r3)
            java.lang.String r3 = "block"
            com.onedelhi.secure.jt1.m53777p(r2, r3)
            java.nio.file.DirectoryStream r0 = java.nio.file.Files.newDirectoryStream(r0, r1)
            r1 = 0
            java.lang.String r3 = "it"
            com.onedelhi.secure.jt1.m53776o(r0, r3)     // Catch:{ all -> 0x0031 }
            com.onedelhi.secure.zt3 r3 = com.onedelhi.secure.a10.m35912v1(r0)     // Catch:{ all -> 0x0031 }
            java.lang.Object r2 = r2.mo17094X(r3)     // Catch:{ all -> 0x0031 }
            com.onedelhi.secure.uq1.m67403d(r4)
            com.onedelhi.secure.C5630hz.m51313a(r0, r1)
            com.onedelhi.secure.uq1.m67402c(r4)
            return r2
        L_0x0031:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0033 }
        L_0x0033:
            r2 = move-exception
            com.onedelhi.secure.uq1.m67403d(r4)
            com.onedelhi.secure.C5630hz.m51313a(r0, r1)
            com.onedelhi.secure.uq1.m67402c(r4)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.f03.m47413d1(java.nio.file.Path, java.lang.String, com.onedelhi.secure.ec1, int, java.lang.Object):java.lang.Object");
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @xq1
    /* renamed from: e0 */
    public static final Path m47414e0(Path path, Path path2) {
        jt1.m53777p(path, "<this>");
        jt1.m53777p(path2, "other");
        Path resolve = path.resolve(path2);
        jt1.m53776o(resolve, "this.resolve(other)");
        return resolve;
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @xq1
    /* renamed from: f0 */
    public static final boolean m47415f0(Path path, LinkOption... linkOptionArr) {
        jt1.m53777p(path, "<this>");
        jt1.m53777p(linkOptionArr, "options");
        return Files.exists(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    @vr2
    @z73
    /* renamed from: g0 */
    public static final Void m47416g0(@vr2 Path path, @vr2 Class<?> cls) {
        jt1.m53777p(path, "path");
        jt1.m53777p(cls, "attributeViewClass");
        throw new UnsupportedOperationException("The desired attribute view type " + cls + " is not available for the file " + path + '.');
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @xq1
    /* renamed from: h0 */
    public static final /* synthetic */ <V extends FileAttributeView> V m47417h0(Path path, LinkOption... linkOptionArr) {
        jt1.m53777p(path, "<this>");
        jt1.m53777p(linkOptionArr, "options");
        jt1.m53786y(4, mx0.f16734m2);
        V fileAttributeView = Files.getFileAttributeView(path, FileAttributeView.class, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        if (fileAttributeView != null) {
            return fileAttributeView;
        }
        jt1.m53786y(4, mx0.f16734m2);
        m47416g0(path, FileAttributeView.class);
        throw new b02();
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @xq1
    /* renamed from: i0 */
    public static final /* synthetic */ <V extends FileAttributeView> V m47418i0(Path path, LinkOption... linkOptionArr) {
        jt1.m53777p(path, "<this>");
        jt1.m53777p(linkOptionArr, "options");
        jt1.m53786y(4, mx0.f16734m2);
        return Files.getFileAttributeView(path, FileAttributeView.class, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @xq1
    /* renamed from: j0 */
    public static final long m47419j0(Path path) throws IOException {
        jt1.m53777p(path, "<this>");
        return Files.size(path);
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @xq1
    /* renamed from: k0 */
    public static final FileStore m47420k0(Path path) throws IOException {
        jt1.m53777p(path, "<this>");
        FileStore fileStore = Files.getFileStore(path);
        jt1.m53776o(fileStore, "getFileStore(this)");
        return fileStore;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003b, code lost:
        com.onedelhi.secure.uq1.m67403d(1);
        com.onedelhi.secure.C5630hz.m51313a(r2, r4);
        com.onedelhi.secure.uq1.m67402c(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0044, code lost:
        throw r0;
     */
    @com.onedelhi.secure.gz3(version = "1.5")
    @com.onedelhi.secure.tw4(markerClass = {com.onedelhi.secure.iy0.class})
    @com.onedelhi.secure.xq1
    /* renamed from: l0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m47421l0(java.nio.file.Path r2, java.lang.String r3, com.onedelhi.secure.ec1<? super java.nio.file.Path, com.onedelhi.secure.un4> r4) throws java.io.IOException {
        /*
            java.lang.String r0 = "<this>"
            com.onedelhi.secure.jt1.m53777p(r2, r0)
            java.lang.String r0 = "glob"
            com.onedelhi.secure.jt1.m53777p(r3, r0)
            java.lang.String r0 = "action"
            com.onedelhi.secure.jt1.m53777p(r4, r0)
            java.nio.file.DirectoryStream r2 = java.nio.file.Files.newDirectoryStream(r2, r3)
            r3 = 1
            java.lang.String r0 = "it"
            com.onedelhi.secure.jt1.m53776o(r2, r0)     // Catch:{ all -> 0x0038 }
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x0038 }
        L_0x001d:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0038 }
            if (r1 == 0) goto L_0x002b
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0038 }
            r4.mo17094X(r1)     // Catch:{ all -> 0x0038 }
            goto L_0x001d
        L_0x002b:
            com.onedelhi.secure.un4 r4 = com.onedelhi.secure.un4.f36206a     // Catch:{ all -> 0x0038 }
            com.onedelhi.secure.uq1.m67403d(r3)
            r4 = 0
            com.onedelhi.secure.C5630hz.m51313a(r2, r4)
            com.onedelhi.secure.uq1.m67402c(r3)
            return
        L_0x0038:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x003a }
        L_0x003a:
            r0 = move-exception
            com.onedelhi.secure.uq1.m67403d(r3)
            com.onedelhi.secure.C5630hz.m51313a(r2, r4)
            com.onedelhi.secure.uq1.m67402c(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.f03.m47421l0(java.nio.file.Path, java.lang.String, com.onedelhi.secure.ec1):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
        com.onedelhi.secure.uq1.m67403d(1);
        com.onedelhi.secure.C5630hz.m51313a(r1, r2);
        com.onedelhi.secure.uq1.m67402c(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
        throw r3;
     */
    /* renamed from: m0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void m47422m0(java.nio.file.Path r1, java.lang.String r2, com.onedelhi.secure.ec1 r3, int r4, java.lang.Object r5) throws java.io.IOException {
        /*
            r5 = 1
            r4 = r4 & r5
            if (r4 == 0) goto L_0x0006
            java.lang.String r2 = "*"
        L_0x0006:
            java.lang.String r4 = "<this>"
            com.onedelhi.secure.jt1.m53777p(r1, r4)
            java.lang.String r4 = "glob"
            com.onedelhi.secure.jt1.m53777p(r2, r4)
            java.lang.String r4 = "action"
            com.onedelhi.secure.jt1.m53777p(r3, r4)
            java.nio.file.DirectoryStream r1 = java.nio.file.Files.newDirectoryStream(r1, r2)
            r2 = 0
            java.lang.String r4 = "it"
            com.onedelhi.secure.jt1.m53776o(r1, r4)     // Catch:{ all -> 0x003d }
            java.util.Iterator r4 = r1.iterator()     // Catch:{ all -> 0x003d }
        L_0x0023:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x0031
            java.lang.Object r0 = r4.next()     // Catch:{ all -> 0x003d }
            r3.mo17094X(r0)     // Catch:{ all -> 0x003d }
            goto L_0x0023
        L_0x0031:
            com.onedelhi.secure.un4 r3 = com.onedelhi.secure.un4.f36206a     // Catch:{ all -> 0x003d }
            com.onedelhi.secure.uq1.m67403d(r5)
            com.onedelhi.secure.C5630hz.m51313a(r1, r2)
            com.onedelhi.secure.uq1.m67402c(r5)
            return
        L_0x003d:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x003f }
        L_0x003f:
            r3 = move-exception
            com.onedelhi.secure.uq1.m67403d(r5)
            com.onedelhi.secure.C5630hz.m51313a(r1, r2)
            com.onedelhi.secure.uq1.m67402c(r5)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.f03.m47422m0(java.nio.file.Path, java.lang.String, com.onedelhi.secure.ec1, int, java.lang.Object):void");
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @xq1
    /* renamed from: n0 */
    public static final Object m47423n0(Path path, String str, LinkOption... linkOptionArr) throws IOException {
        jt1.m53777p(path, "<this>");
        jt1.m53777p(str, "attribute");
        jt1.m53777p(linkOptionArr, "options");
        return Files.getAttribute(path, str, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    @vr2
    /* renamed from: o0 */
    public static final String m47424o0(@vr2 Path path) {
        jt1.m53777p(path, "<this>");
        Path fileName = path.getFileName();
        return fileName == null ? "" : u54.m66668q5(fileName.toString(), '.', "");
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    /* renamed from: p0 */
    public static /* synthetic */ void m47425p0(Path path) {
    }

    /* renamed from: q0 */
    public static final String m47426q0(Path path) {
        jt1.m53777p(path, "<this>");
        return m47428s0(path);
    }

    @xj0(level = ak0.ERROR, message = "Use invariantSeparatorsPathString property instead.", replaceWith = @oi3(expression = "invariantSeparatorsPathString", imports = {}))
    @gz3(version = "1.4")
    @iy0
    @xq1
    /* renamed from: r0 */
    public static /* synthetic */ void m47427r0(Path path) {
    }

    @vr2
    /* renamed from: s0 */
    public static final String m47428s0(@vr2 Path path) {
        jt1.m53777p(path, "<this>");
        String separator = path.getFileSystem().getSeparator();
        if (jt1.m53768g(separator, "/")) {
            return path.toString();
        }
        String obj = path.toString();
        jt1.m53776o(separator, "separator");
        return t54.m65446k2(obj, separator, "/", false, 4, (Object) null);
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    /* renamed from: t0 */
    public static /* synthetic */ void m47429t0(Path path) {
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @xq1
    /* renamed from: u0 */
    public static final FileTime m47430u0(Path path, LinkOption... linkOptionArr) throws IOException {
        jt1.m53777p(path, "<this>");
        jt1.m53777p(linkOptionArr, "options");
        FileTime lastModifiedTime = Files.getLastModifiedTime(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        jt1.m53776o(lastModifiedTime, "getLastModifiedTime(this, *options)");
        return lastModifiedTime;
    }

    @vr2
    /* renamed from: v0 */
    public static final String m47431v0(@vr2 Path path) {
        jt1.m53777p(path, "<this>");
        Path fileName = path.getFileName();
        String obj = fileName == null ? null : fileName.toString();
        return obj == null ? "" : obj;
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    /* renamed from: w0 */
    public static /* synthetic */ void m47432w0(Path path) {
    }

    @vr2
    /* renamed from: x0 */
    public static final String m47433x0(@vr2 Path path) {
        jt1.m53777p(path, "<this>");
        Path fileName = path.getFileName();
        return fileName == null ? "" : u54.m66535B5(fileName.toString(), ".", (String) null, 2, (Object) null);
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    /* renamed from: y0 */
    public static /* synthetic */ void m47434y0(Path path) {
    }

    @gz3(version = "1.5")
    @tw4(markerClass = {iy0.class})
    @xq1
    /* renamed from: z0 */
    public static final UserPrincipal m47435z0(Path path, LinkOption... linkOptionArr) throws IOException {
        jt1.m53777p(path, "<this>");
        jt1.m53777p(linkOptionArr, "options");
        return Files.getOwner(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }
}
