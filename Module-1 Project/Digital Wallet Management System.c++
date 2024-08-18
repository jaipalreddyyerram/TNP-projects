#include <bits/stdc++.h>

using namespace std;

int main() {
    int N;
    cin>>N;
    
    map<int,int>useridBalances;
    
    for(int i=0;i<N;i++){
        int userID,balance;
        cin>>userID>>balance;
        useridBalances[userID]=balance;
    }

    int T;
    cin>>T;

    for(int i=0;i<T;i++){
        int from_userID,to_userID,amount;
        cin>>from_userID>>to_userID>>amount;
        
        if (useridBalances[from_userID]>=amount){
            useridBalances[from_userID] -= amount;
            useridBalances[to_userID] += amount;
            cout<<"Success"<<endl;
        } 
        else{
            cout<<"Failure"<<endl;
        }
    }

    cout<<endl;

    vector<pair<int,int>>sortedUsers(useridBalances.begin(),useridBalances.end());
    sort(sortedUsers.begin(),sortedUsers.end(),[](const pair<int,int> &a,const pair<int,int> &b){ return a.second < b.second;});

    for(int i=0;i<sortedUsers.size();i++){
    cout<<sortedUsers[i].first<<" "<<sortedUsers[i].second<<endl;
    }
    return 0;
}
