#include <iostream>
#include <algorithm>
using namespace std;

int main()
{
    // your code goes here

    string s ;
    cin >> s ;
    int AB = 0, ab = 0 ;

    for ( int x = 0 ; x < s.size() ; x++ )
    {

        if ( s[x] >= 'A' && s[x] <= 'Z' )
        {
            AB++ ;
        }
        else
        {
            ab++ ;
        }
    }

    if ( AB > ab )
    {
        transform ( s.begin(), s.end(), s.begin(), ::toupper ) ;
    }
    else if ( AB < ab )
    {
        transform ( s.begin(), s.end(), s.begin(), ::tolower ) ;
    }
    else
    {
        transform ( s.begin(), s.end(), s.begin(), ::tolower ) ;
    }

    cout << s ;

    return 0;
}
