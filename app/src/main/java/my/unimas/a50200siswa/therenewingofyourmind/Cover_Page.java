package my.unimas.a50200siswa.therenewingofyourmind;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Cover_Page extends AppCompatActivity {

    Button btnTableOfContent;
    Button btnBookInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cover_page);

        btnTableOfContent = (Button)findViewById(R.id.btntableofcontent);
        btnTableOfContent.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(Cover_Page.this,Table_Of_Content.class));

            }
        });


        btnBookInfo = (Button)findViewById(R.id.btnbookinfo);
        btnBookInfo.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(Cover_Page.this,Book_Info.class));

            }
        });


    }
}
