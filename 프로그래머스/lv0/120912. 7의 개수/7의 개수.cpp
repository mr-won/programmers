#include <string>
#include <vector>

using namespace std;

int solution(vector<int> array) {
    int answer = 0;
    int num = 0;
    for(int i = 0; i < array.size(); i++)
    {
        num = array[i];    
        while(num != 0)
        {
            if(num % 10 == 7)    answer++;
            num /= 10;
        }
    }
    return answer;
}