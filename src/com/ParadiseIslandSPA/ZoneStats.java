package com.ParadiseIslandSPA;

import java.util.*;

public class ZoneStats {
	public static int nrPersoaneZonaA = 0;
	public static int nrPersoaneZonaB = 0;
	public static int nrPersoaneZonaC = 0;
	public static int nrPersoaneZonaD = 0;

	public static List<Integer> getZoneStats() {
		List<Integer> zoneListTmp = new LinkedList<Integer>();
		zoneListTmp.add(nrPersoaneZonaA);
		zoneListTmp.add(nrPersoaneZonaB);
		zoneListTmp.add(nrPersoaneZonaC);
		zoneListTmp.add(nrPersoaneZonaD);

		return zoneListTmp;
	}

	public static void checkout(String zona) {
		if (zona.equals("Acces Zona A") && nrPersoaneZonaA > 0) {
			nrPersoaneZonaA--;
		} else if (zona.equals("Acces Zona B") && nrPersoaneZonaB > 0) {
			nrPersoaneZonaB--;
		} else if (zona.equals("Acces Zona C") && nrPersoaneZonaC > 0) {
			nrPersoaneZonaC--;
		} else if (zona.equals("Acces Zona D") && nrPersoaneZonaD > 0) {
			nrPersoaneZonaD--;
		}
	}
	
	public static void checkin(String zona) {
		if (zona.equals("Acces Zona A") && nrPersoaneZonaA > 0) {
			nrPersoaneZonaA++;
		} else if (zona.equals("Acces Zona B") && nrPersoaneZonaB > 0) {
			nrPersoaneZonaB++;
		} else if (zona.equals("Acces Zona C") && nrPersoaneZonaC > 0) {
			nrPersoaneZonaC++;
		} else if (zona.equals("Acces Zona D") && nrPersoaneZonaD > 0) {
			nrPersoaneZonaD++;
		}
	}
}