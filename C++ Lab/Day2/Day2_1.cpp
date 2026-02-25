#include<stdio.h>

namespace na{
	int a = 10;
}
namespace nb{
	int a =40;
}
int a = 20;
int main(){
	int a = 30;
	printf("a: %d\n", a);
	printf("a: %d\n", ::a);
	printf("a: %d\n", na::a);
	printf("a: %d\n", nb::a);
	
	return 0;
}
