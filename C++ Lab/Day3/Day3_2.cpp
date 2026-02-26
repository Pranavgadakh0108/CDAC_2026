#include<iostream>
using namespace std;
class Complex{
	
	int real;
	int imag;
	
	public:
	Complex(){
		this->real = 0;
		this->imag = 0;
	}
	
	Complex(int real, int imag){
		this->real = real;
		this->imag = imag;
	}
	
	void printRecord(){
		cout<<"real: "<<real<<endl;
		cout<<"imag: "<<imag<<endl;
	}
};
int main(){
	Complex c1(10,20);
	c1.printRecord();
	
	Complex arr[3]={Complex(30,40), Complex(50,60), Complex(70,80)};
	for(int i=0; i<3; i++){
		arr[i].printRecord();
	}
}
