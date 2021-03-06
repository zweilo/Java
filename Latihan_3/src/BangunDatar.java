
public abstract class BangunDatar
{
	private int jmlSisi;
	private int jmlSudut;
	private String namaBangun;

	abstract double getLuas();
	abstract double getKeliling();
	
	
	public int getJmlSisi()
	{
		return jmlSisi;
	}
	public void setJmlSisi(int jmlSisi)
	{
		this.jmlSisi = jmlSisi;
	}
	public int getJmlSudut()
	{
		return jmlSudut;
	}
	public void setJmlSudut(int jmlSudut)
	{
		this.jmlSudut = jmlSudut;
	}
	public String getNamaBangun()
	{
		return namaBangun;
	}
	public void setNamaBangun(String namaBangun)
	{
		this.namaBangun = namaBangun;
	}
}
