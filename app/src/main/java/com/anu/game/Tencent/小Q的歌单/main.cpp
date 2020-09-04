
#include<bits/stdc++.h>
using namespace std;
const int mod=1000000007;
int a,x,b,y,k;
long long dp[1010];
int p[210];
int main() {
    scanf("%d",&k);
    scanf("%d%d%d%d",&a,&x,&b,&y);
    dp[0]=1;
    for(int i=1; i<=x; i++) p[i]=a;
    for(int i=x+1; i<=x+y; i++) p[i]=b;
 
    for(int i=1; i<=x+y; i++) {
        for(int j=k; j>=p[i]; j--)
            dp[j]=(dp[j]%mod+dp[j-p[i]]%mod)%mod;
    }
    printf("%lld\n",dp[k]%mod);
    return 0;
}
