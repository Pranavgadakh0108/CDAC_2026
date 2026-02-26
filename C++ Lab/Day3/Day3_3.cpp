#include<iostream>
using namespace std;

class Addition{
	public:
	void add(int n1=0, int n2=0, int n3=0, int n4=0, int n5=0){
		int result = n1+n2+n3+n4+n5;
		cout<<"Addition Result: "<<result<<endl;
	}
};

int main(){
	Addition a1;
	a1.add();
	a1.add(10);
	a1.add(10,20);
	a1.add(10,20,30);
	a1.add(10,20,30,40,50);
	
	
	return 0;
}
