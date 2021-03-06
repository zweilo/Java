
public class Kelas2KS1 extends Kelas
{
	private Mahasiswa mahasiswa[] = new Mahasiswa[35]; // jumlah mahasiswa masih static, TODO ubah ke dinamis

	public Kelas2KS1()
	{
	
		this.setNamaKelas("2KS-1");
		this.setJurusan("KS");
		this.setJumlahOrang(35);
		
		
		mahasiswa[0] = new Mahasiswa("Anton Rahmansyah Sumadi", "15.8518", enumJenisKelamin.LAKILAKI);
		mahasiswa[1] = new Mahasiswa("Yolian Munayif Hibatullah", "15.8947", enumJenisKelamin.LAKILAKI);
		mahasiswa[2] = new Mahasiswa("Adalard Yusuf Kamarastha", "16.8963", enumJenisKelamin.LAKILAKI);
		mahasiswa[3] = new Mahasiswa("Adhi Candra Maulana", "16.8964", enumJenisKelamin.LAKILAKI);
		mahasiswa[4] = new Mahasiswa("Ahmad Attaroqqi", "16.8974", enumJenisKelamin.LAKILAKI);
		mahasiswa[5] = new Mahasiswa("Ahmad Syahid Ibnu Syarif", "16.8979", enumJenisKelamin.LAKILAKI);
		mahasiswa[6] = new Mahasiswa("Alfian Khusnul Amar", "16.8990", enumJenisKelamin.LAKILAKI);
		mahasiswa[7] = new Mahasiswa("Alha Ahmada Belasae", "16.8993", enumJenisKelamin.LAKILAKI);
		mahasiswa[8] = new Mahasiswa("Anika Basa Meldion Simamora", "16.9011", enumJenisKelamin.PEREMPUAN);
		mahasiswa[9] = new Mahasiswa("Ariel Panigori Sinaga", "16.9024", enumJenisKelamin.LAKILAKI);
		
		mahasiswa[10] = new Mahasiswa("Bayu Nirwana Makasuci", "16.9046", enumJenisKelamin.LAKILAKI);
		mahasiswa[11] = new Mahasiswa("Cholifa Fitri Annisa", "16.9053", enumJenisKelamin.PEREMPUAN);
		mahasiswa[12] = new Mahasiswa("Dian Rizqi Khusnul Khotimah", "16.9079", enumJenisKelamin.PEREMPUAN);
		mahasiswa[13] = new Mahasiswa("Eka Majida Agustyani", "16.9100", enumJenisKelamin.PEREMPUAN);
		mahasiswa[14] = new Mahasiswa("Fachrunissa Azziza", "16.9110", enumJenisKelamin.PEREMPUAN);
		mahasiswa[15] = new Mahasiswa("Farhan Anshari Arsyi", "16.9124", enumJenisKelamin.LAKILAKI);
		mahasiswa[16] = new Mahasiswa("Fenty Berliana Tifalny", "16.9137", enumJenisKelamin.PEREMPUAN);
		mahasiswa[17] = new Mahasiswa("Gamalia Gina Atmajaya", "16.9148", enumJenisKelamin.PEREMPUAN);
		mahasiswa[18] = new Mahasiswa("Haris Munandar", "16.9172", enumJenisKelamin.LAKILAKI);
		mahasiswa[19] = new Mahasiswa("Ika Oktaviani Dewi Hanifah", "16.9190", enumJenisKelamin.PEREMPUAN);
		
		mahasiswa[20] = new Mahasiswa("Intan Eka Debora Simamora", "16.9198", enumJenisKelamin.PEREMPUAN);
		mahasiswa[21] = new Mahasiswa("Krishna Aji Satriatama", "16.9227", enumJenisKelamin.LAKILAKI);
		mahasiswa[22] = new Mahasiswa("M Reza Perdana", "16.9245", enumJenisKelamin.LAKILAKI);
		mahasiswa[23] = new Mahasiswa("Made Indra Prastya", "16.9252", enumJenisKelamin.LAKILAKI);
		mahasiswa[24] = new Mahasiswa("Mohamad Yusup", "16.9276", enumJenisKelamin.LAKILAKI);
		mahasiswa[25] = new Mahasiswa("Muhammad Adib Tamtama", "16.9285", enumJenisKelamin.LAKILAKI);
		mahasiswa[26] = new Mahasiswa("Muhammad Faza", "16.9292", enumJenisKelamin.LAKILAKI);
		mahasiswa[27] = new Mahasiswa("Muhammad Hafid Nasution", "16.9295", enumJenisKelamin.LAKILAKI);
		mahasiswa[28] = new Mahasiswa("Muhammad Hasbi Ashshidiq", "16.9299", enumJenisKelamin.LAKILAKI);
		mahasiswa[29] = new Mahasiswa("Muhammad Zainu Iqbal", "16.9309", enumJenisKelamin.LAKILAKI);
		
		mahasiswa[30] = new Mahasiswa("Rachmat Dhany Ichsan", "16.9364", enumJenisKelamin.LAKILAKI);
		mahasiswa[31] = new Mahasiswa("Rian Surya Pratama", "16.9379", enumJenisKelamin.LAKILAKI);
		mahasiswa[32] = new Mahasiswa("Rivaldi", "16.9389", enumJenisKelamin.LAKILAKI);
		mahasiswa[33] = new Mahasiswa("Rozan Fikri", "16.9404", enumJenisKelamin.LAKILAKI);
		mahasiswa[34] = new Mahasiswa("Todo Parulian Simbolon", "16.9450", enumJenisKelamin.LAKILAKI);
	}
		
	public void getAllMahasiswa()
	{
		System.out.println("\nDaftar mahasiswa " + this.toString() + "\n");
		
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("| NO |\tNama\t\t\t\t|   NIM\t\t| Jenis Kelamin |");
		System.out.println("-------------------------------------------------------------------------");
		
		for (int index = 0; index < mahasiswa.length; index++)
		{	
			int a=index+1;
			
			if(index<9) {
				System.out.print("|  " + a + " | ");
			} else {
				System.out.print("| " + a + " | ");
			}
			
			if(mahasiswa[index] != null)
			{
				if(mahasiswa[index].getNamaMahasiswa().length()>=25) {
					System.out.print(mahasiswa[index].getNamaMahasiswa()+ "\t");
				}else if (mahasiswa[index].getNamaMahasiswa().length()>=17) {
					System.out.print(mahasiswa[index].getNamaMahasiswa()+ "\t\t");
				}else if (mahasiswa[index].getNamaMahasiswa().length()>=9) {
					System.out.print(mahasiswa[index].getNamaMahasiswa()+ "\t\t\t");
				}else if (mahasiswa[index].getNamaMahasiswa().length()>=4) {
					System.out.print(mahasiswa[index].getNamaMahasiswa()+ "\t\t\t\t");
				}
				
				System.out.println("|  "+ mahasiswa[index].getNim() + "\t| "
								+  mahasiswa[index].getJenisKelamin()+"\t|" );
				
			}
			else
			{
				System.out.println("\nEnd of line.");
			}
			
		}
		System.out.println("-------------------------------------------------------------------------");
	}
	
	public Mahasiswa getMahasiswa(int index)
	{
		if(index>0 && index<=mahasiswa.length)
		{
			return mahasiswa[index-1];
		}
		else
		{
			return mahasiswa[0];
		}
		
	}

	public void setMahasiswa(Mahasiswa mahasiswa, int index)
	{
		this.mahasiswa[index] = mahasiswa;
	}
	
}
