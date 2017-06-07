#include<stdio.h>
void main()
{
char s;
printf("enter the value of s:");
scanf("%c",&s);
if((s>='A'&&s<='Z')||(s>='a'&&s<='z'))
printf("it is an alphabet",s);
else
printf("it is not an alphabet",s);
}
