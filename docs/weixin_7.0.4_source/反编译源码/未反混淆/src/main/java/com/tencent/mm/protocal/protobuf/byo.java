package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import e.a.a.c.a;
import java.util.LinkedList;

public final class byo extends btd {
    public int Ret;
    public int jBv;
    public String phA;
    public LinkedList<bym> wXM = new LinkedList();
    public int wXN;

    public byo() {
        AppMethodBeat.i(28644);
        AppMethodBeat.o(28644);
    }

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(28645);
        b bVar;
        int ix;
        byte[] bArr;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.BaseResponse == null) {
                bVar = new b("Not all required fields were included: BaseResponse");
                AppMethodBeat.o(28645);
                throw bVar;
            }
            if (this.BaseResponse != null) {
                aVar.iy(1, this.BaseResponse.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            aVar.iz(2, this.jBv);
            aVar.e(3, 8, this.wXM);
            if (this.phA != null) {
                aVar.e(4, this.phA);
            }
            aVar.iz(5, this.wXN);
            aVar.iz(6, this.Ret);
            AppMethodBeat.o(28645);
            return 0;
        } else if (i == 1) {
            if (this.BaseResponse != null) {
                ix = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0;
            } else {
                ix = 0;
            }
            ix = (ix + e.a.a.b.b.a.bs(2, this.jBv)) + e.a.a.a.c(3, 8, this.wXM);
            if (this.phA != null) {
                ix += e.a.a.b.b.a.f(4, this.phA);
            }
            int bs = (ix + e.a.a.b.b.a.bs(5, this.wXN)) + e.a.a.b.b.a.bs(6, this.Ret);
            AppMethodBeat.o(28645);
            return bs;
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.wXM.clear();
            e.a.a.a.a aVar2 = new e.a.a.a.a(bArr, unknownTagHandler);
            for (ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2); ix > 0; ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, ix)) {
                    aVar2.ems();
                }
            }
            if (this.BaseResponse == null) {
                bVar = new b("Not all required fields were included: BaseResponse");
                AppMethodBeat.o(28645);
                throw bVar;
            }
            AppMethodBeat.o(28645);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            byo byo = (byo) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList Vh;
            int size;
            e.a.a.a.a aVar4;
            boolean z;
            switch (intValue) {
                case 1:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        BaseResponse baseResponse = new BaseResponse();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = baseResponse.populateBuilderWithField(aVar4, baseResponse, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        byo.BaseResponse = baseResponse;
                    }
                    AppMethodBeat.o(28645);
                    return 0;
                case 2:
                    byo.jBv = aVar3.BTU.vd();
                    AppMethodBeat.o(28645);
                    return 0;
                case 3:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        bym bym = new bym();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = bym.populateBuilderWithField(aVar4, bym, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        byo.wXM.add(bym);
                    }
                    AppMethodBeat.o(28645);
                    return 0;
                case 4:
                    byo.phA = aVar3.BTU.readString();
                    AppMethodBeat.o(28645);
                    return 0;
                case 5:
                    byo.wXN = aVar3.BTU.vd();
                    AppMethodBeat.o(28645);
                    return 0;
                case 6:
                    byo.Ret = aVar3.BTU.vd();
                    AppMethodBeat.o(28645);
                    return 0;
                default:
                    AppMethodBeat.o(28645);
                    return -1;
            }
        } else {
            AppMethodBeat.o(28645);
            return -1;
        }
    }
}
