package com.societe.projet.alphabets;

public abstract class DefaultAlphabet {
	
	private int width;
	private int height;
	private String []datas;
	
	//************************************************//
	//	       constructeur
	//***********************************************//
	
	DefaultAlphabet(int width,int height,String []datas){
		this.width = width;
		this.height = height;
		this.datas = datas;
	}
	//************************************************//
	//	       $setter $Getter
	//***********************************************//
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getDatas(int indice) {
		return datas[indice];
	}
	public void setDatas(String[] datas) {
		this.datas = datas;
	}
}
