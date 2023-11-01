package br.com.fiap.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TesteLerArquivo {

	public static void main(String[] args) throws FileNotFoundException {
		
		File arquivo = new File("D:\\Pastinha\\arquivinho.txt");

		Scanner leitor = new Scanner(arquivo);
		
		while(leitor.hasNextLine()){
			System.out.println(leitor.nextLine());
		}
		leitor.close();
	}

}
