package com.tencent.tmassistantsdk.network;

import com.qq.taf.jce.JceStruct;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tmassistantsdk.downloadclient.ITMAssistantExchangeURLListenner;
import com.tencent.tmassistantsdk.protocol.jce.AppDetailParam;
import com.tencent.tmassistantsdk.protocol.jce.GetAppSimpleDetailRequest;
import com.tencent.tmassistantsdk.protocol.jce.GetAppSimpleDetailResponse;
import com.tencent.tmassistantsdk.util.TMLog;
import java.util.ArrayList;

public class GetAppSimpleDetailEngine extends PostHttpRequest {
    protected static final String TAG = "GetAppSimpleDetailHttpRequest";
    protected ITMAssistantExchangeURLListenner mListener = null;

    public GetAppSimpleDetailEngine(ITMAssistantExchangeURLListenner iTMAssistantExchangeURLListenner) {
        this.mListener = iTMAssistantExchangeURLListenner;
    }

    public boolean sendReuqest(ArrayList<AppDetailParam> arrayList) {
        AppMethodBeat.i(75829);
        GetAppSimpleDetailRequest getAppSimpleDetailRequest = new GetAppSimpleDetailRequest();
        if (arrayList == null || arrayList.size() <= 0) {
            AppMethodBeat.o(75829);
            return false;
        }
        getAppSimpleDetailRequest.appReqList = arrayList;
        super.sendRequest(getAppSimpleDetailRequest);
        AppMethodBeat.o(75829);
        return true;
    }

    /* Access modifiers changed, original: protected */
    public void onFinished(JceStruct jceStruct, JceStruct jceStruct2, int i) {
        AppMethodBeat.i(75830);
        if (jceStruct2 == null) {
            AppMethodBeat.o(75830);
            return;
        }
        if (this.mListener == null || i != 0) {
            TMLog.w(TAG, " error happened!!");
            if (this.mListener != null) {
                this.mListener.onExchangedURLSucceed(null, false);
            }
        } else if (jceStruct2 instanceof GetAppSimpleDetailResponse) {
            GetAppSimpleDetailResponse getAppSimpleDetailResponse = (GetAppSimpleDetailResponse) jceStruct2;
            if (getAppSimpleDetailResponse.ret == 0) {
                ArrayList arrayList = getAppSimpleDetailResponse.appSimpleDetailList;
                if (arrayList == null || arrayList.size() <= 0) {
                    TMLog.w(TAG, " appDetails 为空!!");
                    this.mListener.onExchangedURLSucceed(null, false);
                    AppMethodBeat.o(75830);
                    return;
                }
                this.mListener.onExchangedURLSucceed(arrayList, true);
                AppMethodBeat.o(75830);
                return;
            }
            TMLog.w(TAG, " 后台返回的ret错误，错误值为：" + getAppSimpleDetailResponse.ret);
            this.mListener.onExchangedURLSucceed(null, false);
            AppMethodBeat.o(75830);
            return;
        }
        AppMethodBeat.o(75830);
    }
}
