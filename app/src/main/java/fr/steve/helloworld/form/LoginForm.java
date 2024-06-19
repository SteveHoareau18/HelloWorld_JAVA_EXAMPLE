package fr.steve.helloworld.form;

import android.widget.EditText;

import fr.steve.helloworld.entity.user.User;

public class LoginForm extends Form<User> {

    private final EditText inputIdentifier, inputPassword;

    public LoginForm(EditText inputIdentifier, EditText inputPassword) {
        this.inputIdentifier = inputIdentifier;
        this.inputPassword = inputPassword;
    }


    @Override
    public boolean isValid() {
        //TODO
        return true;
    }

    @Override
    void reset() {
        this.inputIdentifier.setText("");
        this.inputPassword.setText("");
    }

    @Override
    public User build() {
        User user = new User().setIdentifier(this.inputIdentifier.getText().toString())
                .setPassword(this.inputPassword.getText().toString());
        this.reset();
        return user;
    }
}
