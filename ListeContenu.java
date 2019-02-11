package exercice1;

import java.io.File;
import java.io.FileFilter;

public class ListeContenu {


	public static void main(String[] args) {

		
		File F = new File(".");
		Filetest FT= new Filetest();
		FileFilter filtreFichier = new FileFilter() {
			@Override
			public boolean accept(File testF) {
				return testF.isFile();
			}
		};
		FileFilter filtreDirectory = new FileFilter() {
			@Override
			public boolean accept(File testF) {
				return testF.isDirectory();
			}
		};
		

		String [] liste = F.list();
		File [] liste2 = F.listFiles();
		File [] liste3 = F.listFiles(filtreFichier);
		File [] liste4 = F.listFiles(filtreDirectory);
		
		

		//System.out.println(liste);
/*
		
		System.out.println();
		System.out.println("2e partie");
		System.out.println();

		for (File test: liste2) {
			System.out.println(test);
		}

		System.out.println();
		System.out.println("3e partie juste les fichiers");
		System.out.println();

		for (File test: liste3) {
			System.out.println(test);
		}
		
		System.out.println();
		System.out.println("4e partie juste les directory");
		System.out.println();
		

		for (File test: liste4) {
			System.out.println(test);
		}
*/
		for (File test:liste2) {
FT.testerfichier(test);
		}
	}
}
