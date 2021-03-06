package com.tencent.p177mm.boot.svg.p708a.p709a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.p177mm.svg.C5163c;
import com.tencent.p177mm.svg.WeChatSVGRenderC2Java;
import com.tencent.smtt.sdk.WebView;

/* renamed from: com.tencent.mm.boot.svg.a.a.ata */
public final class ata extends C5163c {
    private final int height = 90;
    private final int width = 90;

    /* renamed from: a */
    public final int mo10620a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 90;
            case 1:
                return 90;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                Matrix h = C5163c.m7881h(looper);
                float[] g = C5163c.m7880g(looper);
                Paint k = C5163c.m7883k(looper);
                k.setFlags(385);
                k.setStyle(Style.FILL);
                Paint k2 = C5163c.m7883k(looper);
                k2.setFlags(385);
                k2.setStyle(Style.STROKE);
                k.setColor(WebView.NIGHT_MODE_COLOR);
                k2.setStrokeWidth(1.0f);
                k2.setStrokeCap(Cap.BUTT);
                k2.setStrokeJoin(Join.MITER);
                k2.setStrokeMiter(4.0f);
                k2.setPathEffect(null);
                C5163c.m7876a(k2, looper).setStrokeWidth(1.0f);
                canvas.save();
                Paint a = C5163c.m7876a(k, looper);
                a.setColor(-6052957);
                g = C5163c.m7878a(g, 1.0f, 0.0f, 10.0f, 0.0f, 1.0f, 18.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                Paint a2 = C5163c.m7876a(a, looper);
                Path l = C5163c.m7884l(looper);
                l.moveTo(0.0f, 3.990053f);
                l.cubicTo(0.0f, 1.7864076f, 1.7890275f, 0.0f, 4.0042577f, 0.0f);
                l.lineTo(27.995743f, 0.0f);
                l.cubicTo(30.207233f, 0.0f, 32.0f, 1.7842933f, 32.0f, 3.990053f);
                l.lineTo(32.0f, 20.009947f);
                l.cubicTo(32.0f, 22.213593f, 30.210972f, 24.0f, 27.995743f, 24.0f);
                l.lineTo(4.0042577f, 24.0f);
                l.cubicTo(1.7927673f, 24.0f, 0.0f, 22.215706f, 0.0f, 20.009947f);
                l.lineTo(0.0f, 3.990053f);
                l.close();
                l.moveTo(3.0f, 3.9933977f);
                l.cubicTo(3.0f, 3.4447594f, 3.4512787f, 3.0f, 4.0032997f, 3.0f);
                l.lineTo(27.9967f, 3.0f);
                l.cubicTo(28.550808f, 3.0f, 29.0f, 3.4449463f, 29.0f, 3.9933977f);
                l.lineTo(29.0f, 20.006603f);
                l.cubicTo(29.0f, 20.55524f, 28.548721f, 21.0f, 27.9967f, 21.0f);
                l.lineTo(4.0032997f, 21.0f);
                l.cubicTo(3.4491925f, 21.0f, 3.0f, 20.555054f, 3.0f, 20.006603f);
                l.lineTo(3.0f, 3.9933977f);
                l.close();
                l.moveTo(0.0f, 33.99005f);
                l.cubicTo(0.0f, 31.786407f, 1.7890275f, 30.0f, 4.0042577f, 30.0f);
                l.lineTo(27.995743f, 30.0f);
                l.cubicTo(30.207233f, 30.0f, 32.0f, 31.784294f, 32.0f, 33.99005f);
                l.lineTo(32.0f, 50.00995f);
                l.cubicTo(32.0f, 52.213593f, 30.210972f, 54.0f, 27.995743f, 54.0f);
                l.lineTo(4.0042577f, 54.0f);
                l.cubicTo(1.7927673f, 54.0f, 0.0f, 52.215706f, 0.0f, 50.00995f);
                l.lineTo(0.0f, 33.99005f);
                l.close();
                l.moveTo(3.0f, 33.993397f);
                l.cubicTo(3.0f, 33.44476f, 3.4512787f, 33.0f, 4.0032997f, 33.0f);
                l.lineTo(27.9967f, 33.0f);
                l.cubicTo(28.550808f, 33.0f, 29.0f, 33.444946f, 29.0f, 33.993397f);
                l.lineTo(29.0f, 50.006603f);
                l.cubicTo(29.0f, 50.55524f, 28.548721f, 51.0f, 27.9967f, 51.0f);
                l.lineTo(4.0032997f, 51.0f);
                l.cubicTo(3.4491925f, 51.0f, 3.0f, 50.555054f, 3.0f, 50.006603f);
                l.lineTo(3.0f, 33.993397f);
                l.close();
                l.moveTo(38.0f, 33.99005f);
                l.cubicTo(38.0f, 31.786407f, 39.78903f, 30.0f, 42.004257f, 30.0f);
                l.lineTo(65.99574f, 30.0f);
                l.cubicTo(68.20723f, 30.0f, 70.0f, 31.784294f, 70.0f, 33.99005f);
                l.lineTo(70.0f, 50.00995f);
                l.cubicTo(70.0f, 52.213593f, 68.210976f, 54.0f, 65.99574f, 54.0f);
                l.lineTo(42.004257f, 54.0f);
                l.cubicTo(39.792767f, 54.0f, 38.0f, 52.215706f, 38.0f, 50.00995f);
                l.lineTo(38.0f, 33.99005f);
                l.close();
                l.moveTo(41.0f, 33.993397f);
                l.cubicTo(41.0f, 33.44476f, 41.45128f, 33.0f, 42.0033f, 33.0f);
                l.lineTo(65.996704f, 33.0f);
                l.cubicTo(66.550804f, 33.0f, 67.0f, 33.444946f, 67.0f, 33.993397f);
                l.lineTo(67.0f, 50.006603f);
                l.cubicTo(67.0f, 50.55524f, 66.54872f, 51.0f, 65.996704f, 51.0f);
                l.lineTo(42.0033f, 51.0f);
                l.cubicTo(41.449192f, 51.0f, 41.0f, 50.555054f, 41.0f, 50.006603f);
                l.lineTo(41.0f, 33.993397f);
                l.close();
                l.moveTo(38.0f, 3.990053f);
                l.cubicTo(38.0f, 1.7864076f, 39.78903f, 0.0f, 42.004257f, 0.0f);
                l.lineTo(65.99574f, 0.0f);
                l.cubicTo(68.20723f, 0.0f, 70.0f, 1.7842933f, 70.0f, 3.990053f);
                l.lineTo(70.0f, 20.009947f);
                l.cubicTo(70.0f, 22.213593f, 68.210976f, 24.0f, 65.99574f, 24.0f);
                l.lineTo(42.004257f, 24.0f);
                l.cubicTo(39.792767f, 24.0f, 38.0f, 22.215706f, 38.0f, 20.009947f);
                l.lineTo(38.0f, 3.990053f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a2);
                canvas.restore();
                canvas.restore();
                C5163c.m7882j(looper);
                break;
        }
        return 0;
    }
}
