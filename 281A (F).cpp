#include <iostream>
#include <algorithm>
using namespace std;

int main() {
	// your code goes here

	string s , s2 ;
	cin >> s ;

	for ( int x = 0 ; x < s.size() ; x++ ) {

		if ( x == 0 ) {
			s[x] = toupper(s[x]);
			cout << s[x] ;
		} else {
			cout << s [x] ;
		}
	}

	cout << endl ;
	return 0;
}
