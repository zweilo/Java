
public class Mahasiswa 
{
	private String nim;
	private String namaDepan;
	private String namaBelakang;
	private String jenisKelamin;
	
	
	public Mahasiswa()
	{
		// TODO Auto-generated constructor stub
		this.nim = "";
		this.namaDepan = "";
		this.namaBelakang = "";
		this.jenisKelamin = "";
	}

	public String getNim() {
		return nim;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}

	public String getNamaDepan() {
		return namaDepan;
	}

	public void setNamaDepan(String namaDepan) {
		this.namaDepan = namaDepan;
	}

	public String getNamaBelakang() {
		return namaBelakang;
	}

	public void setNamaBelakang(String namaBelakang) {
		this.namaBelakang = namaBelakang;
	}

	public String getJenisKelamin() {
		return jenisKelamin;
	}

	public void setJenisKelamin(String jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
	}
	
}
