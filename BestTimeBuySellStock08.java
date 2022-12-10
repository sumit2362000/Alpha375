package Alpha375;
//leetcode

public class BestTimeBuySellStock08 {
     int profit=INT_MAX;
     int ans=0;
     for(int i=0;i<prices.size();i++)
     {
      if(prices[i]<profit)
      {
    	  profit=prices[i];
      }else if(prices[i]-profit>ans)
      {
    	  ans=prices[i]-profit;
      }
     }
     return ans;
  }
}
