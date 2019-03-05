package com.example.david.midestino.modelo;

/**
 * Created by David on 16/11/2015.
 */
public class Pagina {
    private int mImageId; //3) id de la imagen
    private String mText; //3) id del string, creamos ahora la clase la clase Opcion
    private Opcion mOpcion1;
    private Opcion mOpcion2;
    private boolean mIsFinal = false;//6) Creamos la opcion de pagina final

//3) genera un constructor Code > Generate Constructor
    public Pagina(int imageId, String text, Opcion opcion1, Opcion opcion2) {
        mImageId = imageId;
        mText = text;
        mOpcion1 = opcion1;
        mOpcion2 = opcion2;
    }

    //6 pagina final, metodo y contructor creamos el metodo cargar pagina en el activity secundario
    public boolean isFinal() {
        return mIsFinal;
    }

    public void setIsFinal(boolean isFinal) {
        mIsFinal = isFinal;
    }

    public Pagina(int imageId, String text) {
        mImageId = imageId;
        mText = text;
        mOpcion1 = null;
        mOpcion2 = null;
        mIsFinal = true;


    }

    //Getters and setters
    public int getImageId() {
        return mImageId;
    }

    public void setImageId(int imageId) {
        mImageId = imageId;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public Opcion getOpcion1() {
        return mOpcion1;
    }

    public void setOpcion1(Opcion opcion1) {
        mOpcion1 = opcion1;
    }

    public Opcion getOpcion2() {
        return mOpcion2;
    }

    public void setOpcion2(Opcion opcion2) {
        mOpcion2 = opcion2;
    }
}