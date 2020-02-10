#include <iostream>
#include <string>
using namespace std;

int main()
{
    // your code goes here

    string s, zero = "0000000", one = "1111111" ;
    cin >> s ;

    bool flag = false ;

    if ( s.find(zero) != string::npos || s.find(one) != string::npos )
    {
        flag = true ;
    }
    else
    {
        flag = false ;
    }

    if ( flag == true )
    {
        printf ("YES\n") ;
    }
    else
    {
        printf ("NO\n") ;
    }

    return 0 ;
}

