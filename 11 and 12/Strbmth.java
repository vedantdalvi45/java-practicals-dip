class Strbmth{
	public static void main(String[] args){
		StringBuffer str1=new StringBuffer("Sujal");
		StringBuffer str2=new StringBuffer(" Devale");
		System.out.println("str1 						: "+str1);
		System.out.println("str2 						: "+str2);
		System.out.println("append(str2) 					: "+str1.append(str2));
		System.out.println("insert(2,uu) 					: "+str1.insert(2,"uu"));
		System.out.println("Length Before 					: "+str1.length());
		str1.setLength(10);
		System.out.println("Length After 					: "+str1.length());
		System.out.println("String value before 				: "+str1);
		str1.setCharAt(0,'D');
		System.out.println("String value before After setCharAt(0,'D') 	: "+str1);
		System.out.println("reverse() 					: "+str2.reverse());
	}
}