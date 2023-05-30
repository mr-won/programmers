#include <string>
#include <vector>
#include <algorithm>
#include <iostream>
#include <cctype>

using namespace std;

string solution(string myString) {
    string str = myString; 
    transform(str.begin(), str.end(), str.begin(), ::tolower);
    return str;
}