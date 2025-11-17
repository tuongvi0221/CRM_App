package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.widget.Button;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class DanhSachCaNhanActivity extends AppCompatActivity {

    private ImageView icBack;
    private ImageView icMore;
    private FloatingActionButton btn_add_contact;

    private ConstraintLayout cardThongTin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danhsachcanhan);

        // Ánh xạ view
        cardThongTin = findViewById(R.id.cardthongtin);
        icBack = findViewById(R.id.ic_back);
        icMore = findViewById(R.id.ic_more);
        btn_add_contact = findViewById(R.id.btn_add_contact); // <- thêm dòng này

        icBack.setOnClickListener(v -> {
            Intent intent = new Intent(DanhSachCaNhanActivity.this, MainActivity.class);
            startActivity(intent);
        });

        cardThongTin.setOnClickListener(v -> {
            Intent intent = new Intent(DanhSachCaNhanActivity.this, TabActivity.class);
            startActivity(intent);
        });

        btn_add_contact.setOnClickListener(v -> {
            Intent intent = new Intent(DanhSachCaNhanActivity.this, ThongTinLienHeActivity.class);
            startActivity(intent);
        });

        icMore.setOnClickListener(v -> {
            BottomActionFragment bottomSheet = new BottomActionFragment();
            bottomSheet.show(getSupportFragmentManager(), "BottomAction");
        });
    }

}