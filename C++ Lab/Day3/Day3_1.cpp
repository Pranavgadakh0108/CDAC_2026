#include<iostream>
using namespace std;

class Complex{
	private:
		int real;
		int imag;
	
	public:
		Complex(){
			cout<<"Parameterless Constructor"<<endl;
			this->real = 0;
			this->imag = 0;
		}
		
		
		Complex(int real, int imag){
			cout<<"Parameterized Constructor"<<endl;
			this->real = real;
			this->imag = imag;
		}
		
		void printRecords(){
			cout<<"Real: "<<real<<endl;
			cout<<"Imag: "<<imag<<endl;
		}
};


int main(){
	Complex c1;
	c1.printRecords();
	Complex c2(10,20);
	c2.printRecords();
	return 0;
}
