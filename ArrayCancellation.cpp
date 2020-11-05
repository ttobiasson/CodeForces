#include<iostream>
#include<vector>

using namespace std;

int main(){
    long long tests, n, coins;
    
    cin >> tests;
    
    while(tests--){
        coins = 0;
        cin >> n;
        vector<int>v1(n);

        for(int i = 0; i < n; i++){
            cin >> v1[i];
        }

        for(int i = 0; i < v1.size(); i++){
            for(int j = i+1; j < v1.size()-1; j++){
                if(v1[j] < 0 && v1[i] > 0){
                    int n = min(abs(v1[i]), abs(v1[j]));
                    v1[i]-=n;
                    v1[j]+=n;
                }
            }
        }

        for(int i = 0; i < v1.size(); i++){
            for(int j = i+1; j < v1.size(); j++){
                if(v1[i] < 0 && v1[j] > 0){
                    int n = min(abs(v1[i]), abs(v1[j]));
                    v1[j]-=n;
                    v1[i]+=n;
                    coins+=n;
                }    
            }
        }
       
        cout << coins << endl;
    }
}
