package my.unimas.a50200siswa.therenewingofyourmind;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;

public class Dedication extends AppCompatActivity {

    PDFView Dedication;
    Button content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dedication);

        Dedication = (PDFView) findViewById(R.id.dedication);
        Dedication.fromAsset("dedication.pdf").load();



        content = (Button)findViewById(R.id.btncontent);
        content.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(Dedication.this,Table_Of_Content.class));
                finish();

            }
        });



    }
}
