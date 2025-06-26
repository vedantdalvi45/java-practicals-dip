 class Wrap {
    public static void main(String[] args) {
       String s =args[0];
       Integer i = Integer.parseInt(s);
       System.out.println("i.byteValue()     : "+i.byteValue());
       System.out.println("i.doubleValue()   : "+i.doubleValue());
       System.out.println("i.floatValue()    : "+i.floatValue());
       System.out.println("i.intValue()      : "+i.intValue());
       System.out.println("i.shortValue()    : "+i.shortValue());
       System.out.println("i.longValue()     : "+i.longValue());
    }
}
