package br.com.fiap.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TesteArquivoBuffer {

	public static void main(String[] args) throws IOException {
		
		String caminho = "D:\\Pastinha\\arquivinho.txt";

		FileReader lerArquivo = new FileReader(caminho);
		BufferedReader carregarLeitura = new BufferedReader(lerArquivo);
		
		String lerLinha = carregarLeitura.readLine();
		
		while(lerLinha != null) {
			System.out.println(lerLinha);
			lerLinha = carregarLeitura.readLine();
		}
		carregarLeitura.close();
	}
	

}
