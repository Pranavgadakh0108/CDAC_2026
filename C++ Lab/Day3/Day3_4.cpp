#include<iostream>
using namespace std;

int main(){
	int num1 = 10;
	int num2 = num1;
	
	cout<<"num1: "<<num1<<" address: "<<&num1<<endl;
	cout<<"num2: "<<num2<<" address: "<<&num2<<endl;
	
	cout<<"---------------------------------"<<endl;
	
	int num3 =20; //referent
	int &num4 = num3; //reference
	cout<<"num3: "<<num3<<" address: "<<&num3<<endl;
	cout<<"num4: "<<num4<<" address: "<<&num4<<endl;
	
	cout<<"---------------------------------"<<endl;
	
	++num3;
	++num4;
	cout<<"num3: "<<num3<<" address: "<<&num3<<endl;
	cout<<"num4: "<<num4<<" address: "<<&num4<<endl;
	
	cout<<"---------------------------------"<<endl;
	
	int num10 = 10;
	int &num20 = num10;
	int &num30 = num20;
	
	++num20;
	
	cout<<"num10: "<<num10<<" address: "<<&num10<<endl;
	cout<<"num20: "<<num20<<" address: "<<&num20<<endl;
	cout<<"num30: "<<num30<<" address: "<<&num30<<endl;
	
	
	
	
	return 0;
}
