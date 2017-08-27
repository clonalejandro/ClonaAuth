package me.clonalejandro.clonaauth.elements;

import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import me.clonalejandro.clonaauth.Home;
import me.clonalejandro.clonaauth.R;
import me.clonalejandro.clonaauth.listeners.HElementsListeners;

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


public class HomeElements {


    /** SMALL CONSTRUCTORS **/

    private final Home program;

    public HomeElements(Home instance){
        program = instance;
        setEmailF();
        setLicenseF();
        setHelper();
        setSubmit();
    }


    /** REST **/

    /**
     * @return
     */
    private Button setSubmit(){
        Button submit = getSubmit();
        View.OnClickListener listener = new HElementsListeners.Submit();

        submit.setOnClickListener(listener);

        return submit;
    }


    /**
     * @return
     */
    private TextView setHelper(){
        TextView helper = getHelper();
        View.OnClickListener listener = new HElementsListeners.Helper();

        helper.setOnClickListener(listener);

        return helper;
    }


    /**
     * @return
     */
    private EditText setEmailF(){
        EditText emailF = getEmailF();
        TextWatcher listener = new HElementsListeners.EmailT(emailF);

        emailF.addTextChangedListener(listener);

        return emailF;
    }


    /**
     * @return
     */
    private EditText setLicenseF(){
        EditText licenseF = getLicenseF();
        TextWatcher listener = new HElementsListeners.LicenseT(licenseF);

        licenseF.addTextChangedListener(listener);

        return licenseF;
    }


    /** OTHERS **/

    /**
     * @return
     */
    private TextView getHelper(){
        return (TextView) program.findViewById(R.id.helper);
    }


    /**
     * @return
     */
    private Button getSubmit(){
        return (Button) program.findViewById(R.id.button);
    }


    /**
     * @return
     */
    private EditText getEmailF(){
        return (EditText) program.findViewById(R.id.email_field);
    }


    /**
     * @return
     */
    private EditText getLicenseF(){
        return (EditText) program.findViewById(R.id.pwd_field);
    }


}
