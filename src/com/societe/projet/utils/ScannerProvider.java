package com.societe.projet.utils;

import java.util.Scanner;

public class ScannerProvider {
	
	//************************************************//
	//	       private scanner
	//***********************************************//
	private Scanner scanner;
	//************************************************//
	//	      $Constructor ScannerProvider
	//***********************************************//	
	private ScannerProvider(){
		this.scanner = new Scanner(System.in);
	}
	//************************************************//
	//	        $getters
	//***********************************************//	
	    
	    public Scanner getScanner() {
	    	return scanner;
	    }
	 //************************************************//
	//	        Singleton alone instance v2
	//***********************************************//	
	     
	    /** Instance unique non pre initialis�e */
	    private static ScannerProvider INSTANCE = null; 
	    
	    /** Point d'acc�s pour l'instance unique singleton */
	    public static synchronized ScannerProvider getInstance()
	    {           
	        if (INSTANCE == null)
	        {   INSTANCE = new ScannerProvider(); 
	        }
	        return INSTANCE;
	    }    
}
