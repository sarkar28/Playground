#include <stdio.h>
int main() {
	//Type your code
  int a[10];
  int m;
  scanf("%d",&m);
  int n=0;
  int i;
  for(i=0;i<30;i++)
  {
    if((i%2)!=0)
    {
      a[n]=i;
      n++;
    }
  }
  for(i=0;i<m;i++)
  {
    printf("%d\n",a[i]);
  }
	return 0;
}