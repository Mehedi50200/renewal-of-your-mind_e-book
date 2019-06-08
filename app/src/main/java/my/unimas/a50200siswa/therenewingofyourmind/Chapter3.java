package my.unimas.a50200siswa.therenewingofyourmind;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;

public class Chapter3 extends AppCompatActivity {

    PDFView Chapter3;
    Button next,pre,content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter3);

        Chapter3 = (PDFView) findViewById(R.id.chapter3);
        Chapter3.fromAsset("chapter3.pdf").load();

        pre = (Button)findViewById(R.id.btnchapter2);
        pre.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(Chapter3.this,Chapter2.class));
                finish();

            }
        });


        next = (Button)findViewById(R.id.btnchapter4);
        next.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(Chapter3.this,Chapter4.class));
                finish();

            }
        });


        content = (Button)findViewById(R.id.btncontent);
        content.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(Chapter3.this,Table_Of_Content.class));
                finish();

            }
        });



    }
}
