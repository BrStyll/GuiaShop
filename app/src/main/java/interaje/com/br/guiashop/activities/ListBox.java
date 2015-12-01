package interaje.com.br.guiashop.activities;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import interaje.com.br.guiashop.R;

public class ListBox extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.mipmap.ic_icon);

        setContentView(R.layout.listbox);

        overridePendingTransition(R.anim.activity_filha_entrando, R.anim.activity_pai_saindo);

        // ActionBar ab = getActionBar();
        // ab.setDisplayHomeAsUpEnabled(true);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        // Inflante The menu this adds itens to the action bar if it is present.

        super.onCreateOptionsMenu(menu);

        MenuItem a = menu.add(0,0,0,"Item 2");
        a.setIcon(R.mipmap.ic_search);
        a.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);

        //getMenuInflater().inflate(R.menu.menu, menu);
        return (true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        // Handle action bar item clicks here. the action bar will
        // automatically handle clicks onthe home/up butto, so long
        // as you specifify a parent activity in AndroidManifest.xml

        int id = item.getGroupId();

        if(id == 0){
            Toast.makeText(this, "Search ", Toast.LENGTH_LONG).show();

            Intent intent = new Intent(ListBox.this, Promocao.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }


}
