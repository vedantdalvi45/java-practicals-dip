class Strmth{
	public static void main(String[] args){
		String str="	Sujal Devale";
		String str2="	Sujal devale";
		System.out.println("str 		: "+str);
		System.out.println("str2 		: "+str2+"\n\n");
		System.out.println("charAt(2) 			: "+str.charAt(1));
		System.out.println("compareTo(	Sujal) 		: "+str.compareTo("	Sujal"));
		System.out.println("equals(str2) 			: "+str.equals(str2));
		System.out.println("equalsIgnoreCase(str2) 		: "+str.equalsIgnoreCase(str2));
		System.out.println("length() 			: "+str.length());
		System.out.println("replace('S','D') 		: "+str.replace('S','D'));
		System.out.println("startsWith(	Sujal) 		: "+str.startsWith("	Sujal"));
		System.out.println("endsWith(Devale) 		: "+str.endsWith("Devale"));
		System.out.println("indexOf('a') 			: "+str.indexOf('a'));
		System.out.println("substring(1) 			: "+str.substring(1));
		System.out.println("lastIndexOf('a') 		: "+str.lastIndexOf('a'));
		System.out.println("toUpperCase() 			: "+str.toUpperCase());
		System.out.println("toLoverCase()			: "+str.toLowerCase());
		System.out.println("trim() 				: "+str.trim());
		char chars[] ={'a','b','c'};
		String st = new String(chars);
		System.out.println(st);
		String  s1 ="Hello I love java";
		String  s2 = new String(s1);
		System.out.println((s1==s2)+" "+s1.equals(s2));
	}
}