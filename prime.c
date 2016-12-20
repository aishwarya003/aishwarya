#include<stdio.h>
#include<conio.h>
int main()
{
int i,n,prime=0;
printf("\nEnter the number");
scanf("%d",&n);
for(i=2;i<n/2;i++)
{
if(n%i==0)
{
prime=1;
break;
}
}
if(prime==0)
printf("PRIME");
else
printf("\n Not PRIME");
}
