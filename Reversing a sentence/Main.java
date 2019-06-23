#include<stdio.h>
#include<string.h>
int main()
{
	char str[100],rev[100];
	int i,len,start,end,index;
	gets(str);
	len=strlen(str);
	
	index=0;
	start=len-1;
	end=len-1;
	
	while(start>0)
	{
		if(str[start]==' ')
		{
			i=start+1;
			while(i<=end)
			{
				rev[index]=str[i];
				i++;
				index++;
			}
			rev[index++]=' ';
			end=start-1;
		}
		start--;
	}
	for(i=0; i<=end; i++)
    {
        rev[index] = str[i];
        index++;
    }
    rev[index] = '\0'; 
    printf("%s", rev);
    return 0;
}