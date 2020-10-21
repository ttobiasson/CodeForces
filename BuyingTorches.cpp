#include<iostream>

using namespace std;

int main(){
    
    long long t, x, y, k;

    cin >> t;
    for(int i = 0; i < t; i++){
        cin >> x >> y >> k;
        long long sticksNeeded = y * k + k;
        long long sticks = 1;
        long long trades = 0;
        long long coal = 0;

        trades = sticksNeeded / (x - 1);
        trades += k / coal;
        
        if(sticksNeeded / x - 1 % 2 != 0){
            trades++;
        }
        
        

        if(k / coal % 2 != 0){
            trades++;
        }

        cout << trades << endl;
    }

}
