package com.example.myapplication;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class BottomActionFragment extends BottomSheetDialogFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_actions, container, false);

        // Nút đóng (ic_cancel)
        ImageView icCancel = view.findViewById(R.id.ic_cancel);
        icCancel.setOnClickListener(v -> dismiss()); // đóng Bottom Sheet

        // Ví dụ click các nút khác
        view.findViewById(R.id.ghim).setOnClickListener(v -> {
            // Hành động Ghim
            dismiss(); // đóng nếu muốn
        });

        view.findViewById(R.id.chinhsua).setOnClickListener(v -> {
            // Hành động Chỉnh sửa
            dismiss();
        });

        view.findViewById(R.id.xoa).setOnClickListener(v -> {
            // Hành động Xóa
            dismiss();
        });

        return view;
    }
}
