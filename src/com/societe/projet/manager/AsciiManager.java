package com.societe.projet.manager;

import com.societe.projet.alphabets.DefaultAlphabet;


public class AsciiManager {
	
	private DefaultAlphabet alphabet;
	
	//************************************************//
	//	        $Constructeur
	//***********************************************//	
	
	 public AsciiManager(DefaultAlphabet alphabet) {
		 this.alphabet = alphabet;
	}
	  
	//************************************************//
	//	 $Method first translate : DEFAULT_ASCII_ART
	//***********************************************//	
	 
	public String[] getAsciiTranslate(String message) {
		
		int height = alphabet.getHeight();
		int width = alphabet.getWidth();
	
		StringBuilder builder = new StringBuilder();
		
		for(int i= 0; i<height;i++) {
			for(char letter : message.toUpperCase().toCharArray()) {
				
				if(letter  >= 65 && letter <= 90) {
					builder.append(alphabet.getDatas(i).substring((letter - 65)*width,(letter - 65)*width + width)); //ascci reprensentation ascii	
				}else {
					builder.append(alphabet.getDatas(i).substring(width*96,(width * 92) + width)); //
				}
			}
			builder.append("\n");	
		}
		System.out.println(builder.toString());
	
		return null;
	}

	//************************************************//
	//	 $Method translate : DEFAULT_ASCII_ART3
	//***********************************************//
	
	public String[] getAsciiTranslateAlphaN(String message) {
		
		int height = alphabet.getHeight();
		int width = alphabet.getWidth();
	
		StringBuilder builder = new StringBuilder();
		
		for(int i= 0; i<height;i++) {
			for(char letter : message.toUpperCase().toCharArray()) {
				
				if(letter  >= 34 && letter <= 126) {
					builder.append(alphabet.getDatas(i).substring((letter - 34)*width,(letter - 34)*width + width)); //ascci reprensentation ascii	
				}else {
					builder.append(alphabet.getDatas(i).substring(width*26,(width * 26) + width)); //26=?
				}
			}
			builder.append("\n");	
		}
		System.out.println(builder.toString());
		
		return null;
	} 
	
	public void asciiManager(DefaultAlphabet alphabet) {
	}
}
