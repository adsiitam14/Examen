Class Solucion {
  public boolean problema (String s) {
	int i = 0;	
	int len1 = s.length();
	String aux1 = s.charAt(i);
	int len2 = aux1.length();
	boolean encontré = false;
	while(!encontré && len2 <= len1/2){
 	while (len1%len2 != 0){
	  i = i++;
	  aux1.append(s.charAt(i));
	}
	String aux2 = s;
	aux2 = aux2.replace(aux1, "");
	if (aux2 == "")
	  encontré == true;
	}
  }
}
