package android.support.v4.a;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;

public final class i {
    public static File T(Context context) {
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= 100) {
                return null;
            }
            File file = new File(context.getCacheDir(), str + i2);
            try {
                if (file.createNewFile()) {
                    return file;
                }
                i = i2 + 1;
            } catch (IOException e) {
            }
        }
    }

    private static ByteBuffer j(File file) {
        try {
            Throwable th;
            Throwable th2;
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(MapMode.READ_ONLY, 0, channel.size());
                fileInputStream.close();
                return map;
            } catch (Throwable th3) {
                th = th3;
                th2 = th;
            }
            throw th;
            if (th2 != null) {
                try {
                    fileInputStream.close();
                } catch (Throwable th4) {
                    th2.addSuppressed(th4);
                }
            } else {
                fileInputStream.close();
            }
            throw th;
        } catch (IOException e) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0056 A:{Catch:{ all -> 0x0056, all -> 0x0047 }, Splitter:B:7:0x0016, ExcHandler: all (r0_10 'th' java.lang.Throwable A:{Catch:{ all -> 0x0056, all -> 0x0047 }})} */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:31:0x0047, code skipped:
            r1 = th;
     */
    /* JADX WARNING: Missing block: B:32:0x0048, code skipped:
            r2 = r0;
     */
    /* JADX WARNING: Missing block: B:42:0x0056, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:43:0x0057, code skipped:
            r1 = r0;
            r2 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ByteBuffer b(Context context, Uri uri) {
        Throwable th;
        try {
            FileInputStream fileInputStream;
            Throwable th2;
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    ByteBuffer map = channel.map(MapMode.READ_ONLY, 0, channel.size());
                    fileInputStream.close();
                    if (openFileDescriptor == null) {
                        return map;
                    }
                    openFileDescriptor.close();
                    return map;
                } catch (Throwable th3) {
                    th2 = th3;
                    th = th;
                }
            } catch (Throwable th4) {
            }
            throw th2;
            throw th2;
            if (openFileDescriptor != null) {
                if (th != null) {
                    try {
                        openFileDescriptor.close();
                    } catch (Throwable th5) {
                        th.addSuppressed(th5);
                    }
                } else {
                    openFileDescriptor.close();
                }
            }
            throw th2;
            if (th != null) {
                fileInputStream.close();
            } else {
                fileInputStream.close();
            }
            throw th2;
        } catch (IOException e) {
            return null;
        }
    }

    public static ByteBuffer a(Context context, Resources resources, int i) {
        ByteBuffer byteBuffer = null;
        File T = T(context);
        if (T != null) {
            try {
                if (a(T, resources, i)) {
                    byteBuffer = j(T);
                    T.delete();
                }
            } finally {
                T.delete();
            }
        }
        return byteBuffer;
    }

    public static boolean a(File file, InputStream inputStream) {
        IOException e;
        Throwable th;
        Closeable fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream(file, false);
            try {
                byte[] bArr = new byte[WXMediaMessage.DESCRIPTION_LENGTH_LIMIT];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        closeQuietly(fileOutputStream);
                        return true;
                    }
                }
            } catch (IOException e2) {
                e = e2;
                try {
                    new StringBuilder("Error copying resource contents to temp file: ").append(e.getMessage());
                    closeQuietly(fileOutputStream);
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    closeQuietly(fileOutputStream);
                    throw th;
                }
            }
        } catch (IOException e3) {
            e = e3;
            fileOutputStream = null;
            new StringBuilder("Error copying resource contents to temp file: ").append(e.getMessage());
            closeQuietly(fileOutputStream);
            return false;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
            closeQuietly(fileOutputStream);
            throw th;
        }
    }

    public static boolean a(File file, Resources resources, int i) {
        Closeable closeable = null;
        try {
            closeable = resources.openRawResource(i);
            boolean a = a(file, closeable);
            return a;
        } finally {
            closeQuietly(closeable);
        }
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }
}
