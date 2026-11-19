package de.promocode.logic;

public class CodeSearch {

	public static int NOT_FOUND = -1;

	/**
	 * Sucht einen Code in der Liste.
	 * 
	 * @param list
	 *            Liste der Codes im Long-Format
	 * @param searchValue
	 *            Gesuchter Code
	 * @return Index des Codes, wenn er vorhanden ist, NOT_FOUND wenn er nicht
	 *         gefunden werden konnte
	 */
	public static long findPromoCode(long[] list, long searchValue) {

	    long anfang = System.currentTimeMillis();

	    long links = 0;
	    long rechts = list.length - 1;

	    while (links <= rechts) {

	        long mitte = links + (rechts - links) / 2;

	        if (list[(int) mitte] == searchValue) {

	            long ende = System.currentTimeMillis();
	            System.out.println("Laufzeit: " + (ende - anfang) + " ms");

	            return mitte;
	        }

	        if (list[(int) mitte] < searchValue) {
	            links = mitte + 1;
	        } else {
	            rechts = mitte - 1;
	        }
	    }

	    long ende = System.currentTimeMillis();
	    System.out.println("Laufzeit: " + (ende - anfang)*1000 + " ms");

	    return NOT_FOUND;
	}
}
