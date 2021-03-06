package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import e.a.a.c.a;
import java.util.LinkedList;

public final class bpm extends btd {
    public String lCH;
    public bpj wRK;
    public int wRY;
    public int wRZ;
    public String wSa;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(28607);
        b bVar;
        int ix;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.wRK == null) {
                bVar = new b("Not all required fields were included: rcptinfolist");
                AppMethodBeat.o(28607);
                throw bVar;
            } else if (this.BaseResponse == null) {
                bVar = new b("Not all required fields were included: BaseResponse");
                AppMethodBeat.o(28607);
                throw bVar;
            } else {
                if (this.wRK != null) {
                    aVar.iy(1, this.wRK.computeSize());
                    this.wRK.writeFields(aVar);
                }
                aVar.iz(2, this.wRY);
                if (this.BaseResponse != null) {
                    aVar.iy(3, this.BaseResponse.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                if (this.lCH != null) {
                    aVar.e(4, this.lCH);
                }
                aVar.iz(5, this.wRZ);
                if (this.wSa != null) {
                    aVar.e(6, this.wSa);
                }
                AppMethodBeat.o(28607);
                return 0;
            }
        } else if (i == 1) {
            if (this.wRK != null) {
                ix = e.a.a.a.ix(1, this.wRK.computeSize()) + 0;
            } else {
                ix = 0;
            }
            ix += e.a.a.b.b.a.bs(2, this.wRY);
            if (this.BaseResponse != null) {
                ix += e.a.a.a.ix(3, this.BaseResponse.computeSize());
            }
            if (this.lCH != null) {
                ix += e.a.a.b.b.a.f(4, this.lCH);
            }
            ix += e.a.a.b.b.a.bs(5, this.wRZ);
            if (this.wSa != null) {
                ix += e.a.a.b.b.a.f(6, this.wSa);
            }
            AppMethodBeat.o(28607);
            return ix;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2); ix > 0; ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, ix)) {
                    aVar2.ems();
                }
            }
            if (this.wRK == null) {
                bVar = new b("Not all required fields were included: rcptinfolist");
                AppMethodBeat.o(28607);
                throw bVar;
            } else if (this.BaseResponse == null) {
                bVar = new b("Not all required fields were included: BaseResponse");
                AppMethodBeat.o(28607);
                throw bVar;
            } else {
                AppMethodBeat.o(28607);
                return 0;
            }
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            bpm bpm = (bpm) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList Vh;
            int size;
            byte[] bArr;
            e.a.a.a.a aVar4;
            boolean z;
            switch (intValue) {
                case 1:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        bpj bpj = new bpj();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = bpj.populateBuilderWithField(aVar4, bpj, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        bpm.wRK = bpj;
                    }
                    AppMethodBeat.o(28607);
                    return 0;
                case 2:
                    bpm.wRY = aVar3.BTU.vd();
                    AppMethodBeat.o(28607);
                    return 0;
                case 3:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        BaseResponse baseResponse = new BaseResponse();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = baseResponse.populateBuilderWithField(aVar4, baseResponse, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        bpm.BaseResponse = baseResponse;
                    }
                    AppMethodBeat.o(28607);
                    return 0;
                case 4:
                    bpm.lCH = aVar3.BTU.readString();
                    AppMethodBeat.o(28607);
                    return 0;
                case 5:
                    bpm.wRZ = aVar3.BTU.vd();
                    AppMethodBeat.o(28607);
                    return 0;
                case 6:
                    bpm.wSa = aVar3.BTU.readString();
                    AppMethodBeat.o(28607);
                    return 0;
                default:
                    AppMethodBeat.o(28607);
                    return -1;
            }
        } else {
            AppMethodBeat.o(28607);
            return -1;
        }
    }
}
