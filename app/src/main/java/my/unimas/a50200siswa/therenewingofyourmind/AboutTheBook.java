package my.unimas.a50200siswa.therenewingofyourmind;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;

public class AboutTheBook extends AppCompatActivity {

    PDFView ATB;
    Button next,pre,content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_the_book);

        ATB = (PDFView) findViewById(R.id.aboutthebook);
        ATB.fromAsset("aboutthebook.pdf").load();

        pre = (Button)findViewById(R.id.btnprayer2);
        pre.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(AboutTheBook.this,Prayer2.class));

            }
        });


        next = (Button)findViewById(R.id.btnbookinfo);
        next.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(AboutTheBook.this,Book_Info.class));

            }
        });


        content = (Button)findViewById(R.id.btncontent);
        content.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(AboutTheBook.this,Table_Of_Content.class));

            }
        });



    }
}
