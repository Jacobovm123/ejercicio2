/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parentesisejercicio;

import java.util.Stack;

/**
 *
 * @author Jacobo
 */
public class Parentesisejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        
        
        
        
    
        
        
        
        
        
       System.out.println("(a[0] + b[2c[6]]){24 + 53} passed: " + parensMatch("(a[0] + b[2c[6]]){24 + 53}"));
        System.out.println("f(e(d)) passed: " + parensMatch("f(e(d))"));
        System.out.println("((b) passed: " + !parensMatch("((b)"));
        System.out.println("(empty) passed: " + parensMatch("(empty)"));
        System.out.println("([)] passed: " + !parensMatch("([)]"));
        System.out.println(" passed: " + parensMatch("     "));
        System.out.println("passed: " + parensMatch(""));
    }
    
    
    public static boolean parensMatch(String cadena)  {

    Stack<String> pila = new Stack<String>();  
     int b= 0;
    int i = 0;
  
    
    
          
    for(i=0;i<cadena.length();i++) { 
        
        
        if(cadena.charAt(i)=='(') 
        {
         
            pila.push("(");
             
              
        }                             
        else if (cadena.charAt(i)==')') {
            
            
        if (!pila.empty()){ pila.pop(); 
        } 
        else 
        { pila.push(")"); 
        break; 
        } 

                
        }
        if(cadena.charAt(i)=='[') 
        {
            pila.push("[");
        }
        else if (cadena.charAt(i)==']')
        {
            if (!pila.empty())
            { pila.pop(); 
            
        } 
        else { pila.push("]"); break; }
        
        }
         if(cadena.charAt(i)=='{') 
         {
             pila.push("{");
         }
        else if (cadena.charAt(i)=='}')
        {
            if (!pila.empty()){ pila.pop(); 
            } 
        else { pila.push("}"); break; }
        
        }

                

    }
            
            
        
     
         
     



        
     


            if(pila.empty())
            { 
                return true; 
            } 
            else 
            { 
                return false; 
            }

     
     

     }
    
    
}
