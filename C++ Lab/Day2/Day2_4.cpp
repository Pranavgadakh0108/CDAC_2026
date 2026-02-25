#include<iostream>
using namespace std;

class Employee{
	private:
		int empId;
		float salary;
		
	public:
		void setEmpId(int empId){
			this->empId=empId;
		}
		int getEmpId(){
			return this->empId;
		}
		
		void setSalary(float salary){
			this->salary=salary;
		}
		
		float getSalary(){
			return this->salary;
		}
				
};

int main(){
	Employee e1;
	e1.setEmpId(1);
	e1.setSalary(1234.34f);
	
	cout<<"Emp Id: "<<e1.getEmpId()<<endl;
	cout<<"Emp Salary: "<<e1.getSalary()<<endl;
}

