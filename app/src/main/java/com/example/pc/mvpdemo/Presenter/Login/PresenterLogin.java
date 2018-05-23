package com.example.pc.mvpdemo.Presenter.Login;

import com.example.pc.mvpdemo.View.Login.ViewLogin;

public class PresenterLogin implements PresenterImplementLogin {

    ViewLogin viewLogin;

    public PresenterLogin(ViewLogin viewLogin){
        this.viewLogin = viewLogin;
    }


    public void CheckLogin(String tendangnhap, String matkhau){
        if (tendangnhap.equals("Huynh Ngoc Hai") && matkhau.equals("123")){
            //Tra cho View dang nhap thanh cong
            viewLogin.LoginSucceed(tendangnhap);
        }else {
            //Tra cho View dang nhap that bai
            viewLogin.LoginFailed();
        }
    }
}
