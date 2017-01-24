package io.github.anantharajuc;

public class BreakStatementUnlabelled 
{
	public static void main(String[] args) 
	{
		for ( int var = 0; var < 5; var++ )  
        {  
            System.out.println( "Var is : " + var ); 
            
            if ( var == 3 )  
            break;  
        }  

	}
}
