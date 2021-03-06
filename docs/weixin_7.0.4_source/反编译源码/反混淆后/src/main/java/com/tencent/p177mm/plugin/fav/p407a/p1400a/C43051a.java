package com.tencent.p177mm.plugin.fav.p407a.p1400a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.protocal.protobuf.aap;
import com.tencent.p177mm.protocal.protobuf.aar;
import com.tencent.p177mm.protocal.protobuf.aas;
import com.tencent.p177mm.protocal.protobuf.aat;
import com.tencent.p177mm.protocal.protobuf.aau;
import com.tencent.p177mm.protocal.protobuf.aay;
import com.tencent.p177mm.protocal.protobuf.abe;
import com.tencent.p177mm.protocal.protobuf.abo;
import com.tencent.p177mm.protocal.protobuf.abu;
import com.tencent.p177mm.sdk.platformtools.C4990ab;
import com.tencent.p177mm.sdk.platformtools.C5046bo;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.fav.a.a.a */
public final class C43051a {
    /* renamed from: bK */
    public static String m76486bK(List<aar> list) {
        AppMethodBeat.m2504i(102754);
        String str;
        if (list == null || list.size() == 0) {
            C4990ab.m7418v("MicroMsg.FavDataItemParser", "klem toXml data list empty");
            str = "";
            AppMethodBeat.m2505o(102754);
            return str;
        }
        int size = list.size();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<datalist count='").append(size).append("'>");
        for (int i = 0; i < size; i++) {
            aar aar = (aar) list.get(i);
            stringBuffer.append("<dataitem ");
            if (aar.wgn) {
                stringBuffer.append("datatype='").append(aar.dataType).append("'");
            }
            if (aar.wgQ) {
                stringBuffer.append(" datastatus='").append(aar.wgP).append("'");
            }
            if (aar.wgw) {
                stringBuffer.append(" dataid='").append(aar.mnd).append("'");
            }
            if (aar.whc) {
                stringBuffer.append(" htmlid='").append(C5046bo.ani(aar.whb)).append("'");
            }
            if (aar.whi) {
                stringBuffer.append(" dataillegaltype='").append(aar.whh).append("'");
            }
            if (aar.wgI) {
                stringBuffer.append(" datasourceid='").append(aar.wgH).append("'");
            }
            stringBuffer.append(">");
            if (aar.wgp) {
                stringBuffer.append("<datafmt>").append(aar.wgo).append("</datafmt>");
            }
            if (aar.wfS) {
                stringBuffer.append("<datatitle>").append(C5046bo.ani(aar.title)).append("</datatitle>");
            }
            if (aar.wfT) {
                stringBuffer.append("<datadesc>").append(C5046bo.ani(aar.desc)).append("</datadesc>");
            }
            if (aar.wfU) {
                stringBuffer.append("<cdn_thumburl>").append(C5046bo.ani(aar.fgE)).append("</cdn_thumburl>");
            }
            if (aar.wfX) {
                stringBuffer.append("<thumb_width>").append(aar.fgJ).append("</thumb_width>");
            }
            if (aar.wfY) {
                stringBuffer.append("<thumb_height>").append(aar.fgI).append("</thumb_height>");
            }
            if (aar.wga) {
                stringBuffer.append("<cdn_dataurl>").append(C5046bo.ani(aar.wfZ)).append("</cdn_dataurl>");
            }
            if (aar.wfW) {
                stringBuffer.append("<cdn_thumbkey>").append(C5046bo.ani(aar.wfV)).append("</cdn_thumbkey>");
            }
            if (aar.wgc) {
                stringBuffer.append("<cdn_datakey>").append(C5046bo.ani(aar.wgb)).append("</cdn_datakey>");
            }
            if (aar.wge) {
                stringBuffer.append("<cdn_encryver>").append(aar.wgd).append("</cdn_encryver>");
            }
            if (aar.wgf) {
                stringBuffer.append("<duration>").append(aar.duration).append("</duration>");
            }
            if (aar.wgh) {
                stringBuffer.append("<stream_weburl>").append(C5046bo.ani(aar.wgg)).append("</stream_weburl>");
            }
            if (aar.wgj) {
                stringBuffer.append("<stream_dataurl>").append(C5046bo.ani(aar.wgi)).append("</stream_dataurl>");
            }
            if (aar.wgl) {
                stringBuffer.append("<stream_lowbandurl>").append(C5046bo.ani(aar.wgk)).append("</stream_lowbandurl>");
            }
            if (aar.wgm) {
                stringBuffer.append("<dataext>").append(C5046bo.ani(aar.cvq)).append("</dataext>");
            }
            if (aar.wgr) {
                stringBuffer.append("<fullmd5>").append(aar.wgq).append("</fullmd5>");
            }
            if (aar.wgt) {
                stringBuffer.append("<head256md5>").append(aar.wgs).append("</head256md5>");
            }
            if (aar.wgv) {
                stringBuffer.append("<fullsize>").append(aar.wgu).append("</fullsize>");
            }
            if (aar.wgC) {
                stringBuffer.append("<thumbfullmd5>").append(aar.wgB).append("</thumbfullmd5>");
            }
            if (aar.wgE) {
                stringBuffer.append("<thumbhead256md5>").append(aar.wgD).append("</thumbhead256md5>");
            }
            if (aar.wgG) {
                stringBuffer.append("<thumbfullsize>").append(aar.wgF).append("</thumbfullsize>");
            }
            if (aar.wgK) {
                stringBuffer.append("<stream_videoid>").append(C5046bo.ani(aar.wgJ)).append("</stream_videoid>");
            }
            if (aar.wgS) {
                stringBuffer.append("<datasrctitle>").append(C5046bo.ani(aar.wgR)).append("</datasrctitle>");
            }
            if (aar.wgW) {
                stringBuffer.append("<datasrcname>").append(C5046bo.ani(aar.wgV)).append("</datasrcname>");
            }
            if (aar.wgY) {
                stringBuffer.append("<datasrctime>").append(C5046bo.ani(aar.wgX)).append("</datasrctime>");
            }
            if (aar.whe && (aar.wgT == null || aar.wgT.whA == null || aar.wgT.whA.computeSize() == 0)) {
                stringBuffer.append("<canvasPageXml>").append(C5046bo.ani(aar.canvasPageXml)).append("</canvasPageXml>");
            }
            if (aar.whd) {
                stringBuffer.append("<statextstr>").append(C5046bo.ani(aar.cMn)).append("</statextstr>");
            }
            if (aar.whk) {
                stringBuffer.append("<recordxml>").append(aar.whj).append("</recordxml>");
            }
            aau aau = aar.wgZ;
            if (aau != null) {
                stringBuffer.append("<streamvideo>");
                stringBuffer.append("<streamvideourl>").append(C5046bo.ani(aau.fiG)).append("</streamvideourl>");
                stringBuffer.append("<streamvideototaltime>").append(aau.wid).append("</streamvideototaltime>");
                stringBuffer.append("<streamvideotitle>").append(C5046bo.ani(aau.fiI)).append("</streamvideotitle>");
                stringBuffer.append("<streamvideowording>").append(C5046bo.ani(aau.fiJ)).append("</streamvideowording>");
                stringBuffer.append("<streamvideoweburl>").append(C5046bo.ani(aau.fiK)).append("</streamvideoweburl>");
                stringBuffer.append("<streamvideoaduxinfo>").append(C5046bo.ani(aau.fiM)).append("</streamvideoaduxinfo>");
                stringBuffer.append("<streamvideopublishid>").append(C5046bo.ani(aau.fiN)).append("</streamvideopublishid>");
                stringBuffer.append("</streamvideo>");
            }
            aas aas = aar.wgT;
            if (aas == null || aas.whw == null || aas.whw.computeSize() == 0) {
                C4990ab.m7418v("MicroMsg.FavDataItemParser", "klem toXml, data source item empty");
            } else {
                aat aat = aas.whw;
                stringBuffer.append("<dataitemsource");
                if (aat.whP) {
                    stringBuffer.append(" sourcetype='").append(aat.cvp).append("'");
                }
                if (aat.whT) {
                    stringBuffer.append(" sourceid='").append(aat.whS).append("'");
                }
                stringBuffer.append(">");
                if (aat.whQ) {
                    stringBuffer.append("<fromusr>").append(C5046bo.ani(aat.cEV)).append("</fromusr>");
                }
                if (aat.whR) {
                    stringBuffer.append("<tousr>").append(C5046bo.ani(aat.toUser)).append("</tousr>");
                }
                if (aat.whV) {
                    stringBuffer.append("<realchatname>").append(C5046bo.ani(aat.whU)).append("</realchatname>");
                }
                if (aat.whW) {
                    stringBuffer.append("<msgid>").append(aat.cJb).append("</msgid>");
                }
                if (aat.whX) {
                    stringBuffer.append("<eventid>").append(aat.cOS).append("</eventid>");
                }
                if (aat.whY) {
                    stringBuffer.append("<appid>").append(aat.appId).append("</appid>");
                }
                if (aat.whZ) {
                    stringBuffer.append("<link>").append(C5046bo.ani(aat.link)).append("</link>");
                }
                if (aat.wic) {
                    stringBuffer.append("<brandid>").append(C5046bo.ani(aat.csl)).append("</brandid>");
                }
                stringBuffer.append("</dataitemsource>");
            }
            aas = aar.wgT;
            if (aas == null || aas.why == null || aas.why.computeSize() == 0) {
                C4990ab.m7418v("MicroMsg.FavDataItemParser", "klem toXml, loc item empty");
            } else {
                aay aay = aas.why;
                stringBuffer.append("<locitem>");
                if (aay.wik) {
                    stringBuffer.append("<label>").append(C5046bo.ani(aay.label)).append("</label>");
                }
                if (aay.wii) {
                    stringBuffer.append("<lat>").append(aay.lat).append("</lat>");
                }
                if (aay.wih) {
                    stringBuffer.append("<lng>").append(aay.lng).append("</lng>");
                }
                if (aay.wij) {
                    stringBuffer.append("<scale>").append(aay.cED).append("</scale>");
                }
                if (aay.wil) {
                    stringBuffer.append("<poiname>").append(aay.cIK).append("</poiname>");
                }
                stringBuffer.append("</locitem>");
            }
            aas = aar.wgT;
            if (aas == null || aas.whA == null || aas.whA.computeSize() == 0) {
                C4990ab.m7418v("MicroMsg.FavDataItemParser", "klem toXml, url item empty");
            } else {
                abu abu = aas.whA;
                stringBuffer.append("<weburlitem>");
                if (abu.wiZ) {
                    stringBuffer.append("<clean_url>").append(C5046bo.ani(abu.wiY)).append("</clean_url>");
                }
                if (abu.wfT) {
                    stringBuffer.append("<pagedesc>").append(C5046bo.ani(abu.desc)).append("</pagedesc>");
                }
                if (abu.wiq) {
                    stringBuffer.append("<pagethumb_url>").append(C5046bo.ani(abu.thumbUrl)).append("</pagethumb_url>");
                }
                if (abu.wfS) {
                    stringBuffer.append("<pagetitle>").append(C5046bo.ani(abu.title)).append("</pagetitle>");
                }
                if (abu.wjb) {
                    stringBuffer.append("<opencache>").append(abu.wja).append("</opencache>");
                }
                if (abu.wjc) {
                    stringBuffer.append("<contentattr>").append(abu.fgt).append("</contentattr>");
                }
                if (abu.whe) {
                    stringBuffer.append("<canvasPageXml>").append(C5046bo.ani(abu.canvasPageXml)).append("</canvasPageXml>");
                }
                stringBuffer.append("</weburlitem>");
            }
            aas = aar.wgT;
            if (aas == null || aas.whC == null || aas.whC.computeSize() == 0) {
                C4990ab.m7418v("MicroMsg.FavDataItemParser", "klem toXml, product item empty");
            } else {
                abe abe = aas.whC;
                stringBuffer.append("<productitem");
                if (abe.wis) {
                    stringBuffer.append(" type='").append(abe.type).append("'");
                }
                stringBuffer.append(">");
                if (abe.wfS) {
                    stringBuffer.append("<producttitle>").append(C5046bo.ani(abe.title)).append("</producttitle>");
                }
                if (abe.wfT) {
                    stringBuffer.append("<productdesc>").append(C5046bo.ani(abe.desc)).append("</productdesc>");
                }
                if (abe.wiq) {
                    stringBuffer.append("<productthumb_url>").append(C5046bo.ani(abe.thumbUrl)).append("</productthumb_url>");
                }
                if (abe.wir) {
                    stringBuffer.append("<productinfo>").append(C5046bo.ani(abe.info)).append("</productinfo>");
                }
                stringBuffer.append("</productitem>");
            }
            aas = aar.wgT;
            if (aas == null || aas.whE == null || aas.whE.computeSize() == 0) {
                C4990ab.m7418v("MicroMsg.FavDataItemParser", "klem toXml, product item empty");
            } else {
                abo abo = aas.whE;
                stringBuffer.append("<tvitem>");
                if (abo.wfS) {
                    stringBuffer.append("<tvtitle>").append(C5046bo.ani(abo.title)).append("</tvtitle>");
                }
                if (abo.wfT) {
                    stringBuffer.append("<tvdesc>").append(C5046bo.ani(abo.desc)).append("</tvdesc>");
                }
                if (abo.wiq) {
                    stringBuffer.append("<tvthumb_url>").append(C5046bo.ani(abo.thumbUrl)).append("</tvthumb_url>");
                }
                if (abo.wir) {
                    stringBuffer.append("<tvinfo>").append(C5046bo.ani(abo.info)).append("</tvinfo>");
                }
                stringBuffer.append("</tvitem>");
            }
            aas aas2 = aar.wgT;
            if (aas2 == null || aas2.whN == null) {
                C4990ab.m7412e("MicroMsg.FavDataItemParser", "setAppBrandXml toXml, item empty");
            } else {
                aap aap = aas2.whN;
                if (aap != null) {
                    stringBuffer.append("<appbranditem>");
                    stringBuffer.append("<username>").append(C5046bo.ani(aap.username)).append("</username>");
                    stringBuffer.append("<appid>").append(C5046bo.ani(aap.appId)).append("</appid>");
                    stringBuffer.append("<pkgtype>").append(aap.cBc).append("</pkgtype>");
                    stringBuffer.append("<iconurl>").append(C5046bo.ani(aap.iconUrl)).append("</iconurl>");
                    stringBuffer.append("<type>").append(aap.type).append("</type>");
                    stringBuffer.append("<pagepath>").append(C5046bo.ani(aap.csu)).append("</pagepath>");
                    stringBuffer.append("<sourcedisplayname>").append(C5046bo.ani(aap.wfO)).append("</sourcedisplayname>");
                    stringBuffer.append("</appbranditem>");
                }
            }
            stringBuffer.append("</dataitem>");
        }
        stringBuffer.append("</datalist>");
        str = stringBuffer.toString();
        AppMethodBeat.m2505o(102754);
        return str;
    }
}
