package com.example.david.midestino.presentadores;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.david.midestino.R;
import com.example.david.midestino.modelo.Contenidos;
import com.example.david.midestino.modelo.Pagina;

public class SecundarioActivity extends AppCompatActivity {
    public static final String TAG = SecundarioActivity.class.getSimpleName();

    private String mNombre;

    private Contenidos mContenidos = new Contenidos(); //5) importamos los contenidos
    private ImageView mImageView;
    private TextView mTextView;
    private Button mOpcion1;
    private Button mOpcion2;
    private Pagina mPaginaActiva;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contenido);

        //2) Devuelve el intent que ha iniciado el activity
        Intent intent = getIntent();
        mNombre = intent.getStringExtra(getString(R.string.key_name));


        //7) Creamos el visor de la imagen, texto y los botones
        mImageView = (ImageView)findViewById(R.id.contenidoImageView);
        mTextView = (TextView)findViewById(R.id.contenidoTextView);
        mOpcion1 = (Button)findViewById(R.id.opcionButton1);
        mOpcion2 = (Button)findViewById(R.id.opcionButton2);

        loadPage(0);
    }

    //7) Cargamos la pagina
    private void loadPage(int choice) {
        mPaginaActiva = mContenidos.getPage(choice);

        Drawable drawable = getResources().getDrawable(mPaginaActiva.getImageId());
        mImageView.setImageDrawable(drawable);

        String pageText = mPaginaActiva.getText();
        pageText = String.format(pageText, mNombre);

        mTextView.setText(pageText);

        if (mPaginaActiva.isFinal()) {
            mOpcion1.setVisibility(View.INVISIBLE);
            mOpcion2.setText("INTENTARLO DE NUEVO");
            mOpcion2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });

        } else {

            mOpcion1.setText(mPaginaActiva.getOpcion1().getText());
            mOpcion2.setText(mPaginaActiva.getOpcion2().getText());

            mOpcion1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int nextPage = mPaginaActiva.getOpcion1().getNextPage();
                    loadPage(nextPage);
                }
            });

            mOpcion2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int nextPage = mPaginaActiva.getOpcion2().getNextPage();
                    loadPage(nextPage);
                }
            });
        }
    }
}






