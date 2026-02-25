#include<iostream>
using namespace std;

class Employee{
	private:
		char name[20];
		int id;
		float salary;
		
	public:
		void addInfo(){
			cout<<"enter emp name: "<<endl;
			cin>>name;
			cout<<"enter emp id: "<<endl;
			cin>>id;
			cout<<"enter emp salary: "<<endl;
			cin>>salary;
		}
		
		void displayInfo(){
			cout<<"------------------------------"<<endl;
			cout<<"Employee name: "<<name<<endl;
			cout<<"Employee id: "<<id<<endl;
			cout<<"Employee salary: "<<salary<<endl;
			cout<<"------------------------------"<<endl;
		}
};

int main(){
	Employee e1;
	e1.addInfo();
	e1.displayInfo();
	
}
