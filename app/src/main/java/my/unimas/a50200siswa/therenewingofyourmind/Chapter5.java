package my.unimas.a50200siswa.therenewingofyourmind;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;

public class Chapter5 extends AppCompatActivity {

    PDFView Chapter5;
    Button next,pre,content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter5);

        Chapter5 = (PDFView) findViewById(R.id.chapter5);
        Chapter5.fromAsset("chapter5.pdf").load();

        pre = (Button)findViewById(R.id.btnchapter4);
        pre.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(Chapter5.this,Chapter4.class));
                finish();

            }
        });


        next = (Button)findViewById(R.id.btnchapter6);
        next.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(Chapter5.this,Chapter6.class));
                finish();

            }
        });


        content = (Button)findViewById(R.id.btncontent);
        content.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(Chapter5.this,Table_Of_Content.class));
                finish();

            }
        });



    }
}
