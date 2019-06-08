package my.unimas.a50200siswa.therenewingofyourmind;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;

public class Prayer extends AppCompatActivity {

    PDFView Prayer;
    Button next,pre,content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prayer);

        Prayer = (PDFView) findViewById(R.id.prayer);
        Prayer.fromAsset("prayer.pdf").load();

        pre = (Button)findViewById(R.id.btnintroduction);
        pre.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(Prayer.this,Introduction.class));
                finish();

            }
        });


        next = (Button)findViewById(R.id.btnchapter1);
        next.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(Prayer.this,Chapter1.class));
                finish();

            }
        });


        content = (Button)findViewById(R.id.btncontent);
        content.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(Prayer.this,Table_Of_Content.class));
                finish();

            }
        });



    }
}
