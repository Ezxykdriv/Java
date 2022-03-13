package br.com.alura.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncoding {

	public static void main(String[] args) throws UnsupportedEncodingException {

		String s = "ç";
		System.out.println(s.codePointAt(0));
		
		Charset charset = Charset.defaultCharset();
		System.out.println(charset.displayName());
		
		byte[] bytes = s.getBytes("windows-1252");
		System.out.print(bytes.length + ", windows-1252, ");
		String string = new String(bytes,"windows-1252");
		System.out.println(string);
		
		bytes = s.getBytes("UTF-16");
		System.out.print(bytes.length + ", UTF-16, ");
		string = new String(bytes,"UTF-16");
		System.out.println(string);
		
		bytes = s.getBytes(StandardCharsets.US_ASCII);
        System.out.print(bytes.length + ", US-ASCII, ");
        string = new String(bytes, "US-ASCII");
        System.out.println(string);
		
		/*
		 * Pedro deseja testar os ensinamentos do vídeo. Então ele criou uma string com
		 * caracteres especiais em português, converteu-os em bytes e depois gerou nova
		 * string a partir desses bytes. Contudo, quando ele imprimiu a segunda string
		 * ele obteve um problema na codificação.
		 * 
		 * Veja o código de Pedro:
		 */
        
        System.out.println();
        
        String s1 = "13º Órgão Oficial";
        bytes = s1.getBytes();
        String s2 = new String(bytes, "UTF-8");
        System.out.println(s2);
		
		/*
		 * Veja o valor impresso no console:
		 * 
		 * 13? ?rg?o Oficial
		 */
        System.out.println();
        //Resposta:
        
        Charset utf8 = StandardCharsets.UTF_8;
        s1 = "13º Órgão Oficial";
        bytes = s1.getBytes(utf8);
        s2 = new String(bytes, utf8);
        System.out.println(s2);
	}

}
