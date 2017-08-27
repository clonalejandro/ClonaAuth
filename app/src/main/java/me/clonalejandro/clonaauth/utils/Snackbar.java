package me.clonalejandro.clonaauth.utils;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

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


public class Snackbar{


    /** SMALL CONSTRUCTORS **/

    public Snackbar(String msg, int colorText, int colorBackground, Duration duration){
        View view = Home.instance.findViewById(R.id.home_layout);

        int Id = R.id.snackbar_text;
        int d = 0, low = 0, high = 0;

        switch (duration){
            default:
                low = Time.SHORT;
                d = low;
                break;
            case MEDIUM:
                d = low * 2;
                break;

            case LONG:
                high = Time.LONG;
                d = high;
                break;
            case CLONA_PENIS:
                d = high * 2;
                break;
        }

        android.support.design.widget.Snackbar snackbar = android.support.design.widget.Snackbar.make(view, msg, d);

        View snackbarView = snackbar.getView();
        snackbarView.setBackgroundColor(colorBackground);

        TextView text = (TextView) snackbarView.findViewById(Id);
        text.setTextColor(colorText);

        snackbar.show();
    }


    /** RES **/

    public enum Duration{ SHORT, MEDIUM, LONG, CLONA_PENIS }


    /** OTHERS **/

    private static class Time {
        final static int SHORT = Toast.LENGTH_SHORT;
        final static int LONG = Toast.LENGTH_LONG;
    }


}
