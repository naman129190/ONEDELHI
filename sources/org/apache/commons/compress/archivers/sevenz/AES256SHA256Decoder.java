package org.apache.commons.compress.archivers.sevenz;

import com.onedelhi.secure.iq4;
import com.onedelhi.secure.wr0;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.compress.PasswordRequiredException;

class AES256SHA256Decoder extends CoderBase {
    public AES256SHA256Decoder() {
        super(new Class[0]);
    }

    public InputStream decode(String str, InputStream inputStream, long j, Coder coder, byte[] bArr) throws IOException {
        final Coder coder2 = coder;
        final String str2 = str;
        final byte[] bArr2 = bArr;
        final InputStream inputStream2 = inputStream;
        return new InputStream() {
            private CipherInputStream cipherInputStream = null;
            private boolean isInitialized = false;

            private CipherInputStream init() throws IOException {
                byte[] bArr;
                if (this.isInitialized) {
                    return this.cipherInputStream;
                }
                byte[] bArr2 = coder2.properties;
                byte b = bArr2[0] & 255;
                byte b2 = b & iq4.f30423a;
                byte b3 = bArr2[1] & 255;
                int i = ((b >> 6) & 1) + (b3 & 15);
                int i2 = ((b >> 7) & 1) + (b3 >> 4);
                int i3 = i2 + 2;
                if (i3 + i <= bArr2.length) {
                    byte[] bArr3 = new byte[i2];
                    System.arraycopy(bArr2, 2, bArr3, 0, i2);
                    byte[] bArr4 = new byte[16];
                    System.arraycopy(coder2.properties, i3, bArr4, 0, i);
                    if (bArr2 != null) {
                        if (b2 == 63) {
                            bArr = new byte[32];
                            System.arraycopy(bArr3, 0, bArr, 0, i2);
                            byte[] bArr5 = bArr2;
                            System.arraycopy(bArr5, 0, bArr, i2, Math.min(bArr5.length, 32 - i2));
                        } else {
                            try {
                                MessageDigest instance = MessageDigest.getInstance("SHA-256");
                                byte[] bArr6 = new byte[8];
                                for (long j = 0; j < (1 << b2); j++) {
                                    instance.update(bArr3);
                                    instance.update(bArr2);
                                    instance.update(bArr6);
                                    for (int i4 = 0; i4 < 8; i4++) {
                                        bArr6[i4] = (byte) (bArr6[i4] + 1);
                                        if (bArr6[i4] != 0) {
                                            break;
                                        }
                                    }
                                }
                                bArr = instance.digest();
                            } catch (NoSuchAlgorithmException e) {
                                IOException iOException = new IOException("SHA-256 is unsupported by your Java implementation");
                                iOException.initCause(e);
                                throw iOException;
                            }
                        }
                        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, wr0.f37095a);
                        try {
                            Cipher instance2 = Cipher.getInstance("AES/CBC/NoPadding");
                            instance2.init(2, secretKeySpec, new IvParameterSpec(bArr4));
                            CipherInputStream cipherInputStream2 = new CipherInputStream(inputStream2, instance2);
                            this.cipherInputStream = cipherInputStream2;
                            this.isInitialized = true;
                            return cipherInputStream2;
                        } catch (GeneralSecurityException e2) {
                            IOException iOException2 = new IOException("Decryption error (do you have the JCE Unlimited Strength Jurisdiction Policy Files installed?)");
                            iOException2.initCause(e2);
                            throw iOException2;
                        }
                    } else {
                        throw new PasswordRequiredException(str2);
                    }
                } else {
                    throw new IOException("Salt size + IV size too long in " + str2);
                }
            }

            public void close() {
            }

            public int read() throws IOException {
                return init().read();
            }

            public int read(byte[] bArr, int i, int i2) throws IOException {
                return init().read(bArr, i, i2);
            }
        };
    }
}
