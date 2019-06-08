package my.unimas.a50200siswa.therenewingofyourmind;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;

public class Acknowledgement extends AppCompatActivity {

    PDFView Acknowledgement;
    Button next,pre,content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acknowledgement);

        Acknowledgement = (PDFView) findViewById(R.id.acknowledgement);
        Acknowledgement.fromAsset("acknowledgement.pdf").load();

        pre = (Button)findViewById(R.id.btndedication);
        pre.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(Acknowledgement.this,Dedication.class));

            }
        });


        next = (Button)findViewById(R.id.btnintroduction);
        next.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(Acknowledgement.this,Introduction.class));

            }
        });


        content = (Button)findViewById(R.id.btncontent);
        content.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(Acknowledgement.this,Table_Of_Content.class));

            }
        });



    }
}
