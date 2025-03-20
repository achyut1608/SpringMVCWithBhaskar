package org.learn.model;

public class User {

    String txtEmail;
    String txtUsername;
    String txtPassword;

    public String getTxtEmail() {
        return txtEmail;
    }

    public void setTxtEmail(String txtEmail) {
        this.txtEmail = txtEmail;
    }

    public String getTxtUsername() {
        return txtUsername;
    }

    public void setTxtUsername(String txtUsername) {
        this.txtUsername = txtUsername;
    }

    public String getTxtPassword() {
        return txtPassword;
    }

    public void setTxtPassword(String txtPassword) {
        this.txtPassword = txtPassword;
    }

    @Override
    public String toString() {
        return "User{" +
                "txtEmail='" + txtEmail + '\'' +
                ", txtUsername='" + txtUsername + '\'' +
                ", txtPassword='" + txtPassword + '\'' +
                '}';
    }
}
