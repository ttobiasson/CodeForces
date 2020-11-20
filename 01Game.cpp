#include<iostream>
#include<math.h>

using namespace std;

int main(){
    string s, answer;
    long long tests, zero, one;

    cin >> tests;

    while(cin >> s){
        bool TAFB = false;
        zero = 0;
        one = 0;

        for(char x : s){
            if(x == '0')
                zero++;
            else
                one++;
        }
        if ((min(zero, one)% 2 !=0) && (zero != 0) && (one != 0) )
            TAFB = true;
        if (one == 1 && zero > 0)
            TAFB = true;

        answer = TAFB ? "DA" : "NET";

        cout<< answer <<endl;
    }
}