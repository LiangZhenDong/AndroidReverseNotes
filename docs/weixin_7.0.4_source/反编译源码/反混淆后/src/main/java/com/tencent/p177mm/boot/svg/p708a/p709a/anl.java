package com.tencent.p177mm.boot.svg.p708a.p709a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.p177mm.svg.C5163c;
import com.tencent.p177mm.svg.WeChatSVGRenderC2Java;
import com.tencent.smtt.sdk.WebView;

/* renamed from: com.tencent.mm.boot.svg.a.a.anl */
public final class anl extends C5163c {
    private final int height = 72;
    private final int width = 72;

    /* renamed from: a */
    public final int mo10620a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 72;
            case 1:
                return 72;
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
                Paint a = C5163c.m7876a(k, looper);
                a.setColor(-16742926);
                Path l = C5163c.m7884l(looper);
                l.moveTo(55.270435f, 33.955383f);
                l.cubicTo(54.53415f, 33.342094f, 53.56599f, 32.96981f, 52.505447f, 32.96981f);
                l.cubicTo(51.657738f, 32.96981f, 50.869057f, 33.207664f, 50.210636f, 33.616325f);
                l.cubicTo(49.896084f, 25.826353f, 42.500576f, 19.816132f, 33.442013f, 19.816132f);
                l.cubicTo(24.183933f, 19.816132f, 17.093624f, 26.094025f, 17.093624f, 34.133606f);
                l.cubicTo(17.093624f, 38.500103f, 19.191387f, 42.369247f, 22.93696f, 45.08483f);
                l.cubicTo(23.136736f, 45.22967f, 23.218327f, 45.367348f, 23.306578f, 45.695442f);
                l.cubicTo(23.394829f, 46.023537f, 23.387814f, 46.14245f, 23.306578f, 46.458973f);
                l.cubicTo(23.128765f, 47.15179f, 22.862043f, 48.191025f, 22.506418f, 49.576664f);
                l.cubicTo(22.427124f, 49.868793f, 22.396341f, 49.96327f, 22.531294f, 50.06017f);
                l.cubicTo(22.666245f, 50.15707f, 22.861425f, 50.036293f, 22.988245f, 49.959282f);
                l.cubicTo(24.555853f, 48.9977f, 25.763601f, 48.276676f, 26.611486f, 47.796204f);
                l.cubicTo(26.790516f, 47.694756f, 27.061895f, 47.559803f, 27.442537f, 47.52867f);
                l.cubicTo(27.823177f, 47.49754f, 27.998741f, 47.57169f, 28.301105f, 47.658016f);
                l.cubicTo(29.964975f, 48.133083f, 31.653202f, 48.428844f, 33.442013f, 48.428844f);
                l.cubicTo(35.108593f, 48.428844f, 36.71888f, 48.22613f, 38.239136f, 47.84679f);
                l.cubicTo(38.278244f, 49.67033f, 39.3235f, 51.24567f, 40.840965f, 52.03786f);
                l.cubicTo(38.614788f, 52.717438f, 36.21828f, 53.086254f, 33.71651f, 53.086254f);
                l.cubicTo(31.474981f, 53.086254f, 28.99458f, 52.657124f, 26.89914f, 52.077354f);
                l.lineTo(20.69452f, 55.262695f);
                l.cubicTo(20.333189f, 55.444405f, 19.814833f, 55.5877f, 19.413658f, 55.46819f);
                l.cubicTo(18.345406f, 55.149952f, 17.915743f, 54.46109f, 18.063162f, 53.336388f);
                l.lineTo(18.836742f, 48.024902f);
                l.cubicTo(14.617265f, 44.45537f, 12.0f, 39.333954f, 12.0f, 34.076088f);
                l.cubicTo(12.0f, 23.530424f, 21.731398f, 15.0f, 33.71651f, 15.0f);
                l.cubicTo(45.65586f, 15.0f, 55.197746f, 23.465408f, 55.270435f, 33.955383f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 1);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                a = C5163c.m7876a(k, looper);
                a.setColor(-301824);
                l = C5163c.m7884l(looper);
                l.moveTo(53.088978f, 53.077618f);
                l.cubicTo(53.024998f, 53.066643f, 52.96044f, 53.057404f, 52.895313f, 53.050476f);
                l.cubicTo(50.999004f, 52.69648f, 49.38291f, 51.982403f, 47.91601f, 50.512135f);
                l.cubicTo(47.809956f, 50.406456f, 47.70736f, 50.298466f, 47.607647f, 50.188744f);
                l.cubicTo(47.307926f, 49.88903f, 46.82261f, 49.88903f, 46.523464f, 50.189323f);
                l.cubicTo(46.24334f, 50.469402f, 46.22547f, 50.912907f, 46.469284f, 51.21435f);
                l.cubicTo(46.486f, 51.23514f, 46.50387f, 51.255356f, 46.523464f, 51.27499f);
                l.cubicTo(46.556896f, 51.308483f, 46.59321f, 51.337357f, 46.630672f, 51.363342f);
                l.cubicTo(46.705025f, 51.433796f, 46.77938f, 51.505405f, 46.852005f, 51.578167f);
                l.cubicTo(48.28663f, 53.01552f, 48.990875f, 54.587154f, 49.360916f, 56.440872f);
                l.cubicTo(49.367256f, 56.5454f, 49.378784f, 56.649345f, 49.3955f, 56.752712f);
                l.cubicTo(49.41337f, 56.866478f, 49.437576f, 56.979664f, 49.468124f, 57.091698f);
                l.cubicTo(49.609913f, 57.612583f, 49.884274f, 58.10518f, 50.29293f, 58.51461f);
                l.cubicTo(51.54484f, 59.7689f, 53.574295f, 59.7689f, 54.825626f, 58.51461f);
                l.cubicTo(56.077534f, 57.26032f, 56.077534f, 55.227005f, 54.825626f, 53.973293f);
                l.cubicTo(54.384693f, 53.53094f, 53.846348f, 53.245663f, 53.28034f, 53.115154f);
                l.cubicTo(53.216934f, 53.100716f, 53.152954f, 53.088013f, 53.088978f, 53.077618f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                a = C5163c.m7876a(k, looper);
                a.setColor(-16742926);
                l = C5163c.m7884l(looper);
                l.moveTo(59.15909f, 44.717598f);
                l.cubicTo(58.71815f, 45.15995f, 58.43342f, 45.69874f, 58.303154f, 46.265827f);
                l.cubicTo(58.288746f, 46.32935f, 58.276066f, 46.39345f, 58.265114f, 46.45755f);
                l.cubicTo(58.254738f, 46.52223f, 58.245518f, 46.586906f, 58.238598f, 46.651585f);
                l.cubicTo(57.885277f, 48.551502f, 57.172955f, 50.171066f, 55.70548f, 51.64134f);
                l.cubicTo(55.6f, 51.747017f, 55.49164f, 51.849808f, 55.3827f, 51.949715f);
                l.cubicTo(55.083557f, 52.250004f, 55.083557f, 52.736244f, 55.383278f, 53.035957f);
                l.cubicTo(55.662827f, 53.316612f, 56.10549f, 53.334515f, 56.40694f, 53.09024f);
                l.cubicTo(56.427113f, 53.073494f, 56.44729f, 53.05559f, 56.466885f, 53.035957f);
                l.cubicTo(56.500313f, 53.002464f, 56.529133f, 52.96666f, 56.55565f, 52.929123f);
                l.cubicTo(56.62539f, 52.85405f, 56.696285f, 52.780132f, 56.769485f, 52.70679f);
                l.cubicTo(58.20411f, 51.26944f, 59.969f, 50.366257f, 61.819775f, 49.99609f);
                l.cubicTo(61.924103f, 49.98974f, 62.02785f, 49.978188f, 62.131023f, 49.96144f);
                l.cubicTo(62.24457f, 49.94354f, 62.357544f, 49.91871f, 62.46936f, 49.888103f);
                l.cubicTo(62.989838f, 49.74604f, 63.28428f, 49.668354f, 63.69236f, 49.259495f);
                l.cubicTo(64.94427f, 48.005203f, 64.94427f, 45.97189f, 63.69236f, 44.717598f);
                l.cubicTo(62.441025f, 43.463306f, 60.410995f, 43.463306f, 59.15909f, 44.717598f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                a = C5163c.m7876a(k, looper);
                a.setColor(-13779968);
                l = C5163c.m7884l(looper);
                l.moveTo(49.92115f, 40.375607f);
                l.cubicTo(50.362083f, 40.81738f, 50.90043f, 41.102657f, 51.46644f, 41.233166f);
                l.cubicTo(51.52984f, 41.247604f, 51.59382f, 41.260307f, 51.6578f, 41.271282f);
                l.cubicTo(51.722355f, 41.281677f, 51.786907f, 41.290916f, 51.851463f, 41.297844f);
                l.cubicTo(53.74835f, 41.65184f, 55.36386f, 42.365917f, 56.830765f, 43.836185f);
                l.cubicTo(56.936817f, 43.941864f, 57.039413f, 44.05043f, 57.139706f, 44.159576f);
                l.cubicTo(57.439426f, 44.45929f, 57.924168f, 44.45929f, 58.22389f, 44.159576f);
                l.cubicTo(58.503433f, 43.878918f, 58.5213f, 43.435413f, 58.277493f, 43.13397f);
                l.cubicTo(58.260777f, 43.11318f, 58.24291f, 43.092968f, 58.22389f, 43.073334f);
                l.cubicTo(58.190456f, 43.039837f, 58.154144f, 43.010963f, 58.11668f, 42.984978f);
                l.cubicTo(58.041748f, 42.914524f, 57.96797f, 42.84292f, 57.89477f, 42.770153f);
                l.cubicTo(56.460148f, 41.3328f, 55.755898f, 39.76174f, 55.38586f, 37.907448f);
                l.cubicTo(55.380096f, 37.80292f, 55.36857f, 37.698975f, 55.351852f, 37.595608f);
                l.cubicTo(55.333984f, 37.481842f, 55.3092f, 37.368656f, 55.27923f, 37.256626f);
                l.cubicTo(55.13686f, 36.735737f, 54.8625f, 36.243145f, 54.45442f, 35.83371f);
                l.cubicTo(53.20251f, 34.57942f, 51.173058f, 34.57942f, 49.92115f, 35.83371f);
                l.cubicTo(48.669815f, 37.088f, 48.669815f, 39.121315f, 49.92115f, 40.375607f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                k = C5163c.m7876a(k, looper);
                k.setColor(-13312);
                l = C5163c.m7884l(looper);
                l.moveTo(46.508118f, 47.696793f);
                l.cubicTo(46.86202f, 45.796875f, 47.574337f, 44.17731f, 49.041237f, 42.70704f);
                l.cubicTo(49.147293f, 42.60136f, 49.255077f, 42.49857f, 49.36459f, 42.398666f);
                l.cubicTo(49.66316f, 42.098373f, 49.66316f, 41.612133f, 49.364014f, 41.31242f);
                l.cubicTo(49.083893f, 41.031765f, 48.641228f, 41.013863f, 48.340355f, 41.258137f);
                l.cubicTo(48.319603f, 41.274883f, 48.29943f, 41.292786f, 48.28041f, 41.31242f);
                l.cubicTo(48.24698f, 41.345913f, 48.217583f, 41.381718f, 48.191647f, 41.419254f);
                l.cubicTo(48.121326f, 41.494328f, 48.05043f, 41.568245f, 47.97723f, 41.641586f);
                l.cubicTo(46.543182f, 43.078938f, 44.974934f, 43.784927f, 43.12416f, 44.155094f);
                l.cubicTo(43.02041f, 44.161446f, 42.91666f, 44.172997f, 42.812912f, 44.189743f);
                l.cubicTo(42.699364f, 44.207645f, 42.58639f, 44.232475f, 42.475147f, 44.263084f);
                l.cubicTo(41.954674f, 44.405144f, 41.463017f, 44.680027f, 41.05436f, 45.088882f);
                l.cubicTo(39.80245f, 46.343174f, 39.80245f, 48.37649f, 41.05436f, 49.63078f);
                l.cubicTo(42.306267f, 50.88507f, 44.33572f, 50.88507f, 45.58763f, 49.63078f);
                l.cubicTo(46.028564f, 49.189007f, 46.313877f, 48.64964f, 46.444138f, 48.08255f);
                l.cubicTo(46.45855f, 48.019028f, 46.47123f, 47.95493f, 46.481606f, 47.890827f);
                l.cubicTo(46.492554f, 47.82615f, 46.5012f, 47.76147f, 46.508118f, 47.696793f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, k);
                canvas.restore();
                C5163c.m7882j(looper);
                break;
        }
        return 0;
    }
}
