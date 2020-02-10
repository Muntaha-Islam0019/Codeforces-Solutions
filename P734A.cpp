#include <iostream>
using namespace std;

int main()
{
    // your code goes here

    int x, a = 0, d = 0 ;
    cin >> x ;

    string s ;
    cin >> s ;

    for ( int x = 0 ; x < s.size() ; x++ )
    {

        if ( s[x] == 'A' )
        {
            a++ ;
        }
        else if ( s[x] == 'D' )
        {
            d++ ;
        }
    }

    if ( a>d )
    {
        printf( "Anton\n" ) ;
    }
    else if ( a<d )
    {
        printf( "Danik\n" ) ;
    }
    else
    {
        printf( "Friendship\n" ) ;
    }

    return 0;
}
