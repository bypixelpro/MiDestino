package com.example.david.midestino.modelo;

import com.example.david.midestino.R;

/**
 * Created by David on 16/11/2015.
 */
public class Contenidos {

    //5) Creamos los conbtendios en un array, en el secundario activity, importamos el array

    private Pagina[] mPaginas;

    public Contenidos() {

        mPaginas = new Pagina[8];

        mPaginas[0] = new Pagina(
                R.drawable.img0, //5) Pasamos la imagen, el texto y cada opción con su texto y destino
                "Saludos joven %1$s, aquí empieza tu viaje, si lo haces bien, conseguiras tus estreyas ninja. decide ahora, que deseas hacer y comienza a escribir tu destino Saludos joven %1$s, aquí empieza tu viaje, si lo haces bien, conseguiras tus estreyasSaludos joven %1$s, aquí empieza tu viaje, si lo haces bien, conseguiras tus estreyasSaludos joven %1$s, aquí empieza tu viaje, si lo haces bien, conseguiras tus estreyasSaludos joven %1$s, aquí empieza tu viaje, si lo haces bien, conseguiras tus estreyasSaludos joven %1$s, aquí empieza tu viaje, si lo haces bien, conseguiras tus estreyasSaludos joven %1$s, aquí empieza tu viaje, si lo haces bien, conseguiras tus estreyasSaludos joven %1$s, aquí empieza tu viaje, si lo haces bien, conseguiras tus estreyasSaludos joven %1$s, aquí empieza tu viaje, si lo haces bien, conseguiras tus estreyasSaludos joven %1$s, aquí empieza tu viaje, si lo haces bien, conseguiras tus estreyas",
                new Opcion("Entrenar y formarme", 1),
                new Opcion("Ir a luchar ¡ya!", 2));

        mPaginas[1] = new Pagina(
                R.drawable.img1,
                "Hazte experto en el manejo de una de estas armas.",
                new Opcion("Elijo el Palo", 3),
                new Opcion("Elijo la espada", 4));

        mPaginas[2] = new Pagina(
                R.drawable.img2,
                "Este es el legendario Suzuki Miyamoto, maestro en el manejo de estreyas ninja ¿Estas seguro de que te quieres enfrentar a él de esta forma?.",
                new Opcion("No, volver a entrenar", 1),
                new Opcion("Si, luchar ¡ya!", 6));

        mPaginas[3] = new Pagina(
                R.drawable.img3,
                "¡Un texto de ejemplo, diseña tu propia historia!.",
                new Opcion("estoy listo, quiero luchar", 2),
                new Opcion("quiero aprender a manejar la espada", 4));

        mPaginas[4] = new Pagina(
                R.drawable.img4,
                "Bien \"%1$s, has elegido aprender a usar la espada, ahoraSuzuki esta despitado, quieres retarle o atacar por la espalda?.",
                new Opcion("quiero luchar con honor", 5),
                new Opcion("atacar por la espalda", 2));

        mPaginas[5] = new Pagina(
                R.drawable.img5,
                "Este es suzuki, maestro, usar palo o espada?",
                new Opcion("palo", 6),
                new Opcion("espada", 7));

        mPaginas[6] = new Pagina(
                R.drawable.img6,
                "Has elegido tu destino y has elejido mal... para enfrentarte a un ninja de verdad, deberás enternar duro");

        mPaginas[7] = new Pagina(
                R.drawable.img7,
                "Has elegido tu destino y has trabajado duro, aqui tienes tus estrellas");
    }

    public Pagina getPage(int pageNumber) {
        return mPaginas[pageNumber];
    }
}
