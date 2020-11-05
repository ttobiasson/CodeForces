#include<iostream>
#include<vector>

using namespace std;

int main(){
    long long tests, n, coins, positive, x;
    
    cin >> tests;
    
    while(tests--){
        cin >> n;
        vector<int>v1(n);
        positive = 0;

        for(int i = 0; i < n; i++){
            cin >> v1[i];
        }

        for(int i = 0; i < n; i++){

            if(v1[i] < 0){
                x = positive + v1[i];

                if(x < 0){
                    v1[i] = x;
                    positive = 0;
                }else{
                    v1[i] = 0;
                    positive = x;
                }
            }else{
                positive += v1[i];
            }
        }
        cout << positive << endl;
    }
}
