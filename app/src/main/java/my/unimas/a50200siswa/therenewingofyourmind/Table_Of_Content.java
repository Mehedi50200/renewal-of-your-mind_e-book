package my.unimas.a50200siswa.therenewingofyourmind;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Table_Of_Content extends AppCompatActivity {

   TextView btnDedication, btnAcknowledgement, btnIntroduction, btnPrayer, btnChapter1, btnChapter2, btnChapter3, btnChapter4, btnChapter5, btnChapter6, btnChapter7, btnPrayer2, btnAboutTheBook;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_of_content);


        btnDedication = (TextView)findViewById(R.id.btndedication);
        btnAcknowledgement = (TextView)findViewById(R.id.btnacknowledgement);
        btnIntroduction = (TextView)findViewById(R.id.btnintroduction);
        btnPrayer = (TextView)findViewById(R.id.btnprayer);
        btnChapter1 = (TextView)findViewById(R.id.btnchapter1);
        btnChapter2 = (TextView)findViewById(R.id.btnchapter2);
        btnChapter3 = (TextView)findViewById(R.id.btnchapter3);
        btnChapter4 = (TextView)findViewById(R.id.btnchapter4);
        btnChapter5 = (TextView)findViewById(R.id.btnchapter5);
        btnChapter6 = (TextView)findViewById(R.id.btnchapter6);
        btnChapter7 = (TextView)findViewById(R.id.btnchapter7);
        btnPrayer2 = (TextView)findViewById(R.id.btnprayer2);
        btnAboutTheBook = (TextView)findViewById(R.id.btnaboutthebook);


        btnDedication.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(Table_Of_Content.this,Dedication.class));

            }
        });

        btnAcknowledgement.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(Table_Of_Content.this,Acknowledgement.class));

            }
        });

        btnIntroduction.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(Table_Of_Content.this,Introduction.class));

            }
        });

        btnPrayer.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(Table_Of_Content.this,Prayer.class));

            }
        });

        btnChapter1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(Table_Of_Content.this,Chapter1.class));

            }
        });


        btnChapter2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(Table_Of_Content.this,Chapter2.class));

            }
        });

        btnChapter3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(Table_Of_Content.this,Chapter3.class));

            }
        });

        btnChapter4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(Table_Of_Content.this,Chapter4.class));

            }
        });


        btnChapter5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(Table_Of_Content.this,Chapter5.class));

            }
        });

        btnChapter6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(Table_Of_Content.this,Chapter6.class));

            }
        });

        btnChapter7.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(Table_Of_Content.this,Chapter7.class));

            }
        });


        btnPrayer2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(Table_Of_Content.this,Prayer2.class));

            }
        });

        btnAboutTheBook.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(Table_Of_Content.this,AboutTheBook.class));

            }
        });




    }
}
