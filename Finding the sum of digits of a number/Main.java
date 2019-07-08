#include <stdio.h>
int main() {
	//Type your code
  int n;
  int sum;
  scanf("%d",&n);
  while(n>0)
  {
    sum+=n%10;
    n/=10;
  }
  printf("%d",sum);
	return 0;
}