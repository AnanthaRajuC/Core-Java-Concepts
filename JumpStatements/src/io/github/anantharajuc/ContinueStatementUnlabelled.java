package io.github.anantharajuc;

public class ContinueStatementUnlabelled 
{
	public static void main(String[] args) 
	{
		for ( int var1 = 0; var1 < 4; var1++ )  
        {  
            for ( int var2 = 0; var2 < 4; var2++ )  
            {  
                if ( var2 == 2 )  
                continue;  
                
                System.out.println( "var1:" + var1 + ", var2:" + var2 );  
            }  
        }  		
	}
}
