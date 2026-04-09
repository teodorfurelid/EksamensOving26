public static <T extends Comparable<T>> int binærsøk(T[] tabell, T verdi) {
    // fyll inn koden her

    int venstre = 0;
    int høyre = tabell.length - 1;

    while (venstre <= høyre) {
        int midten = (venstre + høyre) / 2;
        int sammenligning = verdi.compareTo(tabell[midten]);

        if (sammenligning == 0) {
            // funnet!
            return midten;
        } else-if (sammenligning < 0) {
            //verdi er mindre, søk i venstre halvdel
            høyre = midten - 1;
        } else {
            //verdi er større, søk i høgre halvdel
            venstre = midten + 1;
        }
    }
    return -1;
    // indikerer at vi ikke har funnet tallet med binærsøk
}


// Du skal forklare med ord hva metoden "partisjoner" i kvikksortering gjør:

/**
 * Metoden deler tabellen inn i todeler rundt eit pivot-element
 * - alle elementer mindre en pivot, legges til venstre
 * - alle elementer større en pivot, legges til høgre
 * - til slutt ender pivot på sin endelige sorterte plass
 */


// e)

public static <T extends Comparable<T>> void kvikksorter(T[] tabell, 0, tabell.length-1) {}

public static <T extends Comparable<T>> void kvikksorter(T[] tabell, int venstre, int høyre) {
    if (venstre < høyre) {
        int pivot = partisjoner(tabell, venstre, høyre);

        kvikksorter(tabell, venstre, pivot-1);
        kvikksorter(tabell, pivot + 1, høyre);
    }
}