class Solution {
public:
    int buyChoco(vector<int>& prices, int money) {
        int minnew=101,minold=101;
        for(int i=0;i<prices.size();i++){
            if(prices[i]<minnew){
            minold=minnew;
            minnew=prices[i];
            }
            else{
                if(prices[i]<minold)
                    minold=prices[i];
            }
        }
        return minold+minnew<=money? money-minold-minnew : money;
    }
};