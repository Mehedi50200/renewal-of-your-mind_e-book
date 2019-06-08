package my.unimas.a50200siswa.therenewingofyourmind;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;

public class Chapter6 extends AppCompatActivity {

    PDFView Chapter6;
    Button next,pre,content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter6);

        Chapter6 = (PDFView) findViewById(R.id.chapter6);
        Chapter6.fromAsset("chapter6.pdf").load();

        pre = (Button)findViewById(R.id.btnchapter5);
        pre.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(Chapter6.this,Chapter5.class));
                finish();

            }
        });


        next = (Button)findViewById(R.id.btnchapter7);
        next.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(Chapter6.this,Chapter7.class));
                finish();

            }
        });


        content = (Button)findViewById(R.id.btncontent);
        content.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(Chapter6.this,Table_Of_Content.class));
                finish();

            }
        });



    }
}
