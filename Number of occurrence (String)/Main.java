#include<stdio.h>
#include<string.h>
void upper_case(char s[])
{
	char c=0;
	while(s[c]!='\0')
	{
		if(s[c]>='a' && s[c]<='z')
		{
			s[c]=s[c]-32;
		}
		c++;
	}
}
int string_matching(char str1[],char str2[])  //int string_matching(char * str1,char * str2)
{
	int i,j,found,count=0;
	int str1len,str2len;
	str1len=strlen(str1);
	str2len=strlen(str2);
    
	for(i=0;i<=str1len-str2len;i++)
	{
		found=1;
		for(j=0;j<str2len;j++)
		{
			if(str1[i+j]!=str2[j])
			{
				found=0;
				break;
			}
		}
		if(found==1)
		{
			count++;
		}
	}
	return count;
}
int main()
{
	char str1[100],str2[100];
	int count;
	scanf("%[^\n]s",str1);
	upper_case(str1);
	scanf("%s",str2);
	upper_case(str2);
	count=string_matching(str1,str2);
	printf("%d",count);
	return 0;
}