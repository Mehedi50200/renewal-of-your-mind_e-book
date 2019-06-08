package my.unimas.a50200siswa.therenewingofyourmind;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;

public class Chapter7 extends AppCompatActivity {

    PDFView Chapter7;
    Button next,pre,content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter7);

        Chapter7 = (PDFView) findViewById(R.id.chapter7);
        Chapter7.fromAsset("chapter7.pdf").load();

        pre = (Button)findViewById(R.id.btnchapter6);
        pre.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(Chapter7.this,Chapter6.class));
                finish();

            }
        });


        next = (Button)findViewById(R.id.btnprayer2);
        next.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(Chapter7.this,Prayer2.class));
                finish();

            }
        });


        content = (Button)findViewById(R.id.btncontent);
        content.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(Chapter7.this,Table_Of_Content.class));
                finish();

            }
        });



    }
}
