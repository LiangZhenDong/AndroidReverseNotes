package com.tencent.p177mm.boot.svg.p708a.p709a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.p177mm.plugin.appbrand.jsapi.C33250az;
import com.tencent.p177mm.svg.C5163c;
import com.tencent.p177mm.svg.WeChatSVGRenderC2Java;
import com.tencent.smtt.sdk.WebView;

/* renamed from: com.tencent.mm.boot.svg.a.a.qv */
public final class C41861qv extends C5163c {
    private final int height = C33250az.CTRL_INDEX;
    private final int width = C33250az.CTRL_INDEX;

    /* renamed from: a */
    public final int mo10620a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return C33250az.CTRL_INDEX;
            case 1:
                return C33250az.CTRL_INDEX;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                C5163c.m7881h(looper);
                C5163c.m7880g(looper);
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
                k2 = C5163c.m7876a(k, looper);
                k2.setColor(-12206054);
                Path l = C5163c.m7884l(looper);
                l.moveTo(0.0f, 0.0f);
                l.lineTo(192.0f, 0.0f);
                l.lineTo(192.0f, 192.0f);
                l.lineTo(0.0f, 192.0f);
                l.lineTo(0.0f, 0.0f);
                l.close();
                canvas.drawPath(l, k2);
                canvas.restore();
                canvas.save();
                Paint a = C5163c.m7876a(k, looper);
                a.setColor(-1);
                Path l2 = C5163c.m7884l(looper);
                l2.moveTo(77.751686f, 74.35768f);
                l2.cubicTo(77.10784f, 74.24245f, 76.437546f, 74.181816f, 75.742775f, 74.181816f);
                l2.cubicTo(68.731544f, 74.181816f, 64.21282f, 80.35591f, 64.21282f, 86.517914f);
                l2.cubicTo(64.21282f, 92.45541f, 66.23555f, 93.96758f, 68.60608f, 97.488045f);
                l2.cubicTo(71.74681f, 102.15151f, 66.9005f, 104.17617f, 64.56203f, 105.4618f);
                l2.cubicTo(56.168617f, 110.07818f, 52.363636f, 111.86741f, 52.363636f, 114.268745f);
                l2.lineTo(52.363636f, 117.27127f);
                l2.cubicTo(52.363636f, 118.38834f, 53.15544f, 119.27273f, 54.396816f, 119.27273f);
                l2.lineTo(59.636364f, 119.27273f);
                l2.lineTo(59.636364f, 116.56981f);
                l2.cubicTo(59.636364f, 113.81923f, 68.907974f, 107.92832f, 78.46124f, 102.447945f);
                l2.cubicTo(79.83735f, 101.658516f, 81.18256f, 101.458694f, 81.915855f, 100.97194f);
                l2.cubicTo(81.78531f, 100.32185f, 81.84802f, 99.59008f, 82.1858f, 98.7616f);
                l2.cubicTo(81.8437f, 97.943405f, 81.19023f, 96.83854f, 80.13573f, 95.31172f);
                l2.cubicTo(76.655136f, 90.2713f, 76.38122f, 87.19079f, 76.38122f, 83.46266f);
                l2.cubicTo(76.38122f, 81.69445f, 76.51388f, 77.87981f, 77.751686f, 74.35768f);
                l2.lineTo(77.751686f, 74.35768f);
                l2.close();
                l2.moveTo(114.248314f, 74.35768f);
                l2.cubicTo(114.89216f, 74.24245f, 115.562454f, 74.181816f, 116.257225f, 74.181816f);
                l2.cubicTo(123.268456f, 74.181816f, 127.78718f, 80.35591f, 127.78718f, 86.517914f);
                l2.cubicTo(127.78718f, 92.45541f, 125.76445f, 93.96758f, 123.39392f, 97.488045f);
                l2.cubicTo(120.25319f, 102.15151f, 125.0995f, 104.17617f, 127.43797f, 105.4618f);
                l2.cubicTo(135.83138f, 110.07818f, 139.63637f, 111.86741f, 139.63637f, 114.268745f);
                l2.lineTo(139.63637f, 117.27127f);
                l2.cubicTo(139.63637f, 118.38834f, 138.84456f, 119.27273f, 137.60318f, 119.27273f);
                l2.lineTo(132.36363f, 119.27273f);
                l2.lineTo(132.36363f, 116.56981f);
                l2.cubicTo(132.36363f, 113.81923f, 123.092026f, 107.92832f, 113.53876f, 102.447945f);
                l2.cubicTo(112.16265f, 101.658516f, 110.81744f, 101.458694f, 110.084145f, 100.97194f);
                l2.cubicTo(110.21469f, 100.32185f, 110.15198f, 99.59008f, 109.8142f, 98.7616f);
                l2.cubicTo(110.1563f, 97.943405f, 110.80977f, 96.83854f, 111.86427f, 95.31172f);
                l2.cubicTo(115.344864f, 90.2713f, 115.61878f, 87.19079f, 115.61878f, 83.46266f);
                l2.cubicTo(115.61878f, 81.69445f, 115.48612f, 77.87981f, 114.248314f, 74.35768f);
                l2.lineTo(114.248314f, 74.35768f);
                l2.close();
                l2.moveTo(150.98181f, 52.363636f);
                l2.cubicTo(154.35556f, 52.363636f, 157.09091f, 54.88189f, 157.09091f, 57.98788f);
                l2.lineTo(157.09091f, 131.10303f);
                l2.cubicTo(157.09091f, 134.20901f, 154.35556f, 136.72728f, 150.98181f, 136.72728f);
                l2.lineTo(41.01818f, 136.72728f);
                l2.cubicTo(37.644436f, 136.72728f, 34.909092f, 134.20901f, 34.909092f, 131.10303f);
                l2.lineTo(34.909092f, 57.98788f);
                l2.cubicTo(34.909092f, 54.88189f, 37.644436f, 52.363636f, 41.01818f, 52.363636f);
                l2.lineTo(150.98181f, 52.363636f);
                l2.close();
                l2.moveTo(85.64386f, 136.72728f);
                l2.lineTo(106.323654f, 136.72728f);
                l2.cubicTo(107.28533f, 136.72728f, 108.00023f, 137.29198f, 107.43788f, 137.84982f);
                l2.cubicTo(106.9877f, 138.2959f, 97.8959f, 147.2292f, 97.11818f, 147.99194f);
                l2.cubicTo(96.60817f, 148.49194f, 95.38925f, 148.48311f, 94.87925f, 147.99194f);
                l2.cubicTo(94.30792f, 147.44292f, 85.17125f, 138.47629f, 84.535614f, 137.8263f);
                l2.cubicTo(84.07048f, 137.3508f, 84.58497f, 136.72728f, 85.64386f, 136.72728f);
                l2.close();
                l2.moveTo(80.935814f, 80.71342f);
                l2.cubicTo(80.935814f, 88.75776f, 83.57856f, 90.806526f, 86.67572f, 95.57618f);
                l2.cubicTo(90.77917f, 101.894424f, 84.447334f, 104.637505f, 81.39206f, 106.379326f);
                l2.cubicTo(70.42586f, 112.63377f, 65.454544f, 115.0579f, 65.454544f, 118.311325f);
                l2.lineTo(65.454544f, 122.37926f);
                l2.cubicTo(65.454544f, 123.892715f, 66.48906f, 125.09091f, 68.11095f, 125.09091f);
                l2.lineTo(123.88905f, 125.09091f);
                l2.cubicTo(125.51094f, 125.09091f, 126.545456f, 123.892715f, 126.545456f, 122.37926f);
                l2.lineTo(126.545456f, 118.311325f);
                l2.cubicTo(126.545456f, 115.0579f, 121.57414f, 112.63377f, 110.60794f, 106.379326f);
                l2.cubicTo(107.552666f, 104.637505f, 101.22083f, 101.894424f, 105.32428f, 95.57618f);
                l2.cubicTo(108.42144f, 90.806526f, 111.064186f, 88.75776f, 111.064186f, 80.71342f);
                l2.cubicTo(111.064186f, 72.3649f, 105.160355f, 64.0f, 96.0f, 64.0f);
                l2.cubicTo(86.839645f, 64.0f, 80.935814f, 72.3649f, 80.935814f, 80.71342f);
                l2.close();
                WeChatSVGRenderC2Java.setFillType(l2, 2);
                canvas.drawPath(l2, a);
                canvas.restore();
                C5163c.m7882j(looper);
                break;
        }
        return 0;
    }
}
