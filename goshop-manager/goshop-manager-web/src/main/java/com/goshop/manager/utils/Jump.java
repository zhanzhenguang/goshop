package com.goshop.manager.utils;

import com.goshop.common.context.MessageInfo;

/**
 * Created by Administrator on 2016/3/22.
 */
public class Jump {

    public static String get(String returnUrl,String message){
        returnUrl=returnUrl.replaceAll("&","%26");
        StringBuffer sb = new StringBuffer("forward:/msg?message="+message+"&returnUrl="+returnUrl);
        return sb.toString();
    }
}
