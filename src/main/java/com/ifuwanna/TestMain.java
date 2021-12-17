package com.ifuwanna;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.lang.*;
import java.io.*;
/**
 * packageName    : com.ifuwanna
 * fileName       : TestMain
 * author         : Jihun Park
 * date           : 2021/09/27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2021/09/27        Jihun Park       최초 생성
 */
public class TestMain {

    public static void main (String[] args) throws java.lang.Exception
    {
        //승인응답 (0210)
/*        String receiveText = "0475ISO         0210361800112A6683000000300000000590000000000000000927181530181530092700000000006A10000374579728741167099=                   C1815300069990000024236983                                     N      040                                        203CAV20210927181452910123456789099999999999990000010980900108231446485490010202000000                                                                                                                        4100020000830025082";
        System.out.println(String.valueOf(receiveText.length()));

        receiveText = receiveText.substring(4);
        String reMessageType = receiveText.substring(12, 16);
        System.out.println(reMessageType);

        String resTID = receiveText.substring(138, 150);
        System.out.println(resTID);
        String resCode = receiveText.substring(150, 152);
        System.out.println(resCode);
        String resApproval = receiveText.substring(464, 475);
        System.out.println(resApproval);
        */
//취소응답 (0430)
//        String receiveText = "0391ISO         0430320000102A6282000000300000000590000928164532000000000374579728741167099=                   C1644030070110000024236983                                     N      203CAV20210928164303114123456789099999999999990000010980900108231446485490010202000000                                                                                                                        41000200";
//        System.out.println(String.valueOf(receiveText.length()));
//
//        receiveText = receiveText.substring(4);
//        String reMessageType = receiveText.substring(12, 16);
//        System.out.println(reMessageType);
//        String resTID = receiveText.substring(108, 120);
//        System.out.println(resTID);
//        String resCode = receiveText.substring(120, 122);
//        System.out.println(resCode);

        //승인 망취소 요청 (02100)
        // 0200승인 실패시 망취소 전문(0420)을 날린다.
//        String originalMsg  = "0485ISO02340005302003F18041128668200000030000000059000000000000000000000000000092917240700000000172407092901000000000006A10000374579728741167099=                    17240700701700024236983                                            040                                        203CAV20210929172342929123456789099999999999990000010980900108231446485490010202000000                                                                                                                        41000200";
//        StringBuffer msg = new StringBuffer();
//
//        msg.append(originalMsg.substring(4, 16));
//        msg.append("0420");
//        msg.append("361800112A628300");
//        msg.append(originalMsg.substring(36, 54));
//        msg.append(originalMsg.substring(66, 88));
//        msg.append(originalMsg.substring(96, 106));
//        msg.append(originalMsg.substring(109, 177));
//        msg.append("68");
//        msg.append(originalMsg.substring(177, 232));
//        msg.append(originalMsg.substring(275, 489));
//        msg.append("008        ");
//
//        String length = String.format("%04d", msg.length());
//        String cnclMessage = length + msg.toString();
//        System.out.println(length);
//        System.out.println(cnclMessage);

        //취소 망취소 요청 (0420)
//        String originalMsg  ="0432ISO0234000530420361800112A6283000000300000000590000000000000000929182828000000092900000000006A10000374579728741167099=                    1825340070211700024236983                                            203CAV20210929182443884123456789099999999999990000010980900108231446485490010202000000                                                                                                                        4100020000830025329";
//        StringBuffer msg = new StringBuffer();
//
//        msg.append(originalMsg.substring(4, 154));
//        msg.append("68");
//        msg.append(originalMsg.substring(156, originalMsg.length()));
//
//        String length = String.format("%04d", msg.length());
//        String cnclMessage = length + msg.toString();
//        System.out.println(length);
//        System.out.println(cnclMessage);
//
        String test= "0475ISO         0210361800112A6683000000300000000203000000000000001018010556ㅡ010556101800000000006A10000379491210002040618=��  QEE�           D0105563217050000073979564                                     N      040                                        203CAV20211018010536468106815151099999999999990000010243345210180105520934520202000000                                                                                                                        4100020000830000017";


        System.out.println(test.getBytes().length);
        System.out.println(test.length());


    }
}

