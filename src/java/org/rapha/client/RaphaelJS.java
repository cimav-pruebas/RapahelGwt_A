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
public final class RaphaelJS extends JavaScriptObject {
    
    private static RaphaelJS instance;

    protected RaphaelJS() {}
    
    public static RaphaelJS getNew(float a, float b, float c, float d){
        RaphaelJS raphaelJS = getNewInner(a, b, c, d);
        return raphaelJS;
    }
    
    // se declara el Canvas del Rapahel y se maneja como variable global: $wnd.raphaelGlobal
    private native static RaphaelJS getNewInner(float a, float b, float c, float d)/*-{
        // Creates canvas 320 × 200 at 10, 50
        $wnd.raphaelGlobal = $wnd.Raphael(a, b, c, d);
        return $wnd.raphaelObj;
    }-*/;

    
    private native static JSONObject circle(RaphaelJS o, int a, int b, int c)/*-{
        return o.circle(a,b,c);
    }-*/;
    
    public native void niceInner(String fillColor, String strokeColor)/*-{
            
        // usamos la variable global
         var paper = $wnd.raphaelGlobal;

         // Creates circle at x = 50, y = 40, with radius 10
         var circle = paper.circle(50, 40, 10);
         // Sets the fill attribute of the circle to red (#f00)
         circle.attr("fill", fillColor);

         // Sets the stroke attribute of the circle to white
         circle.attr("stroke", strokeColor);
         }-*/;
    
}
