package com.maryor;

public class ExtentedPassword extends Password{

    private int decryptedPassword;

    public ExtentedPassword(int password) {
        super(password);
        this.decryptedPassword = password;
    }

//    @Override
//    public void storePassword() {
//        System.out.println("Saving password as " + this.decryptedPassword);
//    }
}
