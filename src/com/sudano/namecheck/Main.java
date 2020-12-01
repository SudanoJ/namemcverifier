package com.sudano.namecheck;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.URL;
import java.net.URLConnection;

import com.sudano.namecheck.utils.ReadFile;
import com.sudano.namecheck.utils.WriteFile;

/**
 * 
 * @author Sudano
 * @source https://github.com/sudanoj/namemcverifier
 *
 */

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		String nicknames_arquivo = ReadFile.readFile(System.getProperty("user.home") + "/Desktop\\" + "nomes.txt");
		
		BufferedReader bufferedReader = new BufferedReader(new StringReader(nicknames_arquivo));
		String linha = null;
		while((linha = bufferedReader.readLine()) != null) {
		String namemc_url = "https://namemc.com/search?q=" + linha;
		URL url = new URL(namemc_url);
		URLConnection urlCon = url.openConnection();
		InputStream input = urlCon.getInputStream();
		BufferedReader buffered = new BufferedReader(new InputStreamReader(input));
		
		String line = null;
		
		while((line = buffered.readLine()) != null) {
			if(line.contains("Status:")) {
				if(line.contains("Available")) {
					System.out.println("O nick: \"" + linha + "\" está disponível!");
					WriteFile.writeFile(linha, "validos");
					break;
				} else if(line.contains("Too short")){
					System.out.println("O nick: \"" + linha + "\" é muito curto!");
					WriteFile.writeFile(linha, "invalidos");
					break;
				} else if(line.contains("Unavailable")) {
					System.out.println("O nick: \"" + linha + "\" está indisponível!");
					WriteFile.writeFile(linha, "invalidos");
					break;
				}
			}
			
		
		}
		}	
	}

}
