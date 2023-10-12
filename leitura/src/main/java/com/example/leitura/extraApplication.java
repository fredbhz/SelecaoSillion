package com.example.leitura;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Scanner;


public class extraApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite a URL: ");
		String url = scanner.nextLine();

		System.out.print("Digite uma frase: ");
		String frase = scanner.nextLine();

		try {
			document doc = Jsoup.connect(url).get();
			String page = doc.text().toLowerCase();

			int countFrase = 0;
			int index = pageContent.indexOf(frase.toLowerCase());
			while (index != -1){
				countFrase++;
				index = pageContent.indexOf(frase.toLowerCase(), index + 1);
			}
			System.out.println("A frase\""+ frase + "\" foi encontrada" + countFrase + "vezes na pagina");

			String[] palavras = frase.splint("");
			for (String palavra : palavras) {
				int countPalavra = pageContent.split(palavra).length - 1;
				System.out.println("A palavra \"" + palavra + "\" foi encontrado " + countPalavra + "vezes na pagina");
			}
		} catch (IOException e){
			System.err.println("Verifique a url inserida");
		}
	}

}

