#include<iostream>
#include<vector>

using namespace std;

int main(){
    int tests, n;
    char c;
    
    
    cin >> tests;

    while(tests--){
        int pos = 0;
        cin >> n;
        vector<char> v1(n);
        for(int i = 0; i < n; i++){
            cin >> c;
            v1[i] = c;
        }
            
        for(int i = 0; i < n; i++){
            
            if(v1[i] == ')'){
                if(pos > 0){
                    pos--;
                }
            }else{
                pos++;
            }
        }
        cout << pos << endl;
    }
}