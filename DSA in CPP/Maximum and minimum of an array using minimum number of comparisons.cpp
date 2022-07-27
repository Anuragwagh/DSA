/***********************************************

Maximum and minimum of an array using minimum 
number of comparisons

************************************************/

#include <iostream>

using namespace std;

int min(int a[], int n){
    
    int m = a[0];
    
    for(int i = 0; i<n;i++){
        
        if(m>a[i]){
            m = a[i];
        }
    }
    
    return m;
}

int max(int a[], int n){
    
    int m = a[0];
    
    for(int i = 0; i<n;i++){
        
        if(m<a[i]){
            m = a[i];
        }
    }
    
    return m;
}

int main()
{
    int size,number_comparison;
    
    cout<<"How many elements you want to add in array? ";
    cin>>size;
    
    int a[size];
    
    for(int i = 0;i<size;i++){
        cin>>a[i];
    }
    
    cout<<"Enter how many number of comparison you want? ";
    cin>>number_comparison;
    
    cout<<"Min Element : "<<min(a,number_comparison)<<endl;
    cout<<"Max Element : "<<max(a,number_comparison)<<endl;

    return 0;
}

/*
OUTPUT

How many elements you want to add in array? 5
2
3
12
6
23
Enter how many number of comparison you want? 3
Min Element : 2
Max Element : 12

*/
