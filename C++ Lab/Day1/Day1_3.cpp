#include<stdio.h>
int main(){
	const int a =10;
	const int *ptr = &a;
	//ptr is a non-constant pointer pointing to constant
	printf("%d\n",a);
	printf("%d\n", *ptr);
 //	*ptr = 20; x
 	const int b = 20;
 	ptr = &b;
 	printf("%d\n", *ptr);
	return 0;
}
