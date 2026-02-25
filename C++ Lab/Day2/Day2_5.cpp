#include<iostream>
using namespace std;

void add(int num1, int num2){
	int result = num1+num2;
	cout<<"Result: "<<result<<endl;
}

void add(int num1, int num2, int num3){
	int result = num1+num2+num3;
	cout<<"Result: "<<result<<endl;
}

void add(int num1, float num2){
	float result = num1+num2;
	cout<<"Result: "<<result<<endl;
}

int main(){
	::add(10,20);
	::add(10,20,30);
	::add(10, 20.20f);
	return 0;
}
