package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.widget.Button;


public class DanhSachCaNhanActivity extends AppCompatActivity {

    private ImageView icBack;
    private ImageView icMore;
    private Button btnAdd;
    private ConstraintLayout cardThongTin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danhsachcanhan);

        // Ánh xạ view
        cardThongTin = findViewById(R.id.cardthongtin);
        icBack = findViewById(R.id.ic_back);
        icMore = findViewById(R.id.ic_more);
        btnAdd = findViewById(R.id.btnAdd);


        // Click vào card mở TabActivity
        cardThongTin.setOnClickListener(v -> {
            Intent intent = new Intent(DanhSachCaNhanActivity.this, TabActivity.class);
            startActivity(intent);
            // Nếu muốn giữ lại màn hình danh sách, bỏ dòng finish()
            //finish();
        });

        btnAdd.setOnClickListener(v -> {
            Intent intent = new Intent(DanhSachCaNhanActivity.this, ThongTinLienHeActivity.class);
            startActivity(intent);
            // Nếu muốn giữ lại màn hình danh sách, bỏ dòng finish()
            //finish();
        });

        // Click vào back button
        icBack.setOnClickListener(v -> onBackPressed());
        icMore.setOnClickListener(v -> onBackPressed());
    }
}
