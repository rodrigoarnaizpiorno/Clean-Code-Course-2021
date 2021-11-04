package org.cleancode.course.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TheService {

    private int d; // Elapsed time in days

    private List<String[]> theList = Arrays.asList(
            new String[]{"1", "7 estrategias para ganar a las chapas", "Lorem ipsum...", "Arturo González", "3"},
            new String[]{"2", "Descubre con este cuestionario si sufres del síndrome 'me gusta mas la cama que ir a trabajar'", "Lorem ipsum...", "Pedro Ramírez", "2"},
            new String[]{"3", "Cómo me hice rico escribiendo posts sobre cómo me hice rico", "Lorem ipsum...", "Juan", "3"},
            new String[]{"4", "Esto es un borrador", "...", "Juan", "1"});

    public List<String[]> getThemAll() {
        return theList;
    }

    // METODO QUE DEVUELVE LOS POST DESTACADOS
    public List<String[]> getThem() {
        List<String[]> list1 = new ArrayList<String[]>();
        for(String[] x: theList)
            if(x[4] == "3")
                list1.add(x);

            return list1;
    }
}