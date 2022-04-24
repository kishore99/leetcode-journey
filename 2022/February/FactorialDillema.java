public class GFG{


public static boolean factors(int n, int k)
{
  ArrayList<Integer> v = new ArrayList<Integer>();
  while (n % 2 == 0)
  {
    v.add(2);
    n /= 2;
  }

  if (v.size() >= k){return true;}
  for(int i = 3; i * i <= n; i += 2)
  {
    while (n % i == 0)
    {
      n = n / i;
      v.add(i);
    }
    if (v.size() >= k){return true;}
  }
  if (n > 2){v.add(n);}
  if (v.size() >= k){return true;}

  return false;
}


public static String operation(int n, int k)
{
  boolean answered = false;

  if (n < k)
  {
    answered = true;
    return "No";
  }

  boolean ok = factors(n, k);

  if (!ok && !answered)
  {
    answered = true;
    return "No";
  }
  if (ok && !answered){return "Yes";}
}

public static List<String> factorsDilemma(int M, List<Integer> X, List<Integer> K){
  ArrayList<String> v = new ArrayList<String>();
  for(int i=0;i<M;i++){
      v.add(operation(x[i], k[i]));
  }
  return v;
}
public static void main(String[] args)
{
int q = 1;
int[] x = {12};
int[] k = {4};

for(int i=0;i<q;i++)
operation(x[i], k[i]);
}
}
