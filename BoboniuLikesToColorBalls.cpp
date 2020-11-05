#include<iostream>
#include<vector>
#include<math.h>
using namespace std;

int checkOdd(vector<int> v1){
    int odd = 0;
    for(int x : v1){
        if(x % 2 != 0)
            odd++;
    }
    return odd;
}
int checkZeros(vector <int> v1){
    int zeros = 0;
    for(int i = 0; i < 3; i++){
        if(v1[i] == 0)
            zeros++;
    }
    return zeros;
}

int main(){
    int tests = 0;

    cin >> tests;

    while(tests--){
        int odd = 0;
        int zeros = 0;
        vector<int>v1(4);

        for(int i = 0; i < 4; i++) {
            cin >> v1[i];
        }
        
        odd = checkOdd(v1);
        zeros = checkZeros(v1);
        
        if(odd <= 1 && zeros != 2){
            cout << "Yes" << endl;
        }
        else{
            if(zeros == 0){
                v1[3]+=3;
                for(int i = 0; i < 3;i++){ 
                    v1[i]--; 
                }
            }
            odd = checkOdd(v1);
            if(odd <= 1)
                cout << "Yes" << endl;
            else
                cout << "No" << endl;
        }
        
    }
}