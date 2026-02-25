/*
Q3. Write a menu driven program for Date in a CPP language using structure. 
Date is having data members day, month, year. Implement the following functions. 
void initDate(); 
void printDateOnConsole(); 
void acceptDateFromConsole(); 
bool isLeapYear();
*/
#include<iostream>
using namespace std;

struct Date{
	int day;
	int month;
	int year;
	
	void initDate(){
		day = 1;
		month = 1;
		year = 2001;
	}
	
	void printDateOnConsole(){
		cout<<"Date: "<<day<<"/"<<month<<"/"<<year<<endl;
	}
	
	void acceptDateFromConsole(){
		cout<<"Enter day: "<<endl;
		cin>>day;
		cout<<"Enter month: "<<endl;
		cin>>month;
		cout<<"Enter year: "<<endl;
		cin>>year;
	}
	
	bool isLeapYear(){
		if(year%4==0){
			if(year%100==0){
				if(year%400==0){
					return true;
				}
			}
			return true;
		}
		return false;
	}
	
	int menuList(){
		int choice;
		cout<<"-----------------------"<<endl;
		cout<<"0. Exit"<<endl;
		cout<<"1. initDate"<<endl;
		cout<<"2. printDateOnConsole"<<endl;
		cout<<"3. acceptDateFromConsole"<<endl;
		cout<<"4. isLeapYear"<<endl;
		cout<<"-----------------------"<<endl;
		cout<<"Enter your choice: "<<endl;
		cin>>choice;
		cout<<"-----------------------"<<endl;
		return choice;
	}
	
};

int main(){
	Date date;
	int choice;
	while((choice = date.menuList())!=0){
		switch(choice){
			case 1: 
				date.initDate();
				break;
			case 2:
				date.printDateOnConsole();
				break;
			case 3:
				date.acceptDateFromConsole();
				break;
			case 4:
				date.isLeapYear()? cout<<"Year is Leap Year"<<endl : cout<<"Year is Not Leap Year"<<endl;
				break;
		}
	}
	return 0;
}

