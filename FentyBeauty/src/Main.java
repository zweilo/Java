import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{	
		int pilihan;
		int harga;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Fenty Beauty by Fenty | Beauty for All\n");
		
		System.out.print("Pilih produk kami : ");
		Product.getProductDetails();
		pilihan = scan.nextInt();
		
		if(pilihan == 1)
		{
			System.out.println(ProductFaceBeauty.getFoundation().getNameTag() + "\n");
			System.out.println(ProductFaceBeauty.getPrimer().getNameTag() + "\n");
			System.out.println(ProductFaceBeauty.getHighlighter().getNameTag() + "\n");
			System.out.println(ProductFaceBeauty.getBrush().getNameTag() + "\n");
		}
		else if(pilihan == 2)
		{
			System.out.println(ProductEyeBeauty.getEclipse().getNameTag() + "\n");
			System.out.println(ProductEyeBeauty.getGalaxy().getNameTag() + "\n");
		}
		else if(pilihan == 3)
		{
			System.out.println(ProductLipBeauty.getLipStick().getNameTag() + "\n");
			System.out.println(ProductLipBeauty.getLipGloss().getNameTag() + "\n");
		}
		
		scan.close();
	}
}
