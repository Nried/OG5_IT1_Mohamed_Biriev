package primzahlen;

public class Binaere {
	 public static int binaereSuche(long[] liste, long zahl) {
	        int links = 0;
	        int rechts = liste.length - 1;

	        while (links <= rechts) {
	            int mitte = (links + rechts) / 2;

	            if (liste[mitte] == zahl) {
	                return mitte;
	            } else if (liste[mitte] < zahl) {
	                links = mitte + 1;
	            } else {
	                rechts = mitte - 1;
	            }
	        }

	        return -1;
	    }
} 
