package me.clonalejandro.clonaauth.elements;

import android.widget.EditText;

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


public class Form {


    /** SMALL CONSTRUCTORS **/

    private final EditText emailField, licenseField;

    public Form(EditText emailField, EditText licenseField){
        this.emailField = emailField;
        this.licenseField = licenseField;
    }

    private static State state,
                         emailState,
                         licenseState = State.EMPTY;



    /** REST **/

    /**
     * @return
     */
    public static State getState(){ return state; }


    /**
     * @return
     */
    public static State getEmailState(){ return emailState; }


    /**
     * @return
     */
    public static State getLicenseState(){ return licenseState; }


    /**
     * @param state
     */
    public static void setState(State state){ Form.state = state; }


    /**
     * @param state
     */
    public static void setEmailState(State state){ Form.emailState = state; }


    /**
     * @param state
     */
    public static void setLicenseState(State state){ Form.licenseState = state; }


    /** OTHERS **/

    public enum State { EMPTY, ERROR, GOOD }


}
