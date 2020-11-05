#include<iostream>
#include<vector>
#include<math.h>

using namespace std;

int main(){
    int tests, n;

    cin >> tests;

    while(tests--){
        cin >> n;

        if(n < 5){
            while(n-- >1)
                cout << 9;
            cout << 8;
        }
        else if(n < 9){
            while(n-- >2)
                cout << 9;
            while(n-->-1)
                cout << 8;
        }
        else{
            int eights = n % 4 != 0 ? 1+(n/4) : n/4;
            int nines = n - eights;
            while(nines-->0)
                cout << 9;
            while(eights-->0)
                cout << 8;
        }
        cout << endl;
    }

    
}