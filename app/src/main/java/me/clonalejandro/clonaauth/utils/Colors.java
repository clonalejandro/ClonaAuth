package me.clonalejandro.clonaauth.utils;

import android.content.Context;
import android.support.annotation.ColorInt;

import me.clonalejandro.clonaauth.Home;
import me.clonalejandro.clonaauth.R;

/**
 * Created by alejandrorioscalera
 * On 26/8/17
 *
 * -- SOCIAL NETWORKS --
 *
 * GitHub: https://github.com/clonalejandro or @clonalejandro
 * Website: https://clonalejandro.me/
 * Twitter: https://twitter.com/clonalejandro11/ or @clonalejandro11
 * Keybase: https://keybase.io/clonalejandro/
 *
 * -- LICENSE --
 *
 * All rights reserved for clonalejandro ©ClonaAuth 2017 / 2018
 */


public class Colors {


    /** SMALL CONSTRUCTORS **/

    @ColorInt
    public static final int
            PRIMARY = cleanCode(R.color.colorPrimary),
            SECONDARY = cleanCode(R.color.colorAccent),
            RED = cleanCode(R.color.red),
            GREEN = cleanCode(R.color.green),
            BLACK = cleanCode(R.color.black),
            WHITE = cleanCode(R.color.white);


    /** REST **/

    /**
     * @deprecated
     * @param color
     * @return
     */
    private static int cleanCode(int color){
        Context context = Home.instance.getApplicationContext();
        return context.getResources().getColor(color);
    }
}
