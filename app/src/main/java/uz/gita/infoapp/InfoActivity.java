package uz.gita.infoapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import uz.gita.infoapp.controler.AppController;
import uz.gita.infoapp.model.ModelData;

public class InfoActivity extends AppCompatActivity {
    AppController controller = AppController.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        findViewById(R.id.back_from_content).setOnClickListener(view -> {
            Intent intent = new Intent(InfoActivity.this, MainActivity.class);
            startActivity(intent);
        });

        int code = getIntent().getIntExtra("CODE", 0);
        ModelData model = controller.getDataByPosition(code);
        loadData(model);
    }
    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
    private void loadData(ModelData data) {

        // main context
        AppCompatTextView main_text = findViewById(R.id.main_text);
        main_text.setText(data.getName());

        // 1
        AppCompatImageView pic_1 = findViewById(R.id.pic_1);
        pic_1.setImageResource(data.getImage_1());

        AppCompatTextView text_1 = findViewById(R.id.text_1);
        text_1.setText(data.getDescription_1());

        //2
        AppCompatImageView pic_2 = findViewById(R.id.pic_2);
        pic_2.setImageResource(data.getImage_2());

        AppCompatTextView text_2 = findViewById(R.id.text_2);
        text_2.setText(data.getDescription_2());

        // 3
        AppCompatImageView pic_3 = findViewById(R.id.pic_3);
        pic_3.setImageResource(data.getImage_3());

        AppCompatTextView text_3 = findViewById(R.id.text_3);
        text_3.setText(data.getDescription_3());

        //4
        AppCompatImageView pic_4 = findViewById(R.id.pic_4);
        pic_4.setImageResource(data.getImage_4());

        AppCompatTextView text_4 = findViewById(R.id.text_4);
        text_4.setText(data.getDescription_4());

        //5
        AppCompatImageView pic_5 = findViewById(R.id.pic_5);
        pic_5.setImageResource(data.getImage_5());

        AppCompatTextView text_5 = findViewById(R.id.text_5);
        text_5.setText(data.getDescription_5());

        // 6
        AppCompatImageView pic_6 = findViewById(R.id.pic_6);
        pic_6.setImageResource(data.getImage_6());

        AppCompatTextView text_6 = findViewById(R.id.text_6);
        text_6.setText(data.getDescription_6());

        //7
        AppCompatImageView pic_7 = findViewById(R.id.pic_7);
        pic_7.setImageResource(data.getImage_7());

        AppCompatTextView text_7 = findViewById(R.id.text_7);
        text_7.setText(data.getDescription_7());


    }
}