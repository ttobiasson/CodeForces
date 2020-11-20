#include<iostream>
#include<math.h>

using namespace std;

int main(){
    long long tests, a, b, c, fst, snd;
    cin >> tests;

    while(cin >> a >> b >> c){
        
        fst = a < c ? 1 : -1;
        snd = c < a*b ? b : -1;

        cout << fst << " " << snd << endl;
    }
}