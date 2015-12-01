package interaje.com.br.guiashop.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import interaje.com.br.guiashop.R;

public class Promocao extends ListBox {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_promocao);

        overridePendingTransition(R.anim.activity_filha_entrando, R.anim.activity_pai_saindo);
    }
}
