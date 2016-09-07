package routines;

public class GetRandomTelNum {


    /**
     * GetTel: not return value, only print "hello" + message.
     * 
     * 
     * {talendTypes} String
     * 
     * {Category} User Defined
     * 
     * {example} GetTel() # 0123456789.
     */
    public static String GetTel() {
    	String Tel="0";
    	Tel=Tel.concat(String.valueOf(Math.round(routines.Numeric.random(1,6))));
    	for(int i=0;i<8;i++){
    		Tel=Tel.concat(String.valueOf(Math.round(routines.Numeric.random(0,9))));
    	}
    	return Tel;    	

    }
    
    /**
     * GetPhone: returns a random phone number
     * 
     * 
     * {talendTypes} String
     * 
     * {Category} User Defined
     * 
     * {example} GetPhone() # 0123456789.
     */
    public static String GetPhone() {
    	String Phone="0";
    	Phone=Phone.concat(String.valueOf(Math.round(routines.Numeric.random(1,6))));
    	for(int i=0;i<8;i++){
    		Phone=Phone.concat(String.valueOf(Math.round(routines.Numeric.random(0,9))));
    	}
    	return Phone;   	
    }
    
    public static void main(String args[]){
    	System.out.println(GetTel());
    	System.out.println(GetPhone());
    }
}
