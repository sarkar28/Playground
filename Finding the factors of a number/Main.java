#include <stdio.h>
int main() {
	//Type your code
  int n,i;
  int m=0;
  int factors[5];
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    if((n%i)==0)
    {
      factors[m]=i;
      m++;
    }
  }
  for(i=0;i<m;i++)
  {
    printf("%d\n",factors[i]);
  }
	return 0;
}