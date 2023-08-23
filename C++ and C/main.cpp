/*
#include <iostream>
#include <math.h>
#include <string> */
#include <bits/stdc++.h>
using namespace std;
void seeding(int n) {
    for(int i=n;i>0;i--){
        for(int j=i;j>0;j--){
            cout<<"* ";
        }cout<<endl;
    }
}
void triangle(int n) {
    for (int i = 1; i < n+1; i++) {
        for (int j = 1;j<=i; j++) {
            cout << i << " ";
        }
        cout << endl;
    }
}
/*
void nStarTriangle(int n) {
    int k=n-1;
    for(int i=n;i>0;i--){
        for(int j=1;j<=k;j++) {
            cout << " ";
        }cout<<"*"<<endl;
        k--;
    }
}*/
void nStarTriangle(int n) {
    int k=n-1;
    int m=1;
    for(int i=0;i<n;i++){
        for(int j=1;j<=k;j++) {
            cout << " ";
        }
        string stars = string(m, '*');
        cout<<stars<<endl;
        k--;
        m=m+2;
    }
}

int main(){
    //std::cout<< "Another Line" <<"\n";
    //std::cout <<" endl and backslash n is same" <<std::endl;
    //return 0

//triangle(10);
//seeding(10);
    nStarTriangle(3);
}
