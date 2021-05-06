package afn_java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		//Declaro uma variavel string com o endereco do diretorio que deve buscar o arquivo de texto
		String path = "C:\\Users\\\\kelvi\\eclipse-workspace\\afn_java\\automato.txt";
		//Declaro outra variavel string com o endereco do diretorio que deve ser gerado o arquivo de texto
		String pathout =  "C:\\Users\\\\kelvi\\eclipse-workspace\\afn_java\\result.txt";
		// Declaro outras duas variaveis do tipo *reader que sao usadas para buscar e ler o arquivo
		BufferedReader br = null;
		FileReader fr = null;
		//Abro um try catch porque essa operacao gera um excecao
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathout,true))) {
		//Atribuo a variaver path para a classe fileReader
			fr = new FileReader(path);
		//Atribuo a variavel fr para a classe Buffereader dentro da variavel br
			br = new BufferedReader(fr);
		// crio a variavel line contendo as linhas do arquivo
			String line = br.readLine();
		// Dou um split na primeira linha formando assim o conjunto
			String cjt[] = line.split(";");
		// Dou um split na segunda linha formando assim o alfabeto
			String alf[] = br.readLine().split(";");
			
			
         // Abro um for em no conjunto que sera a linha
			for (int i = 0; i < cjt.length; i++) {
		// Abro um for no alfabeto que será a coluna
				for (int y = 0; y < alf.length; y++) {
		// defino os estados inicial, corrente e final
					String estado;
					if (i==0 && y==0) {
						estado = "inicial";
					}else if (i==cjt.length-1 && y==alf.length-1) {
				    	estado = "final";
					}else {
						estado = "corrente";
					}
		//Apos isso ele ira inserir em um arquivo de texto linha a linha conforme mensagem abaixo como se fosse uma matriz
	   // Na primeira linha teremos q1 e as posicao correspondentes ao conjunto 0, 1, *, na segunda linha q2 0,1,* e assim
      // por diante
				 
					line = br.readLine();
				    bw.write("Estado "+estado+ " q"+(i+1)+" coluna "+((y==2)?"*":y)+" simbolo " +line);
					bw.newLine();
				
				}
			}
     // Por fim tem catch e o finally para tratar qualquer exceção e finalizar as variaveis.

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			try {
				if (br != null)
					br.close();
				if (fr != null)
					fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	/*	String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };
	//	String pathou = "C:\\Users\\kelvi\\eclipse-workspace\\afn_java\\result.txt";
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} */
	}
}
