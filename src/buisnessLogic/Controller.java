package buisnessLogic;

import java.util.Date;

public class Controller
{
    public Controller(){}
   
     public String vetemNumra(String txt,String name) throws AppException
    {
        zbrazet(txt, name);
        if(name.equals("Numri Personal") && txt.length() < 9)
        {
            throw new AppException("Fusha " +name+" duhet te kete se paku 9 numra");
            
        }      
        if (!txt.matches("[0-9]+")) {
                   throw new AppException("Fusha " +name+" duhet te permbaje vetem numra");
        }
        return txt;
    }
     
    public String vetemShkronja(String txt, String name) throws AppException
    {
        zbrazet(txt, name);
         if(txt.length() < 3)
        {
            throw new AppException("Fusha " +name+" duhet te kete se paku 3 shkronja");
        }             
                if(!txt.matches("[a-zA-Z]+"))
                {
                    throw new AppException("Fusha "+name+" duhet te permbaje vetem shkronja");
                }
           
        return txt;
    }
     public String numraShkronja(String txt, String name) throws AppException
    {
        zbrazet(txt, name);
         if( txt.length() < 3)
        {
            throw new AppException("Fusha " +name+" duhet te kete se paku 3 shkronja ose numra");
        }
        
                
                if(txt.matches("[a-zA-Z0-9]+"))
                {
                    throw new AppException("Fusha "+name+" duhet te permbaje vetem shkronja dhe numra");
                }
          
        return txt;
    }
     
     public String nrDhembi(String txt) throws AppException
     {
         zbrazet(txt, "Dhembi");
         if( txt.contains("[a-zA-Z]+") || !txt.matches("3[0-2]|[0-2][0-9]|[0-9]") )
             throw new AppException("Fusha Nr dhembit duhet te permbaje numra 0-32");
         else
         return txt;
             
     }
     public String zbrazet(String text, String name) throws AppException
     {
        if(text.isEmpty())
             throw  new AppException("Fusha "+name+" duhet te mbushet");
         else
             return text;
     }
     public String email(String text) throws AppException
     {
         zbrazet(text, "Email");
         if(text.matches("^[_A-Za-z0-9-]+(\\\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+\n" +
"(\\\\.[A-Za-z0-9]+)*(\\\\.[A-Za-z]{2,})$"))
             throw  new AppException("Fusha email duhet te mbushet keshtu: someone@something.some");
         else
             return text;
     }
     public String ora(String text) throws AppException
     {
         zbrazet(text, "Ora");
         if(!text.matches("([01]?[0-9]|2[0-3]):[0-5][0-9]"))
             throw  new AppException("Fusha Ora duhet te mbushet keshtu: 24:00");
         else 
             return text;
     }

     public Date data (Date d) throws AppException
     {
         if(d == null)
              throw  new AppException("Duhet te zgjedhet nje date");
         else 
              return d;
             
     }
}