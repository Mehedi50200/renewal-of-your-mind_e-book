package my.unimas.a50200siswa.therenewingofyourmind;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;

public class Chapter4 extends AppCompatActivity {

    PDFView Chapter4;
    Button next,pre,content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter4);

        Chapter4 = (PDFView) findViewById(R.id.chapter4);
        Chapter4.fromAsset("chapter4.pdf").load();

        pre = (Button)findViewById(R.id.btnchapter3);
        pre.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(Chapter4.this,Chapter3.class));
                finish();

            }
        });


        next = (Button)findViewById(R.id.btnchapter5);
        next.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(Chapter4.this,Chapter5.class));
                finish();

            }
        });


        content = (Button)findViewById(R.id.btncontent);
        content.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(Chapter4.this,Table_Of_Content.class));
                finish();

            }
        });



    }
}
