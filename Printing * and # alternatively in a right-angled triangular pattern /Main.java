#include<stdio.h>

int main()
{
    int n;
  	scanf("%d",&n);
    char a='*';
    char ch[n][n];
    int i,j;
   for(i=0; i<n; i++)
	{
	    
		for(j=0; j<=i; j++)
		{
		    if (i!=0 && a=='*'){
		        if(j%2==0){
		            ch[i][j]='#';
	
		        }
		        else{
		            ch[i][j]='*';
		          
		        }
		        a='#';
		    }
		    else{
		   if(j%2==0){
		            ch[i][j]='*';
		            
		        }
		        else{
		            ch[i][j]='#';
		           
		        }
		        a='*';
		    }
			
		}
	
	}
	for(i =0;i<n;i++){
	    for(j=0;j<=i;j++){
	        
	        if(j>0 && ch[i][j-1]=='#'){
	            ch[i][j]='*';
	        }
	        else if(j>0 && ch[i][j-1]=='*'){
	            ch[i][j]='#';
	
	        }
	    }
	    
	}
	for(i =0;i<n;i++){
	    for(j=0;j<=i;j++){
	       printf("%c",ch[i][j]);
	    }
	    printf("\n");
	}
    return 0;
}