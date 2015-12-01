package interaje.com.br.guiashop.activities;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import interaje.com.br.guiashop.R;

public class MainActivity extends AppCompatActivity{

    private Button botao;
    private Button btn_promocao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao = (Button) findViewById(R.id.button);

        botao.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListBox.class);
                startActivity(intent);
            }
        });

        btn_promocao = (Button) findViewById(R.id.btn_promocao);

        btn_promocao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListBox.class);
                startActivity(intent);
            }
        });    ;
    }

}
