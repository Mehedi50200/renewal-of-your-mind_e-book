package my.unimas.a50200siswa.therenewingofyourmind;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;

public class Book_Info extends AppCompatActivity {

    PDFView BookInfo;
    Button content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_info);

        BookInfo = (PDFView) findViewById(R.id.bookinfo);
        BookInfo.fromAsset("bookinfo.pdf").load();

        content = (Button)findViewById(R.id.btncontent);
        content.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(Book_Info.this,Table_Of_Content.class));

            }
        });


    }
}
