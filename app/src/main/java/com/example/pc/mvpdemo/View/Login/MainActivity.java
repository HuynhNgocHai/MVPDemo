package com.example.pc.mvpdemo.View.Login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.pc.mvpdemo.Presenter.Login.PresenterLogin;
import com.example.pc.mvpdemo.R;

public class MainActivity extends AppCompatActivity implements ViewLogin, View.OnClickListener {

    Button btnDongY;
    EditText edtTenDangNhap, edtMatKhau;
    PresenterLogin login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDongY = findViewById(R.id.btnDongY);
        edtTenDangNhap = findViewById(R.id.edtDangNhap);
        edtMatKhau = findViewById(R.id.edtMatKhau);

        login = new PresenterLogin(this);

        btnDongY.setOnClickListener(this);

    }

    @Override
    public void LoginSucceed(String thongbao) {
        Toast.makeText(this, "Login Success ! " + thongbao, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void LoginFailed() {
        Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        String tendangnhap, matkhau;

        tendangnhap = edtTenDangNhap.getText().toString();
        matkhau = edtMatKhau.getText().toString();
        login.CheckLogin(tendangnhap, matkhau);
    }
}
