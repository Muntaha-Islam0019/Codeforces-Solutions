#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int i ;
    cin >> i ;

    if ( (i>0 && i<11) || (i>20 && i<31) )
    {

        if ( i % 2 != 0 )
        {
            cout << "Red" << endl ;
        }
        else
        {
            cout << "Black" << endl ;
        }
    }
    else
    {

        if ( i % 2 != 0 )
        {
            cout << "Black" << endl ;
        }
        else
        {
            cout << "Red" << endl ;
        }
    }

// Seriously?

    return 0;
}
