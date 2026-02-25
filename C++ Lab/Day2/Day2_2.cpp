#include<stdio.h>

//nested namespace

namespace na1{
	int num = 10;
	
	namespace na2{
		int num = 20;
	}
}

int main(){
	
	printf("num = %d\n", na1::num);
	printf("num = %d\n", na1::na2::num);
	
	return 0;
}
