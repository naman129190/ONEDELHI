package com.onedelhi.secure;

import android.net.TrafficStats;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.net.DatagramSocket;
import java.net.Socket;
import java.net.SocketException;

public final class hg4 {

    @sj3(24)
    /* renamed from: com.onedelhi.secure.hg4$a */
    public static class C2340a {
        @pn0
        /* renamed from: a */
        public static void m16718a(DatagramSocket datagramSocket) throws SocketException {
            TrafficStats.tagDatagramSocket(datagramSocket);
        }

        @pn0
        /* renamed from: b */
        public static void m16719b(DatagramSocket datagramSocket) throws SocketException {
            TrafficStats.untagDatagramSocket(datagramSocket);
        }
    }

    @Deprecated
    /* renamed from: a */
    public static void m16709a() {
        TrafficStats.clearThreadStatsTag();
    }

    @Deprecated
    /* renamed from: b */
    public static int m16710b() {
        return TrafficStats.getThreadStatsTag();
    }

    @Deprecated
    /* renamed from: c */
    public static void m16711c(int i) {
        TrafficStats.incrementOperationCount(i);
    }

    @Deprecated
    /* renamed from: d */
    public static void m16712d(int i, int i2) {
        TrafficStats.incrementOperationCount(i, i2);
    }

    @Deprecated
    /* renamed from: e */
    public static void m16713e(int i) {
        TrafficStats.setThreadStatsTag(i);
    }

    /* renamed from: f */
    public static void m16714f(@mr2 DatagramSocket datagramSocket) throws SocketException {
        if (Build.VERSION.SDK_INT >= 24) {
            C2340a.m16718a(datagramSocket);
            return;
        }
        ParcelFileDescriptor fromDatagramSocket = ParcelFileDescriptor.fromDatagramSocket(datagramSocket);
        TrafficStats.tagSocket(new de0(datagramSocket, fromDatagramSocket.getFileDescriptor()));
        fromDatagramSocket.detachFd();
    }

    @Deprecated
    /* renamed from: g */
    public static void m16715g(Socket socket) throws SocketException {
        TrafficStats.tagSocket(socket);
    }

    /* renamed from: h */
    public static void m16716h(@mr2 DatagramSocket datagramSocket) throws SocketException {
        if (Build.VERSION.SDK_INT >= 24) {
            C2340a.m16719b(datagramSocket);
            return;
        }
        ParcelFileDescriptor fromDatagramSocket = ParcelFileDescriptor.fromDatagramSocket(datagramSocket);
        TrafficStats.untagSocket(new de0(datagramSocket, fromDatagramSocket.getFileDescriptor()));
        fromDatagramSocket.detachFd();
    }

    @Deprecated
    /* renamed from: i */
    public static void m16717i(Socket socket) throws SocketException {
        TrafficStats.untagSocket(socket);
    }
}
