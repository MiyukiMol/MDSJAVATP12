package org.mds.java.tp12remplacement.utils;

import java.util.regex.Pattern;

public class StringUtil {

public static String str = "Je suis content eT ET et Et je vais bien.";
	
	// Une fonction utilisera la fonction "split" disponible sur les objets de type String
	public static void remplaceEt1() {
		System.out.println(str + "\n");
	    String[] array = str.split(" ");
	    //System.out.println(Arrays.toString(array));
	    System.out.println("On remplace 'et/eT/Et/ET' par ' , en plus' avec la function split : ");
	    for(int i = 0; i<array.length; i++){
	    	// Le programme dois rechercher toutes les variations et eT Et ET
	        if(array[i].equalsIgnoreCase("et")){
	            System.out.print(", en plus ");
	        }else{
	        System.out.print(array[i] + " ");
	        }	    
	    }
		System.out.println("\n");
	}

	
	// Une fonction utilisera la fonction "replaceAll" disponible sur les objets de type String
	public static void remplaceEt2() {
		System.out.println("On remplace 'et/eT/Et/ET' par ' , en plus' avec la function replaceAll : ");
		//System.out.println(str.replaceAll("et", ", en plus"));
		String remplace2 = Pattern.compile("et", Pattern.CASE_INSENSITIVE).matcher(str).replaceAll(", en plus");
		System.out.println(remplace2);

	}
}
