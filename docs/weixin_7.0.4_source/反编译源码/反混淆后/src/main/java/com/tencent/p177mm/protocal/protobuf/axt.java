package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import java.util.LinkedList;
import p690e.p691a.p692a.C6087a;
import p690e.p691a.p692a.C6092b;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.axt */
public final class axt extends btd {
    public C15381rg wBJ;
    public cvx wBP;
    public cvy wBQ;
    public cyd wBR;

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(96276);
        C6092b c6092b;
        int ix;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.BaseResponse == null) {
                c6092b = new C6092b("Not all required fields were included: BaseResponse");
                AppMethodBeat.m2505o(96276);
                throw c6092b;
            }
            if (this.BaseResponse != null) {
                c6093a.mo13479iy(1, this.BaseResponse.computeSize());
                this.BaseResponse.writeFields(c6093a);
            }
            if (this.wBP != null) {
                c6093a.mo13479iy(2, this.wBP.computeSize());
                this.wBP.writeFields(c6093a);
            }
            if (this.wBJ != null) {
                c6093a.mo13479iy(3, this.wBJ.computeSize());
                this.wBJ.writeFields(c6093a);
            }
            if (this.wBQ != null) {
                c6093a.mo13479iy(4, this.wBQ.computeSize());
                this.wBQ.writeFields(c6093a);
            }
            if (this.wBR != null) {
                c6093a.mo13479iy(5, this.wBR.computeSize());
                this.wBR.writeFields(c6093a);
            }
            AppMethodBeat.m2505o(96276);
            return 0;
        } else if (i == 1) {
            if (this.BaseResponse != null) {
                ix = C6087a.m9557ix(1, this.BaseResponse.computeSize()) + 0;
            } else {
                ix = 0;
            }
            if (this.wBP != null) {
                ix += C6087a.m9557ix(2, this.wBP.computeSize());
            }
            if (this.wBJ != null) {
                ix += C6087a.m9557ix(3, this.wBJ.computeSize());
            }
            if (this.wBQ != null) {
                ix += C6087a.m9557ix(4, this.wBQ.computeSize());
            }
            if (this.wBR != null) {
                ix += C6087a.m9557ix(5, this.wBR.computeSize());
            }
            AppMethodBeat.m2505o(96276);
            return ix;
        } else if (i == 2) {
            C6086a c6086a = new C6086a((byte[]) objArr[0], unknownTagHandler);
            for (ix = C1331a.getNextFieldNumber(c6086a); ix > 0; ix = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, ix)) {
                    c6086a.ems();
                }
            }
            if (this.BaseResponse == null) {
                c6092b = new C6092b("Not all required fields were included: BaseResponse");
                AppMethodBeat.m2505o(96276);
                throw c6092b;
            }
            AppMethodBeat.m2505o(96276);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            axt axt = (axt) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList Vh;
            int size;
            byte[] bArr;
            C6086a c6086a3;
            boolean z;
            switch (intValue) {
                case 1:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        BaseResponse baseResponse = new BaseResponse();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = baseResponse.populateBuilderWithField(c6086a3, baseResponse, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        axt.BaseResponse = baseResponse;
                    }
                    AppMethodBeat.m2505o(96276);
                    return 0;
                case 2:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        cvx cvx = new cvx();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = cvx.populateBuilderWithField(c6086a3, cvx, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        axt.wBP = cvx;
                    }
                    AppMethodBeat.m2505o(96276);
                    return 0;
                case 3:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        C15381rg c15381rg = new C15381rg();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = c15381rg.populateBuilderWithField(c6086a3, c15381rg, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        axt.wBJ = c15381rg;
                    }
                    AppMethodBeat.m2505o(96276);
                    return 0;
                case 4:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        cvy cvy = new cvy();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = cvy.populateBuilderWithField(c6086a3, cvy, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        axt.wBQ = cvy;
                    }
                    AppMethodBeat.m2505o(96276);
                    return 0;
                case 5:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        cyd cyd = new cyd();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = cyd.populateBuilderWithField(c6086a3, cyd, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        axt.wBR = cyd;
                    }
                    AppMethodBeat.m2505o(96276);
                    return 0;
                default:
                    AppMethodBeat.m2505o(96276);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(96276);
            return -1;
        }
    }
}
