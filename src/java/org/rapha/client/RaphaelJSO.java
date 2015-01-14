/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rapha.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.json.client.JSONObject;

/**
 *
 * @author juan.calderon
 */
class RaphaelJSO  extends JavaScriptObject {
     protected RaphaelJSO(){}

    public static RaphaelJSO getNew(float a, float b, float c, float d){
        RaphaelJSO rjso = getNewInner(100, 200 , 300, 400);
        return rjso;
    }

    private final static native RaphaelJSO getNewInner(float a, float b, float c, float d)/*-{
        return new Raphael(a, b, c, d);
    }-*/;
    

    public JSONObject circle(int a,int b, int c){
        return circle(this,a,b,c);
    }

    private native JSONObject circle(RaphaelJSO o, int a, int b, int c)/*-{
        return o.circle(a,b,c);
    }-*/;
}
