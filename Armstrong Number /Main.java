#include <stdio.h>
#include <math.h>
int main() {
	//Type your code
  int n,i;
  int tempn=n;
  int powi;
  int sum=0;
  i=0;
  int digits[3];
  scanf("%d",&n);
  while(n>0)
  {
    digits[i]=n%10;
    n=n/10;
    i++;
  }
  powi = i+1;
  for(i=0;i<powi;i++)
  {
    sum = sum + (digits[i]*digits[i]*digits[i]);
  }
  if(sum == 153)
  {
    printf("Armstrong Number");
  }
  else
  {
     printf("Not an Armstrong Number"); 
  }
  
	return 0;
}