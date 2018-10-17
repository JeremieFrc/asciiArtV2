package com.societe.projet;


import com.societe.projet.alphabets.VotreAlphabet;
import com.societe.projet.alphabets.VotreAlphabetN;
import com.societe.projet.manager.AsciiManager;
import com.societe.projet.utils.ScannerProvider;


public class ApplicationProjetAscii {

	public static void main(String[] args) {
		//************************************************//
		//	 $Version  : DEFAULT_ASCII_ART
		//***********************************************//	
		
		//AsciiManager asciiManager = new AsciiManager(new VotreAlphabet());
		
		//************************************************//
		//	 $Version  : DEFAULT_ASCII_ART3
		//***********************************************//
		
		AsciiManager asciiManager = new AsciiManager(new VotreAlphabetN());
		
		
		//************************************************//
		//	 $Instance Scanner
		//***********************************************//
		
		ScannerProvider scanners = ScannerProvider.getInstance();
		
		//************************************************//
		//	 $treatment : parameter string select by user
	   //***********************************************//
		
		asciiManager.getAsciiTranslate(scanners.getScanner().nextLine());
		
		
		//************************************************//
		//	 last version select auto
	    //***********************************************//
		//AsciiManager  manager = new AsciiManager ();
		//manager.getAsciiTranslate("ABCDEFGHIJK");
	}
}
