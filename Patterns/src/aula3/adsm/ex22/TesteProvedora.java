package aula3.adsm.ex22;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class TesteProvedora {

	public static void main(String[] args) {
		criarArquivos();
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a senha: ");
		new FactoryProvedora(sc.nextLine());
		sc.close();

	}

	//Serve para criar os arquivos de texto
	private static void criarArquivos() {
		try (PrintWriter writer = new PrintWriter(new File("publico.txt"))) {
			writer.println("Estas informa��es s�o p�blicas. Todo mundo pode ver este arquivo.");
		} catch (FileNotFoundException e) {
			System.out.println("Deu erro ao escrever o arquivo");
			e.printStackTrace();
		}
		try (PrintWriter writer = new PrintWriter(new File("confidencial.txt"))) {
			writer.println("Estas informa��es s�o confidenciais, o que significa que provavelmente s� voc� sabe a senha.");
		} catch (FileNotFoundException e) {
			System.out.println("Deu erro ao escrever o segundo arquivo");
			e.printStackTrace();
		}

	}

}
