package uygulama2;

public interface KisiIslemleri {
	
	public boolean kisiyiKaydet(Kisi kisi);
	
	public boolean kisiyiSil(Kisi kisi);
	
	public void kisiBilgileriGoster(Kisi kisi);

	public void kisiAdresBilgileriniGoster(Kisi kisi);
	
	public void kisileriListele();

}
