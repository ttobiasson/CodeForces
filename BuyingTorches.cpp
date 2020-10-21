#include<iostream>
#include<math.h>

using namespace std;

int main(){
    
    long long t, x, y, k;

    cin >> t;
    for(int i = 0; i < t; i++){
        cin >> x >> y >> k;
        long long sticksNeeded = ((k * y + k - 1+(x-2))/ (x-1)) + k;
        long long answer = (k * y + k - 1) % (x - 1) != 0 ? ((k * y + k - 1+(x-2))/ (x-1)) + k : ((k * y + k - 1)/ (x-1)) + k ;
        cout << sticksNeeded << endl;
    }

}
