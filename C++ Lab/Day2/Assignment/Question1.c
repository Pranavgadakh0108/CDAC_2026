/*
Q1. Write a menu driven program for Date in a C. Declare a structure Date having data members 
day, month, year. Implement the following functions. 
void initDate(struct Date* ptrDate); 
void printDateOnConsole(struct Date* ptrDate); 
void acceptDateFromConsole(struct Date* ptrDate); 
*/
#include <stdio.h>

struct Date{
	int day;
	int month;
	int year;
};

void initDate(struct Date* ptrDate){

	ptrDate->day = 11;
	ptrDate->month= 12;
	ptrDate->year=2026;
}

void printDateOnConsole(struct Date* ptrDate){
	
	printf("Date = %d-%d-%d",ptrDate->day,ptrDate->month,ptrDate->year);
	
}

void acceptDateFromConsole(struct Date* ptrDate){
	printf("Enter Day: ");
	scanf("%d",&ptrDate->day);
	printf("Enter month: ");
	scanf("%d",&ptrDate->month);
	printf("Enter Year: ");
	scanf("%d",&ptrDate->year);	
}

int menuList(){
	int choice;
	printf("\n--------------------------------\n");
	printf("0. Exit\n");
	printf("1. initDate\n");
	printf("2. printDateOnConsole\n");
	printf("3. acceptDateFromConsole\n");
	printf(" Enter your choice: ");
	scanf("%d", &choice);
	
	printf("\n--------------------------------\n");
	return choice;
}

int main(){
	struct Date date;
	int choice; 
    while((choice = menuList( ))!=0)
    {
        switch (choice)
        {
        case 1: 
			initDate(&date);
            break;
        case 2: 
            printDateOnConsole(&date);
            break; 
        case 3:
        	acceptDateFromConsole(&date);
        	break;
        }
    }
	
	
	return 0;
}
