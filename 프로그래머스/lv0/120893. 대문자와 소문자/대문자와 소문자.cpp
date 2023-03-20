#include <string>
using namespace std;

string solution(string my_string) {
    int len = my_string.size();
    for (int i = 0; i < len; i++) {
        if (my_string[i] >= 'a' && my_string[i] <= 'z') {
            my_string[i] = toupper(my_string[i]);
        } else {
            my_string[i] = tolower(my_string[i]);
        }
    }
    return my_string;
}