#include<math.h>
#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;

int main(){
    int tests, n, piranha, index, max;
    
    cin >> tests;
    while(tests--> 0){
        
        cin >> n;
        vector<int>v1(n);
        index = 0;
        max = 0;

        for(int &x : v1) cin >> x;

        for(int x : v1) max = max < x ? x : max;

        if(v1.size() > 2){
            for(int i = 1; i < v1.size()-1; i++){
                if(v1[i] == max && (v1[i-1] < v1[i] || v1[i+1] < v1[i])){
                    index = i+1;
                    break;
                }
                else if(v1[i-1] == max && v1[i] < v1[i-1]){
                    index = i;
                    break;
                }
                else if(v1[i+1] == max && v1[i+1] > v1[i]){
                    index = i+2;
                    break;
                }
            
            }
        }
        else{
                if(v1[0] != v1[1]){
                    auto itr = find(v1.begin(),v1.end(),max);
                    index = distance(v1.begin(), itr) == 0 ? 1 : 2;
                }
        }

        
        cout << ((index == 0) ? -1 : index) << endl;
    }
    
}