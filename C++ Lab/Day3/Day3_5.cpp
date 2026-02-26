#include<iostream>
using namespace std;

class Swapping{
	void swap(int &x, int &y){
		x=x+y;
		y=x-y;
		x=x-y;
	}
};

int main(){
	int a =10, b=20;
	cout<<"a: "<<a<<" b: "<<b<<endl;
	swap(a,b);
	cout<<"a: "<<a<<" b: "<<b<<endl;
	return 0;
}
