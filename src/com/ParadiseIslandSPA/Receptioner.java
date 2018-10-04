package com.ParadiseIslandSPA;
 
import java.util.*;
 
public class Receptioner
{
    static Map<String, Client> clientMapTmp = new HashMap<String, Client>();
    static Map<Integer, Boolean> tmpIdMap = new HashMap<Integer, Boolean>();
    static Integer maxId = 6000;
   
    private Receptioner()
    {
       
    }
   
    public static boolean setNewClient(String email, String password, String nume, String prenume)
    {  
        Client clientTmp = new Client(email, nume, prenume);
       
        BazaDeDate.addNewClient(clientTmp, password);  
       
        //System.out.println("email " + email + "passwrod " + password + "nume " + nume + "prenume " + prenume) ;
       
        if(BazaDeDate.addNewClient(clientTmp, password))
        {
            clientMapTmp.put(clientTmp.getEmail(), clientTmp);
           
            return true;
        }
        else
            return false;
    }
   
   
    public static boolean loginClient(String email, String password)
    {
//      //System.out.println("email " + email + "  " + "password " + password);
     if(email !=null && !email.isEmpty() && password !=null && !password.isEmpty())
     {
        if(BazaDeDate.loginValidation(email, password))
        {
        	
            if(!clientMapTmp.containsKey(email))
            {
                Client clientTmp = new Client(email, "", "");
                clientMapTmp.put(email, clientTmp);
            }
            int i;
   
                for(i = 1000; i < maxId; i++)
                {
                   
                    if(tmpIdMap.containsKey(i))                    
                    {
                       
       
                        if(tmpIdMap.get(i))
                        {
                            getClient(email).setIdTmp(i);
                            tmpIdMap.put(i, false);
                            break;
                        }
                    }
                    else
                    {
                        tmpIdMap.put(i, false);
                        getClient(email).setIdTmp(i);
                        break;
                    }
                }
               
            if(i == maxId)
                return false;
                       
            return true;
        }
        else
            return false;
     }
     return false;
    //  return BazaDeDate.loginValidation(email, password);
    }
   
    public static boolean adminCheck(String email, String password){
       
    	if(email !=null && !email.isEmpty() && password !=null && !password.isEmpty())
        {
    		return BazaDeDate.adminValidation(email, password);
        }
    	
    	return false;
       
    }
   
    public static boolean addProduct(String nume, Double pret, String tip) {
        return BazaDeDate.addNewProduct(nume, pret, tip);
    }
   
    public static Map<String,Integer> getZoneStatus()
    {
        return Manager.getZoneStatus();
    }
   
    public static Boolean cumparareProdus(List<DetaliiProdus> dpList, String email)
    {  
        //only for testing, single line method from return
        System.out.println("Email aici " + email);
        System.out.println("Receptioner list " + dpList.size());
        
        
        return getClient(email).cumparareProdus(dpList);
    }
   
   
    public static List<DetaliiProdus> afisareProduse(String tipProdus)
    {
        return BazaDeDate.getListaProduse(tipProdus);      
    }
   
   
    public static List<String> afisareCategorii()
    {
        List<String> typeList = new LinkedList<String>();
        typeList.add("Zona");
        typeList.add("Bar");
        typeList.add("Restaurant");
        typeList.add("Servicii");
       
        return typeList;
    }
   
   
    public static Client getClient(String email)
    {
        return clientMapTmp.get(email);
    }
   
    public static boolean requestAcces(String idZona, String email)
    {
    	
        return getClient(email).requestAcces(idZona);
    }
   
    public static String getBilantClient(String email)
    {
    	//System.out.println("suma de plata : " + getClient(email).getPortofelulMeu().getBilant());
        return Double.toString(getClient(email).getPortofelulMeu().getBilant());
    }
    
 
    public static List<DetaliiProdus> getChitanta(String email, boolean checkout)
    {
        List<DetaliiProdus> chitantaTmp =  getClient(email).getChitanta();
       
        if(checkout)
        {
            tmpIdMap.replace(getClient(email).getIdTmp(), false);
            
            ZoneStats.checkout(getClient(email).getZona());
           
            getClient(email).getPortofelulMeu().reset();   
           
            clientMapTmp.remove(email);
        }  
       
        return chitantaTmp;
    }
    
    public static void modificaZona(String email,String zona) {
    	if(email != null) {
    		getClient(email).setZona(zona);
    	}
    }
   
 
}