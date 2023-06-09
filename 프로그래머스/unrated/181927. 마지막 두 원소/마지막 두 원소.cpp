#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> num_list) {
    for(int i=num_list.size()-2; i<num_list.size();i++) {
        if(num_list[i] < num_list[i+1]) {
            num_list.push_back(num_list[i+1] -num_list[i]);
        } else if(num_list[i] >= num_list[i+1]) {
            num_list.push_back(num_list[i+1]*2);
        }
        return num_list;
    }
}