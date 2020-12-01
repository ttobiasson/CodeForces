#include<math.h>
#include<iostream>

using namespace std;

int main(){
    int tests, n;
    
    cin >> tests;
    while(tests-->0){
        cin >> n;
        int m1[n][n];
        int m2[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                m1[i][j] = i == j ? 1 : 0;
            }
        }
        for(int i[n] : m1){
            
        }
        
    }
}