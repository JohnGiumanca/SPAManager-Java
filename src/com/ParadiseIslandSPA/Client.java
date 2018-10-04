package com.ParadiseIslandSPA;

import java.util.*;

public class Client {
	private Integer idTmp;
	private String email;
	private String prenume;
	private String nume;
	private PortofelVirtual portofelulMeu;
	private String zona = "";

	public Client(String e, String p, String n) {
		email = e;
		prenume = p;
		nume = n;

		portofelulMeu = new PortofelVirtual();
	}

	public Integer getIdTmp() {
		return idTmp;
	}

	public void setIdTmp(Integer i) {
		idTmp = i;
	}

	public String getEmail() {
		return email;
	}

	public String getNume() {
		return nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public PortofelVirtual getPortofelulMeu() {
		return portofelulMeu;
	}

	public Boolean cumparareProdus(List<DetaliiProdus> dpList) {
		System.out.println("Size client " + dpList.size());
		return portofelulMeu.adaugaBilant(dpList);
	}

	public List<DetaliiProdus> getChitanta() {
		return portofelulMeu.getChitanta();
	}

	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}

	public boolean requestAcces(String idZona) {
		if(portofelulMeu == null) {
			System.out.println("Portofel null");
			return false;
		}
		return portofelulMeu.verifyProduct(idZona);
	}

}