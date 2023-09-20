package com.onedelhi.secure;

import com.onedelhi.secure.b90;
import com.onedelhi.secure.l82;
import com.onedelhi.secure.ru1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\r\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0004~´\u0001zB\u0012\u0012\u0007\u0010Ì\u0001\u001a\u00020\"¢\u0006\u0006\bÍ\u0001\u0010Î\u0001J.\u0010\f\u001a\u00020\u000b\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\b¢\u0006\u0004\b\f\u0010\rJ&\u0010\u0012\u001a\u00020\u00112\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u000b0\u000eH\b¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\t2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u0019H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010#\u001a\u00020\"2\u0006\u0010\u0015\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b#\u0010$J!\u0010%\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b'\u0010\rJ\u0017\u0010(\u001a\u00020\"2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b(\u0010)J\u001d\u0010*\u001a\u00020\u000b*\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b*\u0010\rJ\u0019\u0010,\u001a\u00020+2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b,\u0010-J@\u00103\u001a\u00020\u00052'\u00101\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u000ej\u0002`02\u0006\u00102\u001a\u00020\"H\u0002¢\u0006\u0004\b3\u00104J'\u00107\u001a\u00020\"2\u0006\u00105\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u00106\u001a\u00020\u0005H\u0002¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u000209H\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0005H\u0002¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\"H\u0002¢\u0006\u0004\b>\u0010?J\u0013\u0010@\u001a\u00020\u000bH@ø\u0001\u0000¢\u0006\u0004\b@\u0010AJ\u001b\u0010B\u001a\u0004\u0018\u00010\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\bB\u0010CJ\u0019\u0010D\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\bD\u0010EJ\u001b\u0010F\u001a\u0004\u0018\u00010\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\bF\u0010CJ\u0019\u0010G\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0015\u001a\u00020 H\u0002¢\u0006\u0004\bG\u0010HJ\u001f\u0010I\u001a\u00020\"2\u0006\u0010\u0015\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\tH\u0002¢\u0006\u0004\bI\u0010JJ%\u0010K\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\bK\u0010LJ#\u0010M\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0015\u001a\u00020 2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\bM\u0010NJ\u0019\u0010P\u001a\u0004\u0018\u00010O2\u0006\u0010\u0015\u001a\u00020 H\u0002¢\u0006\u0004\bP\u0010QJ*\u0010S\u001a\u00020\"2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010R\u001a\u00020O2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000fH\u0010¢\u0006\u0004\bS\u0010TJ)\u0010V\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010U\u001a\u00020O2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\bV\u0010WJ\u0015\u0010Y\u001a\u0004\u0018\u00010O*\u00020XH\u0002¢\u0006\u0004\bY\u0010ZJ\u0019\u0010\\\u001a\u00020[2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\\\u0010]J\u0015\u0010^\u001a\u0004\u0018\u00010\u000fH@ø\u0001\u0000¢\u0006\u0004\b^\u0010AJ\u0019\u0010`\u001a\u00020\u000b2\b\u0010_\u001a\u0004\u0018\u00010\u0001H\u0004¢\u0006\u0004\b`\u0010aJ\r\u0010b\u001a\u00020\"¢\u0006\u0004\bb\u0010?J\u000f\u0010c\u001a\u00020\u000bH\u0014¢\u0006\u0004\bc\u0010dJ\u0011\u0010g\u001a\u00060ej\u0002`f¢\u0006\u0004\bg\u0010hJ#\u0010j\u001a\u00060ej\u0002`f*\u00020\t2\n\b\u0002\u0010i\u001a\u0004\u0018\u00010[H\u0004¢\u0006\u0004\bj\u0010kJ6\u0010m\u001a\u00020l2'\u00101\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u000ej\u0002`0¢\u0006\u0004\bm\u0010nJF\u0010p\u001a\u00020l2\u0006\u00102\u001a\u00020\"2\u0006\u0010o\u001a\u00020\"2'\u00101\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u000ej\u0002`0¢\u0006\u0004\bp\u0010qJ\u0013\u0010r\u001a\u00020\u000bH@ø\u0001\u0000¢\u0006\u0004\br\u0010AJB\u0010w\u001a\u00020\u000b\"\u0004\b\u0000\u0010s2\f\u0010u\u001a\b\u0012\u0004\u0012\u00028\u00000t2\u001c\u0010\u0010\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000v\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000eø\u0001\u0000¢\u0006\u0004\bw\u0010xJ\u0017\u0010y\u001a\u00020\u000b2\u0006\u00106\u001a\u00020\u0005H\u0000¢\u0006\u0004\by\u0010=J\u001f\u0010z\u001a\u00020\u000b2\u000e\u0010\n\u001a\n\u0018\u00010ej\u0004\u0018\u0001`fH\u0016¢\u0006\u0004\bz\u0010{J\u000f\u0010|\u001a\u00020[H\u0014¢\u0006\u0004\b|\u0010}J\u0019\u0010~\u001a\u00020\"2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b~\u0010)J\u0018\u0010\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0005\b\u0010\u0001J\u0019\u0010\u0001\u001a\u00020\u000b2\u0007\u0010\u0001\u001a\u00020\u0003¢\u0006\u0006\b\u0001\u0010\u0001J\u0019\u0010\u0001\u001a\u00020\"2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0005\b\u0001\u0010)J\u0019\u0010\u0001\u001a\u00020\"2\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0005\b\u0001\u0010)J\u001c\u0010\u0001\u001a\u00020\"2\b\u0010\n\u001a\u0004\u0018\u00010\u000fH\u0000¢\u0006\u0006\b\u0001\u0010\u0001J,\u0010\u0001\u001a\u00030\u00012\n\b\u0002\u0010i\u001a\u0004\u0018\u00010[2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\b¢\u0006\u0006\b\u0001\u0010\u0001J\u0015\u0010\u0001\u001a\u00060ej\u0002`fH\u0016¢\u0006\u0005\b\u0001\u0010hJ\u001c\u0010\u0001\u001a\u00020\"2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000fH\u0000¢\u0006\u0006\b\u0001\u0010\u0001J\u001d\u0010\u0001\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000fH\u0000¢\u0006\u0005\b\u0001\u0010CJ\u0019\u0010\u0001\u001a\u00030\u00012\u0006\u0010R\u001a\u00020\u0002¢\u0006\u0006\b\u0001\u0010\u0001J\u001b\u0010\u0001\u001a\u00020\u000b2\u0007\u0010\u0001\u001a\u00020\tH\u0010¢\u0006\u0006\b\u0001\u0010\u0001J\u001c\u0010\u0001\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0006\b\u0001\u0010\u0001J\u001a\u0010\u0001\u001a\u00020\"2\u0007\u0010\u0001\u001a\u00020\tH\u0014¢\u0006\u0005\b\u0001\u0010)J\u001c\u0010\u0001\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0006\b\u0001\u0010\u0001J\u001c\u0010\u0001\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0006\b\u0001\u0010\u0001J\u0011\u0010\u0001\u001a\u00020[H\u0016¢\u0006\u0005\b\u0001\u0010}J\u0011\u0010\u0001\u001a\u00020[H\u0007¢\u0006\u0005\b\u0001\u0010}J\u0011\u0010\u0001\u001a\u00020[H\u0010¢\u0006\u0005\b\u0001\u0010}J\u0012\u0010\u0001\u001a\u0004\u0018\u00010\t¢\u0006\u0006\b\u0001\u0010\u0001J\u0014\u0010\u0001\u001a\u0004\u0018\u00010\u000fH\u0000¢\u0006\u0006\b\u0001\u0010\u0001J\u0017\u0010\u0001\u001a\u0004\u0018\u00010\u000fH@ø\u0001\u0000¢\u0006\u0005\b\u0001\u0010AJT\u0010¡\u0001\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010s2\f\u0010u\u001a\b\u0012\u0004\u0012\u00028\u00010t2#\u0010\u0010\u001a\u001f\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010v\u0012\u0006\u0012\u0004\u0018\u00010\u000f0 \u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b¡\u0001\u0010¢\u0001JT\u0010£\u0001\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010s2\f\u0010u\u001a\b\u0012\u0004\u0012\u00028\u00010t2#\u0010\u0010\u001a\u001f\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010v\u0012\u0006\u0012\u0004\u0018\u00010\u000f0 \u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b£\u0001\u0010¢\u0001R\u001e\u0010¥\u0001\u001a\u0004\u0018\u00010\t*\u0004\u0018\u00010\u000f8BX\u0004¢\u0006\u0007\u001a\u0005\b¤\u0001\u0010ER\u001b\u0010¨\u0001\u001a\u00020\"*\u00020 8BX\u0004¢\u0006\b\u001a\u0006\b¦\u0001\u0010§\u0001R\u0019\u0010¬\u0001\u001a\u0007\u0012\u0002\b\u00030©\u00018F¢\u0006\b\u001a\u0006\bª\u0001\u0010«\u0001R0\u0010²\u0001\u001a\u0005\u0018\u00010\u00012\n\u0010­\u0001\u001a\u0005\u0018\u00010\u00018@@@X\u000e¢\u0006\u0010\u001a\u0006\b®\u0001\u0010¯\u0001\"\u0006\b°\u0001\u0010±\u0001R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u000f8@X\u0004¢\u0006\b\u001a\u0006\b³\u0001\u0010\u0001R\u0016\u0010µ\u0001\u001a\u00020\"8VX\u0004¢\u0006\u0007\u001a\u0005\b´\u0001\u0010?R\u0013\u0010·\u0001\u001a\u00020\"8F¢\u0006\u0007\u001a\u0005\b¶\u0001\u0010?R\u0013\u0010¸\u0001\u001a\u00020\"8F¢\u0006\u0007\u001a\u0005\b¸\u0001\u0010?R\u0019\u0010º\u0001\u001a\u0004\u0018\u00010\t8DX\u0004¢\u0006\b\u001a\u0006\b¹\u0001\u0010\u0001R\u0016\u0010¼\u0001\u001a\u00020\"8DX\u0004¢\u0006\u0007\u001a\u0005\b»\u0001\u0010?R\u0014\u0010¿\u0001\u001a\u00020\u00048F¢\u0006\b\u001a\u0006\b½\u0001\u0010¾\u0001R\u0016\u0010Á\u0001\u001a\u00020\"8PX\u0004¢\u0006\u0007\u001a\u0005\bÀ\u0001\u0010?R\u001b\u0010Å\u0001\u001a\t\u0012\u0004\u0012\u00020\u00010Â\u00018F¢\u0006\b\u001a\u0006\bÃ\u0001\u0010Ä\u0001R\u0016\u0010Ç\u0001\u001a\u00020\"8TX\u0004¢\u0006\u0007\u001a\u0005\bÆ\u0001\u0010?R\u0016\u0010É\u0001\u001a\u00020\"8PX\u0004¢\u0006\u0007\u001a\u0005\bÈ\u0001\u0010?R\u0013\u0010Ë\u0001\u001a\u00020\"8F¢\u0006\u0007\u001a\u0005\bÊ\u0001\u0010?\u0002\u0004\n\u0002\b\u0019¨\u0006Ï\u0001"}, d2 = {"Lcom/onedelhi/secure/bv1;", "Lcom/onedelhi/secure/ru1;", "Lcom/onedelhi/secure/vx;", "Lcom/onedelhi/secure/yy2;", "Lcom/onedelhi/secure/ft3;", "Lcom/onedelhi/secure/av1;", "T", "Lcom/onedelhi/secure/hr2;", "list", "", "cause", "Lcom/onedelhi/secure/un4;", "l1", "(Lcom/onedelhi/secure/hr2;Ljava/lang/Throwable;)V", "Lkotlin/Function1;", "", "block", "", "c1", "(Lcom/onedelhi/secure/ec1;)Ljava/lang/Void;", "Lcom/onedelhi/secure/bv1$c;", "state", "proposedUpdate", "H0", "(Lcom/onedelhi/secure/bv1$c;Ljava/lang/Object;)Ljava/lang/Object;", "", "exceptions", "N0", "(Lcom/onedelhi/secure/bv1$c;Ljava/util/List;)Ljava/lang/Throwable;", "rootCause", "i0", "(Ljava/lang/Throwable;Ljava/util/List;)V", "Lcom/onedelhi/secure/qp1;", "update", "", "A1", "(Lcom/onedelhi/secure/qp1;Ljava/lang/Object;)Z", "z0", "(Lcom/onedelhi/secure/qp1;Ljava/lang/Object;)V", "j1", "w0", "(Ljava/lang/Throwable;)Z", "k1", "", "v1", "(Ljava/lang/Object;)I", "Lcom/onedelhi/secure/iy2;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "onCancelling", "g1", "(Lcom/onedelhi/secure/ec1;Z)Lcom/onedelhi/secure/av1;", "expect", "node", "h0", "(Ljava/lang/Object;Lcom/onedelhi/secure/hr2;Lcom/onedelhi/secure/av1;)Z", "Lcom/onedelhi/secure/dt0;", "p1", "(Lcom/onedelhi/secure/dt0;)V", "q1", "(Lcom/onedelhi/secure/av1;)V", "a1", "()Z", "b1", "(Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "v0", "(Ljava/lang/Object;)Ljava/lang/Object;", "B0", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "d1", "R0", "(Lcom/onedelhi/secure/qp1;)Lcom/onedelhi/secure/hr2;", "B1", "(Lcom/onedelhi/secure/qp1;Ljava/lang/Throwable;)Z", "C1", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "D1", "(Lcom/onedelhi/secure/qp1;Ljava/lang/Object;)Ljava/lang/Object;", "Lcom/onedelhi/secure/ux;", "I0", "(Lcom/onedelhi/secure/qp1;)Lcom/onedelhi/secure/ux;", "child", "E1", "(Lcom/onedelhi/secure/bv1$c;Lcom/onedelhi/secure/ux;Ljava/lang/Object;)Z", "lastChild", "A0", "(Lcom/onedelhi/secure/bv1$c;Lcom/onedelhi/secure/ux;Ljava/lang/Object;)V", "Lcom/onedelhi/secure/l82;", "i1", "(Lcom/onedelhi/secure/l82;)Lcom/onedelhi/secure/ux;", "", "w1", "(Ljava/lang/Object;)Ljava/lang/String;", "q0", "parent", "W0", "(Lcom/onedelhi/secure/ru1;)V", "O0", "o1", "()V", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "h", "()Ljava/util/concurrent/CancellationException;", "message", "x1", "(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;", "Lcom/onedelhi/secure/fn0;", "F0", "(Lcom/onedelhi/secure/ec1;)Lcom/onedelhi/secure/fn0;", "invokeImmediately", "j0", "(ZZLcom/onedelhi/secure/ec1;)Lcom/onedelhi/secure/fn0;", "X", "R", "Lcom/onedelhi/secure/it3;", "select", "Lcom/onedelhi/secure/b80;", "s", "(Lcom/onedelhi/secure/it3;Lcom/onedelhi/secure/ec1;)V", "s1", "c", "(Ljava/util/concurrent/CancellationException;)V", "x0", "()Ljava/lang/String;", "a", "t0", "(Ljava/lang/Throwable;)V", "parentJob", "Y", "(Lcom/onedelhi/secure/yy2;)V", "y0", "r0", "s0", "(Ljava/lang/Object;)Z", "Lcom/onedelhi/secure/su1;", "D0", "(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/onedelhi/secure/su1;", "A", "e1", "f1", "Lcom/onedelhi/secure/tx;", "l", "(Lcom/onedelhi/secure/vx;)Lcom/onedelhi/secure/tx;", "exception", "V0", "m1", "U0", "n1", "(Ljava/lang/Object;)V", "k0", "toString", "z1", "h1", "K", "()Ljava/lang/Throwable;", "J0", "()Ljava/lang/Object;", "n0", "Lkotlin/Function2;", "r1", "(Lcom/onedelhi/secure/it3;Lcom/onedelhi/secure/sc1;)V", "t1", "M0", "exceptionOrNull", "X0", "(Lcom/onedelhi/secure/qp1;)Z", "isCancelling", "Lcom/onedelhi/secure/b90$c;", "getKey", "()Lcom/onedelhi/secure/b90$c;", "key", "value", "S0", "()Lcom/onedelhi/secure/tx;", "u1", "(Lcom/onedelhi/secure/tx;)V", "parentHandle", "T0", "b", "isActive", "d", "isCompleted", "isCancelled", "K0", "completionCause", "L0", "completionCauseHandled", "o0", "()Lcom/onedelhi/secure/ft3;", "onJoin", "Q0", "onCancelComplete", "Lcom/onedelhi/secure/zt3;", "m", "()Lcom/onedelhi/secure/zt3;", "children", "Z0", "isScopedCoroutine", "P0", "handlesException", "Y0", "isCompletedExceptionally", "active", "<init>", "(Z)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@xj0(level = ak0.ERROR, message = "This is internal API and may be removed in the future releases")
public class bv1 implements ru1, C7105vx, yy2, ft3 {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f26538a = AtomicReferenceFieldUpdater.newUpdater(bv1.class, Object.class, "_state");
    @vr2
    private volatile /* synthetic */ Object _parentHandle;
    @vr2
    private volatile /* synthetic */ Object _state;

    @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0014¨\u0006\u000f"}, d2 = {"Lcom/onedelhi/secure/bv1$a;", "T", "Lcom/onedelhi/secure/ju;", "Lcom/onedelhi/secure/ru1;", "parent", "", "z", "", "I", "Lcom/onedelhi/secure/b80;", "delegate", "Lcom/onedelhi/secure/bv1;", "job", "<init>", "(Lcom/onedelhi/secure/b80;Lcom/onedelhi/secure/bv1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.bv1$a */
    public static final class C4702a<T> extends C5847ju<T> {
        @vr2

        /* renamed from: a */
        public final bv1 f26539a;

        public C4702a(@vr2 b80<? super T> b80, @vr2 bv1 bv1) {
            super(b80, 1);
            this.f26539a = bv1;
        }

        @vr2
        /* renamed from: I */
        public String mo32151I() {
            return "AwaitContinuation";
        }

        @vr2
        /* renamed from: z */
        public Throwable mo32152z(@vr2 ru1 ru1) {
            Throwable e;
            Object T0 = this.f26539a.mo32092T0();
            return (!(T0 instanceof C4704c) || (e = ((C4704c) T0).mo32156e()) == null) ? T0 instanceof m20 ? ((m20) T0).f31975a : ru1.mo32113h() : e;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¨\u0006\u0010"}, d2 = {"Lcom/onedelhi/secure/bv1$b;", "Lcom/onedelhi/secure/av1;", "", "cause", "Lcom/onedelhi/secure/un4;", "a1", "Lcom/onedelhi/secure/bv1;", "parent", "Lcom/onedelhi/secure/bv1$c;", "state", "Lcom/onedelhi/secure/ux;", "child", "", "proposedUpdate", "<init>", "(Lcom/onedelhi/secure/bv1;Lcom/onedelhi/secure/bv1$c;Lcom/onedelhi/secure/ux;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.bv1$b */
    public static final class C4703b extends av1 {
        @vr2

        /* renamed from: a */
        public final C4704c f26540a;
        @vr2

        /* renamed from: a */
        public final C6984ux f26541a;
        @ss2

        /* renamed from: a */
        public final Object f26542a;
        @vr2

        /* renamed from: b */
        public final bv1 f26543b;

        public C4703b(@vr2 bv1 bv1, @vr2 C4704c cVar, @vr2 C6984ux uxVar, @ss2 Object obj) {
            this.f26543b = bv1;
            this.f26540a = cVar;
            this.f26541a = uxVar;
            this.f26542a = obj;
        }

        /* renamed from: X */
        public /* bridge */ /* synthetic */ Object mo17094X(Object obj) {
            mo32031a1((Throwable) obj);
            return un4.f36206a;
        }

        /* renamed from: a1 */
        public void mo32031a1(@ss2 Throwable th) {
            this.f26543b.mo32070A0(this.f26540a, this.f26541a, this.f26542a);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B!\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u001f\u001a\u00020\u0019\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b/\u00100J\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0010j\b\u0012\u0004\u0012\u00020\u0004`\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198F@FX\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR(\u0010#\u001a\u0004\u0018\u00010\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u00048F@FX\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010\fR\u0011\u0010%\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b$\u0010\u001cR\u0011\u0010'\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b&\u0010\u001cR\u0014\u0010)\u001a\u00020\u00198VX\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u001cR(\u0010.\u001a\u0004\u0018\u00010\u00012\b\u0010\u001a\u001a\u0004\u0018\u00010\u00018B@BX\u000e¢\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u00061"}, d2 = {"Lcom/onedelhi/secure/bv1$c;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "Lcom/onedelhi/secure/qp1;", "", "proposedException", "", "i", "(Ljava/lang/Throwable;)Ljava/util/List;", "exception", "Lcom/onedelhi/secure/un4;", "a", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "c", "()Ljava/util/ArrayList;", "Lcom/onedelhi/secure/hr2;", "list", "Lcom/onedelhi/secure/hr2;", "j0", "()Lcom/onedelhi/secure/hr2;", "", "value", "g", "()Z", "j", "(Z)V", "isCompleting", "e", "()Ljava/lang/Throwable;", "l", "rootCause", "h", "isSealed", "f", "isCancelling", "b", "isActive", "d", "()Ljava/lang/Object;", "k", "(Ljava/lang/Object;)V", "exceptionsHolder", "<init>", "(Lcom/onedelhi/secure/hr2;ZLjava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.bv1$c */
    public static final class C4704c implements qp1 {
        @vr2
        private volatile /* synthetic */ Object _exceptionsHolder = null;
        @vr2
        private volatile /* synthetic */ int _isCompleting;
        @vr2
        private volatile /* synthetic */ Object _rootCause;
        @vr2

        /* renamed from: a */
        public final hr2 f26544a;

        public C4704c(@vr2 hr2 hr2, boolean z, @ss2 Throwable th) {
            this.f26544a = hr2;
            this._isCompleting = z ? 1 : 0;
            this._rootCause = th;
        }

        /* renamed from: a */
        public final void mo32153a(@vr2 Throwable th) {
            Throwable e = mo32156e();
            if (e == null) {
                mo32163l(th);
            } else if (th != e) {
                Object d = mo32155d();
                if (d == null) {
                    mo32162k(th);
                } else if (d instanceof Throwable) {
                    if (th != d) {
                        ArrayList<Throwable> c = mo32154c();
                        c.add(d);
                        c.add(th);
                        mo32162k(c);
                    }
                } else if (d instanceof ArrayList) {
                    ((ArrayList) d).add(th);
                } else {
                    throw new IllegalStateException(jt1.m53745C("State is ", d).toString());
                }
            }
        }

        /* renamed from: b */
        public boolean mo31211b() {
            return mo32156e() == null;
        }

        /* renamed from: c */
        public final ArrayList<Throwable> mo32154c() {
            return new ArrayList<>(4);
        }

        /* renamed from: d */
        public final Object mo32155d() {
            return this._exceptionsHolder;
        }

        @ss2
        /* renamed from: e */
        public final Throwable mo32156e() {
            return (Throwable) this._rootCause;
        }

        /* renamed from: f */
        public final boolean mo32157f() {
            return mo32156e() != null;
        }

        /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
        /* renamed from: g */
        public final boolean mo32158g() {
            return this._isCompleting;
        }

        /* renamed from: h */
        public final boolean mo32159h() {
            return mo32155d() == cv1.f27070e;
        }

        @vr2
        /* renamed from: i */
        public final List<Throwable> mo32160i(@ss2 Throwable th) {
            ArrayList<Throwable> arrayList;
            Object d = mo32155d();
            if (d == null) {
                arrayList = mo32154c();
            } else if (d instanceof Throwable) {
                ArrayList<Throwable> c = mo32154c();
                c.add(d);
                arrayList = c;
            } else if (d instanceof ArrayList) {
                arrayList = (ArrayList) d;
            } else {
                throw new IllegalStateException(jt1.m53745C("State is ", d).toString());
            }
            Throwable e = mo32156e();
            if (e != null) {
                arrayList.add(0, e);
            }
            if (th != null && !jt1.m53768g(th, e)) {
                arrayList.add(th);
            }
            mo32162k(cv1.f27070e);
            return arrayList;
        }

        /* renamed from: j */
        public final void mo32161j(boolean z) {
            this._isCompleting = z ? 1 : 0;
        }

        @vr2
        /* renamed from: j0 */
        public hr2 mo31214j0() {
            return this.f26544a;
        }

        /* renamed from: k */
        public final void mo32162k(Object obj) {
            this._exceptionsHolder = obj;
        }

        /* renamed from: l */
        public final void mo32163l(@ss2 Throwable th) {
            this._rootCause = th;
        }

        @vr2
        public String toString() {
            return "Finishing[cancelling=" + mo32157f() + ", completing=" + mo32158g() + ", rootCause=" + mo32156e() + ", exceptions=" + mo32155d() + ", list=" + mo31214j0() + ']';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/onedelhi/secure/l82$f", "Lcom/onedelhi/secure/l82$c;", "Lcom/onedelhi/secure/l82;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "k", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.bv1$d */
    public static final class C4705d extends l82.C5973c {

        /* renamed from: a */
        public final /* synthetic */ bv1 f26545a;

        /* renamed from: a */
        public final /* synthetic */ Object f26546a;

        /* renamed from: c */
        public final /* synthetic */ l82 f26547c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4705d(l82 l82, bv1 bv1, Object obj) {
            super(l82);
            this.f26547c = l82;
            this.f26545a = bv1;
            this.f26546a = obj;
        }

        @ss2
        /* renamed from: k */
        public Object mo31084i(@vr2 l82 l82) {
            if (this.f26545a.mo32092T0() == this.f26546a) {
                return null;
            }
            return k82.m54100a();
        }
    }

    @cf0(mo32326c = "kotlinx.coroutines.JobSupport$children$1", mo32327f = "JobSupport.kt", mo32328i = {1, 1, 1}, mo32329l = {952, 954}, mo32330m = "invokeSuspend", mo32331n = {"$this$sequence", "this_$iv", "cur$iv"}, mo32332s = {"L$0", "L$1", "L$2"})
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, d2 = {"Lcom/onedelhi/secure/bu3;", "Lcom/onedelhi/secure/ru1;", "Lcom/onedelhi/secure/un4;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.bv1$e */
    public static final class C4706e extends ll3 implements sc1<bu3<? super ru1>, b80<? super un4>, Object> {

        /* renamed from: a */
        public final /* synthetic */ bv1 f26548a;

        /* renamed from: a */
        public Object f26549a;

        /* renamed from: b */
        public Object f26550b;

        /* renamed from: c */
        public /* synthetic */ Object f26551c;

        /* renamed from: o */
        public int f26552o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4706e(bv1 bv1, b80<? super C4706e> b80) {
            super(2, b80);
            this.f26548a = bv1;
        }

        @vr2
        /* renamed from: B */
        public final b80<un4> mo22644B(@ss2 Object obj, @vr2 b80<?> b80) {
            C4706e eVar = new C4706e(this.f26548a, b80);
            eVar.f26551c = obj;
            return eVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0067  */
        @com.onedelhi.secure.ss2
        /* renamed from: D */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo22645D(@com.onedelhi.secure.vr2 java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = com.onedelhi.secure.mt1.m57558h()
                int r1 = r7.f26552o
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x002b
                if (r1 == r3) goto L_0x0027
                if (r1 != r2) goto L_0x001f
                java.lang.Object r1 = r7.f26550b
                com.onedelhi.secure.l82 r1 = (com.onedelhi.secure.l82) r1
                java.lang.Object r3 = r7.f26549a
                com.onedelhi.secure.j82 r3 = (com.onedelhi.secure.j82) r3
                java.lang.Object r4 = r7.f26551c
                com.onedelhi.secure.bu3 r4 = (com.onedelhi.secure.bu3) r4
                com.onedelhi.secure.pl3.m61436n(r8)
                r8 = r7
                goto L_0x007f
            L_0x001f:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L_0x0027:
                com.onedelhi.secure.pl3.m61436n(r8)
                goto L_0x0084
            L_0x002b:
                com.onedelhi.secure.pl3.m61436n(r8)
                java.lang.Object r8 = r7.f26551c
                com.onedelhi.secure.bu3 r8 = (com.onedelhi.secure.bu3) r8
                com.onedelhi.secure.bv1 r1 = r7.f26548a
                java.lang.Object r1 = r1.mo32092T0()
                boolean r4 = r1 instanceof com.onedelhi.secure.C6984ux
                if (r4 == 0) goto L_0x0049
                com.onedelhi.secure.ux r1 = (com.onedelhi.secure.C6984ux) r1
                com.onedelhi.secure.vx r1 = r1.f36332a
                r7.f26552o = r3
                java.lang.Object r8 = r8.mo31188h(r1, r7)
                if (r8 != r0) goto L_0x0084
                return r0
            L_0x0049:
                boolean r3 = r1 instanceof com.onedelhi.secure.qp1
                if (r3 == 0) goto L_0x0084
                com.onedelhi.secure.qp1 r1 = (com.onedelhi.secure.qp1) r1
                com.onedelhi.secure.hr2 r1 = r1.mo31214j0()
                if (r1 != 0) goto L_0x0056
                goto L_0x0084
            L_0x0056:
                java.lang.Object r3 = r1.mo39690L0()
                com.onedelhi.secure.l82 r3 = (com.onedelhi.secure.l82) r3
                r4 = r8
                r8 = r7
                r6 = r3
                r3 = r1
                r1 = r6
            L_0x0061:
                boolean r5 = com.onedelhi.secure.jt1.m53768g(r1, r3)
                if (r5 != 0) goto L_0x0084
                boolean r5 = r1 instanceof com.onedelhi.secure.C6984ux
                if (r5 == 0) goto L_0x007f
                r5 = r1
                com.onedelhi.secure.ux r5 = (com.onedelhi.secure.C6984ux) r5
                com.onedelhi.secure.vx r5 = r5.f36332a
                r8.f26551c = r4
                r8.f26549a = r3
                r8.f26550b = r1
                r8.f26552o = r2
                java.lang.Object r5 = r4.mo31188h(r5, r8)
                if (r5 != r0) goto L_0x007f
                return r0
            L_0x007f:
                com.onedelhi.secure.l82 r1 = r1.mo39691M0()
                goto L_0x0061
            L_0x0084:
                com.onedelhi.secure.un4 r8 = com.onedelhi.secure.un4.f36206a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.bv1.C4706e.mo22645D(java.lang.Object):java.lang.Object");
        }

        @ss2
        /* renamed from: L */
        public final Object mo21054h0(@vr2 bu3<? super ru1> bu3, @ss2 b80<? super un4> b80) {
            return ((C4706e) mo22644B(bu3, b80)).mo22645D(un4.f36206a);
        }
    }

    public bv1(boolean z) {
        this._state = z ? cv1.f27065b : cv1.f27062a;
        this._parentHandle = null;
    }

    /* renamed from: E0 */
    public static /* synthetic */ su1 m40475E0(bv1 bv1, String str, Throwable th, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                th = null;
            }
            if (str == null) {
                str = bv1.mo32146x0();
            }
            return new su1(str, th, bv1);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: defaultCancellationException");
    }

    /* renamed from: l1 */
    private final /* synthetic */ <T extends av1> void m40480l1(hr2 hr2, Throwable th) {
        p20 p20;
        p20 p202 = null;
        for (l82 l82 = (l82) hr2.mo39690L0(); !jt1.m53768g(l82, hr2); l82 = l82.mo39691M0()) {
            jt1.m53786y(3, mx0.f16794s2);
            if (l82 instanceof l82) {
                av1 av1 = (av1) l82;
                try {
                    av1.mo32031a1(th);
                } catch (Throwable th2) {
                    if (p202 == null) {
                        p20 = null;
                    } else {
                        pw0.m61687a(p202, th2);
                        p20 = p202;
                    }
                    if (p20 == null) {
                        p202 = new p20("Exception in completion handler " + av1 + " for " + this, th2);
                    }
                }
            }
        }
        if (p202 != null) {
            mo32094V0(p202);
        }
    }

    /* renamed from: y1 */
    public static /* synthetic */ CancellationException m40481y1(bv1 bv1, Throwable th, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = null;
            }
            return bv1.mo32147x1(th, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    @vr2
    /* renamed from: A */
    public CancellationException mo32069A() {
        Throwable th;
        Object T0 = mo32092T0();
        CancellationException cancellationException = null;
        if (T0 instanceof C4704c) {
            th = ((C4704c) T0).mo32156e();
        } else if (T0 instanceof m20) {
            th = ((m20) T0).f31975a;
        } else if (!(T0 instanceof qp1)) {
            th = null;
        } else {
            throw new IllegalStateException(jt1.m53745C("Cannot be cancelling child in this state: ", T0).toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        }
        return cancellationException == null ? new su1(jt1.m53745C("Parent job is ", mo32145w1(T0)), th, this) : cancellationException;
    }

    /* renamed from: A0 */
    public final void mo32070A0(C4704c cVar, C6984ux uxVar, Object obj) {
        C6984ux i1 = mo32117i1(uxVar);
        if (i1 == null || !mo32077E1(cVar, i1, obj)) {
            mo32121k0(mo32079H0(cVar, obj));
        }
    }

    /* renamed from: A1 */
    public final boolean mo32071A1(qp1 qp1, Object obj) {
        if (!C5759j1.m52871a(f26538a, this, qp1, cv1.m44318g(obj))) {
            return false;
        }
        mo32125m1((Throwable) null);
        mo32127n1(obj);
        mo32149z0(qp1, obj);
        return true;
    }

    /* renamed from: B0 */
    public final Throwable mo32072B0(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new su1(mo32146x0(), (Throwable) null, this) : th;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((yy2) obj).mo32069A();
    }

    /* renamed from: B1 */
    public final boolean mo32073B1(qp1 qp1, Throwable th) {
        hr2 R0 = mo32090R0(qp1);
        if (R0 == null) {
            return false;
        }
        if (!C5759j1.m52871a(f26538a, this, qp1, new C4704c(R0, false, th))) {
            return false;
        }
        mo32120j1(R0, th);
        return true;
    }

    /* renamed from: C1 */
    public final Object mo32074C1(Object obj, Object obj2) {
        return !(obj instanceof qp1) ? cv1.f27063a : (((obj instanceof dt0) || (obj instanceof av1)) && !(obj instanceof C6984ux) && !(obj2 instanceof m20)) ? mo32071A1((qp1) obj, obj2) ? obj2 : cv1.f27068c : mo32076D1((qp1) obj, obj2);
    }

    @vr2
    /* renamed from: D0 */
    public final su1 mo32075D0(@ss2 String str, @ss2 Throwable th) {
        if (str == null) {
            str = mo32146x0();
        }
        return new su1(str, th, this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x005e, code lost:
        if (r2 != null) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0061, code lost:
        mo32120j1(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0064, code lost:
        r7 = mo32080I0(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0068, code lost:
        if (r7 == null) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x006e, code lost:
        if (mo32077E1(r1, r7, r8) == false) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0072, code lost:
        return com.onedelhi.secure.cv1.f27066b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0077, code lost:
        return mo32079H0(r1, r8);
     */
    /* renamed from: D1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo32076D1(com.onedelhi.secure.qp1 r7, java.lang.Object r8) {
        /*
            r6 = this;
            com.onedelhi.secure.hr2 r0 = r6.mo32090R0(r7)
            if (r0 != 0) goto L_0x000b
            com.onedelhi.secure.l84 r7 = com.onedelhi.secure.cv1.f27068c
            return r7
        L_0x000b:
            boolean r1 = r7 instanceof com.onedelhi.secure.bv1.C4704c
            r2 = 0
            if (r1 == 0) goto L_0x0014
            r1 = r7
            com.onedelhi.secure.bv1$c r1 = (com.onedelhi.secure.bv1.C4704c) r1
            goto L_0x0015
        L_0x0014:
            r1 = r2
        L_0x0015:
            if (r1 != 0) goto L_0x001d
            com.onedelhi.secure.bv1$c r1 = new com.onedelhi.secure.bv1$c
            r3 = 0
            r1.<init>(r0, r3, r2)
        L_0x001d:
            monitor-enter(r1)
            boolean r3 = r1.mo32158g()     // Catch:{ all -> 0x0078 }
            if (r3 == 0) goto L_0x002a
            com.onedelhi.secure.l84 r7 = com.onedelhi.secure.cv1.f27063a     // Catch:{ all -> 0x0078 }
            monitor-exit(r1)
            return r7
        L_0x002a:
            r3 = 1
            r1.mo32161j(r3)     // Catch:{ all -> 0x0078 }
            if (r1 == r7) goto L_0x003e
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f26538a     // Catch:{ all -> 0x0078 }
            boolean r4 = com.onedelhi.secure.C5759j1.m52871a(r4, r6, r7, r1)     // Catch:{ all -> 0x0078 }
            if (r4 != 0) goto L_0x003e
            com.onedelhi.secure.l84 r7 = com.onedelhi.secure.cv1.f27068c     // Catch:{ all -> 0x0078 }
            monitor-exit(r1)
            return r7
        L_0x003e:
            boolean r4 = r1.mo32157f()     // Catch:{ all -> 0x0078 }
            boolean r5 = r8 instanceof com.onedelhi.secure.m20     // Catch:{ all -> 0x0078 }
            if (r5 == 0) goto L_0x004a
            r5 = r8
            com.onedelhi.secure.m20 r5 = (com.onedelhi.secure.m20) r5     // Catch:{ all -> 0x0078 }
            goto L_0x004b
        L_0x004a:
            r5 = r2
        L_0x004b:
            if (r5 != 0) goto L_0x004e
            goto L_0x0053
        L_0x004e:
            java.lang.Throwable r5 = r5.f31975a     // Catch:{ all -> 0x0078 }
            r1.mo32153a(r5)     // Catch:{ all -> 0x0078 }
        L_0x0053:
            java.lang.Throwable r5 = r1.mo32156e()     // Catch:{ all -> 0x0078 }
            r3 = r3 ^ r4
            if (r3 == 0) goto L_0x005b
            r2 = r5
        L_0x005b:
            com.onedelhi.secure.un4 r3 = com.onedelhi.secure.un4.f36206a     // Catch:{ all -> 0x0078 }
            monitor-exit(r1)
            if (r2 != 0) goto L_0x0061
            goto L_0x0064
        L_0x0061:
            r6.mo32120j1(r0, r2)
        L_0x0064:
            com.onedelhi.secure.ux r7 = r6.mo32080I0(r7)
            if (r7 == 0) goto L_0x0073
            boolean r7 = r6.mo32077E1(r1, r7, r8)
            if (r7 == 0) goto L_0x0073
            com.onedelhi.secure.l84 r7 = com.onedelhi.secure.cv1.f27066b
            return r7
        L_0x0073:
            java.lang.Object r7 = r6.mo32079H0(r1, r8)
            return r7
        L_0x0078:
            r7 = move-exception
            monitor-exit(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.bv1.mo32076D1(com.onedelhi.secure.qp1, java.lang.Object):java.lang.Object");
    }

    /* renamed from: E1 */
    public final boolean mo32077E1(C4704c cVar, C6984ux uxVar, Object obj) {
        while (ru1.C6713a.m63860f(uxVar.f36332a, false, false, new C4703b(this, cVar, uxVar, obj), 1, (Object) null) == jr2.f30914a) {
            uxVar = mo32117i1(uxVar);
            if (uxVar == null) {
                return false;
            }
        }
        return true;
    }

    @vr2
    /* renamed from: F0 */
    public final fn0 mo32078F0(@vr2 ec1<? super Throwable, un4> ec1) {
        return mo32119j0(false, true, ec1);
    }

    /* renamed from: H0 */
    public final Object mo32079H0(C4704c cVar, Object obj) {
        boolean f;
        Throwable N0;
        m20 m20 = obj instanceof m20 ? (m20) obj : null;
        Throwable th = m20 == null ? null : m20.f31975a;
        synchronized (cVar) {
            f = cVar.mo32157f();
            List<Throwable> i = cVar.mo32160i(th);
            N0 = mo32086N0(cVar, i);
            if (N0 != null) {
                mo32116i0(N0, i);
            }
        }
        boolean z = false;
        if (!(N0 == null || N0 == th)) {
            obj = new m20(N0, false, 2, (wg0) null);
        }
        if (N0 != null) {
            if (mo32144w0(N0) || mo32093U0(N0)) {
                z = true;
            }
            if (z) {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                ((m20) obj).mo40423b();
            }
        }
        if (!f) {
            mo32125m1(N0);
        }
        mo32127n1(obj);
        C5759j1.m52871a(f26538a, this, cVar, cv1.m44318g(obj));
        mo32149z0(cVar, obj);
        return obj;
    }

    /* renamed from: I0 */
    public final C6984ux mo32080I0(qp1 qp1) {
        C6984ux uxVar = qp1 instanceof C6984ux ? (C6984ux) qp1 : null;
        if (uxVar != null) {
            return uxVar;
        }
        hr2 j0 = qp1.mo31214j0();
        if (j0 == null) {
            return null;
        }
        return mo32117i1(j0);
    }

    @ss2
    /* renamed from: J0 */
    public final Object mo32081J0() {
        Object T0 = mo32092T0();
        if (!(!(T0 instanceof qp1))) {
            throw new IllegalStateException("This job has not completed yet".toString());
        } else if (!(T0 instanceof m20)) {
            return cv1.m44326o(T0);
        } else {
            throw ((m20) T0).f31975a;
        }
    }

    @ss2
    /* renamed from: K */
    public final Throwable mo32082K() {
        Object T0 = mo32092T0();
        if (!(T0 instanceof qp1)) {
            return mo32085M0(T0);
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    @ss2
    /* renamed from: K0 */
    public final Throwable mo32083K0() {
        Object T0 = mo32092T0();
        if (T0 instanceof C4704c) {
            Throwable e = ((C4704c) T0).mo32156e();
            if (e != null) {
                return e;
            }
            throw new IllegalStateException(jt1.m53745C("Job is still new or active: ", this).toString());
        } else if (T0 instanceof qp1) {
            throw new IllegalStateException(jt1.m53745C("Job is still new or active: ", this).toString());
        } else if (T0 instanceof m20) {
            return ((m20) T0).f31975a;
        } else {
            return null;
        }
    }

    /* renamed from: L0 */
    public final boolean mo32084L0() {
        Object T0 = mo32092T0();
        return (T0 instanceof m20) && ((m20) T0).mo40422a();
    }

    /* renamed from: M0 */
    public final Throwable mo32085M0(Object obj) {
        m20 m20 = obj instanceof m20 ? (m20) obj : null;
        if (m20 == null) {
            return null;
        }
        return m20.f31975a;
    }

    /* renamed from: N0 */
    public final Throwable mo32086N0(C4704c cVar, List<? extends Throwable> list) {
        T t;
        boolean z;
        T t2 = null;
        if (!list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (!(((Throwable) t) instanceof CancellationException)) {
                    break;
                }
            }
            Throwable th = (Throwable) t;
            if (th != null) {
                return th;
            }
            Throwable th2 = (Throwable) list.get(0);
            if (th2 instanceof ne4) {
                Iterator<T> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    T next = it2.next();
                    Throwable th3 = (Throwable) next;
                    if (th3 == th2 || !(th3 instanceof ne4)) {
                        z = false;
                        continue;
                    } else {
                        z = true;
                        continue;
                    }
                    if (z) {
                        t2 = next;
                        break;
                    }
                }
                Throwable th4 = (Throwable) t2;
                if (th4 != null) {
                    return th4;
                }
            }
            return th2;
        } else if (cVar.mo32157f()) {
            return new su1(mo32146x0(), (Throwable) null, this);
        } else {
            return null;
        }
    }

    /* renamed from: O0 */
    public final boolean mo32087O0() {
        int v1;
        do {
            v1 = mo32143v1(mo32092T0());
            if (v1 == 0) {
                return false;
            }
        } while (v1 != 1);
        return true;
    }

    /* renamed from: P0 */
    public boolean mo32088P0() {
        return true;
    }

    /* renamed from: Q0 */
    public boolean mo32089Q0() {
        return false;
    }

    /* renamed from: R0 */
    public final hr2 mo32090R0(qp1 qp1) {
        hr2 j0 = qp1.mo31214j0();
        if (j0 != null) {
            return j0;
        }
        if (qp1 instanceof dt0) {
            return new hr2();
        }
        if (qp1 instanceof av1) {
            mo32132q1((av1) qp1);
            return null;
        }
        throw new IllegalStateException(jt1.m53745C("State should have list: ", qp1).toString());
    }

    @ss2
    /* renamed from: S0 */
    public final C6904tx mo32091S0() {
        return (C6904tx) this._parentHandle;
    }

    @ss2
    /* renamed from: T0 */
    public final Object mo32092T0() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof wv2)) {
                return obj;
            }
            ((wv2) obj).mo31082c(this);
        }
    }

    /* renamed from: U0 */
    public boolean mo32093U0(@vr2 Throwable th) {
        return false;
    }

    /* renamed from: V0 */
    public void mo32094V0(@vr2 Throwable th) {
        throw th;
    }

    /* renamed from: W0 */
    public final void mo32095W0(@ss2 ru1 ru1) {
        if (ru1 == null) {
            mo32141u1(jr2.f30914a);
            return;
        }
        ru1.mo32087O0();
        C6904tx l = ru1.mo32123l(this);
        mo32141u1(l);
        if (mo32108d()) {
            l.mo30964e();
            mo32141u1(jr2.f30914a);
        }
    }

    @ss2
    /* renamed from: X */
    public final Object mo32096X(@vr2 b80<? super un4> b80) {
        if (!mo32102a1()) {
            xu1.m70832z(b80.mo31187f());
            return un4.f36206a;
        }
        Object b1 = mo32104b1(b80);
        return b1 == mt1.m57558h() ? b1 : un4.f36206a;
    }

    /* renamed from: X0 */
    public final boolean mo32097X0(qp1 qp1) {
        return (qp1 instanceof C4704c) && ((C4704c) qp1).mo32157f();
    }

    /* renamed from: Y */
    public final void mo32098Y(@vr2 yy2 yy2) {
        mo32136s0(yy2);
    }

    /* renamed from: Y0 */
    public final boolean mo32099Y0() {
        return mo32092T0() instanceof m20;
    }

    /* renamed from: Z0 */
    public boolean mo32100Z0() {
        return false;
    }

    @xj0(level = ak0.HIDDEN, message = "Added since 1.2.0 for binary compatibility with versions <= 1.1.x")
    /* renamed from: a */
    public /* synthetic */ boolean mo32101a(Throwable th) {
        Throwable y1 = th == null ? null : m40481y1(this, th, (String) null, 1, (Object) null);
        if (y1 == null) {
            y1 = new su1(mo32146x0(), (Throwable) null, this);
        }
        mo32138t0(y1);
        return true;
    }

    /* renamed from: a1 */
    public final boolean mo32102a1() {
        Object T0;
        do {
            T0 = mo32092T0();
            if (!(T0 instanceof qp1)) {
                return false;
            }
        } while (mo32143v1(T0) < 0);
        return true;
    }

    /* renamed from: b */
    public boolean mo32103b() {
        Object T0 = mo32092T0();
        return (T0 instanceof qp1) && ((qp1) T0).mo31211b();
    }

    /* renamed from: b1 */
    public final Object mo32104b1(b80<? super un4> b80) {
        C5847ju juVar = new C5847ju(lt1.m56482d(b80), 1);
        juVar.mo38234T();
        C6057lu.m56508a(juVar, mo32078F0(new wl3(juVar)));
        Object A = juVar.mo38880A();
        if (A == mt1.m57558h()) {
            hf0.m50483c(b80);
        }
        return A == mt1.m57558h() ? A : un4.f36206a;
    }

    /* renamed from: c */
    public void mo32105c(@ss2 CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new su1(mo32146x0(), (Throwable) null, this);
        }
        mo32138t0(cancellationException);
    }

    /* renamed from: c1 */
    public final Void mo32106c1(ec1<Object, un4> ec1) {
        while (true) {
            ec1.mo17094X(mo32092T0());
        }
    }

    @xj0(level = ak0.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        mo32105c((CancellationException) null);
    }

    /* renamed from: d */
    public final boolean mo32108d() {
        return !(mo32092T0() instanceof qp1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003e, code lost:
        if (r0 != null) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0041, code lost:
        mo32120j1(((com.onedelhi.secure.bv1.C4704c) r2).mo31214j0(), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004e, code lost:
        return com.onedelhi.secure.cv1.m44312a();
     */
    /* renamed from: d1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo32109d1(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            java.lang.Object r2 = r6.mo32092T0()
            boolean r3 = r2 instanceof com.onedelhi.secure.bv1.C4704c
            if (r3 == 0) goto L_0x0052
            monitor-enter(r2)
            r3 = r2
            com.onedelhi.secure.bv1$c r3 = (com.onedelhi.secure.bv1.C4704c) r3     // Catch:{ all -> 0x004f }
            boolean r3 = r3.mo32159h()     // Catch:{ all -> 0x004f }
            if (r3 == 0) goto L_0x001a
            com.onedelhi.secure.l84 r7 = com.onedelhi.secure.cv1.f27069d     // Catch:{ all -> 0x004f }
            monitor-exit(r2)
            return r7
        L_0x001a:
            r3 = r2
            com.onedelhi.secure.bv1$c r3 = (com.onedelhi.secure.bv1.C4704c) r3     // Catch:{ all -> 0x004f }
            boolean r3 = r3.mo32157f()     // Catch:{ all -> 0x004f }
            if (r7 != 0) goto L_0x0025
            if (r3 != 0) goto L_0x0031
        L_0x0025:
            if (r1 != 0) goto L_0x002b
            java.lang.Throwable r1 = r6.mo32072B0(r7)     // Catch:{ all -> 0x004f }
        L_0x002b:
            r7 = r2
            com.onedelhi.secure.bv1$c r7 = (com.onedelhi.secure.bv1.C4704c) r7     // Catch:{ all -> 0x004f }
            r7.mo32153a(r1)     // Catch:{ all -> 0x004f }
        L_0x0031:
            r7 = r2
            com.onedelhi.secure.bv1$c r7 = (com.onedelhi.secure.bv1.C4704c) r7     // Catch:{ all -> 0x004f }
            java.lang.Throwable r7 = r7.mo32156e()     // Catch:{ all -> 0x004f }
            r1 = r3 ^ 1
            if (r1 == 0) goto L_0x003d
            r0 = r7
        L_0x003d:
            monitor-exit(r2)
            if (r0 != 0) goto L_0x0041
            goto L_0x004a
        L_0x0041:
            com.onedelhi.secure.bv1$c r2 = (com.onedelhi.secure.bv1.C4704c) r2
            com.onedelhi.secure.hr2 r7 = r2.mo31214j0()
            r6.mo32120j1(r7, r0)
        L_0x004a:
            com.onedelhi.secure.l84 r7 = com.onedelhi.secure.cv1.f27063a
            return r7
        L_0x004f:
            r7 = move-exception
            monitor-exit(r2)
            throw r7
        L_0x0052:
            boolean r3 = r2 instanceof com.onedelhi.secure.qp1
            if (r3 == 0) goto L_0x009a
            if (r1 != 0) goto L_0x005c
            java.lang.Throwable r1 = r6.mo32072B0(r7)
        L_0x005c:
            r3 = r2
            com.onedelhi.secure.qp1 r3 = (com.onedelhi.secure.qp1) r3
            boolean r4 = r3.mo31211b()
            if (r4 == 0) goto L_0x0070
            boolean r2 = r6.mo32073B1(r3, r1)
            if (r2 == 0) goto L_0x0002
            com.onedelhi.secure.l84 r7 = com.onedelhi.secure.cv1.f27063a
            return r7
        L_0x0070:
            com.onedelhi.secure.m20 r3 = new com.onedelhi.secure.m20
            r4 = 0
            r5 = 2
            r3.<init>(r1, r4, r5, r0)
            java.lang.Object r3 = r6.mo32074C1(r2, r3)
            com.onedelhi.secure.l84 r4 = com.onedelhi.secure.cv1.f27063a
            if (r3 == r4) goto L_0x008a
            com.onedelhi.secure.l84 r2 = com.onedelhi.secure.cv1.f27068c
            if (r3 != r2) goto L_0x0089
            goto L_0x0002
        L_0x0089:
            return r3
        L_0x008a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot happen in "
            java.lang.String r0 = com.onedelhi.secure.jt1.m53745C(r0, r2)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L_0x009a:
            com.onedelhi.secure.l84 r7 = com.onedelhi.secure.cv1.f27069d
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.bv1.mo32109d1(java.lang.Object):java.lang.Object");
    }

    /* renamed from: e1 */
    public final boolean mo32110e1(@ss2 Object obj) {
        Object C1;
        do {
            C1 = mo32074C1(mo32092T0(), obj);
            if (C1 == cv1.f27063a) {
                return false;
            }
            if (C1 == cv1.f27066b) {
                return true;
            }
        } while (C1 == cv1.f27068c);
        mo32121k0(C1);
        return true;
    }

    @ss2
    /* renamed from: f1 */
    public final Object mo32111f1(@ss2 Object obj) {
        Object C1;
        do {
            C1 = mo32074C1(mo32092T0(), obj);
            if (C1 == cv1.f27063a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, mo32085M0(obj));
            }
        } while (C1 == cv1.f27068c);
        return C1;
    }

    public <R> R fold(R r, @vr2 sc1<? super R, ? super b90.C4634b, ? extends R> sc1) {
        return ru1.C6713a.m63858d(this, r, sc1);
    }

    /* renamed from: g1 */
    public final av1 mo32112g1(ec1<? super Throwable, un4> ec1, boolean z) {
        av1 av1 = null;
        if (z) {
            if (ec1 instanceof tu1) {
                av1 = (tu1) ec1;
            }
            if (av1 == null) {
                av1 = new bu1(ec1);
            }
        } else {
            av1 av12 = ec1 instanceof av1 ? (av1) ec1 : null;
            if (av12 != null) {
                av1 = av12;
            }
            if (av1 == null) {
                av1 = new cu1(ec1);
            }
        }
        av1.mo31213c1(this);
        return av1;
    }

    @ss2
    public <E extends b90.C4634b> E get(@vr2 b90.C4636c<E> cVar) {
        return ru1.C6713a.m63859e(this, cVar);
    }

    @vr2
    public final b90.C4636c<?> getKey() {
        return ru1.f34751a;
    }

    @vr2
    /* renamed from: h */
    public final CancellationException mo32113h() {
        Object T0 = mo32092T0();
        CancellationException cancellationException = null;
        if (T0 instanceof C4704c) {
            Throwable e = ((C4704c) T0).mo32156e();
            if (e != null) {
                cancellationException = mo32147x1(e, jt1.m53745C(if0.m52224a(this), " is cancelling"));
            }
            if (cancellationException != null) {
                return cancellationException;
            }
            throw new IllegalStateException(jt1.m53745C("Job is still new or active: ", this).toString());
        } else if (!(T0 instanceof qp1)) {
            return T0 instanceof m20 ? m40481y1(this, ((m20) T0).f31975a, (String) null, 1, (Object) null) : new su1(jt1.m53745C(if0.m52224a(this), " has completed normally"), (Throwable) null, this);
        } else {
            throw new IllegalStateException(jt1.m53745C("Job is still new or active: ", this).toString());
        }
    }

    /* renamed from: h0 */
    public final boolean mo32114h0(Object obj, hr2 hr2, av1 av1) {
        int Y0;
        C4705d dVar = new C4705d(av1, this, obj);
        do {
            Y0 = hr2.mo39692N0().mo39700Y0(av1, hr2, dVar);
            if (Y0 == 1) {
                return true;
            }
        } while (Y0 != 2);
        return false;
    }

    @vr2
    /* renamed from: h1 */
    public String mo32115h1() {
        return if0.m52224a(this);
    }

    /* renamed from: i0 */
    public final void mo32116i0(Throwable th, List<? extends Throwable> list) {
        if (list.size() > 1) {
            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
            for (Throwable th2 : list) {
                if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                    pw0.m61687a(th, th2);
                }
            }
        }
    }

    /* renamed from: i1 */
    public final C6984ux mo32117i1(l82 l82) {
        while (l82.mo38447Q0()) {
            l82 = l82.mo39692N0();
        }
        while (true) {
            l82 = l82.mo39691M0();
            if (!l82.mo38447Q0()) {
                if (l82 instanceof C6984ux) {
                    return (C6984ux) l82;
                }
                if (l82 instanceof hr2) {
                    return null;
                }
            }
        }
    }

    public final boolean isCancelled() {
        Object T0 = mo32092T0();
        return (T0 instanceof m20) || ((T0 instanceof C4704c) && ((C4704c) T0).mo32157f());
    }

    @vr2
    /* renamed from: j0 */
    public final fn0 mo32119j0(boolean z, boolean z2, @vr2 ec1<? super Throwable, un4> ec1) {
        av1 g1 = mo32112g1(ec1, z);
        while (true) {
            Object T0 = mo32092T0();
            if (T0 instanceof dt0) {
                dt0 dt0 = (dt0) T0;
                if (!dt0.mo31211b()) {
                    mo32129p1(dt0);
                } else if (C5759j1.m52871a(f26538a, this, T0, g1)) {
                    return g1;
                }
            } else {
                Throwable th = null;
                if (T0 instanceof qp1) {
                    hr2 j0 = ((qp1) T0).mo31214j0();
                    if (j0 == null) {
                        Objects.requireNonNull(T0, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                        mo32132q1((av1) T0);
                    } else {
                        fn0 fn0 = jr2.f30914a;
                        if (z && (T0 instanceof C4704c)) {
                            synchronized (T0) {
                                th = ((C4704c) T0).mo32156e();
                                if (th == null || ((ec1 instanceof C6984ux) && !((C4704c) T0).mo32158g())) {
                                    if (mo32114h0(T0, j0, g1)) {
                                        if (th == null) {
                                            return g1;
                                        }
                                        fn0 = g1;
                                    }
                                }
                                un4 un4 = un4.f36206a;
                            }
                        }
                        if (th != null) {
                            if (z2) {
                                ec1.mo17094X(th);
                            }
                            return fn0;
                        } else if (mo32114h0(T0, j0, g1)) {
                            return g1;
                        }
                    }
                } else {
                    if (z2) {
                        m20 m20 = T0 instanceof m20 ? (m20) T0 : null;
                        if (m20 != null) {
                            th = m20.f31975a;
                        }
                        ec1.mo17094X(th);
                    }
                    return jr2.f30914a;
                }
            }
        }
    }

    /* renamed from: j1 */
    public final void mo32120j1(hr2 hr2, Throwable th) {
        p20 p20;
        mo32125m1(th);
        p20 p202 = null;
        for (l82 l82 = (l82) hr2.mo39690L0(); !jt1.m53768g(l82, hr2); l82 = l82.mo39691M0()) {
            if (l82 instanceof tu1) {
                av1 av1 = (av1) l82;
                try {
                    av1.mo32031a1(th);
                } catch (Throwable th2) {
                    if (p202 == null) {
                        p20 = null;
                    } else {
                        pw0.m61687a(p202, th2);
                        p20 = p202;
                    }
                    if (p20 == null) {
                        p202 = new p20("Exception in completion handler " + av1 + " for " + this, th2);
                    }
                }
            }
        }
        if (p202 != null) {
            mo32094V0(p202);
        }
        mo32144w0(th);
    }

    /* renamed from: k0 */
    public void mo32121k0(@ss2 Object obj) {
    }

    /* renamed from: k1 */
    public final void mo32122k1(hr2 hr2, Throwable th) {
        p20 p20;
        p20 p202 = null;
        for (l82 l82 = (l82) hr2.mo39690L0(); !jt1.m53768g(l82, hr2); l82 = l82.mo39691M0()) {
            if (l82 instanceof av1) {
                av1 av1 = (av1) l82;
                try {
                    av1.mo32031a1(th);
                } catch (Throwable th2) {
                    if (p202 == null) {
                        p20 = null;
                    } else {
                        pw0.m61687a(p202, th2);
                        p20 = p202;
                    }
                    if (p20 == null) {
                        p202 = new p20("Exception in completion handler " + av1 + " for " + this, th2);
                    }
                }
            }
        }
        if (p202 != null) {
            mo32094V0(p202);
        }
    }

    @vr2
    /* renamed from: l */
    public final C6904tx mo32123l(@vr2 C7105vx vxVar) {
        return (C6904tx) ru1.C6713a.m63860f(this, true, false, new C6984ux(vxVar), 2, (Object) null);
    }

    @vr2
    /* renamed from: m */
    public final zt3<ru1> mo32124m() {
        return du3.m45551b(new C4706e(this, (b80<? super C4706e>) null));
    }

    /* renamed from: m1 */
    public void mo32125m1(@ss2 Throwable th) {
    }

    @vr2
    public b90 minusKey(@vr2 b90.C4636c<?> cVar) {
        return ru1.C6713a.m63861g(this, cVar);
    }

    @ss2
    /* renamed from: n0 */
    public final Object mo32126n0(@vr2 b80<Object> b80) {
        Object T0;
        do {
            T0 = mo32092T0();
            if (!(T0 instanceof qp1)) {
                if (!(T0 instanceof m20)) {
                    return cv1.m44326o(T0);
                }
                throw ((m20) T0).f31975a;
            }
        } while (mo32143v1(T0) < 0);
        return mo32131q0(b80);
    }

    /* renamed from: n1 */
    public void mo32127n1(@ss2 Object obj) {
    }

    @vr2
    /* renamed from: o0 */
    public final ft3 mo32128o0() {
        return this;
    }

    /* renamed from: o1 */
    public void mo30420o1() {
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [com.onedelhi.secure.mp1] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: p1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo32129p1(com.onedelhi.secure.dt0 r3) {
        /*
            r2 = this;
            com.onedelhi.secure.hr2 r0 = new com.onedelhi.secure.hr2
            r0.<init>()
            boolean r1 = r3.mo31211b()
            if (r1 == 0) goto L_0x000c
            goto L_0x0012
        L_0x000c:
            com.onedelhi.secure.mp1 r1 = new com.onedelhi.secure.mp1
            r1.<init>(r0)
            r0 = r1
        L_0x0012:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f26538a
            com.onedelhi.secure.C5759j1.m52871a(r1, r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.bv1.mo32129p1(com.onedelhi.secure.dt0):void");
    }

    @vr2
    public b90 plus(@vr2 b90 b90) {
        return ru1.C6713a.m63862h(this, b90);
    }

    @vr2
    @xj0(level = ak0.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    /* renamed from: q */
    public ru1 mo32130q(@vr2 ru1 ru1) {
        return ru1.C6713a.m63863i(this, ru1);
    }

    /* renamed from: q0 */
    public final Object mo32131q0(b80<Object> b80) {
        C4702a aVar = new C4702a(lt1.m56482d(b80), this);
        aVar.mo38234T();
        C6057lu.m56508a(aVar, mo32078F0(new vl3(aVar)));
        Object A = aVar.mo38880A();
        if (A == mt1.m57558h()) {
            hf0.m50483c(b80);
        }
        return A;
    }

    /* renamed from: q1 */
    public final void mo32132q1(av1 av1) {
        av1.mo39684F0(new hr2());
        C5759j1.m52871a(f26538a, this, av1, av1.mo39691M0());
    }

    /* renamed from: r0 */
    public final boolean mo32133r0(@ss2 Throwable th) {
        return mo32136s0(th);
    }

    /* renamed from: r1 */
    public final <T, R> void mo32134r1(@vr2 it3<? super R> it3, @vr2 sc1<? super T, ? super b80<? super R>, ? extends Object> sc1) {
        Object T0;
        do {
            T0 = mo32092T0();
            if (!it3.mo35605l()) {
                if (!(T0 instanceof qp1)) {
                    if (!it3.mo35594D()) {
                        return;
                    }
                    if (T0 instanceof m20) {
                        it3.mo35606q(((m20) T0).f31975a);
                        return;
                    } else {
                        pn4.m61465d(sc1, cv1.m44326o(T0), it3.mo35603k0());
                        return;
                    }
                }
            } else {
                return;
            }
        } while (mo32143v1(T0) != 0);
        it3.mo35595F(mo32078F0(new ct3(it3, sc1)));
    }

    /* renamed from: s */
    public final <R> void mo32135s(@vr2 it3<? super R> it3, @vr2 ec1<? super b80<? super R>, ? extends Object> ec1) {
        Object T0;
        do {
            T0 = mo32092T0();
            if (!it3.mo35605l()) {
                if (!(T0 instanceof qp1)) {
                    if (it3.mo35594D()) {
                        pn4.m61464c(ec1, it3.mo35603k0());
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        } while (mo32143v1(T0) != 0);
        it3.mo35595F(mo32078F0(new jt3(it3, ec1)));
    }

    /* renamed from: s0 */
    public final boolean mo32136s0(@ss2 Object obj) {
        Object a = cv1.f27063a;
        if (mo32089Q0() && (a = mo32142v0(obj)) == cv1.f27066b) {
            return true;
        }
        if (a == cv1.f27063a) {
            a = mo32109d1(obj);
        }
        if (a == cv1.f27063a || a == cv1.f27066b) {
            return true;
        }
        if (a == cv1.f27069d) {
            return false;
        }
        mo32121k0(a);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: s1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo32137s1(@com.onedelhi.secure.vr2 com.onedelhi.secure.av1 r4) {
        /*
            r3 = this;
        L_0x0000:
            java.lang.Object r0 = r3.mo32092T0()
            boolean r1 = r0 instanceof com.onedelhi.secure.av1
            if (r1 == 0) goto L_0x0018
            if (r0 == r4) goto L_0x000b
            return
        L_0x000b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f26538a
            com.onedelhi.secure.dt0 r2 = com.onedelhi.secure.cv1.f27065b
            boolean r0 = com.onedelhi.secure.C5759j1.m52871a(r1, r3, r0, r2)
            if (r0 == 0) goto L_0x0000
            return
        L_0x0018:
            boolean r1 = r0 instanceof com.onedelhi.secure.qp1
            if (r1 == 0) goto L_0x0027
            com.onedelhi.secure.qp1 r0 = (com.onedelhi.secure.qp1) r0
            com.onedelhi.secure.hr2 r0 = r0.mo31214j0()
            if (r0 == 0) goto L_0x0027
            r4.mo38449T0()
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.bv1.mo32137s1(com.onedelhi.secure.av1):void");
    }

    /* renamed from: t0 */
    public void mo32138t0(@vr2 Throwable th) {
        mo32136s0(th);
    }

    /* renamed from: t1 */
    public final <T, R> void mo32139t1(@vr2 it3<? super R> it3, @vr2 sc1<? super T, ? super b80<? super R>, ? extends Object> sc1) {
        Object T0 = mo32092T0();
        if (T0 instanceof m20) {
            it3.mo35606q(((m20) T0).f31975a);
            return;
        }
        C6303ou.m59638f(sc1, cv1.m44326o(T0), it3.mo35603k0(), (ec1) null, 4, (Object) null);
    }

    @vr2
    public String toString() {
        return mo32150z1() + '@' + if0.m52225b(this);
    }

    /* renamed from: u1 */
    public final void mo32141u1(@ss2 C6904tx txVar) {
        this._parentHandle = txVar;
    }

    /* renamed from: v0 */
    public final Object mo32142v0(Object obj) {
        Object C1;
        do {
            Object T0 = mo32092T0();
            if (!(T0 instanceof qp1) || ((T0 instanceof C4704c) && ((C4704c) T0).mo32158g())) {
                return cv1.f27063a;
            }
            C1 = mo32074C1(T0, new m20(mo32072B0(obj), false, 2, (wg0) null));
        } while (C1 == cv1.f27068c);
        return C1;
    }

    /* renamed from: v1 */
    public final int mo32143v1(Object obj) {
        if (obj instanceof dt0) {
            if (((dt0) obj).mo31211b()) {
                return 0;
            }
            if (!C5759j1.m52871a(f26538a, this, obj, cv1.f27065b)) {
                return -1;
            }
            mo30420o1();
            return 1;
        } else if (!(obj instanceof mp1)) {
            return 0;
        } else {
            if (!C5759j1.m52871a(f26538a, this, obj, ((mp1) obj).mo31214j0())) {
                return -1;
            }
            mo30420o1();
            return 1;
        }
    }

    /* renamed from: w0 */
    public final boolean mo32144w0(Throwable th) {
        if (mo32100Z0()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        C6904tx S0 = mo32091S0();
        return (S0 == null || S0 == jr2.f30914a) ? z : S0.mo38826i0(th) || z;
    }

    /* renamed from: w1 */
    public final String mo32145w1(Object obj) {
        if (!(obj instanceof C4704c)) {
            return obj instanceof qp1 ? ((qp1) obj).mo31211b() ? "Active" : "New" : obj instanceof m20 ? "Cancelled" : "Completed";
        }
        C4704c cVar = (C4704c) obj;
        return cVar.mo32157f() ? "Cancelling" : cVar.mo32158g() ? "Completing" : "Active";
    }

    @vr2
    /* renamed from: x0 */
    public String mo32146x0() {
        return "Job was cancelled";
    }

    @vr2
    /* renamed from: x1 */
    public final CancellationException mo32147x1(@vr2 Throwable th, @ss2 String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = mo32146x0();
            }
            cancellationException = new su1(str, th, this);
        }
        return cancellationException;
    }

    /* renamed from: y0 */
    public boolean mo32148y0(@vr2 Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return mo32136s0(th) && mo32088P0();
    }

    /* renamed from: z0 */
    public final void mo32149z0(qp1 qp1, Object obj) {
        C6904tx S0 = mo32091S0();
        if (S0 != null) {
            S0.mo30964e();
            mo32141u1(jr2.f30914a);
        }
        Throwable th = null;
        m20 m20 = obj instanceof m20 ? (m20) obj : null;
        if (m20 != null) {
            th = m20.f31975a;
        }
        if (qp1 instanceof av1) {
            try {
                ((av1) qp1).mo32031a1(th);
            } catch (Throwable th2) {
                mo32094V0(new p20("Exception in completion handler " + qp1 + " for " + this, th2));
            }
        } else {
            hr2 j0 = qp1.mo31214j0();
            if (j0 != null) {
                mo32122k1(j0, th);
            }
        }
    }

    @zs1
    @vr2
    /* renamed from: z1 */
    public final String mo32150z1() {
        return mo32115h1() + '{' + mo32145w1(mo32092T0()) + '}';
    }
}
