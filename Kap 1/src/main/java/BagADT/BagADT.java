package BagADT;

public interface BagADT<T> {

    /**
     * Skal hente ut antall elementer i tabellen
     * @return en int lik antallet
     */
    int getCurrentSize();

    /**
     * ser om tabellen er tom
     * @return boolean
     */
    boolean isEmpty();

    /**
     * legger til elementer i tabellen
     * @return boolean
     */
    boolean add();

    T remove();

    boolean remove(T anEntry);

    void clear();

    int getFrequencyOf(T anEntry);

    boolean contains(T anEntry);

    T[] toArray();
}
