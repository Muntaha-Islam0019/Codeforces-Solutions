#include <iostream>
#include <algorithm>

using namespace std;

int main()
{
    // your code goes here

    string s, sn, rs ;
    cin >> s ;
    cin >> sn ;

    rs = s ;
    reverse ( rs.begin(), rs.end() ) ;

    if ( rs==sn )
    {
        cout << "YES" << endl ;
    }
    else
    {
        cout << "NO" << endl ;
    }

    /* cout << sn << endl ;
    cout << s << endl ; */

    return 0;
}

