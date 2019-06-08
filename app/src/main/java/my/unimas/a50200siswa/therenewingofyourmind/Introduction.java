package my.unimas.a50200siswa.therenewingofyourmind;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;

public class Introduction extends AppCompatActivity {

    PDFView Introduction;
    Button next,pre,content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);

        Introduction = (PDFView) findViewById(R.id.introduction);
        Introduction.fromAsset("introduction.pdf").load();

        pre = (Button)findViewById(R.id.btnacknowledgement);
        pre.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(Introduction.this,Acknowledgement.class));
                finish();

            }
        });


        next = (Button)findViewById(R.id.btnprayer);
        next.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(Introduction.this,Prayer.class));
                finish();

            }
        });


        content = (Button)findViewById(R.id.btncontent);
        content.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(Introduction.this,Table_Of_Content.class));
                finish();

            }
        });



    }
}
