package no.ciber.cibrary.domain;

public class Bok {
	
	private int id;
	private String tittel;
	private String forfatter;
	private String isbn;
	
	public Bok(int id, String tittel, String forfatter, String isbn) {
		super();
		this.id = id;
		this.tittel = tittel;
		this.forfatter = forfatter;
		this.isbn = isbn;
	}
	
	public int getId() {
		return id;
	}

	public String getTittel() {
		return tittel;
	}

	public String getForfatter() {
		return forfatter;
	}

	public String getIsbn() {
		return isbn;
	}
	
}
