#include<iostream>
using namespace std;

class Clock{
	int hr;
	int min;
	int sec;
	
	public:
		void setHr(int hr){
			this->hr=hr;
		}
		
		void setMin(int min){
			this->min = min;
		}
		
		void setSec(int sec){
			this->sec = sec;
		}
		
		int getHr(){
			return this->hr;
		}
		
		int getMin(){
			return this->min;
		}
		
		int getSec(){
			return this->sec;
		}
		
		void incrementSec(){
			this->sec++;
			if(sec==60){
				this->sec = 0;
				this->min++;
				if(min == 60){
					this->min=0;
					this->hr++;
					if(hr==24){
						this->hr=0;
					}
				}
			}
		}

};

int main(){
	Clock c1;
	c1.setHr(10);
	c1.setMin(10);
	c1.setSec(10);
	
	cout<<c1.getHr()<<"|"<<c1.getMin()<<"|"<<c1.getSec()<<endl;
}
