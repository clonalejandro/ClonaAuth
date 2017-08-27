package me.clonalejandro.clonaauth.listeners;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;

import me.clonalejandro.clonaauth.Home;
import me.clonalejandro.clonaauth.elements.Form;
import me.clonalejandro.clonaauth.utils.Errors;

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


public class HElementsListeners {


    /** SMALL CONSTRUCTORS **/

    private final Home program;

    public HElementsListeners(Home instance){
        program = instance;
    }


    /** REST **/

    public static class Helper implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            //openBrowser
        }
    }


    public static class Submit implements View.OnClickListener {
        @Override
        public void onClick(View v){
            final Form.State emailSt = Form.getEmailState();
            final Form.State licenseSt = Form.getLicenseState();

            if (emailSt == Form.State.ERROR ||
                    emailSt == Form.State.EMPTY ||
                    licenseSt == Form.State.ERROR ||
                    licenseSt == Form.State.EMPTY)
                Form.setState(Form.State.ERROR);
            else Form.setState(Form.State.GOOD);

            if (Form.getState() == Form.State.GOOD)
                submit();
            else Errors.formErr();
        }
    }


    public static class EmailT implements TextWatcher {


        /** SMALL CONSTRUCTORS **/

        private final EditText emailField;

        public EmailT(EditText emailField){ this.emailField = emailField; }


        /** METHODS **/

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {}

        @Override
        public void afterTextChanged(Editable s) {
            final String emailFieldstr = emailField.getText().toString();
            final boolean empty = emailFieldstr.isEmpty();

            if (!empty && !emailFieldstr.contains("@") || !empty && !emailFieldstr.contains("."))
                Errors.emailErr(emailField);
            else Form.setEmailState(Form.State.GOOD);
        }
    }


    public static class LicenseT implements TextWatcher {


        /** SMALL CONSTRUCTORS **/

        private final EditText licenseField;

        public LicenseT(EditText licenseField){ this.licenseField = licenseField; }


        /** REST **/

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {}

        @Override
        public void afterTextChanged(Editable s) {
            final String licenseFieldstr = licenseField.getText().toString();
            final boolean empty = licenseFieldstr.isEmpty();

            if (!empty && licenseFieldstr.length() < 8)
                Errors.licenseErr(licenseField);
            else Form.setLicenseState(Form.State.GOOD);
        }
    }


    /** OTHERS **/

    private static void submit(){


    }


}
