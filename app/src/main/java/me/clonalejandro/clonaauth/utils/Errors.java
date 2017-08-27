package me.clonalejandro.clonaauth.utils;

import android.widget.EditText;

import me.clonalejandro.clonaauth.Home;
import me.clonalejandro.clonaauth.R;
import me.clonalejandro.clonaauth.elements.Form;

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


public class Errors {


    /** SMALL CONSTRUCTORS **/

    //none...


    /** REST **/

    public static void emailErr(EditText field){
        final String message = Home.resources.getString(R.string.error_email);
        field.setError(message);

        Form.setEmailState(Form.State.ERROR);
    }


    public static void licenseErr(EditText field){
        final String message = Home.resources.getString(R.string.error_license);
        field.setError(message);

        Form.setLicenseState(Form.State.ERROR);
    }


    public static void formErr(){
        final String message = Home.resources.getString(R.string.error_form);
        //new Snackbar(message, Colors.WHITE, Colors.RED, Snackbar.Duration.MEDIUM);
    }

}
