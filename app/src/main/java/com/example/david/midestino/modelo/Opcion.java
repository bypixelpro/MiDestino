package com.example.david.midestino.modelo;

/**
 * Created by David on 16/11/2015.
 */
public class Opcion {

    private String mText; //) Texto del boton
    private int mNextPage; //4) Página de destino

    //4) generar constructor
    public Opcion(String text, int nextPage) {
        mText = text;
        mNextPage = nextPage;
    }

    //4) Getters and Setter para nuestras variables luego creamos los contenidos en otra clase,
    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public int getNextPage() {
        return mNextPage;
    }

    public void setNextPage(int nextPage) {
        mNextPage = nextPage;
    }
}
