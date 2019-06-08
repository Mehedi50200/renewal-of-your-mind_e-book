package my.unimas.a50200siswa.therenewingofyourmind;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;

public class Chapter1 extends AppCompatActivity {

    PDFView Chapter1;
    Button next,pre,content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter1);

        Chapter1 = (PDFView) findViewById(R.id.chapter1);
        Chapter1.fromAsset("chapter1.pdf").load();

        pre = (Button)findViewById(R.id.btnprayer);
        pre.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(Chapter1.this,Prayer.class));
                finish();

            }
        });


        next = (Button)findViewById(R.id.btnchapter2);
        next.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(Chapter1.this,Chapter2.class));
                finish();

            }
        });


        content = (Button)findViewById(R.id.btncontent);
        content.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(Chapter1.this,Table_Of_Content.class));
                finish();

            }
        });



    }
}
