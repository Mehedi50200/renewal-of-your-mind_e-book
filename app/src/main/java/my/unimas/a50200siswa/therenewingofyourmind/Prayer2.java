package my.unimas.a50200siswa.therenewingofyourmind;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;

public class Prayer2 extends AppCompatActivity {

    PDFView Prayer;
    Button next,pre,content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prayer2);

        Prayer = (PDFView) findViewById(R.id.prayer2);
        Prayer.fromAsset("prayer2.pdf").load();

        pre = (Button)findViewById(R.id.btnchapter7);
        pre.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(Prayer2.this,Chapter7.class));
                finish();

            }
        });


        next = (Button)findViewById(R.id.btnaboutthebook);
        next.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(Prayer2.this,AboutTheBook.class));
                finish();

            }
        });


        content = (Button)findViewById(R.id.btncontent);
        content.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(Prayer2.this,Table_Of_Content.class));
                finish();

            }
        });



    }
}
