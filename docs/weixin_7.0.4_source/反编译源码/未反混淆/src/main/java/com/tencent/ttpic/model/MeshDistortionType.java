package com.tencent.ttpic.model;

import android.graphics.PointF;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class MeshDistortionType {
    public float direction;
    public float faceDegree;
    public float faceRatio;
    public float offsetX;
    public float offsetY;
    public PointF point = new PointF();
    public float radius;
    public float strength;
    public int type;

    public MeshDistortionType() {
        AppMethodBeat.i(83508);
        AppMethodBeat.o(83508);
    }
}
