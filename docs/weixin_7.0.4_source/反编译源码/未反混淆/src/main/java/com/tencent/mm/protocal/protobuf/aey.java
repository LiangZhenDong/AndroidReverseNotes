package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import e.a.a.c.a;
import java.util.LinkedList;

public final class aey extends btd {
    public int luT;
    public String luU;
    public um wmA;
    public LinkedList<gz> wmz = new LinkedList();

    public aey() {
        AppMethodBeat.i(56805);
        AppMethodBeat.o(56805);
    }

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(56806);
        b bVar;
        int ix;
        byte[] bArr;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.BaseResponse == null) {
                bVar = new b("Not all required fields were included: BaseResponse");
                AppMethodBeat.o(56806);
                throw bVar;
            }
            if (this.BaseResponse != null) {
                aVar.iy(1, this.BaseResponse.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            aVar.iz(2, this.luT);
            if (this.luU != null) {
                aVar.e(3, this.luU);
            }
            aVar.e(4, 8, this.wmz);
            if (this.wmA != null) {
                aVar.iy(5, this.wmA.computeSize());
                this.wmA.writeFields(aVar);
            }
            AppMethodBeat.o(56806);
            return 0;
        } else if (i == 1) {
            if (this.BaseResponse != null) {
                ix = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0;
            } else {
                ix = 0;
            }
            ix += e.a.a.b.b.a.bs(2, this.luT);
            if (this.luU != null) {
                ix += e.a.a.b.b.a.f(3, this.luU);
            }
            ix += e.a.a.a.c(4, 8, this.wmz);
            if (this.wmA != null) {
                ix += e.a.a.a.ix(5, this.wmA.computeSize());
            }
            AppMethodBeat.o(56806);
            return ix;
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.wmz.clear();
            e.a.a.a.a aVar2 = new e.a.a.a.a(bArr, unknownTagHandler);
            for (ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2); ix > 0; ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, ix)) {
                    aVar2.ems();
                }
            }
            if (this.BaseResponse == null) {
                bVar = new b("Not all required fields were included: BaseResponse");
                AppMethodBeat.o(56806);
                throw bVar;
            }
            AppMethodBeat.o(56806);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            aey aey = (aey) objArr[1];
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
                        aey.BaseResponse = baseResponse;
                    }
                    AppMethodBeat.o(56806);
                    return 0;
                case 2:
                    aey.luT = aVar3.BTU.vd();
                    AppMethodBeat.o(56806);
                    return 0;
                case 3:
                    aey.luU = aVar3.BTU.readString();
                    AppMethodBeat.o(56806);
                    return 0;
                case 4:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        gz gzVar = new gz();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = gzVar.populateBuilderWithField(aVar4, gzVar, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        aey.wmz.add(gzVar);
                    }
                    AppMethodBeat.o(56806);
                    return 0;
                case 5:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        um umVar = new um();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = umVar.populateBuilderWithField(aVar4, umVar, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        aey.wmA = umVar;
                    }
                    AppMethodBeat.o(56806);
                    return 0;
                default:
                    AppMethodBeat.o(56806);
                    return -1;
            }
        } else {
            AppMethodBeat.o(56806);
            return -1;
        }
    }
}
