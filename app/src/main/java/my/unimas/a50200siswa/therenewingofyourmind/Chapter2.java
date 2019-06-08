package my.unimas.a50200siswa.therenewingofyourmind;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;

public class Chapter2 extends AppCompatActivity {

    PDFView Chapter2;
    Button next,pre,content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter2);

        Chapter2 = (PDFView) findViewById(R.id.chapter2);
        Chapter2.fromAsset("chapter2.pdf").load();

        pre = (Button)findViewById(R.id.btnchapter1);
        pre.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(Chapter2.this,Chapter1.class));
                finish();

            }
        });


        next = (Button)findViewById(R.id.btnchapter3);
        next.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(Chapter2.this,Chapter3.class));
                finish();

            }
        });


        content = (Button)findViewById(R.id.btncontent);
        content.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(Chapter2.this,Table_Of_Content.class));
                finish();

            }
        });



    }
}
