#include <string>
#include <vector>

using namespace std;

string solution(string my_string, int n) {
    string answer = "";
    for(int i : my_string) {
        for(int a = 0; a<n; a++) {
        answer.push_back(i);
        }
    }
    return answer;
}