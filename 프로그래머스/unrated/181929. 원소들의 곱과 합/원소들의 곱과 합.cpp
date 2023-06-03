#include <string>
#include <vector>

using namespace std;

int solution(vector<int> num_list) {
    int mul = 1;
    int add = 0;
    for(int i=0; i<num_list.size(); i++) {
        mul *= num_list[i];
        add += num_list[i];
    }
    if(mul <= add*add) {
        return 1;
    }
    return 0;
}